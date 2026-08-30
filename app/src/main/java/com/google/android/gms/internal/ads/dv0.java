package com.google.android.gms.internal.ads;
import q.x;

/* loaded from: classes.dex */
public final class dv0 {

    /* renamed from: a, reason: collision with root package name */
    public String f5532a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5534c;

    /* renamed from: d, reason: collision with root package name */
    public long f5535d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public byte f5536f;

    public final ev0 a() {
        String str;
        if (this.f5536f == 63 && (str = this.f5532a) != null) {
            return new ev0(str, this.f5533b, this.f5534c, this.f5535d, this.e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f5532a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f5536f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f5536f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f5536f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f5536f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f5536f & 16) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f5536f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        x.o("Missing required properties:".concat(sb2.toString()));
        return null;
    }
}
