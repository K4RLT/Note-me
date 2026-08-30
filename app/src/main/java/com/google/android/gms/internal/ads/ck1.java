package com.google.android.gms.internal.ads;
import j6.c;
import q.x;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.ECPoint;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final /* synthetic */ class ck1 implements vc1, xc1, od1, md1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5108u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ ck1 f5103v = new ck1(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ck1 f5104w = new ck1(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ck1 f5105x = new ck1(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ ck1 f5106y = new ck1(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ ck1 f5107z = new ck1(4);
    public static final /* synthetic */ ck1 A = new ck1(5);
    public static final /* synthetic */ ck1 B = new ck1(6);
    public static final /* synthetic */ ck1 C = new ck1(7);
    public static final /* synthetic */ ck1 D = new ck1(8);
    public static final /* synthetic */ ck1 E = new ck1(9);
    public static final /* synthetic */ ck1 F = new ck1(10);
    public static final /* synthetic */ ck1 G = new ck1(11);
    public static final /* synthetic */ ck1 H = new ck1(12);
    public static final /* synthetic */ ck1 I = new ck1(13);
    public static final /* synthetic */ ck1 J = new ck1(14);
    public static final /* synthetic */ ck1 K = new ck1(15);
    public static final /* synthetic */ ck1 L = new ck1(16);
    public static final /* synthetic */ ck1 M = new ck1(17);
    public static final /* synthetic */ ck1 N = new ck1(18);
    public static final /* synthetic */ ck1 O = new ck1(19);
    public static final /* synthetic */ ck1 P = new ck1(20);
    public static final /* synthetic */ ck1 Q = new ck1(21);

    public /* synthetic */ ck1(int i) {
        this.f5108u = i;
    }

    @Override // com.google.android.gms.internal.ads.xc1
    public yd1 a(xy xyVar) {
        switch (this.f5108u) {
            case 1:
                cj1 cj1Var = (cj1) xyVar;
                nd1 nd1Var = dk1.f5448a;
                int d2 = dk1.d(cj1Var.P.P.f4811b);
                og1 D2 = qg1.D();
                ej1 ej1Var = cj1Var.P;
                sg1 f10 = dk1.f(ej1Var);
                D2.b();
                ((qg1) D2.f4845v).F(f10);
                byte[] x9 = b80.x((BigInteger) cj1Var.Q.f11406v, d2);
                mm1 mm1Var = om1.f9167v;
                mm1 z3 = om1.z(x9, 0, x9.length);
                D2.b();
                ((qg1) D2.f4845v).G(z3);
                return yd1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((qg1) D2.c()).a(), w91.e, dk1.a(ej1Var.P.f4813d), ej1Var.S);
            case 5:
                jj1 jj1Var = (jj1) xyVar;
                return yd1.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", fk1.c(jj1Var).a(), w91.f12180f, fk1.a(jj1Var.P.f6417a), jj1Var.S);
            case 7:
                hj1 hj1Var = (hj1) xyVar;
                nd1 nd1Var2 = fk1.f6099a;
                ug1 D3 = vg1.D();
                xg1 c10 = fk1.c(hj1Var.P);
                D3.b();
                ((vg1) D3.f4845v).G(c10);
                byte[] b10 = ((gl1) hj1Var.Q.f4819v).b();
                mm1 z9 = om1.z(b10, 0, b10.length);
                D3.b();
                ((vg1) D3.f4845v).F(z9);
                mm1 a10 = ((vg1) D3.c()).a();
                w91 w91Var = w91.e;
                jj1 jj1Var2 = hj1Var.P;
                return yd1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", a10, w91Var, fk1.a(jj1Var2.P.f6417a), jj1Var2.S);
            case 11:
                rj1 rj1Var = (rj1) xyVar;
                return yd1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", jk1.c(rj1Var).a(), w91.f12180f, jk1.a(rj1Var.P.f9535c), rj1Var.S);
            case 13:
                qj1 qj1Var = (qj1) xyVar;
                nd1 nd1Var3 = jk1.f7467a;
                fi1 I2 = gi1.I();
                I2.b();
                ((gi1) I2.f4845v).K();
                ii1 c11 = jk1.c(qj1Var.P);
                I2.b();
                ((gi1) I2.f4845v).L(c11);
                byte[] o10 = b80.o((BigInteger) qj1Var.Q.f11406v);
                mm1 mm1Var2 = om1.f9167v;
                mm1 z10 = om1.z(o10, 0, o10.length);
                I2.b();
                ((gi1) I2.f4845v).M(z10);
                byte[] o11 = b80.o((BigInteger) qj1Var.R.f11406v);
                mm1 z11 = om1.z(o11, 0, o11.length);
                I2.b();
                ((gi1) I2.f4845v).N(z11);
                byte[] o12 = b80.o((BigInteger) qj1Var.S.f11406v);
                mm1 z12 = om1.z(o12, 0, o12.length);
                I2.b();
                ((gi1) I2.f4845v).O(z12);
                byte[] o13 = b80.o((BigInteger) qj1Var.T.f11406v);
                mm1 z13 = om1.z(o13, 0, o13.length);
                I2.b();
                ((gi1) I2.f4845v).P(z13);
                byte[] o14 = b80.o((BigInteger) qj1Var.U.f11406v);
                mm1 z14 = om1.z(o14, 0, o14.length);
                I2.b();
                ((gi1) I2.f4845v).Q(z14);
                byte[] o15 = b80.o((BigInteger) qj1Var.V.f11406v);
                mm1 z15 = om1.z(o15, 0, o15.length);
                I2.b();
                ((gi1) I2.f4845v).R(z15);
                mm1 a11 = ((gi1) I2.c()).a();
                w91 w91Var2 = w91.e;
                rj1 rj1Var2 = qj1Var.P;
                return yd1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a11, w91Var2, jk1.a(rj1Var2.P.f9535c), rj1Var2.S);
            case 17:
                xj1 xj1Var = (xj1) xyVar;
                return yd1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", nk1.d(xj1Var).a(), w91.f12180f, nk1.a(xj1Var.P.f11925c), xj1Var.S);
            default:
                wj1 wj1Var = (wj1) xyVar;
                nd1 nd1Var4 = nk1.f8742a;
                ni1 I3 = oi1.I();
                I3.b();
                ((oi1) I3.f4845v).K();
                qi1 d10 = nk1.d(wj1Var.P);
                I3.b();
                ((oi1) I3.f4845v).L(d10);
                byte[] o16 = b80.o((BigInteger) wj1Var.Q.f11406v);
                mm1 mm1Var3 = om1.f9167v;
                mm1 z16 = om1.z(o16, 0, o16.length);
                I3.b();
                ((oi1) I3.f4845v).M(z16);
                byte[] o17 = b80.o((BigInteger) wj1Var.R.f11406v);
                mm1 z17 = om1.z(o17, 0, o17.length);
                I3.b();
                ((oi1) I3.f4845v).N(z17);
                byte[] o18 = b80.o((BigInteger) wj1Var.S.f11406v);
                mm1 z18 = om1.z(o18, 0, o18.length);
                I3.b();
                ((oi1) I3.f4845v).O(z18);
                byte[] o19 = b80.o((BigInteger) wj1Var.T.f11406v);
                mm1 z19 = om1.z(o19, 0, o19.length);
                I3.b();
                ((oi1) I3.f4845v).P(z19);
                byte[] o20 = b80.o((BigInteger) wj1Var.U.f11406v);
                mm1 z20 = om1.z(o20, 0, o20.length);
                I3.b();
                ((oi1) I3.f4845v).Q(z20);
                byte[] o21 = b80.o((BigInteger) wj1Var.V.f11406v);
                mm1 z21 = om1.z(o21, 0, o21.length);
                I3.b();
                ((oi1) I3.f4845v).R(z21);
                mm1 a12 = ((oi1) I3.c()).a();
                w91 w91Var3 = w91.e;
                xj1 xj1Var2 = wj1Var.P;
                return yd1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a12, w91Var3, nk1.a(xj1Var2.P.f11925c), xj1Var2.S);
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 b(v91 v91Var) {
        switch (this.f5108u) {
            case 3:
                bj1 bj1Var = (bj1) v91Var;
                nd1 nd1Var = dk1.f5448a;
                x91 a10 = dk1.a(bj1Var.f4813d);
                kg1 B2 = lg1.B();
                ng1 e = dk1.e(bj1Var);
                B2.b();
                ((lg1) B2.f4845v).C(e);
                return zd1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", a10, ((lg1) B2.c()).a());
            case 9:
                nd1 nd1Var2 = fk1.f6099a;
                return zd1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", fk1.a(((gj1) v91Var).f6417a), tg1.B().a());
            case 15:
                pj1 pj1Var = (pj1) v91Var;
                nd1 nd1Var3 = jk1.f7467a;
                x91 a11 = jk1.a(pj1Var.f9535c);
                bi1 D2 = ci1.D();
                di1 A2 = ei1.A();
                yg1 yg1Var = (yg1) jk1.f7472g.m(pj1Var.f9536d);
                A2.b();
                ((ei1) A2.f4845v).C(yg1Var);
                ei1 ei1Var = (ei1) A2.c();
                D2.b();
                ((ci1) D2.f4845v).E(ei1Var);
                int i = pj1Var.f9533a;
                D2.b();
                ((ci1) D2.f4845v).F(i);
                byte[] o10 = b80.o(pj1Var.f9534b);
                mm1 mm1Var = om1.f9167v;
                mm1 z3 = om1.z(o10, 0, o10.length);
                D2.b();
                ((ci1) D2.f4845v).G(z3);
                return zd1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a11, ((ci1) D2.c()).a());
            default:
                vj1 vj1Var = (vj1) v91Var;
                nd1 nd1Var4 = nk1.f8742a;
                x91 a12 = nk1.a(vj1Var.f11925c);
                ji1 D3 = ki1.D();
                mi1 c10 = nk1.c(vj1Var);
                D3.b();
                ((ki1) D3.f4845v).E(c10);
                int i10 = vj1Var.f11923a;
                D3.b();
                ((ki1) D3.f4845v).F(i10);
                byte[] o11 = b80.o(vj1Var.f11924b);
                mm1 mm1Var2 = om1.f9167v;
                mm1 z9 = om1.z(o11, 0, o11.length);
                D3.b();
                ((ki1) D3.f4845v).G(z9);
                return zd1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a12, ((ki1) D3.c()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public v91 c(zd1 zd1Var) {
        switch (this.f5108u) {
            case 4:
                nd1 nd1Var = fk1.f6099a;
                ih1 ih1Var = (ih1) zd1Var.f13143w;
                if (ih1Var.z().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    try {
                        om1 A2 = ih1Var.A();
                        wm1 wm1Var = wm1.f12302a;
                        int i = em1.f5727a;
                        if (tg1.A(A2, wm1.f12303b).z() == 0) {
                            return new gj1(fk1.b((x91) zd1Var.f13144x));
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 e) {
                        throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
                    }
                }
                q.x.n("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var.z())));
                return null;
            case 10:
                nd1 nd1Var2 = jk1.f7467a;
                ih1 ih1Var2 = (ih1) zd1Var.f13143w;
                if (ih1Var2.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    try {
                        om1 A3 = ih1Var2.A();
                        wm1 wm1Var2 = wm1.f12302a;
                        int i10 = em1.f5727a;
                        ci1 C2 = ci1.C(A3, wm1.f12303b);
                        BigInteger bigInteger = pj1.e;
                        nj1 nj1Var = new nj1();
                        nj1Var.f8738c = (oj1) jk1.f7472g.o(C2.z().z());
                        nj1Var.f8737b = new BigInteger(1, C2.B().a());
                        nj1Var.a(C2.A());
                        nj1Var.f8739d = jk1.b((x91) zd1Var.f13144x);
                        return nj1Var.b();
                    } catch (pn1 e8) {
                        throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e8);
                    }
                }
                q.x.n("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var2.z())));
                return null;
            default:
                nd1 nd1Var3 = nk1.f8742a;
                ih1 ih1Var3 = (ih1) zd1Var.f13143w;
                if (ih1Var3.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    try {
                        om1 A4 = ih1Var3.A();
                        wm1 wm1Var3 = wm1.f12302a;
                        int i11 = em1.f5727a;
                        ki1 C3 = ki1.C(A4, wm1.f12303b);
                        BigInteger bigInteger2 = vj1.f11922g;
                        tj1 tj1Var = new tj1();
                        j6.c cVar = nk1.f8747g;
                        tj1Var.f11362c = (uj1) cVar.o(C3.z().z());
                        tj1Var.f11363d = (uj1) cVar.o(C3.z().A());
                        tj1Var.f11361b = new BigInteger(1, C3.B().a());
                        tj1Var.a(C3.A());
                        tj1Var.b(C3.z().B());
                        tj1Var.f11364f = nk1.b((x91) zd1Var.f13144x);
                        return tj1Var.c();
                    } catch (pn1 e10) {
                        throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
                    }
                }
                q.x.n("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var3.z())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public xy d(yd1 yd1Var) {
        int i = 25;
        int i10 = 24;
        boolean z3 = false;
        switch (this.f5108u) {
            case 0:
                nd1 nd1Var = dk1.f5448a;
                String str = (String) yd1Var.f12855u;
                if (str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    try {
                        om1 om1Var = (om1) yd1Var.f12857w;
                        wm1 wm1Var = wm1.f12302a;
                        int i11 = em1.f5727a;
                        sg1 D2 = sg1.D(om1Var, wm1.f12303b);
                        if (D2.z() == 0) {
                            na1 na1Var = new na1(4);
                            na1Var.f8632d = dk1.b(D2.A().z());
                            na1Var.f8630b = dk1.h(D2.A().E());
                            na1Var.f8631c = dk1.g(D2.A().D());
                            na1Var.e = dk1.c((x91) yd1Var.f12859y);
                            bj1 l10 = na1Var.l();
                            hq0 hq0Var = new hq0(i10, z3);
                            hq0Var.f6872v = l10;
                            hq0Var.f6873w = new ECPoint(new BigInteger(1, D2.B().a()), new BigInteger(1, D2.C().a()));
                            hq0Var.f6874x = (Integer) yd1Var.f12860z;
                            return hq0Var.C();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing EcdsaPublicKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                return null;
            case 2:
                nd1 nd1Var2 = dk1.f5448a;
                String str2 = (String) yd1Var.f12855u;
                if (str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    try {
                        om1 om1Var2 = (om1) yd1Var.f12857w;
                        wm1 wm1Var2 = wm1.f12302a;
                        int i12 = em1.f5727a;
                        qg1 C2 = qg1.C(om1Var2, wm1.f12303b);
                        if (C2.z() == 0) {
                            sg1 A2 = C2.A();
                            if (A2.z() == 0) {
                                na1 na1Var2 = new na1(4);
                                na1Var2.f8632d = dk1.b(A2.A().z());
                                na1Var2.f8630b = dk1.h(A2.A().E());
                                na1Var2.f8631c = dk1.g(A2.A().D());
                                na1Var2.e = dk1.c((x91) yd1Var.f12859y);
                                bj1 l11 = na1Var2.l();
                                hq0 hq0Var2 = new hq0(i10, z3);
                                hq0Var2.f6872v = l11;
                                hq0Var2.f6873w = new ECPoint(new BigInteger(1, A2.B().a()), new BigInteger(1, A2.C().a()));
                                hq0Var2.f6874x = (Integer) yd1Var.f12860z;
                                ej1 C3 = hq0Var2.C();
                                mu muVar = new mu(10);
                                muVar.f8422v = C3;
                                muVar.f8423w = new to0(8, new BigInteger(1, C2.B().a()));
                                return muVar.m();
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused2) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing EcdsaPrivateKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                return null;
            case 6:
                nd1 nd1Var3 = fk1.f6099a;
                String str3 = (String) yd1Var.f12855u;
                if (str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    try {
                        om1 om1Var3 = (om1) yd1Var.f12857w;
                        wm1 wm1Var3 = wm1.f12302a;
                        int i13 = em1.f5727a;
                        xg1 B2 = xg1.B(om1Var3, wm1.f12303b);
                        if (B2.z() == 0) {
                            return jj1.h0(fk1.b((x91) yd1Var.f12859y), gl1.a(B2.A().a()), (Integer) yd1Var.f12860z);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused3) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing Ed25519PublicKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                return null;
            case 8:
                nd1 nd1Var4 = fk1.f6099a;
                String str4 = (String) yd1Var.f12855u;
                if (str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    try {
                        om1 om1Var4 = (om1) yd1Var.f12857w;
                        wm1 wm1Var4 = wm1.f12302a;
                        int i14 = em1.f5727a;
                        vg1 C4 = vg1.C(om1Var4, wm1.f12303b);
                        if (C4.z() == 0) {
                            xg1 B3 = C4.B();
                            if (B3.z() == 0) {
                                return hj1.h0(jj1.h0(fk1.b((x91) yd1Var.f12859y), gl1.a(B3.A().a()), (Integer) yd1Var.f12860z), new bl0(12, gl1.a(C4.A().a())));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused4) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing Ed25519PrivateKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                return null;
            case 12:
                nd1 nd1Var5 = jk1.f7467a;
                String str5 = (String) yd1Var.f12855u;
                if (str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    try {
                        om1 om1Var5 = (om1) yd1Var.f12857w;
                        wm1 wm1Var5 = wm1.f12302a;
                        int i15 = em1.f5727a;
                        ii1 D3 = ii1.D(om1Var5, wm1.f12303b);
                        if (D3.z() == 0) {
                            BigInteger bigInteger = new BigInteger(1, D3.B().a());
                            int bitLength = bigInteger.bitLength();
                            BigInteger bigInteger2 = pj1.e;
                            nj1 nj1Var = new nj1();
                            nj1Var.f8738c = (oj1) jk1.f7472g.o(D3.A().z());
                            nj1Var.f8737b = new BigInteger(1, D3.C().a());
                            nj1Var.a(bitLength);
                            nj1Var.f8739d = jk1.b((x91) yd1Var.f12859y);
                            pj1 b10 = nj1Var.b();
                            zd1 zd1Var = new zd1(i10);
                            zd1Var.f13142v = b10;
                            zd1Var.f13143w = bigInteger;
                            zd1Var.f13144x = (Integer) yd1Var.f12860z;
                            return zd1Var.t();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused5) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing RsaSsaPkcs1PublicKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                return null;
            case 14:
                nd1 nd1Var6 = jk1.f7467a;
                String str6 = (String) yd1Var.f12855u;
                if (str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    try {
                        om1 om1Var6 = (om1) yd1Var.f12857w;
                        wm1 wm1Var6 = wm1.f12302a;
                        int i16 = em1.f5727a;
                        gi1 H2 = gi1.H(om1Var6, wm1.f12303b);
                        if (H2.z() == 0) {
                            ii1 A3 = H2.A();
                            if (A3.z() == 0) {
                                BigInteger bigInteger3 = new BigInteger(1, A3.B().a());
                                int bitLength2 = bigInteger3.bitLength();
                                BigInteger bigInteger4 = new BigInteger(1, A3.C().a());
                                BigInteger bigInteger5 = pj1.e;
                                nj1 nj1Var2 = new nj1();
                                nj1Var2.f8738c = (oj1) jk1.f7472g.o(A3.A().z());
                                nj1Var2.f8737b = bigInteger4;
                                nj1Var2.a(bitLength2);
                                nj1Var2.f8739d = jk1.b((x91) yd1Var.f12859y);
                                pj1 b11 = nj1Var2.b();
                                zd1 zd1Var2 = new zd1(i10);
                                zd1Var2.f13142v = b11;
                                zd1Var2.f13143w = bigInteger3;
                                zd1Var2.f13144x = (Integer) yd1Var.f12860z;
                                rj1 t3 = zd1Var2.t();
                                a8 a8Var = new a8(z3);
                                a8Var.f4405u = t3;
                                to0 d2 = jk1.d(H2.C());
                                to0 d10 = jk1.d(H2.D());
                                a8Var.f4407w = d2;
                                a8Var.f4408x = d10;
                                a8Var.f4406v = jk1.d(H2.B());
                                to0 d11 = jk1.d(H2.E());
                                to0 d12 = jk1.d(H2.F());
                                a8Var.f4409y = d11;
                                a8Var.f4410z = d12;
                                a8Var.A = jk1.d(H2.G());
                                return a8Var.g();
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused6) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing RsaSsaPkcs1PrivateKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                return null;
            case 18:
                nd1 nd1Var7 = nk1.f8742a;
                String str7 = (String) yd1Var.f12855u;
                if (str7.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    try {
                        om1 om1Var7 = (om1) yd1Var.f12857w;
                        wm1 wm1Var7 = wm1.f12302a;
                        int i17 = em1.f5727a;
                        qi1 D4 = qi1.D(om1Var7, wm1.f12303b);
                        if (D4.z() == 0) {
                            BigInteger bigInteger6 = new BigInteger(1, D4.B().a());
                            int bitLength3 = bigInteger6.bitLength();
                            BigInteger bigInteger7 = vj1.f11922g;
                            tj1 tj1Var = new tj1();
                            j6.c cVar = nk1.f8747g;
                            tj1Var.f11362c = (uj1) cVar.o(D4.A().z());
                            tj1Var.f11363d = (uj1) cVar.o(D4.A().A());
                            tj1Var.f11361b = new BigInteger(1, D4.C().a());
                            tj1Var.a(bitLength3);
                            tj1Var.b(D4.A().B());
                            tj1Var.f11364f = nk1.b((x91) yd1Var.f12859y);
                            vj1 c10 = tj1Var.c();
                            hq0 hq0Var3 = new hq0(i, z3);
                            hq0Var3.f6872v = c10;
                            hq0Var3.f6873w = bigInteger6;
                            hq0Var3.f6874x = (Integer) yd1Var.f12860z;
                            return hq0Var3.D();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused7) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing RsaSsaPssPublicKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str7)));
                return null;
            default:
                nd1 nd1Var8 = nk1.f8742a;
                String str8 = (String) yd1Var.f12855u;
                if (str8.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    try {
                        om1 om1Var8 = (om1) yd1Var.f12857w;
                        wm1 wm1Var8 = wm1.f12302a;
                        int i18 = em1.f5727a;
                        oi1 H3 = oi1.H(om1Var8, wm1.f12303b);
                        if (H3.z() == 0) {
                            qi1 A4 = H3.A();
                            if (A4.z() == 0) {
                                BigInteger bigInteger8 = new BigInteger(1, A4.B().a());
                                int bitLength4 = bigInteger8.bitLength();
                                BigInteger bigInteger9 = new BigInteger(1, A4.C().a());
                                BigInteger bigInteger10 = vj1.f11922g;
                                tj1 tj1Var2 = new tj1();
                                j6.c cVar2 = nk1.f8747g;
                                tj1Var2.f11362c = (uj1) cVar2.o(A4.A().z());
                                tj1Var2.f11363d = (uj1) cVar2.o(A4.A().A());
                                tj1Var2.f11361b = bigInteger9;
                                tj1Var2.a(bitLength4);
                                tj1Var2.b(A4.A().B());
                                tj1Var2.f11364f = nk1.b((x91) yd1Var.f12859y);
                                vj1 c11 = tj1Var2.c();
                                hq0 hq0Var4 = new hq0(i, z3);
                                hq0Var4.f6872v = c11;
                                hq0Var4.f6873w = bigInteger8;
                                hq0Var4.f6874x = (Integer) yd1Var.f12860z;
                                xj1 D5 = hq0Var4.D();
                                a8 a8Var2 = new a8(z3);
                                a8Var2.f4405u = D5;
                                to0 e = nk1.e(H3.C());
                                to0 e8 = nk1.e(H3.D());
                                a8Var2.f4407w = e;
                                a8Var2.f4408x = e8;
                                a8Var2.f4406v = nk1.e(H3.B());
                                to0 e10 = nk1.e(H3.E());
                                to0 e11 = nk1.e(H3.F());
                                a8Var2.f4409y = e10;
                                a8Var2.f4410z = e11;
                                a8Var2.A = nk1.e(H3.G());
                                return a8Var2.h();
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 | IllegalArgumentException unused8) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing RsaSsaPssPrivateKey failed");
                        return null;
                    }
                }
                q.x.n("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str8)));
                return null;
        }
    }

    public /* bridge */ Object e(String str, Provider provider) {
        switch (this.f5108u) {
            case 22:
                if (provider == null) {
                    return Cipher.getInstance(str);
                }
                return Cipher.getInstance(str, provider);
            case 23:
                if (provider == null) {
                    return KeyAgreement.getInstance(str);
                }
                return KeyAgreement.getInstance(str, provider);
            case 24:
                if (provider == null) {
                    return KeyFactory.getInstance(str);
                }
                return KeyFactory.getInstance(str, provider);
            case 25:
                if (provider == null) {
                    return KeyPairGenerator.getInstance(str);
                }
                return KeyPairGenerator.getInstance(str, provider);
            case 26:
                if (provider == null) {
                    return Mac.getInstance(str);
                }
                return Mac.getInstance(str, provider);
            case 27:
                if (provider == null) {
                    return MessageDigest.getInstance(str);
                }
                return MessageDigest.getInstance(str, provider);
            default:
                if (provider == null) {
                    return Signature.getInstance(str);
                }
                return Signature.getInstance(str, provider);
        }
    }
}
