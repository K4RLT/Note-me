package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ny {

    /* renamed from: b, reason: collision with root package name */
    public long f8891b;

    /* renamed from: a, reason: collision with root package name */
    public final long f8890a = TimeUnit.MILLISECONDS.toNanos(((Long) g9.r.e.f17698c.a(sl.f10848n0)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f8892c = true;

    public final void a(SurfaceTexture surfaceTexture, ly lyVar) {
        if (lyVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.f8892c) {
                long j10 = timestamp - this.f8891b;
                if (Math.abs(j10) < this.f8890a) {
                    return;
                }
            }
            this.f8892c = false;
            this.f8891b = timestamp;
            k9.f0.f19676l.post(new jy(lyVar, 3));
        }
    }
}
