package g0;
import a0.n;
import a0.o;
import a1.t;
import a2.c;
import b0.i;
import b0.x;
import b1.i;
import b1.w;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import b2.k0;
import c0.d0;
import c0.h;
import c2.p0;
import c2.p1;
import c2.q0;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import f.a;
import g0.a1;
import g0.c1;
import g0.i2;
import g0.i;
import h.a;
import i2.c;
import j0.j;
import j1.c;
import j2.k;
import k.a;
import k0.a1;
import k0.b1;
import k0.f1;
import k0.j1;
import k0.o1;
import k0.o;
import k0.p1;
import k0.t0;
import k0.v0;
import k0.w;
import k1.r0;
import k1.u;
import l.a;
import m2.a;
import m2.e;
import m2.g0;
import m2.g;
import m2.h;
import m2.j0;
import m2.l0;
import m2.m0;
import m2.p0;
import m2.q0;
import m2.q;
import m2.s;
import p.a;
import q.b;
import q.x;
import r0.a1;
import r0.b;
import r0.c;
import r0.e;
import r0.i1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import s.k;
import s1.b;
import t1.c;
import v.i;
import v1.a;
import v1.d0;
import v1.w;
import w.a;
import x.a;
import x.m;
import z0.c;
import z0.g;
import z1.o0;
import z1.p0;
import z1.x;

