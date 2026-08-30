package com.google.android.filament;

/* loaded from: classes.dex */
public abstract class ToneMapper {

    /* renamed from: a, reason: collision with root package name */
    public final long f4235a;

    public ToneMapper(long j10) {
        this.f4235a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateLinearToneMapper();

    private static native void nDestroyToneMapper(long j10);

    public final void finalize() {
        long j10 = this.f4235a;
        try {
            super.finalize();
        } finally {
            nDestroyToneMapper(j10);
        }
    }
}
