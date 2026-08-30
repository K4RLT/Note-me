package of;

import java.io.Serializable;
import ya.g9;

/* loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final a f21975w = new a(0, 0);

    /* renamed from: u, reason: collision with root package name */
    public final long f21976u;

    /* renamed from: v, reason: collision with root package name */
    public final long f21977v;

    public a(long j10, long j11) {
        this.f21976u = j10;
        this.f21977v = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        long j10 = aVar.f21976u;
        long j11 = this.f21976u;
        if (j11 != j10) {
            return Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f21977v ^ Long.MIN_VALUE, aVar.f21977v ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f21976u == aVar.f21976u && this.f21977v == aVar.f21977v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21976u ^ this.f21977v);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        g9.a(this.f21976u, bArr, 0, 0, 4);
        bArr[8] = 45;
        g9.a(this.f21976u, bArr, 9, 4, 6);
        bArr[13] = 45;
        g9.a(this.f21976u, bArr, 14, 6, 8);
        bArr[18] = 45;
        g9.a(this.f21977v, bArr, 19, 0, 2);
        bArr[23] = 45;
        g9.a(this.f21977v, bArr, 24, 2, 8);
        return new String(bArr, mf.a.f20798a);
    }
}
