package ca;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f4050w;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4050w = bArr;
    }

    @Override // ca.m
    public final byte[] v1() {
        return this.f4050w;
    }
}
