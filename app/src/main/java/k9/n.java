package k9;

import com.google.android.gms.internal.ads.mu;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f19713a;

    /* renamed from: b, reason: collision with root package name */
    public final double f19714b;

    /* renamed from: c, reason: collision with root package name */
    public final double f19715c;

    /* renamed from: d, reason: collision with root package name */
    public final double f19716d;
    public final int e;

    public n(String str, double d2, double d10, double d11, int i) {
        this.f19713a = str;
        this.f19715c = d2;
        this.f19714b = d10;
        this.f19716d = d11;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!fa.y.l(this.f19713a, nVar.f19713a) || this.f19714b != nVar.f19714b || this.f19715c != nVar.f19715c || this.e != nVar.e || Double.compare(this.f19716d, nVar.f19716d) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19713a, Double.valueOf(this.f19714b), Double.valueOf(this.f19715c), Double.valueOf(this.f19716d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        mu muVar = new mu(this);
        muVar.f(this.f19713a, "name");
        muVar.f(Double.valueOf(this.f19715c), "minBound");
        muVar.f(Double.valueOf(this.f19714b), "maxBound");
        muVar.f(Double.valueOf(this.f19716d), "percent");
        muVar.f(Integer.valueOf(this.e), "count");
        return muVar.toString();
    }
}
