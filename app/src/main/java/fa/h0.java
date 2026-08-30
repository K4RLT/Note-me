package fa;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16867a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16868b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16869c;

    public h0(String str, boolean z3) {
        y.e(str);
        this.f16867a = str;
        y.e("com.google.android.gms");
        this.f16868b = "com.google.android.gms";
        this.f16869c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (y.l(this.f16867a, h0Var.f16867a) && y.l(this.f16868b, h0Var.f16868b) && y.l(null, null) && this.f16869c == h0Var.f16869c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16867a, this.f16868b, null, 4225, Boolean.valueOf(this.f16869c)});
    }

    public final String toString() {
        String str = this.f16867a;
        if (str != null) {
            return str;
        }
        y.h(null);
        throw null;
    }
}
