package o0;
import k.b;
import b.b;
import d1.o;
import d1.r;
import e0.a;
import o0.f;
import o0.k;
import r0.l;
import r0.m;
import r0.q1;

import androidx.compose.material3.MinimumInteractiveModifier;
import r0.o2;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21533a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f21534b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final float f21535c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f21536d;

    static {
        float f10 = 2;
        f21533a = f10;
        f21535c = f10;
        f21536d = f10;
    }

    public static final void a(boolean z3, df.l lVar, r rVar, boolean z9, f fVar, m mVar, int i) {
        int i10;
        int i11;
        r rVar2;
        boolean z10;
        l2.a aVar;
        df.a aVar2;
        r rVar3;
        boolean z11;
        r rVar4 = (r) mVar;
        rVar4.c0(-1406741137);
        if (rVar4.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i | i10 | 3456;
        if (rVar4.f(fVar)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i13 = i12 | i11 | 196608;
        if ((74899 & i13) == 74898 && rVar4.D()) {
            rVar4.U();
            rVar3 = rVar;
            z11 = z9;
        } else {
            rVar4.W();
            boolean z12 = true;
            if ((i & 1) != 0 && !rVar4.A()) {
                rVar4.U();
                rVar2 = rVar;
                z10 = true;
                z12 = z9;
            } else {
                rVar2 = o.f15687a;
                z10 = true;
            }
            rVar4.q();
            if (z3) {
                aVar = l2.a.f19880u;
            } else {
                aVar = l2.a.f19881v;
            }
            rVar4.a0(1046936362);
            if (lVar != null) {
                if ((i13 & 14) != 4) {
                    z10 = false;
                }
                Object O = rVar4.O();
                if (z10 || O == l.f24285a) {
                    O = new a(lVar, z3, 1);
                    rVar4.k0(O);
                }
                aVar2 = (df.a) O;
            } else {
                aVar2 = null;
            }
            rVar4.p(false);
            r rVar5 = rVar2;
            c(aVar, aVar2, rVar5, z12, fVar, rVar4, i13 & 524160);
            rVar3 = rVar5;
            z11 = z12;
        }
        q1 t3 = rVar4.t();
        if (t3 != null) {
            t3.f24332d = new g(z3, lVar, rVar3, z11, fVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r34, l2.a r35, r r36, f r37, m r38, int r39) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.k.b(boolean, l2.a, r, f, m, int):void");
    }

    public static final void c(l2.a aVar, df.a aVar2, r rVar, boolean z3, f fVar, m mVar, int i) {
        int i10;
        r rVar2;
        l2.a aVar3;
        boolean z9;
        f fVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r rVar3 = (r) mVar;
        rVar3.c0(-1608358065);
        if ((i & 6) == 0) {
            if (rVar3.f(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar3.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i & 384) == 0) {
            if (rVar3.f(rVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i & 3072) == 0) {
            if (rVar3.g(z3)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i & 24576) == 0) {
            if (rVar3.f(fVar)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((196608 & i) == 0) {
            if (rVar3.f(null)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        if ((74899 & i10) == 74898 && rVar3.D()) {
            rVar3.U();
            aVar3 = aVar;
            fVar2 = fVar;
            z9 = z3;
        } else {
            rVar3.W();
            if ((i & 1) != 0 && !rVar3.A()) {
                rVar3.U();
            }
            rVar3.q();
            rVar3.a0(-97239746);
            r rVar4 = o.f15687a;
            if (aVar2 != null) {
                rVar2 = androidx.compose.foundation.selection.b(aVar2, new j2.g(1), aVar, a(false, a.f23046a / 2, rVar3, 54, 4), z3);
            } else {
                rVar2 = rVar4;
            }
            rVar3.p(false);
            if (aVar2 != null) {
                o2 o2Var = z.f21756a;
                rVar4 = MinimumInteractiveModifier.f587a;
            }
            aVar3 = aVar;
            b(z3, aVar3, androidx.compose.foundation.layout.a.k(rVar.d(rVar4).d(rVar2), f21533a), fVar, rVar3, ((i10 >> 9) & 14) | ((i10 << 3) & 112) | ((i10 >> 3) & 7168));
            z9 = z3;
            fVar2 = fVar;
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new j(aVar3, aVar2, rVar, z9, fVar2, i);
        }
    }
}
