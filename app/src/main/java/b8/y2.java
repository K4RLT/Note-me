package b8;
import b0.j;
import b8.y2;
import d.c;
import r0.a1;
import r2.g;

/* loaded from: classes.dex */
public final class y2 extends ve.i implements df.p {
    public final /* synthetic */ q.d A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3023u;

    /* renamed from: v, reason: collision with root package name */
    public int f3024v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3025w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f3026x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q.d f3027y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f3028z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(boolean z3, q.d dVar, a1 a1Var, q.d dVar2, te.c cVar, int i) {
        super(2, cVar);
        this.f3023u = i;
        this.f3026x = z3;
        this.f3027y = dVar;
        this.f3028z = a1Var;
        this.A = dVar2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f3023u) {
            case 0:
                y2 y2Var = new y2(this.f3026x, this.f3027y, this.f3028z, this.A, cVar, 0);
                y2Var.f3025w = obj;
                return y2Var;
            case 1:
                y2 y2Var2 = new y2(this.f3026x, this.f3027y, this.f3028z, this.A, cVar, 1);
                y2Var2.f3025w = obj;
                return y2Var2;
            case 2:
                y2 y2Var3 = new y2(this.f3026x, this.f3027y, this.f3028z, this.A, cVar, 2);
                y2Var3.f3025w = obj;
                return y2Var3;
            default:
                y2 y2Var4 = new y2(this.f3026x, this.f3027y, this.f3028z, this.A, cVar, 3);
                y2Var4.f3025w = obj;
                return y2Var4;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f3023u) {
            case 0:
                return ((y2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((y2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((y2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((y2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (pf.j(50, r16) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (q.c(r2, r1, r3, r16) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010b, code lost:
    
        if (q.c(r2, r1, r3, r16) == r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        if (g(r1, r16) == r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0174, code lost:
    
        if (q.c(r2, r1, r3, r16) == r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        if (g(r1, r16) == r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dd, code lost:
    
        if (q.c(r2, r1, r3, r16) == r10) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
    
        if (g(r1, r16) == r10) goto L79;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.y2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
