package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class fw1 extends e20 {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6193j;

    /* renamed from: k, reason: collision with root package name */
    public int f6194k;

    /* renamed from: l, reason: collision with root package name */
    public long f6195l;

    /* renamed from: m, reason: collision with root package name */
    public int f6196m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f6197n;

    /* renamed from: o, reason: collision with root package name */
    public int f6198o;

    /* renamed from: p, reason: collision with root package name */
    public int f6199p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f6200q;

    @Override // com.google.android.gms.internal.ads.e20, com.google.android.gms.internal.ads.t10
    public final boolean c() {
        if (super.c() && this.f6193j) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void g(ByteBuffer byteBuffer) {
        boolean z3;
        int limit;
        int i;
        boolean z9;
        int position;
        while (byteBuffer.hasRemaining() && !this.f5581g.hasRemaining()) {
            boolean z10 = true;
            if (this.f6194k != 0) {
                if (this.f6198o < this.f6197n.length) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.K(z3);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > 1024) {
                            int i10 = this.i;
                            limit = (position2 / i10) * i10;
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i11 = this.f6198o;
                int i12 = this.f6199p;
                int i13 = i11 + i12;
                int length = this.f6197n.length;
                if (i13 < length) {
                    i = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i = i11 - i13;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f6197n, i13, min);
                int i14 = this.f6199p + min;
                this.f6199p = i14;
                if (i14 <= this.f6197n.length) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b80.K(z9);
                if (limit >= limit2 || position3 >= i) {
                    z10 = false;
                }
                o(z10);
                if (z10) {
                    this.f6194k = 0;
                    this.f6196m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f6197n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > 1024) {
                            int i15 = this.i;
                            position = ((limit4 / i15) * i15) + i15;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f6194k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final a00 k(a00 a00Var) {
        if (a00Var.f4301c == 2) {
            if (a00Var.f4299a == -1) {
                return a00.e;
            }
            return a00Var;
        }
        throw new i10("Unhandled input format:", a00Var);
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void l() {
        if (this.f6199p > 0) {
            o(true);
            this.f6196m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void m() {
        if (c()) {
            int i = this.f5577b.f4300b;
            int i10 = i + i;
            this.i = i10;
            int i11 = ((((int) ((100000 * r0.f4299a) / 1000000)) / 2) / i10) * i10;
            int i12 = i11 + i11;
            if (this.f6197n.length != i12) {
                this.f6197n = new byte[i12];
                this.f6200q = new byte[i12];
            }
        }
        this.f6194k = 0;
        this.f6195l = 0L;
        this.f6196m = 0;
        this.f6198o = 0;
        this.f6199p = 0;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void n() {
        this.f6193j = false;
        byte[] bArr = bq0.f4861b;
        this.f6197n = bArr;
        this.f6200q = bArr;
    }

    public final void o(boolean z3) {
        int i;
        int i10;
        boolean z9;
        int i11 = this.f6199p;
        int length = this.f6197n.length;
        boolean z10 = true;
        if (i11 != length) {
            if (z3) {
                z3 = true;
            } else {
                return;
            }
        }
        if (this.f6196m == 0) {
            if (z3) {
                q(i11, 3);
                i10 = i11;
            } else {
                if (i11 >= (length >> 1)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b80.K(z9);
                i10 = this.f6197n.length >> 1;
                q(i10, 0);
            }
            i = i10;
        } else {
            int i12 = length >> 1;
            int i13 = i11 - i12;
            if (z3) {
                int p10 = p(i13) + (this.f6197n.length >> 1);
                q(p10, 2);
                int i14 = i12 + i13;
                i = p10;
                i10 = i14;
            } else {
                int p11 = p(i13);
                q(p11, 1);
                i = p11;
                i10 = i13;
            }
        }
        if (i10 % this.i == 0) {
            if (i11 < i) {
                z10 = false;
            }
            b80.K(z10);
            this.f6199p -= i10;
            int i15 = this.f6198o + i10;
            this.f6198o = i15;
            this.f6198o = i15 % this.f6197n.length;
            this.f6196m = (i / this.i) + this.f6196m;
            this.f6195l += (i10 - i) / r2;
            return;
        }
        q.x.o(ay0.B("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i10)));
    }

    public final int p(int i) {
        boolean z3 = true;
        int length = ((((int) ((2000000 * this.f5577b.f4299a) / 1000000)) - this.f6196m) * this.i) - (this.f6197n.length >> 1);
        if (length < 0) {
            z3 = false;
        }
        b80.K(z3);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i10 = this.i;
        return (min / i10) * i10;
    }

    public final void q(int i, int i10) {
        boolean z3;
        boolean z9;
        boolean z10;
        int i11;
        if (i == 0) {
            return;
        }
        boolean z11 = true;
        if (this.f6199p >= i) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        int i12 = this.f6198o;
        if (i10 == 2) {
            int i13 = this.f6199p;
            int i14 = i12 + i13;
            byte[] bArr = this.f6197n;
            int length = bArr.length;
            byte[] bArr2 = this.f6200q;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i, bArr2, 0, i);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i) {
                    System.arraycopy(bArr, i15 - i, bArr2, 0, i);
                } else {
                    int i16 = i - i15;
                    System.arraycopy(bArr, length - i16, bArr2, 0, i16);
                    System.arraycopy(this.f6197n, 0, this.f6200q, i16, i15);
                }
            }
        } else {
            int i17 = i12 + i;
            byte[] bArr3 = this.f6197n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.f6200q;
            if (i17 <= length2) {
                System.arraycopy(bArr3, i12, bArr4, 0, i);
            } else {
                int i18 = length2 - i12;
                System.arraycopy(bArr3, i12, bArr4, 0, i18);
                System.arraycopy(this.f6197n, 0, this.f6200q, i18, i - i18);
            }
        }
        if (i % this.i == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.D(i, "sizeToOutput is not aligned to frame size: %s", z9);
        if (this.f6198o < this.f6197n.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        b80.K(z10);
        byte[] bArr5 = this.f6200q;
        if (i % this.i != 0) {
            z11 = false;
        }
        b80.D(i, "byteOutput size is not aligned to frame size %s", z11);
        if (i10 != 3) {
            for (int i19 = 0; i19 < i; i19 += 2) {
                int i20 = i19 + 1;
                int i21 = (bArr5[i20] << 8) | (bArr5[i19] & 255);
                if (i10 == 0) {
                    i11 = ((((i19 * AdError.NETWORK_ERROR_CODE) / (i - 1)) * (-90)) / AdError.NETWORK_ERROR_CODE) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i19) / (i - 1)) / AdError.NETWORK_ERROR_CODE);
                    }
                }
                int i22 = (i21 * i11) / 100;
                if (i22 >= 32767) {
                    bArr5[i19] = -1;
                    bArr5[i20] = Byte.MAX_VALUE;
                } else if (i22 <= -32768) {
                    bArr5[i19] = 0;
                    bArr5[i20] = Byte.MIN_VALUE;
                } else {
                    bArr5[i19] = (byte) (i22 & 255);
                    bArr5[i20] = (byte) (i22 >> 8);
                }
            }
        }
        j(i).put(bArr5, 0, i).flip();
    }
}
