package com.google.android.gms.internal.ads;
import q.x;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final /* synthetic */ class fb1 implements vc1, od1, td1, md1, xc1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6009u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ fb1 f6004v = new fb1(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ fb1 f6005w = new fb1(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ fb1 f6006x = new fb1(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ fb1 f6007y = new fb1(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ fb1 f6008z = new fb1(4);
    public static final /* synthetic */ fb1 A = new fb1(5);
    public static final /* synthetic */ fb1 B = new fb1(6);
    public static final /* synthetic */ fb1 C = new fb1(7);
    public static final /* synthetic */ fb1 D = new fb1(8);
    public static final /* synthetic */ fb1 E = new fb1(9);
    public static final /* synthetic */ fb1 F = new fb1(10);
    public static final /* synthetic */ fb1 G = new fb1(11);
    public static final /* synthetic */ fb1 H = new fb1(12);
    public static final /* synthetic */ fb1 I = new fb1(13);
    public static final /* synthetic */ fb1 J = new fb1(14);
    public static final /* synthetic */ fb1 K = new fb1(15);
    public static final /* synthetic */ fb1 L = new fb1(16);
    public static final /* synthetic */ fb1 M = new fb1(17);
    public static final /* synthetic */ fb1 N = new fb1(18);
    public static final /* synthetic */ fb1 O = new fb1(19);
    public static final /* synthetic */ fb1 P = new fb1(20);
    public static final /* synthetic */ fb1 Q = new fb1(21);
    public static final /* synthetic */ fb1 R = new fb1(22);
    public static final /* synthetic */ fb1 S = new fb1(23);
    public static final /* synthetic */ fb1 T = new fb1(24);
    public static final /* synthetic */ fb1 U = new fb1(25);
    public static final /* synthetic */ fb1 V = new fb1(26);
    public static final /* synthetic */ fb1 W = new fb1(27);
    public static final /* synthetic */ fb1 X = new fb1(28);
    public static final /* synthetic */ fb1 Y = new fb1(29);

    public /* synthetic */ fb1(int i) {
        this.f6009u = i;
    }

    @Override // com.google.android.gms.internal.ads.td1, com.google.android.gms.internal.ads.xc1
    public yd1 a(xy xyVar) {
        switch (this.f6009u) {
            case 5:
                fa1 fa1Var = (fa1) xyVar;
                nd1 nd1Var = ob1.f9084a;
                if1 D2 = jf1.D();
                mf1 C2 = nf1.C();
                rf1 A2 = sf1.A();
                int i = fa1Var.P.f7699c;
                A2.b();
                ((sf1) A2.f4845v).C(i);
                sf1 sf1Var = (sf1) A2.c();
                C2.b();
                ((nf1) C2.f4845v).E(sf1Var);
                byte[] b10 = ((gl1) fa1Var.Q.f4819v).b();
                mm1 z3 = om1.z(b10, 0, b10.length);
                C2.b();
                ((nf1) C2.f4845v).F(z3);
                nf1 nf1Var = (nf1) C2.c();
                D2.b();
                ((jf1) D2.f4845v).F(nf1Var);
                zg1 D3 = ah1.D();
                ka1 ka1Var = fa1Var.P;
                eh1 d2 = ob1.d(ka1Var);
                D3.b();
                ((ah1) D3.f4845v).G(d2);
                byte[] b11 = ((gl1) fa1Var.R.f4819v).b();
                mm1 z9 = om1.z(b11, 0, b11.length);
                D3.b();
                ((ah1) D3.f4845v).H(z9);
                ah1 ah1Var = (ah1) D3.c();
                D2.b();
                ((jf1) D2.f4845v).G(ah1Var);
                return yd1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((jf1) D2.c()).a(), w91.f12179d, ob1.a(ka1Var.e), fa1Var.T);
            case 9:
                la1 la1Var = (la1) xyVar;
                nd1 nd1Var2 = pb1.f9457a;
                tf1 D4 = uf1.D();
                oa1 oa1Var = la1Var.P;
                xf1 A3 = yf1.A();
                int i10 = oa1Var.f9069b;
                A3.b();
                ((yf1) A3.f4845v).C(i10);
                yf1 yf1Var = (yf1) A3.c();
                D4.b();
                ((uf1) D4.f4845v).F(yf1Var);
                byte[] b12 = ((gl1) la1Var.Q.f4819v).b();
                mm1 z10 = om1.z(b12, 0, b12.length);
                D4.b();
                ((uf1) D4.f4845v).G(z10);
                return yd1.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((uf1) D4.c()).a(), w91.f12179d, pb1.a(la1Var.P.f9070c), la1Var.S);
            case 13:
                pa1 pa1Var = (pa1) xyVar;
                nd1 nd1Var3 = sb1.f10585a;
                zf1 C3 = ag1.C();
                byte[] b13 = ((gl1) pa1Var.Q.f4819v).b();
                mm1 z11 = om1.z(b13, 0, b13.length);
                C3.b();
                ((ag1) C3.f4845v).E(z11);
                return yd1.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((ag1) C3.c()).a(), w91.f12179d, sb1.a(pa1Var.P.f10189b), pa1Var.S);
            case 17:
                sa1 sa1Var = (sa1) xyVar;
                nd1 nd1Var4 = ub1.f11609a;
                dg1 C4 = eg1.C();
                byte[] b14 = ((gl1) sa1Var.Q.f4819v).b();
                mm1 z12 = om1.z(b14, 0, b14.length);
                C4.b();
                ((eg1) C4.f4845v).E(z12);
                return yd1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((eg1) C4.c()).a(), w91.f12179d, ub1.a(sa1Var.P.f11596b), sa1Var.S);
            case gl.zzm /* 21 */:
                va1 va1Var = (va1) xyVar;
                nd1 nd1Var5 = wb1.f12210a;
                hg1 C5 = ig1.C();
                byte[] b15 = ((gl1) va1Var.Q.f4819v).b();
                mm1 z13 = om1.z(b15, 0, b15.length);
                C5.b();
                ((ig1) C5.f4845v).E(z13);
                return yd1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((ig1) C5.c()).a(), w91.f12179d, wb1.a(va1Var.P.f12537a), va1Var.S);
            case 25:
                ib1 ib1Var = (ib1) xyVar;
                nd1 nd1Var6 = fc1.f6019a;
                ri1 D5 = si1.D();
                byte[] b16 = ((gl1) ib1Var.Q.f4819v).b();
                mm1 z14 = om1.z(b16, 0, b16.length);
                D5.b();
                ((si1) D5.f4845v).F(z14);
                vi1 A4 = wi1.A();
                kb1 kb1Var = ib1Var.P;
                int i11 = kb1Var.f7712b;
                A4.b();
                ((wi1) A4.f4845v).C(i11);
                wi1 wi1Var = (wi1) A4.c();
                D5.b();
                ((si1) D5.f4845v).E(wi1Var);
                return yd1.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((si1) D5.c()).a(), w91.f12179d, fc1.a(kb1Var.f7711a), ib1Var.S);
            default:
                lb1 lb1Var = (lb1) xyVar;
                nd1 nd1Var7 = ic1.f7103a;
                xi1 C6 = yi1.C();
                byte[] b17 = ((gl1) lb1Var.Q.f4819v).b();
                mm1 z15 = om1.z(b17, 0, b17.length);
                C6.b();
                ((yi1) C6.f4845v).E(z15);
                return yd1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((yi1) C6.c()).a(), w91.f12179d, ic1.a(lb1Var.P.f8641a), lb1Var.S);
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 b(v91 v91Var) {
        switch (this.f6009u) {
            case 1:
                eb1 eb1Var = (eb1) v91Var;
                nd1 nd1Var = gb1.f6361a;
                return zd1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", gb1.a(eb1Var.f5640a), gb1.b(eb1Var).a());
            case 7:
                ka1 ka1Var = (ka1) v91Var;
                nd1 nd1Var2 = ob1.f9084a;
                x91 a10 = ob1.a(ka1Var.e);
                kf1 C2 = lf1.C();
                of1 B2 = qf1.B();
                rf1 A2 = sf1.A();
                int i = ka1Var.f7699c;
                A2.b();
                ((sf1) A2.f4845v).C(i);
                sf1 sf1Var = (sf1) A2.c();
                B2.b();
                ((qf1) B2.f4845v).D(sf1Var);
                int i10 = ka1Var.f7697a;
                B2.b();
                ((qf1) B2.f4845v).E(i10);
                qf1 qf1Var = (qf1) B2.c();
                C2.b();
                ((lf1) C2.f4845v).D(qf1Var);
                bh1 D2 = ch1.D();
                eh1 d2 = ob1.d(ka1Var);
                D2.b();
                ((ch1) D2.f4845v).F(d2);
                int i11 = ka1Var.f7698b;
                D2.b();
                ((ch1) D2.f4845v).G(i11);
                ch1 ch1Var = (ch1) D2.c();
                C2.b();
                ((lf1) C2.f4845v).E(ch1Var);
                return zd1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", a10, ((lf1) C2.c()).a());
            case 11:
                oa1 oa1Var = (oa1) v91Var;
                nd1 nd1Var3 = pb1.f9457a;
                x91 a11 = pb1.a(oa1Var.f9070c);
                vf1 C3 = wf1.C();
                xf1 A3 = yf1.A();
                int i12 = oa1Var.f9069b;
                A3.b();
                ((yf1) A3.f4845v).C(i12);
                yf1 yf1Var = (yf1) A3.c();
                C3.b();
                ((wf1) C3.f4845v).D(yf1Var);
                int i13 = oa1Var.f9068a;
                C3.b();
                ((wf1) C3.f4845v).E(i13);
                return zd1.a("type.googleapis.com/google.crypto.tink.AesEaxKey", a11, ((wf1) C3.c()).a());
            case 15:
                ra1 ra1Var = (ra1) v91Var;
                nd1 nd1Var4 = sb1.f10585a;
                x91 a12 = sb1.a(ra1Var.f10189b);
                bg1 C4 = cg1.C();
                int i14 = ra1Var.f10188a;
                C4.b();
                ((cg1) C4.f4845v).D(i14);
                return zd1.a("type.googleapis.com/google.crypto.tink.AesGcmKey", a12, ((cg1) C4.c()).a());
            case 19:
                ua1 ua1Var = (ua1) v91Var;
                nd1 nd1Var5 = ub1.f11609a;
                x91 a13 = ub1.a(ua1Var.f11596b);
                fg1 C5 = gg1.C();
                int i15 = ua1Var.f11595a;
                C5.b();
                ((gg1) C5.f4845v).D(i15);
                return zd1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", a13, ((gg1) C5.c()).a());
            case 23:
                nd1 nd1Var6 = wb1.f12210a;
                return zd1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", wb1.a(((xa1) v91Var).f12537a), jg1.A().a());
            default:
                kb1 kb1Var = (kb1) v91Var;
                nd1 nd1Var7 = fc1.f6019a;
                x91 a14 = fc1.a(kb1Var.f7711a);
                ti1 C6 = ui1.C();
                vi1 A4 = wi1.A();
                int i16 = kb1Var.f7712b;
                A4.b();
                ((wi1) A4.f4845v).C(i16);
                wi1 wi1Var = (wi1) A4.c();
                C6.b();
                ((ui1) C6.f4845v).D(wi1Var);
                return zd1.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", a14, ((ui1) C6.c()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public v91 c(zd1 zd1Var) {
        q91 q91Var;
        switch (this.f6009u) {
            case 4:
                nd1 nd1Var = ob1.f9084a;
                ih1 ih1Var = (ih1) zd1Var.f13143w;
                if (ih1Var.z().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        om1 A2 = ih1Var.A();
                        wm1 wm1Var = wm1.f12302a;
                        int i = em1.f5727a;
                        lf1 B2 = lf1.B(A2, wm1.f12303b);
                        if (B2.A().B() == 0) {
                            yd1 yd1Var = new yd1();
                            yd1Var.b(B2.z().A());
                            yd1Var.d(B2.A().A());
                            yd1Var.e(B2.z().z().z());
                            yd1Var.f(B2.A().z().A());
                            yd1Var.f12858x = ob1.c(B2.A().z().z());
                            yd1Var.f12859y = ob1.b((x91) zd1Var.f13144x);
                            return yd1Var.h();
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Only version 0 keys are accepted");
                        return null;
                    } catch (pn1 e) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
                    }
                }
                x.n("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var.z())));
                return null;
            case 8:
                nd1 nd1Var2 = pb1.f9457a;
                ih1 ih1Var2 = (ih1) zd1Var.f13143w;
                if (ih1Var2.z().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        om1 A3 = ih1Var2.A();
                        wm1 wm1Var2 = wm1.f12302a;
                        int i10 = em1.f5727a;
                        wf1 B3 = wf1.B(A3, wm1.f12303b);
                        na1 na1Var = new na1(0);
                        na1Var.a(B3.A());
                        na1Var.d(B3.z().z());
                        na1Var.f();
                        na1Var.e = pb1.b((x91) zd1Var.f13144x);
                        return na1Var.i();
                    } catch (pn1 e8) {
                        throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e8);
                    }
                }
                x.n("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var2.z())));
                return null;
            case 12:
                nd1 nd1Var3 = sb1.f10585a;
                ih1 ih1Var3 = (ih1) zd1Var.f13143w;
                if (ih1Var3.z().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        om1 A4 = ih1Var3.A();
                        wm1 wm1Var3 = wm1.f12302a;
                        int i11 = em1.f5727a;
                        cg1 B4 = cg1.B(A4, wm1.f12303b);
                        if (B4.A() == 0) {
                            na1 na1Var2 = new na1(1);
                            na1Var2.a(B4.z());
                            na1Var2.c();
                            na1Var2.f();
                            na1Var2.e = sb1.b((x91) zd1Var.f13144x);
                            return na1Var2.j();
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Only version 0 parameters are accepted");
                        return null;
                    } catch (pn1 e10) {
                        throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
                    }
                }
                x.n("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var3.z())));
                return null;
            case 16:
                nd1 nd1Var4 = ub1.f11609a;
                ih1 ih1Var4 = (ih1) zd1Var.f13143w;
                if (ih1Var4.z().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        om1 A5 = ih1Var4.A();
                        wm1 wm1Var4 = wm1.f12302a;
                        int i12 = em1.f5727a;
                        gg1 B5 = gg1.B(A5, wm1.f12303b);
                        if (B5.A() == 0) {
                            int z3 = B5.z();
                            if (z3 != 16 && z3 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(z3)));
                            }
                            return new ua1(z3, ub1.b((x91) zd1Var.f13144x));
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Only version 0 parameters are accepted");
                        return null;
                    } catch (pn1 e11) {
                        throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e11);
                    }
                }
                x.n("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var4.z())));
                return null;
            case 20:
                nd1 nd1Var5 = wb1.f12210a;
                ih1 ih1Var5 = (ih1) zd1Var.f13143w;
                if (ih1Var5.z().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        om1 A6 = ih1Var5.A();
                        wm1 wm1Var5 = wm1.f12302a;
                        int i13 = em1.f5727a;
                        jg1.z(A6, wm1.f12303b);
                        return new xa1(wb1.b((x91) zd1Var.f13144x));
                    } catch (pn1 e12) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e12);
                    }
                }
                x.n("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var5.z())));
                return null;
            case 24:
                nd1 nd1Var6 = fc1.f6019a;
                ih1 ih1Var6 = (ih1) zd1Var.f13143w;
                if (ih1Var6.z().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    try {
                        om1 A7 = ih1Var6.A();
                        wm1 wm1Var6 = wm1.f12302a;
                        int i14 = em1.f5727a;
                        ui1 B6 = ui1.B(A7, wm1.f12303b);
                        if (B6.z() == 0) {
                            x91 x91Var = (x91) zd1Var.f13144x;
                            if (x91Var == x91.f12505d) {
                                q91Var = q91.F;
                            } else if (x91Var == x91.f12506f) {
                                q91Var = q91.G;
                            } else {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
                            }
                            return kb1.b(q91Var, B6.A().z());
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Only version 0 parameters are accepted");
                        return null;
                    } catch (pn1 e13) {
                        throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e13);
                    }
                }
                x.n("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var6.z())));
                return null;
            default:
                nd1 nd1Var7 = ic1.f7103a;
                ih1 ih1Var7 = (ih1) zd1Var.f13143w;
                if (ih1Var7.z().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        om1 A8 = ih1Var7.A();
                        wm1 wm1Var7 = wm1.f12302a;
                        int i15 = em1.f5727a;
                        if (zi1.A(A8, wm1.f12303b).z() == 0) {
                            return new nb1(ic1.b((x91) zd1Var.f13144x));
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Only version 0 parameters are accepted");
                        return null;
                    } catch (pn1 e14) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e14);
                    }
                }
                x.n("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var7.z())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public xy d(yd1 yd1Var) {
        q91 q91Var;
        boolean z3 = false;
        int i = 21;
        switch (this.f6009u) {
            case 0:
                nd1 nd1Var = gb1.f6361a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        om1 om1Var = (om1) yd1Var.f12857w;
                        wm1 wm1Var = wm1.f12302a;
                        int i10 = em1.f5727a;
                        xh1 B2 = xh1.B(om1Var, wm1.f12303b);
                        if (B2.z() == 0) {
                            zh1 A2 = B2.A();
                            x91 x91Var = (x91) yd1Var.f12859y;
                            x91 x91Var2 = x91.f12505d;
                            if (x91Var != x91Var2 && x91Var != (x91Var2 = x91.f12506f)) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
                            }
                            return db1.h0(gb1.c(A2, x91Var2), (Integer) yd1Var.f12860z);
                        }
                        String valueOf = String.valueOf(B2);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 58);
                        sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                        sb2.append(valueOf);
                        throw new GeneralSecurityException(sb2.toString());
                    } catch (pn1 e) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
                    }
                }
                x.n("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                return null;
            case 6:
                nd1 nd1Var2 = ob1.f9084a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        om1 om1Var2 = (om1) yd1Var.f12857w;
                        wm1 wm1Var2 = wm1.f12302a;
                        int i11 = em1.f5727a;
                        jf1 C2 = jf1.C(om1Var2, wm1.f12303b);
                        if (C2.z() == 0) {
                            if (C2.A().z() == 0) {
                                if (C2.B().z() == 0) {
                                    yd1 yd1Var2 = new yd1();
                                    yd1Var2.b(C2.A().B().k());
                                    yd1Var2.d(C2.B().B().k());
                                    yd1Var2.e(C2.A().A().z());
                                    yd1Var2.f(C2.B().A().A());
                                    yd1Var2.f12858x = ob1.c(C2.B().A().z());
                                    yd1Var2.f12859y = ob1.b((x91) yd1Var.f12859y);
                                    ka1 h3 = yd1Var2.h();
                                    tw twVar = new tw(29);
                                    twVar.f11470v = h3;
                                    twVar.f11471w = new bl0(12, gl1.a(C2.A().B().a()));
                                    twVar.f11472x = new bl0(12, gl1.a(C2.B().B().a()));
                                    twVar.f11473y = (Integer) yd1Var.f12860z;
                                    return twVar.u();
                                }
                                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                            }
                            throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing AesCtrHmacAeadKey failed");
                        return null;
                    }
                }
                x.n("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                return null;
            case 10:
                nd1 nd1Var3 = pb1.f9457a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        om1 om1Var3 = (om1) yd1Var.f12857w;
                        wm1 wm1Var3 = wm1.f12302a;
                        int i12 = em1.f5727a;
                        uf1 C3 = uf1.C(om1Var3, wm1.f12303b);
                        if (C3.z() == 0) {
                            na1 na1Var = new na1(0);
                            na1Var.a(C3.B().k());
                            na1Var.d(C3.A().z());
                            na1Var.f();
                            na1Var.e = pb1.b((x91) yd1Var.f12859y);
                            oa1 i13 = na1Var.i();
                            zd1 zd1Var = new zd1(20);
                            zd1Var.f13142v = i13;
                            zd1Var.f13143w = new bl0(12, gl1.a(C3.B().a()));
                            zd1Var.f13144x = (Integer) yd1Var.f12860z;
                            return zd1Var.o();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused2) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing AesEaxKey failed");
                        return null;
                    }
                }
                x.n("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                return null;
            case 14:
                nd1 nd1Var4 = sb1.f10585a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        om1 om1Var4 = (om1) yd1Var.f12857w;
                        wm1 wm1Var4 = wm1.f12302a;
                        int i14 = em1.f5727a;
                        ag1 B3 = ag1.B(om1Var4, wm1.f12303b);
                        if (B3.z() == 0) {
                            na1 na1Var2 = new na1(1);
                            na1Var2.a(B3.A().k());
                            na1Var2.c();
                            na1Var2.f();
                            na1Var2.e = sb1.b((x91) yd1Var.f12859y);
                            ra1 j10 = na1Var2.j();
                            hq0 hq0Var = new hq0(i, z3);
                            hq0Var.f6872v = j10;
                            hq0Var.f6873w = new bl0(12, gl1.a(B3.A().a()));
                            hq0Var.f6874x = (Integer) yd1Var.f12860z;
                            return hq0Var.A();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused3) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing AesGcmKey failed");
                        return null;
                    }
                }
                x.n("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                return null;
            case 18:
                nd1 nd1Var5 = ub1.f11609a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        om1 om1Var5 = (om1) yd1Var.f12857w;
                        wm1 wm1Var5 = wm1.f12302a;
                        int i15 = em1.f5727a;
                        eg1 B4 = eg1.B(om1Var5, wm1.f12303b);
                        if (B4.z() == 0) {
                            int k3 = B4.A().k();
                            if (k3 != 16 && k3 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(k3)));
                            }
                            ua1 ua1Var = new ua1(k3, ub1.b((x91) yd1Var.f12859y));
                            zd1 zd1Var2 = new zd1(i);
                            zd1Var2.f13142v = ua1Var;
                            zd1Var2.f13143w = new bl0(12, gl1.a(B4.A().a()));
                            zd1Var2.f13144x = (Integer) yd1Var.f12860z;
                            return zd1Var2.q();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused4) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing AesGcmSivKey failed");
                        return null;
                    }
                }
                x.n("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                return null;
            case 22:
                nd1 nd1Var6 = wb1.f12210a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        om1 om1Var6 = (om1) yd1Var.f12857w;
                        wm1 wm1Var6 = wm1.f12302a;
                        int i16 = em1.f5727a;
                        ig1 B5 = ig1.B(om1Var6, wm1.f12303b);
                        if (B5.z() == 0) {
                            return va1.h0(wb1.b((x91) yd1Var.f12859y), new bl0(12, gl1.a(B5.A().a())), (Integer) yd1Var.f12860z);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused5) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing ChaCha20Poly1305Key failed");
                        return null;
                    }
                }
                x.n("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                return null;
            default:
                nd1 nd1Var7 = fc1.f6019a;
                if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    try {
                        om1 om1Var7 = (om1) yd1Var.f12857w;
                        wm1 wm1Var7 = wm1.f12302a;
                        int i17 = em1.f5727a;
                        si1 C4 = si1.C(om1Var7, wm1.f12303b);
                        if (C4.z() == 0) {
                            if (C4.B().k() == 32) {
                                x91 x91Var3 = (x91) yd1Var.f12859y;
                                if (x91Var3 == x91.f12505d) {
                                    q91Var = q91.F;
                                } else if (x91Var3 == x91.f12506f) {
                                    q91Var = q91.G;
                                } else {
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var3.f12526b));
                                }
                                return ib1.h0(kb1.b(q91Var, C4.A().z()), new bl0(12, gl1.a(C4.B().a())), (Integer) yd1Var.f12860z);
                            }
                            throw new GeneralSecurityException("Only 32 byte key size is accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (pn1 unused6) {
                        androidx.datastore.preferences.protobuf.s1.q("Parsing XAesGcmKey failed");
                        return null;
                    }
                }
                x.n("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.td1, com.google.android.gms.internal.ads.xc1
    public Object a(xy xyVar) {
        switch (this.f6009u) {
            case 2:
                ib1 ib1Var = (ib1) xyVar;
                ib1Var.getClass();
                return new ec1(((gl1) ib1Var.Q.f4819v).b(), ib1Var.R, ib1Var.P.f7712b);
            default:
                lb1 lb1Var = (lb1) xyVar;
                sd1 sd1Var = mb1.f8300a;
                try {
                    vb1.b();
                    return new gc1(((gl1) lb1Var.Q.f4819v).b(), lb1Var.R.b(), vb1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new bc1(3, ((gl1) lb1Var.Q.f4819v).b(), lb1Var.R.b());
                }
        }
    }
}