import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.ink.storage.DecompressedBytes;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import wa.b9;
import wa.n8;
import wa.s8;
import ya.nb;
import ya.qd;
import ya.ud;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f17011a = new x0(1);

    /* renamed from: b, reason: collision with root package name */
    public static final a f17012b = new a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final a f17013c = new a(1022);

    public static final r A(r rVar, g gVar, q0 q0Var, df.l lVar, int i, boolean z3, int i10, int i11, q2.h hVar, List list, df.l lVar2, j jVar, u uVar, df.l lVar3, i iVar) {
        if (jVar == null) {
            return rVar.d(o.f15687a).d(new TextAnnotatedStringElement(gVar, q0Var, hVar, lVar, i, z3, i10, i11, list, lVar2, uVar, iVar, lVar3));
        }
        return rVar.d(jVar.f18738z).d(new SelectableTextAnnotatedStringElement(gVar, q0Var, hVar, lVar, i, z3, i10, i11, list, lVar2, jVar, uVar, iVar));
    }

    public static final void B(int i, int i10) {
        if (i <= 0 || i10 <= 0) {
            a.a("both minLines " + i + " and maxLines " + i10 + " must be greater than zero");
        }
        if (i <= i10) {
            return;
        }
        a.a("minLines " + i + " must be less than or equal to maxLines " + i10);
    }

    public static final void a(g gVar, r rVar, q0 q0Var, df.l lVar, int i, boolean z3, int i10, int i11, Map map, m mVar, int i12) {
        int i13;
        df.l lVar2;
        boolean z9;
        r rVar2;
        int i14;
        r rVar3;
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        r rVar4 = (r) mVar;
        rVar4.c0(-1343466571);
        if ((i12 & 6) == 0) {
            if (rVar4.f(gVar)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i13 = i24 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (rVar4.f(rVar)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i13 |= i23;
        }
        if ((i12 & 384) == 0) {
            if (rVar4.f(q0Var)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i13 |= i22;
        }
        if ((i12 & 3072) == 0) {
            lVar2 = lVar;
            if (rVar4.h(lVar2)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i13 |= i21;
        } else {
            lVar2 = lVar;
        }
        if ((i12 & 24576) == 0) {
            if (rVar4.d(i)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i13 |= i20;
        }
        if ((196608 & i12) == 0) {
            if (rVar4.g(z3)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        }
        if ((1572864 & i12) == 0) {
            if (rVar4.d(i10)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        if ((12582912 & i12) == 0) {
            if (rVar4.d(i11)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((100663296 & i12) == 0) {
            if (rVar4.h(map)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i13 |= i16;
        }
        j jVar = null;
        if ((805306368 & i12) == 0) {
            if (rVar4.h(null)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        if ((306783379 & i13) == 306783378) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (rVar4.R(i13 & 1, z9)) {
            B(i11, i10);
            k0.a1 a1Var = (k0.a1) rVar4.j(b1.f19236a);
            Object obj2 = l.f24285a;
            if (a1Var != null) {
                rVar4.a0(-1584170794);
                long j10 = ((o1) rVar4.j(p1.f19390a)).f19382b;
                Object[] objArr = {a1Var};
                i14 = i13;
                int i25 = 1;
                x90 x90Var = new x90(new d0(7, a1Var), i25, l.f17188x);
                boolean h3 = rVar4.h(a1Var);
                Object O = rVar4.O();
                if (h3 || O == obj2) {
                    O = new s(a1Var, i25);
                    rVar4.k0(O);
                }
                obj = obj2;
                Object c10 = t.c(objArr, x90Var, (df.a) O, rVar4, 0, 4);
                rVar3 = rVar4;
                long longValue = ((Number) c10).longValue();
                boolean e = rVar3.e(longValue) | rVar3.f(a1Var) | rVar3.e(j10);
                Object O2 = rVar3.O();
                if (e || O2 == obj) {
                    O2 = new j(longValue, a1Var, j10);
                    rVar3.k0(O2);
                }
                jVar = (j) O2;
                rVar3.p(false);
            } else {
                i14 = i13;
                rVar3 = rVar4;
                obj = obj2;
                rVar3.a0(-1583679630);
                rVar3.p(false);
            }
            j jVar2 = jVar;
            pe.j jVar3 = h.f17116a;
            int length = gVar.f20477v.length();
            List list = gVar.f20476u;
            if (list != null) {
                int size = list.size();
                for (int i26 = 0; i26 < size; i26++) {
                    e eVar = (e) list.get(i26);
                    if ((eVar.f20451a instanceof j0) && "androidx.compose.foundation.text.inlineContent".equals(eVar.f20454d)) {
                        z10 = false;
                        if (h.b(0, length, eVar.f20452b, eVar.f20453c)) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            z10 = false;
            z11 = false;
            boolean a10 = n8.a(gVar);
            if (!z11 && !a10) {
                rVar3.a0(-1583500636);
                r rVar5 = rVar3;
                r A = A(rVar, gVar, q0Var, lVar2, i, z3, i10, i11, (q2.h) rVar3.j(p1.f3608k), null, null, jVar2, null, null, null);
                g gVar2 = g.f17104c;
                int hashCode = Long.hashCode(rVar5.T);
                r c11 = a.c(A, rVar5);
                g l10 = rVar5.l();
                h.f1471d.getClass();
                df.a aVar = g.f1462b;
                rVar5.e0();
                if (rVar5.S) {
                    rVar5.k(aVar);
                } else {
                    rVar5.n0();
                }
                y.I(g.e, gVar2, rVar5);
                y.I(g.f1464d, l10, rVar5);
                y.I(g.f1463c, c11, rVar5);
                f fVar = g.f1465f;
                if (rVar5.S || !kotlin.jvm.internal.a(rVar5.O(), Integer.valueOf(hashCode))) {
                    a.t(hashCode, rVar5, hashCode, fVar);
                }
                rVar5.p(true);
                rVar5.p(false);
                rVar2 = rVar5;
            } else {
                r rVar6 = rVar3;
                boolean z13 = z10;
                int i27 = 1;
                rVar6.a0(-1582650709);
                if ((i14 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = z13;
                }
                Object O3 = rVar6.O();
                if (z12 || O3 == obj) {
                    O3 = y.B(gVar);
                    rVar6.k0(O3);
                }
                r0.a1 a1Var2 = (r0.a1) O3;
                g gVar3 = (g) a1Var2.getValue();
                q2.h hVar = (q2.h) rVar6.j(p1.f3608k);
                boolean f10 = rVar6.f(a1Var2);
                Object O4 = rVar6.O();
                if (f10 || O4 == obj) {
                    O4 = new p0(a1Var2, i27);
                    rVar6.k0(O4);
                }
                int i28 = i14 << 6;
                i(rVar, gVar3, lVar, z11, map, q0Var, i, z3, i10, i11, hVar, jVar2, (df.l) O4, rVar6, ((i14 >> 3) & 910) | ((i14 >> 12) & 57344) | ((i14 << 9) & 458752) | (3670016 & i28) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i14 >> 21) & 896) | 24576);
                rVar2 = rVar6;
                rVar2.p(false);
            }
        } else {
            rVar2 = rVar4;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new q(gVar, rVar, q0Var, lVar, i, z3, i10, i11, map, i12, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r23, r r24, q0 r25, int r26, boolean r27, int r28, int r29, i r30, m r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a1.b(java.lang.String, r, q0, int, boolean, int, int, i, m, int, int):void");
    }

    public static final void c(g gVar, r rVar, q0 q0Var, df.l lVar, int i, boolean z3, int i10, int i11, Map map, m mVar, int i12) {
        int i13;
        boolean z9;
        r rVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        r rVar3 = (r) mVar;
        rVar3.c0(-1064305212);
        if ((i12 & 6) == 0) {
            if (rVar3.f(gVar)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i13 = i22 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (rVar3.f(rVar)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i13 |= i21;
        }
        if ((i12 & 384) == 0) {
            if (rVar3.f(q0Var)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i13 |= i20;
        }
        if ((i12 & 3072) == 0) {
            if (rVar3.h(lVar)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i13 |= i19;
        }
        if ((i12 & 24576) == 0) {
            if (rVar3.d(i)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i13 |= i18;
        }
        if ((196608 & i12) == 0) {
            if (rVar3.g(z3)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        if ((1572864 & i12) == 0) {
            if (rVar3.d(i10)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i13 |= i16;
        }
        if ((12582912 & i12) == 0) {
            if (rVar3.d(i11)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i13 |= i15;
        }
        if ((100663296 & i12) == 0) {
            if (rVar3.h(map)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i13 |= i14;
        }
        int i23 = i13 | 805306368;
        if ((306783379 & i23) != 306783378) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar3.R(i23 & 1, z9)) {
            rVar2 = rVar3;
            a(gVar, rVar, q0Var, lVar, i, z3, i10, i11, map, rVar2, i23 & 2147483646);
        } else {
            rVar2 = rVar3;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new q(gVar, rVar, q0Var, lVar, i, z3, i10, i11, map, i12, 1);
        }
    }

    public static final void d(String str, r rVar, q0 q0Var, int i, boolean z3, int i10, int i11, m mVar, int i12) {
        int i13;
        boolean z9;
        r rVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        r rVar3 = (r) mVar;
        rVar3.c0(-1186827822);
        if ((i12 & 6) == 0) {
            if (rVar3.f(str)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (rVar3.f(rVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        }
        if ((i12 & 384) == 0) {
            if (rVar3.f(q0Var)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        }
        if ((i12 & 3072) == 0) {
            if (rVar3.h(null)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i13 |= i18;
        }
        if ((i12 & 24576) == 0) {
            if (rVar3.d(i)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i13 |= i17;
        }
        if ((196608 & i12) == 0) {
            if (rVar3.g(z3)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i13 |= i16;
        }
        if ((1572864 & i12) == 0) {
            if (rVar3.d(i10)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i13 |= i15;
        }
        if ((12582912 & i12) == 0) {
            if (rVar3.d(i11)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i13 |= i14;
        }
        int i22 = i13 | 100663296;
        if ((38347923 & i22) != 38347922) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar3.R(i22 & 1, z9)) {
            rVar2 = rVar3;
            b(str, rVar, q0Var, i, z3, i10, i11, null, rVar2, i22 & 268435454, 512);
        } else {
            rVar2 = rVar3;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new r(str, rVar, q0Var, i, z3, i10, i11, i12);
        }
    }

    public static final void e(t0 t0Var, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        c cVar2;
        r rVar = (r) mVar;
        rVar.c0(605522716);
        if (rVar.h(t0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new k();
                rVar.k0(O);
            }
            k kVar = (k) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new x(kVar, 1);
                rVar.k0(O2);
            }
            cVar2 = cVar;
            nb.b(kVar, (df.a) O2, new w(kVar, 2, t0Var), null, false, null, cVar2, rVar, 1572918, 56);
        } else {
            cVar2 = cVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new y(t0Var, cVar2, i);
        }
    }

    public static final void f(j1 j1Var, c cVar, m mVar, int i) {
        int i10;
        boolean z3;
        c cVar2;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(-1985516685);
        if ((i & 6) == 0) {
            if (rVar.h(j1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.h(cVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            Object O = rVar.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = new k();
                rVar.k0(O);
            }
            k kVar = (k) O;
            Object O2 = rVar.O();
            if (O2 == obj) {
                O2 = y.p(rVar);
                rVar.k0(O2);
            }
            pf.z zVar = (pf.z) O2;
            Object O3 = rVar.O();
            if (O3 == obj) {
                O3 = y.B(new l1(0));
                rVar.k0(O3);
            }
            r0.a1 a1Var = (r0.a1) O3;
            Object O4 = rVar.O();
            if (O4 == obj) {
                O4 = new x(kVar, 0);
                rVar.k0(O4);
            }
            df.a aVar = (df.a) O4;
            k0 k0Var = new k0(11, a1Var, kVar, j1Var);
            boolean i13 = j1Var.i();
            boolean h3 = rVar.h(zVar) | rVar.h(j1Var);
            Object O5 = rVar.O();
            if (h3 || O5 == obj) {
                O5 = new h(zVar, a1Var, j1Var);
                rVar.k0(O5);
            }
            cVar2 = cVar;
            nb.b(kVar, aVar, k0Var, null, i13, (df.a) O5, cVar2, rVar, ((i10 << 15) & 3670016) | 54, 8);
        } else {
            cVar2 = cVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new x(i, 2, j1Var, cVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0495, code lost:
    
        if (r17 > ((r2 != null ? r2.longValue() : 0) + 5000)) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0633 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0670 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0703 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x073c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0813 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0879 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0430  */
    /* JADX WARN: Type inference failed for: r15v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v108, types: [r] */
    /* JADX WARN: Type inference failed for: r9v1, types: [r, m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(r2.x r65, df.l r66, r r67, q0 r68, r2.e0 r69, df.l r70, i r71, r0 r72, boolean r73, int r74, int r75, r2.j r76, c1 r77, boolean r78, df.q r79, m r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 2495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a1.g(r2.x, df.l, r, q0, r2.e0, df.l, i, r0, boolean, int, int, r2.j, c1, boolean, df.q, m, int, int):void");
    }

    public static final void h(r rVar, j1 j1Var, c cVar, m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-20551815);
        if (rVar2.f(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar2.h(j1Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i13 & 1, z3)) {
            p0 d2 = m.d(c.f15670u, true);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(rVar, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(g.e, d2, rVar2);
            y.I(g.f1464d, l10, rVar2);
            f fVar = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar2);
            f(j1Var, cVar, rVar2, (i13 >> 3) & 126);
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new q0(rVar, j1Var, cVar, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [r, m] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, i2] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, r0.a1] */
    /* JADX WARN: Type inference failed for: r9v27, types: [qe.s] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v50 */
    public static final void i(r rVar, g gVar, df.l lVar, boolean z3, Map map, q0 q0Var, int i, boolean z9, int i10, int i11, q2.h hVar, j jVar, df.l lVar2, m mVar, int i12, int i13) {
        int i14;
        int i15;
        boolean z10;
        Object r72;
        boolean z11;
        o oVar;
        df.a aVar;
        pe.j jVar2;
        p0 p0Var;
        Object r92;
        boolean z12;
        Object lVar3;
        boolean z13;
        boolean z14;
        Object obj;
        Collection collection;
        boolean z15;
        boolean z16;
        boolean h3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object r02 = (r) mVar;
        r02.c0(-2118572703);
        if ((i12 & 6) == 0) {
            if (r02.f(rVar)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i14 = i28 | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (r02.f(gVar)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i14 |= i27;
        }
        if ((i12 & 384) == 0) {
            if (r02.h(lVar)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i14 |= i26;
        }
        int i29 = 1024;
        if ((i12 & 3072) == 0) {
            if (r02.g(z3)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i14 |= i25;
        }
        int i30 = 8192;
        if ((i12 & 24576) == 0) {
            if (r02.h(map)) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i14 |= i24;
        }
        if ((196608 & i12) == 0) {
            if (r02.f(q0Var)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i14 |= i23;
        }
        if ((i12 & 1572864) == 0) {
            if (r02.d(i)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i14 |= i22;
        }
        if ((i12 & 12582912) == 0) {
            if (r02.g(z9)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i14 |= i21;
        }
        if ((i12 & 100663296) == 0) {
            if (r02.d(i10)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i14 |= i20;
        }
        if ((i12 & 805306368) == 0) {
            if (r02.d(i11)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i14 |= i19;
        }
        if ((i13 & 6) == 0) {
            if (r02.h(hVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i15 = i13 | i18;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if (r02.h(jVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        if ((i13 & 384) == 0) {
            if (r02.h(null)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i13 & 3072) == 0) {
            if (r02.h(lVar2)) {
                i29 = 2048;
            }
            i15 |= i29;
        }
        if ((i13 & 24576) == 0) {
            if ((i13 & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) == 0) {
                h3 = r02.f(null);
            } else {
                h3 = r02.h(null);
            }
            if (h3) {
                i30 = 16384;
            }
            i15 |= i30;
        }
        int i31 = i15;
        if ((i14 & 306783379) == 306783378 && (i31 & 9363) == 9362) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (r02.R(i14 & 1, z10)) {
            boolean a10 = n8.a(gVar);
            v0 v0Var = l.f24285a;
            if (a10) {
                r02.a0(-613484007);
                if ((i14 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                Object O = r02.O();
                Object obj2 = O;
                if (z16 || O == v0Var) {
                    i2 i2Var = new i2(gVar);
                    r02.k0(i2Var);
                    obj2 = i2Var;
                }
                r02.p(false);
                r72 = (i2) obj2;
            } else {
                r02.a0(-613418350);
                r02.p(false);
                r72 = 0;
            }
            if (n8.a(gVar)) {
                r02.a0(-613220135);
                if ((i14 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean f10 = z15 | r02.f(r72);
                Object O2 = r02.O();
                o oVar2 = O2;
                if (f10 || O2 == v0Var) {
                    o oVar3 = new o((Object) r72, 10, gVar);
                    r02.k0(oVar3);
                    oVar2 = oVar3;
                }
                oVar = oVar2;
                r02.p(false);
            } else {
                r02.a0(-613122857);
                if ((i14 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object O3 = r02.O();
                Object obj3 = O3;
                if (z11 || O3 == v0Var) {
                    c cVar = new c(11, gVar);
                    r02.k0(cVar);
                    obj3 = cVar;
                }
                oVar = (df.a) obj3;
                r02.p(false);
            }
            if (z3) {
                if (map != null) {
                    pe.j jVar3 = h.f17116a;
                    if (!map.isEmpty()) {
                        int length = gVar.f20477v.length();
                        aVar = oVar;
                        List list = gVar.f20476u;
                        if (list != null) {
                            collection = new ArrayList(list.size());
                            int size = list.size();
                            int i32 = 0;
                            while (i32 < size) {
                                List list2 = list;
                                e eVar = (e) list.get(i32);
                                int i33 = size;
                                Object obj4 = eVar.f20451a;
                                int i34 = i32;
                                int i35 = eVar.f20453c;
                                int i36 = eVar.f20452b;
                                String str = eVar.f20454d;
                                if ((obj4 instanceof j0) && "androidx.compose.foundation.text.inlineContent".equals(str) && h.b(0, length, i36, i35)) {
                                    Object obj5 = eVar.f20451a;
                                    obj5.getClass();
                                    collection.add(new e(((j0) obj5).f20509a, i36, i35, str));
                                }
                                i32 = i34 + 1;
                                size = i33;
                                list = list2;
                            }
                        } else {
                            collection = qe.s.f24023u;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = collection.size();
                        for (int i37 = 0; i37 < size2; i37++) {
                            if (map.get(((e) collection.get(i37)).f20451a) != null) {
                                g5.b();
                                return;
                            }
                        }
                        jVar2 = new pe.j(arrayList, arrayList2);
                        p0Var = null;
                    }
                }
                aVar = oVar;
                jVar2 = h.f17116a;
                p0Var = null;
            } else {
                aVar = oVar;
                p0Var = null;
                jVar2 = new pe.j(null, null);
            }
            List list3 = (List) jVar2.f22693u;
            List list4 = (List) jVar2.f22694v;
            if (z3) {
                r02.a0(-612806750);
                Object O4 = r02.O();
                Object obj6 = O4;
                if (O4 == v0Var) {
                    i1 B = y.B(p0Var);
                    r02.k0(B);
                    obj6 = B;
                }
                r02.p(false);
                r92 = (r0.a1) obj6;
            } else {
                r02.a0(-612718990);
                r02.p(false);
                r92 = p0Var;
            }
            if (z3) {
                r02.a0(-612625741);
                boolean f11 = r02.f(r92);
                Object O5 = r02.O();
                p0 p0Var2 = O5;
                if (f11 || O5 == v0Var) {
                    p0 p0Var3 = new p0(r92, 2);
                    r02.k0(p0Var3);
                    p0Var2 = p0Var3;
                }
                p0Var = p0Var2;
                r02.p(false);
            } else {
                r02.a0(-612554318);
                r02.p(false);
            }
            df.l lVar4 = p0Var;
            g gVar2 = (g) aVar.invoke();
            boolean h10 = r02.h(r72);
            if ((i14 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z17 = h10 | z12;
            Object O6 = r02.O();
            Object obj7 = O6;
            if (z17 || O6 == v0Var) {
                t tVar = new t(r72, lVar, 0);
                r02.k0(tVar);
                obj7 = tVar;
            }
            r A = A(rVar, gVar2, q0Var, (df.l) obj7, i, z9, i10, i11, hVar, list3, lVar4, jVar, null, lVar2, null);
            if (!z3) {
                r02.a0(-611542291);
                boolean h11 = r02.h(r72);
                Object O7 = r02.O();
                if (!h11 && O7 != v0Var) {
                    z14 = false;
                    obj = O7;
                } else {
                    z14 = false;
                    u uVar = new u(r72, false ? 1 : 0);
                    r02.k0(uVar);
                    obj = uVar;
                }
                lVar3 = new g1((df.a) obj);
                r02.p(z14);
            } else {
                r02.a0(-611365560);
                boolean h12 = r02.h(r72);
                Object O8 = r02.O();
                Object obj8 = O8;
                if (h12 || O8 == v0Var) {
                    u uVar2 = new u(r72, 1);
                    r02.k0(uVar2);
                    obj8 = uVar2;
                }
                df.a aVar2 = (df.a) obj8;
                boolean f12 = r02.f(r92);
                Object O9 = r02.O();
                Object obj9 = O9;
                if (f12 || O9 == v0Var) {
                    n nVar = new n(r92, 2);
                    r02.k0(nVar);
                    obj9 = nVar;
                }
                lVar3 = new c3.l(aVar2, 1, (df.a) obj9);
                r02.p(false);
            }
            int hashCode = Long.hashCode(r02.T);
            g l10 = r02.l();
            r c10 = a.c(A, r02);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            r02.e0();
            if (r02.S) {
                r02.k(b0Var);
            } else {
                r02.n0();
            }
            y.I(g.e, lVar3, r02);
            y.I(g.f1464d, l10, r02);
            f fVar = g.f1465f;
            if (r02.S || !kotlin.jvm.internal.a(r02.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, r02, hashCode, fVar);
            }
            y.I(g.f1463c, c10, r02);
            if (r72 == 0) {
                r02.a0(-509592027);
                z13 = false;
            } else {
                z13 = false;
                r02.a0(537750876);
                r72.a(0, r02);
            }
            r02.p(z13);
            if (list4 == null) {
                r02.a0(-509541249);
            } else {
                r02.a0(-509541248);
                a(gVar, list4, r02, (i14 >> 3) & 14);
            }
            r02.p(z13);
            r02.p(true);
        } else {
            r02.U();
        }
        q1 t3 = r02.t();
        if (t3 != null) {
            t3.f24332d = new v(rVar, gVar, lVar, z3, map, q0Var, i, z9, i10, i11, hVar, jVar, lVar2, i12, i13);
        }
    }

    public static final void j(j1 j1Var, m mVar, int i) {
        int i10;
        boolean z3;
        g gVar;
        r rVar = (r) mVar;
        rVar.c0(-1436003720);
        if (rVar.h(j1Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        int i12 = 1;
        int i13 = 0;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            e1 e1Var = j1Var.f19321d;
            if (e1Var != null && ((Boolean) e1Var.f17074o.getValue()).booleanValue()) {
                e1 e1Var2 = j1Var.f19321d;
                g2 g2Var = null;
                if (e1Var2 != null) {
                    gVar = e1Var2.f17062a.f17232a;
                } else {
                    gVar = null;
                }
                if (gVar != null && gVar.f20477v.length() > 0) {
                    rVar.a0(-289940723);
                    boolean f10 = rVar.f(j1Var);
                    Object O = rVar.O();
                    v0 v0Var = l.f24285a;
                    if (f10 || O == v0Var) {
                        O = new f1(j1Var, i13);
                        rVar.k0(O);
                    }
                    p1 p1Var = (p1) O;
                    y2.c cVar = (y2.c) rVar.j(p1.f3606h);
                    r2.q qVar = j1Var.f19319b;
                    long j10 = j1Var.k().f24516b;
                    int i14 = p0.f20545c;
                    int g8 = qVar.g((int) (j10 >> 32));
                    e1 e1Var3 = j1Var.f19321d;
                    if (e1Var3 != null) {
                        g2Var = e1Var3.d();
                    }
                    g2Var.getClass();
                    m0 m0Var = g2Var.f17113a;
                    c c10 = m0Var.c(b9.e(g8, 0, m0Var.f20524a.f20514a.f20477v.length()));
                    float l0 = (cVar.l0(r1.f17272a) / 2) + c10.f18763a;
                    float f11 = c10.f18766d;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(l0) << 32);
                    boolean e = rVar.e(floatToRawIntBits);
                    Object O2 = rVar.O();
                    if (e || O2 == v0Var) {
                        O2 = new n0(floatToRawIntBits);
                        rVar.k0(O2);
                    }
                    o oVar = (o) O2;
                    boolean h3 = rVar.h(p1Var) | rVar.h(j1Var);
                    Object O3 = rVar.O();
                    if (h3 || O3 == v0Var) {
                        O3 = new p0(p1Var, i13, j1Var);
                        rVar.k0(O3);
                    }
                    r b10 = d0.b(o.f15687a, p1Var, (PointerInputEventHandler) O3);
                    boolean e8 = rVar.e(floatToRawIntBits);
                    Object O4 = rVar.O();
                    if (e8 || O4 == v0Var) {
                        O4 = new d(floatToRawIntBits, i12);
                        rVar.k0(O4);
                    }
                    a(oVar, a(b10, false, (df.l) O4), 0L, rVar, 0);
                    rVar.p(false);
                }
            }
            rVar.a0(-288632802);
            rVar.p(false);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d0(j1Var, i, 9);
        }
    }

    public static final void k(j1 j1Var, boolean z3, m mVar, int i) {
        int i10;
        boolean z9;
        g2 d2;
        boolean z10;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(626339208);
        if ((i & 6) == 0) {
            if (rVar.h(j1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.g(z3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i10 & 1, z9)) {
            if (z3) {
                rVar.a0(-1290924834);
                e1 e1Var = j1Var.f19321d;
                m0 m0Var = null;
                if (e1Var != null && (d2 = e1Var.d()) != null) {
                    m0 m0Var2 = d2.f17113a;
                    e1 e1Var2 = j1Var.f19321d;
                    if (e1Var2 != null) {
                        z10 = e1Var2.f17075p;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        m0Var = m0Var2;
                    }
                }
                if (m0Var == null) {
                    rVar.a0(-1290601288);
                } else {
                    rVar.a0(-1290601287);
                    if (!p0.b(j1Var.k().f24516b)) {
                        rVar.a0(-1685230508);
                        int g8 = j1Var.f19319b.g((int) (j1Var.k().f24516b >> 32));
                        int g10 = j1Var.f19319b.g((int) (j1Var.k().f24516b & 4294967295L));
                        x2.j a10 = m0Var.a(g8);
                        x2.j a11 = m0Var.a(Math.max(g10 - 1, 0));
                        e1 e1Var3 = j1Var.f19321d;
                        if (e1Var3 != null && ((Boolean) e1Var3.f17072m.getValue()).booleanValue()) {
                            rVar.a0(-1684812473);
                            v0.g(true, a10, j1Var, rVar, ((i10 << 6) & 896) | 6);
                            rVar.p(false);
                        } else {
                            rVar.a0(-1684548198);
                            rVar.p(false);
                        }
                        e1 e1Var4 = j1Var.f19321d;
                        if (e1Var4 != null && ((Boolean) e1Var4.f17073n.getValue()).booleanValue()) {
                            rVar.a0(-1684464312);
                            v0.g(false, a11, j1Var, rVar, ((i10 << 6) & 896) | 6);
                            rVar.p(false);
                        } else {
                            rVar.a0(-1684200998);
                            rVar.p(false);
                        }
                        rVar.p(false);
                    } else {
                        rVar.a0(-1684179174);
                        rVar.p(false);
                    }
                    e1 e1Var5 = j1Var.f19321d;
                    if (e1Var5 != null) {
                        i1 i1Var = e1Var5.f17071l;
                        if (!kotlin.jvm.internal.a(j1Var.f19336u.f24515a.f20477v, j1Var.k().f24515a.f20477v)) {
                            i1Var.setValue(Boolean.FALSE);
                        }
                        if (e1Var5.b()) {
                            if (((Boolean) i1Var.getValue()).booleanValue()) {
                                j1Var.p();
                            } else {
                                j1Var.l();
                            }
                        }
                    }
                }
                rVar.p(false);
                rVar.p(false);
            } else {
                rVar.a0(651160447);
                rVar.p(false);
                j1Var.l();
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new m0(j1Var, z3, i);
        }
    }

    public static final void l(e1 e1Var) {
        r2.b0 b0Var = e1Var.e;
        if (b0Var != null) {
            e1Var.f17081v.invoke(r2.a((r2.x) e1Var.f17065d.f8422v, null, 0L, 3));
            r2.y yVar = b0Var.f24465a;
            AtomicReference atomicReference = yVar.f24519b;
            while (true) {
                if (atomicReference.compareAndSet(b0Var, null)) {
                    yVar.f24518a.c();
                    break;
                } else if (atomicReference.get() != b0Var) {
                    break;
                }
            }
        }
        e1Var.e = null;
    }

    public static final c m(y2.c cVar, int i, r2.c0 c0Var, m0 m0Var, boolean z3, int i10) {
        c cVar2;
        float f10;
        float f11;
        if (m0Var != null) {
            cVar2 = m0Var.c(c0Var.f24484b.g(i));
        } else {
            cVar2 = c.e;
        }
        float f12 = cVar2.f18763a;
        int t02 = cVar.t0(r1.f17272a);
        if (z3) {
            f10 = (i10 - f12) - t02;
        } else {
            f10 = f12;
        }
        if (z3) {
            f11 = i10 - f12;
        } else {
            f11 = t02 + f12;
        }
        return c.a(cVar2, f10, f11, 0.0f, 10);
    }

    public static final boolean n(int i, KeyEvent keyEvent) {
        if (((int) (c.a(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    public static final ArrayList o(df.a aVar, List list) {
        ba.r rVar;
        if (((Boolean) aVar.invoke()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o0 o0Var = (o0) list.get(i);
                Object H = o0Var.H();
                H.getClass();
                e7.d dVar = ((j2) H).f17151a;
                i2 i2Var = (i2) dVar.f15942v;
                e eVar = (e) dVar.f15943w;
                m0 m0Var = (m0) i2Var.f17133a.getValue();
                if (m0Var == null) {
                    rVar = new ba.r(0, 0, j.f17137w);
                } else {
                    e c10 = c(eVar, m0Var);
                    if (c10 == null) {
                        rVar = new ba.r(0, 0, j.f17138x);
                    } else {
                        y2.k a10 = ud.a(m0Var.j(c10.f20452b, c10.f20453c).f());
                        rVar = new ba.r(a10.d(), a10.b(), new c(14, a10));
                    }
                }
                int i10 = rVar.f3161u;
                int i11 = rVar.f3162v;
                arrayList.add(new pe.j(o0Var.z(qd.b(i10, i10, i11, i11)), (kotlin.jvm.internal.m) rVar.f3163w));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public static final void p(r2.y yVar, e1 e1Var, r2.x xVar, r2.j jVar, r2.q qVar) {
        mu muVar = e1Var.f17065d;
        i0 i0Var = e1Var.f17081v;
        i0 i0Var2 = e1Var.f17082w;
        Object obj = new Object();
        k0 k0Var = new k0(6, muVar, i0Var, (Object) obj);
        r2.s sVar = yVar.f24518a;
        sVar.h(xVar, jVar, k0Var, i0Var2);
        r2.b0 b0Var = new r2.b0(yVar, sVar);
        yVar.f24519b.set(b0Var);
        obj.f19787u = b0Var;
        e1Var.e = b0Var;
        y(e1Var, xVar, qVar);
    }

    public static final int q(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final Object r(w wVar, p1 p1Var, te.c cVar) {
        Object i = pf.i(new b8.k2(wVar, p1Var, (te.c) null, 3), cVar);
        if (i == ue.a.f27192u) {
            return i;
        }
        return pe.z.f22715a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (c() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int s(int r12, java.lang.String r13) {
        /*
            boolean r0 = c4.k.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            c4.k r0 = c4.a()
            int r3 = c()
            if (r3 != r1) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L8b
            int r3 = c()
            r4 = 0
            if (r3 != r1) goto L1e
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 == 0) goto L84
            java.lang.String r1 = "charSequence cannot be null"
            ya.m9.a(r13, r1)
            c4.f r0 = e
            java.lang.Object r0 = r0.f3830a
            r5 = r0
            ra.e r5 = (ra.e) r5
            r5.getClass()
            r0 = -1
            if (r12 < 0) goto L39
            int r1 = r13.length()
            if (r12 < r1) goto L3b
        L39:
            r6 = r13
            goto L7a
        L3b:
            boolean r1 = r13 instanceof android.text.Spanned
            if (r1 == 0) goto L57
            r1 = r13
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r3 = r12 + 1
            java.lang.Class<c4.a0> r6 = c4.a0.class
            java.lang.Object[] r3 = r1.getSpans(r12, r3, r6)
            c4.a0[] r3 = (c4.a0[]) r3
            int r6 = r3.length
            if (r6 <= 0) goto L57
            r3 = r3[r4]
            int r1 = r1.getSpanEnd(r3)
            r6 = r13
            goto L7b
        L57:
            int r1 = r12 + (-16)
            int r7 = java.lang.Math.max(r4, r1)
            int r1 = r13.length()
            int r3 = r12 + 16
            int r8 = java.lang.Math.min(r1, r3)
            c4.r r11 = new c4.r
            r11.<init>(r12)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 1
            r6 = r13
            java.lang.Object r13 = r5.y(r6, r7, r8, r9, r10, r11)
            c4.r r13 = (c4.r) r13
            int r1 = r13.f3855w
            goto L7b
        L7a:
            r1 = r0
        L7b:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            if (r1 != r0) goto L82
            goto L8c
        L82:
            r2 = r13
            goto L8c
        L84:
            java.lang.String r12 = "Not initialized yet"
            x.o(r12)
            r12 = 0
            return r12
        L8b:
            r6 = r13
        L8c:
            if (r2 == 0) goto L93
            int r12 = r2.intValue()
            return r12
        L93:
            java.text.BreakIterator r13 = java.text.BreakIterator.getCharacterInstance()
            r13.setText(r6)
            int r12 = r13.following(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a1.s(int, java.lang.String):int");
    }

    public static final int t(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int u(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (c() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int v(int r4, java.lang.String r5) {
        /*
            boolean r0 = c4.k.d()
            r1 = 0
            if (r0 == 0) goto L13
            c4.k r0 = c4.a()
            int r2 = c()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2a
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = b(r5, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L31
            int r4 = r1.intValue()
            return r4
        L31:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a1.v(int, java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(j1 r8, ve.c r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a1.w(j1, ve.c):java.lang.Object");
    }

    public static final float x(m0 m0Var, int i) {
        if (i >= 0) {
            l0 l0Var = m0Var.f20524a;
            q qVar = m0Var.f20525b;
            if (l0Var.f20514a.f20477v.length() != 0) {
                int min = Math.min(qVar.d(i), Math.min(qVar.f20548b - 1, qVar.f20551f - 1));
                if (i <= qVar.c(min, false)) {
                    qVar.m(min);
                    ArrayList arrayList = qVar.f20553h;
                    s sVar = (s) arrayList.get(g0.e(min, arrayList));
                    a aVar = sVar.f20561a;
                    int i10 = min - sVar.f20564d;
                    n2.h hVar = (n2.h) aVar.f20437d;
                    return hVar.e(i10) - hVar.g(i10);
                }
                return 0.0f;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static final void y(e1 e1Var, r2.x xVar, r2.q qVar) {
        df.l lVar;
        i d2 = w.d();
        if (d2 != null) {
            lVar = d2.e();
        } else {
            lVar = null;
        }
        df.l lVar2 = lVar;
        i g8 = w.g(d2);
        try {
            g2 d10 = e1Var.d();
            if (d10 == null) {
                return;
            }
            r2.b0 b0Var = e1Var.e;
            if (b0Var == null) {
                return;
            }
            x c10 = e1Var.c();
            if (c10 == null) {
                return;
            }
            z(xVar, e1Var.f17062a, d10.f17113a, c10, b0Var, e1Var.b(), qVar);
        } finally {
            w.j(d2, g8, lVar2);
        }
    }

    public static void z(r2.x xVar, o1 o1Var, m0 m0Var, x xVar2, r2.b0 b0Var, boolean z3, r2.q qVar) {
        c cVar;
        if (z3) {
            int g8 = qVar.g(p0.d(xVar.f24516b));
            if (g8 < m0Var.f20524a.f20514a.f20477v.length()) {
                cVar = m0Var.b(g8);
            } else if (g8 != 0) {
                cVar = m0Var.b(g8 - 1);
            } else {
                cVar = new c(0.0f, 0.0f, 1.0f, (int) (b(o1Var.f17233b, o1Var.f17237g, o1Var.f17238h) & 4294967295L));
            }
            float f10 = cVar.f18764b;
            float f11 = cVar.f18763a;
            long W = xVar2.W((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (W >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (W & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f12 = cVar.f18765c - f11;
            float f13 = cVar.f18766d - f10;
            c a10 = s8.a(floatToRawIntBits, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
            if (kotlin.jvm.internal.a((r2.b0) b0Var.f24465a.f24519b.get(), b0Var)) {
                b0Var.f24466b.d(a10);
            }
        }
    }
}