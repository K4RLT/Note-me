package b8;
import a.a;
import kb.a;
import kb.e;
import kb.f;
import kb.g;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import b8.ca;
import b8.kb;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import f0.d;
import f0.e;
import k1.c0;
import k1.l0;
import kb.b;
import p.c1;
import p.e1;
import p.f1;
import p.h1;
import p.j1;
import p.m1;
import p.x;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.v0;
import r0.y;
import v.i;
import x7.m0;

import java.io.File;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class kb {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2334a = l0.d(4278650383L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f2335b = l0.d(4279702824L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2336c = l0.d(4294551589L);

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f2337d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2338f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f2339g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f2340h;

    static {
        l0.d(4294924910L);
        f2337d = new c0(qe.h(new r(l0.d(4294951494L)), new r(l0.d(4293889280L))), null, 0L, 9187343241974906880L);
        e = l0.d(4287327231L);
        f2338f = 150;
        f2339g = 54;
        f2340h = 80;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0227, code lost:
    
        if (kotlin.jvm.internal.a(r7.O(), java.lang.Integer.valueOf(r8)) == false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final ca r57, final java.io.File r58, final java.util.List r59, final boolean r60, final df.a r61, r r62, final e r63, final int r64, final boolean r65, final java.util.Set r66, m r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.kb.a(ca, java.io.File, java.util.List, boolean, df.a, r, e, int, boolean, java.util.Set, m, int):void");
    }

    public static final void b(final float f10, final int i, final int i10, final long j10, r rVar, m mVar) {
        int i11;
        int i12;
        boolean z3;
        final r rVar2;
        r rVar3;
        r rVar4 = (r) mVar;
        rVar4.c0(-1704226203);
        int i13 = i10 & 4;
        if (i13 != 0) {
            i12 = i | 384;
        } else {
            if (rVar4.f(rVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i12 = i11 | i;
        }
        if ((i12 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar4.R(i12 & 1, z3)) {
            if (i13 != 0) {
                rVar3 = o.f15687a;
            } else {
                rVar3 = rVar;
            }
            r k3 = androidx.compose.foundation.layout.d.k(rVar3, f10);
            Object O = rVar4.O();
            if (O == l.f24285a) {
                O = new fb(j10, 0);
                rVar4.k0(O);
            }
            ya.a(k3, (df.l) O, rVar4, 0);
            rVar2 = rVar3;
        } else {
            rVar4.U();
            rVar2 = rVar;
        }
        q1 t3 = rVar4.t();
        if (t3 != null) {
            t3.f24332d = new df.p(f10, i, i10, j10, rVar2) { // from class: b8.ua

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ float f2846u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ long f2847v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ r f2848w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ int f2849x;

                {
                    this.f2847v = j10;
                    this.f2848w = rVar2;
                    this.f2849x = i10;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(55);
                    b(this.f2846u, L, this.f2849x, this.f2847v, this.f2848w, (m) obj);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void c(final int i, final int i10, final float f10, final long j10, r rVar, m mVar, final int i11) {
        int i12;
        int i13;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-1327569947);
        if (rVar2.d(i)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i14 = i11 | i12;
        if (rVar2.d(i10)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i15 = i14 | i13 | 24576;
        if ((i15 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i15 & 1, z3)) {
            q1 t3 = rVar2.t();
            if (t3 != null) {
                t3.f24332d = new df.p(i, i10, f10, j10, i11) { // from class: b8.bb

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ int f1889u;

                    /* renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ int f1890v;

                    /* renamed from: w, reason: collision with root package name */
                    public final /* synthetic */ float f1891w;

                    /* renamed from: x, reason: collision with root package name */
                    public final /* synthetic */ long f1892x;

                    @Override // df.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int L = y.L(3457);
                        c(this.f1889u, this.f1890v, this.f1891w, this.f1892x, o.f15687a, (m) obj, L);
                        return pe.z.f22715a;
                    }
                };
                return;
            }
            return;
        }
        rVar2.U();
        q1 t10 = rVar2.t();
        if (t10 != null) {
            t10.f24332d = new ea(i, i10, f10, j10, rVar, i11);
        }
    }

    public static final void d(File file, float f10, float f11, df.a aVar, m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        float f12;
        boolean z9;
        boolean z10;
        r rVar = (r) mVar;
        rVar.c0(-128743058);
        if (rVar.h(file)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i | i10;
        if (rVar.h(aVar)) {
            i11 = 2048;
        } else {
            i11 = 1024;
        }
        int i13 = i12 | i11;
        if ((i13 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i13 & 1, z3)) {
            f j10 = j(file, 640, rVar, (i13 & 14) | 48);
            float f13 = m0.f30239a;
            d a10 = e.a(0.05333333f * f11);
            f12 = f10;
            r b10 = androidx.compose.foundation.a.b(wa.a(wa.a(androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.f(o.f15687a, f11), f12), 6, a10, 0L, r.f19513b, 12), a10), l0.d(4294439916L), l0.f19495a);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = a.r(rVar);
            }
            r e8 = androidx.compose.foundation.a.e(b10, (i) O, null, false, null, aVar, 28);
            z1.p0 d2 = x.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(e8, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            if (j10 != null) {
                rVar.a0(-1810769589);
                z10 = false;
                z9 = true;
                ya.wa.b(j10, null, androidx.compose.foundation.layout.d.f506c, z1.n.f31848a, rVar, 25008, 232);
            } else {
                z9 = true;
                z10 = false;
                rVar.a0(-1843947122);
            }
            rVar.p(z10);
            rVar.p(z9);
        } else {
            f12 = f10;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new eb(file, f12, f11, aVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r31, boolean r32, boolean r33, final df.a r34, r r35, m r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.kb.e(java.lang.String, boolean, boolean, df.a, r, m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final float r17, long r18, r r20, float r21, m r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.kb.f(float, long, r, float, m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.lang.String r29, final df.a r30, boolean r31, m r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.kb.g(java.lang.String, df.a, boolean, m, int, int):void");
    }

    public static final a1 h(i iVar, m mVar) {
        iVar.getClass();
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = y.B(Boolean.FALSE);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        Object O2 = rVar.O();
        if (O2 == v0Var) {
            O2 = new ib(iVar, a1Var, null, 0);
            rVar.k0(O2);
        }
        y.f((df.p) O2, iVar, rVar);
        return a1Var;
    }

    public static final r i(r rVar, e eVar, String str, m mVar) {
        rVar.getClass();
        str.getClass();
        if (eVar == null) {
            r rVar2 = (r) mVar;
            rVar2.a0(-894016837);
            rVar2.p(false);
            return rVar;
        }
        r rVar3 = (r) mVar;
        rVar3.a0(-1944697957);
        j1 j1Var = (j1) eVar.f18918u;
        String concat = "universe-cover-".concat(str);
        j1Var.getClass();
        rVar3.a0(799702514);
        boolean f10 = rVar3.f(concat);
        Object O = rVar3.O();
        if (f10 || O == l.f24285a) {
            O = new f1(concat);
            rVar3.k0(O);
        }
        rVar3.p(false);
        x xVar = (x) eVar.f18919v;
        p.k1 k1Var = m1.f22211c;
        e1.f22139a.getClass();
        r a10 = a.a(rVar, new h1((f1) O, xVar.b(), j1Var, c1.f22115b, m1.f22210b, k1Var));
        rVar3.p(false);
        return a10;
    }

    public static final f j(File file, int i, m mVar, int i10) {
        String str;
        long j10;
        String str2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        f fVar = null;
        if (file != null) {
            str = file.getAbsolutePath();
        } else {
            str = null;
        }
        if (file != null) {
            j10 = file.lastModified();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        synchronized (w5.f2926a) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = str + "|" + j11;
            }
            if (str2 != null) {
                str.getClass();
                if (mf.f.n(str, "/thumbs/")) {
                    linkedHashMap = w5.f2927b;
                } else {
                    linkedHashMap = w5.f2928c;
                }
                fVar = (f) linkedHashMap.get(str2);
            }
        }
        Long valueOf = Long.valueOf(j11);
        r rVar = (r) mVar;
        boolean f10 = rVar.f(str);
        if ((((i10 & 112) ^ 48) > 32 && rVar.d(i)) || (i10 & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean e8 = z3 | f10 | rVar.e(j11);
        Object O = rVar.O();
        if (e8 || O == l.f24285a) {
            jb jbVar = new jb(str, i, j11, null);
            rVar.k0(jbVar);
            O = jbVar;
        }
        return (f) y.C(fVar, str, valueOf, (df.p) O, rVar, 0).getValue();
    }
}
