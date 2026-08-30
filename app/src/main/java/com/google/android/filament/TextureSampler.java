package com.google.android.filament;
import d.b;

/* loaded from: classes.dex */
public class TextureSampler {

    /* renamed from: a, reason: collision with root package name */
    public final long f4234a;

    public TextureSampler(int i) {
        this.f4234a = 0L;
        this.f4234a = nCreateSampler(q0.b(i), q0.b(2), q0.b(1), q0.b(1), q0.b(1));
    }

    private static native long nCreateSampler(int i, int i10, int i11, int i12, int i13);
}
