package p0;
import b.a;
import d.a;
import o.a;

import m2.q0;
import r0.q1;
import ya.k9;
import z1.o0;
import z1.y;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static final float f22344b;

    /* renamed from: g, reason: collision with root package name */
    public static final float f22348g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f22349h;
    public static final d1.r i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f22343a = y2.a(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final float f22345c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f22346d = 4;
    public static final float e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f22347f = 24;

    static {
        float f10 = 16;
        f22344b = f10;
        f22348g = f10;
        f22349h = f10;
        float f11 = 48;
        i = androidx.compose.foundation.layout.a(d1.o.f15687a, f11, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0395, code lost:
    
        if (r9 != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x032a, code lost:
    
        if (r9 != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0300, code lost:
    
        if (r9 != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r38, df.p r39, r2.e0 r40, df.p r41, boolean r42, boolean r43, v.i r44, x.j0 r45, o0.s1 r46, z0.c r47, r0.m r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a(java.lang.String, df.p, r2.e0, df.p, boolean, boolean, v.i, x.j0, o0.s1, z0.c, r0.m, int, int):void");
    }

    public static final void b(long j10, q0 q0Var, df.p pVar, r0.m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(1208685580);
        if ((i10 & 6) == 0) {
            if (rVar.e(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.f(q0Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.D()) {
            rVar.U();
        } else {
            k9.a(j10, q0Var, pVar, rVar, i11 & 1022);
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h(j10, q0Var, pVar, i10, 1);
        }
    }

    public static final Object c(o0 o0Var) {
        y yVar;
        Object H = o0Var.H();
        if (H instanceof y) {
            yVar = (y) H;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            return null;
        }
        return yVar.I;
    }
}
