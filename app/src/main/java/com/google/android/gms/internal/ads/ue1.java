package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class ue1 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ue1, java.lang.Object] */
    public static ue1 a(ge1 ge1Var, Provider provider) {
        Object obj = new Object();
        if (ct.i(1)) {
            try {
                Mac.getInstance("AESCMAC", provider);
                ge1Var.R.b();
                new SecretKeySpec(((gl1) ge1Var.Q.f4819v).b(), "AES");
                return obj;
            } catch (NoSuchAlgorithmException e) {
                throw new GeneralSecurityException("AES-CMAC not available.", e);
            }
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot use AES-CMAC in FIPS-mode.");
        return null;
    }
}