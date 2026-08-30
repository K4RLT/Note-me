package com.google.android.filament;

/* loaded from: classes.dex */
public class EntityManager {

    /* renamed from: a, reason: collision with root package name */
    public final long f4217a;

    public EntityManager() {
        this.f4217a = nGetEntityManager();
    }

    private static native int nCreate(long j10);

    private static native void nDestroy(long j10, int i);

    private static native long nGetEntityManager();

    public final int a() {
        return nCreate(this.f4217a);
    }

    public final void b(int i) {
        nDestroy(this.f4217a, i);
    }

    public long getNativeObject() {
        return this.f4217a;
    }

    public EntityManager(long j10) {
        nGetEntityManager();
        this.f4217a = j10;
    }
}
