package eb;

import com.google.android.gms.internal.ads.js;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g0 extends z {
    public String A;
    public long B;
    public long C;
    public List D;
    public String E;
    public int F;
    public String G;
    public String H;
    public String I;
    public long J;
    public String K;

    /* renamed from: x, reason: collision with root package name */
    public String f16138x;

    /* renamed from: y, reason: collision with root package name */
    public String f16139y;

    /* renamed from: z, reason: collision with root package name */
    public int f16140z;

    @Override // eb.z
    public final boolean A() {
        return true;
    }

    public final String B() {
        y();
        fa.y.h(this.f16138x);
        return this.f16138x;
    }

    public final String C() {
        u();
        y();
        fa.y.h(this.G);
        return this.G;
    }

    public final void D() {
        String format;
        String str;
        u();
        if (!s().F().i(n1.ANALYTICS_STORAGE)) {
            f().H.g("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            t().K0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        js jsVar = f().H;
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        jsVar.g("Resetting session stitching token to ".concat(str));
        this.I = format;
        ((d1) this.f3443v).H.getClass();
        this.J = System.currentTimeMillis();
    }
}
