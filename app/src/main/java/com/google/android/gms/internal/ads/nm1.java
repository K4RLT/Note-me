package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class nm1 extends OutputStream {

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f8770z = new byte[0];

    /* renamed from: w, reason: collision with root package name */
    public int f8773w;

    /* renamed from: y, reason: collision with root package name */
    public int f8775y;

    /* renamed from: u, reason: collision with root package name */
    public final int f8771u = 128;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f8772v = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public byte[] f8774x = new byte[128];

    public final synchronized om1 f() {
        try {
            int i = this.f8775y;
            byte[] bArr = this.f8774x;
            if (i < bArr.length) {
                if (i > 0) {
                    this.f8772v.add(new mm1(Arrays.copyOf(bArr, i)));
                }
            } else {
                this.f8772v.add(new mm1(this.f8774x));
                this.f8774x = f8770z;
            }
            this.f8773w += this.f8775y;
            this.f8775y = 0;
        } catch (Throwable th) {
            throw th;
        }
        return om1.C(this.f8772v);
    }

    public final void j(int i) {
        this.f8772v.add(new mm1(this.f8774x));
        int length = this.f8773w + this.f8774x.length;
        this.f8773w = length;
        this.f8774x = new byte[Math.max(this.f8771u, Math.max(i, length >>> 1))];
        this.f8775y = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f8773w + this.f8775y;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        byte[] bArr2 = this.f8774x;
        int length = bArr2.length;
        int i11 = this.f8775y;
        int i12 = length - i11;
        if (i10 <= i12) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.f8775y += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i12);
        int i13 = i10 - i12;
        j(i13);
        System.arraycopy(bArr, i + i12, this.f8774x, 0, i13);
        this.f8775y = i13;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f8775y == this.f8774x.length) {
                j(1);
            }
            byte[] bArr = this.f8774x;
            int i10 = this.f8775y;
            this.f8775y = i10 + 1;
            bArr[i10] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
