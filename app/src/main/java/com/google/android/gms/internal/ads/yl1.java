package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yl1 implements CharSequence {

    /* renamed from: u, reason: collision with root package name */
    public char[] f12909u;

    /* renamed from: v, reason: collision with root package name */
    public String f12910v;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f12909u[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12909u.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return new String(this.f12909u, i, i10 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f12910v == null) {
            this.f12910v = new String(this.f12909u);
        }
        return this.f12910v;
    }
}
