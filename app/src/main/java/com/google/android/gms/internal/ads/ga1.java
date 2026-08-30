package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class ga1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6338b = new ga1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6339c = new ga1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6340d = new ga1(2);
    public static final /* synthetic */ ga1 e = new ga1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6341f = new ga1(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6342g = new ga1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6343h = new ga1(6);
    public static final /* synthetic */ ga1 i = new ga1(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6344j = new ga1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6345k = new ga1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6346l = new ga1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6347m = new ga1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6348n = new ga1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6349o = new ga1(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6350p = new ga1(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ ga1 f6351q = new ga1(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6352a;

    public /* synthetic */ ga1(int i10) {
        this.f6352a = i10;
    }

    public final xy a(v91 v91Var, Integer num) {
        int i10 = 21;
        int i11 = 24;
        boolean z3 = false;
        switch (this.f6352a) {
            case 0:
                ka1 ka1Var = (ka1) v91Var;
                sd1 sd1Var = ia1.f7072a;
                int i12 = ka1Var.f7697a;
                if (i12 != 16 && i12 != 32) {
                    androidx.datastore.preferences.protobuf.s1.q("AES key size must be 16 or 32 bytes");
                    return null;
                }
                tw twVar = new tw(29);
                twVar.f11470v = ka1Var;
                twVar.f11473y = num;
                twVar.f11471w = bl0.c(i12);
                twVar.f11472x = bl0.c(ka1Var.f7698b);
                return twVar.u();
            case 1:
                oa1 oa1Var = (oa1) v91Var;
                sd1 sd1Var2 = ma1.f8295a;
                int i13 = oa1Var.f9068a;
                if (i13 != 24) {
                    zd1 zd1Var = new zd1(20);
                    zd1Var.f13142v = oa1Var;
                    zd1Var.f13144x = num;
                    zd1Var.f13143w = bl0.c(i13);
                    return zd1Var.o();
                }
                androidx.datastore.preferences.protobuf.s1.q("192 bit AES EAX Parameters are not valid");
                return null;
            case 2:
                ra1 ra1Var = (ra1) v91Var;
                sd1 sd1Var3 = qa1.f9796a;
                int i14 = ra1Var.f10188a;
                if (i14 != 24) {
                    hq0 hq0Var = new hq0(i10, z3);
                    hq0Var.f6872v = ra1Var;
                    hq0Var.f6874x = num;
                    hq0Var.f6873w = bl0.c(i14);
                    return hq0Var.A();
                }
                androidx.datastore.preferences.protobuf.s1.q("192 bit AES GCM Parameters are not valid");
                return null;
            case 3:
                ua1 ua1Var = (ua1) v91Var;
                sd1 sd1Var4 = ta1.f11301a;
                zd1 zd1Var2 = new zd1(i10);
                zd1Var2.f13142v = ua1Var;
                zd1Var2.f13144x = num;
                zd1Var2.f13143w = bl0.c(ua1Var.f11595a);
                return zd1Var2.q();
            case 4:
                sd1 sd1Var5 = wa1.f12204a;
                return va1.h0(((xa1) v91Var).f12537a, bl0.c(32), num);
            case 5:
                sd1 sd1Var6 = ya1.f12835a;
                return ab1.h0((bb1) v91Var, num);
            case 6:
                ad1 ad1Var = za1.f13131a;
                return db1.h0((eb1) v91Var, num);
            case 7:
                return ib1.h0((kb1) v91Var, bl0.c(32), num);
            case 8:
                sd1 sd1Var7 = mb1.f8300a;
                return lb1.h0(((nb1) v91Var).f8641a, bl0.c(32), num);
            case 9:
                fd1 fd1Var = fd1.f6043b;
                ih1 ih1Var = (ih1) ((dd1) v91Var).f5405a.f13143w;
                tc1 tc1Var = tc1.f11325d;
                ad1 d2 = tc1Var.d(ih1Var.z());
                if (((Boolean) tc1Var.f11327b.get(ih1Var.z())).booleanValue()) {
                    om1 A = ih1Var.A();
                    d2.getClass();
                    hh1 C = ih1.C();
                    String str = d2.f4462a;
                    C.b();
                    ((ih1) C.f4845v).E(str);
                    C.b();
                    ((ih1) C.f4845v).F(A);
                    C.b();
                    ((ih1) C.f4845v).H(5);
                    zd1 j10 = zd1.j((ih1) C.c());
                    jd1 jd1Var = jd1.f7422b;
                    yd1 yd1Var = (yd1) jd1Var.f(fd1.f6043b.b(jd1Var.g(j10), null));
                    fh1 B = gh1.B();
                    String str2 = (String) yd1Var.f12855u;
                    B.b();
                    ((gh1) B.f4845v).D(str2);
                    om1 om1Var = (om1) yd1Var.f12857w;
                    B.b();
                    ((gh1) B.f4845v).E(om1Var);
                    int p10 = ed1.p((w91) yd1Var.f12858x);
                    B.b();
                    ((gh1) B.f4845v).G(p10);
                    gh1 gh1Var = (gh1) B.c();
                    return new cd1(yd1.a(gh1Var.z(), gh1Var.A(), ed1.B(gh1Var.F()), ed1.F(ih1Var.G()), num));
                }
                androidx.datastore.preferences.protobuf.s1.q("Creating new keys is not allowed.");
                return null;
            case 10:
                ie1 ie1Var = (ie1) v91Var;
                sd1 sd1Var8 = he1.f6702a;
                int i15 = ie1Var.f7116a;
                if (i15 == 32) {
                    zd1 zd1Var3 = new zd1(22);
                    zd1Var3.f13142v = ie1Var;
                    zd1Var3.f13143w = bl0.c(i15);
                    zd1Var3.f13144x = num;
                    return zd1Var3.r();
                }
                androidx.datastore.preferences.protobuf.s1.q("AesCmacKey size wrong, must be 32 bytes");
                return null;
            case 11:
                ne1 ne1Var = (ne1) v91Var;
                sd1 sd1Var9 = le1.f8018a;
                zd1 zd1Var4 = new zd1(23);
                zd1Var4.f13142v = ne1Var;
                zd1Var4.f13143w = bl0.c(ne1Var.f8678a);
                zd1Var4.f13144x = num;
                return zd1Var4.s();
            case 12:
                bj1 bj1Var = (bj1) v91Var;
                sd1 sd1Var10 = fj1.f6090a;
                ECParameterSpec eCParameterSpec = bj1Var.f4811b.f4528b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) yk1.f12903f.f12905a.o("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
                hq0 hq0Var2 = new hq0(i11, z3);
                hq0Var2.f6872v = bj1Var;
                hq0Var2.f6874x = num;
                hq0Var2.f6873w = eCPublicKey.getW();
                ej1 C2 = hq0Var2.C();
                mu muVar = new mu(10);
                muVar.f8422v = C2;
                muVar.f8423w = new to0(8, eCPrivateKey.getS());
                return muVar.m();
            case 13:
                gj1 gj1Var = (gj1) v91Var;
                sd1 sd1Var11 = ij1.f7148a;
                byte[] a10 = ae1.a(32);
                if (a10.length == 32) {
                    return hj1.h0(jj1.h0(gj1Var.f6417a, gl1.a(Arrays.copyOf(ed1.m(ed1.w(a10)), 32)), num), new bl0(12, gl1.a(Arrays.copyOf(a10, a10.length))));
                }
                q.x.n("Given secret seed length is not 32");
                return null;
            case 14:
                pj1 pj1Var = (pj1) v91Var;
                sd1 sd1Var12 = sj1.f10627a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) yk1.f12903f.f12905a.o("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(pj1Var.f9533a, new BigInteger(1, pj1Var.f9534b.toByteArray())));
                KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair2.getPrivate();
                zd1 zd1Var5 = new zd1(i11);
                zd1Var5.f13142v = pj1Var;
                zd1Var5.f13143w = rSAPublicKey.getModulus();
                zd1Var5.f13144x = num;
                rj1 t3 = zd1Var5.t();
                a8 a8Var = new a8(false);
                a8Var.f4405u = t3;
                to0 to0Var = new to0(8, rSAPrivateCrtKey.getPrimeP());
                to0 to0Var2 = new to0(8, rSAPrivateCrtKey.getPrimeQ());
                a8Var.f4407w = to0Var;
                a8Var.f4408x = to0Var2;
                a8Var.f4406v = new to0(8, rSAPrivateCrtKey.getPrivateExponent());
                to0 to0Var3 = new to0(8, rSAPrivateCrtKey.getPrimeExponentP());
                to0 to0Var4 = new to0(8, rSAPrivateCrtKey.getPrimeExponentQ());
                a8Var.f4409y = to0Var3;
                a8Var.f4410z = to0Var4;
                a8Var.A = new to0(8, rSAPrivateCrtKey.getCrtCoefficient());
                return a8Var.g();
            default:
                vj1 vj1Var = (vj1) v91Var;
                sd1 sd1Var13 = yj1.f12889a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) yk1.f12903f.f12905a.o("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(vj1Var.f11923a, new BigInteger(1, vj1Var.f11924b.toByteArray())));
                KeyPair generateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) generateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) generateKeyPair3.getPrivate();
                hq0 hq0Var3 = new hq0(25, z3);
                hq0Var3.f6872v = vj1Var;
                hq0Var3.f6873w = rSAPublicKey2.getModulus();
                hq0Var3.f6874x = num;
                xj1 D = hq0Var3.D();
                a8 a8Var2 = new a8(false);
                a8Var2.f4405u = D;
                to0 to0Var5 = new to0(8, rSAPrivateCrtKey2.getPrimeP());
                to0 to0Var6 = new to0(8, rSAPrivateCrtKey2.getPrimeQ());
                a8Var2.f4407w = to0Var5;
                a8Var2.f4408x = to0Var6;
                a8Var2.f4406v = new to0(8, rSAPrivateCrtKey2.getPrivateExponent());
                to0 to0Var7 = new to0(8, rSAPrivateCrtKey2.getPrimeExponentP());
                to0 to0Var8 = new to0(8, rSAPrivateCrtKey2.getPrimeExponentQ());
                a8Var2.f4409y = to0Var7;
                a8Var2.f4410z = to0Var8;
                a8Var2.A = new to0(8, rSAPrivateCrtKey2.getCrtCoefficient());
                return a8Var2.h();
        }
    }
}
