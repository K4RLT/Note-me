package com.google.android.gms.internal.ads;
import g3.a;
import q.x;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class yg0 {

    /* renamed from: a, reason: collision with root package name */
    public int f12866a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f12867b;

    public yg0(int i) {
        this.f12867b = new long[i];
    }

    public void a(long j10) {
        if (!b(j10)) {
            int i = this.f12866a;
            long[] jArr = this.f12867b;
            if (i >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
                this.f12867b = jArr;
            }
            jArr[i] = j10;
            if (i >= this.f12866a) {
                this.f12866a = i + 1;
            }
        }
    }

    public boolean b(long j10) {
        int i = this.f12866a;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f12867b[i10] == j10) {
                return true;
            }
        }
        return false;
    }

    public void c(long j10) {
        int i = this.f12866a;
        int i10 = 0;
        while (i10 < i) {
            if (j10 == this.f12867b[i10]) {
                int i11 = this.f12866a - 1;
                while (i10 < i11) {
                    long[] jArr = this.f12867b;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.f12866a--;
                return;
            }
            i10++;
        }
    }

    public void d() {
        int i = this.f12866a;
        long[] jArr = this.f12867b;
        if (i == jArr.length) {
            this.f12867b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f12867b;
        int i10 = this.f12866a;
        this.f12866a = i10 + 1;
        jArr2[i10] = 0;
    }

    public void e(long[] jArr) {
        int i = this.f12866a;
        int length = jArr.length;
        int i10 = i + length;
        long[] jArr2 = this.f12867b;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.f12867b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i10));
        }
        System.arraycopy(jArr, 0, this.f12867b, this.f12866a, length);
        this.f12866a = i10;
    }

    public long f(int i) {
        if (i >= 0 && i < this.f12866a) {
            return this.f12867b[i];
        }
        int i10 = this.f12866a;
        x.l(a.f(i, i10, "Invalid index ", ", size is ", new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i10).length())));
        return 0L;
    }
}
