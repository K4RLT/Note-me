package ca;
import q.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.internal.ads.bb;
import fa.y;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class i implements bb {

    /* renamed from: w, reason: collision with root package name */
    public static i f4041w;

    /* renamed from: u, reason: collision with root package name */
    public final Object f4042u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f4043v;

    public i(Context context, int i) {
        switch (i) {
            case 1:
                this.f4042u = context;
                return;
            default:
                this.f4042u = context.getApplicationContext();
                return;
        }
    }

    public static i b(Context context) {
        y.h(context);
        synchronized (i.class) {
            if (f4041w == null) {
                l lVar = q.f4057a;
                synchronized (q.class) {
                    if (e == null) {
                        e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f4041w = new i(context, 0);
            }
        }
        return f4041w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.i.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static m e(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    @Override // com.google.android.gms.internal.ads.bb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.eb a(com.google.android.gms.internal.ads.gb r15) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.i.a(com.google.android.gms.internal.ads.gb):com.google.android.gms.internal.ads.eb");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r18) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.i.c(int):boolean");
    }

    public i() {
        this.f4042u = new CopyOnWriteArraySet();
    }
}
