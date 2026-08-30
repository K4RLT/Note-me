package com.google.android.gms.internal.measurement;
import f0.a;
import f0.d;
import p.a;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q0 extends g0 implements t0 {

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f13886u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13887v;

    public q0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f13886u = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r0(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = a.l(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q0.r0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.g0
    public final boolean R(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) a(parcel, Bundle.CREATOR);
            d(parcel);
            k0(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle g0(long j10) {
        Bundle bundle;
        synchronized (this.f13886u) {
            if (!this.f13887v) {
                try {
                    this.f13886u.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f13886u.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void k0(Bundle bundle) {
        synchronized (this.f13886u) {
            try {
                try {
                    this.f13886u.set(bundle);
                    this.f13887v = true;
                } finally {
                    this.f13886u.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
