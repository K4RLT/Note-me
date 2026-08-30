package k0;
import k0.h0;
import r.f;

/* loaded from: classes.dex */
public final class h0 extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19296u;

    /* renamed from: v, reason: collision with root package name */
    public int f19297v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f19298w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f19296u = i;
        this.f19299x = obj;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f19296u) {
            case 0:
                h0 h0Var = new h0((df.l) this.f19299x, cVar, 0);
                h0Var.f19298w = obj;
                return h0Var;
            case 1:
                h0 h0Var2 = new h0((df.l) this.f19299x, cVar, 1);
                h0Var2.f19298w = obj;
                return h0Var2;
            default:
                h0 h0Var3 = new h0((f) this.f19299x, cVar, 2);
                h0Var3.f19298w = obj;
                return h0Var3;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        v1.b bVar = (v1.b) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f19296u) {
            case 0:
                ((h0) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 1:
                return ((h0) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((h0) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0053 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0146 -> B:57:0x014a). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
