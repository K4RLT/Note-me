package com.google.android.gms.internal.ads;
import j6.c;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class oe1 {
    static {
        int i = ai1.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        re1 re1Var = re1.f10215a;
        id1 id1Var = id1.f7114b;
        id1Var.b(re1.f10215a);
        id1Var.a(re1.f10216b);
        id1Var.b(je1.f7426a);
        int i = le1.f8022f;
        if (ct.i(i)) {
            c cVar = ve1.f11893a;
            jd1 jd1Var = jd1.f7422b;
            jd1Var.c(ve1.f11894b);
            jd1Var.d(ve1.f11895c);
            jd1Var.a(ve1.f11896d);
            jd1Var.b(ve1.e);
            id1Var.a(le1.f8018a);
            id1Var.a(le1.f8019b);
            hd1 hd1Var = hd1.f6699b;
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", se1.f10599a);
            na1 na1Var = new na1(3);
            na1Var.a(32);
            na1Var.d(16);
            ja1 ja1Var = ja1.J;
            na1Var.e = ja1Var;
            me1 me1Var = me1.f8333d;
            na1Var.f8632d = me1Var;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", na1Var.k());
            na1 na1Var2 = new na1(3);
            na1Var2.a(32);
            na1Var2.d(32);
            ja1 ja1Var2 = ja1.G;
            na1Var2.e = ja1Var2;
            na1Var2.f8632d = me1Var;
            hashMap.put("HMAC_SHA256_256BITTAG", na1Var2.k());
            na1 na1Var3 = new na1(3);
            na1Var3.a(32);
            na1Var3.d(32);
            na1Var3.e = ja1Var;
            na1Var3.f8632d = me1Var;
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", na1Var3.k());
            na1 na1Var4 = new na1(3);
            na1Var4.a(64);
            na1Var4.d(16);
            na1Var4.e = ja1Var2;
            me1 me1Var2 = me1.f8334f;
            na1Var4.f8632d = me1Var2;
            hashMap.put("HMAC_SHA512_128BITTAG", na1Var4.k());
            na1 na1Var5 = new na1(3);
            na1Var5.a(64);
            na1Var5.d(16);
            na1Var5.e = ja1Var;
            na1Var5.f8632d = me1Var2;
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", na1Var5.k());
            na1 na1Var6 = new na1(3);
            na1Var6.a(64);
            na1Var6.d(32);
            na1Var6.e = ja1Var2;
            na1Var6.f8632d = me1Var2;
            hashMap.put("HMAC_SHA512_256BITTAG", na1Var6.k());
            na1 na1Var7 = new na1(3);
            na1Var7.a(64);
            na1Var7.d(32);
            na1Var7.e = ja1Var;
            na1Var7.f8632d = me1Var2;
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", na1Var7.k());
            hashMap.put("HMAC_SHA512_512BITTAG", se1.f10600b);
            na1 na1Var8 = new na1(3);
            na1Var8.a(64);
            na1Var8.d(64);
            na1Var8.e = ja1Var;
            na1Var8.f8632d = me1Var2;
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", na1Var8.k());
            hd1Var.b(Collections.unmodifiableMap(hashMap));
            fd1 fd1Var = fd1.f6043b;
            fd1Var.a(le1.e, ne1.class);
            gd1.f6378b.a(le1.f8021d, ne1.class);
            tc1 tc1Var = tc1.f11325d;
            tc1Var.c(le1.f8020c, i, true);
            if (lc1.a()) {
                return;
            }
            sd1 sd1Var = he1.f6702a;
            if (ct.i(1)) {
                jd1Var.c(te1.f11333a);
                jd1Var.d(te1.f11334b);
                jd1Var.a(te1.f11335c);
                jd1Var.b(te1.f11336d);
                fd1Var.a(ga1.f6346l, ie1.class);
                id1Var.a(he1.f6702a);
                id1Var.a(he1.f6703b);
                HashMap hashMap2 = new HashMap();
                ie1 ie1Var = se1.f10601c;
                hashMap2.put("AES_CMAC", ie1Var);
                hashMap2.put("AES256_CMAC", ie1Var);
                hq0 hq0Var = new hq0(23);
                hq0Var.p(32);
                hq0Var.t(16);
                hq0Var.f6874x = x91.f12520u;
                hashMap2.put("AES256_CMAC_RAW", hq0Var.B());
                hd1Var.b(Collections.unmodifiableMap(hashMap2));
                tc1Var.a(he1.f6704c, true);
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
