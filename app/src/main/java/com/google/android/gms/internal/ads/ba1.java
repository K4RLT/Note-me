package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ba1 {
    static {
        int i = ai1.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ea1 ea1Var = ea1.f5628a;
        id1 id1Var = id1.f7114b;
        id1Var.b(ea1.f5628a);
        id1Var.a(ea1.f5629b);
        oe1.a();
        int i = ia1.e;
        if (ct.i(i)) {
            nd1 nd1Var = ob1.f9084a;
            jd1 jd1Var = jd1.f7422b;
            jd1Var.c(ob1.f9084a);
            jd1Var.d(ob1.f9085b);
            jd1Var.a(ob1.f9086c);
            jd1Var.b(ob1.f9087d);
            id1Var.a(ia1.f7072a);
            hd1 hd1Var = hd1.f6699b;
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", hb1.e);
            yd1 yd1Var = new yd1();
            yd1Var.b(16);
            yd1Var.d(32);
            yd1Var.f(16);
            yd1Var.e(16);
            ja1 ja1Var = ja1.f7387y;
            yd1Var.f12858x = ja1Var;
            q91 q91Var = q91.B;
            yd1Var.f12859y = q91Var;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", yd1Var.h());
            hashMap.put("AES256_CTR_HMAC_SHA256", hb1.f6663f);
            yd1 yd1Var2 = new yd1();
            yd1Var2.b(32);
            yd1Var2.d(32);
            yd1Var2.f(32);
            yd1Var2.e(16);
            yd1Var2.f12858x = ja1Var;
            yd1Var2.f12859y = q91Var;
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", yd1Var2.h());
            hd1Var.b(Collections.unmodifiableMap(hashMap));
            gd1 gd1Var = gd1.f6378b;
            gd1Var.a(ia1.f7074c, ka1.class);
            fd1 fd1Var = fd1.f6043b;
            fd1Var.a(ia1.f7075d, ka1.class);
            tc1 tc1Var = tc1.f11325d;
            tc1Var.c(ia1.f7073b, i, true);
            int i10 = qa1.e;
            if (ct.i(i10)) {
                jd1Var.c(sb1.f10585a);
                jd1Var.d(sb1.f10586b);
                jd1Var.a(sb1.f10587c);
                jd1Var.b(sb1.f10588d);
                id1Var.a(qa1.f9796a);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", hb1.f6659a);
                na1 na1Var = new na1(1);
                na1Var.c();
                na1Var.a(16);
                na1Var.f();
                x91 x91Var = x91.f12510k;
                na1Var.e = x91Var;
                hashMap2.put("AES128_GCM_RAW", na1Var.j());
                hashMap2.put("AES256_GCM", hb1.f6660b);
                na1 na1Var2 = new na1(1);
                na1Var2.c();
                na1Var2.a(32);
                na1Var2.f();
                na1Var2.e = x91Var;
                hashMap2.put("AES256_GCM_RAW", na1Var2.j());
                hd1Var.b(Collections.unmodifiableMap(hashMap2));
                gd1Var.a(qa1.f9798c, ra1.class);
                fd1Var.a(qa1.f9799d, ra1.class);
                tc1Var.c(qa1.f9797b, i10, true);
                if (lc1.a()) {
                    return;
                }
                sd1 sd1Var = ma1.f8295a;
                if (ct.i(1)) {
                    jd1Var.c(pb1.f9457a);
                    jd1Var.d(pb1.f9458b);
                    jd1Var.a(pb1.f9459c);
                    jd1Var.b(pb1.f9460d);
                    id1Var.a(ma1.f8295a);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("AES128_EAX", hb1.f6661c);
                    na1 na1Var3 = new na1(0);
                    na1Var3.d(16);
                    na1Var3.a(16);
                    na1Var3.f();
                    w91 w91Var = w91.f12183j;
                    na1Var3.e = w91Var;
                    hashMap3.put("AES128_EAX_RAW", na1Var3.i());
                    hashMap3.put("AES256_EAX", hb1.f6662d);
                    na1 na1Var4 = new na1(0);
                    na1Var4.d(16);
                    na1Var4.a(32);
                    na1Var4.f();
                    na1Var4.e = w91Var;
                    hashMap3.put("AES256_EAX_RAW", na1Var4.i());
                    hd1Var.b(Collections.unmodifiableMap(hashMap3));
                    fd1Var.a(ma1.f8297c, oa1.class);
                    tc1Var.a(ma1.f8296b, true);
                    sd1 sd1Var2 = ta1.f11301a;
                    ja1 ja1Var2 = ja1.D;
                    if (ct.i(1)) {
                        jd1Var.c(ub1.f11609a);
                        jd1Var.d(ub1.f11610b);
                        jd1Var.a(ub1.f11611c);
                        jd1Var.b(ub1.f11612d);
                        HashMap hashMap4 = new HashMap();
                        ja1 ja1Var3 = ja1.B;
                        hashMap4.put("AES128_GCM_SIV", new ua1(16, ja1Var3));
                        hashMap4.put("AES128_GCM_SIV_RAW", new ua1(16, ja1Var2));
                        hashMap4.put("AES256_GCM_SIV", new ua1(32, ja1Var3));
                        hashMap4.put("AES256_GCM_SIV_RAW", new ua1(32, ja1Var2));
                        hd1Var.b(Collections.unmodifiableMap(hashMap4));
                        gd1Var.a(ha1.f6646c, ua1.class);
                        fd1Var.a(ga1.e, ua1.class);
                        id1Var.a(ta1.f11301a);
                        tc1Var.a(ta1.f11302b, true);
                        sd1 sd1Var3 = wa1.f12204a;
                        if (ct.i(1)) {
                            jd1Var.c(wb1.f12210a);
                            jd1Var.d(wb1.f12211b);
                            jd1Var.a(wb1.f12212c);
                            jd1Var.b(wb1.f12213d);
                            id1Var.a(wa1.f12204a);
                            fd1Var.a(ga1.f6341f, xa1.class);
                            HashMap hashMap5 = new HashMap();
                            hashMap5.put("CHACHA20_POLY1305", new xa1(q91.C));
                            hashMap5.put("CHACHA20_POLY1305_RAW", new xa1(q91.E));
                            hd1Var.b(Collections.unmodifiableMap(hashMap5));
                            tc1Var.a(wa1.f12205b, true);
                            sd1 sd1Var4 = ya1.f12835a;
                            if (ct.i(1)) {
                                jd1Var.c(cb1.f5070a);
                                jd1Var.d(cb1.f5071b);
                                jd1Var.a(cb1.f5072c);
                                jd1Var.b(cb1.f5073d);
                                id1Var.a(ya1.f12835a);
                                fd1Var.a(ya1.f12837c, bb1.class);
                                tc1Var.a(ya1.f12836b, true);
                                ad1 ad1Var = za1.f13131a;
                                if (ct.i(1)) {
                                    jd1Var.c(gb1.f6361a);
                                    jd1Var.d(gb1.f6362b);
                                    jd1Var.a(gb1.f6363c);
                                    jd1Var.b(gb1.f6364d);
                                    fd1Var.a(za1.f13132b, eb1.class);
                                    id1Var.a(za1.f13133c);
                                    tc1Var.a(za1.f13131a, true);
                                    sd1 sd1Var5 = mb1.f8300a;
                                    if (ct.i(1)) {
                                        jd1Var.c(ic1.f7103a);
                                        jd1Var.d(ic1.f7104b);
                                        jd1Var.a(ic1.f7105c);
                                        jd1Var.b(ic1.f7106d);
                                        id1Var.a(mb1.f8300a);
                                        HashMap hashMap6 = new HashMap();
                                        hashMap6.put("XCHACHA20_POLY1305", new nb1(w91.f12186m));
                                        hashMap6.put("XCHACHA20_POLY1305_RAW", new nb1(w91.f12188o));
                                        hd1Var.b(Collections.unmodifiableMap(hashMap6));
                                        fd1Var.a(mb1.f8303d, nb1.class);
                                        gd1Var.a(mb1.f8302c, nb1.class);
                                        tc1Var.a(mb1.f8301b, true);
                                        sd1 sd1Var6 = jb1.f7395a;
                                        jd1Var.c(fc1.f6019a);
                                        jd1Var.d(fc1.f6020b);
                                        jd1Var.a(fc1.f6021c);
                                        jd1Var.b(fc1.f6022d);
                                        HashMap hashMap7 = new HashMap();
                                        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", hb1.f6664g);
                                        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", hb1.f6665h);
                                        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", hb1.i);
                                        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", hb1.f6666j);
                                        hd1Var.b(Collections.unmodifiableMap(hashMap7));
                                        id1Var.a(jb1.f7395a);
                                        fd1Var.a(ga1.i, kb1.class);
                                        return;
                                    }
                                    androidx.datastore.preferences.protobuf.s1.q("Registering XChaCha20Poly1305 is not supported in FIPS mode");
                                    return;
                                }
                                androidx.datastore.preferences.protobuf.s1.q("Registering KMS Envelope AEAD is not supported in FIPS mode");
                                return;
                            }
                            androidx.datastore.preferences.protobuf.s1.q("Registering KMS AEAD is not supported in FIPS mode");
                            return;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Registering ChaCha20Poly1305 is not supported in FIPS mode");
                        return;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Registering AES GCM SIV is not supported in FIPS mode");
                    return;
                }
                androidx.datastore.preferences.protobuf.s1.q("Registering AES EAX is not supported in FIPS mode");
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
