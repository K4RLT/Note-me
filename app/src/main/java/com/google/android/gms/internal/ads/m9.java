package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m9 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f8277f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f8278a;

    /* renamed from: b, reason: collision with root package name */
    public int f8279b;

    /* renamed from: c, reason: collision with root package name */
    public int f8280c;

    /* renamed from: d, reason: collision with root package name */
    public int f8281d;
    public byte[] e;

    public final void a(byte[] bArr, int i, int i10) {
        if (!this.f8278a) {
            return;
        }
        int i11 = i10 - i;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i12 = this.f8280c + i11;
        if (length < i12) {
            this.e = Arrays.copyOf(bArr2, i12 + i12);
        }
        System.arraycopy(bArr, i, this.e, this.f8280c, i11);
        this.f8280c += i11;
    }
}
