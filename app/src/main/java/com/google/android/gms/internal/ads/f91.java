package com.google.android.gms.internal.ads;
import ac.b;
import p.a;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f91 extends p81 {
    public b B;
    public ScheduledFuture C;

    @Override // com.google.android.gms.internal.ads.r71
    public final void f() {
        p(this.B);
        ScheduledFuture scheduledFuture = this.C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.B = null;
        this.C = null;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String h() {
        b bVar = this.B;
        ScheduledFuture scheduledFuture = this.C;
        if (bVar != null) {
            String obj = bVar.toString();
            String o10 = a.o(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    int length = o10.length();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
                    sb2.append(o10);
                    sb2.append(", remaining delay=[");
                    sb2.append(delay);
                    sb2.append(" ms]");
                    return sb2.toString();
                }
                return o10;
            }
            return o10;
        }
        return null;
    }
}
