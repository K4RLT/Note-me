package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class v21 {

    /* renamed from: a, reason: collision with root package name */
    public static final w91 f11787a = new w91("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        Signature[] signatureArr;
        String str;
        w91 w91Var = f11787a;
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            w91Var.c("Play Store package is not found.", new Object[0]);
        }
        if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
            w91Var.c("Play Store package is disabled.", new Object[0]);
            return false;
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused2) {
            w91Var.c("Play Store package is not found.", new Object[0]);
        }
        if (signatureArr != null && (signatureArr.length) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    str = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException unused3) {
                    str = "";
                }
                arrayList.add(str);
                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                    String str2 = Build.TAGS;
                    if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) ", ");
                }
            }
            w91Var.c(p.a.k("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "]."), new Object[0]);
            return false;
        }
        w91Var.c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
        return false;
    }
}
