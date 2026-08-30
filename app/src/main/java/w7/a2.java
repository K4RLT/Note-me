package w7;
import p7.e0;
import r0.a1;
import r0.e1;
import v1.b;
import v1.t;
import w7.a2;

import android.view.View;

/* loaded from: classes.dex */
public final class a2 extends ve.h implements df.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ u7.m3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ kotlin.jvm.internal.y H;
    public final /* synthetic */ View I;
    public final /* synthetic */ e0 J;
    public final /* synthetic */ b1.v K;
    public final /* synthetic */ b1.v L;
    public final /* synthetic */ e3 M;
    public final /* synthetic */ a1 N;
    public final /* synthetic */ a1 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ df.l Q;
    public final /* synthetic */ e3 R;
    public final /* synthetic */ e3 S;
    public final /* synthetic */ e3 T;
    public final /* synthetic */ e3 U;
    public final /* synthetic */ a1 V;
    public final /* synthetic */ e3 W;
    public final /* synthetic */ e3 X;
    public final /* synthetic */ e3 Y;
    public final /* synthetic */ e3 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ e3 f27837a0;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ e3 f27838b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ e3 f27839c0;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ a1 f27840d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ a1 f27841e0;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ a1 f27842f0;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ float f27843g0;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ df.v f27844h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ df.l f27845i0;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ a1 f27846j0;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ a1 f27847k0;
    public final /* synthetic */ a1 l0;
    public final /* synthetic */ a1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ e1 f27848n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ a1 f27849o0;

    /* renamed from: u, reason: collision with root package name */
    public t f27850u;

    /* renamed from: v, reason: collision with root package name */
    public u7.b f27851v;

    /* renamed from: w, reason: collision with root package name */
    public u7.d f27852w;

    /* renamed from: x, reason: collision with root package name */
    public u7.c f27853x;

    /* renamed from: y, reason: collision with root package name */
    public float f27854y;

    /* renamed from: z, reason: collision with root package name */
    public int f27855z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(float f10, float f11, float f12, u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, View view, e0 e0Var, b1.v vVar, b1.v vVar2, e3 e3Var, a1 a1Var, a1 a1Var2, int i11, df.l lVar, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, a1 a1Var3, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, e3 e3Var12, a1 a1Var4, a1 a1Var5, a1 a1Var6, float f13, df.v vVar3, df.l lVar2, a1 a1Var7, a1 a1Var8, a1 a1Var9, a1 a1Var10, e1 e1Var, a1 a1Var11, te.c cVar) {
        super(2, cVar);
        this.B = f10;
        this.C = f11;
        this.D = f12;
        this.E = m3Var;
        this.F = i;
        this.G = i10;
        this.H = yVar;
        this.I = view;
        this.J = e0Var;
        this.K = vVar;
        this.L = vVar2;
        this.M = e3Var;
        this.N = a1Var;
        this.O = a1Var2;
        this.P = i11;
        this.Q = lVar;
        this.R = e3Var2;
        this.S = e3Var3;
        this.T = e3Var4;
        this.U = e3Var5;
        this.V = a1Var3;
        this.W = e3Var6;
        this.X = e3Var7;
        this.Y = e3Var8;
        this.Z = e3Var9;
        this.f27837a0 = e3Var10;
        this.f27838b0 = e3Var11;
        this.f27839c0 = e3Var12;
        this.f27840d0 = a1Var4;
        this.f27841e0 = a1Var5;
        this.f27842f0 = a1Var6;
        this.f27843g0 = f13;
        this.f27844h0 = vVar3;
        this.f27845i0 = lVar2;
        this.f27846j0 = a1Var7;
        this.f27847k0 = a1Var8;
        this.l0 = a1Var9;
        this.m0 = a1Var10;
        this.f27848n0 = e1Var;
        this.f27849o0 = a1Var11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        a2 a2Var = new a2(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f27837a0, this.f27838b0, this.f27839c0, this.f27840d0, this.f27841e0, this.f27842f0, this.f27843g0, this.f27844h0, this.f27845i0, this.f27846j0, this.f27847k0, this.l0, this.m0, this.f27848n0, this.f27849o0, cVar);
        a2Var.A = obj;
        return a2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0076, code lost:
    
        if (r0 == r12) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b1  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
