package w7;
import r0.a1;
import r0.e1;
import v1.b;
import v1.t;
import w7.i2;
import w7.n4;

import android.view.View;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class i2 extends ve.h implements df.p {
    public Object A;
    public final /* synthetic */ float A0;
    public u7.b B;
    public final /* synthetic */ a1 B0;
    public u7.d C;
    public final /* synthetic */ a1 C0;
    public u7.c D;
    public String E;
    public String F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public double S;
    public double T;
    public double U;
    public long V;
    public int W;
    public /* synthetic */ Object X;
    public final /* synthetic */ b1.v Y;
    public final /* synthetic */ float Z;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ float f28390a0;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ float f28391b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ float f28392c0;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ float f28393d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ View f28394e0;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28395f0;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ int f28396g0;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ int f28397h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ df.l f28398i0;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28399j0;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ df.l f28400k0;
    public final /* synthetic */ float l0;
    public final /* synthetic */ e1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ df.v f28401n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ a1 f28402o0;

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ a1 f28403p0;

    /* renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ a1 f28404q0;

    /* renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ b1.v f28405r0;

    /* renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ a1 f28406s0;

    /* renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ a1 f28407t0;

    /* renamed from: u, reason: collision with root package name */
    public t f28408u;

    /* renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ a1 f28409u0;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f28410v;

    /* renamed from: v0, reason: collision with root package name */
    public final /* synthetic */ a1 f28411v0;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.v f28412w;

    /* renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ a1 f28413w0;

    /* renamed from: x, reason: collision with root package name */
    public Object f28414x;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ a1 f28415x0;

    /* renamed from: y, reason: collision with root package name */
    public Object f28416y;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ a1 f28417y0;

    /* renamed from: z, reason: collision with root package name */
    public Object f28418z;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ float f28419z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(b1.v vVar, float f10, float f11, float f12, float f13, float f14, View view, u7.m3 m3Var, int i, int i10, df.l lVar, kotlin.jvm.internal.y yVar, df.l lVar2, float f15, e1 e1Var, df.v vVar2, a1 a1Var, a1 a1Var2, a1 a1Var3, b1.v vVar3, a1 a1Var4, a1 a1Var5, a1 a1Var6, a1 a1Var7, a1 a1Var8, a1 a1Var9, a1 a1Var10, float f16, float f17, a1 a1Var11, a1 a1Var12, te.c cVar) {
        super(2, cVar);
        this.Y = vVar;
        this.Z = f10;
        this.f28390a0 = f11;
        this.f28391b0 = f12;
        this.f28392c0 = f13;
        this.f28393d0 = f14;
        this.f28394e0 = view;
        this.f28395f0 = m3Var;
        this.f28396g0 = i;
        this.f28397h0 = i10;
        this.f28398i0 = lVar;
        this.f28399j0 = yVar;
        this.f28400k0 = lVar2;
        this.l0 = f15;
        this.m0 = e1Var;
        this.f28401n0 = vVar2;
        this.f28402o0 = a1Var;
        this.f28403p0 = a1Var2;
        this.f28404q0 = a1Var3;
        this.f28405r0 = vVar3;
        this.f28406s0 = a1Var4;
        this.f28407t0 = a1Var5;
        this.f28409u0 = a1Var6;
        this.f28411v0 = a1Var7;
        this.f28413w0 = a1Var8;
        this.f28415x0 = a1Var9;
        this.f28417y0 = a1Var10;
        this.f28419z0 = f16;
        this.A0 = f17;
        this.B0 = a1Var11;
        this.C0 = a1Var12;
    }

    public static final boolean j(long j10, float f10, float f11, float f12) {
        if (Math.hypot(Float.intBitsToFloat((int) (j10 >> 32)) - f11, Float.intBitsToFloat((int) (j10 & 4294967295L)) - f12) <= f10) {
            return true;
        }
        return false;
    }

    public static final boolean k(t tVar, float f10, float f11, float f12) {
        if (Math.hypot(Float.intBitsToFloat((int) (tVar.f27343c >> 32)) - f11, Float.intBitsToFloat((int) (tVar.f27343c & 4294967295L)) - f12) <= f10) {
            return true;
        }
        return false;
    }

    public static final long l(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.v vVar2, double d2, double d10, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - vVar.f19784u;
        float intBitsToFloat2 = (float) (((Float.intBitsToFloat((int) (j10 & 4294967295L)) - vVar2.f19784u) * d10) + (intBitsToFloat * d2));
        return (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits((float) ((r6 * d2) + ((-intBitsToFloat) * d10))) & 4294967295L);
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        i2 i2Var = new i2(this.Y, this.Z, this.f28390a0, this.f28391b0, this.f28392c0, this.f28393d0, this.f28394e0, this.f28395f0, this.f28396g0, this.f28397h0, this.f28398i0, this.f28399j0, this.f28400k0, this.l0, this.m0, this.f28401n0, this.f28402o0, this.f28403p0, this.f28404q0, this.f28405r0, this.f28406s0, this.f28407t0, this.f28409u0, this.f28411v0, this.f28413w0, this.f28415x0, this.f28417y0, this.f28419z0, this.A0, this.B0, this.C0, cVar);
        i2Var.X = obj;
        return i2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x05c3, code lost:
    
        if (r3 != r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04e8, code lost:
    
        if (n4.b1(r1, r74.f28405r0, r74.f28394e0, r74.Y, r5, r74.f28396g0, r74.f28397h0, r74.f28406s0, r74.f28407t0, r74.f28398i0, r13, r42, r33, r25, r15, r3, r74.Z, r74.f28390a0, r74.f28391b0, r74) == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x069b, code lost:
    
        if (n4.U0(r1, r50, r3.f28396g0, r3.f28397h0, r3.f28400k0, r3.l0, r3.f28401n0, r3.f28402o0, r3.Y, r3.f28403p0, r3.m0, r3.f28404q0, r13, 0, r15, r3.Z, r3.f28390a0, r3) == r0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0796, code lost:
    
        if (n4.T0(r1, r50, r3.f28396g0, r3.f28397h0, r3.f28398i0, r3.l0, r3.f28401n0, r3.f28400k0, r13, r3.f28402o0, r3.f28415x0, r3.f28417y0, r3.f28403p0, r3.m0, r3.f28404q0, r49, r17, r18, r19, r3.Z, r3.f28390a0, r3.f28391b0, r3) == r0) goto L140;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0039. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x1068  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x1317 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0ee3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0eb0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c0c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x13bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0ae2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x13cf  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0fbb  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0fce  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0ff7  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1019  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x100a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x100f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0fc7  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0f33  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x13e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x1143  */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0bc5 -> B:98:0x0be9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x05c3 -> B:178:0x05c7). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r75) {
        /*
            Method dump skipped, instructions count: 5218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
