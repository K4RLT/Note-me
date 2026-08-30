package w7;
import r0.g1;
import v1.b;
import v1.g0;
import v1.t;
import w7.k2;

import android.content.Context;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k2 extends ve.h implements df.p {
    public final /* synthetic */ u7.m3 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ kotlin.jvm.internal.y D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ b1.v G;
    public final /* synthetic */ b1.v H;
    public final /* synthetic */ b1.v I;
    public final /* synthetic */ b1.v J;
    public final /* synthetic */ e3 K;
    public final /* synthetic */ e3 L;
    public final /* synthetic */ e3 M;
    public final /* synthetic */ e3 N;
    public final /* synthetic */ e3 O;
    public final /* synthetic */ e3 P;
    public final /* synthetic */ e3 Q;
    public final /* synthetic */ e3 R;
    public final /* synthetic */ e3 S;
    public final /* synthetic */ e3 T;
    public final /* synthetic */ e3 U;
    public final /* synthetic */ e3 V;
    public final /* synthetic */ e3 W;
    public final /* synthetic */ e3 X;
    public final /* synthetic */ e3 Y;
    public final /* synthetic */ g1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ e3 f28554a0;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ e3 f28555b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ e3 f28556c0;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ e3 f28557d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ e3 f28558e0;

    /* renamed from: u, reason: collision with root package name */
    public t f28559u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.u f28560v;

    /* renamed from: w, reason: collision with root package name */
    public int f28561w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f28562x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f28563y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f28564z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(boolean z3, boolean z9, u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, float f10, float f11, b1.v vVar, b1.v vVar2, b1.v vVar3, b1.v vVar4, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, e3 e3Var12, e3 e3Var13, e3 e3Var14, e3 e3Var15, g1 g1Var, e3 e3Var16, e3 e3Var17, e3 e3Var18, e3 e3Var19, e3 e3Var20, te.c cVar) {
        super(2, cVar);
        this.f28563y = z3;
        this.f28564z = z9;
        this.A = m3Var;
        this.B = i;
        this.C = i10;
        this.D = yVar;
        this.E = f10;
        this.F = f11;
        this.G = vVar;
        this.H = vVar2;
        this.I = vVar3;
        this.J = vVar4;
        this.K = e3Var;
        this.L = e3Var2;
        this.M = e3Var3;
        this.N = e3Var4;
        this.O = e3Var5;
        this.P = e3Var6;
        this.Q = e3Var7;
        this.R = e3Var8;
        this.S = e3Var9;
        this.T = e3Var10;
        this.U = e3Var11;
        this.V = e3Var12;
        this.W = e3Var13;
        this.X = e3Var14;
        this.Y = e3Var15;
        this.Z = g1Var;
        this.f28554a0 = e3Var16;
        this.f28555b0 = e3Var17;
        this.f28556c0 = e3Var18;
        this.f28557d0 = e3Var19;
        this.f28558e0 = e3Var20;
    }

    public static final void j(b bVar, kotlin.jvm.internal.y yVar, u7.m3 m3Var, int i, int i10, float f10, float f11, e3 e3Var, long j10) {
        float f12;
        float l0 = ((g0) bVar).l0(e3Var.f28145w.h()) / 2.0f;
        if (l0 < 1.0f) {
            f12 = 1.0f;
        } else {
            f12 = l0;
        }
        Iterator it = n4.y1((Context) yVar.f19787u, qe.l.P(m3Var.k1(i, i10)), j10, f12, f10, f11).iterator();
        while (it.hasNext()) {
            m3Var.Q0((String) it.next(), i, i10);
        }
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        k2 k2Var = new k2(this.f28563y, this.f28564z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f28554a0, this.f28555b0, this.f28556c0, this.f28557d0, this.f28558e0, cVar);
        k2Var.f28562x = obj;
        return k2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x01c9, code lost:
    
        if (r0.O.k() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0390, code lost:
    
        if (r13.getWidth() == r12) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0bc7  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
