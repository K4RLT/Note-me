package l4;

import androidx.ink.brush.color.colorspace.DoubleFunction;
import androidx.ink.brush.color.colorspace.Rgb;
import androidx.ink.brush.color.colorspace.TransferParameters;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements DoubleFunction {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19895u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TransferParameters f19896v;

    public /* synthetic */ e(TransferParameters transferParameters, int i) {
        this.f19895u = i;
        this.f19896v = transferParameters;
    }

    @Override // androidx.ink.brush.color.colorspace.DoubleFunction
    public final double invoke(double d2) {
        double generateOetf$lambda$0;
        double generateOetf$lambda$1;
        double generateOetf$lambda$2;
        double generateOetf$lambda$3;
        double generateEotf$lambda$0;
        double generateEotf$lambda$1;
        double generateEotf$lambda$2;
        double generateEotf$lambda$3;
        switch (this.f19895u) {
            case 0:
                generateOetf$lambda$0 = Rgb.Companion.generateOetf$lambda$0(this.f19896v, d2);
                return generateOetf$lambda$0;
            case 1:
                generateOetf$lambda$1 = Rgb.Companion.generateOetf$lambda$1(this.f19896v, d2);
                return generateOetf$lambda$1;
            case 2:
                generateOetf$lambda$2 = Rgb.Companion.generateOetf$lambda$2(this.f19896v, d2);
                return generateOetf$lambda$2;
            case 3:
                generateOetf$lambda$3 = Rgb.Companion.generateOetf$lambda$3(this.f19896v, d2);
                return generateOetf$lambda$3;
            case 4:
                generateEotf$lambda$0 = Rgb.Companion.generateEotf$lambda$0(this.f19896v, d2);
                return generateEotf$lambda$0;
            case 5:
                generateEotf$lambda$1 = Rgb.Companion.generateEotf$lambda$1(this.f19896v, d2);
                return generateEotf$lambda$1;
            case 6:
                generateEotf$lambda$2 = Rgb.Companion.generateEotf$lambda$2(this.f19896v, d2);
                return generateEotf$lambda$2;
            default:
                generateEotf$lambda$3 = Rgb.Companion.generateEotf$lambda$3(this.f19896v, d2);
                return generateEotf$lambda$3;
        }
    }
}
