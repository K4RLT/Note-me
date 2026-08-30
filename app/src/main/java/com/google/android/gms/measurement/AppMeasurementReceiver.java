package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import eb.d1;
import eb.k0;
import pd.c;
import t4.a;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public c f15569c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f15569c == null) {
            this.f15569c = new c(this);
        }
        c cVar = this.f15569c;
        cVar.getClass();
        k0 k0Var = d1.a(context, null, null).C;
        d1.d(k0Var);
        if (intent == null) {
            k0Var.D.g("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        k0Var.I.f(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            k0Var.I.g("Starting wakeful intent.");
            ((AppMeasurementReceiver) cVar.f22681u).getClass();
            SparseArray sparseArray = a.f25641a;
            synchronized (sparseArray) {
                try {
                    int i = a.f25642b;
                    int i10 = i + 1;
                    a.f25642b = i10;
                    if (i10 <= 0) {
                        a.f25642b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i);
                    ComponentName startService = context.startService(className);
                    if (startService == null) {
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i, newWakeLock);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            k0Var.D.g("Install Referrer Broadcasts are deprecated");
        }
    }
}
