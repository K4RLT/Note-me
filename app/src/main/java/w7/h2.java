package w7;
import r0.a1;
import r0.e1;
import v1.b;
import w7.h2;

import android.view.View;

/* loaded from: classes.dex */
public final class h2 extends ve.h implements df.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ e1 C;
    public final /* synthetic */ View D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ e1 F;
    public final /* synthetic */ a1 G;
    public final /* synthetic */ b1.y H;
    public final /* synthetic */ u7.m3 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ kotlin.jvm.internal.y L;
    public final /* synthetic */ a1 M;
    public final /* synthetic */ a1 N;
    public final /* synthetic */ a1 O;

    /* renamed from: u, reason: collision with root package name */
    public int f28336u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f28337v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f28338w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f28339x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f28340y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ pf.z f28341z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(float f10, float f11, float f12, pf.z zVar, a1 a1Var, a1 a1Var2, e1 e1Var, View view, a1 a1Var3, e1 e1Var2, a1 a1Var4, b1.y yVar, u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar2, a1 a1Var5, a1 a1Var6, a1 a1Var7, te.c cVar) {
        super(2, cVar);
        this.f28338w = f10;
        this.f28339x = f11;
        this.f28340y = f12;
        this.f28341z = zVar;
        this.A = a1Var;
        this.B = a1Var2;
        this.C = e1Var;
        this.D = view;
        this.E = a1Var3;
        this.F = e1Var2;
        this.G = a1Var4;
        this.H = yVar;
        this.I = m3Var;
        this.J = i;
        this.K = i10;
        this.L = yVar2;
        this.M = a1Var5;
        this.N = a1Var6;
        this.O = a1Var7;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        h2 h2Var = new h2(this.f28338w, this.f28339x, this.f28340y, this.f28341z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, cVar);
        h2Var.f28337v = obj;
        return h2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (t.f0.k(r1, r3, r11, r39) == r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        if (r2 == r10) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
