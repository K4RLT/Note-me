package w7;
import d.c;
import r0.a1;
import r0.e1;
import w7.n2;

import android.view.View;

/* loaded from: classes.dex */
public final class n2 extends ve.i implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ float C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ a1 F;
    public final /* synthetic */ a1 G;
    public final /* synthetic */ a1 H;
    public final /* synthetic */ e1 I;
    public final /* synthetic */ a1 J;

    /* renamed from: u, reason: collision with root package name */
    public float f28752u;

    /* renamed from: v, reason: collision with root package name */
    public int f28753v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b1.v f28754w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f28755x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q.d f28756y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.l f28757z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(b1.v vVar, View view, q.d dVar, df.l lVar, int i, int i10, float f10, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, e1 e1Var, a1 a1Var6, te.c cVar) {
        super(2, cVar);
        this.f28754w = vVar;
        this.f28755x = view;
        this.f28756y = dVar;
        this.f28757z = lVar;
        this.A = i;
        this.B = i10;
        this.C = f10;
        this.D = a1Var;
        this.E = a1Var2;
        this.F = a1Var3;
        this.G = a1Var4;
        this.H = a1Var5;
        this.I = e1Var;
        this.J = a1Var6;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new n2(this.f28754w, this.f28755x, this.f28756y, this.f28757z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e6, code lost:
    
        if (q.c(r6, r2, r5, r17) != r14) goto L36;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
