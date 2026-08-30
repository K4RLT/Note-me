package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
public final class t2 extends Random {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14997u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f14998v = true;

    public static final SecureRandom a() {
        SecureRandom secureRandom = (SecureRandom) u2.f15041a.get();
        Objects.requireNonNull(secureRandom);
        return secureRandom;
    }

    @Override // java.util.Random
    public int next(int i) {
        switch (this.f14997u) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.next(i);
        }
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        switch (this.f14997u) {
            case 1:
                return a().nextBoolean();
            default:
                return super.nextBoolean();
        }
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        switch (this.f14997u) {
            case 1:
                a().nextBytes(bArr);
                return;
            default:
                super.nextBytes(bArr);
                return;
        }
    }

    @Override // java.util.Random
    public double nextDouble() {
        switch (this.f14997u) {
            case 1:
                return a().nextDouble();
            default:
                return super.nextDouble();
        }
    }

    @Override // java.util.Random
    public float nextFloat() {
        switch (this.f14997u) {
            case 1:
                return a().nextFloat();
            default:
                return super.nextFloat();
        }
    }

    @Override // java.util.Random
    public double nextGaussian() {
        switch (this.f14997u) {
            case 1:
                return a().nextGaussian();
            default:
                return super.nextGaussian();
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        switch (this.f14997u) {
            case 1:
                return a().nextInt();
            default:
                return super.nextInt();
        }
    }

    @Override // java.util.Random
    public long nextLong() {
        switch (this.f14997u) {
            case 1:
                return a().nextLong();
            default:
                return super.nextLong();
        }
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        switch (this.f14997u) {
            case 0:
                if (!this.f14998v) {
                    super.setSeed(j10);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.s1.k("Setting the seed on the shared Random object is not permitted");
                    return;
                }
            default:
                if (!this.f14998v) {
                    super.setSeed(j10);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.s1.k("Setting the seed on a thread-local Random object is not permitted");
                    return;
                }
        }
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        switch (this.f14997u) {
            case 1:
                return a().nextInt(i);
            default:
                return super.nextInt(i);
        }
    }
}
