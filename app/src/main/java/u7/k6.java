package u7;
import a2.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import b8.s6;
import b8.z;
import d1.a;
import d1.c;
import d1.h;
import d1.i;
import d1.j;
import d1.o;
import d1.r;
import k1.r;
import k6.a;
import k6.b;
import k6.o;
import k6.p;
import l.a;
import n7.a;
import o0.a;
import o0.h1;
import o0.x1;
import o0.y;
import p.a;
import q.a;
import q.d;
import q1.e;
import q2.s;
import r0.a1;
import r0.f1;
import r0.l;
import r0.m;
import r0.n2;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import r7.e;
import s7.d;
import u7.k6;
import u7.l2;
import u7.m3;
import x2.k;
import x7.j;
import z0.g;
import z0.h;
import z1.p0;
import z7.f;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import com.google.android.filament.Texture;
import java.util.ArrayList;
import java.util.Set;
import wa.b9;
import wa.q9;
import ya.ae;

/* loaded from: classes.dex */
public abstract class k6 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26414a = 36;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26415b = 20;

    public static final void a(final g1 g1Var, final int i, final long j10, final float f10, final df.p pVar, final df.a aVar, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        q1 q1Var;
        df.p pVar2;
        r rVar = (r) mVar;
        rVar.c0(1349432116);
        if (rVar.h(g1Var)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i16 = i10 | i11;
        if (rVar.d(i)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i17 = i16 | i12;
        if (rVar.e(j10)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i18 = i17 | i13;
        if (rVar.c(f10)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i19 = i18 | i14;
        if (rVar.h(pVar)) {
            i15 = 16384;
        } else {
            i15 = 8192;
        }
        int i20 = i19 | i15;
        boolean z9 = true;
        if ((74899 & i20) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i20 & 1, z3)) {
            String a10 = g1Var.a(i);
            if (a10 != null && a10.length() != 0) {
                rVar.a0(-275842035);
                String str = (String) qe.l.y(i, g1Var.f26213b);
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = wa.n7.b(R.string.gallery_stacks_title, rVar);
                }
                rVar.p(false);
                if ((57344 & i20) != 16384) {
                    z9 = false;
                }
                boolean f11 = rVar.f(a10) | z9;
                Object O = rVar.O();
                if (f11 || O == l.f24285a) {
                    O = new androidx.ink.authoring.compose.d(pVar, 19, a10);
                    rVar.k0(O);
                }
                a(str, j10, f10, (df.l) O, rVar, (i20 & 896) | 6 | (i20 & 7168));
            } else {
                aVar.invoke();
                q1Var = rVar.t();
                if (q1Var != null) {
                    final int i21 = 0;
                    pVar2 = new df.p(g1Var, i, j10, f10, pVar, aVar, i10, i21) { // from class: u7.n3
                        public final /* synthetic */ df.a A;

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f26597u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ g1 f26598v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ int f26599w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ long f26600x;

                        /* renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ float f26601y;

                        /* renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ df.p f26602z;

                        {
                            this.f26597u = i21;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f26597u) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int L = y.L(196609);
                                    a(this.f26598v, this.f26599w, this.f26600x, this.f26601y, this.f26602z, this.A, (m) obj, L);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int L2 = y.L(196609);
                                    a(this.f26598v, this.f26599w, this.f26600x, this.f26601y, this.f26602z, this.A, (m) obj, L2);
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    q1Var.f24332d = pVar2;
                }
                return;
            }
        } else {
            rVar.U();
        }
        q1Var = rVar.t();
        if (q1Var != null) {
            final int i22 = 1;
            pVar2 = new df.p(g1Var, i, j10, f10, pVar, aVar, i10, i22) { // from class: u7.n3
                public final /* synthetic */ df.a A;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f26597u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ g1 f26598v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f26599w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ long f26600x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ float f26601y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ df.p f26602z;

                {
                    this.f26597u = i22;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f26597u) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int L = y.L(196609);
                            a(this.f26598v, this.f26599w, this.f26600x, this.f26601y, this.f26602z, this.A, (m) obj, L);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int L2 = y.L(196609);
                            a(this.f26598v, this.f26599w, this.f26600x, this.f26601y, this.f26602z, this.A, (m) obj, L2);
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            q1Var.f24332d = pVar2;
        }
    }

    public static final void b(final boolean z3, final long j10, final float f10, final g1 g1Var, final boolean z9, final float f11, final String str, final Integer num, final boolean z10, final df.a aVar, df.a aVar2, final boolean z11, m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        r rVar;
        int i19;
        String str2;
        String str3;
        float f12;
        boolean z13;
        boolean z14;
        float f13;
        r rVar2;
        boolean z15;
        boolean z16;
        final df.a aVar3 = aVar2;
        i iVar = c.E;
        j jVar = c.f15671v;
        h hVar = c.H;
        r rVar3 = (r) mVar;
        rVar3.c0(304010790);
        if (rVar3.g(z3)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i20 = i | i10;
        char c10 = 256;
        if (rVar3.e(j10)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i21 = i20 | i11;
        if (rVar3.c(f10)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i22 = i21 | i12;
        if (rVar3.h(g1Var)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i23 = i22 | i13;
        if (rVar3.g(z9)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i24 = i23 | i14;
        if (rVar3.c(f11)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i25 = i24 | i15;
        if (rVar3.f(str)) {
            i16 = 8388608;
        } else {
            i16 = 4194304;
        }
        int i26 = i25 | i16;
        if (rVar3.f(num)) {
            i17 = 67108864;
        } else {
            i17 = 33554432;
        }
        int i27 = i26 | i17;
        if (rVar3.g(z10)) {
            i18 = 536870912;
        } else {
            i18 = 268435456;
        }
        int i28 = i27 | i18;
        if (!rVar3.g(z11)) {
            c10 = 128;
        }
        int i29 = '6' | c10;
        if ((i28 & 306783379) == 306783378 && (i29 & 147) == 146) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (rVar3.R(i28 & 1, z12)) {
            int size = g1Var.f26212a.size();
            if (size < 1) {
                i19 = 1;
            } else {
                i19 = size;
            }
            int e = b9.e(ff.a.b(f11), 0, i19 - 1);
            int c11 = g1Var.c(e);
            if (z9) {
                rVar3.a0(-1299566905);
                if (c11 == 0) {
                    str2 = a.p(rVar3, 96626610, R.string.gallery_stack_empty, rVar3, false);
                } else {
                    rVar3.a0(96629285);
                    str2 = wa.a(R.plurals.gallery_stack_books, c11, new Object[]{Integer.valueOf(c11)}, rVar3);
                    rVar3.p(false);
                }
                rVar3.p(false);
            } else {
                rVar3.a0(-1299356137);
                rVar3.p(false);
                str2 = null;
            }
            if (z9) {
                rVar3.a0(-1299217194);
                str3 = (String) qe.l.y(e, g1Var.f26213b);
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.length() == 0) {
                    str3 = wa.n7.b(R.string.gallery_stacks_title, rVar3);
                }
                rVar3.p(false);
            } else {
                rVar3.a0(96640467);
                rVar3.p(false);
                str3 = str;
            }
            o oVar = o.f15687a;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f501a;
            v0 v0Var = l.f24285a;
            String str4 = str3;
            if (z3) {
                rVar3.a0(-1298997869);
                r o10 = androidx.compose.foundation.layout.a.o(bVar.a(oVar, jVar), 0.0f, f10, 0.0f, 0.0f, 13);
                x.r a10 = x.a(x.h.f29962b, hVar, rVar3, 48);
                String str5 = str2;
                int hashCode = Long.hashCode(rVar3.T);
                g l10 = rVar3.l();
                r c12 = a.c(o10, rVar3);
                h.f1471d.getClass();
                b0 b0Var = g.f1462b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var);
                } else {
                    rVar3.n0();
                }
                f fVar = g.e;
                y.I(fVar, a10, rVar3);
                f fVar2 = g.f1464d;
                y.I(fVar2, l10, rVar3);
                f fVar3 = g.f1465f;
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                    a.t(hashCode, rVar3, hashCode, fVar3);
                }
                f fVar4 = g.f1463c;
                y.I(fVar4, c12, rVar3);
                long j11 = r.f19515d;
                s sVar = s.B;
                if (z11) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                r a11 = wa.g7.a(oVar, f13);
                Object O = rVar3.O();
                if (O == v0Var) {
                    O = a.r(rVar3);
                }
                v.i iVar2 = (v.i) O;
                Object O2 = rVar3.O();
                if (O2 == v0Var) {
                    O2 = new z(11, aVar3);
                    rVar3.k0(O2);
                }
                x1.b(str4, androidx.compose.foundation.a.e(a11, iVar2, null, false, null, (df.a) O2, 28), j11, j10, null, sVar, null, 0L, new k(3), 0L, 0, false, 2, 0, null, rVar3, ((i28 << 3) & 7168) | 196992, 3072, 122320);
                if (str5 == null && num == null) {
                    rVar3.a0(1610041259);
                    z15 = false;
                    rVar3.p(false);
                    rVar2 = rVar3;
                    z16 = true;
                } else {
                    rVar3.a0(2048028603);
                    x.p0 a12 = x.a(x.h.i(4), iVar, rVar3, 54);
                    int hashCode2 = Long.hashCode(rVar3.T);
                    g l11 = rVar3.l();
                    r c13 = a.c(oVar, rVar3);
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(b0Var);
                    } else {
                        rVar3.n0();
                    }
                    y.I(fVar, a12, rVar3);
                    y.I(fVar2, l11, rVar3);
                    if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar3, hashCode2, fVar3);
                    }
                    y.I(fVar4, c13, rVar3);
                    if (str5 != null) {
                        rVar3.a0(-1091004807);
                        x1.b(str5, null, r.c(j11, 0.7f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 3456, 0, 131058);
                        z15 = false;
                        rVar3.p(false);
                        rVar2 = rVar3;
                    } else {
                        if (num != null) {
                            rVar3.a0(-1090716910);
                            x1.b(wa.a(R.plurals.notebook_pages, num.intValue(), new Object[]{num}, rVar3), null, r.c(j11, 0.7f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 3456, 0, 131058);
                            h1.a(aVar, androidx.compose.foundation.layout.d.k(oVar, 18), false, null, h.d(2114479831, new d(1, z10), rVar3), rVar3, 196662, 28);
                            rVar2 = rVar3;
                            z15 = false;
                        } else {
                            rVar2 = rVar3;
                            z15 = false;
                            rVar2.a0(-1529168820);
                        }
                        rVar2.p(z15);
                    }
                    z16 = true;
                    rVar2.p(true);
                    rVar2.p(z15);
                }
                rVar2.p(z16);
                rVar2.p(z15);
                aVar3 = aVar2;
                rVar = rVar2;
            } else {
                String str6 = str2;
                rVar3.a0(-1296652006);
                r o11 = androidx.compose.foundation.layout.a.o(bVar.a(oVar, jVar), 0.0f, f10, 0.0f, 0.0f, 13);
                x.r a13 = x.a(x.h.f29962b, hVar, rVar3, 48);
                int hashCode3 = Long.hashCode(rVar3.T);
                g l12 = rVar3.l();
                r c14 = a.c(o11, rVar3);
                h.f1471d.getClass();
                b0 b0Var2 = g.f1462b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var2);
                } else {
                    rVar3.n0();
                }
                f fVar5 = g.e;
                y.I(fVar5, a13, rVar3);
                f fVar6 = g.f1464d;
                y.I(fVar6, l12, rVar3);
                f fVar7 = g.f1465f;
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar3, hashCode3, fVar7);
                }
                f fVar8 = g.f1463c;
                y.I(fVar8, c14, rVar3);
                long j12 = r.f19515d;
                s sVar2 = s.B;
                if (z11) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                r a14 = wa.g7.a(oVar, f12);
                Object O3 = rVar3.O();
                if (O3 == v0Var) {
                    O3 = a.r(rVar3);
                }
                v.i iVar3 = (v.i) O3;
                Object O4 = rVar3.O();
                if (O4 == v0Var) {
                    aVar3 = aVar2;
                    O4 = new z(12, aVar3);
                    rVar3.k0(O4);
                } else {
                    aVar3 = aVar2;
                }
                x1.b(str4, androidx.compose.foundation.a.e(a14, iVar3, null, false, null, (df.a) O4, 28), j12, j10, null, sVar2, null, 0L, new k(3), 0L, 0, false, 2, 0, null, rVar3, ((i28 << 3) & 7168) | 196992, 3072, 122320);
                rVar = rVar3;
                if (str6 != null) {
                    rVar.a0(1242314114);
                    x1.b(str6, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 4, 0.0f, 0.0f, 13), r.c(j12, 0.7f), ae.e(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3504, 0, 131056);
                    z13 = false;
                    rVar.p(false);
                    z14 = true;
                } else {
                    if (num != null) {
                        rVar.a0(1242620673);
                        float f14 = 4;
                        x.e i30 = x.h.i(f14);
                        r o12 = androidx.compose.foundation.layout.a.o(oVar, 0.0f, f14, 0.0f, 0.0f, 13);
                        x.p0 a15 = x.a(i30, iVar, rVar, 54);
                        int hashCode4 = Long.hashCode(rVar.T);
                        g l13 = rVar.l();
                        r c15 = a.c(o12, rVar);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(b0Var2);
                        } else {
                            rVar.n0();
                        }
                        y.I(fVar5, a15, rVar);
                        y.I(fVar6, l13, rVar);
                        if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode4))) {
                            a.t(hashCode4, rVar, hashCode4, fVar7);
                        }
                        y.I(fVar8, c15, rVar);
                        x1.b(wa.a(R.plurals.notebook_pages, num.intValue(), new Object[]{num}, rVar), null, r.c(j12, 0.7f), ae.e(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131058);
                        h1.a(aVar, androidx.compose.foundation.layout.d.k(oVar, 20), false, null, h.d(-1550173051, new d(2, z10), rVar), rVar, 196662, 28);
                        z14 = true;
                        rVar.p(true);
                        z13 = false;
                    } else {
                        z13 = false;
                        z14 = true;
                        rVar.a0(802033762);
                    }
                    rVar.p(z13);
                }
                rVar.p(z14);
                rVar.p(z13);
            }
        } else {
            rVar = rVar3;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p(z3, j10, f10, g1Var, z9, f11, str, num, z10, aVar, aVar3, z11, i) { // from class: u7.o3
                public final /* synthetic */ String A;
                public final /* synthetic */ Integer B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ df.a D;
                public final /* synthetic */ df.a E;
                public final /* synthetic */ boolean F;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f26666u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ long f26667v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f26668w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ g1 f26669x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ boolean f26670y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f26671z;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(7);
                    b(this.f26666u, this.f26667v, this.f26668w, this.f26669x, this.f26670y, this.f26671z, this.A, this.B, this.C, this.D, this.E, this.F, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:1050:0x34f8, code lost:
    
        if (r12 != null) goto L1337;
     */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x32fb  */
    /* JADX WARN: Removed duplicated region for block: B:1021:0x33c3  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x347a  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x34d1  */
    /* JADX WARN: Removed duplicated region for block: B:1056:0x350c  */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x3544 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1062:0x3558  */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x3589 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1069:0x35a4  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x35cc  */
    /* JADX WARN: Removed duplicated region for block: B:1075:0x35f1  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x363d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1086:0x34ae  */
    /* JADX WARN: Removed duplicated region for block: B:1091:0x3435 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1102:0x33af  */
    /* JADX WARN: Removed duplicated region for block: B:1107:0x32e6  */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x31fa  */
    /* JADX WARN: Removed duplicated region for block: B:1115:0x3189  */
    /* JADX WARN: Removed duplicated region for block: B:1116:0x2fa8  */
    /* JADX WARN: Removed duplicated region for block: B:1120:0x2ebe  */
    /* JADX WARN: Removed duplicated region for block: B:1139:0x2e5f  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x29bf  */
    /* JADX WARN: Removed duplicated region for block: B:918:0x2e9c  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x2f8f  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x2f9d  */
    /* JADX WARN: Removed duplicated region for block: B:961:0x2fce  */
    /* JADX WARN: Removed duplicated region for block: B:982:0x31ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:985:0x31da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:988:0x31ed  */
    /* JADX WARN: Removed duplicated region for block: B:991:0x322b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(m3 r155, df.a r156, final df.a r157, m r158, final int r159) {
        /*
            Method dump skipped, instructions count: 13955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.k6.c(m3, df.a, df.a, m, int):void");
    }

    public static final int d(f1 f1Var) {
        return f1Var.h();
    }

    public static final boolean e(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean f(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final float g(n2 n2Var) {
        return ((Number) n2Var.getValue()).floatValue();
    }

    public static final String h(a1 a1Var) {
        return (String) a1Var.getValue();
    }

    public static final Float i(a1 a1Var) {
        return (Float) a1Var.getValue();
    }

    public static final f j(a1 a1Var) {
        return (f) a1Var.getValue();
    }

    public static final boolean k(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final String l(a1 a1Var) {
        return (String) a1Var.getValue();
    }

    public static final boolean m(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final int n(f1 f1Var) {
        return f1Var.h();
    }

    public static final void o(final boolean z3, final float f10, final r rVar, final df.a aVar, m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        e eVar;
        int i15;
        r rVar2 = (r) mVar;
        rVar2.c0(-1417208641);
        if (rVar2.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i | i10;
        if (rVar2.c(f10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar2.f(rVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar2.h(aVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar2.g(false)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i20 = i19 | i14;
        if ((i20 & 9363) != 9362) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i20 & 1, z9)) {
            r k3 = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.a.b(rVar, r.c(r.f19513b, 0.25f), f0.e.a(12)), f10);
            Object O = rVar2.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = a.r(rVar2);
            }
            v.i iVar = (v.i) O;
            if ((i20 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O2 = rVar2.O();
            if (z10 || O2 == v0Var) {
                O2 = new z(13, aVar);
                rVar2.k0(O2);
            }
            r e = androidx.compose.foundation.a.e(k3, iVar, null, false, null, (df.a) O2, 28);
            p0 d2 = x.m.d(c.f15674y, false);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(e, rVar2);
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
            if (z3) {
                eVar = (e) f2.f26171d.getValue();
            } else {
                eVar = (e) f2.f26169b.getValue();
            }
            e eVar2 = eVar;
            if (z3) {
                i15 = R.string.gallery_view_carousel;
            } else {
                i15 = R.string.gallery_view_stacks;
            }
            y.b(eVar2, wa.n7.b(i15, rVar2), androidx.compose.foundation.layout.d.k(o.f15687a, 0.55f * f10), r.f19515d, rVar2, 3072, 0);
            rVar2.a0(1292165469);
            rVar2.p(false);
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p(z3, f10, rVar, aVar, i) { // from class: u7.q4

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f26751u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ float f26752v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ r f26753w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.a f26754x;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(1);
                    o(this.f26751u, this.f26752v, this.f26753w, this.f26754x, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void p(final boolean z3, final float f10, final float f11, final float f12, final float f13, final boolean z9, final df.a aVar, final df.a aVar2, m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        r rVar;
        int i18;
        boolean z11;
        o oVar;
        f fVar;
        final a1 a1Var;
        final a1 a1Var2;
        f fVar2;
        f fVar3;
        final a1 a1Var3;
        long c10;
        boolean z12;
        a1 a1Var4;
        boolean z13;
        boolean z14;
        r rVar2 = (r) mVar;
        rVar2.c0(-1382235491);
        if (rVar2.g(z3)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i19 = i | i10;
        if (rVar2.c(f10)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i20 = i19 | i11;
        if (rVar2.c(f11)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i21 = i20 | i12;
        if (rVar2.c(f12)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i22 = i21 | i13;
        if (rVar2.c(f13)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i23 = i22 | i14;
        if (rVar2.g(z9)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i24 = i23 | i15;
        if (rVar2.h(aVar)) {
            i16 = 8388608;
        } else {
            i16 = 4194304;
        }
        int i25 = i24 | i16;
        if (rVar2.h(aVar2)) {
            i17 = 67108864;
        } else {
            i17 = 33554432;
        }
        int i26 = i25 | i17;
        if ((38347923 & i26) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.R(i26 & 1, z10)) {
            Object O = rVar2.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = y.B(Boolean.FALSE);
                rVar2.k0(O);
            }
            a1 a1Var5 = (a1) O;
            Object O2 = rVar2.O();
            if (O2 == obj) {
                O2 = y.B(Boolean.FALSE);
                rVar2.k0(O2);
            }
            a1 a1Var6 = (a1) O2;
            Object O3 = rVar2.O();
            if (O3 == obj) {
                O3 = y.B(0L);
                rVar2.k0(O3);
            }
            a1 a1Var7 = (a1) O3;
            final Context context = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
            final String b10 = wa.n7.b(R.string.gallery_stack_delete_last, rVar2);
            j jVar = c.B;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f501a;
            o oVar2 = o.f15687a;
            float f14 = 16;
            r b11 = androidx.compose.foundation.a.b(wa.g7.a(androidx.compose.foundation.layout.a.o(bVar.a(oVar2, jVar), 0.0f, 0.0f, 0.0f, f12, 7), f13), r.c(r.f19513b, 0.25f), f0.e.a(f14));
            if (z3) {
                f14 = 12;
            }
            if (z3) {
                i18 = 4;
            } else {
                i18 = 6;
            }
            r l10 = androidx.compose.foundation.layout.a.l(b11, f14, i18);
            x.p0 a10 = x.a(x.h.i(f11), c.E, rVar2, 48);
            int hashCode = Long.hashCode(rVar2.T);
            g l11 = rVar2.l();
            r c11 = a.c(l10, rVar2);
            h.f1471d.getClass();
            df.a aVar3 = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(aVar3);
            } else {
                rVar2.n0();
            }
            f fVar4 = g.e;
            y.I(fVar4, a10, rVar2);
            f fVar5 = g.f1464d;
            y.I(fVar5, l11, rVar2);
            f fVar6 = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar6);
            }
            f fVar7 = g.f1463c;
            y.I(fVar7, c11, rVar2);
            r k3 = androidx.compose.foundation.layout.d.k(oVar2, f10);
            Object O4 = rVar2.O();
            if (O4 == obj) {
                O4 = a.r(rVar2);
            }
            v.i iVar = (v.i) O4;
            if ((i26 & 3670016) == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h3 = z11 | rVar2.h(context) | rVar2.f(b10);
            Object O5 = rVar2.O();
            if (!h3 && O5 != obj) {
                oVar = oVar2;
                fVar2 = fVar5;
                fVar = fVar6;
                fVar3 = fVar4;
                a1Var = a1Var5;
                a1Var3 = a1Var6;
                a1Var2 = a1Var7;
            } else {
                oVar = oVar2;
                fVar = fVar6;
                a1Var = a1Var5;
                a1Var2 = a1Var7;
                fVar2 = fVar5;
                fVar3 = fVar4;
                a1Var3 = a1Var6;
                Object obj2 = new df.a() { // from class: u7.n4
                    @Override // df.a
                    public final Object invoke() {
                        if (!z9) {
                            Toast.makeText(context, b10, 0).show();
                        } else if (System.currentTimeMillis() - ((Number) a1Var2.getValue()).longValue() > 200) {
                            a1 a1Var8 = a1Var;
                            boolean booleanValue = ((Boolean) a1Var8.getValue()).booleanValue();
                            a1 a1Var9 = a1Var3;
                            if (!booleanValue && !((Boolean) a1Var9.getValue()).booleanValue()) {
                                a1Var8.setValue(Boolean.TRUE);
                            } else {
                                Boolean bool = Boolean.FALSE;
                                a1Var8.setValue(bool);
                                a1Var9.setValue(bool);
                            }
                        }
                        return pe.z.f22715a;
                    }
                };
                rVar2.k0(obj2);
                O5 = obj2;
            }
            r e = androidx.compose.foundation.a.e(k3, iVar, null, false, null, (df.a) O5, 28);
            j jVar2 = c.f15674y;
            p0 d2 = x.m.d(jVar2, false);
            int hashCode2 = Long.hashCode(rVar2.T);
            g l12 = rVar2.l();
            r c12 = a.c(e, rVar2);
            rVar2.e0();
            a1 a1Var8 = a1Var2;
            if (rVar2.S) {
                rVar2.k(aVar3);
            } else {
                rVar2.n0();
            }
            y.I(fVar3, d2, rVar2);
            y.I(fVar2, l12, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar2, hashCode2, fVar);
            }
            y.I(fVar7, c12, rVar2);
            e a11 = q9.a();
            String b12 = wa.n7.b(R.string.gallery_stack_delete, rVar2);
            if (z9) {
                c10 = r.f19515d;
            } else {
                c10 = r.c(r.f19515d, 0.3f);
            }
            long j10 = c10;
            a1 a1Var9 = a1Var3;
            a1 a1Var10 = a1Var;
            f fVar8 = fVar;
            f fVar9 = fVar2;
            y.b(a11, b12, null, j10, rVar2, 0, 4);
            if (((Boolean) a1Var10.getValue()).booleanValue() && !((Boolean) a1Var9.getValue()).booleanValue() && z9) {
                z12 = true;
            } else {
                z12 = false;
            }
            String b13 = wa.n7.b(R.string.delete, rVar2);
            Object O6 = rVar2.O();
            if (O6 == obj) {
                a1Var4 = a1Var9;
                O6 = new s6(13, a1Var10, a1Var4);
                rVar2.k0(O6);
            } else {
                a1Var4 = a1Var9;
            }
            df.a aVar4 = (df.a) O6;
            Object O7 = rVar2.O();
            if (O7 == obj) {
                O7 = new s6(14, a1Var8, a1Var10);
                rVar2.k0(O7);
            }
            j.c(z12, b13, aVar4, (df.a) O7, rVar2, 3456);
            if (((Boolean) a1Var4.getValue()).booleanValue() && z9) {
                z13 = true;
            } else {
                z13 = false;
            }
            String b14 = wa.n7.b(R.string.confirm_sure, rVar2);
            if ((i26 & 234881024) == 67108864) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object O8 = rVar2.O();
            if (z14 || O8 == obj) {
                O8 = new o4(aVar2, a1Var4, 0);
                rVar2.k0(O8);
            }
            df.a aVar5 = (df.a) O8;
            Object O9 = rVar2.O();
            if (O9 == obj) {
                O9 = new s6(15, a1Var8, a1Var4);
                rVar2.k0(O9);
            }
            j.c(z13, b14, aVar5, (df.a) O9, rVar2, 3072);
            rVar2.p(true);
            o oVar3 = oVar;
            r k4 = androidx.compose.foundation.layout.d.k(oVar3, f10);
            Object O10 = rVar2.O();
            if (O10 == obj) {
                O10 = a.r(rVar2);
            }
            r e8 = androidx.compose.foundation.a.e(k4, (v.i) O10, null, false, null, aVar, 28);
            p0 d10 = x.m.d(jVar2, false);
            int hashCode3 = Long.hashCode(rVar2.T);
            g l13 = rVar2.l();
            r c13 = a.c(e8, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(aVar3);
            } else {
                rVar2.n0();
            }
            y.I(fVar3, d10, rVar2);
            y.I(fVar9, l13, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode3))) {
                a.t(hashCode3, rVar2, hashCode3, fVar8);
            }
            y.I(fVar7, c13, rVar2);
            y.b((e) f2.f26170c.getValue(), wa.n7.b(R.string.gallery_stack_new, rVar2), androidx.compose.foundation.layout.d.k(oVar3, 0.55f * f10), r.f19515d, rVar2, 3072, 0);
            rVar = rVar2;
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p(z3, f10, f11, f12, f13, z9, aVar, aVar2, i) { // from class: u7.p4
                public final /* synthetic */ df.a A;
                public final /* synthetic */ df.a B;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f26718u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ float f26719v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f26720w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f26721x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ float f26722y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ boolean f26723z;

                @Override // df.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int L = y.L(7);
                    p(this.f26718u, this.f26719v, this.f26720w, this.f26721x, this.f26722y, this.f26723z, this.A, this.B, (m) obj3, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void q(boolean z3, df.a aVar, m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        q1 t3;
        r3 r3Var;
        r rVar = (r) mVar;
        rVar.c0(1314277324);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i13 & 1, z9)) {
            if (!z3) {
                t3 = rVar.t();
                if (t3 != null) {
                    r3Var = new r3(z3, aVar, i, 0);
                    t3.f24332d = r3Var;
                }
                return;
            }
            String b10 = wa.n7.b(R.string.gallery_view_stacks, rVar);
            boolean f10 = rVar.f(b10);
            Object O = rVar.O();
            if (f10 || O == l.f24285a) {
                O = new h6(0, b10, null);
                rVar.k0(O);
            }
            y.f((df.p) O, b10, rVar);
            e.b(true, b10, aVar, rVar, ((i13 << 3) & 896) | 6);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            r3Var = new r3(z3, aVar, i, 1);
            t3.f24332d = r3Var;
        }
    }

    public static final void r(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    public static final int s(f1 f1Var) {
        return f1Var.h();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(4:17|18|19|(1:21)(1:22)))(5:23|24|25|(3:31|(2:33|(1:35)(3:36|19|(0)))|22)(1:29)|21))(4:37|(1:39)(1:42)|(5:41|25|(1:27)|31|(0))|22)))|44|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (pf.b0.j(16, r0) == r8) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[Catch: CancellationException -> 0x00ec, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00ec, blocks: (B:12:0x002d, B:18:0x003e, B:19:0x00ca, B:33:0x00a6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0091 -> B:24:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(l2 r11, d r12, int r13, ve.c r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.k6.t(l2, d, int, ve.c):java.lang.Object");
    }

    public static final boolean u(d dVar, d dVar2) {
        if (((Number) dVar.e.getValue()).floatValue() >= 0.999f || ((Number) dVar2.e.getValue()).floatValue() > 0.5f) {
            if (!dVar.f() && !dVar2.f() && ((Number) dVar2.e()).floatValue() <= 0.02f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void v(l2 l2Var, String str, int i) {
        Texture texture;
        if (str != null) {
            Set keySet = l2Var.N.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (kotlin.jvm.internal.a(((pe.j) obj).f22693u, str) && (((Number) r3.f22694v).intValue() - 2) / 2 >= i) {
                    arrayList.add(obj);
                }
            }
            for (pe.j jVar : qe.l.P(arrayList)) {
                l2Var.P.remove(jVar);
                pe.j jVar2 = (pe.j) l2Var.N.remove(jVar);
                if (jVar2 != null && (texture = (Texture) jVar2.f22694v) != null) {
                    l2Var.D.add(texture);
                }
                l2Var.O.remove(jVar);
            }
        }
    }
}
