package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum tj implements fn1 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: u, reason: collision with root package name */
    public final int f11357u;

    tj(int i) {
        this.f11357u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11357u);
    }

    @Override // com.google.android.gms.internal.ads.fn1
    public final int zza() {
        return this.f11357u;
    }
}
