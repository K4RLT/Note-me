package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final /* synthetic */ class hc1 implements vc1, od1, xc1, td1, md1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6677u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ hc1 f6672v = new hc1(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ hc1 f6673w = new hc1(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ hc1 f6674x = new hc1(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ hc1 f6675y = new hc1(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ hc1 f6676z = new hc1(4);
    public static final /* synthetic */ hc1 A = new hc1(5);
    public static final /* synthetic */ hc1 B = new hc1(6);
    public static final /* synthetic */ hc1 C = new hc1(7);
    public static final /* synthetic */ hc1 D = new hc1(8);
    public static final /* synthetic */ hc1 E = new hc1(9);
    public static final /* synthetic */ hc1 F = new hc1(10);
    public static final /* synthetic */ hc1 G = new hc1(11);
    public static final /* synthetic */ hc1 H = new hc1(12);
    public static final /* synthetic */ hc1 I = new hc1(13);
    public static final /* synthetic */ hc1 J = new hc1(14);
    public static final /* synthetic */ hc1 K = new hc1(15);
    public static final /* synthetic */ hc1 L = new hc1(16);
    public static final /* synthetic */ hc1 M = new hc1(18);
    public static final /* synthetic */ hc1 N = new hc1(19);
    public static final /* synthetic */ hc1 O = new hc1(20);
    public static final /* synthetic */ hc1 P = new hc1(21);
    public static final /* synthetic */ hc1 Q = new hc1(22);
    public static final /* synthetic */ hc1 R = new hc1(23);
    public static final /* synthetic */ hc1 S = new hc1(24);
    public static final /* synthetic */ hc1 T = new hc1(25);
    public static final /* synthetic */ hc1 U = new hc1(26);
    public static final /* synthetic */ hc1 V = new hc1(27);
    public static final /* synthetic */ hc1 W = new hc1(28);
    public static final /* synthetic */ hc1 X = new hc1(29);

    public /* synthetic */ hc1(int i) {
        this.f6677u = i;
    }

    public static Cipher e() {
        try {
            Cipher cipher = (Cipher) jc1.f7420a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.td1, com.google.android.gms.internal.ads.xc1
    public Object a(xy xyVar) {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        KeyFactory keyFactory3;
        z91 b10;
        byte[] bArr4;
        Signature signature;
        byte[] bArr5;
        Integer num = null;
        switch (this.f6677u) {
            case 4:
                ge1 ge1Var = (ge1) xyVar;
                sd1 sd1Var = he1.f6702a;
                if (ge1Var.P.f7116a == 32) {
                    if (ct.i(1)) {
                        Provider h3 = x21.h();
                        if (h3 != null) {
                            try {
                                return ue1.a(ge1Var, h3);
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        return new Object();
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Cannot use AES-CMAC in FIPS-mode.");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("AesCmacKey size wrong, must be 32 bytes");
                return null;
            case 5:
                ge1 ge1Var2 = (ge1) xyVar;
                sd1 sd1Var2 = he1.f6702a;
                if (ge1Var2.P.f7116a == 32) {
                    return new bl1(ge1Var2);
                }
                androidx.datastore.preferences.protobuf.s1.q("AesCmacKey size wrong, must be 32 bytes");
                return null;
            case 6:
                Object obj = new Object();
                if (ct.i(2)) {
                    return obj;
                }
                androidx.datastore.preferences.protobuf.s1.q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                return null;
            case 7:
                return new bl1((ke1) xyVar);
            case 8:
                cd1 cd1Var = (cd1) xyVar;
                yd1 yd1Var = cd1Var.P;
                Object obj2 = yd1Var.f12858x;
                x91 x91Var = (x91) yd1Var.f12859y;
                ed1.I(x91Var);
                ed1.f(x91Var, (Integer) cd1Var.P.f12860z).b();
                return new Object();
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                xj1 xj1Var = (xj1) xyVar;
                j6.c cVar = fl1.f6104a;
                try {
                    return ok1.d(xj1Var);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory4 = (KeyFactory) yk1.f12904g.f12905a.o("RSA");
                    BigInteger bigInteger = xj1Var.Q;
                    vj1 vj1Var = xj1Var.P;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory4.generatePublic(new RSAPublicKeySpec(bigInteger, vj1Var.f11924b));
                    j6.c cVar2 = fl1.f6104a;
                    zk1 zk1Var = (zk1) cVar2.m(vj1Var.f11926d);
                    zk1 zk1Var2 = (zk1) cVar2.m(vj1Var.e);
                    int i = vj1Var.f11927f;
                    byte[] b11 = xj1Var.R.b();
                    if (vj1Var.f11925c.equals(w91.f12193t)) {
                        bArr5 = fl1.f6106c;
                    } else {
                        bArr5 = fl1.f6105b;
                    }
                    return new el1(rSAPublicKey, zk1Var, zk1Var2, i, b11, bArr5);
                }
            case 18:
                cj1 cj1Var = (cj1) xyVar;
                Provider h10 = x21.h();
                zk1 zk1Var3 = (zk1) ek1.i.m(cj1Var.P.P.f4812c);
                j6.c cVar3 = ek1.f5704j;
                ej1 ej1Var = cj1Var.P;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) cj1Var.Q.f11406v, b80.s((uk1) ek1.f5705k.m(ej1Var.P.f4811b)));
                if (h10 != null) {
                    keyFactory = KeyFactory.getInstance("EC", h10);
                } else {
                    keyFactory = (KeyFactory) yk1.f12904g.f12905a.o("EC");
                }
                ej1Var.R.b();
                Object obj3 = new Object();
                if (ct.i(2)) {
                    an1.t(zk1Var3);
                    zk1Var3.toString().concat("withECDSA");
                    return obj3;
                }
                androidx.datastore.preferences.protobuf.s1.q("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                return null;
            case 19:
                ej1 ej1Var2 = (ej1) xyVar;
                byte[] bArr6 = ek1.f5702g;
                Provider h11 = x21.h();
                j6.c cVar4 = ek1.f5705k;
                bj1 bj1Var = ej1Var2.P;
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(ej1Var2.Q, b80.s((uk1) cVar4.m(bj1Var.f4811b)));
                if (h11 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", h11);
                } else {
                    keyFactory2 = (KeyFactory) yk1.f12904g.f12905a.o("EC");
                }
                ECPublicKey eCPublicKey = (ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec);
                zk1 zk1Var4 = (zk1) ek1.i.m(bj1Var.f4812c);
                vk1 vk1Var = (vk1) ek1.f5704j.m(bj1Var.f4810a);
                byte[] b12 = ej1Var2.R.b();
                if (bj1Var.f4813d.equals(x91.f12523x)) {
                    bArr = ek1.f5703h;
                } else {
                    bArr = ek1.f5702g;
                }
                return new ek1(eCPublicKey, zk1Var4, vk1Var, b12, bArr, h11);
            case 20:
                hj1 hj1Var = (hj1) xyVar;
                if (ct.i(1)) {
                    try {
                        return gk1.a(hj1Var);
                    } catch (GeneralSecurityException unused3) {
                        bl0 bl0Var = hj1Var.Q;
                        jj1 jj1Var = hj1Var.P;
                        byte[] b13 = ((gl1) bl0Var.f4819v).b();
                        jj1Var.R.b();
                        Object obj4 = new Object();
                        if (ct.i(1)) {
                            if (b13.length == 32) {
                                ed1.m(ed1.w(b13));
                                return obj4;
                            }
                            q.x.n("Given private key's length is not 32");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Can not use Ed25519 in FIPS-mode.");
                        return null;
                    }
                }
                androidx.datastore.preferences.protobuf.s1.q("Can not use Ed25519 in FIPS-mode.");
                return null;
            case gl.zzm /* 21 */:
                jj1 jj1Var2 = (jj1) xyVar;
                if (ct.i(1)) {
                    try {
                        return hk1.b(jj1Var2);
                    } catch (GeneralSecurityException unused4) {
                        byte[] b14 = jj1Var2.Q.b();
                        byte[] b15 = jj1Var2.R.b();
                        if (jj1Var2.P.f6417a.equals(ja1.M)) {
                            bArr2 = new byte[]{0};
                        } else {
                            bArr2 = new byte[0];
                        }
                        return new ik1(b14, b15, bArr2);
                    }
                }
                androidx.datastore.preferences.protobuf.s1.q("Can not use Ed25519 in FIPS-mode.");
                return null;
            case 22:
                yd1 yd1Var2 = ((cd1) xyVar).P;
                Object obj5 = yd1Var2.f12858x;
                ed1.f((x91) yd1Var2.f12859y, (Integer) yd1Var2.f12860z).b();
                return new Object();
            case 23:
                yd1 yd1Var3 = ((cd1) xyVar).P;
                Object obj6 = yd1Var3.f12858x;
                z91 z91Var = (z91) tc1.f11325d.b(z91.class, (String) yd1Var3.f12855u).a((om1) yd1Var3.f12857w);
                x91 x91Var2 = (x91) yd1Var3.f12859y;
                byte[] b16 = ed1.f(x91Var2, (Integer) yd1Var3.f12860z).b();
                if (x91Var2.equals(x91.e)) {
                    bArr3 = new byte[]{0};
                } else {
                    bArr3 = new byte[0];
                }
                return new ik1(z91Var, b16, bArr3);
            case 24:
                qj1 qj1Var = (qj1) xyVar;
                int i10 = fe1.f6052a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                        num = Integer.valueOf(Build.VERSION.SDK_INT);
                    }
                    num.getClass();
                }
                Provider h12 = x21.h();
                if (h12 != null) {
                    keyFactory3 = KeyFactory.getInstance("RSA", h12);
                } else {
                    keyFactory3 = (KeyFactory) yk1.f12904g.f12905a.o("RSA");
                }
                rj1 rj1Var = qj1Var.P;
                BigInteger bigInteger2 = rj1Var.Q;
                pj1 pj1Var = rj1Var.P;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory3.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, pj1Var.f9534b, (BigInteger) qj1Var.Q.f11406v, (BigInteger) qj1Var.R.f11406v, (BigInteger) qj1Var.S.f11406v, (BigInteger) qj1Var.T.f11406v, (BigInteger) qj1Var.U.f11406v, (BigInteger) qj1Var.V.f11406v));
                if (h12 != null) {
                    b10 = lk1.c(rj1Var, h12);
                } else {
                    b10 = cl1.b(rj1Var);
                }
                z91 z91Var2 = b10;
                oj1 oj1Var = pj1Var.f9536d;
                byte[] b17 = rj1Var.R.b();
                if (pj1Var.f9535c.equals(q91.M)) {
                    bArr4 = kk1.f7788h;
                } else {
                    bArr4 = kk1.f7787g;
                }
                kk1 kk1Var = new kk1(rSAPrivateCrtKey, oj1Var, b17, bArr4, z91Var2, h12);
                Provider provider = kk1Var.f7793f;
                String str = kk1Var.f7790b;
                if (provider != null) {
                    signature = Signature.getInstance(str, provider);
                } else {
                    signature = (Signature) yk1.f12902d.f12905a.o(str);
                }
                signature.initSign(kk1Var.f7789a);
                byte[] bArr7 = kk1.i;
                signature.update(bArr7);
                byte[] bArr8 = kk1Var.f7792d;
                if (bArr8.length > 0) {
                    signature.update(bArr8);
                }
                byte[] sign = signature.sign();
                byte[] bArr9 = kk1Var.f7791c;
                if (bArr9.length > 0) {
                    sign = xy.z(bArr9, sign);
                }
                try {
                    kk1Var.e.a(sign, bArr7);
                    return kk1Var;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException("RSA signature computation error", e);
                }
            case 25:
                return cl1.b((rj1) xyVar);
            case 26:
                wj1 wj1Var = (wj1) xyVar;
                try {
                    return gk1.b(wj1Var);
                } catch (NoSuchProviderException unused5) {
                    KeyFactory keyFactory5 = (KeyFactory) yk1.f12904g.f12905a.o("RSA");
                    xj1 xj1Var2 = wj1Var.P;
                    xj1 xj1Var3 = wj1Var.P;
                    BigInteger bigInteger3 = xj1Var2.Q;
                    vj1 vj1Var2 = xj1Var3.P;
                    vj1 vj1Var3 = xj1Var3.P;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory5.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger3, vj1Var2.f11924b, (BigInteger) wj1Var.Q.f11406v, (BigInteger) wj1Var.R.f11406v, (BigInteger) wj1Var.S.f11406v, (BigInteger) wj1Var.T.f11406v, (BigInteger) wj1Var.U.f11406v, (BigInteger) wj1Var.V.f11406v));
                    j6.c cVar5 = fl1.f6104a;
                    zk1 zk1Var5 = (zk1) cVar5.m(vj1Var3.f11926d);
                    zk1 zk1Var6 = (zk1) cVar5.m(vj1Var3.e);
                    xj1Var3.R.b();
                    Object obj7 = new Object();
                    if (!lc1.a()) {
                        an1.t(zk1Var5);
                        if (zk1Var5.equals(zk1Var6)) {
                            an1.C(rSAPrivateCrtKey2.getModulus().bitLength());
                            an1.H(rSAPrivateCrtKey2.getPublicExponent());
                            return obj7;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("sigHash and mgf1Hash must be the same");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 b(v91 v91Var) {
        switch (this.f6677u) {
            case 1:
                nd1 nd1Var = ic1.f7103a;
                return zd1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ic1.a(((nb1) v91Var).f8641a), zi1.B().a());
            case 12:
                ie1 ie1Var = (ie1) v91Var;
                nd1 nd1Var2 = te1.f11333a;
                x91 a10 = te1.a(ie1Var.f7118c);
                ef1 C2 = ff1.C();
                gf1 A2 = hf1.A();
                int i = ie1Var.f7117b;
                A2.b();
                ((hf1) A2.f4845v).C(i);
                hf1 hf1Var = (hf1) A2.c();
                C2.b();
                ((ff1) C2.f4845v).E(hf1Var);
                int i10 = ie1Var.f7116a;
                C2.b();
                ((ff1) C2.f4845v).D(i10);
                return zd1.a("type.googleapis.com/google.crypto.tink.AesCmacKey", a10, ((ff1) C2.c()).a());
            default:
                ne1 ne1Var = (ne1) v91Var;
                j6.c cVar = ve1.f11893a;
                x91 a11 = ve1.a(ne1Var.f8680c);
                bh1 D2 = ch1.D();
                dh1 B2 = eh1.B();
                int i11 = ne1Var.f8679b;
                B2.b();
                ((eh1) B2.f4845v).E(i11);
                yg1 yg1Var = (yg1) ve1.f11893a.m(ne1Var.f8681d);
                B2.b();
                ((eh1) B2.f4845v).D(yg1Var);
                eh1 eh1Var = (eh1) B2.c();
                D2.b();
                ((ch1) D2.f4845v).F(eh1Var);
                int i12 = ne1Var.f8678a;
                D2.b();
                ((ch1) D2.f4845v).G(i12);
                return zd1.a("type.googleapis.com/google.crypto.tink.HmacKey", a11, ((ch1) D2.c()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public v91 c(zd1 zd1Var) {
        switch (this.f6677u) {
            case 9:
                nd1 nd1Var = te1.f11333a;
                ih1 ih1Var = (ih1) zd1Var.f13143w;
                if (ih1Var.z().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        om1 A2 = ih1Var.A();
                        wm1 wm1Var = wm1.f12302a;
                        int i = em1.f5727a;
                        ff1 B2 = ff1.B(A2, wm1.f12303b);
                        hq0 hq0Var = new hq0(23);
                        hq0Var.p(B2.z());
                        hq0Var.t(B2.A().z());
                        hq0Var.f6874x = te1.b((x91) zd1Var.f13144x);
                        return hq0Var.B();
                    } catch (pn1 e) {
                        throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
                    }
                }
                q.x.n("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var.z())));
                return null;
            case 13:
                j6.c cVar = ve1.f11893a;
                ih1 ih1Var2 = (ih1) zd1Var.f13143w;
                if (ih1Var2.z().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        om1 A3 = ih1Var2.A();
                        wm1 wm1Var2 = wm1.f12302a;
                        int i10 = em1.f5727a;
                        ch1 C2 = ch1.C(A3, wm1.f12303b);
                        if (C2.B() == 0) {
                            na1 na1Var = new na1(3);
                            na1Var.a(C2.A());
                            na1Var.d(C2.z().A());
                            na1Var.f8632d = (me1) ve1.f11893a.o(C2.z().z());
                            na1Var.e = ve1.b((x91) zd1Var.f13144x);
                            return na1Var.k();
                        }
                        int B3 = C2.B();
                        throw new GeneralSecurityException(a5.a.f(B3, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(B3).length() + 47)));
                    } catch (pn1 e8) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
                    }
                }
                q.x.n("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var2.z())));
                return null;
            default:
                nd1 nd1Var2 = dk1.f5448a;
                ih1 ih1Var3 = (ih1) zd1Var.f13143w;
                if (ih1Var3.z().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    try {
                        om1 A4 = ih1Var3.A();
                        wm1 wm1Var3 = wm1.f12302a;
                        int i11 = em1.f5727a;
                        lg1 A5 = lg1.A(A4, wm1.f12303b);
                        na1 na1Var2 = new na1(4);
                        na1Var2.f8632d = dk1.b(A5.z().z());
                        na1Var2.f8630b = dk1.h(A5.z().E());
                        na1Var2.f8631c = dk1.g(A5.z().D());
                        na1Var2.e = dk1.c((x91) zd1Var.f13144x);
                        return na1Var2.l();
                    } catch (pn1 e10) {
                        throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
                    }
                }
                q.x.n("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var3.z())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public xy d(yd1 yd1Var) {
        int i = 23;
        switch (this.f6677u) {
            case 0:
                nd1 nd1Var = ic1.f7103a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        om1 om1Var = (om1) yd1Var.f12857w;
                        wm1 wm1Var = wm1.f12302a;
                        int i10 = em1.f5727a;
                        yi1 B2 = yi1.B(om1Var, wm1.f12303b);
                        if (B2.z() == 0) {
                            return lb1.h0(ic1.b((x91) yd1Var.f12859y), new bl0(12, gl1.a(B2.A().a())), (Integer) yd1Var.f12860z);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing XChaCha20Poly1305Key failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                return null;
            case 11:
                nd1 nd1Var2 = te1.f11333a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        om1 om1Var2 = (om1) yd1Var.f12857w;
                        wm1 wm1Var2 = wm1.f12302a;
                        int i11 = em1.f5727a;
                        df1 C2 = df1.C(om1Var2, wm1.f12303b);
                        if (C2.z() == 0) {
                            hq0 hq0Var = new hq0(23);
                            hq0Var.p(C2.A().k());
                            hq0Var.t(C2.B().z());
                            hq0Var.f6874x = te1.b((x91) yd1Var.f12859y);
                            ie1 B3 = hq0Var.B();
                            zd1 zd1Var = new zd1(22);
                            zd1Var.f13142v = B3;
                            zd1Var.f13143w = new bl0(12, gl1.a(C2.A().a()));
                            zd1Var.f13144x = (Integer) yd1Var.f12860z;
                            return zd1Var.r();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused2) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing AesCmacKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                return null;
            default:
                j6.c cVar = ve1.f11893a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        om1 om1Var3 = (om1) yd1Var.f12857w;
                        wm1 wm1Var3 = wm1.f12302a;
                        int i12 = em1.f5727a;
                        ah1 C3 = ah1.C(om1Var3, wm1.f12303b);
                        if (C3.z() == 0) {
                            na1 na1Var = new na1(3);
                            na1Var.a(C3.B().k());
                            na1Var.d(C3.A().A());
                            na1Var.f8632d = (me1) ve1.f11893a.o(C3.A().z());
                            na1Var.e = ve1.b((x91) yd1Var.f12859y);
                            ne1 k3 = na1Var.k();
                            zd1 zd1Var2 = new zd1(i);
                            zd1Var2.f13142v = k3;
                            zd1Var2.f13143w = new bl0(12, gl1.a(C3.B().a()));
                            zd1Var2.f13144x = (Integer) yd1Var.f12860z;
                            return zd1Var2.s();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused3) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing HmacKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to HmacProtoSerialization.parseKey");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xc1
    public yd1 a(xy xyVar) {
        switch (this.f6677u) {
            case 3:
                yd1 yd1Var = ((cd1) xyVar).P;
                Object obj = yd1Var.f12858x;
                return yd1Var;
            case 10:
                ge1 ge1Var = (ge1) xyVar;
                nd1 nd1Var = te1.f11333a;
                cf1 D2 = df1.D();
                ie1 ie1Var = ge1Var.P;
                gf1 A2 = hf1.A();
                int i = ie1Var.f7117b;
                A2.b();
                ((hf1) A2.f4845v).C(i);
                hf1 hf1Var = (hf1) A2.c();
                D2.b();
                ((df1) D2.f4845v).G(hf1Var);
                byte[] b10 = ((gl1) ge1Var.Q.f4819v).b();
                mm1 z3 = om1.z(b10, 0, b10.length);
                D2.b();
                ((df1) D2.f4845v).F(z3);
                return yd1.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((df1) D2.c()).a(), w91.f12179d, te1.a(ge1Var.P.f7118c), ge1Var.S);
            case 14:
                ke1 ke1Var = (ke1) xyVar;
                j6.c cVar = ve1.f11893a;
                zg1 D3 = ah1.D();
                ne1 ne1Var = ke1Var.P;
                dh1 B2 = eh1.B();
                int i10 = ne1Var.f8679b;
                B2.b();
                ((eh1) B2.f4845v).E(i10);
                yg1 yg1Var = (yg1) ve1.f11893a.m(ne1Var.f8681d);
                B2.b();
                ((eh1) B2.f4845v).D(yg1Var);
                eh1 eh1Var = (eh1) B2.c();
                D3.b();
                ((ah1) D3.f4845v).G(eh1Var);
                byte[] b11 = ((gl1) ke1Var.Q.f4819v).b();
                mm1 z9 = om1.z(b11, 0, b11.length);
                D3.b();
                ((ah1) D3.f4845v).H(z9);
                return yd1.a("type.googleapis.com/google.crypto.tink.HmacKey", ((ah1) D3.c()).a(), w91.f12179d, ve1.a(ke1Var.P.f8680c), ke1Var.S);
            default:
                ej1 ej1Var = (ej1) xyVar;
                return yd1.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", dk1.f(ej1Var).a(), w91.f12180f, dk1.a(ej1Var.P.f4813d), ej1Var.S);
        }
    }
}
