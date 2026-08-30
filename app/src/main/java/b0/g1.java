package b0;
import b.a;
import l.c;
import r.e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.as1;
import com.google.android.gms.internal.ads.dj1;
import com.google.android.gms.internal.ads.i3;
import com.google.android.gms.internal.ads.jy1;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.pf1;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xk0;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g1 implements pf1 {

    /* renamed from: u, reason: collision with root package name */
    public int f1188u;

    /* renamed from: v, reason: collision with root package name */
    public int f1189v;

    /* renamed from: w, reason: collision with root package name */
    public Object f1190w;

    /* renamed from: x, reason: collision with root package name */
    public Object f1191x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1192y;

    public g1(Context context, int i) {
        switch (i) {
            case 4:
                this.f1189v = 0;
                this.f1190w = context;
                return;
            default:
                this.f1192y = "";
                this.f1190w = context;
                this.f1191x = context.getApplicationInfo();
                nl nlVar = sl.f11017xa;
                g9.r rVar = g9.e;
                this.f1188u = ((Integer) rVar.f17698c.a(nlVar)).intValue();
                this.f1189v = ((Integer) rVar.f17698c.a(sl.f11034ya)).intValue();
                return;
        }
    }

    public static String i(bc.g gVar) {
        gVar.a();
        bc.j jVar = gVar.f3179c;
        String str = jVar.e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = jVar.f3191b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public long a(dj1 dj1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public void b(as1 as1Var) {
        as1Var.getClass();
        ((pf1) this.f1190w).b(as1Var);
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public Uri c() {
        return ((pf1) this.f1190w).c();
    }

    public int d(long j10) {
        int i = this.f1188u + 1;
        long[] jArr = (long[]) this.f1190w;
        int length = jArr.length;
        if (i > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            int[] iArr = new int[i10];
            qe.k.e(jArr, jArr2, 0, 0, jArr.length);
            qe.k.f(0, 0, 14, (int[]) this.f1191x, iArr);
            this.f1190w = jArr2;
            this.f1191x = iArr;
        }
        int i11 = this.f1188u;
        this.f1188u = i11 + 1;
        int length2 = ((int[]) this.f1192y).length;
        if (this.f1189v >= length2) {
            int i12 = length2 * 2;
            int[] iArr2 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                iArr2[i13] = i14;
                i13 = i14;
            }
            qe.k.f(0, 0, 14, (int[]) this.f1192y, iArr2);
            this.f1192y = iArr2;
        }
        int i15 = this.f1189v;
        int[] iArr3 = (int[]) this.f1192y;
        this.f1189v = iArr3[i15];
        long[] jArr3 = (long[]) this.f1190w;
        jArr3[i11] = j10;
        ((int[]) this.f1191x)[i11] = i15;
        iArr3[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.c(jArr3[i16], j10) <= 0) {
                break;
            }
            q(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public int e(byte[] bArr, int i, int i10) {
        long max;
        pf1 pf1Var = (pf1) this.f1190w;
        int i11 = this.f1189v;
        if (i11 == 0) {
            byte[] bArr2 = (byte[]) this.f1192y;
            int i12 = 0;
            if (pf1Var.e(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int e = pf1Var.e(bArr3, i12, i14);
                        if (e != -1) {
                            i12 += e;
                            i14 -= e;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr3[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        jy1 jy1Var = (jy1) this.f1191x;
                        xk0 xk0Var = new xk0(bArr3, i13);
                        if (!jy1Var.f7581l) {
                            max = jy1Var.i;
                        } else {
                            max = Math.max(jy1Var.f7582m.t(true), jy1Var.i);
                        }
                        long j10 = max;
                        int B = xk0Var.B();
                        i3 i3Var = jy1Var.f7580k;
                        i3Var.getClass();
                        i3Var.a(B, xk0Var);
                        i3Var.c(j10, 1, B, 0, null);
                        jy1Var.f7581l = true;
                    }
                }
                i11 = this.f1188u;
                this.f1189v = i11;
            }
            return -1;
        }
        int e8 = pf1Var.e(bArr, i, Math.min(i11, i10));
        if (e8 != -1) {
            this.f1189v -= e8;
        }
        return e8;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public Map f() {
        return ((pf1) this.f1190w).f();
    }

    public synchronized String g() {
        try {
            if (((String) this.f1191x) == null) {
                o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f1191x;
    }

    public PackageInfo j(String str) {
        try {
            return ((Context) this.f1190w).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public void k() {
        throw new UnsupportedOperationException();
    }

    public boolean l() {
        int i;
        synchronized (this) {
            i = this.f1189v;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f1190w).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!la.b.h()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1189v = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f1189v = 2;
                        i = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (la.b.h()) {
                            this.f1189v = 2;
                        } else {
                            this.f1189v = 1;
                        }
                        i = this.f1189v;
                    }
                }
            }
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public synchronized void o() {
        PackageInfo j10 = j(((Context) this.f1190w).getPackageName());
        if (j10 != null) {
            this.f1191x = Integer.toString(j10.versionCode);
            this.f1192y = j10.versionName;
        }
    }

    public void q(int i, int i10) {
        long[] jArr = (long[]) this.f1190w;
        int[] iArr = (int[]) this.f1191x;
        int[] iArr2 = (int[]) this.f1192y;
        long j10 = jArr[i];
        jArr[i] = jArr[i10];
        jArr[i10] = j10;
        int i11 = iArr[i];
        int i12 = iArr[i10];
        iArr[i] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i;
        iArr2[i11] = i10;
    }

    public JSONObject r() {
        String str;
        String encodeToString;
        int i = this.f1189v;
        int i10 = this.f1188u;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f1191x;
        Context context = (Context) this.f1190w;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            k9.b0 b0Var = k9.f0.f19676l;
            Context context2 = na.a(context).f3851u;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        k9.f0 f0Var = f9.k.C.f16813c;
        Drawable drawable = null;
        try {
            str = k9.f0.M(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (((String) this.f1192y).isEmpty()) {
            try {
                c4.n a10 = na.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a10.f3851u;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i10, i);
                Bitmap createBitmap = Bitmap.createBitmap(i10, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f1192y = encodeToString;
        }
        if (!((String) this.f1192y).isEmpty()) {
            jSONObject.put("icon", (String) this.f1192y);
            jSONObject.put("iconWidthPx", i10);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }
}
