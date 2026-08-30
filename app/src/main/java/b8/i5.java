package b8;
import b8.i5;
import r0.a1;
import r0.e1;
import t.k2;
import v1.b;
import v1.l;

/* loaded from: classes.dex */
public final class i5 extends ve.h implements df.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ df.l B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ pf.z D;

    /* renamed from: u, reason: collision with root package name */
    public int f2204u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2205v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f2206w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f2207x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f2208y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f2209z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(e1 e1Var, a1 a1Var, a1 a1Var2, a1 a1Var3, boolean z3, df.l lVar, a1 a1Var4, pf.z zVar, te.c cVar) {
        super(2, cVar);
        this.f2206w = e1Var;
        this.f2207x = a1Var;
        this.f2208y = a1Var2;
        this.f2209z = a1Var3;
        this.A = z3;
        this.B = lVar;
        this.C = a1Var4;
        this.D = zVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        i5 i5Var = new i5(this.f2206w, this.f2207x, this.f2208y, this.f2209z, this.A, this.B, this.C, this.D, cVar);
        i5Var.f2205v = obj;
        return i5Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i5) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x003c, code lost:
    
        if (r2 == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006f, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0072, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0031, code lost:
    
        if (k2.b(r1, false, l.f27331u, r31) == r7) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x003c -> B:6:0x003f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.i5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
