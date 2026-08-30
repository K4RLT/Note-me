package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qn1 extends InputStream {
    public byte[] A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f9910u;

    /* renamed from: v, reason: collision with root package name */
    public ByteBuffer f9911v;

    /* renamed from: w, reason: collision with root package name */
    public int f9912w;

    /* renamed from: x, reason: collision with root package name */
    public int f9913x;

    /* renamed from: y, reason: collision with root package name */
    public int f9914y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9915z;

    public final boolean f() {
        ByteBuffer byteBuffer;
        Iterator it = this.f9910u;
        do {
            this.f9913x++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f9911v = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f9914y = this.f9911v.position();
        if (this.f9911v.hasArray()) {
            this.f9915z = true;
            this.A = this.f9911v.array();
            this.B = this.f9911v.arrayOffset();
        } else {
            this.f9915z = false;
            this.A = null;
        }
        return true;
    }

    public final void j(int i) {
        int i10 = this.f9914y + i;
        this.f9914y = i10;
        if (i10 == this.f9911v.limit()) {
            f();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        if (this.f9913x == this.f9912w) {
            return -1;
        }
        int limit = this.f9911v.limit();
        int i11 = this.f9914y;
        int i12 = limit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f9915z) {
            System.arraycopy(this.A, i11 + this.B, bArr, i, i10);
            j(i10);
            return i10;
        }
        int position = this.f9911v.position();
        this.f9911v.position(this.f9914y);
        this.f9911v.get(bArr, i, i10);
        this.f9911v.position(position);
        j(i10);
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f9913x == this.f9912w) {
            return -1;
        }
        if (this.f9915z) {
            int i = this.A[this.f9914y + this.B] & 255;
            j(1);
            return i;
        }
        int i10 = this.f9911v.get(this.f9914y) & 255;
        j(1);
        return i10;
    }
}
