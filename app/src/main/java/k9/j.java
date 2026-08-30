package k9;
import j.f;
import r.e;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.mf0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.sl;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19703a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f19704b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f19705c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f19706d = false;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f19707f = "";

    /* renamed from: g, reason: collision with root package name */
    public nf0 f19708g;

    public static final String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", f9.k.C.f16813c.E(context, str2));
        p a10 = new r(context).a(0, str, hashMap, null);
        try {
            return (String) a10.f12998u.get(((Integer) g9.e.f17698c.a(sl.W5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            int i = a0.f19634b;
            l9.i.d("Interrupted while retrieving a response from: ".concat(valueOf), e);
            a10.cancel(true);
            return null;
        } catch (TimeoutException e8) {
            String valueOf2 = String.valueOf(str);
            int i10 = a0.f19634b;
            l9.i.d("Timeout while retrieving a response from: ".concat(valueOf2), e8);
            a10.cancel(true);
            return null;
        } catch (Exception e10) {
            String valueOf3 = String.valueOf(str);
            int i11 = a0.f19634b;
            l9.i.d("Error retrieving a response from: ".concat(valueOf3), e10);
            return null;
        }
    }

    public final void a(Context context) {
        nf0 nf0Var;
        if (((Boolean) g9.e.f17698c.a(sl.f11048za)).booleanValue() && (nf0Var = this.f19708g) != null) {
            nf0Var.e(new h(this, context), mf0.f8342x);
        }
    }

    public final boolean b(Context context, String str, String str2) {
        nl nlVar = sl.U5;
        g9.r rVar = g9.e;
        String j10 = j(context, k(context, (String) rVar.f17698c.a(nlVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j10)) {
            int i = a0.f19634b;
            l9.i.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j10.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) rVar.f17698c.a(sl.f11048za)).booleanValue()) {
                c0 g8 = f9.k.C.f16817h.g();
                if (true != equals) {
                    str = "";
                }
                g8.f(str);
            }
            return equals;
        } catch (JSONException e) {
            int i10 = a0.f19634b;
            l9.i.g("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        f0 f0Var = f9.k.C.f16813c;
        f0.t(context, k(context, (String) g9.e.f17698c.a(sl.S5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && h()) {
            int i = a0.f19634b;
            l9.i.a("Sending troubleshooting signals to the server.");
            e(context, str, str2, str3);
            return true;
        }
        return false;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) g9.e.f17698c.a(sl.V5), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        f0 f0Var = f9.k.C.f16813c;
        new u(context, str, buildUpon.build().toString(), null).r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f19703a
            monitor-enter(r0)
            r3.e = r4     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f11048za     // Catch: java.lang.Throwable -> L44
            g9.r r2 = g9.e     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.ql r2 = r2.f17698c     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            f9.k r1 = f9.k.C     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.px r1 = r1.f16817h     // Catch: java.lang.Throwable -> L44
            k9.c0 r1 = r1.g()     // Catch: java.lang.Throwable -> L44
            r1.e(r4)     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.nf0 r1 = r3.f19708g     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            boolean r2 = r1.f8706u     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L30
            if (r4 == 0) goto L3a
            r1.j()     // Catch: java.lang.Throwable -> L44
            goto L32
        L30:
            if (r4 == 0) goto L3a
        L32:
            boolean r4 = r1.f8704s     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L3a
            r1.k()     // Catch: java.lang.Throwable -> L44
            goto L46
        L3a:
            boolean r4 = r1.f()     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L46
            r1.l()     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r4 = move-exception
            goto L48
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.f(boolean):void");
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f19703a) {
            z3 = this.e;
        }
        return z3;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f19703a) {
            z3 = this.f19706d;
        }
        return z3;
    }

    public final void i(Context context, String str, boolean z3, boolean z9) {
        if (!(context instanceof Activity)) {
            int i = a0.f19634b;
            l9.i.e("Can not create dialog without Activity Context");
        } else {
            f0.f19676l.post(new i(this, context, str, z3, z9));
        }
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f19703a) {
            if (TextUtils.isEmpty(this.f19704b)) {
                f0 f0Var = f9.k.C.f16813c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    la.b.e(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i = a0.f19634b;
                    l9.i.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f19704b = str5;
                if (TextUtils.isEmpty(str5)) {
                    f0 f0Var2 = f9.k.C.f16813c;
                    String uuid = UUID.randomUUID().toString();
                    this.f19704b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes(StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (Exception e) {
                        int i10 = a0.f19634b;
                        l9.i.d("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f19704b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
