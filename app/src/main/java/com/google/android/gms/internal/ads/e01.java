package com.google.android.gms.internal.ads;
import qe.z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final h21 f5571b;

    /* renamed from: c, reason: collision with root package name */
    public final hz0 f5572c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5573d;
    public final boolean e;

    public e01(Context context, h21 h21Var, hz0 hz0Var, rx0 rx0Var) {
        this.f5570a = context;
        this.f5571b = h21Var;
        this.f5572c = hz0Var;
        this.f5573d = rx0Var.Q();
        this.e = rx0Var.i0();
    }

    public final String a(long j10) {
        boolean z3;
        String str = "E";
        Context context = this.f5570a;
        try {
            this.f5571b.a(55).a();
            pe z9 = qe.z();
            String str2 = this.f5573d;
            z9.b();
            ((qe) z9.f4845v).B(str2);
            z9.b();
            ((qe) z9.f4845v).A("0.904631200");
            String packageName = context.getPackageName();
            z9.b();
            ((qe) z9.f4845v).D(packageName);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            z9.b();
            ((qe) z9.f4845v).C(currentTimeMillis);
            long currentTimeMillis2 = (System.currentTimeMillis() - j10) / 1000;
            z9.b();
            ((qe) z9.f4845v).F(currentTimeMillis2);
            if (this.e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : digest) {
                            String hexString = Integer.toHexString(b10 & 255);
                            if (hexString.length() == 1) {
                                sb2.append('0');
                            }
                            sb2.append(hexString);
                        }
                        str = Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                z9.b();
                ((qe) z9.f4845v).G(str);
            }
            try {
                long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                z9.b();
                ((qe) z9.f4845v).E(j11);
            } catch (PackageManager.NameNotFoundException unused2) {
                z9.b();
                ((qe) z9.f4845v).E(-1L);
            }
            hz0 hz0Var = this.f5572c;
            synchronized (hz0Var) {
                z3 = hz0Var.f6939d;
            }
            if (!z3) {
                hz0Var.a();
            }
            te d2 = hz0Var.d(null, ((qe) z9.c()).b());
            d2.b();
            ((ue) d2.f4845v).C(5);
            d2.b();
            ((ue) d2.f4845v).D(2);
            byte[] b11 = ((ue) d2.c()).b();
            p61 p61Var = r61.e;
            if (p61Var.f10132b != null) {
                p61Var = new p61(p61Var.f10131a, (Character) null);
            }
            return p61Var.g(b11, b11.length);
        } finally {
        }
    }
}
