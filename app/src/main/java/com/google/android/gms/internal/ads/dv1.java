package com.google.android.gms.internal.ads;
import q.x;

/* loaded from: classes.dex */
public final class dv1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5537a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5539c;

    /* renamed from: d, reason: collision with root package name */
    public int f5540d = 0;

    public final ev1 a() {
        if (!this.f5537a && (this.f5538b || this.f5539c)) {
            x.o("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        return new ev1(this);
    }
}
