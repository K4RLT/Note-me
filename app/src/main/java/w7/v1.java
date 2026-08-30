package w7;
import k1.l0;
import p7.e0;
import r0.a1;
import r0.e1;
import v1.b;
import v1.g0;
import v1.t;
import w7.v1;

import android.content.Context;
import com.google.android.gms.internal.ads.n00;

/* loaded from: classes.dex */
public final class v1 extends ve.h implements df.p {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ e0 H;
    public final /* synthetic */ b1.v I;
    public final /* synthetic */ u7.m3 J;
    public final /* synthetic */ b1.v K;
    public final /* synthetic */ b1.v L;
    public final /* synthetic */ b1.v M;
    public final /* synthetic */ float N;
    public final /* synthetic */ int O;
    public final /* synthetic */ b8.n4 P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ pf.z R;
    public final /* synthetic */ float S;
    public final /* synthetic */ df.p T;
    public final /* synthetic */ a1 U;
    public final /* synthetic */ e3 V;
    public final /* synthetic */ a1 W;
    public final /* synthetic */ a1 X;
    public final /* synthetic */ a1 Y;
    public final /* synthetic */ a1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ e1 f29249a0;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ e3 f29250b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ e3 f29251c0;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ e3 f29252d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ e3 f29253e0;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ e3 f29254f0;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ e3 f29255g0;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ float f29256h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ float f29257i0;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ int f29258j0;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ int f29259k0;
    public final /* synthetic */ kotlin.jvm.internal.y l0;
    public final /* synthetic */ e3 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ a1 f29260n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ e1 f29261o0;

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ a1 f29262p0;

    /* renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ q.d f29263q0;

    /* renamed from: u, reason: collision with root package name */
    public t f29264u;

    /* renamed from: v, reason: collision with root package name */
    public n00 f29265v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.v f29266w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29267x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29268y;

    /* renamed from: z, reason: collision with root package name */
    public int f29269z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(float f10, float f11, float f12, e0 e0Var, b1.v vVar, u7.m3 m3Var, b1.v vVar2, b1.v vVar3, b1.v vVar4, float f13, int i, b8.n4 n4Var, int i10, pf.z zVar, float f14, df.p pVar, a1 a1Var, e3 e3Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, e1 e1Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, float f15, float f16, int i11, int i12, kotlin.jvm.internal.y yVar, e3 e3Var8, a1 a1Var6, e1 e1Var2, a1 a1Var7, q.d dVar, te.c cVar) {
        super(2, cVar);
        this.E = f10;
        this.F = f11;
        this.G = f12;
        this.H = e0Var;
        this.I = vVar;
        this.J = m3Var;
        this.K = vVar2;
        this.L = vVar3;
        this.M = vVar4;
        this.N = f13;
        this.O = i;
        this.P = n4Var;
        this.Q = i10;
        this.R = zVar;
        this.S = f14;
        this.T = pVar;
        this.U = a1Var;
        this.V = e3Var;
        this.W = a1Var2;
        this.X = a1Var3;
        this.Y = a1Var4;
        this.Z = a1Var5;
        this.f29249a0 = e1Var;
        this.f29250b0 = e3Var2;
        this.f29251c0 = e3Var3;
        this.f29252d0 = e3Var4;
        this.f29253e0 = e3Var5;
        this.f29254f0 = e3Var6;
        this.f29255g0 = e3Var7;
        this.f29256h0 = f15;
        this.f29257i0 = f16;
        this.f29258j0 = i11;
        this.f29259k0 = i12;
        this.l0 = yVar;
        this.m0 = e3Var8;
        this.f29260n0 = a1Var6;
        this.f29261o0 = e1Var2;
        this.f29262p0 = a1Var7;
        this.f29263q0 = dVar;
    }

    public static final void j(boolean z3, t tVar, b bVar, float f10, float f11, float f12, u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, e3 e3Var) {
        float f13;
        long j10 = tVar.f27343c;
        if (!z3) {
            return;
        }
        g0 g0Var = (g0) bVar;
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - (((int) (g0Var.f27313z.S >> 32)) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - (((int) (g0Var.f27313z.S & 4294967295L)) / 2.0f);
        float f14 = f11 / 2.0f;
        if (f10 == 0.0f) {
            f13 = f14 + intBitsToFloat;
        } else {
            f13 = f14 + intBitsToFloat2;
        }
        float f15 = f13 / f11;
        if (f10 != 0.0f) {
            intBitsToFloat2 = -intBitsToFloat;
        }
        float f16 = ((f12 / 2.0f) + intBitsToFloat2) / f12;
        m3Var.R0(i, i10, (Context) yVar.f19787u);
        m3Var.W(i, i10, wa.b9.d(f15, 0.0f, 1.0f), wa.b9.d(f16, 0.0f, 1.0f), l0.F(e3Var.l()), (Context) yVar.f19787u);
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        v1 v1Var = new v1(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f29249a0, this.f29250b0, this.f29251c0, this.f29252d0, this.f29253e0, this.f29254f0, this.f29255g0, this.f29256h0, this.f29257i0, this.f29258j0, this.f29259k0, this.l0, this.m0, this.f29260n0, this.f29261o0, this.f29262p0, this.f29263q0, cVar);
        v1Var.D = obj;
        return v1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x04d0, code lost:
    
        if (r2 != r4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04d2, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x054c, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x054f, code lost:
    
        throw r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0204, code lost:
    
        if (r8 == r4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x02f9, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x028c, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x028f, code lost:
    
        throw r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0079, code lost:
    
        if (r5 == r4) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0591 A[LOOP:2: B:132:0x056a->B:143:0x0591, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x058f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02f9 A[EDGE_INSN: B:262:0x02f9->B:263:0x02f9 BREAK  A[LOOP:5: B:249:0x02d6->B:264:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[LOOP:5: B:249:0x02d6->B:264:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0727 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0702  */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26, types: [kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r13v14, types: [te.g] */
    /* JADX WARN: Type inference failed for: r13v38, types: [te.c, te.g] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r3v79, types: [java.lang.Number, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r4v49, types: [a1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x04d0 -> B:7:0x04d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x0204 -> B:165:0x005e). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 2105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
