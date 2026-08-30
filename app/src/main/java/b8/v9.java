package b8;
import a1.f;
import b8.e1;
import b8.v9;
import r0.a1;
import r0.f1;
import u7.m3;

import android.content.Context;

/* loaded from: classes.dex */
public final class v9 extends ve.i implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2899u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f2900v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2901w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2902x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2903y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2904z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(boolean z3, u6 u6Var, Context context, m3 m3Var, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f2901w = z3;
        this.f2902x = u6Var;
        this.f2903y = context;
        this.f2904z = m3Var;
        this.A = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2899u) {
            case 0:
                return new v9(this.f2901w, (u6) this.f2902x, (Context) this.f2903y, (m3) this.f2904z, (a1) this.A, cVar);
            case 1:
                v9 v9Var = new v9(this.f2901w, (g5.v) this.f2904z, cVar, (f) this.A);
                v9Var.f2903y = obj;
                return v9Var;
            default:
                return new v9(this.f2901w, (m3) this.f2904z, (Context) this.f2903y, (q.d) this.f2902x, (f1) this.A, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2899u) {
            case 0:
                return ((v9) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((v9) create((g5.f0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((v9) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r15 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r15 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a6, code lost:
    
        if (r15 == r6) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        if (e1.F(r0, r11, r14) == r6) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018f, code lost:
    
        if (e1.C(r0, r8, r11, r14) == r6) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.v9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(boolean z3, g5.v vVar, te.c cVar, f fVar) {
        super(2, cVar);
        this.f2901w = z3;
        this.f2904z = vVar;
        this.A = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(boolean z3, m3 m3Var, Context context, q.d dVar, f1 f1Var, te.c cVar) {
        super(2, cVar);
        this.f2901w = z3;
        this.f2904z = m3Var;
        this.f2903y = context;
        this.f2902x = dVar;
        this.A = f1Var;
    }
}
