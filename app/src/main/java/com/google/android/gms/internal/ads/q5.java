package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class q5 implements e6, xe1 {

    /* renamed from: x, reason: collision with root package name */
    public static final long[] f9748x = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f9749y = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f9750z = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: u, reason: collision with root package name */
    public int f9751u;

    /* renamed from: v, reason: collision with root package name */
    public int f9752v;

    /* renamed from: w, reason: collision with root package name */
    public Object f9753w;

    public q5(int i) {
        switch (i) {
            case 6:
                this.f9753w = new z11(9);
                this.f9751u = 8000;
                this.f9752v = 8000;
                return;
            default:
                this.f9753w = new byte[8];
                return;
        }
    }

    public static final void e(ByteBuffer byteBuffer, long j10, int i, int i10, boolean z3) {
        byte b10;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (true != z3) {
            b10 = 0;
        } else {
            b10 = 2;
        }
        byteBuffer.put(b10);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(b80.a(i10));
    }

    public static long f(int i, boolean z3, byte[] bArr) {
        long j10 = bArr[0] & 255;
        if (z3) {
            j10 &= ~f9748x[i - 1];
        }
        for (int i10 = 1; i10 < i; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & 255);
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r11.charAt(r15) == ' ') goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.util.ArrayList r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q5.a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }

    public void b(es1 es1Var, List list) {
        int i;
        ByteBuffer byteBuffer;
        int i10;
        byte b10;
        ByteBuffer byteBuffer2 = es1Var.f5767d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - es1Var.f5767d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f9751u == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = es1Var.f5767d;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i11 = limit - position;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f9751u == 2) {
            if (bArr != null) {
                i = bArr.length + 28;
            } else {
                i = 47;
            }
            i13 += i + 44;
        } else {
            i = 0;
        }
        if (((ByteBuffer) this.f9753w).capacity() < i13) {
            this.f9753w = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f9753w).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f9753w;
        if (this.f9751u == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i10 = 22;
                e(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(b80.a(length));
                byteBuffer.put(bArr);
                int i14 = length + 28;
                byteBuffer.putInt(22, bq0.h(byteBuffer.arrayOffset(), i14, 0, byteBuffer.array()));
                byteBuffer.position(i14);
            } else {
                byteBuffer = byteBuffer4;
                i10 = 22;
                byteBuffer.put(f9749y);
            }
            byteBuffer.put(f9750z);
        } else {
            byteBuffer = byteBuffer4;
            i10 = 22;
        }
        byte b11 = byteBuffer3.get(0);
        if (byteBuffer3.limit() > 1) {
            b10 = byteBuffer3.get(1);
        } else {
            b10 = 0;
        }
        int R = this.f9752v + ((int) ((ay0.R(b11, b10) * 48000) / 1000000));
        this.f9752v = R;
        int i15 = i10;
        ByteBuffer byteBuffer5 = byteBuffer;
        e(byteBuffer5, R, this.f9751u, i12, false);
        for (int i16 = 0; i16 < i12; i16++) {
            if (i11 >= 255) {
                byteBuffer5.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer5.put((byte) i11);
                i11 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f9751u == 2) {
            byteBuffer5.putInt(i + 66, bq0.h(byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i15, bq0.h(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f9751u++;
        this.f9753w = byteBuffer5;
        es1Var.a();
        es1Var.d(((ByteBuffer) this.f9753w).remaining());
        es1Var.f5767d.put((ByteBuffer) this.f9753w);
        es1Var.f();
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int c() {
        int i = this.f9751u;
        if (i == -1) {
            return ((xk0) this.f9753w).h();
        }
        return i;
    }

    public long d(o2 o2Var, boolean z3, boolean z9, int i) {
        int i10;
        byte[] bArr = (byte[]) this.f9753w;
        if (this.f9751u == 0) {
            if (!o2Var.C(bArr, 0, 1, z3)) {
                return -1L;
            }
            int i11 = bArr[0] & 255;
            int i12 = 0;
            while (true) {
                if (i12 < 8) {
                    i10 = i12 + 1;
                    if ((f9748x[i12] & i11) != 0) {
                        break;
                    }
                    i12 = i10;
                } else {
                    i10 = -1;
                    break;
                }
            }
            this.f9752v = i10;
            if (i10 != -1) {
                this.f9751u = 1;
            } else {
                q.x.o("No valid varint length mask found");
                return 0L;
            }
        }
        int i13 = this.f9752v;
        if (i13 > i) {
            this.f9751u = 0;
            return -2L;
        }
        if (i13 != 1) {
            o2Var.v(bArr, 1, i13 - 1);
        }
        this.f9751u = 0;
        return f(this.f9752v, z9, bArr);
    }

    @Override // com.google.android.gms.internal.ads.xe1
    /* renamed from: zza, reason: collision with other method in class */
    public pf1 mo210zza() {
        return new tl1(null, this.f9751u, this.f9752v, false, (z11) this.f9753w);
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zzb() {
        return this.f9751u;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zza() {
        return this.f9752v;
    }

    public /* synthetic */ q5(int i, Object obj, int i10) {
        this.f9751u = i;
        this.f9752v = i10;
        this.f9753w = obj;
    }
}
