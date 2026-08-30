package l1;

import androidx.ink.brush.color.colorspace.DoubleFunction;
import androidx.ink.brush.color.colorspace.Rgb;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements i, DoubleFunction {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19853u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ double f19854v;

    public /* synthetic */ n(double d2, int i) {
        this.f19853u = i;
        this.f19854v = d2;
    }

    @Override // l1.i
    public final double invoke(double d2) {
        switch (this.f19853u) {
            case 0:
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / this.f19854v);
            case 1:
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, this.f19854v);
            case 2:
                return Rgb.j(this.f19854v, d2);
            default:
                return Rgb.a(this.f19854v, d2);
        }
    }
}
