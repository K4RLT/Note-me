package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ab.b;
import b.a;
import b.b;

/* loaded from: classes.dex */
public final class o6 {

    /* renamed from: d, reason: collision with root package name */
    public static final long f14736d;
    public static final o6 e;

    /* renamed from: a, reason: collision with root package name */
    public final int f14737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14739c;

    static {
        long j10 = 0;
        for (int i = 0; i < 7; i++) {
            j10 |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        f14736d = j10;
        e = new o6(0, -1, -1);
    }

    public o6(int i, int i10, int i11) {
        this.f14737a = i;
        this.f14738b = i10;
        this.f14739c = i11;
    }

    public static int e(String str, int i, int i10) {
        if (i != i10) {
            int i11 = 0;
            for (int i12 = i; i12 < i10; i12++) {
                char charAt = (char) (str.charAt(i12) - '0');
                if (charAt < '\n') {
                    i11 = (i11 * 10) + charAt;
                    if (i11 > 999999) {
                        throw ab.b.b("precision too large", i, i10, str);
                    }
                } else {
                    throw ab.b.a("invalid precision character", i12, str);
                }
            }
            if (i11 == 0) {
                if (i10 == i + 1) {
                    return 0;
                }
                throw ab.b.b("invalid precision", i, i10, str);
            }
            return i11;
        }
        throw ab.b.a("missing precision", i - 1, str);
    }

    public final void a(StringBuilder sb2) {
        if (!b()) {
            int i = 0;
            while (true) {
                int i10 = this.f14737a & (-129);
                int i11 = 1 << i;
                if (i11 > i10) {
                    break;
                }
                if ((i10 & i11) != 0) {
                    sb2.append(" #(+,-0".charAt(i));
                }
                i++;
            }
            int i12 = this.f14738b;
            if (i12 != -1) {
                sb2.append(i12);
            }
            int i13 = this.f14739c;
            if (i13 != -1) {
                sb2.append('.');
                sb2.append(i13);
            }
        }
    }

    public final boolean b() {
        return this == e;
    }

    public final boolean c() {
        return (this.f14737a & 128) != 0;
    }

    public final boolean d(int i, boolean z3) {
        int i10;
        if (b()) {
            return true;
        }
        int i11 = ~i;
        int i12 = this.f14737a;
        if ((i11 & i12) != 0) {
            return false;
        }
        if ((!z3 && this.f14739c != -1) || (i12 & 9) == 9 || (i10 = i12 & 96) == 96) {
            return false;
        }
        return i10 == 0 || this.f14738b != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o6) {
            o6 o6Var = (o6) obj;
            if (o6Var.f14737a == this.f14737a && o6Var.f14738b == this.f14738b && o6Var.f14739c == this.f14739c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14737a * 31) + this.f14738b) * 31) + this.f14739c;
    }
}
