package ya;
import b3.n;
import d1.o;
import d1.r;
import df.a;
import df.l;
import k0.b0;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import s.e;
import s.i;
import s.j;
import s.k;
import s.l;
import ya.nb;
import z0.c;

/* loaded from: classes.dex */
public abstract class nb {
    public static final void a(k kVar, a aVar, r rVar, l lVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        r rVar2 = (r) mVar;
        rVar2.c0(645832757);
        if ((i & 6) == 0) {
            if (rVar2.f(kVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i14 = i10 | 384;
        if ((i & 3072) == 0) {
            if (rVar2.h(lVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i14 |= i11;
        }
        if ((i14 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i14 & 1, z3)) {
            j jVar = (j) kVar.f24849a.getValue();
            if (!(jVar instanceof i)) {
                q1 t3 = rVar2.t();
                if (t3 != null) {
                    t3.f24332d = new n(kVar, aVar, lVar, i);
                    return;
                }
                return;
            }
            boolean f10 = rVar2.f(jVar);
            Object O = rVar2.O();
            if (f10 || O == l.f24285a) {
                O = new e(td.b(((i) jVar).f24848a));
                rVar2.k0(O);
            }
            l.c((e) O, aVar, lVar, rVar2, i14 & 8176);
            rVar = o.f15687a;
        } else {
            rVar2.U();
        }
        r rVar3 = rVar;
        q1 t10 = rVar2.t();
        if (t10 != null) {
            t10.f24332d = new b0(kVar, aVar, rVar3, lVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(k r17, a r18, l r19, r r20, boolean r21, a r22, c r23, m r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.nb.b(k, a, l, r, boolean, a, c, m, int, int):void");
    }
}
