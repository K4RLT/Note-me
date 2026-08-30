package g5;
import o0.c;

import u7.m3;

/* loaded from: classes.dex */
public final class n0 extends ve.i implements df.p {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17489u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f17490v;

    /* renamed from: w, reason: collision with root package name */
    public int f17491w;

    /* renamed from: x, reason: collision with root package name */
    public int f17492x;

    /* renamed from: y, reason: collision with root package name */
    public int f17493y;

    /* renamed from: z, reason: collision with root package name */
    public Object f17494z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m3 m3Var, int i, int i10, b1.y yVar, te.c cVar) {
        super(2, cVar);
        this.D = m3Var;
        this.f17492x = i;
        this.f17493y = i10;
        this.E = yVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f17489u) {
            case 0:
                return new n0((i[]) this.A, (o0) this.C, (f0) this.E, cVar);
            default:
                n0 n0Var = new n0((m3) this.D, this.f17492x, this.f17493y, (b1.y) this.E, cVar);
                n0Var.C = obj;
                return n0Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17489u) {
            case 0:
                return ((n0) create((i5.l) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
    
        if (g5.c(r9, r4, r14, r13) == r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:7:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0113 -> B:36:0x0114). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(i[] iVarArr, o0 o0Var, f0 f0Var, te.c cVar) {
        super(2, cVar);
        this.A = iVarArr;
        this.C = o0Var;
        this.E = f0Var;
    }
}
