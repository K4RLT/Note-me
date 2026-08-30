package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bv0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4887a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4888b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) {
        try {
            X509Certificate[][] k3 = ct.k(file.getAbsolutePath());
            if (k3.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(k3[0][0].getEncoded());
                if (Arrays.equals(f4887a, digest) || (!"user".equals(Build.TYPE) && Arrays.equals(f4888b, digest))) {
                    return true;
                }
                return false;
            }
            androidx.datastore.preferences.protobuf.s1.q("APK has more than one signature.");
            return false;
        } catch (ta e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e8) {
            throw new GeneralSecurityException("Failed to verify signatures", e8);
        }
    }
}
