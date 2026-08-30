package n;

import java.util.Arrays;
import wa.b9;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20964a;

    /* renamed from: b, reason: collision with root package name */
    public int f20965b;

    public z(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = p.f20922a;
        } else {
            jArr = new long[i];
        }
        this.f20964a = jArr;
    }

    public final void a(long j10) {
        int i = this.f20965b + 1;
        long[] jArr = this.f20964a;
        if (jArr.length < i) {
            this.f20964a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f20964a;
        int i10 = this.f20965b;
        jArr2[i10] = j10;
        this.f20965b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i = zVar.f20965b;
            int i10 = this.f20965b;
            if (i == i10) {
                long[] jArr = this.f20964a;
                long[] jArr2 = zVar.f20964a;
                jf.d i11 = b9.i(0, i10);
                int i12 = i11.f19189u;
                int i13 = i11.f19190v;
                if (i12 <= i13) {
                    while (jArr[i12] == jArr2[i12]) {
                        if (i12 != i13) {
                            i12++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f20964a;
        int i = this.f20965b;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += Long.hashCode(jArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f20964a;
        int i = this.f20965b;
        int i10 = 0;
        while (true) {
            if (i10 < i) {
                long j10 = jArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(j10);
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }
}
