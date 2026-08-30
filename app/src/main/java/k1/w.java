package k1;
import d.e;
import d.i;
import l.a;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
public abstract class w {
    public static final ColorSpace a(l1.c cVar) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (kotlin.jvm.internal.a(cVar, l1.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19827q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19828r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19825o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19820j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kotlin.jvm.internal.a(cVar, l1.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19830t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19829s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19821k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19822l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19818g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19819h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19817f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19823m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19826p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (kotlin.jvm.internal.a(cVar, l1.d.f19824n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            ColorSpace.Rgb.TransferParameters transferParameters = null;
            if (Build.VERSION.SDK_INT >= 34) {
                if (kotlin.jvm.internal.a(cVar, l1.d.f19832v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (kotlin.jvm.internal.a(cVar, l1.d.f19833w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (cVar instanceof l1.q) {
                String str = cVar.f19810a;
                l1.q qVar = (l1.q) cVar;
                float[] a10 = qVar.f19860d.a();
                l1.r rVar = qVar.f19862g;
                if (rVar != null) {
                    transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.f19873b, rVar.f19874c, rVar.f19875d, rVar.e, rVar.f19876f, rVar.f19877g, rVar.f19872a);
                }
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, qVar.f19863h, a10, transferParameters);
                }
                float[] fArr = qVar.f19863h;
                final l1.p pVar = qVar.f19866l;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: k1.v
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d2) {
                        switch (i) {
                            case 0:
                                return ((Number) pVar.invoke(Double.valueOf(d2))).doubleValue();
                            default:
                                return ((Number) pVar.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    }
                };
                final l1.p pVar2 = qVar.f19869o;
                final int i10 = 1;
                return new ColorSpace.Rgb(str, fArr, a10, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: k1.v
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d2) {
                        switch (i10) {
                            case 0:
                                return ((Number) pVar2.invoke(Double.valueOf(d2))).doubleValue();
                            default:
                                return ((Number) pVar2.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    }
                }, qVar.e, qVar.f19861f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }
}
