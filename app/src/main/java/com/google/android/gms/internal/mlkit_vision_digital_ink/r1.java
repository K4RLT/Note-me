package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: c, reason: collision with root package name */
    public static final r1 f14885c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f14886a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f14887b;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f14885c = new r1(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public r1(UUID uuid, long j10) {
        this.f14886a = uuid;
        this.f14887b = new AtomicLong((j10 ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j10;
        do {
            atomicLong = this.f14887b;
            j10 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j10, ((25214903917L * (((j10 * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID b() {
        long a10 = a() & (-61441);
        long a11 = a() >>> 2;
        UUID uuid = this.f14886a;
        return new UUID(a10 ^ uuid.getMostSignificantBits(), a11 ^ uuid.getLeastSignificantBits());
    }
}
