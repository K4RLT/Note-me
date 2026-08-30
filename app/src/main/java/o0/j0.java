package o0;
import d1.r;
import k1.p0;
import o0.j0;
import o0.s1;
import p0.o;
import r0.m;
import r0.q1;
import r0.r;
import v.i;
import x.j0;
import x.k0;
import z0.c;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f21526a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f21527b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f21528c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f21529d = 1;
    public static final float e = 2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x005d  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r28, i r29, r r30, s1 r31, p0 r32, float r33, float r34, m r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.j0.a(boolean, i, r, s1, p0, float, float, m, int, int):void");
    }

    public final void b(String str, df.p pVar, boolean z3, boolean z9, r2.e0 e0Var, i iVar, df.p pVar2, s1 s1Var, x.j0 j0Var, c cVar, m mVar, int i) {
        int i10;
        boolean z10;
        boolean z11;
        r2.e0 e0Var2;
        int i11;
        df.p pVar3;
        int i12;
        x.j0 k0Var;
        int i13;
        r rVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        r rVar2 = (r) mVar;
        rVar2.c0(-350442135);
        if ((i & 6) == 0) {
            if (rVar2.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i23 | i;
        } else {
            i10 = i;
        }
        int i24 = 32;
        if ((i & 48) == 0) {
            if (rVar2.h(pVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i10 |= i22;
        }
        int i25 = 128;
        if ((i & 384) == 0) {
            z10 = z3;
            if (rVar2.g(z10)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i10 |= i21;
        } else {
            z10 = z3;
        }
        int i26 = 1024;
        if ((i & 3072) == 0) {
            z11 = z9;
            if (rVar2.g(z11)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i10 |= i20;
        } else {
            z11 = z9;
        }
        int i27 = 8192;
        if ((i & 24576) == 0) {
            e0Var2 = e0Var;
            if (rVar2.f(e0Var2)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i10 |= i19;
        } else {
            e0Var2 = e0Var;
        }
        if ((i & 196608) == 0) {
            if (rVar2.f(iVar)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i10 |= i18;
        }
        if ((i & 1572864) == 0) {
            if (rVar2.g(false)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i10 |= i17;
        }
        if ((i & 12582912) == 0) {
            i11 = 12582912;
            pVar3 = pVar2;
            if (rVar2.h(pVar3)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i10 |= i16;
        } else {
            i11 = 12582912;
            pVar3 = pVar2;
        }
        if ((i & 100663296) == 0) {
            if (rVar2.h(null)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i10 |= i15;
        }
        if ((i & 805306368) == 0) {
            if (rVar2.h(null)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i10 |= i14;
        }
        if (rVar2.h(null)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i28 = 14155776 | i12;
        if (!rVar2.h(null)) {
            i24 = 16;
        }
        int i29 = i28 | i24;
        if (rVar2.h(null)) {
            i25 = 256;
        }
        int i30 = i29 | i25;
        if (rVar2.h(null)) {
            i26 = 2048;
        }
        int i31 = i30 | i26;
        if (rVar2.f(s1Var)) {
            i27 = 16384;
        }
        int i32 = i31 | i27 | 65536;
        if ((306783379 & i10) == 306783378 && (4793491 & i32) == 4793490 && rVar2.D()) {
            rVar2.U();
            k0Var = j0Var;
            rVar = rVar2;
        } else {
            rVar2.W();
            if ((i & 1) != 0 && !rVar2.A()) {
                rVar2.U();
                i13 = i32 & (-458753);
                k0Var = j0Var;
            } else {
                float f10 = o.f22344b;
                k0Var = new k0(f10, f10, f10, f10);
                i13 = i32 & (-458753);
            }
            rVar2.q();
            int i33 = i10 << 3;
            int i34 = i10 >> 3;
            int i35 = i10 >> 9;
            int i36 = i13 << 21;
            rVar = rVar2;
            boolean z12 = z11;
            o.a(str, pVar, e0Var2, pVar3, z12, z10, iVar, k0Var, s1Var, cVar, rVar, (i33 & 896) | (i33 & 112) | 6 | (i34 & 7168) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192), (i10 & 896) | ((i13 >> 9) & 14) | ((i10 >> 6) & 112) | (i35 & 7168) | (i34 & 57344) | ((i13 << 6) & 3670016) | i11);
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new i0(this, str, pVar, z3, z9, e0Var, iVar, pVar2, s1Var, k0Var, cVar, i);
        }
    }
}
