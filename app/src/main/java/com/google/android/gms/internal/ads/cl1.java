package com.google.android.gms.internal.ads;
import j6.c;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class cl1 implements z91 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5115a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5116b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final c f5117c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        zk1 zk1Var = zk1.f13181u;
        oj1 oj1Var = oj1.f9138b;
        hashMap.put(zk1Var, oj1Var);
        hashMap2.put(oj1Var, zk1Var);
        zk1 zk1Var2 = zk1.f13182v;
        oj1 oj1Var2 = oj1.f9139c;
        hashMap.put(zk1Var2, oj1Var2);
        hashMap2.put(oj1Var2, zk1Var2);
        zk1 zk1Var3 = zk1.f13183w;
        oj1 oj1Var3 = oj1.f9140d;
        hashMap.put(zk1Var3, oj1Var3);
        hashMap2.put(oj1Var3, zk1Var3);
        f5117c = new c(8, (Object) Collections.unmodifiableMap(hashMap), (Object) Collections.unmodifiableMap(hashMap2), false);
    }

    public static z91 b(rj1 rj1Var) {
        byte[] bArr;
        Integer valueOf;
        try {
            int i = fe1.f6052a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                }
                valueOf.getClass();
            }
            Provider h3 = x21.h();
            if (h3 != null) {
                return lk1.c(rj1Var, h3);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) yk1.f12904g.f12905a.o("RSA");
            BigInteger bigInteger = rj1Var.Q;
            pj1 pj1Var = rj1Var.P;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, pj1Var.f9534b));
            zk1 zk1Var = (zk1) f5117c.m(pj1Var.f9536d);
            byte[] b10 = rj1Var.R.b();
            if (pj1Var.f9535c.equals(q91.M)) {
                bArr = f5116b;
            } else {
                bArr = f5115a;
            }
            return new hk1(rSAPublicKey, zk1Var, b10, bArr);
        }
    }
}
