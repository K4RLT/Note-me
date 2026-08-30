package u7;
import g3.a;
import l.a;
import p.a;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26742a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26743b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26745d;
    public final String e;

    public /* synthetic */ q1(int i, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? AdError.NETWORK_ERROR_CODE : i10, null, true, false);
    }

    public static q1 a(q1 q1Var, int i, boolean z3, boolean z9, String str, int i10) {
        int i11 = i;
        int i12 = q1Var.f26742a;
        if ((i10 & 2) != 0) {
            i11 = q1Var.f26743b;
        }
        if ((i10 & 4) != 0) {
            z3 = q1Var.f26744c;
        }
        if ((i10 & 8) != 0) {
            z9 = q1Var.f26745d;
        }
        if ((i10 & 16) != 0) {
            str = q1Var.e;
        }
        q1Var.getClass();
        boolean z10 = z9;
        return new q1(i12, i11, str, z3, z10);
    }

    public final int b() {
        return this.f26743b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (this.f26742a == q1Var.f26742a && this.f26743b == q1Var.f26743b && this.f26744c == q1Var.f26744c && this.f26745d == q1Var.f26745d && kotlin.jvm.internal.a(this.e, q1Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(a.c(a.b(this.f26743b, Integer.hashCode(this.f26742a) * 31, 31), 31, this.f26744c), 31, this.f26745d);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c10 + hashCode;
    }

    public final String toString() {
        StringBuilder n10 = a.n("InkLayerState(slot=", this.f26742a, ", z=", ", visible=", this.f26743b);
        n10.append(this.f26744c);
        n10.append(", locked=");
        n10.append(this.f26745d);
        n10.append(", name=");
        return a5.a.k(n10, this.e, ")");
    }

    public q1(int i, int i10, String str, boolean z3, boolean z9) {
        this.f26742a = i;
        this.f26743b = i10;
        this.f26744c = z3;
        this.f26745d = z9;
        this.e = str;
    }
}
