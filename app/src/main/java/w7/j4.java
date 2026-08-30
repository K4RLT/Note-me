package w7;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c.d;
import c.k;
import c.m;
import d1.c;
import d1.i;
import d1.o;
import d1.r;
import eb.w;
import j.e;
import j.v;
import j4.b;
import k1.l0;
import k1.s;
import k1.t;
import m2.f0;
import p.p0;
import p.q0;
import p.x;
import r0.a1;
import r0.l;
import r0.n2;
import r0.q1;
import r0.v0;
import r0.y;
import v1.d0;
import x.k0;
import x.p;
import x.q;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import com.daren.scraply.R;
import java.util.Random;
import ya.we;

/* loaded from: classes.dex */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28501a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final long f28502b = r.c(r.f19513b, 0.55f);

    public static final void a(final p pVar, final e3 e3Var, final boolean z3, final a1 a1Var, final a1 a1Var2, final a1 a1Var3, final a1 a1Var4, final b1.v vVar, final b1.v vVar2, final a1 a1Var5, final o0 o0Var, final df.a aVar, final df.l lVar, final boolean z9, final boolean z10, final a1 a1Var6, final a1 a1Var7, final df.a aVar2, m mVar, final int i) {
        int i10;
        r rVar;
        pVar.getClass();
        a1Var.getClass();
        a1Var3.getClass();
        a1Var4.getClass();
        vVar.getClass();
        vVar2.getClass();
        a1Var5.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-2124956041);
        if ((i & 6) == 0) {
            i10 = (rVar2.f(pVar) ? 4 : 2) | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            i10 |= rVar2.f(e3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i10 |= rVar2.g(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i10 |= rVar2.f(a1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i10 |= rVar2.f(a1Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i10 |= rVar2.f(a1Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i10 |= rVar2.f(a1Var4) ? 1048576 : 524288;
        }
        if ((i & 805306368) == 0) {
            i10 |= rVar2.f(a1Var5) ? 536870912 : 268435456;
        }
        if (rVar2.R(i10 & 1, ((i10 & 269034643) == 269034642 && (4793489 & (((((0 | (rVar2.h(aVar) ? ' ' : (char) 16)) | (rVar2.h(lVar) ? 256 : 128)) | (rVar2.g(z9) ? (char) 2048 : (char) 1024)) | (rVar2.g(z10) ? (char) 16384 : (char) 8192)) | (rVar2.h(aVar2) ? 8388608 : 4194304))) == 4793488) ? false : true)) {
            final b1.v vVar3 = e3Var.f28125a;
            rVar = rVar2;
            y.a(c2.p1.f3606h.a(n4.q1(n4.r1(rVar2), rVar2)), h.d(1332826551, new df.p() { // from class: w7.r3
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z11;
                    m mVar2 = (m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r rVar3 = (r) mVar2;
                    if (rVar3.R(intValue & 1, z11)) {
                        final a1 a1Var8 = a1Var;
                        boolean booleanValue = ((Boolean) a1Var8.getValue()).booleanValue();
                        r a10 = p.this.a(o.f15687a, c.B);
                        q.r0 r8 = q.e.r(0.75f, 600.0f, null, 4);
                        Object O = rVar3.O();
                        v0 v0Var = l.f24285a;
                        if (O == v0Var) {
                            O = new f0(13);
                            rVar3.k0(O);
                        }
                        p0 a11 = androidx.compose.animation.k((df.l) O, r8).a(androidx.compose.animation.d(q.e.r(0.75f, 600.0f, null, 4), 2));
                        q.r0 r10 = q.e.r(1.0f, 800.0f, null, 4);
                        Object O2 = rVar3.O();
                        if (O2 == v0Var) {
                            O2 = new f0(13);
                            rVar3.k0(O2);
                        }
                        q0 a12 = androidx.compose.animation.m((df.l) O2, r10).a(androidx.compose.animation.c.e(q.e.r(1.0f, 800.0f, null, 4), 2));
                        final e3 e3Var2 = e3Var;
                        final e3 e3Var3 = e3Var;
                        final e3 e3Var4 = e3Var;
                        final e3 e3Var5 = e3Var;
                        final e3 e3Var6 = e3Var;
                        final e3 e3Var7 = e3Var;
                        final e3 e3Var8 = e3Var;
                        final e3 e3Var9 = e3Var;
                        final e3 e3Var10 = e3Var;
                        final e3 e3Var11 = e3Var;
                        final e3 e3Var12 = e3Var;
                        final a1 a1Var9 = a1Var2;
                        final a1 a1Var10 = a1Var3;
                        final a1 a1Var11 = a1Var4;
                        final b1.v vVar4 = vVar3;
                        final a1 a1Var12 = a1Var6;
                        final e3 e3Var13 = e3Var;
                        final e3 e3Var14 = e3Var;
                        final boolean z12 = z3;
                        final a1 a1Var13 = a1Var7;
                        final df.a aVar3 = aVar;
                        final df.a aVar4 = aVar2;
                        final e3 e3Var15 = e3Var;
                        final boolean z13 = z9;
                        final boolean z14 = z10;
                        final df.l lVar2 = lVar;
                        final e3 e3Var16 = e3Var;
                        final e3 e3Var17 = e3Var;
                        final e3 e3Var18 = e3Var;
                        ya.c(booleanValue, a10, a11, a12, null, h.d(-1497908257, new df.q() { // from class: w7.t3
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v205, types: [s, java.lang.Object, t] */
                            @Override // df.q
                            public final Object b(Object obj3, Object obj4, Object obj5) {
                                boolean z15;
                                boolean z16;
                                boolean z17;
                                boolean z18;
                                boolean z19;
                                int i11;
                                Object obj6;
                                float f10;
                                float f11;
                                float f12;
                                String str;
                                boolean z20;
                                float f13;
                                final e3 e3Var19;
                                final e3 e3Var20;
                                final e3 e3Var21;
                                final boolean z21;
                                float f14;
                                float f15;
                                float f16;
                                a1 a1Var14;
                                float f17;
                                float f18;
                                float f19;
                                float f20;
                                final a1 a1Var15;
                                final n2 n2Var;
                                final boolean z22;
                                float f21;
                                float f22;
                                float f23;
                                final boolean z23;
                                float f24;
                                float f25;
                                float f26;
                                final boolean z24;
                                float f27;
                                float f28;
                                float f29;
                                final boolean z25;
                                float f30;
                                float f31;
                                float f32;
                                float f33;
                                float f34;
                                float f35;
                                float f36;
                                float f37;
                                float f38;
                                float f39;
                                float f40;
                                float f41;
                                boolean z26;
                                float f42;
                                float f43;
                                float f44;
                                final boolean z27;
                                float f45;
                                float f46;
                                float f47;
                                float f48;
                                float f49;
                                float f50;
                                e3 e3Var22;
                                float f51;
                                float f52;
                                float f53;
                                ((Integer) obj5).getClass();
                                ((x) obj3).getClass();
                                r rVar4 = (r) ((m) obj4);
                                Object O3 = rVar4.O();
                                Object obj7 = l.f24285a;
                                if (O3 == obj7) {
                                    Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                                    createBitmap.getClass();
                                    int[] iArr = new int[65536];
                                    Random random = new Random();
                                    for (int i12 = 0; i12 < 65536; i12++) {
                                        int nextInt = random.nextInt(256);
                                        iArr[i12] = Color.argb(16, nextInt, nextInt, nextInt);
                                    }
                                    createBitmap.setPixels(iArr, 0, 256, 0, 0, 256, 256);
                                    O3 = new f(createBitmap);
                                    rVar4.k0(O3);
                                }
                                f fVar = (f) O3;
                                final e3 e3Var23 = e3Var3;
                                boolean j10 = e3Var23.j();
                                e3 e3Var24 = e3Var4;
                                e3 e3Var25 = e3Var5;
                                final e3 e3Var26 = e3Var6;
                                if (j10 && !e3Var24.a() && !e3Var25.h() && !e3Var26.k()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                boolean j11 = e3Var23.j();
                                final e3 e3Var27 = e3Var7;
                                final e3 e3Var28 = e3Var8;
                                final e3 e3Var29 = e3Var9;
                                final e3 e3Var30 = e3Var10;
                                final e3 e3Var31 = e3Var11;
                                if (!j11 && !e3Var27.c() && !e3Var24.a() && !e3Var25.h() && !e3Var26.k() && !e3Var28.i() && !e3Var29.b() && !e3Var30.n() && !e3Var31.e()) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (e3Var27.c() && !e3Var24.a() && !e3Var25.h() && !e3Var26.k()) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (e3Var29.b() && !e3Var24.a() && !e3Var25.h() && !e3Var26.k() && !e3Var28.i()) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (!z15 && !z16 && !z17 && !z18) {
                                    z19 = false;
                                } else {
                                    z19 = true;
                                }
                                o oVar = o.f15687a;
                                r o10 = androidx.compose.foundation.layout.d.o(androidx.compose.foundation.layout.d(oVar, 1.0f), Float.NaN, 720);
                                final e3 e3Var32 = e3.this;
                                boolean f54 = rVar4.f(e3Var32);
                                Object O4 = rVar4.O();
                                int i13 = 8;
                                if (f54 || O4 == obj7) {
                                    O4 = new j3(e3Var32, i13);
                                    rVar4.k0(O4);
                                }
                                boolean z28 = z19;
                                r a13 = androidx.compose.foundation.a(androidx.compose.ui.layout.a.d(o10, (df.l) O4), w.l(new pe.j[]{new pe.j(Float.valueOf(0.0f), new r(l0.d(4281612609L))), new pe.j(Float.valueOf(0.5f), new r(l0.d(4280493870L))), new pe.j(Float.valueOf(1.0f), new r(l0.d(4279704095L)))}, 0.0f, 0.0f, 14), 6);
                                boolean h3 = rVar4.h(fVar);
                                Object O5 = rVar4.O();
                                if (h3 || O5 == obj7) {
                                    O5 = new b8.j(fVar, 1);
                                    rVar4.k0(O5);
                                }
                                r c10 = androidx.compose.ui.draw.a.c(a13, (df.l) O5);
                                a1 a1Var16 = a1Var8;
                                e3 e3Var33 = e3Var12;
                                final a1 a1Var17 = a1Var9;
                                a1 a1Var18 = a1Var10;
                                final a1 a1Var19 = a1Var11;
                                b4 b4Var = new b4(a1Var16, e3Var33, a1Var17, a1Var18, a1Var19);
                                pe.z zVar = pe.z.f22715a;
                                r b10 = d0.b(c10, zVar, b4Var);
                                Object O6 = rVar4.O();
                                if (O6 == obj7) {
                                    O6 = a.r(rVar4);
                                }
                                v.i iVar = (v.i) O6;
                                Object O7 = rVar4.O();
                                if (O7 == obj7) {
                                    O7 = new u7.c2(21);
                                    rVar4.k0(O7);
                                }
                                r e = androidx.compose.foundation.a.e(b10, iVar, null, false, null, (df.a) O7, 28);
                                r a14 = q.a(h.f29962b, c.H, rVar4, 48);
                                int hashCode = Long.hashCode(rVar4.T);
                                g l10 = rVar4.l();
                                r c11 = a.c(e, rVar4);
                                h.f1471d.getClass();
                                b0 b0Var = g.f1462b;
                                rVar4.e0();
                                if (rVar4.S) {
                                    rVar4.k(b0Var);
                                } else {
                                    rVar4.n0();
                                }
                                y.I(g.e, a14, rVar4);
                                y.I(g.f1464d, l10, rVar4);
                                f fVar2 = g.f1465f;
                                if (rVar4.S || !kotlin.jvm.internal.l.a(rVar4.O(), Integer.valueOf(hashCode))) {
                                    a.t(hashCode, rVar4, hashCode, fVar2);
                                }
                                y.I(g.f1463c, c11, rVar4);
                                final e3 e3Var34 = e3Var13;
                                long l11 = e3Var34.l();
                                p pVar2 = new p(e3Var34, e3Var24, e3Var30, e3Var31, 1);
                                o1 o1Var = new o1(e3Var34, 1);
                                boolean f55 = rVar4.f(e3Var32);
                                Object O8 = rVar4.O();
                                int i14 = 9;
                                if (f55 || O8 == obj7) {
                                    O8 = new j3(e3Var32, i14);
                                    rVar4.k0(O8);
                                }
                                df.l lVar3 = (df.l) O8;
                                boolean f56 = rVar4.f(e3Var32);
                                Object O9 = rVar4.O();
                                if (f56 || O9 == obj7) {
                                    O9 = new k0(e3Var32, 3);
                                    rVar4.k0(O9);
                                }
                                df.a aVar5 = (df.a) O9;
                                boolean booleanValue2 = ((Boolean) e3Var32.K.getValue()).booleanValue();
                                r rVar5 = (r) e3Var32.L.getValue();
                                boolean f57 = rVar4.f(e3Var32);
                                Object O10 = rVar4.O();
                                if (f57 || O10 == obj7) {
                                    O10 = new k0(e3Var32, 4);
                                    rVar4.k0(O10);
                                }
                                n4.b(vVar4, l11, pVar2, o1Var, z28, lVar3, aVar5, booleanValue2, rVar5, (df.a) O10, rVar4, 0);
                                te.c cVar = null;
                                q.r0 r11 = q.e.r(0.5f, 1500.0f, null, 4);
                                Object O11 = rVar4.O();
                                int i15 = 2;
                                if (O11 == obj7) {
                                    float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
                                    fArr[0] = 1.0f;
                                    fArr[1] = 0.0f;
                                    fArr[2] = 0.0f;
                                    fArr[3] = 0.0f;
                                    fArr[4] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[6] = 1.0f;
                                    fArr[7] = 0.0f;
                                    i11 = 8;
                                    fArr[8] = 0.0f;
                                    fArr[9] = 0.0f;
                                    fArr[10] = 0.0f;
                                    fArr[11] = 0.0f;
                                    fArr[12] = 1.0f;
                                    fArr[13] = 0.0f;
                                    fArr[14] = 0.0f;
                                    fArr[15] = 0.0f;
                                    fArr[16] = 0.0f;
                                    fArr[17] = 0.0f;
                                    fArr[18] = 1.0f;
                                    fArr[19] = 0.0f;
                                    float f58 = 1 - 0.55f;
                                    float f59 = 0.213f * f58;
                                    float f60 = 0.715f * f58;
                                    float f61 = f58 * 0.072f;
                                    fArr[0] = f59 + 0.55f;
                                    fArr[1] = f60;
                                    fArr[2] = f61;
                                    fArr[5] = f59;
                                    fArr[6] = f60 + 0.55f;
                                    fArr[7] = f61;
                                    fArr[10] = f59;
                                    fArr[11] = f60;
                                    fArr[12] = f61 + 0.55f;
                                    float[] fArr2 = {0.52f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.52f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.52f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
                                    float f62 = fArr[0];
                                    float f63 = fArr2[0];
                                    float f64 = fArr[1];
                                    float f65 = fArr2[5];
                                    float f66 = fArr[2];
                                    float f67 = fArr2[10];
                                    float f68 = fArr[3];
                                    float f69 = fArr2[15];
                                    float f70 = (f68 * f69) + (f66 * f67) + (f64 * f65) + (f62 * f63);
                                    float f71 = fArr2[1];
                                    float f72 = fArr2[6];
                                    float f73 = fArr2[11];
                                    float f74 = fArr2[16];
                                    float f75 = (f68 * f74) + (f66 * f73) + (f64 * f72) + (f62 * f71);
                                    float f76 = fArr2[2];
                                    float f77 = fArr2[7];
                                    float f78 = fArr2[12];
                                    float f79 = fArr2[17];
                                    float f80 = (f68 * f79) + (f66 * f78) + (f64 * f77) + (f62 * f76);
                                    float f81 = fArr2[3];
                                    float f82 = fArr2[8];
                                    float f83 = fArr2[13];
                                    float f84 = fArr2[18];
                                    float f85 = (f68 * f84) + (f66 * f83) + (f64 * f82) + (f62 * f81);
                                    float f86 = fArr2[4];
                                    float f87 = fArr2[9];
                                    float f88 = (f64 * f87) + (f62 * f86);
                                    float f89 = fArr2[14];
                                    float f90 = fArr2[19];
                                    float f91 = (f68 * f90) + (f66 * f89) + f88 + fArr[4];
                                    float f92 = fArr[5];
                                    float f93 = fArr[6];
                                    float f94 = fArr[7];
                                    float f95 = fArr[8];
                                    float f96 = (f95 * f69) + (f94 * f67) + (f93 * f65) + (f92 * f63);
                                    float f97 = (f95 * f74) + (f94 * f73) + (f93 * f72) + (f92 * f71);
                                    float f98 = (f95 * f79) + (f94 * f78) + (f93 * f77) + (f92 * f76);
                                    float f99 = (f95 * f84) + (f94 * f83) + (f93 * f82) + (f92 * f81);
                                    float f100 = f95 * f90;
                                    float f101 = f100 + (f94 * f89) + (f93 * f87) + (f92 * f86) + fArr[9];
                                    float f102 = fArr[10];
                                    float f103 = fArr[11];
                                    float f104 = fArr[12];
                                    float f105 = fArr[13];
                                    float f106 = (f105 * f69) + (f104 * f67) + (f103 * f65) + (f102 * f63);
                                    float f107 = (f105 * f74) + (f104 * f73) + (f103 * f72) + (f102 * f71);
                                    float f108 = (f105 * f79) + (f104 * f78) + (f103 * f77) + (f102 * f76);
                                    float f109 = (f105 * f84) + (f104 * f83) + (f103 * f82) + (f102 * f81);
                                    float f110 = f105 * f90;
                                    float f111 = f110 + (f104 * f89) + (f103 * f87) + (f102 * f86) + fArr[14];
                                    float f112 = fArr[15];
                                    float f113 = fArr[16];
                                    float f114 = (f65 * f113) + (f63 * f112);
                                    float f115 = fArr[17];
                                    float f116 = (f67 * f115) + f114;
                                    float f117 = fArr[18];
                                    float f118 = (f69 * f117) + f116;
                                    float f119 = f74 * f117;
                                    float f120 = f119 + (f73 * f115) + (f72 * f113) + (f71 * f112);
                                    float f121 = f79 * f117;
                                    float f122 = f121 + (f78 * f115) + (f77 * f113) + (f76 * f112);
                                    float f123 = f84 * f117;
                                    float f124 = f123 + (f83 * f115) + (f82 * f113) + (f81 * f112);
                                    float f125 = f117 * f90;
                                    float f126 = f125 + (f115 * f89) + (f113 * f87) + (f112 * f86) + fArr[19];
                                    fArr[0] = f70;
                                    fArr[1] = f75;
                                    fArr[2] = f80;
                                    fArr[3] = f85;
                                    fArr[4] = f91;
                                    fArr[5] = f96;
                                    fArr[6] = f97;
                                    fArr[7] = f98;
                                    fArr[8] = f99;
                                    fArr[9] = f101;
                                    fArr[10] = f106;
                                    fArr[11] = f107;
                                    fArr[12] = f108;
                                    fArr[13] = f109;
                                    fArr[14] = f111;
                                    fArr[15] = f118;
                                    fArr[16] = f120;
                                    fArr[17] = f122;
                                    fArr[18] = f124;
                                    fArr[19] = f126;
                                    s sVar = new s(new ColorMatrixColorFilter(fArr));
                                    sVar.f19528b = fArr;
                                    rVar4.k0(sVar);
                                    obj6 = sVar;
                                } else {
                                    i11 = 8;
                                    obj6 = O11;
                                }
                                final s sVar2 = (s) obj6;
                                final boolean k3 = e3Var26.k();
                                if (k3) {
                                    f10 = 1.2f;
                                } else {
                                    f10 = 1.0f;
                                }
                                final n2 a15 = q.a(f10, r11, "scissorScale", rVar4, 3120, 20);
                                if (k3) {
                                    f11 = -8.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                final n2 a16 = q.a(f11, r11, "scissorOffsetY", rVar4, 3120, 20);
                                if (k3) {
                                    f12 = 1.0f;
                                } else {
                                    f12 = 0.92f;
                                }
                                final n2 a17 = q.a(f12, r11, "scissorAlpha", rVar4, 3120, 20);
                                final a1 a1Var20 = a1Var12;
                                if (a1Var20 != null) {
                                    str = (String) a1Var20.getValue();
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (e3Var25.h() && !z20) {
                                    f13 = -8.0f;
                                    e3Var19 = e3Var25;
                                    e3Var20 = e3Var24;
                                    e3Var21 = e3Var33;
                                    z21 = true;
                                } else {
                                    f13 = -8.0f;
                                    e3Var19 = e3Var25;
                                    e3Var20 = e3Var24;
                                    e3Var21 = e3Var33;
                                    z21 = false;
                                }
                                if (z21) {
                                    f14 = 1.2f;
                                } else {
                                    f14 = 1.0f;
                                }
                                final n2 a18 = q.a(f14, r11, "maletaScale", rVar4, 3120, 20);
                                if (z21) {
                                    f15 = f13;
                                } else {
                                    f15 = 0.0f;
                                }
                                final n2 a19 = q.a(f15, r11, "maletaOffsetY", rVar4, 3120, 20);
                                if (z21) {
                                    f16 = 1.0f;
                                } else {
                                    f16 = 0.92f;
                                }
                                final n2 a20 = q.a(f16, r11, "maletaAlpha", rVar4, 3120, 20);
                                Object O12 = rVar4.O();
                                if (O12 == obj7) {
                                    O12 = y.B(Boolean.FALSE);
                                    rVar4.k0(O12);
                                }
                                a1 a1Var21 = (a1) O12;
                                Boolean valueOf = Boolean.valueOf(c(a1Var21));
                                Object O13 = rVar4.O();
                                if (O13 == obj7) {
                                    O13 = new b8.e7(a1Var21, cVar, i15);
                                    rVar4.k0(O13);
                                }
                                y.f((df.p) O13, valueOf, rVar4);
                                if (((Boolean) a1Var21.getValue()).booleanValue()) {
                                    a1Var14 = a1Var21;
                                    f17 = 1.2f;
                                } else {
                                    a1Var14 = a1Var21;
                                    f17 = 1.0f;
                                }
                                final a1 a1Var22 = a1Var14;
                                n2 a21 = q.a(f17, r11, "cameraScale", rVar4, 3120, 20);
                                if (((Boolean) a1Var22.getValue()).booleanValue()) {
                                    f18 = f13;
                                } else {
                                    f18 = 0.0f;
                                }
                                final n2 a22 = q.a(f18, r11, "cameraOffsetY", rVar4, 3120, 20);
                                if (((Boolean) a1Var22.getValue()).booleanValue()) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = 0.92f;
                                }
                                final n2 a23 = q.a(f19, r11, "cameraAlpha", rVar4, 3120, 20);
                                if (z20 && !e3Var23.j() && !e3Var27.c() && !e3Var20.a() && !e3Var26.k() && !e3Var28.i() && !e3Var29.b() && !e3Var30.n()) {
                                    f20 = 1.2f;
                                    a1Var15 = a1Var18;
                                    n2Var = a21;
                                    z22 = true;
                                } else {
                                    f20 = 1.2f;
                                    a1Var15 = a1Var18;
                                    n2Var = a21;
                                    z22 = false;
                                }
                                if (z22) {
                                    f21 = f20;
                                } else {
                                    f21 = 1.0f;
                                }
                                final n2 a24 = q.a(f21, r11, "typewriterScale", rVar4, 3120, 20);
                                if (z22) {
                                    f22 = f13;
                                } else {
                                    f22 = 0.0f;
                                }
                                final n2 a25 = q.a(f22, r11, "typewriterOffsetY", rVar4, 3120, 20);
                                if (z22) {
                                    f23 = 1.0f;
                                } else {
                                    f23 = 0.92f;
                                }
                                final n2 a26 = q.a(f23, r11, "typewriterAlpha", rVar4, 3120, 20);
                                if (e3Var23.j() && !e3Var20.a() && !e3Var19.h() && !e3Var26.k()) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    f24 = f20;
                                } else {
                                    f24 = 1.0f;
                                }
                                final n2 a27 = q.a(f24, r11, "lapisScale", rVar4, 3120, 20);
                                if (z23) {
                                    f25 = f13;
                                } else {
                                    f25 = 0.0f;
                                }
                                final n2 a28 = q.a(f25, r11, "lapisOffsetY", rVar4, 3120, 20);
                                if (z23) {
                                    f26 = 1.0f;
                                } else {
                                    f26 = 0.92f;
                                }
                                final n2 a29 = q.a(f26, r11, "lapisAlpha", rVar4, 3120, 20);
                                if (!e3Var23.j() && !e3Var27.c() && !e3Var20.a() && !e3Var19.h() && !e3Var26.k() && !e3Var28.i() && !e3Var29.b() && !e3Var30.n() && !e3Var31.e()) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (z24) {
                                    f27 = f20;
                                } else {
                                    f27 = 1.0f;
                                }
                                final n2 a30 = q.a(f27, r11, "marcadorScale", rVar4, 3120, 20);
                                if (z24) {
                                    f28 = f13;
                                } else {
                                    f28 = 0.0f;
                                }
                                final n2 a31 = q.a(f28, r11, "marcadorOffsetY", rVar4, 3120, 20);
                                if (z24) {
                                    f29 = 1.0f;
                                } else {
                                    f29 = 0.92f;
                                }
                                final n2 a32 = q.a(f29, r11, "marcadorAlpha", rVar4, 3120, 20);
                                if (e3Var27.c() && !e3Var20.a() && !e3Var19.h() && !e3Var26.k()) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                if (z25) {
                                    f30 = f20;
                                } else {
                                    f30 = 1.0f;
                                }
                                final n2 a33 = q.a(f30, r11, "resaltadorScale", rVar4, 3120, 20);
                                if (z25) {
                                    f31 = f13;
                                } else {
                                    f31 = 0.0f;
                                }
                                final n2 a34 = q.a(f31, r11, "resaltadorOffsetY", rVar4, 3120, 20);
                                if (z25) {
                                    f32 = 1.0f;
                                } else {
                                    f32 = 0.92f;
                                }
                                final n2 a35 = q.a(f32, r11, "resaltadorAlpha", rVar4, 3120, 20);
                                final boolean a36 = e3Var20.a();
                                Object O14 = rVar4.O();
                                if (O14 == obj7) {
                                    O14 = y.B(Boolean.FALSE);
                                    rVar4.k0(O14);
                                }
                                final a1 a1Var23 = (a1) O14;
                                Object O15 = rVar4.O();
                                if (O15 == obj7) {
                                    O15 = y.B(0L);
                                    rVar4.k0(O15);
                                }
                                final a1 a1Var24 = (a1) O15;
                                Object O16 = rVar4.O();
                                if (O16 == obj7) {
                                    O16 = new u7.k4(a1Var24, 10);
                                    rVar4.k0(O16);
                                }
                                final df.a aVar6 = (df.a) O16;
                                Object O17 = rVar4.O();
                                if (O17 == obj7) {
                                    O17 = y.B(Boolean.FALSE);
                                    rVar4.k0(O17);
                                }
                                final a1 a1Var25 = (a1) O17;
                                if (a36) {
                                    f33 = f20;
                                } else {
                                    f33 = 1.0f;
                                }
                                final n2 a37 = q.a(f33, r11, "eraserScale", rVar4, 3120, 20);
                                if (a36) {
                                    f34 = f13;
                                } else {
                                    f34 = 0.0f;
                                }
                                final n2 a38 = q.a(f34, r11, "eraserOffsetY", rVar4, 3120, 20);
                                if (a36) {
                                    f35 = 1.0f;
                                } else {
                                    f35 = 0.92f;
                                }
                                final n2 a39 = q.a(f35, r11, "eraserAlpha", rVar4, 3120, 20);
                                final boolean e8 = e3Var31.e();
                                if (e8) {
                                    f36 = f20;
                                } else {
                                    f36 = 1.0f;
                                }
                                final n2 a40 = q.a(f36, r11, "magicScale", rVar4, 3120, 20);
                                if (e8) {
                                    f37 = f13;
                                } else {
                                    f37 = 0.0f;
                                }
                                final n2 a41 = q.a(f37, r11, "magicOffsetY", rVar4, 3120, 20);
                                if (e8) {
                                    f38 = 1.0f;
                                } else {
                                    f38 = 0.92f;
                                }
                                final n2 a42 = q.a(f38, r11, "magicAlpha", rVar4, 3120, 20);
                                final boolean n10 = e3Var30.n();
                                if (n10) {
                                    f39 = f20;
                                } else {
                                    f39 = 1.0f;
                                }
                                final n2 a43 = q.a(f39, r11, "smudgeScale", rVar4, 3120, 20);
                                if (n10) {
                                    f40 = f13;
                                } else {
                                    f40 = 0.0f;
                                }
                                final n2 a44 = q.a(f40, r11, "smudgeOffsetY", rVar4, 3120, 20);
                                if (n10) {
                                    f41 = 1.0f;
                                } else {
                                    f41 = 0.92f;
                                }
                                final n2 a45 = q.a(f41, r11, "smudgeAlpha", rVar4, 3120, 20);
                                if (e3Var28.i() && !e3Var20.a() && !e3Var19.h() && !e3Var26.k() && !e3Var29.b()) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (z26) {
                                    f42 = f20;
                                } else {
                                    f42 = 1.0f;
                                }
                                q.a(f42, r11, "paintbrushScale", rVar4, 3120, 20);
                                if (z26) {
                                    f43 = f13;
                                } else {
                                    f43 = 0.0f;
                                }
                                q.a(f43, r11, "paintbrushOffsetY", rVar4, 3120, 20);
                                if (z26) {
                                    f44 = 1.0f;
                                } else {
                                    f44 = 0.92f;
                                }
                                q.a(f44, r11, "paintbrushAlpha", rVar4, 3120, 20);
                                if (e3Var29.b() && !e3Var20.a() && !e3Var19.h() && !e3Var26.k() && !e3Var28.i()) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if (z27) {
                                    f45 = f20;
                                } else {
                                    f45 = 1.0f;
                                }
                                final n2 a46 = q.a(f45, r11, "fillScale", rVar4, 3120, 20);
                                if (z27) {
                                    f46 = f13;
                                } else {
                                    f46 = 0.0f;
                                }
                                final n2 a47 = q.a(f46, r11, "fillOffsetY", rVar4, 3120, 20);
                                if (z27) {
                                    f47 = 1.0f;
                                } else {
                                    f47 = 0.92f;
                                }
                                final n2 a48 = q.a(f47, r11, "fillAlpha", rVar4, 3120, 20);
                                if (((Boolean) a1Var19.getValue()).booleanValue()) {
                                    f48 = f20;
                                } else {
                                    f48 = 1.0f;
                                }
                                final n2 a49 = q.a(f48, r11, "paperScale", rVar4, 3120, 20);
                                if (((Boolean) a1Var19.getValue()).booleanValue()) {
                                    f49 = f13;
                                } else {
                                    f49 = 0.0f;
                                }
                                final n2 a50 = q.a(f49, r11, "paperOffsetY", rVar4, 3120, 20);
                                if (((Boolean) a1Var19.getValue()).booleanValue()) {
                                    f50 = 1.0f;
                                } else {
                                    f50 = 0.92f;
                                }
                                final n2 a51 = q.a(f50, r11, "paperAlpha", rVar4, 3120, 20);
                                e3 e3Var35 = e3Var14;
                                if (e3Var35.m()) {
                                    e3Var22 = e3Var35;
                                    f51 = f20;
                                } else {
                                    e3Var22 = e3Var35;
                                    f51 = 1.0f;
                                }
                                final e3 e3Var36 = e3Var22;
                                q.a(f51, r11, "mixerScale", rVar4, 3120, 20);
                                if (e3Var36.m()) {
                                    f52 = f13;
                                } else {
                                    f52 = 0.0f;
                                }
                                q.a(f52, r11, "mixerOffsetY", rVar4, 3120, 20);
                                if (e3Var36.m()) {
                                    f53 = 1.0f;
                                } else {
                                    f53 = 0.5f;
                                }
                                q.a(f53, r11, "mixerAlpha", rVar4, 3120, 20);
                                m a52 = o.a(rVar4);
                                float f127 = i11;
                                r n11 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d(oVar, 1.0f), f127, 11, f127, 0);
                                e eVar = new e(4, true, new g(2, 1));
                                i iVar2 = c.E;
                                k0 a53 = androidx.compose.foundation.layout.a(2, 16);
                                final boolean z29 = z12;
                                final a1 a1Var26 = a1Var13;
                                final df.a aVar7 = aVar3;
                                final df.a aVar8 = aVar4;
                                final e3 e3Var37 = e3Var15;
                                final boolean z30 = z13;
                                final boolean z31 = z14;
                                final df.l lVar4 = lVar2;
                                final e3 e3Var38 = e3Var16;
                                final e3 e3Var39 = e3Var17;
                                final e3 e3Var40 = e3Var18;
                                we.b(n11, a52, a53, eVar, iVar2, null, false, null, new df.l() { // from class: w7.u3
                                    @Override // df.l
                                    public final Object invoke(Object obj8) {
                                        e eVar2 = (e) obj8;
                                        eVar2.getClass();
                                        n2 n2Var2 = a18;
                                        n2 n2Var3 = a19;
                                        n2 n2Var4 = a20;
                                        final a1 a1Var27 = a1Var26;
                                        final a1 a1Var28 = a1Var20;
                                        final a1 a1Var29 = a1Var17;
                                        final a1 a1Var30 = a1Var15;
                                        final e3 e3Var41 = e3Var19;
                                        final e3 e3Var42 = e3Var20;
                                        final e3 e3Var43 = e3Var30;
                                        final e3 e3Var44 = e3Var31;
                                        final e3 e3Var45 = e3Var23;
                                        final e3 e3Var46 = e3Var28;
                                        final e3 e3Var47 = e3Var29;
                                        final e3 e3Var48 = e3Var27;
                                        final e3 e3Var49 = e3Var26;
                                        final e3 e3Var50 = e3Var21;
                                        final e3 e3Var51 = e3Var36;
                                        final a1 a1Var31 = a1Var19;
                                        boolean z32 = z21;
                                        final s sVar3 = sVar2;
                                        e.n(eVar2, null, new c(353077351, new x3(n2Var2, n2Var3, n2Var4, a1Var27, a1Var28, a1Var29, a1Var30, e3Var41, e3Var42, e3Var43, e3Var44, e3Var45, e3Var46, e3Var47, e3Var48, e3Var49, e3Var50, e3Var51, a1Var31, z32, sVar3), true), 3);
                                        final n2 n2Var5 = n2Var;
                                        final n2 n2Var6 = a22;
                                        final n2 n2Var7 = a23;
                                        final df.a aVar9 = aVar7;
                                        final a1 a1Var32 = a1Var22;
                                        e.n(eVar2, null, new c(1076873118, new df.q() { // from class: w7.p3
                                            @Override // df.q
                                            public final Object b(Object obj9, Object obj10, Object obj11) {
                                                boolean z33;
                                                s sVar4;
                                                m mVar3 = (m) obj10;
                                                int intValue2 = ((Integer) obj11).intValue();
                                                ((b) obj9).getClass();
                                                if ((intValue2 & 17) != 16) {
                                                    z33 = true;
                                                } else {
                                                    z33 = false;
                                                }
                                                r rVar6 = (r) mVar3;
                                                if (rVar6.R(intValue2 & 1, z33)) {
                                                    r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(o.f15687a, 64)), 44, Float.NaN);
                                                    Object O18 = rVar6.O();
                                                    Object obj12 = l.f24285a;
                                                    if (O18 == obj12) {
                                                        O18 = a.r(rVar6);
                                                    }
                                                    v.i iVar3 = (v.i) O18;
                                                    a1 a1Var33 = a1Var27;
                                                    df.a aVar10 = aVar9;
                                                    a1 a1Var34 = a1Var29;
                                                    a1 a1Var35 = a1Var30;
                                                    a1 a1Var36 = a1Var31;
                                                    e3 e3Var52 = e3Var50;
                                                    e3 e3Var53 = e3Var51;
                                                    a1 a1Var37 = a1Var32;
                                                    r e10 = androidx.compose.foundation.a.e(a54, iVar3, null, false, null, new u7.c4(a1Var33, aVar10, a1Var34, a1Var35, a1Var36, e3Var52, e3Var53, a1Var37), 28);
                                                    n2 n2Var8 = n2.this;
                                                    boolean f128 = rVar6.f(n2Var8);
                                                    n2 n2Var9 = n2Var6;
                                                    boolean f129 = f128 | rVar6.f(n2Var9);
                                                    n2 n2Var10 = n2Var7;
                                                    boolean f130 = f129 | rVar6.f(n2Var10);
                                                    Object O19 = rVar6.O();
                                                    if (f130 || O19 == obj12) {
                                                        O19 = new i3(n2Var8, n2Var9, n2Var10, 4);
                                                        rVar6.k0(O19);
                                                    }
                                                    r a55 = androidx.compose.ui.graphics.a(e10, (df.l) O19);
                                                    p0 d2 = m.d(c.B, false);
                                                    int hashCode2 = Long.hashCode(rVar6.T);
                                                    g l12 = rVar6.l();
                                                    r c12 = a.c(a55, rVar6);
                                                    h.f1471d.getClass();
                                                    b0 b0Var2 = g.f1462b;
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(b0Var2);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    y.I(g.e, d2, rVar6);
                                                    y.I(g.f1464d, l12, rVar6);
                                                    f fVar3 = g.f1465f;
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                        a.t(hashCode2, rVar6, hashCode2, fVar3);
                                                    }
                                                    y.I(g.f1463c, c12, rVar6);
                                                    String b11 = wa.n7.b(R.string.tool_camera, rVar6);
                                                    float f131 = 52;
                                                    if (((Boolean) a1Var37.getValue()).booleanValue()) {
                                                        sVar4 = null;
                                                    } else {
                                                        sVar4 = sVar3;
                                                    }
                                                    a(R.drawable.ic_camara, b11, f131, sVar4, null, 0.0f, 0.0f, 0.0f, 0L, rVar6, 384, 496);
                                                    rVar6.p(true);
                                                } else {
                                                    rVar6.U();
                                                }
                                                return pe.z.f22715a;
                                            }
                                        }, true), 3);
                                        e.n(eVar2, null, new c(872629151, new g3(a15, a16, a17, a1Var27, a1Var28, e3Var49, e3Var42, e3Var43, e3Var44, e3Var41, e3Var45, e3Var46, e3Var47, e3Var48, e3Var50, e3Var51, k3, sVar3), true), 3);
                                        final df.a aVar10 = aVar8;
                                        final n2 n2Var8 = a24;
                                        final n2 n2Var9 = a25;
                                        final n2 n2Var10 = a26;
                                        final boolean z33 = z22;
                                        e.n(eVar2, null, new c(668385184, new df.q() { // from class: w7.v3
                                            @Override // df.q
                                            public final Object b(Object obj9, Object obj10, Object obj11) {
                                                boolean z34;
                                                s sVar4;
                                                m mVar3 = (m) obj10;
                                                int intValue2 = ((Integer) obj11).intValue();
                                                ((b) obj9).getClass();
                                                if ((intValue2 & 17) != 16) {
                                                    z34 = true;
                                                } else {
                                                    z34 = false;
                                                }
                                                r rVar6 = (r) mVar3;
                                                if (rVar6.R(intValue2 & 1, z34)) {
                                                    r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(o.f15687a, 64)), 44, Float.NaN);
                                                    Object O18 = rVar6.O();
                                                    Object obj12 = l.f24285a;
                                                    if (O18 == obj12) {
                                                        O18 = a.r(rVar6);
                                                    }
                                                    v.i iVar3 = (v.i) O18;
                                                    df.a aVar11 = df.a.this;
                                                    boolean f128 = rVar6.f(aVar11);
                                                    Object O19 = rVar6.O();
                                                    if (f128 || O19 == obj12) {
                                                        O19 = new b8.z(14, aVar11);
                                                        rVar6.k0(O19);
                                                    }
                                                    r e10 = androidx.compose.foundation.a.e(a54, iVar3, null, false, null, (df.a) O19, 28);
                                                    n2 n2Var11 = n2Var8;
                                                    boolean f129 = rVar6.f(n2Var11);
                                                    n2 n2Var12 = n2Var9;
                                                    boolean f130 = f129 | rVar6.f(n2Var12);
                                                    n2 n2Var13 = n2Var10;
                                                    boolean f131 = f130 | rVar6.f(n2Var13);
                                                    Object O20 = rVar6.O();
                                                    if (f131 || O20 == obj12) {
                                                        O20 = new i3(n2Var11, n2Var12, n2Var13, 9);
                                                        rVar6.k0(O20);
                                                    }
                                                    r a55 = androidx.compose.ui.graphics.a(e10, (df.l) O20);
                                                    p0 d2 = m.d(c.B, false);
                                                    int hashCode2 = Long.hashCode(rVar6.T);
                                                    g l12 = rVar6.l();
                                                    r c12 = a.c(a55, rVar6);
                                                    h.f1471d.getClass();
                                                    df.a aVar12 = g.f1462b;
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(aVar12);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    y.I(g.e, d2, rVar6);
                                                    y.I(g.f1464d, l12, rVar6);
                                                    f fVar3 = g.f1465f;
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                        a.t(hashCode2, rVar6, hashCode2, fVar3);
                                                    }
                                                    y.I(g.f1463c, c12, rVar6);
                                                    String b11 = wa.n7.b(R.string.tool_typewriter, rVar6);
                                                    float f132 = 52;
                                                    if (z33) {
                                                        sVar4 = null;
                                                    } else {
                                                        sVar4 = sVar3;
                                                    }
                                                    a(R.drawable.ic_maquina, b11, f132, sVar4, null, 0.0f, 0.0f, 0.0f, 0L, rVar6, 384, 496);
                                                    rVar6.p(true);
                                                } else {
                                                    rVar6.U();
                                                }
                                                return pe.z.f22715a;
                                            }
                                        }, true), 3);
                                        final n2 n2Var11 = a27;
                                        final n2 n2Var12 = a28;
                                        final n2 n2Var13 = a29;
                                        final df.a aVar11 = aVar6;
                                        final e3 e3Var52 = e3Var32;
                                        final boolean z34 = z23;
                                        final e3 e3Var53 = e3Var37;
                                        final e3 e3Var54 = e3Var34;
                                        final a1 a1Var33 = a1Var24;
                                        e.n(eVar2, null, new c(747948364, new df.q() { // from class: w7.w3
                                            @Override // df.q
                                            public final Object b(Object obj9, Object obj10, Object obj11) {
                                                boolean z35;
                                                s sVar4;
                                                boolean z36;
                                                m mVar3 = (m) obj10;
                                                int intValue2 = ((Integer) obj11).intValue();
                                                ((b) obj9).getClass();
                                                if ((intValue2 & 17) != 16) {
                                                    z35 = true;
                                                } else {
                                                    z35 = false;
                                                }
                                                r rVar6 = (r) mVar3;
                                                boolean R = rVar6.R(intValue2 & 1, z35);
                                                pe.z zVar2 = pe.z.f22715a;
                                                if (R) {
                                                    o oVar2 = o.f15687a;
                                                    r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(oVar2, 64)), 40, Float.NaN);
                                                    df.a aVar12 = aVar11;
                                                    a1 a1Var34 = a1Var28;
                                                    a1 a1Var35 = a1Var27;
                                                    e3 e3Var55 = e3Var42;
                                                    e3 e3Var56 = e3Var43;
                                                    e3 e3Var57 = e3Var44;
                                                    e3 e3Var58 = e3Var41;
                                                    e3 e3Var59 = e3Var49;
                                                    e3 e3Var60 = e3Var45;
                                                    e3 e3Var61 = e3Var46;
                                                    e3 e3Var62 = e3Var47;
                                                    e3 e3Var63 = e3Var48;
                                                    e3 e3Var64 = e3Var50;
                                                    r b11 = d0.b(a54, zVar2, new f4(aVar12, a1Var34, a1Var35, e3Var55, e3Var56, e3Var57, e3Var58, e3Var59, e3Var60, e3Var61, e3Var62, e3Var63, e3Var64, e3Var51));
                                                    n2 n2Var14 = n2.this;
                                                    boolean f128 = rVar6.f(n2Var14);
                                                    n2 n2Var15 = n2Var12;
                                                    boolean f129 = f128 | rVar6.f(n2Var15);
                                                    n2 n2Var16 = n2Var13;
                                                    boolean f130 = f129 | rVar6.f(n2Var16);
                                                    Object O18 = rVar6.O();
                                                    v0 v0Var2 = l.f24285a;
                                                    if (f130 || O18 == v0Var2) {
                                                        O18 = new i3(n2Var14, n2Var15, n2Var16, 7);
                                                        rVar6.k0(O18);
                                                    }
                                                    r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.graphics.a(b11, (df.l) O18), 4, 0.0f, 2);
                                                    p0 d2 = m.d(c.B, false);
                                                    int hashCode2 = Long.hashCode(rVar6.T);
                                                    g l12 = rVar6.l();
                                                    r c12 = a.c(m4, rVar6);
                                                    h.f1471d.getClass();
                                                    b0 b0Var2 = g.f1462b;
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(b0Var2);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    f fVar3 = g.e;
                                                    y.I(fVar3, d2, rVar6);
                                                    f fVar4 = g.f1464d;
                                                    y.I(fVar4, l12, rVar6);
                                                    f fVar5 = g.f1465f;
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                        a.t(hashCode2, rVar6, hashCode2, fVar5);
                                                    }
                                                    f fVar6 = g.f1463c;
                                                    y.I(fVar6, c12, rVar6);
                                                    float f131 = 52;
                                                    r r12 = androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(oVar2, f131));
                                                    p0 d10 = m.d(c.f15671v, false);
                                                    int hashCode3 = Long.hashCode(rVar6.T);
                                                    g l13 = rVar6.l();
                                                    r c13 = a.c(r12, rVar6);
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(b0Var2);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    y.I(fVar3, d10, rVar6);
                                                    y.I(fVar4, l13, rVar6);
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode3))) {
                                                        a.t(hashCode3, rVar6, hashCode3, fVar5);
                                                    }
                                                    y.I(fVar6, c13, rVar6);
                                                    r b12 = androidx.compose.foundation.layout.b.f501a.b();
                                                    e3 e3Var65 = e3Var52;
                                                    boolean f132 = rVar6.f(e3Var65);
                                                    Object O19 = rVar6.O();
                                                    if (f132 || O19 == v0Var2) {
                                                        O19 = new j3(e3Var65, 3);
                                                        rVar6.k0(O19);
                                                    }
                                                    ya.ta.a(b12, (df.l) O19, rVar6, 0);
                                                    String b13 = wa.n7.b(R.string.tool_pencil, rVar6);
                                                    boolean z37 = z34;
                                                    if (z37) {
                                                        sVar4 = null;
                                                    } else {
                                                        sVar4 = sVar3;
                                                    }
                                                    int i16 = 2;
                                                    a(R.drawable.ic_lapiz, b13, f131, sVar4, null, 0.0f, 0.0f, 0.0f, 0L, rVar6, 384, 496);
                                                    rVar6.p(true);
                                                    rVar6.a0(712433904);
                                                    if (b(e3Var64) && z37) {
                                                        z36 = true;
                                                    } else {
                                                        z36 = false;
                                                    }
                                                    e3 e3Var66 = e3Var53;
                                                    x7.v(z36, e3Var66.o(), false, e3Var54.l(), 0.5f, 40.0f, new j3(e3Var66, 4), new k3(i16, a1Var33, e3Var64), ((Number) e3Var65.I.getValue()).intValue(), rVar6, 221568);
                                                    rVar6.p(false);
                                                    rVar6.p(true);
                                                    return zVar2;
                                                }
                                                rVar6.U();
                                                return zVar2;
                                            }
                                        }, true), 3);
                                        e.n(eVar2, null, new c(2060276035, new x3(a30, a31, a32, e3Var42, e3Var43, e3Var44, e3Var41, e3Var49, e3Var45, e3Var46, e3Var47, e3Var48, e3Var50, e3Var51, aVar11, e3Var52, z24, sVar3, e3Var53, e3Var54, a1Var33, 0), true), 3);
                                        e.n(eVar2, null, new c(-1901417852, new x3(a33, a34, a35, e3Var42, e3Var43, e3Var44, e3Var41, e3Var49, e3Var45, e3Var46, e3Var47, e3Var48, e3Var50, e3Var51, aVar11, e3Var52, z25, sVar3, e3Var53, e3Var54, a1Var33, 1), true), 3);
                                        final n2 n2Var14 = a37;
                                        final n2 n2Var15 = a38;
                                        final n2 n2Var16 = a39;
                                        final a1 a1Var34 = a1Var23;
                                        final boolean z35 = a36;
                                        final boolean z36 = z30;
                                        final boolean z37 = z31;
                                        final df.l lVar5 = lVar4;
                                        final e3 e3Var55 = e3Var38;
                                        final a1 a1Var35 = a1Var25;
                                        e.n(eVar2, null, new c(-1568144443, new df.q() { // from class: w7.y3
                                            @Override // df.q
                                            public final Object b(Object obj9, Object obj10, Object obj11) {
                                                boolean z38;
                                                s sVar4;
                                                boolean z39;
                                                boolean z40;
                                                m mVar3 = (m) obj10;
                                                int intValue2 = ((Integer) obj11).intValue();
                                                ((b) obj9).getClass();
                                                if ((intValue2 & 17) != 16) {
                                                    z38 = true;
                                                } else {
                                                    z38 = false;
                                                }
                                                r rVar6 = (r) mVar3;
                                                boolean R = rVar6.R(intValue2 & 1, z38);
                                                pe.z zVar2 = pe.z.f22715a;
                                                if (R) {
                                                    r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(o.f15687a, 64)), 40, Float.NaN);
                                                    df.a aVar12 = aVar11;
                                                    e3 e3Var56 = e3Var42;
                                                    e3 e3Var57 = e3Var43;
                                                    e3 e3Var58 = e3Var44;
                                                    e3 e3Var59 = e3Var41;
                                                    e3 e3Var60 = e3Var49;
                                                    e3 e3Var61 = e3Var45;
                                                    e3 e3Var62 = e3Var46;
                                                    e3 e3Var63 = e3Var47;
                                                    e3 e3Var64 = e3Var48;
                                                    e3 e3Var65 = e3Var51;
                                                    e3 e3Var66 = e3Var50;
                                                    a1 a1Var36 = a1Var34;
                                                    r b11 = d0.b(a54, zVar2, new i4(aVar12, e3Var56, e3Var57, e3Var58, e3Var59, e3Var60, e3Var61, e3Var62, e3Var63, e3Var64, e3Var65, e3Var66, a1Var36, 0));
                                                    n2 n2Var17 = n2.this;
                                                    boolean f128 = rVar6.f(n2Var17);
                                                    n2 n2Var18 = n2Var15;
                                                    boolean f129 = f128 | rVar6.f(n2Var18);
                                                    n2 n2Var19 = n2Var16;
                                                    boolean f130 = f129 | rVar6.f(n2Var19);
                                                    Object O18 = rVar6.O();
                                                    Object obj12 = l.f24285a;
                                                    if (f130 || O18 == obj12) {
                                                        O18 = new i3(n2Var17, n2Var18, n2Var19, 10);
                                                        rVar6.k0(O18);
                                                    }
                                                    r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.graphics.a(b11, (df.l) O18), 4, 0.0f, 2);
                                                    p0 d2 = m.d(c.B, false);
                                                    int hashCode2 = Long.hashCode(rVar6.T);
                                                    g l12 = rVar6.l();
                                                    r c12 = a.c(m4, rVar6);
                                                    h.f1471d.getClass();
                                                    df.a aVar13 = g.f1462b;
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(aVar13);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    y.I(g.e, d2, rVar6);
                                                    y.I(g.f1464d, l12, rVar6);
                                                    f fVar3 = g.f1465f;
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                        a.t(hashCode2, rVar6, hashCode2, fVar3);
                                                    }
                                                    y.I(g.f1463c, c12, rVar6);
                                                    String b12 = wa.n7.b(R.string.tool_eraser, rVar6);
                                                    float f131 = 52;
                                                    boolean z41 = z35;
                                                    if (z41) {
                                                        sVar4 = null;
                                                    } else {
                                                        sVar4 = sVar3;
                                                    }
                                                    a(R.drawable.ic_borrador, b12, f131, sVar4, null, 0.0f, 0.0f, 0.0f, 0L, rVar6, 384, 496);
                                                    rVar6.a0(-1415958229);
                                                    if (b(e3Var66) && z41) {
                                                        z39 = true;
                                                    } else {
                                                        z39 = false;
                                                    }
                                                    e3 e3Var67 = e3Var55;
                                                    float h10 = e3Var67.f28145w.h();
                                                    long l13 = e3Var54.l();
                                                    j3 j3Var = new j3(e3Var67, 5);
                                                    a1 a1Var37 = a1Var33;
                                                    x7.v(z39, h10, true, l13, 5.0f, 80.0f, j3Var, new k3(3, a1Var37, e3Var66), 0, rVar6, 100884864);
                                                    rVar6.p(false);
                                                    if (((Boolean) a1Var36.getValue()).booleanValue() && z41) {
                                                        z40 = true;
                                                    } else {
                                                        z40 = false;
                                                    }
                                                    df.l lVar6 = lVar5;
                                                    boolean f132 = rVar6.f(lVar6);
                                                    Object O19 = rVar6.O();
                                                    a1 a1Var38 = a1Var35;
                                                    if (f132 || O19 == obj12) {
                                                        O19 = new b8.y4(lVar6, a1Var38, 1);
                                                        rVar6.k0(O19);
                                                    }
                                                    df.l lVar7 = (df.l) O19;
                                                    Object O20 = rVar6.O();
                                                    if (O20 == obj12) {
                                                        O20 = new b8.s6(17, a1Var37, a1Var36);
                                                        rVar6.k0(O20);
                                                    }
                                                    x7.e(z40, z36, z37, lVar7, (df.a) O20, rVar6, 24576);
                                                    boolean booleanValue3 = ((Boolean) a1Var38.getValue()).booleanValue();
                                                    String b13 = wa.n7.b(R.string.erase_all_confirm, rVar6);
                                                    boolean f133 = rVar6.f(lVar6);
                                                    Object O21 = rVar6.O();
                                                    if (f133 || O21 == obj12) {
                                                        O21 = new q3(lVar6, a1Var38, 0);
                                                        rVar6.k0(O21);
                                                    }
                                                    df.a aVar14 = (df.a) O21;
                                                    Object O22 = rVar6.O();
                                                    if (O22 == obj12) {
                                                        O22 = new u7.k4(a1Var38, 9);
                                                        rVar6.k0(O22);
                                                    }
                                                    x7.c(booleanValue3, b13, aVar14, (df.a) O22, rVar6, 3072);
                                                    rVar6.p(true);
                                                    return zVar2;
                                                }
                                                rVar6.U();
                                                return zVar2;
                                            }
                                        }, true), 3);
                                        e.n(eVar2, null, new c(-1234871034, new g3(a40, a41, a42, aVar11, e3Var44, e3Var42, e3Var43, e3Var41, e3Var49, e3Var45, e3Var46, e3Var47, e3Var48, e3Var39, e3Var50, e3Var51, e8, sVar3), true), 3);
                                        final n2 n2Var17 = a43;
                                        final n2 n2Var18 = a44;
                                        final n2 n2Var19 = a45;
                                        final boolean z38 = n10;
                                        final e3 e3Var56 = e3Var40;
                                        e.n(eVar2, null, new c(-901597625, new df.q() { // from class: w7.h3
                                            @Override // df.q
                                            public final Object b(Object obj9, Object obj10, Object obj11) {
                                                boolean z39;
                                                s sVar4;
                                                boolean z40;
                                                m mVar3 = (m) obj10;
                                                int intValue2 = ((Integer) obj11).intValue();
                                                ((b) obj9).getClass();
                                                if ((intValue2 & 17) != 16) {
                                                    z39 = true;
                                                } else {
                                                    z39 = false;
                                                }
                                                r rVar6 = (r) mVar3;
                                                boolean R = rVar6.R(intValue2 & 1, z39);
                                                pe.z zVar2 = pe.z.f22715a;
                                                if (R) {
                                                    r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(o.f15687a, 64)), 40, Float.NaN);
                                                    df.a aVar12 = aVar11;
                                                    e3 e3Var57 = e3Var43;
                                                    e3 e3Var58 = e3Var42;
                                                    e3 e3Var59 = e3Var44;
                                                    e3 e3Var60 = e3Var41;
                                                    e3 e3Var61 = e3Var49;
                                                    e3 e3Var62 = e3Var45;
                                                    e3 e3Var63 = e3Var46;
                                                    e3 e3Var64 = e3Var47;
                                                    e3 e3Var65 = e3Var48;
                                                    e3 e3Var66 = e3Var50;
                                                    r b11 = d0.b(a54, zVar2, new d4(aVar12, e3Var57, e3Var58, e3Var59, e3Var60, e3Var61, e3Var62, e3Var63, e3Var64, e3Var65, e3Var66, e3Var51));
                                                    n2 n2Var20 = n2.this;
                                                    boolean f128 = rVar6.f(n2Var20);
                                                    n2 n2Var21 = n2Var18;
                                                    boolean f129 = f128 | rVar6.f(n2Var21);
                                                    n2 n2Var22 = n2Var19;
                                                    boolean f130 = f129 | rVar6.f(n2Var22);
                                                    Object O18 = rVar6.O();
                                                    int i16 = 2;
                                                    if (f130 || O18 == l.f24285a) {
                                                        O18 = new i3(n2Var20, n2Var21, n2Var22, 2);
                                                        rVar6.k0(O18);
                                                    }
                                                    r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.graphics.a(b11, (df.l) O18), 4, 0.0f, 2);
                                                    p0 d2 = m.d(c.B, false);
                                                    int hashCode2 = Long.hashCode(rVar6.T);
                                                    g l12 = rVar6.l();
                                                    r c12 = a.c(m4, rVar6);
                                                    h.f1471d.getClass();
                                                    b0 b0Var2 = g.f1462b;
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(b0Var2);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    y.I(g.e, d2, rVar6);
                                                    y.I(g.f1464d, l12, rVar6);
                                                    f fVar3 = g.f1465f;
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                        a.t(hashCode2, rVar6, hashCode2, fVar3);
                                                    }
                                                    y.I(g.f1463c, c12, rVar6);
                                                    String b12 = wa.n7.b(R.string.tool_smudge, rVar6);
                                                    float f131 = 52;
                                                    boolean z41 = z38;
                                                    if (z41) {
                                                        sVar4 = null;
                                                    } else {
                                                        sVar4 = sVar3;
                                                    }
                                                    a(R.drawable.ic_difuminador, b12, f131, sVar4, null, 0.0f, 0.0f, 0.0f, r.f19520k, rVar6, 100663680, 240);
                                                    if (b(e3Var66) && z41) {
                                                        z40 = true;
                                                    } else {
                                                        z40 = false;
                                                    }
                                                    e3 e3Var67 = e3Var56;
                                                    x7.v(z40, e3Var67.f28146x.h(), true, e3Var54.l(), 6.0f, 60.0f, new j3(e3Var67, i16), new k3(1, a1Var33, e3Var66), 0, rVar6, 100884864);
                                                    rVar6.p(true);
                                                    return zVar2;
                                                }
                                                rVar6.U();
                                                return zVar2;
                                            }
                                        }, true), 3);
                                        final n2 n2Var20 = a46;
                                        final n2 n2Var21 = a47;
                                        final n2 n2Var22 = a48;
                                        final boolean z39 = z27;
                                        e.n(eVar2, null, new c(-568324216, new df.q() { // from class: w7.m3
                                            @Override // df.q
                                            public final Object b(Object obj9, Object obj10, Object obj11) {
                                                boolean z40;
                                                s sVar4;
                                                m mVar3 = (m) obj10;
                                                int intValue2 = ((Integer) obj11).intValue();
                                                ((b) obj9).getClass();
                                                if ((intValue2 & 17) != 16) {
                                                    z40 = true;
                                                } else {
                                                    z40 = false;
                                                }
                                                r rVar6 = (r) mVar3;
                                                if (rVar6.R(intValue2 & 1, z40)) {
                                                    o oVar2 = o.f15687a;
                                                    r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(oVar2, 64)), 40, Float.NaN);
                                                    Object O18 = rVar6.O();
                                                    Object obj12 = l.f24285a;
                                                    if (O18 == obj12) {
                                                        O18 = a.r(rVar6);
                                                    }
                                                    r e10 = androidx.compose.foundation.a.e(a54, (v.i) O18, null, false, null, new u7.f(e3Var47, e3Var42, e3Var41, e3Var49, e3Var46, e3Var43, e3Var44, e3Var45, e3Var48, e3Var50, e3Var51, 1), 28);
                                                    n2 n2Var23 = n2.this;
                                                    boolean f128 = rVar6.f(n2Var23);
                                                    n2 n2Var24 = n2Var21;
                                                    boolean f129 = f128 | rVar6.f(n2Var24);
                                                    n2 n2Var25 = n2Var22;
                                                    boolean f130 = f129 | rVar6.f(n2Var25);
                                                    Object O19 = rVar6.O();
                                                    if (f130 || O19 == obj12) {
                                                        O19 = new i3(n2Var23, n2Var24, n2Var25, 5);
                                                        rVar6.k0(O19);
                                                    }
                                                    r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.graphics.a(e10, (df.l) O19), 4, 0.0f, 2);
                                                    p0 d2 = m.d(c.B, false);
                                                    int hashCode2 = Long.hashCode(rVar6.T);
                                                    g l12 = rVar6.l();
                                                    r c12 = a.c(m4, rVar6);
                                                    h.f1471d.getClass();
                                                    b0 b0Var2 = g.f1462b;
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(b0Var2);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    f fVar3 = g.e;
                                                    y.I(fVar3, d2, rVar6);
                                                    f fVar4 = g.f1464d;
                                                    y.I(fVar4, l12, rVar6);
                                                    f fVar5 = g.f1465f;
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                        a.t(hashCode2, rVar6, hashCode2, fVar5);
                                                    }
                                                    f fVar6 = g.f1463c;
                                                    y.I(fVar6, c12, rVar6);
                                                    float f131 = 52;
                                                    r r12 = androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(oVar2, f131));
                                                    p0 d10 = m.d(c.f15671v, false);
                                                    int hashCode3 = Long.hashCode(rVar6.T);
                                                    g l13 = rVar6.l();
                                                    r c13 = a.c(r12, rVar6);
                                                    rVar6.e0();
                                                    if (rVar6.S) {
                                                        rVar6.k(b0Var2);
                                                    } else {
                                                        rVar6.n0();
                                                    }
                                                    y.I(fVar3, d10, rVar6);
                                                    y.I(fVar4, l13, rVar6);
                                                    if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode3))) {
                                                        a.t(hashCode3, rVar6, hashCode3, fVar5);
                                                    }
                                                    y.I(fVar6, c13, rVar6);
                                                    String b11 = wa.n7.b(R.string.tool_roller, rVar6);
                                                    if (z39) {
                                                        sVar4 = null;
                                                    } else {
                                                        sVar4 = sVar3;
                                                    }
                                                    a(R.drawable.ic_rodillo, b11, f131, sVar4, null, 0.0f, 0.0f, 0.0f, 0L, rVar6, 384, 496);
                                                    rVar6.p(true);
                                                    rVar6.p(true);
                                                } else {
                                                    rVar6.U();
                                                }
                                                return pe.z.f22715a;
                                            }
                                        }, true), 3);
                                        if (!z29) {
                                            final n2 n2Var23 = a49;
                                            final n2 n2Var24 = a50;
                                            final n2 n2Var25 = a51;
                                            e.n(eVar2, null, new c(546354590, new df.q() { // from class: w7.o3
                                                @Override // df.q
                                                public final Object b(Object obj9, Object obj10, Object obj11) {
                                                    boolean z40;
                                                    m mVar3 = (m) obj10;
                                                    int intValue2 = ((Integer) obj11).intValue();
                                                    ((b) obj9).getClass();
                                                    if ((intValue2 & 17) != 16) {
                                                        z40 = true;
                                                    } else {
                                                        z40 = false;
                                                    }
                                                    r rVar6 = (r) mVar3;
                                                    if (rVar6.R(intValue2 & 1, z40)) {
                                                        r a54 = androidx.compose.foundation.layout.a(androidx.compose.foundation.layout.d.r(androidx.compose.foundation.layout.f(o.f15687a, 64)), 44, Float.NaN);
                                                        Object O18 = rVar6.O();
                                                        Object obj12 = l.f24285a;
                                                        if (O18 == obj12) {
                                                            O18 = a.r(rVar6);
                                                        }
                                                        a1 a1Var36 = a1Var31;
                                                        r e10 = androidx.compose.foundation.a.e(a54, (v.i) O18, null, false, null, new r0(a1Var36, a1Var29, a1Var30, e3Var50, e3Var51), 28);
                                                        n2 n2Var26 = n2.this;
                                                        boolean f128 = rVar6.f(n2Var26);
                                                        n2 n2Var27 = n2Var24;
                                                        boolean f129 = f128 | rVar6.f(n2Var27);
                                                        n2 n2Var28 = n2Var25;
                                                        boolean f130 = f129 | rVar6.f(n2Var28);
                                                        Object O19 = rVar6.O();
                                                        if (f130 || O19 == obj12) {
                                                            O19 = new i3(n2Var26, n2Var27, n2Var28, 6);
                                                            rVar6.k0(O19);
                                                        }
                                                        r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.graphics.a(e10, (df.l) O19), 4, 0.0f, 2);
                                                        p0 d2 = m.d(c.B, false);
                                                        int hashCode2 = Long.hashCode(rVar6.T);
                                                        g l12 = rVar6.l();
                                                        r c12 = a.c(m4, rVar6);
                                                        h.f1471d.getClass();
                                                        b0 b0Var2 = g.f1462b;
                                                        rVar6.e0();
                                                        if (rVar6.S) {
                                                            rVar6.k(b0Var2);
                                                        } else {
                                                            rVar6.n0();
                                                        }
                                                        y.I(g.e, d2, rVar6);
                                                        y.I(g.f1464d, l12, rVar6);
                                                        f fVar3 = g.f1465f;
                                                        if (rVar6.S || !kotlin.jvm.internal.l.a(rVar6.O(), Integer.valueOf(hashCode2))) {
                                                            a.t(hashCode2, rVar6, hashCode2, fVar3);
                                                        }
                                                        y.I(g.f1463c, c12, rVar6);
                                                        d(((Boolean) a1Var36.getValue()).booleanValue(), wa.n7.b(R.string.tool_paper, rVar6), rVar6, 0);
                                                        rVar6.p(true);
                                                    } else {
                                                        rVar6.U();
                                                    }
                                                    return pe.z.f22715a;
                                                }
                                            }, true), 3);
                                        }
                                        return pe.z.f22715a;
                                    }
                                }, rVar4, 221568, 456);
                                rVar4.p(true);
                                return zVar;
                            }
                        }, rVar3), rVar3, 196608, 16);
                    } else {
                        rVar3.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 56);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.s3
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(i | 1);
                    a(p.this, e3Var, z3, a1Var, a1Var2, a1Var3, a1Var4, vVar, vVar2, a1Var5, o0Var, aVar, lVar, z9, z10, a1Var6, a1Var7, aVar2, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final boolean b(e3 e3Var) {
        return ((Boolean) e3Var.E.getValue()).booleanValue();
    }

    public static final boolean c(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void d(a1 a1Var, long j10) {
        a1Var.setValue(Long.valueOf(j10));
    }

    public static final void e(e3 e3Var, long j10) {
        if (e3Var.j()) {
            e3Var.f28136n.setValue(new r(j10));
            return;
        }
        if (e3Var.c()) {
            e3Var.f28137o.setValue(new r(j10));
            return;
        }
        if (e3Var.i()) {
            e3Var.f28138p.setValue(new r(j10));
            return;
        }
        if (e3Var.b()) {
            e3Var.f28139q.setValue(new r(j10));
        } else if (e3Var.r()) {
            e3Var.f28140r.setValue(new r(j10));
        } else {
            e3Var.f28135m.setValue(new r(j10));
        }
    }
}