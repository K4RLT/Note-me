package w7;
import c.d;
import c.k;
import c.m;
import cb.c;
import d1.o;
import d1.r;
import k1.l0;
import m2.f0;
import p.a;
import p.p0;
import r0.a1;
import r0.l;
import r0.q1;
import r0.v0;
import r0.y;
import w7.cb;
import x.p;
import z0.h;

import androidx.compose.foundation.layout.FillElement;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cb {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28049a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final List f28050b = qe.m.h(new r(l0.d(4280032286L)), new r(l0.d(4280104279L)), new r(l0.d(4284235054L)), new r(l0.d(4281162279L)), new r(l0.d(4287299584L)), new r(l0.d(4283045195L)), new r(l0.d(4292128567L)), new r(l0.d(4292901471L)), new r(l0.d(4285298045L)), new r(l0.d(4294507002L)));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x090e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x09a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0e9b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0f4e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0f59  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0f63 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0f51  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0f3b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0ead  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0ebe  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0ed4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0eb4  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0e5d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final u7.d r94, final u7.m3 r95, final int r96, final int r97, df.a r98, m r99, int r100) {
        /*
            Method dump skipped, instructions count: 4064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.cb.a(u7.d, u7.m3, int, int, df.a, m, int):void");
    }

    public static final String b(a1 a1Var) {
        return (String) a1Var.getValue();
    }

    public static final void c(final p pVar, final u7.m3 m3Var, final e3 e3Var, final boolean z3, final int i, final int i10, final boolean z9, final a1 a1Var, final a1 a1Var2, m mVar, final int i11) {
        int i12;
        e3 e3Var2;
        a1 a1Var3;
        boolean z10;
        r rVar;
        u7.d dVar;
        float f10;
        boolean z11;
        Object obj;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        pVar.getClass();
        a1Var.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(1343154670);
        if ((i11 & 6) == 0) {
            if (rVar2.f(pVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar2.h(m3Var)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 384) == 0) {
            e3Var2 = e3Var;
            if (rVar2.f(e3Var2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        } else {
            e3Var2 = e3Var;
        }
        if ((i11 & 24576) == 0) {
            if (rVar2.d(i)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((196608 & i11) == 0) {
            if (rVar2.d(i10)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((1572864 & i11) == 0) {
            if (rVar2.g(z9)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((12582912 & i11) == 0) {
            if (rVar2.f(a1Var)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((100663296 & i11) == 0) {
            a1Var3 = a1Var2;
            if (rVar2.f(a1Var3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        } else {
            a1Var3 = a1Var2;
        }
        boolean z12 = true;
        if ((38346899 & i12) != 38346898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.R(i12 & 1, z10)) {
            boolean m4 = e3Var2.m();
            String str = (String) a1Var3.getValue();
            if (str != null) {
                Iterator it = m3Var.k1(i, i10).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.l.a(((u7.d) obj).f26033a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                dVar = (u7.d) obj;
            } else {
                dVar = null;
            }
            if (dVar == null && ((Boolean) a1Var.getValue()).booleanValue()) {
                a1Var.setValue(Boolean.FALSE);
            }
            boolean booleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            v0 v0Var = l.f24285a;
            if (booleanValue && dVar != null) {
                rVar2.a0(2006303570);
                FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                Object O = rVar2.O();
                if (O == v0Var) {
                    O = a.r(rVar2);
                }
                v.i iVar = (v.i) O;
                if ((i12 & 29360128) == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object O2 = rVar2.O();
                if (z11 || O2 == v0Var) {
                    O2 = new h9(a1Var, 4);
                    rVar2.k0(O2);
                }
                m.a(0, androidx.compose.foundation.a.e(fillElement, iVar, null, false, null, (df.a) O2, 28), rVar2);
            } else {
                rVar2.a0(1983016308);
            }
            rVar2.p(false);
            if (!((Boolean) a1Var.getValue()).booleanValue() || !z9 || m4 || dVar == null) {
                z12 = false;
            }
            r a10 = pVar.a(o.f15687a, c.B);
            if (e3Var2.p() > 0) {
                rVar2.a0(-2013455575);
                f10 = ((c) rVar2.j(c2.p1.f3606h)).Y(e3Var2.p());
                rVar2.p(false);
            } else {
                rVar2.a0(-2013452784);
                rVar2.p(false);
                f10 = 132;
            }
            r o10 = androidx.compose.foundation.layout.a.o(a10, 0.0f, 0.0f, 0.0f, f10 + f28049a, 7);
            q.r0 r8 = q.e.r(0.8f, 520.0f, null, 4);
            Object O3 = rVar2.O();
            if (O3 == v0Var) {
                O3 = new f0(13);
                rVar2.k0(O3);
            }
            p0 a11 = androidx.compose.animation.k((df.l) O3, r8).a(androidx.compose.animation.d(q.e.r(0.8f, 520.0f, null, 4), 2));
            q.r0 r10 = q.e.r(1.0f, 800.0f, null, 4);
            Object O4 = rVar2.O();
            if (O4 == v0Var) {
                O4 = new f0(13);
                rVar2.k0(O4);
            }
            rVar = rVar2;
            ya.c(z12, o10, a11, androidx.compose.animation.m((df.l) O4, r10).a(androidx.compose.animation.c.e(q.e.r(1.0f, 800.0f, null, 4), 2)), null, h.d(847762118, new e9(dVar, m3Var, i, i10, a1Var, 1), rVar2), rVar, 196608, 16);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.bb
                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    c(p.this, m3Var, e3Var, z3, i, i10, z9, a1Var, a1Var2, (m) obj2, y.L(i11 | 1));
                    return pe.z.f22715a;
                }
            };
        }
    }
}
