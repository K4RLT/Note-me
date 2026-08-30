package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t4 extends x4 implements k4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f11240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11241c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11242d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11243f;

    /* renamed from: g, reason: collision with root package name */
    public final x4[] f11244g;

    public t4(String str, int i, int i10, long j10, long j11, x4[] x4VarArr) {
        super("CHAP");
        boolean z3;
        String str2;
        if (i <= i10) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        this.f11240b = str;
        this.f11241c = i;
        this.f11242d = i10;
        int length = x4VarArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                x4 x4Var = x4VarArr[i11];
                if (x4Var instanceof d5) {
                    d5 d5Var = (d5) x4Var;
                    d51 d51Var = d5Var.f5309c;
                    if (d5Var.f12467a.equals("TIT2") && !d51Var.isEmpty()) {
                        str2 = (String) d51Var.get(0);
                        break;
                    }
                }
                i11++;
            } else {
                str2 = null;
                break;
            }
        }
        if (str2 != null) {
            new ox1(null, str2);
        }
        this.e = j10;
        this.f11243f = j11;
        this.f11244g = x4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t4.class == obj.getClass()) {
            t4 t4Var = (t4) obj;
            if (this.f11241c == t4Var.f11241c && this.f11242d == t4Var.f11242d && this.e == t4Var.e && this.f11243f == t4Var.f11243f && Objects.equals(this.f11240b, t4Var.f11240b) && Arrays.equals(this.f11244g, t4Var.f11244g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11240b.hashCode() + ((((((((this.f11241c + 527) * 31) + this.f11242d) * 31) + ((int) this.e)) * 31) + ((int) this.f11243f)) * 31);
    }
}
