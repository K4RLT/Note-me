package n;
import n.g;
import t0.g;

/* loaded from: classes.dex */
public final class g extends ve.h implements df.p {
    public long A;
    public int B;
    public /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20875u;

    /* renamed from: v, reason: collision with root package name */
    public long[] f20876v;

    /* renamed from: w, reason: collision with root package name */
    public int f20877w;

    /* renamed from: x, reason: collision with root package name */
    public int f20878x;

    /* renamed from: y, reason: collision with root package name */
    public int f20879y;

    /* renamed from: z, reason: collision with root package name */
    public int f20880z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f20875u = i;
        this.E = obj;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f20875u) {
            case 0:
                g gVar = new g((h) this.E, cVar, 0);
                gVar.C = obj;
                return gVar;
            case 1:
                g gVar2 = new g((h) this.E, cVar, 1);
                gVar2.C = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((t0) this.E, cVar, 2);
                gVar3.C = obj;
                return gVar3;
            default:
                g gVar4 = new g((t0.g) this.E, cVar, 3);
                gVar4.C = obj;
                return gVar4;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        lf.e eVar = (lf.e) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f20875u) {
            case 0:
                return ((g) create(eVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((g) create(eVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((g) create(eVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g) create(eVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0073 -> B:7:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:16:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:8:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0111 -> B:30:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f5 -> B:38:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f7 -> B:31:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01ad -> B:52:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0191 -> B:60:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0193 -> B:53:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0248 -> B:74:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x022b -> B:82:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x022d -> B:75:0x023f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
