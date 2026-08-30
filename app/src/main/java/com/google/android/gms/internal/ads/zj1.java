package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class zj1 {
    static {
        int i = ai1.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        lj1 lj1Var = lj1.f8046a;
        id1 id1Var = id1.f7114b;
        id1Var.b(lj1.f8046a);
        id1Var.a(lj1.f8047b);
        id1Var.b(mj1.f8358a);
        id1Var.a(mj1.f8359b);
        int i = fj1.f6094f;
        if (ct.i(i)) {
            nd1 nd1Var = dk1.f5448a;
            jd1 jd1Var = jd1.f7422b;
            jd1Var.c(dk1.f5448a);
            jd1Var.d(dk1.f5449b);
            jd1Var.a(dk1.f5450c);
            jd1Var.b(dk1.f5451d);
            jd1Var.a(dk1.e);
            jd1Var.b(dk1.f5452f);
            hd1 hd1Var = hd1.f6699b;
            HashMap hashMap = new HashMap();
            hashMap.put("ECDSA_P256", kj1.f7775a);
            hashMap.put("ECDSA_P256_IEEE_P1363", kj1.f7778d);
            na1 na1Var = new na1(4);
            na1Var.f8632d = q91.H;
            na1Var.f8631c = aj1.f4525c;
            na1Var.f8630b = w91.f12189p;
            na1Var.e = x91.f12524y;
            hashMap.put("ECDSA_P256_RAW", na1Var.l());
            hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", kj1.f7779f);
            hashMap.put("ECDSA_P384", kj1.f7776b);
            hashMap.put("ECDSA_P384_IEEE_P1363", kj1.e);
            na1 na1Var2 = new na1(4);
            na1Var2.f8632d = q91.J;
            aj1 aj1Var = aj1.f4526d;
            na1Var2.f8631c = aj1Var;
            w91 w91Var = w91.f12190q;
            na1Var2.f8630b = w91Var;
            x91 x91Var = x91.f12521v;
            na1Var2.e = x91Var;
            hashMap.put("ECDSA_P384_SHA512", na1Var2.l());
            na1 na1Var3 = new na1(4);
            na1Var3.f8632d = q91.I;
            na1Var3.f8631c = aj1Var;
            na1Var3.f8630b = w91Var;
            na1Var3.e = x91Var;
            hashMap.put("ECDSA_P384_SHA384", na1Var3.l());
            hashMap.put("ECDSA_P521", kj1.f7777c);
            hashMap.put("ECDSA_P521_IEEE_P1363", kj1.f7780g);
            hd1Var.b(Collections.unmodifiableMap(hashMap));
            id1Var.a(fj1.f6090a);
            id1Var.a(fj1.f6091b);
            fd1 fd1Var = fd1.f6043b;
            fd1Var.a(fj1.e, bj1.class);
            tc1 tc1Var = tc1.f11325d;
            tc1Var.c(fj1.f6092c, i, true);
            tc1Var.c(fj1.f6093d, i, false);
            int i10 = sj1.f10631f;
            if (ct.i(i10)) {
                jd1Var.c(jk1.f7467a);
                jd1Var.d(jk1.f7468b);
                jd1Var.a(jk1.f7469c);
                jd1Var.b(jk1.f7470d);
                jd1Var.a(jk1.e);
                jd1Var.b(jk1.f7471f);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", kj1.f7781h);
                BigInteger bigInteger = pj1.e;
                nj1 nj1Var = new nj1();
                nj1Var.f8738c = oj1.f9138b;
                nj1Var.a(3072);
                BigInteger bigInteger2 = pj1.e;
                nj1Var.f8737b = bigInteger2;
                q91 q91Var = q91.N;
                nj1Var.f8739d = q91Var;
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", nj1Var.b());
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", kj1.i);
                hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", kj1.f7782j);
                nj1 nj1Var2 = new nj1();
                nj1Var2.f8738c = oj1.f9140d;
                nj1Var2.a(4096);
                nj1Var2.f8737b = bigInteger2;
                nj1Var2.f8739d = q91Var;
                hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", nj1Var2.b());
                hd1Var.b(hashMap2);
                id1Var.a(sj1.f10627a);
                id1Var.a(sj1.f10628b);
                fd1Var.a(sj1.e, pj1.class);
                tc1Var.c(sj1.f10629c, i10, true);
                tc1Var.c(sj1.f10630d, i10, false);
                int i11 = yj1.f12893f;
                if (ct.i(i11)) {
                    jd1Var.c(nk1.f8742a);
                    jd1Var.d(nk1.f8743b);
                    jd1Var.a(nk1.f8744c);
                    jd1Var.b(nk1.f8745d);
                    jd1Var.a(nk1.e);
                    jd1Var.b(nk1.f8746f);
                    HashMap hashMap3 = new HashMap();
                    BigInteger bigInteger3 = vj1.f11922g;
                    tj1 tj1Var = new tj1();
                    uj1 uj1Var = uj1.f11653b;
                    tj1Var.f11362c = uj1Var;
                    tj1Var.f11363d = uj1Var;
                    tj1Var.b(32);
                    tj1Var.a(3072);
                    BigInteger bigInteger4 = vj1.f11922g;
                    tj1Var.f11361b = bigInteger4;
                    w91 w91Var2 = w91.f12191r;
                    tj1Var.f11364f = w91Var2;
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", tj1Var.c());
                    tj1 tj1Var2 = new tj1();
                    tj1Var2.f11362c = uj1Var;
                    tj1Var2.f11363d = uj1Var;
                    tj1Var2.b(32);
                    tj1Var2.a(3072);
                    tj1Var2.f11361b = bigInteger4;
                    w91 w91Var3 = w91.f12194u;
                    tj1Var2.f11364f = w91Var3;
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", tj1Var2.c());
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", kj1.f7783k);
                    tj1 tj1Var3 = new tj1();
                    uj1 uj1Var2 = uj1.f11655d;
                    tj1Var3.f11362c = uj1Var2;
                    tj1Var3.f11363d = uj1Var2;
                    tj1Var3.b(64);
                    tj1Var3.a(4096);
                    tj1Var3.f11361b = bigInteger4;
                    tj1Var3.f11364f = w91Var2;
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", tj1Var3.c());
                    tj1 tj1Var4 = new tj1();
                    tj1Var4.f11362c = uj1Var2;
                    tj1Var4.f11363d = uj1Var2;
                    tj1Var4.b(64);
                    tj1Var4.a(4096);
                    tj1Var4.f11361b = bigInteger4;
                    tj1Var4.f11364f = w91Var3;
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", tj1Var4.c());
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", kj1.f7784l);
                    hd1Var.b(Collections.unmodifiableMap(hashMap3));
                    id1Var.a(yj1.f12889a);
                    id1Var.a(yj1.f12890b);
                    fd1Var.a(yj1.e, vj1.class);
                    tc1Var.c(yj1.f12891c, i11, true);
                    tc1Var.c(yj1.f12892d, i11, false);
                    if (lc1.a()) {
                        return;
                    }
                    sd1 sd1Var = ij1.f7148a;
                    if (ct.i(1)) {
                        jd1Var.c(fk1.f6099a);
                        jd1Var.d(fk1.f6100b);
                        jd1Var.a(fk1.f6101c);
                        jd1Var.b(fk1.f6102d);
                        jd1Var.a(fk1.e);
                        jd1Var.b(fk1.f6103f);
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("ED25519", new gj1(ja1.K));
                        ja1 ja1Var = ja1.N;
                        hashMap4.put("ED25519_RAW", new gj1(ja1Var));
                        hashMap4.put("ED25519WithRawOutput", new gj1(ja1Var));
                        hd1Var.b(Collections.unmodifiableMap(hashMap4));
                        fd1Var.a(ij1.f7152f, gj1.class);
                        gd1.f6378b.a(ij1.e, gj1.class);
                        id1Var.a(ij1.f7148a);
                        id1Var.a(ij1.f7149b);
                        tc1Var.a(ij1.f7150c, true);
                        tc1Var.a(ij1.f7151d, false);
                        return;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Registering AES GCM SIV is not supported in FIPS mode");
                    return;
                }
                androidx.datastore.preferences.protobuf.s1.q("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
    }
}
