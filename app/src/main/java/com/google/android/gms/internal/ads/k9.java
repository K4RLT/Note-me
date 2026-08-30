package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k9 {
    public static final byte[] e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f7684a;

    /* renamed from: b, reason: collision with root package name */
    public int f7685b;

    /* renamed from: c, reason: collision with root package name */
    public int f7686c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7687d;

    public final void a(byte[] bArr, int i, int i10) {
        if (!this.f7684a) {
            return;
        }
        int i11 = i10 - i;
        byte[] bArr2 = this.f7687d;
        int length = bArr2.length;
        int i12 = this.f7685b + i11;
        if (length < i12) {
            this.f7687d = Arrays.copyOf(bArr2, i12 + i12);
        }
        System.arraycopy(bArr, i, this.f7687d, this.f7685b, i11);
        this.f7685b += i11;
    }
}
