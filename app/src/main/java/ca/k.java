package ca;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class k extends bb.a {

    /* renamed from: b, reason: collision with root package name */
    public final Context f4044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f4045c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(ca.e r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.f4045c = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto Ld
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r2 = android.os.Looper.myLooper()
        L11:
            r0 = 3
            r1.<init>(r2, r0)
            android.content.Context r2 = r3.getApplicationContext()
            r1.f4044b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.k.<init>(ca.e, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i10 = f.f4035a;
        e eVar = this.f4045c;
        Context context = this.f4044b;
        int c10 = eVar.c(context, i10);
        int i11 = h.e;
        if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 9) {
            return;
        }
        Intent b10 = eVar.b(context, "n", c10);
        if (b10 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, b10, 201326592);
        }
        eVar.g(context, c10, activity);
    }
}
