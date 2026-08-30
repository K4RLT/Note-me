package p7;
import m.g;

import android.graphics.Bitmap;
import androidx.ink.brush.BrushCoat;
import androidx.ink.brush.BrushFamily;
import androidx.ink.brush.BrushPaint;
import androidx.ink.brush.SelfOverlap;
import androidx.ink.brush.StockBrushes;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static Bitmap f22562a;

    /* renamed from: b, reason: collision with root package name */
    public static BrushFamily f22563b;

    public static final float[] a(float[] fArr) {
        float[] fArr2 = new float[65536];
        for (int i = 0; i < 256; i++) {
            for (int i10 = 0; i10 < 256; i10++) {
                float f10 = 0.0f;
                for (int i11 = -1; i11 < 2; i11++) {
                    for (int i12 = -1; i12 < 2; i12++) {
                        f10 += fArr[(((((i + i11) % 256) + 256) % 256) * 256) + ((((i10 + i12) % 256) + 256) % 256)];
                    }
                }
                fArr2[(i * 256) + i10] = f10 / 9.0f;
            }
        }
        return fArr2;
    }

    public static final BrushFamily b() {
        BrushFamily brushFamily = f22563b;
        if (brushFamily != null) {
            return brushFamily;
        }
        BrushPaint.TextureLayer.SizeUnit sizeUnit = BrushPaint.TextureLayer.SizeUnit.STROKE_COORDINATES;
        BrushPaint.TilingTexture.Origin origin = BrushPaint.TilingTexture.Origin.STROKE_SPACE_ORIGIN;
        BrushPaint.TextureLayer.Wrap wrap = BrushPaint.TextureLayer.Wrap.REPEAT;
        BrushPaint.TilingTexture tilingTexture = new BrushPaint.TilingTexture("scraply://texture/pencil-grain-v1", 64.0f, 64.0f, 0.0f, 0.0f, 0.0f, sizeUnit, origin, wrap, wrap, BrushPaint.TextureLayer.BlendMode.DST_IN, 56, null);
        BrushFamily marker$default = StockBrushes.marker$default(null, 1, null);
        BrushFamily build = new BrushFamily.Builder().setCoat(new BrushCoat(((BrushCoat) qe.l.w(marker$default.getCoats())).getTip(), new BrushPaint(qe.g(tilingTexture), (List) null, (SelfOverlap) null, 6, (kotlin.jvm.internal.f) null))).setInputModel(marker$default.getInputModel()).setClientBrushFamilyId("scraply-pencil-v1").build();
        f22563b = build;
        return build;
    }
}
