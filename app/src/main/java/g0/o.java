package g0;
import a0.u;
import a1.g;
import d1.r;
import g0.c1;
import g0.d1;
import g0.o;
import k1.r0;
import m2.q0;
import q.x;
import r0.l;
import r0.m;
import r0.q1;
import v.i;

import androidx.ink.storage.DecompressedBytes;
import ya.sd;

/* loaded from: classes.dex */
public abstract class o {
    static {
        float f10 = 40;
        sd.a(f10, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r32, df.l r33, r r34, boolean r35, q0 r36, d1 r37, c1 r38, boolean r39, int r40, int r41, r2.e0 r42, df.l r43, i r44, r0 r45, df.q r46, m r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.o.a(java.lang.String, df.l, r, boolean, q0, d1, c1, boolean, int, int, r2.e0, df.l, i, r0, df.q, m, int, int, int):void");
    }

    public static final void b(r2.x xVar, df.l lVar, r rVar, boolean z3, q0 q0Var, d1 d1Var, c1 c1Var, boolean z9, int i, int i10, r2.e0 e0Var, df.l lVar2, r0 r0Var, df.q qVar, m mVar, int i11, int i12, int i13) {
        d1 d1Var2;
        int i14;
        c1 c1Var2;
        int i15;
        boolean z10;
        df.q qVar2;
        boolean z11;
        int i16;
        int i17;
        boolean z12;
        d1 d1Var3;
        c1 c1Var3;
        r2.e0 e0Var2;
        df.l lVar3;
        df.q qVar3;
        d1 d1Var4;
        int i18;
        c1 c1Var4;
        boolean z13;
        int i19;
        int i20;
        boolean z14;
        df.l lVar4;
        r2.e0 e0Var3;
        r rVar2 = (r) mVar;
        rVar2.c0(1804514146);
        int i21 = i11 | (rVar2.f(xVar) ? 4 : 2) | (rVar2.h(lVar) ? 32 : 16) | (rVar2.f(rVar) ? 256 : 128) | 27648 | (rVar2.f(q0Var) ? 131072 : 65536);
        int i22 = i13 & 64;
        if (i22 != 0) {
            i14 = i21 | 1572864;
            d1Var2 = d1Var;
        } else {
            d1Var2 = d1Var;
            i14 = i21 | (rVar2.f(d1Var2) ? 1048576 : 524288);
        }
        int i23 = i13 & 128;
        if (i23 != 0) {
            i15 = i14 | 12582912;
            c1Var2 = c1Var;
        } else {
            c1Var2 = c1Var;
            i15 = i14 | (rVar2.f(c1Var2) ? 8388608 : 4194304);
        }
        int i24 = i13 & 256;
        if (i24 != 0) {
            i15 |= 100663296;
            z10 = z9;
        } else {
            z10 = z9;
            if ((i11 & 100663296) == 0) {
                i15 |= rVar2.g(z10) ? 67108864 : 33554432;
            }
        }
        int i25 = i15 | 268435456;
        int i26 = i12 | 3510;
        int i27 = i13 & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        if (i27 != 0) {
            i26 = 224694;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i12 & 196608) == 0) {
                i26 |= rVar2.h(qVar2) ? 131072 : 65536;
            }
        }
        if (rVar2.R(i25 & 1, ((i25 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true)) {
            rVar2.W();
            if ((i11 & 1) != 0 && !rVar2.A()) {
                rVar2.U();
                int i28 = i25 & (-1879048193);
                z13 = z3;
                i18 = i;
                i19 = i10;
                e0Var3 = e0Var;
                i20 = i28;
                z14 = z10;
                d1Var4 = d1Var2;
                c1Var4 = c1Var2;
                qVar3 = qVar2;
                lVar4 = lVar2;
            } else {
                d1Var4 = i22 != 0 ? d1.f17042d : d1Var2;
                if (i23 != 0) {
                    c1Var2 = c1.f17032b;
                }
                if (i24 != 0) {
                    z10 = false;
                }
                int i29 = z10 ? 1 : Integer.MAX_VALUE;
                int i30 = (-1879048193) & i25;
                l lVar5 = l.f17186v;
                x xVar2 = r2.d0.f24485u;
                if (i27 != 0) {
                    qVar2 = w.f17321b;
                }
                i18 = i29;
                c1Var4 = c1Var2;
                z13 = true;
                i19 = 1;
                i20 = i30;
                qVar3 = qVar2;
                z14 = z10;
                lVar4 = lVar5;
                e0Var3 = xVar2;
            }
            rVar2.q();
            r2.j a10 = d1Var4.a(z14);
            boolean z15 = !z14;
            int i31 = z14 ? 1 : i19;
            int i32 = z14 ? 1 : i18;
            d1 d1Var5 = d1Var4;
            boolean z16 = z14;
            boolean z17 = ((i20 & 14) == 4) | ((i20 & 112) == 32);
            Object O = rVar2.O();
            if (z17 || O == l.f24285a) {
                O = new u(xVar, 20, lVar);
                rVar2.k0(O);
            }
            g(xVar, (df.l) O, rVar, q0Var, e0Var3, lVar4, null, r0Var, z15, i32, i31, a10, c1Var4, z13, qVar3, rVar2, ((i20 >> 6) & 7168) | (i20 & 910) | 14376960, ((i20 >> 15) & 896) | 27648 | (458752 & i26));
            e0Var2 = e0Var3;
            c1Var3 = c1Var4;
            z11 = z13;
            i16 = i18;
            d1Var3 = d1Var5;
            z12 = z16;
            i17 = i19;
            lVar3 = lVar4;
        } else {
            rVar2.U();
            z11 = z3;
            i16 = i;
            i17 = i10;
            z12 = z10;
            d1Var3 = d1Var2;
            c1Var3 = c1Var2;
            e0Var2 = e0Var;
            lVar3 = lVar2;
            qVar3 = qVar2;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new m(xVar, lVar, rVar, z11, q0Var, d1Var3, c1Var3, z12, i16, i17, e0Var2, lVar3, r0Var, qVar3, i11, i12, i13);
        }
    }
}
