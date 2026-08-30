package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class yv0 {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f12975a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f12976b;

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f12977c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f12978d;
    public static final UUID e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f12975a = new UUID(0L, 0L);
        f12976b = new UUID(1186680826959645954L, -5988876978535335093L);
        f12977c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f12978d = new UUID(-1301668207276963122L, -6645017420763422227L);
        e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
