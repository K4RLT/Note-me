package u7;
import d.b;
import u7.e;
import v6.e;
import a.a;
import b2.t;
import c.b;
import c.c;
import c7.x;
import m2.a0;
import p7.e;
import q0.d;
import u7.m3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.pdf.PdfRenderer;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.VertexBuffer;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import wa.b9;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f26110a = new c(1532183223, new a0(28), false);

    /* renamed from: b, reason: collision with root package name */
    public static volatile float f26111b;

    /* renamed from: c, reason: collision with root package name */
    public static float f26112c;

    /* renamed from: d, reason: collision with root package name */
    public static long f26113d;
    public static long e;

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    public static final pe.o A(Engine engine, float f10) {
        float f11;
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        long nBuilderBuild2;
        float min = Math.min(0.5f, 0.75f);
        if (0.08f <= min) {
            min = 0.08f;
        }
        ArrayList arrayList = new ArrayList();
        if (f10 > 0.0f) {
            f11 = min;
        } else {
            f11 = 0.0f;
        }
        if (f10 >= 0.0f) {
            min = 0.0f;
        }
        float f12 = 0.5f - f11;
        B(arrayList, f12, 0.75f - f11, f11, 0.0f, 90.0f);
        float f13 = f11;
        float f14 = (-0.5f) + min;
        float f15 = min;
        B(arrayList, f14, 0.75f - min, f15, 90.0f, 180.0f);
        B(arrayList, f14, (-0.75f) + f15, f15, 180.0f, 270.0f);
        B(arrayList, f12, (-0.75f) + f13, f13, 270.0f, 360.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        float f16 = 1.0f;
        f8 f8Var = new f8(0.0f, 0.0f, 1.0f);
        f8 f8Var2 = new f8(1.0f, 0.0f, 0.0f);
        f8 f8Var3 = new f8(0.0f, 1.0f, 0.0f);
        C(arrayList2, 0.0f, 0.0f, 0.005f, f8Var, f8Var2, f8Var3, 0.5f, 0.5f);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            pe.j jVar = (pe.j) next;
            Object obj = jVar.f22694v;
            Number number = (Number) jVar.f22693u;
            Number number2 = (Number) obj;
            C(arrayList2, number.floatValue(), number2.floatValue(), 0.005f, f8Var, f8Var2, f8Var3, ((number.floatValue() / 0.5f) * 0.5f) + 0.5f, ((number2.floatValue() / 0.75f) * 0.5f) + 0.5f);
        }
        int i = 0;
        while (i < size) {
            arrayList3.add(0);
            i = 1 + i;
            arrayList3.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf((i % size) + 1));
        }
        f8 f8Var4 = new f8(0.0f, 0.0f, -1.0f);
        f8 f8Var5 = new f8(1.0f, 0.0f, 0.0f);
        f8 f8Var6 = new f8(0.0f, -1.0f, 0.0f);
        int size2 = arrayList2.size() / 9;
        C(arrayList2, 0.0f, 0.0f, -0.005f, f8Var4, f8Var5, f8Var6, 0.5f, 0.5f);
        int i10 = size2 + 1;
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            pe.j jVar2 = (pe.j) next2;
            Object obj2 = jVar2.f22694v;
            Number number3 = (Number) jVar2.f22693u;
            Number number4 = (Number) obj2;
            C(arrayList2, number3.floatValue(), number4.floatValue(), -0.005f, f8Var4, f8Var5, f8Var6, 1.0f - (((number3.floatValue() / 0.5f) * 0.5f) + 0.5f), ((number4.floatValue() / 0.75f) * 0.5f) + 0.5f);
        }
        int i11 = 0;
        while (i11 < size) {
            arrayList3.add(Integer.valueOf(size2));
            int i12 = i11 + 1;
            arrayList3.add(Integer.valueOf((i12 % size) + i10));
            arrayList3.add(Integer.valueOf(i10 + i11));
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList.get(i13);
            obj3.getClass();
            pe.j jVar3 = (pe.j) obj3;
            Object obj4 = jVar3.f22694v;
            Object obj5 = jVar3.f22693u;
            i13++;
            Object obj6 = arrayList.get(i13 % size);
            obj6.getClass();
            pe.j jVar4 = (pe.j) obj6;
            Object obj7 = jVar4.f22694v;
            Number number5 = (Number) jVar4.f22693u;
            Number number6 = (Number) obj5;
            float floatValue = number5.floatValue() - number6.floatValue();
            Number number7 = (Number) obj7;
            Number number8 = (Number) obj4;
            float floatValue2 = number7.floatValue() - number8.floatValue();
            float f17 = -floatValue;
            float sqrt = (float) Math.sqrt((f17 * f17) + (floatValue2 * floatValue2));
            if (sqrt > 1.0E-6f) {
                floatValue2 /= sqrt;
                f17 /= sqrt;
            }
            f8 f8Var7 = new f8(floatValue2, f17, 0.0f);
            f8 f8Var8 = new f8(0.0f, 0.0f, f16);
            f8 f8Var9 = new f8(f17, -floatValue2, 0.0f);
            int size3 = arrayList2.size() / 9;
            C(arrayList2, number6.floatValue(), number8.floatValue(), 0.005f, f8Var7, f8Var8, f8Var9, 0.0f, 0.0f);
            C(arrayList2, number5.floatValue(), number7.floatValue(), 0.005f, f8Var7, f8Var8, f8Var9, 0.0f, 0.0f);
            C(arrayList2, number5.floatValue(), number7.floatValue(), -0.005f, f8Var7, f8Var8, f8Var9, 0.0f, 0.0f);
            C(arrayList2, number6.floatValue(), number8.floatValue(), -0.005f, f8Var7, f8Var8, f8Var9, 0.0f, 0.0f);
            arrayList3.add(Integer.valueOf(size3));
            arrayList3.add(Integer.valueOf(size3 + 3));
            int i14 = size3 + 2;
            arrayList3.add(Integer.valueOf(i14));
            arrayList3.add(Integer.valueOf(size3));
            arrayList3.add(Integer.valueOf(i14));
            arrayList3.add(Integer.valueOf(size3 + 1));
            f16 = 1.0f;
        }
        int size4 = arrayList2.size() / 9;
        ByteBuffer order = ByteBuffer.allocateDirect(size4 * 36).order(ByteOrder.nativeOrder());
        Iterator it3 = arrayList2.iterator();
        it3.getClass();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            next3.getClass();
            order.putFloat(((Number) next3).floatValue());
        }
        order.flip();
        nCreateBuilder = VertexBuffer.nCreateBuilder();
        new b0.a(nCreateBuilder, 8);
        VertexBuffer.nBuilderVertexCount(nCreateBuilder, size4);
        VertexBuffer.nBuilderBufferCount(nCreateBuilder, 1);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(1), 0, d.b(21), 0, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(2), 0, d.b(22), 12, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(4), 0, d.b(20), 28, 36);
        nBuilderBuild = VertexBuffer.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj8 = new Object();
            obj8.f4237a = nBuilderBuild;
            obj8.h(engine, order);
            ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(arrayList3.size() * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
            Iterator it4 = arrayList3.iterator();
            it4.getClass();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                next4.getClass();
                asShortBuffer.put((short) ((Number) next4).intValue());
            }
            asShortBuffer.flip();
            nCreateBuilder2 = IndexBuffer.nCreateBuilder();
            new b0.a(nCreateBuilder2, 3);
            IndexBuffer.nBuilderIndexCount(nCreateBuilder2, arrayList3.size());
            IndexBuffer.nBuilderBufferType(nCreateBuilder2, 0);
            nBuilderBuild2 = IndexBuffer.nBuilderBuild(nCreateBuilder2, engine.getNativeObject());
            if (nBuilderBuild2 != 0) {
                Object obj9 = new Object();
                obj9.f4219a = nBuilderBuild2;
                obj9.g(engine, asShortBuffer);
                return new pe.o(obj8, obj9, Integer.valueOf(arrayList3.size()));
            }
            x.o("Couldn't create IndexBuffer");
            return null;
        }
        x.o("Couldn't create VertexBuffer");
        return null;
    }

    public static final void B(ArrayList arrayList, float f10, float f11, float f12, float f13, float f14) {
        if (f12 <= 0.0f) {
            arrayList.add(new pe.j(Float.valueOf(f10), Float.valueOf(f11)));
            return;
        }
        int i = 0;
        while (true) {
            double radians = Math.toRadians((((f14 - f13) * i) / 10) + f13);
            double d2 = f12;
            arrayList.add(new pe.j(Float.valueOf((float) ((Math.cos(radians) * d2) + f10)), Float.valueOf((float) ((Math.sin(radians) * d2) + f11))));
            if (i != 10) {
                i++;
            } else {
                return;
            }
        }
    }

    public static final void C(ArrayList arrayList, float f10, float f11, float f12, f8 f8Var, f8 f8Var2, f8 f8Var3, float f13, float f14) {
        float[] Z = Z(f8Var2.f26196a, f8Var2.f26197b, f8Var2.f26198c, f8Var3.f26196a, f8Var3.f26197b, f8Var3.f26198c, f8Var.f26196a, f8Var.f26197b, f8Var.f26198c);
        arrayList.add(Float.valueOf(f10));
        arrayList.add(Float.valueOf(f11));
        arrayList.add(Float.valueOf(f12));
        arrayList.add(Float.valueOf(Z[0]));
        arrayList.add(Float.valueOf(Z[1]));
        arrayList.add(Float.valueOf(Z[2]));
        arrayList.add(Float.valueOf(Z[3]));
        arrayList.add(Float.valueOf(f13));
        arrayList.add(Float.valueOf(f14));
    }

    public static final Path D(RectF rectF, int i) {
        float height = rectF.height() * 0.13f;
        float f10 = rectF.top + height;
        float f11 = rectF.bottom - height;
        float f12 = (f11 - f10) / 2.0f;
        float width = rectF.width() / 2.0f;
        if (f12 > width) {
            f12 = width;
        }
        float f13 = rectF.left + f12;
        float f14 = rectF.right - f12;
        if (f14 < f13) {
            f14 = f13;
        }
        float f15 = (f14 - f13) / i;
        Path path = new Path();
        path.moveTo(f13, f10);
        float f16 = f13;
        for (int i10 = 0; i10 < i; i10++) {
            f16 += f15;
            path.quadTo((f15 / 2.0f) + f16, f10 - (height * 2.0f), f16, f10);
        }
        path.arcTo(new RectF(f14 - f12, f10, f14 + f12, f11), -90.0f, 180.0f);
        for (int i11 = 0; i11 < i; i11++) {
            f14 -= f15;
            path.quadTo(f14 - (f15 / 2.0f), (height * 2.0f) + f11, f14, f11);
        }
        path.arcTo(new RectF(f13 - f12, f10, f13 + f12, f11), 90.0f, 180.0f);
        path.close();
        return path;
    }

    public static final Path E(RectF rectF) {
        float centerX = rectF.centerX();
        float f10 = rectF.top;
        float f11 = rectF.bottom;
        float height = rectF.height();
        float width = rectF.width() / 2.0f;
        float f12 = (0.28f * height) + f10;
        Path path = new Path();
        path.moveTo(centerX, f12);
        float f13 = width * 0.15f;
        float f14 = rectF.left;
        float f15 = (0.38f * height) + f10;
        path.cubicTo(centerX - f13, f10, f14, f10, f14, f15);
        float f16 = (0.65f * height) + f10;
        float f17 = width * 0.45f;
        float f18 = (height * 0.85f) + f10;
        path.cubicTo(rectF.left, f16, centerX - f17, f18, centerX, f11);
        float f19 = rectF.right;
        path.cubicTo(centerX + f17, f18, f19, f16, f19, f15);
        path.cubicTo(rectF.right, f10, centerX + f13, f10, centerX, f12);
        path.close();
        return path;
    }

    public static final int F(Engine engine, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i, Material material, float[] fArr, Texture texture, TextureSampler textureSampler, c cVar) {
        long nCreateBuilder;
        boolean nBuilderBuild;
        engine.getClass();
        vertexBuffer.getClass();
        indexBuffer.getClass();
        material.getClass();
        fArr.getClass();
        texture.getClass();
        textureSampler.getClass();
        int a10 = com.google.android.filament.b.f4241a.a();
        MaterialInstance b10 = material.b();
        b10.b(fArr[0], fArr[1], fArr[2]);
        b10.c("roughness", 0.7f);
        b10.c("metallic", 0.0f);
        b10.d("numberTex", texture, textureSampler);
        b10.c("hasNumber", 1.0f);
        b10.d("normalTex", texture, textureSampler);
        b10.c("hasNormal", 0.0f);
        b10.c("contentUnlit", 0.0f);
        b10.c("satBoost", 1.0f);
        b10.c("contrastBoost", 1.0f);
        nCreateBuilder = RenderableManager.nCreateBuilder(1);
        new b0.a(nCreateBuilder, 6);
        RenderableManager.nBuilderGeometry(nCreateBuilder, 0, 4, vertexBuffer.g(), indexBuffer.f(), 0, i);
        RenderableManager.nBuilderMaterial(nCreateBuilder, 0, b10.a());
        float[] fArr2 = (float[]) cVar.f18914v;
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        float[] fArr3 = (float[]) cVar.f18915w;
        RenderableManager.nBuilderBoundingBox(nCreateBuilder, f10, f11, f12, fArr3[0], fArr3[1], fArr3[2]);
        RenderableManager.nBuilderCastShadows(nCreateBuilder, true);
        RenderableManager.nBuilderReceiveShadows(nCreateBuilder, true);
        nBuilderBuild = RenderableManager.nBuilderBuild(nCreateBuilder, engine.getNativeObject(), a10);
        if (nBuilderBuild) {
            return a10;
        }
        x.o(a.i("Couldn't create Renderable component for entity ", a10, ", see log."));
        return 0;
    }

    public static final int G(Engine engine, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i, Material material, Texture texture, TextureSampler textureSampler) {
        long nCreateBuilder;
        boolean nBuilderBuild;
        vertexBuffer.getClass();
        indexBuffer.getClass();
        int a10 = com.google.android.filament.b.f4241a.a();
        MaterialInstance b10 = material.b();
        b10.b(1.0f, 0.96f, 0.92f);
        b10.c("roughness", 1.0f);
        b10.c("metallic", 0.0f);
        b10.d("numberTex", texture, textureSampler);
        b10.c("hasNumber", 0.0f);
        b10.d("normalTex", texture, textureSampler);
        b10.c("hasNormal", 0.0f);
        b10.c("contentUnlit", 0.0f);
        b10.c("satBoost", 1.0f);
        b10.c("contrastBoost", 1.0f);
        nCreateBuilder = RenderableManager.nCreateBuilder(1);
        new b0.a(nCreateBuilder, 6);
        RenderableManager.nBuilderGeometry(nCreateBuilder, 0, 4, vertexBuffer.g(), indexBuffer.f(), 0, i);
        RenderableManager.nBuilderMaterial(nCreateBuilder, 0, b10.a());
        c cVar = new c(0.0f, 0.0f, 0.0f, 0.5f, 0.75f, 0.005f);
        float[] fArr = (float[]) cVar.f18914v;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float[] fArr2 = (float[]) cVar.f18915w;
        RenderableManager.nBuilderBoundingBox(nCreateBuilder, f10, f11, f12, fArr2[0], fArr2[1], fArr2[2]);
        RenderableManager.nBuilderCastShadows(nCreateBuilder, true);
        RenderableManager.nBuilderReceiveShadows(nCreateBuilder, true);
        nBuilderBuild = RenderableManager.nBuilderBuild(nCreateBuilder, engine.getNativeObject(), a10);
        if (nBuilderBuild) {
            return a10;
        }
        x.o(a.i("Couldn't create Renderable component for entity ", a10, ", see log."));
        return 0;
    }

    public static void H(Canvas canvas, Context context, d dVar, float f10, float f11) {
        StaticLayout staticLayout;
        TextPaint textPaint;
        int i;
        Canvas canvas2;
        Paint paint;
        Canvas canvas3 = canvas;
        canvas3.getClass();
        context.getClass();
        dVar.getClass();
        if (dVar.f26034b.length() == 0) {
            return;
        }
        StaticLayout W = W(context, dVar, f10, f11);
        float f12 = f11 / 1024.0f;
        canvas3.save();
        canvas3.translate(dVar.f26037f * f10, dVar.f26038g * f11);
        canvas3.rotate(dVar.i);
        canvas3.scale(f12, f12);
        canvas3.translate((-W.getWidth()) / 2.0f, (-W.getHeight()) / 2.0f);
        TextPaint paint2 = W.getPaint();
        paint2.getClass();
        float textSize = paint2.getTextSize();
        float d2 = b9.d(dVar.f26049s, 0.0f, 1.0f);
        int i10 = dVar.f26036d;
        int i11 = dVar.f26048r;
        List list = e8.f26153a;
        String str = e8.a(dVar.f26047q).f26105a;
        int i12 = 0;
        switch (str.hashCode()) {
            case -1211699985:
                staticLayout = W;
                textPaint = paint2;
                i = i10;
                if (str.equals("hollow")) {
                    canvas2 = canvas;
                    m0(canvas2, staticLayout, textPaint, i, a.y(d2, 0.1f, 0.02f, textSize));
                    break;
                }
                StaticLayout staticLayout2 = staticLayout;
                canvas2 = canvas;
                N(canvas2, staticLayout2, textPaint, i, 0.0f, 0.0f);
                break;
            case -1106245566:
                textPaint = paint2;
                i = i10;
                if (!str.equals("outline")) {
                    staticLayout = W;
                    StaticLayout staticLayout22 = staticLayout;
                    canvas2 = canvas;
                    N(canvas2, staticLayout22, textPaint, i, 0.0f, 0.0f);
                    break;
                } else {
                    m0(canvas3, W, textPaint, i11, a.y(d2, 0.22f, 0.04f, textSize));
                    N(canvas3, W, textPaint, i, 0.0f, 0.0f);
                    canvas2 = canvas;
                    break;
                }
            case -903579360:
                staticLayout = W;
                textPaint = paint2;
                i = i10;
                if (str.equals("shadow")) {
                    float y10 = a.y(d2, 0.11f, 0.03f, textSize);
                    canvas2 = canvas;
                    k0(canvas2, staticLayout, textPaint, a.y(d2, 0.05f, 0.008f, textSize), y10, y10, i11, i);
                    break;
                }
                StaticLayout staticLayout222 = staticLayout;
                canvas2 = canvas;
                N(canvas2, staticLayout222, textPaint, i, 0.0f, 0.0f);
                break;
            case 3107365:
                staticLayout = W;
                textPaint = paint2;
                i = i10;
                if (str.equals("echo")) {
                    float y11 = a.y(d2, 0.12f, 0.03f, textSize);
                    float f13 = (i11 >>> 24) & 255;
                    int i13 = i11 & 16777215;
                    float f14 = y11 * 2.0f;
                    N(canvas, staticLayout, textPaint, (b9.e((int) (0.35f * f13), 0, 255) << 24) | i13, f14, f14);
                    canvas2 = canvas;
                    N(canvas2, staticLayout, textPaint, (b9.e((int) (f13 * 0.65f), 0, 255) << 24) | i13, y11, y11);
                    N(canvas2, staticLayout, textPaint, i, 0.0f, 0.0f);
                    break;
                }
                StaticLayout staticLayout2222 = staticLayout;
                canvas2 = canvas;
                N(canvas2, staticLayout2222, textPaint, i, 0.0f, 0.0f);
                break;
            case 3175821:
                staticLayout = W;
                textPaint = paint2;
                i = i10;
                if (str.equals("glow")) {
                    float y12 = a.y(d2, 0.14f, 0.03f, textSize);
                    while (i12 < 3) {
                        TextPaint textPaint2 = textPaint;
                        StaticLayout staticLayout3 = staticLayout;
                        k0(canvas, staticLayout3, textPaint2, y12, 0.0f, 0.0f, i11, i);
                        staticLayout = staticLayout3;
                        textPaint = textPaint2;
                        i12++;
                    }
                    canvas2 = canvas;
                    break;
                }
                StaticLayout staticLayout22222 = staticLayout;
                canvas2 = canvas;
                N(canvas2, staticLayout22222, textPaint, i, 0.0f, 0.0f);
                break;
            case 3321611:
                staticLayout = W;
                i = i10;
                if (!str.equals("lift")) {
                    textPaint = paint2;
                    StaticLayout staticLayout222222 = staticLayout;
                    canvas2 = canvas;
                    N(canvas2, staticLayout222222, textPaint, i, 0.0f, 0.0f);
                    break;
                } else {
                    canvas2 = canvas;
                    k0(canvas2, staticLayout, paint2, a.y(d2, 0.16f, 0.05f, textSize), 0.0f, textSize * 0.02f, b9.e((int) (b9.d((0.4f * d2) + 0.3f, 0.0f, 1.0f) * 255.0f), 0, 255) << 24, i);
                    break;
                }
            case 102727412:
                if (str.equals("label")) {
                    Float valueOf = Float.valueOf(textSize * 0.3f);
                    Float valueOf2 = Float.valueOf(textSize * 0.1f);
                    float floatValue = valueOf.floatValue();
                    float floatValue2 = valueOf2.floatValue();
                    float y13 = a.y(d2, 0.32f, 0.1f, textSize);
                    Paint paint3 = new Paint(1);
                    paint3.setColor(i11);
                    int lineCount = W.getLineCount();
                    while (i12 < lineCount) {
                        float lineLeft = W.getLineLeft(i12);
                        float lineRight = W.getLineRight(i12);
                        if (lineRight - lineLeft >= 0.5f) {
                            paint = paint3;
                            canvas3.drawRoundRect(lineLeft - floatValue, W.getLineTop(i12) - floatValue2, lineRight + floatValue, W.getLineBottom(i12) + floatValue2, y13, y13, paint);
                        } else {
                            paint = paint3;
                        }
                        i12++;
                        canvas3 = canvas;
                        paint3 = paint;
                    }
                    canvas2 = canvas;
                    N(canvas2, W, paint2, i10, 0.0f, 0.0f);
                    break;
                }
            default:
                staticLayout = W;
                textPaint = paint2;
                i = i10;
                StaticLayout staticLayout2222222 = staticLayout;
                canvas2 = canvas;
                N(canvas2, staticLayout2222222, textPaint, i, 0.0f, 0.0f);
                break;
        }
        canvas2.restore();
    }

    public static final void I(Bitmap bitmap, int i) {
        Canvas canvas = new Canvas(bitmap);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f10 = 0.08316831f * width;
        float f11 = width * 0.8f;
        Paint paint = new Paint(1);
        paint.setColor(i);
        float f12 = f10 / 2.0f;
        float f13 = f11 - f12;
        float f14 = f11 + f12;
        canvas.drawRect(f13, 0.0f, f14, height, paint);
        float f15 = f10 / 5;
        float f16 = 0.06f * f10;
        float f17 = 1.0f;
        if (f16 < 1.0f) {
            f16 = 1.0f;
        }
        paint.setStrokeWidth(f16);
        paint.setColor(Color.argb(48, 0, 0, 0));
        for (int i10 = 1; i10 < 5; i10++) {
            float f18 = (i10 * f15) + f13;
            canvas.drawLine(f18, 0.0f, f18, height, paint);
        }
        float f19 = f10 * 0.1f;
        if (f19 >= 1.0f) {
            f17 = f19;
        }
        paint.setStrokeWidth(f17);
        paint.setColor(Color.argb(90, 0, 0, 0));
        float f20 = f17 / 2.0f;
        float f21 = f13 + f20;
        canvas.drawLine(f21, 0.0f, f21, height, paint);
        float f22 = f14 - f20;
        canvas.drawLine(f22, 0.0f, f22, height, paint);
    }

    public static final void J(Canvas canvas, int i, int i10) {
        Paint paint = new Paint(1);
        paint.setTypeface(Typeface.create("casual", 1));
        float f10 = i10;
        paint.setTextSize(0.032f * f10);
        paint.setColor(Color.argb(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 58, 47, 42));
        paint.setTextAlign(Paint.Align.RIGHT);
        float f11 = 0.024f * f10;
        canvas.drawText("Scraply", i - f11, f10 - f11, paint);
    }

    public static final float K(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f15 - f11) * (f12 - f10)) - ((f14 - f10) * (f13 - f11));
    }

    public static pe.j L(d dVar, float f10) {
        float f11 = dVar.f26049s;
        Float valueOf = Float.valueOf(0.0f);
        float d2 = b9.d(f11, 0.0f, 1.0f);
        List list = e8.f26153a;
        String str = e8.a(dVar.f26047q).f26105a;
        switch (str.hashCode()) {
            case -1211699985:
                if (str.equals("hollow")) {
                    float f12 = (((d2 * 0.1f) + 0.02f) * f10) / 2.0f;
                    return new pe.j(Float.valueOf(f12), Float.valueOf(f12));
                }
                break;
            case -1106245566:
                if (str.equals("outline")) {
                    float f13 = (((d2 * 0.22f) + 0.04f) * f10) / 2.0f;
                    return new pe.j(Float.valueOf(f13), Float.valueOf(f13));
                }
                break;
            case -903579360:
                if (str.equals("shadow")) {
                    float y10 = (((d2 * 0.05f) + 0.008f) * f10) + a.y(d2, 0.11f, 0.03f, f10);
                    return new pe.j(Float.valueOf(y10), Float.valueOf(y10));
                }
                break;
            case 3107365:
                if (str.equals("echo")) {
                    float f14 = ((d2 * 0.12f) + 0.03f) * f10 * 2.0f;
                    return new pe.j(Float.valueOf(f14), Float.valueOf(f14));
                }
                break;
            case 3175821:
                if (str.equals("glow")) {
                    float y11 = a.y(d2, 0.14f, 0.03f, f10);
                    return new pe.j(Float.valueOf(y11), Float.valueOf(y11));
                }
                break;
            case 3321611:
                if (str.equals("lift")) {
                    float y12 = a.y(d2, 0.16f, 0.05f, f10);
                    return new pe.j(Float.valueOf(y12), Float.valueOf(y12));
                }
                break;
            case 102727412:
                if (str.equals("label")) {
                    return new pe.j(Float.valueOf(0.3f * f10), Float.valueOf(f10 * 0.1f));
                }
                break;
        }
        return new pe.j(valueOf, valueOf);
    }

    public static pe.j M(d dVar, float f10) {
        float f11 = f10 / 1024.0f;
        pe.j L = L(dVar, d0(dVar));
        return new pe.j(Float.valueOf(((Number) L.f22693u).floatValue() * f11), Float.valueOf(((Number) L.f22694v).floatValue() * f11));
    }

    public static void N(Canvas canvas, StaticLayout staticLayout, TextPaint textPaint, int i, float f10, float f11) {
        textPaint.clearShadowLayer();
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(i);
        if (f10 == 0.0f && f11 == 0.0f) {
            staticLayout.draw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(f10, f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public static final void O(float f10, float f11, x xVar, t tVar, float f12, float f13, boolean z3, float f14, float[] fArr, float[] fArr2) {
        float f15;
        boolean z9;
        boolean z10;
        float f16;
        float f17;
        float f18;
        boolean z11;
        float f19;
        float f20;
        float f21;
        float f22 = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Float valueOf = Float.valueOf(0.0f);
        arrayList2.add(new pe.j(valueOf, Float.valueOf(-0.75f)));
        float f23 = f12 - f10;
        P(arrayList2, f10, f23, (-0.75f) + f10, 270.0f, 360.0f);
        P(arrayList2, f10, f23, 0.75f - f10, 0.0f, 90.0f);
        arrayList2.add(new pe.j(valueOf, Float.valueOf(0.75f)));
        if (z3) {
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(qe.m.d(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                pe.j jVar = (pe.j) obj;
                arrayList3.add(new pe.j(Float.valueOf(-((Number) jVar.f22693u).floatValue()), jVar.f22694v));
            }
            arrayList.addAll(qe.l.H(arrayList3));
        }
        pe.j S = S(f13 - f14, z3);
        float floatValue = ((Number) S.f22693u).floatValue();
        float floatValue2 = ((Number) S.f22694v).floatValue();
        pe.j S2 = S(f13 + f14, z3);
        float floatValue3 = ((Number) S2.f22693u).floatValue();
        float floatValue4 = ((Number) S2.f22694v).floatValue();
        if (z3) {
            f15 = f12 / 2.0f;
        } else {
            f15 = (-f12) / 2.0f;
        }
        int size2 = arrayList.size();
        int i10 = xVar.f4002v / 9;
        float[] R = R(floatValue, floatValue2, f15, 0.0f, f22);
        float f24 = f15;
        float f25 = -floatValue2;
        float f26 = f12 * 2.0f;
        float f27 = (f24 + f12) / f26;
        ArrayList arrayList4 = arrayList;
        T(xVar, R[0], R[1], R[2], floatValue2, 0.0f, floatValue, floatValue, f25, f27, 0.5f);
        x xVar2 = xVar;
        float f28 = floatValue2;
        float f29 = f25;
        float f30 = floatValue;
        int i11 = xVar2.f4002v / 9;
        Iterator it = arrayList4.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            pe.j jVar2 = (pe.j) next;
            float floatValue5 = ((Number) jVar2.f22693u).floatValue();
            float floatValue6 = ((Number) jVar2.f22694v).floatValue();
            float[] R2 = R(f30, f28, floatValue5, floatValue6, f22);
            if (Math.abs(floatValue5) < 1.0E-4f) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f31 = R2[0];
            float f32 = f30;
            float f33 = f29;
            float f34 = R2[1];
            float f35 = R2[2];
            if (z11) {
                f19 = floatValue5;
                f20 = fArr[0];
            } else {
                f19 = floatValue5;
                f20 = f28;
            }
            if (z11) {
                f21 = fArr[2];
            } else {
                f21 = f32;
            }
            T(xVar, f31, f34, f35, f20, 0.0f, f21, f32, f33, (f19 + f12) / f26, (0.75f + floatValue6) / 1.5f);
            xVar2 = xVar;
            f29 = f33;
            f28 = f28;
            f30 = f32;
            f22 = f11;
        }
        float f36 = f28;
        x xVar3 = xVar2;
        int i12 = 0;
        while (i12 < size2) {
            tVar.a(i10);
            tVar.a(i11 + i12);
            i12++;
            tVar.a((i12 % size2) + i11);
        }
        int i13 = xVar3.f4002v / 9;
        float[] Q = Q(floatValue3, floatValue4, f24, 0.0f, -0.005f);
        float f37 = -floatValue4;
        float f38 = -floatValue3;
        float f39 = 1.0f - f27;
        float f40 = f30;
        float f41 = -0.005f;
        T(xVar3, Q[0], Q[1], Q[2], f37, 0.0f, f38, floatValue3, f37, f39, 0.5f);
        int i14 = xVar3.f4002v / 9;
        Iterator it2 = arrayList4.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            pe.j jVar3 = (pe.j) next2;
            float floatValue7 = ((Number) jVar3.f22693u).floatValue();
            float floatValue8 = ((Number) jVar3.f22694v).floatValue();
            float[] Q2 = Q(floatValue3, floatValue4, floatValue7, floatValue8, -0.005f);
            if (Math.abs(floatValue7) < 1.0E-4f) {
                z9 = true;
            } else {
                z9 = false;
            }
            float f42 = Q2[0];
            float f43 = Q2[1];
            float f44 = Q2[2];
            if (z9) {
                z10 = z9;
                f16 = fArr2[0];
            } else {
                z10 = z9;
                f16 = f37;
            }
            if (z10) {
                f17 = floatValue7;
                f18 = fArr2[2];
            } else {
                f17 = floatValue7;
                f18 = f38;
            }
            T(xVar3, f42, f43, f44, f16, 0.0f, f18, floatValue3, f37, 1.0f - ((f17 + f12) / f26), (0.75f + floatValue8) / 1.5f);
        }
        float f45 = floatValue3;
        int i15 = 0;
        while (i15 < size2) {
            tVar.a(i13);
            int i16 = i15 + 1;
            tVar.a((i16 % size2) + i14);
            tVar.a(i14 + i15);
            i15 = i16;
        }
        int i17 = 0;
        while (i17 < size2) {
            ArrayList arrayList5 = arrayList4;
            Object obj2 = arrayList5.get(i17);
            obj2.getClass();
            pe.j jVar4 = (pe.j) obj2;
            float floatValue9 = ((Number) jVar4.f22693u).floatValue();
            float floatValue10 = ((Number) jVar4.f22694v).floatValue();
            int i18 = i17 + 1;
            Object obj3 = arrayList5.get(i18 % size2);
            obj3.getClass();
            pe.j jVar5 = (pe.j) obj3;
            float floatValue11 = ((Number) jVar5.f22693u).floatValue();
            float floatValue12 = ((Number) jVar5.f22694v).floatValue();
            float f46 = floatValue12 - floatValue10;
            float f47 = -(floatValue11 - floatValue9);
            float sqrt = (float) Math.sqrt((f47 * f47) + (f46 * f46));
            if (sqrt > 1.0E-6f) {
                f46 /= sqrt;
                f47 /= sqrt;
            }
            float f48 = f46 * f40;
            float f49 = (-f46) * f36;
            float f50 = f47;
            float f51 = f40;
            float[] R3 = R(f51, f36, floatValue9, floatValue10, f11);
            float[] R4 = R(f51, f36, floatValue11, floatValue12, f11);
            float[] Q3 = Q(f45, floatValue4, floatValue11, floatValue12, f41);
            float[] Q4 = Q(f45, floatValue4, floatValue9, floatValue10, f41);
            int i19 = xVar3.f4002v / 9;
            T(xVar3, R3[0], R3[1], R3[2], f48, f50, f49, f36, f51, 0.0f, 0.0f);
            T(xVar, R4[0], R4[1], R4[2], f48, f50, f49, f36, f51, 0.0f, 0.0f);
            T(xVar, Q3[0], Q3[1], Q3[2], f48, f50, f49, f36, f51, 0.0f, 0.0f);
            T(xVar, Q4[0], Q4[1], Q4[2], f48, f50, f49, f36, f51, 0.0f, 0.0f);
            tVar.a(i19);
            int i20 = i19 + 2;
            tVar.a(i20);
            tVar.a(i19 + 1);
            tVar.a(i19);
            tVar.a(i19 + 3);
            tVar.a(i20);
            xVar3 = xVar;
            f40 = f51;
            i17 = i18;
            f45 = f45;
            f41 = -0.005f;
            arrayList4 = arrayList5;
        }
    }

    public static final void P(ArrayList arrayList, float f10, float f11, float f12, float f13, float f14) {
        int i = 0;
        while (true) {
            double radians = Math.toRadians((((f14 - f13) * i) / 10) + f13);
            double d2 = f10;
            arrayList.add(new pe.j(Float.valueOf((float) ((Math.cos(radians) * d2) + f11)), Float.valueOf((float) ((Math.sin(radians) * d2) + f12))));
            if (i != 10) {
                i++;
            } else {
                return;
            }
        }
    }

    public static final float[] Q(float f10, float f11, float f12, float f13, float f14) {
        return new float[]{(f14 * f11) + (f12 * f10), f13, (f14 * f10) + ((-f12) * f11)};
    }

    public static final float[] R(float f10, float f11, float f12, float f13, float f14) {
        return new float[]{(f14 * f11) + (f12 * f10), f13, (f14 * f10) + ((-f12) * f11)};
    }

    public static final pe.j S(float f10, boolean z3) {
        float f11;
        double radians = Math.toRadians(f10);
        Float valueOf = Float.valueOf((float) Math.cos(radians));
        double sin = Math.sin(radians);
        if (z3) {
            f11 = -((float) sin);
        } else {
            f11 = (float) sin;
        }
        return new pe.j(valueOf, Float.valueOf(f11));
    }

    public static final void T(x xVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float[] Z = Z(f16, 0.0f, f17, (f14 * f17) - (f15 * 0.0f), (f15 * f16) - (f13 * f17), (f13 * 0.0f) - (f14 * f16), f13, f14, f15);
        xVar.d(f10);
        xVar.d(f11);
        xVar.d(f12);
        xVar.d(Z[0]);
        xVar.d(Z[1]);
        xVar.d(Z[2]);
        xVar.d(Z[3]);
        xVar.d(f18);
        xVar.d(f19);
    }

    public static final float[] U(float f10, float f11, boolean z3) {
        double radians = Math.toRadians(f10);
        double radians2 = Math.toRadians(f11);
        float sin = (float) (Math.sin(radians2) + (-Math.sin(radians)));
        float cos = (float) (Math.cos(radians2) + Math.cos(radians));
        if (!z3) {
            sin = -sin;
            cos = -cos;
        }
        float sqrt = (float) Math.sqrt((cos * cos) + (sin * sin));
        if (sqrt < 1.0E-6f) {
            sqrt = 1.0E-6f;
        }
        return new float[]{sin / sqrt, 0.0f, cos / sqrt};
    }

    public static pe.j V(Context context, d dVar, float f10, float f11) {
        context.getClass();
        dVar.getClass();
        StaticLayout W = W(context, dVar, f10, f11);
        float f12 = f11 / 1024.0f;
        pe.j L = L(dVar, d0(dVar));
        return new pe.j(Float.valueOf(((W.getWidth() / 2.0f) + ((Number) L.f22693u).floatValue()) * f12), Float.valueOf(((W.getHeight() / 2.0f) + ((Number) L.f22694v).floatValue()) * f12));
    }

    public static StaticLayout W(Context context, d dVar, float f10, float f11) {
        Float f12;
        float f13;
        int i = 1;
        TextPaint textPaint = new TextPaint(1);
        int i10 = dVar.f26036d;
        String str = dVar.f26034b;
        textPaint.setColor(i10);
        List list = p7.e.f22444a;
        textPaint.setTypeface(p7.e.f(context, dVar.f26035c, dVar.f26044n, dVar.f26045o));
        textPaint.setTextSize(d0(dVar));
        Float f14 = dVar.f26046p;
        Float f15 = null;
        if (f14 != null) {
            f12 = Float.valueOf((((f10 / f11) * 1024.0f) / 2.0f) * f14.floatValue() * dVar.f26039h);
        } else {
            f12 = null;
        }
        if (f12 != null) {
            int ceil = (int) Math.ceil(f12.floatValue());
            if (ceil >= 1) {
                i = ceil;
            }
        } else {
            Iterator it = mf.f.C(str, new String[]{"\n"}).iterator();
            if (it.hasNext()) {
                float measureText = textPaint.measureText((String) it.next());
                while (it.hasNext()) {
                    measureText = Math.max(measureText, textPaint.measureText((String) it.next()));
                }
                f15 = Float.valueOf(measureText);
            }
            if (f15 != null) {
                f13 = f15.floatValue();
            } else {
                f13 = 0.0f;
            }
            i = ((int) Math.ceil(f13)) + 2;
        }
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build();
        build.getClass();
        return build;
    }

    public static final float[] X(int i) {
        return new float[]{(float) Math.pow(Color.red(i) / 255.0d, 2.2d), (float) Math.pow(Color.green(i) / 255.0d, 2.2d), (float) Math.pow(Color.blue(i) / 255.0d, 2.2d)};
    }

    public static final Path Y(RectF rectF) {
        float height = rectF.height();
        float width = rectF.width();
        float max = Math.max(0.055f * width, 0.1f * height);
        float f10 = width / 4.0f;
        if (max > f10) {
            max = f10;
        }
        float f11 = 0.2f * height;
        float f12 = rectF.left + max;
        float f13 = rectF.right - max;
        float f14 = 0.26f * height;
        float f15 = (f13 - f12) / 2.0f;
        if (f14 > f15) {
            f14 = f15;
        }
        float f16 = rectF.top + f11;
        float f17 = rectF.bottom - f11;
        float f18 = height * 0.09f;
        float f19 = (f17 - f16) / 2.0f;
        if (f18 > f19) {
            f18 = f19;
        }
        Path path = new Path();
        float f20 = f12 + f14;
        path.moveTo(f20, rectF.top);
        float f21 = f13 - f14;
        path.lineTo(f21, rectF.top);
        float f22 = rectF.top;
        path.quadTo(f13, f22, f13, f22 + f14);
        path.lineTo(f13, f16);
        path.lineTo(rectF.right - f18, f16);
        float f23 = rectF.right;
        float f24 = f16 + f18;
        path.quadTo(f23, f16, f23, f24);
        float f25 = f17 - f18;
        path.lineTo(rectF.right, f25);
        float f26 = rectF.right;
        path.quadTo(f26, f17, f26 - f18, f17);
        path.lineTo(f13, f17);
        path.lineTo(f13, rectF.bottom - f14);
        float f27 = rectF.bottom;
        path.quadTo(f13, f27, f21, f27);
        path.lineTo(f20, rectF.bottom);
        float f28 = rectF.bottom;
        path.quadTo(f12, f28, f12, f28 - f14);
        path.lineTo(f12, f17);
        path.lineTo(rectF.left + f18, f17);
        float f29 = rectF.left;
        path.quadTo(f29, f17, f29, f25);
        path.lineTo(rectF.left, f24);
        float f30 = rectF.left;
        path.quadTo(f30, f16, f18 + f30, f16);
        path.lineTo(f12, f16);
        path.lineTo(f12, rectF.top + f14);
        float f31 = rectF.top;
        path.quadTo(f12, f31, f20, f31);
        path.close();
        return path;
    }

    public static final float[] Z(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        if (f10 + f14 + f18 > 0.0f) {
            float sqrt = ((float) Math.sqrt(r0 + 1.0f)) * 2.0f;
            f21 = 0.25f * sqrt;
            f22 = (f15 - f17) / sqrt;
            f19 = (f16 - f12) / sqrt;
            f23 = (f11 - f13) / sqrt;
        } else {
            if (f10 > f14 && f10 > f18) {
                float sqrt2 = ((float) Math.sqrt(((f10 + 1.0f) - f14) - f18)) * 2.0f;
                float f24 = (f15 - f17) / sqrt2;
                f22 = sqrt2 * 0.25f;
                float f25 = (f13 + f11) / sqrt2;
                f20 = (f16 + f12) / sqrt2;
                f19 = f25;
                f21 = f24;
            } else if (f14 > f18) {
                float sqrt3 = ((float) Math.sqrt(((f14 + 1.0f) - f10) - f18)) * 2.0f;
                float f26 = (f16 - f12) / sqrt3;
                float f27 = (f13 + f11) / sqrt3;
                f19 = sqrt3 * 0.25f;
                f20 = (f17 + f15) / sqrt3;
                f22 = f27;
                f21 = f26;
            } else {
                float sqrt4 = ((float) Math.sqrt(((f18 + 1.0f) - f10) - f14)) * 2.0f;
                float f28 = (f11 - f13) / sqrt4;
                float f29 = (f16 + f12) / sqrt4;
                f19 = (f17 + f15) / sqrt4;
                f20 = sqrt4 * 0.25f;
                f21 = f28;
                f22 = f29;
            }
            f23 = f20;
        }
        float sqrt5 = (float) Math.sqrt((f21 * f21) + (f23 * f23) + (f19 * f19) + (f22 * f22));
        return new float[]{f22 / sqrt5, f19 / sqrt5, f23 / sqrt5, f21 / sqrt5};
    }

    public static final p1 a(PdfRenderer pdfRenderer, File file, int i) {
        PdfRenderer.Page openPage = pdfRenderer.openPage(i);
        openPage.getClass();
        try {
            int width = openPage.getWidth();
            int height = openPage.getHeight();
            if (width > 0 && height > 0) {
                float max = 2000.0f / Math.max(width, height);
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, (int) (width * max)), Math.max(1, (int) (height * max)), Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                createBitmap.eraseColor(-1);
                openPage.render(createBitmap, null, null, 1);
                File file2 = new File(file, UUID.randomUUID() + ".png");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    int width2 = createBitmap.getWidth();
                    int height2 = createBitmap.getHeight();
                    createBitmap.recycle();
                    return new p1(file2, width2, height2);
                } finally {
                }
            }
            return null;
        } finally {
            openPage.close();
        }
    }

    public static float a0() {
        long f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = f26113d;
        if (j10 == 0) {
            f10 = 0;
        } else {
            f10 = b9.f(uptimeMillis - j10, 0L, 100L);
        }
        if (f10 > 0) {
            f26112c = a.x(f26111b, f26112c, 1.0f - ((float) Math.exp(((float) (-f10)) / 90.0f)), f26112c);
            f26113d = uptimeMillis;
        } else if (f26113d == 0) {
            f26112c = f26111b;
            f26113d = uptimeMillis;
        }
        return f26112c;
    }

    public static final p1 b(Context context, File file, Uri uri) {
        File file2 = new File(context.getCacheDir(), "imp_" + UUID.randomUUID() + ".tmp");
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                na.a(openInputStream, fileOutputStream);
                fileOutputStream.close();
                openInputStream.close();
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
                    if (options.outWidth > 0 && options.outHeight > 0) {
                        while (true) {
                            int i10 = i * 2;
                            if (Math.max(options.outWidth, options.outHeight) / i10 < 2000) {
                                break;
                            }
                            i = i10;
                        }
                        String absolutePath = file2.getAbsolutePath();
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i;
                        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options2);
                        if (decodeFile == null) {
                            return null;
                        }
                        Bitmap c10 = c(file2, decodeFile);
                        File file3 = new File(file, UUID.randomUUID() + ".jpg");
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            c10.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream);
                            fileOutputStream.close();
                            int width = c10.getWidth();
                            int height = c10.getHeight();
                            c10.recycle();
                            return new p1(file3, width, height);
                        } finally {
                        }
                    }
                    return null;
                } catch (OutOfMemoryError unused) {
                    return null;
                } finally {
                    file2.delete();
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pa.a(openInputStream, th);
                throw th2;
            }
        }
    }

    public static float b0() {
        if (e == 0) {
            return 0.0f;
        }
        float uptimeMillis = (float) (SystemClock.uptimeMillis() - e);
        if (uptimeMillis >= 350.0f) {
            e = 0L;
            return 0.0f;
        }
        if (uptimeMillis < 90.0f) {
            float f10 = 1.0f - (uptimeMillis / 90.0f);
            return 1.0f - (f10 * f10);
        }
        float f11 = (uptimeMillis - 90.0f) / 260.0f;
        return ((float) Math.exp((-4.5f) * f11)) * ((float) Math.cos(f11 * 7.0f));
    }

    public static final Bitmap c(File file, Bitmap bitmap) {
        Bitmap bitmap2;
        int i = 1;
        try {
            i = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
        } catch (Exception unused) {
        }
        Matrix matrix = new Matrix();
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 8) {
                            return bitmap;
                        }
                        matrix.postRotate(270.0f);
                    } else {
                        matrix.postRotate(90.0f);
                    }
                } else {
                    matrix.postScale(1.0f, -1.0f);
                }
            } else {
                matrix.postRotate(180.0f);
            }
        } else {
            matrix.postScale(-1.0f, 1.0f);
        }
        try {
            bitmap2 = bitmap;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                createBitmap.getClass();
                if (!createBitmap.equals(bitmap2)) {
                    bitmap2.recycle();
                }
                return createBitmap;
            } catch (Exception | OutOfMemoryError unused2) {
                return bitmap2;
            }
        } catch (Exception | OutOfMemoryError unused3) {
            bitmap2 = bitmap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.FileFilter, java.lang.Object] */
    public static void c0(File file) {
        try {
            Object[] listFiles = file.listFiles((FileFilter) new Object());
            if (listFiles != null) {
                y2 y2Var = new y2(2);
                if (listFiles.length != 0) {
                    listFiles = Arrays.copyOf(listFiles, listFiles.length);
                    if (listFiles.length > 1) {
                        Arrays.sort(listFiles, y2Var);
                    }
                }
                List asList = Arrays.asList(listFiles);
                asList.getClass();
                for (File file2 : qe.l.t(asList, 6)) {
                    file2.getClass();
                    af.c(file2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final Bitmap d(Context context, String str, String str2, int i, int i10, int i11, m3 m3Var, int i12) {
        String str3;
        int i13;
        Typeface typeface;
        Bitmap bitmap;
        context.getClass();
        str.getClass();
        str2.getClass();
        try {
            v7.d c10 = v7.c(context, str);
            String str4 = c10.f27406a;
            boolean z3 = c10.f27407b;
            int i14 = c10.f27408c;
            boolean z9 = c10.f27409d;
            File file = new File(v7.b(context), "coverdraw_" + str + ".png");
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                str3 = file.getAbsolutePath();
            } else {
                str3 = null;
            }
            Bitmap b10 = b(new LinkedHashMap(), context, c10.f27410f);
            Integer num = c10.e;
            if (num != null) {
                i13 = num.intValue();
            } else {
                i13 = i;
            }
            Integer valueOf = Integer.valueOf(i13);
            int i15 = c10.f27411g;
            float f10 = c10.f27412h;
            String str5 = c10.f27415l;
            if (str5 != null) {
                typeface = p7.e.e(context, str5);
            } else {
                typeface = null;
            }
            float f11 = c10.i;
            try {
                float f12 = c10.f27413j;
                float f13 = c10.f27414k;
                if (m3Var != null && i12 >= 0) {
                    bitmap = d(i12, context, m3Var);
                } else {
                    bitmap = null;
                }
                Bitmap b11 = b(str4, true, z3, i14, str2, z9, str3, b10, valueOf, i15, f10, typeface, f11, f12, f13, bitmap, i10, i11, false);
                if (c10.f27416m) {
                    I(b11, c10.f27417n);
                }
                t6.b(context, str, c10.f27418o, b11);
                return b11;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static float d0(d dVar) {
        float f10 = dVar.e * 1024.0f * dVar.f26039h;
        if (f10 < 0.5f) {
            return 0.5f;
        }
        return f10;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public static final void e(final l2 l2Var, Engine engine, Context context, final m3 m3Var, final int i, final int i10) {
        pe.j jVar;
        kotlin.jvm.internal.y yVar;
        LinkedHashMap linkedHashMap = l2Var.O;
        context.getClass();
        int i11 = (i10 * 2) + 2;
        String C0 = m3Var.C0(i);
        if (C0 == null) {
            C0 = a.g(i, "?");
        }
        final pe.j jVar2 = new pe.j(C0, Integer.valueOf(i11));
        final int l12 = m3Var.l1(i, i10);
        pe.j jVar3 = (pe.j) l2Var.N.get(jVar2);
        if (jVar3 != null && ((Number) jVar3.f22693u).intValue() != l12) {
            Integer num = (Integer) linkedHashMap.get(jVar2);
            if (num == null || num.intValue() != l12) {
                linkedHashMap.put(jVar2, Integer.valueOf(l12));
                final Object obj = new Object();
                try {
                    jVar = jVar2;
                    yVar = obj;
                } catch (OutOfMemoryError unused) {
                    jVar = jVar2;
                    yVar = obj;
                }
                try {
                    yVar.f19787u = v6.e(engine, context, i, i11, m3Var, new df.l() { // from class: u7.v7
                        @Override // df.l
                        public final Object invoke(Object obj2) {
                            Texture texture;
                            l2 l2Var2 = l2.this;
                            ArrayList arrayList = l2Var2.D;
                            Texture texture2 = (Texture) obj2;
                            LinkedHashMap linkedHashMap2 = l2Var2.O;
                            pe.j jVar4 = jVar2;
                            int i12 = l12;
                            if (texture2 == null) {
                                Integer num2 = (Integer) linkedHashMap2.get(jVar4);
                                if (num2 != null && num2.intValue() == i12) {
                                    linkedHashMap2.remove(jVar4);
                                }
                                Texture texture3 = (Texture) obj.f19787u;
                                if (texture3 != null) {
                                    arrayList.add(texture3);
                                }
                            } else {
                                LinkedHashMap linkedHashMap3 = l2Var2.N;
                                Integer num3 = (Integer) linkedHashMap2.get(jVar4);
                                if (num3 != null && num3.intValue() == i12) {
                                    pe.j jVar5 = (pe.j) linkedHashMap3.remove(jVar4);
                                    if (jVar5 != null && (texture = (Texture) jVar5.f22694v) != null) {
                                        arrayList.add(texture);
                                    }
                                    linkedHashMap3.put(jVar4, new pe.j(Integer.valueOf(i12), texture2));
                                    l2Var2.P.add(jVar4);
                                    linkedHashMap2.remove(jVar4);
                                    m3 m3Var2 = m3Var;
                                    if (i12 == m3Var2.l1(i, i10)) {
                                        m3Var2.f26545s.i(SystemClock.uptimeMillis());
                                    }
                                } else {
                                    arrayList.add(texture2);
                                }
                            }
                            return pe.z.f22715a;
                        }
                    });
                } catch (OutOfMemoryError unused2) {
                    linkedHashMap.remove(jVar);
                    Texture texture = (Texture) yVar.f19787u;
                    if (texture != null) {
                        l2Var.D.add(texture);
                    }
                }
            }
        }
    }

    public static final List e0(ArrayList arrayList) {
        int i;
        int i10;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        if (size < 3) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(11 * size);
        int i11 = 0;
        while (i11 < size) {
            o7 o7Var = (o7) arrayList2.get(i11);
            o7 o7Var2 = (o7) arrayList2.get(((i11 - 1) + size) % size);
            int i12 = i11 + 1;
            o7 o7Var3 = (o7) arrayList2.get(i12 % size);
            float f10 = o7Var2.f26684a;
            float f11 = o7Var.f26684a;
            float f12 = o7Var.e;
            float f13 = o7Var.f26685b;
            float f14 = f10 - f11;
            float f15 = o7Var2.f26685b - f13;
            float f16 = o7Var3.f26684a - f11;
            float f17 = o7Var3.f26685b - f13;
            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
            float sqrt2 = (float) Math.sqrt((f17 * f17) + (f16 * f16));
            if (f12 <= 0.0f || sqrt < 1.0E-6f || sqrt2 < 1.0E-6f) {
                i = size;
                i10 = i12;
                arrayList3.add(o7Var);
            } else {
                float f18 = f14 / sqrt;
                float f19 = f15 / sqrt;
                float f20 = f16 / sqrt2;
                float f21 = f17 / sqrt2;
                double acos = (float) (Math.acos(b9.d((f19 * f21) + (f18 * f20), -1.0f, 1.0f)) * 0.5d);
                int i13 = size;
                float tan = (float) Math.tan(acos);
                if (tan < 1.0E-4f) {
                    arrayList3.add(o7Var);
                } else {
                    float f22 = f12 / tan;
                    float min = Math.min(sqrt, sqrt2) * 0.5f;
                    if (f22 > min) {
                        f22 = min;
                    }
                    float f23 = tan * f22;
                    if (f23 < 1.0E-6f) {
                        arrayList3.add(o7Var);
                    } else {
                        float f24 = f18 + f20;
                        float f25 = f19 + f21;
                        i = i13;
                        i10 = i12;
                        float sqrt3 = (float) Math.sqrt((f25 * f25) + (f24 * f24));
                        if (sqrt3 < 1.0E-6f) {
                            arrayList3.add(o7Var);
                        } else {
                            float f26 = f24 / sqrt3;
                            float f27 = f25 / sqrt3;
                            float sin = f23 / ((float) Math.sin(acos));
                            float f28 = (f26 * sin) + o7Var.f26684a;
                            float f29 = (f27 * sin) + f13;
                            float f30 = (f21 * f22) + f13;
                            double atan2 = Math.atan2(((f19 * f22) + f13) - f29, ((f18 * f22) + r4) - f28);
                            double atan22 = Math.atan2(f30 - f29, ((f20 * f22) + r4) - f28) - atan2;
                            while (atan22 > 3.141592653589793d) {
                                atan22 -= 6.283185307179586d;
                            }
                            while (atan22 < -3.141592653589793d) {
                                atan22 += 6.283185307179586d;
                            }
                            int i14 = 0;
                            while (true) {
                                double d2 = ((i14 * atan22) / 10) + atan2;
                                double d10 = f23;
                                float f31 = f23;
                                float f32 = f28;
                                arrayList3.add(new o7((float) ((Math.cos(d2) * d10) + f28), (float) ((Math.sin(d2) * d10) + f29), o7Var.f26686c, o7Var.f26687d, 0.0f, o7Var.f26688f, o7Var.f26689g, o7Var.f26690h));
                                if (i14 != 10) {
                                    i14++;
                                    f23 = f31;
                                    f28 = f32;
                                }
                            }
                        }
                    }
                }
                i = i13;
                i10 = i12;
            }
            arrayList2 = arrayList;
            i11 = i10;
            size = i;
        }
        return arrayList3;
    }

    public static final Path f(RectF rectF, float f10, float f11, float f12) {
        float height = rectF.height();
        float f13 = height * f10;
        float f14 = height * f11;
        float width = rectF.width() / 4.0f;
        if (f14 > width) {
            f14 = width;
        }
        float f15 = rectF.top + f13;
        float f16 = rectF.bottom - f13;
        float f17 = rectF.left + f14;
        float f18 = rectF.right - f14;
        float f19 = height * f12;
        float f20 = (f16 - f15) / 2.0f;
        if (f19 > f20) {
            f19 = f20;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f21 = 0.28f * height;
        float f22 = (((f18 - f17) / 2.0f) - f19) * 0.9f;
        if (f21 > f22) {
            f21 = f22;
        }
        if (f21 < 0.0f) {
            f21 = 0.0f;
        }
        float f23 = height * 0.13f;
        Path path = new Path();
        float f24 = f17 + f19;
        path.moveTo(f24, f15);
        float f25 = centerX - f21;
        path.lineTo(f25, f15);
        float f26 = f13 * 2.0f;
        float f27 = f21 + centerX;
        path.quadTo(centerX, f15 - f26, f27, f15);
        float f28 = f18 - f19;
        path.lineTo(f28, f15);
        float f29 = f15 + f19;
        path.quadTo(f18, f15, f18, f29);
        float f30 = centerY - f23;
        path.quadTo(f18, f30, rectF.right, centerY);
        float f31 = centerY + f23;
        float f32 = f16 - f19;
        path.quadTo(f18, f31, f18, f32);
        path.quadTo(f18, f16, f28, f16);
        path.lineTo(f27, f16);
        path.quadTo(centerX, f16 + f26, f25, f16);
        path.lineTo(f24, f16);
        path.quadTo(f17, f16, f17, f32);
        path.quadTo(f17, f31, rectF.left, centerY);
        path.quadTo(f17, f30, f17, f29);
        path.quadTo(f17, f15, f24, f15);
        path.close();
        return path;
    }

    public static final String f0(String str) {
        str.getClass();
        Pattern compile = Pattern.compile("[\\\\/:*?\"<>|]");
        compile.getClass();
        String replaceAll = compile.matcher(str).replaceAll("");
        replaceAll.getClass();
        String obj = mf.f.I(replaceAll).toString();
        if (mf.f.u(obj)) {
            return "libreta";
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    public static g1 g(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        Integer num;
        list.getClass();
        list2.getClass();
        if (list2.isEmpty()) {
            arrayList = qe.m.g("");
        } else {
            List list3 = list2;
            ArrayList arrayList3 = new ArrayList(qe.m.d(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList3.add(((c) it.next()).f21854a);
            }
            arrayList = arrayList3;
        }
        if (list2.isEmpty()) {
            arrayList2 = qe.m.g("");
        } else {
            List list4 = list2;
            ArrayList arrayList4 = new ArrayList(qe.m.d(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((c) it2.next()).f21855b);
            }
            arrayList2 = arrayList4;
        }
        HashMap hashMap = new HashMap(arrayList.size() * 2);
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                hashMap.put((String) obj, Integer.valueOf(i10));
                i10 = i11;
            } else {
                qe.m.l();
                throw null;
            }
        }
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        int size = arrayList.size();
        ArrayList[] arrayListArr = new ArrayList[size];
        for (int i12 = 0; i12 < size; i12++) {
            arrayListArr[i12] = new ArrayList();
        }
        int i13 = 0;
        for (Object obj2 : list) {
            int i14 = i13 + 1;
            if (i13 >= 0) {
                String str = ((b) obj2).f21853g;
                if (str != null && (num = (Integer) hashMap.get(str)) != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                iArr[i13] = i;
                iArr2[i13] = arrayListArr[i].size();
                arrayListArr[i].add(Integer.valueOf(i13));
                i13 = i14;
            } else {
                qe.m.l();
                throw null;
            }
        }
        int size2 = arrayList.size();
        int[][] iArr3 = new int[size2];
        for (int i15 = 0; i15 < size2; i15++) {
            iArr3[i15] = qe.l.O(arrayListArr[i15]);
        }
        return new g1(arrayList, arrayList2, iArr, iArr2, iArr3);
    }

    public static final void g0(Engine engine, int i, float[] fArr) {
        engine.getClass();
        fArr.getClass();
        RenderableManager renderableManager = engine.f4216d;
        renderableManager.getClass();
        int i10 = renderableManager.i(i);
        if (i10 == 0) {
            return;
        }
        renderableManager.j(i10).b(fArr[0], fArr[1], fArr[2]);
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    public static final pe.o h(Engine engine, float f10, float f11, float f12, float f13, float f14, float f15, df.l lVar) {
        float[] fArr;
        float f16;
        float f17;
        double d2;
        float f18;
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        long nBuilderBuild2;
        float f19;
        boolean z3;
        float[] fArr2;
        int i = 4;
        int i10 = 0;
        float[] fArr3 = {f11, f10, f10, f11};
        float[] fArr4 = {f12, f12, f13, f13};
        float[] fArr5 = {-1.0f, 1.0f, 1.0f, -1.0f};
        float[] fArr6 = {-1.0f, -1.0f, 1.0f, 1.0f};
        float[] fArr7 = {f14, f14, f15, f15};
        double[] dArr = {0.0d, 90.0d, 180.0d, 270.0d};
        ArrayList arrayList = new ArrayList(28);
        ArrayList arrayList2 = new ArrayList(28);
        ArrayList arrayList3 = new ArrayList(28);
        ArrayList arrayList4 = new ArrayList(28);
        int i11 = 0;
        while (i11 < i) {
            int i12 = i10;
            while (true) {
                fArr2 = fArr4;
                ArrayList arrayList5 = arrayList4;
                double radians = Math.toRadians(((i12 * 90.0d) / 6) + dArr[i11]);
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float f20 = fArr7[i11];
                arrayList.add(Float.valueOf((f20 * cos) + (fArr5[i11] * f20) + fArr3[i11]));
                arrayList2.add(Float.valueOf((f20 * sin) + (fArr6[i11] * f20) + fArr2[i11]));
                arrayList3.add(Float.valueOf(cos));
                arrayList4 = arrayList5;
                arrayList4.add(Float.valueOf(sin));
                if (i12 != 6) {
                    i12++;
                    fArr4 = fArr2;
                }
            }
            i11++;
            fArr4 = fArr2;
            i = 4;
            i10 = 0;
        }
        int size = arrayList.size();
        x xVar = new x(0, 18);
        t tVar = new t(0, 4);
        float[] fArr8 = new float[size];
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            obj.getClass();
            fArr8[i13] = ((Number) lVar.invoke(obj)).floatValue();
        }
        float f21 = 0.0f;
        float d10 = b9.d(0.5f, 0.0f, 0.5f);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new float[]{0.0f, 0.87340003f, 90.0f});
        float f22 = 1.0f - d10;
        arrayList6.add(new float[]{f22, 0.87340003f, 90.0f});
        float f23 = 1.0f;
        int i14 = 1;
        while (true) {
            fArr = fArr8;
            f16 = d10;
            f17 = f21;
            d2 = 4;
            double radians2 = Math.toRadians((1.0d - (i14 / d2)) * 90.0d);
            f18 = 0.016f * f16;
            arrayList6.add(new float[]{(f16 * ((float) Math.cos(radians2))) + f22, 0.87340003f - ((1.0f - ((float) Math.sin(radians2))) * f18), (float) Math.toDegrees(radians2)});
            if (i14 == 4) {
                break;
            }
            i14++;
            d10 = f16;
            f21 = f17;
            fArr8 = fArr;
        }
        int i15 = 1;
        while (true) {
            double radians3 = Math.toRadians((i15 * 90.0d) / d2);
            float f24 = f22;
            arrayList6.add(new float[]{(((float) Math.cos(radians3)) * f16) + f22, a.x(f23, (float) Math.sin(radians3), f18, 0.78940004f), -((float) Math.toDegrees(radians3))});
            if (i15 == 4) {
                break;
            }
            i15++;
            f22 = f24;
            f23 = 1.0f;
        }
        arrayList6.add(new float[]{0.0f, 0.78940004f, -90.0f});
        int i16 = 0;
        while (i16 < size) {
            int i17 = i16 + 1;
            int i18 = i17 % size;
            float floatValue = ((Number) arrayList3.get(i16)).floatValue();
            Object obj2 = arrayList3.get(i18);
            obj2.getClass();
            float floatValue2 = ((Number) obj2).floatValue() + floatValue;
            float floatValue3 = ((Number) arrayList4.get(i16)).floatValue();
            Object obj3 = arrayList4.get(i18);
            obj3.getClass();
            float floatValue4 = ((Number) obj3).floatValue() + floatValue3;
            ArrayList arrayList7 = arrayList4;
            int i19 = i16;
            float sqrt = (float) Math.sqrt((floatValue4 * floatValue4) + (floatValue2 * floatValue2));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f25 = floatValue2 / sqrt;
            float f26 = floatValue4 / sqrt;
            float f27 = -f26;
            int size2 = arrayList6.size() - 1;
            int i20 = 0;
            while (i20 < size2) {
                Object obj4 = arrayList6.get(i20);
                obj4.getClass();
                float[] fArr9 = (float[]) obj4;
                i20++;
                Object obj5 = arrayList6.get(i20);
                obj5.getClass();
                float[] fArr10 = (float[]) obj5;
                int i21 = size;
                float f28 = f26;
                float f29 = f27;
                double radians4 = Math.toRadians(fArr9[2]);
                double radians5 = Math.toRadians(fArr10[2]);
                float cos2 = (float) Math.cos(radians4);
                float sin2 = (float) Math.sin(radians4);
                float cos3 = (float) Math.cos(radians5);
                float sin3 = (float) Math.sin(radians5);
                ArrayList arrayList8 = arrayList;
                ArrayList arrayList9 = arrayList2;
                ArrayList arrayList10 = arrayList3;
                float[] i22 = i(arrayList8, arrayList10, arrayList9, arrayList7, i19, fArr9[0] * fArr[i19], fArr9[1]);
                int i23 = i19;
                float f30 = f25 * cos2;
                float f31 = cos2 * f28;
                float[] fArr11 = {f30, f31, sin2};
                int i24 = i18;
                float[] i25 = i(arrayList8, arrayList10, arrayList9, arrayList7, i24, fArr9[0] * fArr[i18], fArr9[1]);
                float[] fArr12 = {f30, f31, sin2};
                float[] i26 = i(arrayList8, arrayList10, arrayList9, arrayList7, i24, fArr10[0] * fArr[i24], fArr10[1]);
                float f32 = f25 * cos3;
                float f33 = cos3 * f28;
                float[] fArr13 = {f32, f33, sin3};
                float[] i27 = i(arrayList8, arrayList10, arrayList9, arrayList7, i23, fArr10[0] * fArr[i23], fArr10[1]);
                ArrayList arrayList11 = arrayList7;
                int i28 = i17;
                float[] fArr14 = {f32, f33, sin3};
                float f34 = i25[0];
                float f35 = i22[0];
                float f36 = f34 - f35;
                float f37 = i25[1];
                float f38 = i22[1];
                float f39 = f37 - f38;
                float f40 = i25[2];
                float f41 = i22[2];
                float f42 = f40 - f41;
                float f43 = i26[0] - f35;
                float f44 = i26[1] - f38;
                float f45 = i26[2] - f41;
                float f46 = (f39 * f45) - (f42 * f44);
                float f47 = (f42 * f43) - (f45 * f36);
                float f48 = (f36 * f44) - (f39 * f43);
                float f49 = fArr11[0];
                float f50 = f49 + fArr12[0] + fArr13[0] + fArr14[0];
                float f51 = fArr11[1];
                float f52 = f51 + fArr12[1] + fArr13[1] + fArr14[1];
                float f53 = fArr11[2];
                boolean z9 = (f48 * (((f53 + fArr12[2]) + fArr13[2]) + fArr14[2])) + ((f47 * f52) + (f46 * f50)) < f17;
                int i29 = xVar.f4002v / 9;
                j(xVar, f35, f38, f41, f49, f51, f53, f29, f25);
                j(xVar, i25[0], i25[1], i25[2], fArr12[0], fArr12[1], fArr12[2], f29, f25);
                j(xVar, i26[0], i26[1], i26[2], fArr13[0], fArr13[1], fArr13[2], f29, f25);
                j(xVar, i27[0], i27[1], i27[2], fArr14[0], fArr14[1], fArr14[2], f29, f25);
                if (!z9) {
                    tVar.a(i29);
                    tVar.a(i29 + 1);
                    int i30 = i29 + 2;
                    tVar.a(i30);
                    tVar.a(i29);
                    tVar.a(i30);
                    tVar.a(i29 + 3);
                } else {
                    tVar.a(i29);
                    int i31 = i29 + 2;
                    tVar.a(i31);
                    tVar.a(i29 + 1);
                    tVar.a(i29);
                    tVar.a(i29 + 3);
                    tVar.a(i31);
                }
                arrayList2 = arrayList9;
                i19 = i23;
                arrayList = arrayList8;
                arrayList3 = arrayList10;
                f27 = f29;
                size = i21;
                f26 = f28;
                i18 = i24;
                arrayList7 = arrayList11;
                i17 = i28;
            }
            ArrayList arrayList12 = arrayList7;
            int i32 = size;
            float f54 = f27;
            int i33 = i17;
            int i34 = i18;
            ArrayList arrayList13 = arrayList2;
            ArrayList arrayList14 = arrayList3;
            int i35 = i19;
            ArrayList arrayList15 = arrayList;
            if (((Number) arrayList15.get(i35)).floatValue() == ((Number) arrayList15.get(i34)).floatValue() && ((Number) arrayList13.get(i35)).floatValue() == ((Number) arrayList13.get(i34)).floatValue()) {
                arrayList2 = arrayList13;
                arrayList = arrayList15;
                arrayList3 = arrayList14;
            } else {
                float[] i36 = i(arrayList15, arrayList14, arrayList13, arrayList12, i35, 0.0f, 0.78940004f);
                arrayList = arrayList15;
                arrayList3 = arrayList14;
                arrayList2 = arrayList13;
                float[] i37 = i(arrayList15, arrayList14, arrayList13, arrayList12, i34, 0.0f, 0.78940004f);
                float[] i38 = i(arrayList15, arrayList14, arrayList13, arrayList12, i34, 0.0f, 0.87340003f);
                float[] i39 = i(arrayList15, arrayList14, arrayList13, arrayList12, i35, 0.0f, 0.87340003f);
                float f55 = -floatValue2;
                float f56 = -floatValue4;
                float f57 = i37[0];
                float f58 = i36[0];
                float f59 = f57 - f58;
                float f60 = i37[1];
                float f61 = i36[1];
                float f62 = f60 - f61;
                float f63 = i37[2];
                float f64 = i36[2];
                float f65 = f63 - f64;
                float f66 = i38[0] - f58;
                float f67 = i38[1] - f61;
                float f68 = i38[2] - f64;
                float f69 = (f62 * f68) - (f65 * f67);
                float f70 = (f65 * f66) - (f68 * f59);
                float f71 = (f59 * f67) - (f62 * f66);
                float sqrt2 = (float) Math.sqrt((f71 * f71) + (f70 * f70) + (f69 * f69));
                if (sqrt2 > 1.0E-9f) {
                    float f72 = f69 / sqrt2;
                    float f73 = f70 / sqrt2;
                    float f74 = f71 / sqrt2;
                    z3 = (f74 * f17) + ((f56 * f73) + (f55 * f72)) < f17;
                    float f75 = z3 ? -1.0f : 1.0f;
                    f55 = f72 * f75;
                    f56 = f73 * f75;
                    f19 = f74 * f75;
                } else {
                    f19 = f17;
                    z3 = false;
                }
                float f76 = f55;
                float f77 = f56;
                int i40 = xVar.f4002v / 9;
                j(xVar, i36[0], i36[1], i36[2], f76, f77, f19, f54, f25);
                j(xVar, i37[0], i37[1], i37[2], f76, f77, f19, f54, f25);
                j(xVar, i38[0], i38[1], i38[2], f76, f77, f19, f54, f25);
                j(xVar, i39[0], i39[1], i39[2], f76, f77, f19, f54, f25);
                if (!z3) {
                    tVar.a(i40);
                    tVar.a(i40 + 1);
                    int i41 = i40 + 2;
                    tVar.a(i41);
                    tVar.a(i40);
                    tVar.a(i41);
                    tVar.a(i40 + 3);
                } else {
                    tVar.a(i40);
                    int i42 = i40 + 2;
                    tVar.a(i42);
                    tVar.a(i40 + 1);
                    tVar.a(i40);
                    tVar.a(i40 + 3);
                    tVar.a(i42);
                }
            }
            size = i32;
            arrayList4 = arrayList12;
            i16 = i33;
        }
        int i43 = xVar.f4002v / 9;
        ByteBuffer order = ByteBuffer.allocateDirect(i43 * 36).order(ByteOrder.nativeOrder());
        float[] fArr15 = (float[]) xVar.f4003w;
        int i44 = xVar.f4002v;
        for (int i45 = 0; i45 < i44; i45++) {
            order.putFloat(fArr15[i45]);
        }
        order.flip();
        nCreateBuilder = VertexBuffer.nCreateBuilder();
        new b0.a(nCreateBuilder, 8);
        VertexBuffer.nBuilderVertexCount(nCreateBuilder, i43);
        VertexBuffer.nBuilderBufferCount(nCreateBuilder, 1);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(1), 0, d.b(21), 0, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(2), 0, d.b(22), 12, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(4), 0, d.b(20), 28, 36);
        nBuilderBuild = VertexBuffer.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj6 = new Object();
            obj6.f4237a = nBuilderBuild;
            obj6.h(engine, order);
            ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(tVar.f1592a * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
            int[] iArr = tVar.f1593b;
            int i46 = tVar.f1592a;
            for (int i47 = 0; i47 < i46; i47++) {
                asShortBuffer.put((short) iArr[i47]);
            }
            asShortBuffer.flip();
            nCreateBuilder2 = IndexBuffer.nCreateBuilder();
            new b0.a(nCreateBuilder2, 3);
            IndexBuffer.nBuilderIndexCount(nCreateBuilder2, tVar.f1592a);
            IndexBuffer.nBuilderBufferType(nCreateBuilder2, 0);
            nBuilderBuild2 = IndexBuffer.nBuilderBuild(nCreateBuilder2, engine.getNativeObject());
            if (nBuilderBuild2 != 0) {
                Object obj7 = new Object();
                obj7.f4219a = nBuilderBuild2;
                obj7.g(engine, asShortBuffer);
                return new pe.o(obj6, obj7, Integer.valueOf(tVar.f1592a));
            }
            x.o("Couldn't create IndexBuffer");
            return null;
        }
        x.o("Couldn't create VertexBuffer");
        return null;
    }

    public static final void h0(Engine engine, int i, Texture texture, TextureSampler textureSampler) {
        RenderableManager renderableManager = engine.f4216d;
        renderableManager.getClass();
        int i10 = renderableManager.i(i);
        if (i10 == 0) {
            return;
        }
        MaterialInstance j10 = renderableManager.j(i10);
        if (texture != null) {
            j10.d("normalTex", texture, textureSampler);
            j10.c("hasNormal", 1.0f);
        } else {
            j10.c("hasNormal", 0.0f);
        }
    }

    public static final float[] i(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i, float f10, float f11) {
        return new float[]{(((Number) arrayList2.get(i)).floatValue() * f10) + ((Number) arrayList.get(i)).floatValue(), (((Number) arrayList4.get(i)).floatValue() * f10) + ((Number) arrayList3.get(i)).floatValue(), f11};
    }

    public static final void i0(Engine engine, int i, Texture texture, TextureSampler textureSampler) {
        engine.getClass();
        texture.getClass();
        textureSampler.getClass();
        RenderableManager renderableManager = engine.f4216d;
        renderableManager.getClass();
        int i10 = renderableManager.i(i);
        if (i10 == 0) {
            return;
        }
        MaterialInstance j10 = renderableManager.j(i10);
        j10.d("numberTex", texture, textureSampler);
        j10.c("hasNumber", 1.0f);
    }

    public static final void j(x xVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float[] Z = Z(f16, f17, 0.0f, (f14 * 0.0f) - (f15 * f17), (f15 * f16) - (f13 * 0.0f), (f13 * f17) - (f14 * f16), f13, f14, f15);
        xVar.d(f10);
        xVar.d(f11);
        xVar.d(f12);
        xVar.d(Z[0]);
        xVar.d(Z[1]);
        xVar.d(Z[2]);
        xVar.d(Z[3]);
        xVar.d(b9.d((f12 - 0.78940004f) / 0.08399999f, 0.0f, 1.0f));
        xVar.d(0.5f);
    }

    public static final void j0(Engine engine, int i, float f10) {
        RenderableManager renderableManager = engine.f4216d;
        renderableManager.getClass();
        int i10 = renderableManager.i(i);
        if (i10 == 0) {
            return;
        }
        MaterialInstance j10 = renderableManager.j(i10);
        j10.b(f10, 0.96f * f10, 0.92f * f10);
        j10.c("stackShade", 1.0f - f10);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    public static final pe.o k(Engine engine, float f10) {
        float f11;
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        long nBuilderBuild2;
        float min = Math.min(0.505f, 0.75f);
        if (0.08f <= min) {
            min = 0.08f;
        }
        ArrayList arrayList = new ArrayList();
        if (f10 > 0.0f) {
            f11 = min;
        } else {
            f11 = 0.0f;
        }
        if (f10 >= 0.0f) {
            min = 0.0f;
        }
        float f12 = 0.505f - f11;
        l(arrayList, f12, 0.75f - f11, f11, 0.0f, 90.0f);
        float f13 = f11;
        float f14 = (-0.505f) + min;
        float f15 = min;
        l(arrayList, f14, 0.75f - min, f15, 90.0f, 180.0f);
        l(arrayList, f14, (-0.75f) + f15, f15, 180.0f, 270.0f);
        l(arrayList, f12, (-0.75f) + f13, f13, 270.0f, 360.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        float f16 = 1.0f;
        f8 f8Var = new f8(0.0f, 0.0f, 1.0f);
        f8 f8Var2 = new f8(1.0f, 0.0f, 0.0f);
        f8 f8Var3 = new f8(0.0f, 1.0f, 0.0f);
        m(arrayList2, 0.0f, 0.0f, 0.009f, f8Var, f8Var2, f8Var3, 0.5f, 0.5f);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            pe.j jVar = (pe.j) next;
            Object obj = jVar.f22694v;
            Number number = (Number) jVar.f22693u;
            Number number2 = (Number) obj;
            m(arrayList2, number.floatValue(), number2.floatValue(), 0.009f, f8Var, f8Var2, f8Var3, ((number.floatValue() / 0.505f) * 0.5f) + 0.5f, ((number2.floatValue() / 0.75f) * 0.5f) + 0.5f);
        }
        int i = 0;
        while (i < size) {
            arrayList3.add(0);
            i = 1 + i;
            arrayList3.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf((i % size) + 1));
        }
        f8 f8Var4 = new f8(0.0f, 0.0f, -1.0f);
        f8 f8Var5 = new f8(1.0f, 0.0f, 0.0f);
        f8 f8Var6 = new f8(0.0f, -1.0f, 0.0f);
        int size2 = arrayList2.size() / 9;
        m(arrayList2, 0.0f, 0.0f, -0.009f, f8Var4, f8Var5, f8Var6, 0.5f, 0.5f);
        int i10 = size2 + 1;
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            pe.j jVar2 = (pe.j) next2;
            Object obj2 = jVar2.f22694v;
            Number number3 = (Number) jVar2.f22693u;
            Number number4 = (Number) obj2;
            m(arrayList2, number3.floatValue(), number4.floatValue(), -0.009f, f8Var4, f8Var5, f8Var6, 1.0f - (((number3.floatValue() / 0.505f) * 0.5f) + 0.5f), ((number4.floatValue() / 0.75f) * 0.5f) + 0.5f);
        }
        int i11 = 0;
        while (i11 < size) {
            arrayList3.add(Integer.valueOf(size2));
            int i12 = i11 + 1;
            arrayList3.add(Integer.valueOf((i12 % size) + i10));
            arrayList3.add(Integer.valueOf(i10 + i11));
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList.get(i13);
            obj3.getClass();
            pe.j jVar3 = (pe.j) obj3;
            Object obj4 = jVar3.f22694v;
            Object obj5 = jVar3.f22693u;
            i13++;
            Object obj6 = arrayList.get(i13 % size);
            obj6.getClass();
            pe.j jVar4 = (pe.j) obj6;
            Object obj7 = jVar4.f22694v;
            Number number5 = (Number) jVar4.f22693u;
            Number number6 = (Number) obj5;
            float floatValue = number5.floatValue() - number6.floatValue();
            Number number7 = (Number) obj7;
            Number number8 = (Number) obj4;
            float floatValue2 = number7.floatValue() - number8.floatValue();
            float f17 = -floatValue;
            float sqrt = (float) Math.sqrt((f17 * f17) + (floatValue2 * floatValue2));
            if (sqrt > 1.0E-6f) {
                floatValue2 /= sqrt;
                f17 /= sqrt;
            }
            f8 f8Var7 = new f8(floatValue2, f17, 0.0f);
            f8 f8Var8 = new f8(0.0f, 0.0f, f16);
            f8 f8Var9 = new f8(f17, -floatValue2, 0.0f);
            int size3 = arrayList2.size() / 9;
            m(arrayList2, number6.floatValue(), number8.floatValue(), 0.009f, f8Var7, f8Var8, f8Var9, 0.5f, 0.5f);
            m(arrayList2, number5.floatValue(), number7.floatValue(), 0.009f, f8Var7, f8Var8, f8Var9, 0.5f, 0.5f);
            m(arrayList2, number5.floatValue(), number7.floatValue(), -0.009f, f8Var7, f8Var8, f8Var9, 0.5f, 0.5f);
            m(arrayList2, number6.floatValue(), number8.floatValue(), -0.009f, f8Var7, f8Var8, f8Var9, 0.5f, 0.5f);
            arrayList3.add(Integer.valueOf(size3));
            arrayList3.add(Integer.valueOf(size3 + 3));
            int i14 = size3 + 2;
            arrayList3.add(Integer.valueOf(i14));
            arrayList3.add(Integer.valueOf(size3));
            arrayList3.add(Integer.valueOf(i14));
            arrayList3.add(Integer.valueOf(size3 + 1));
            f16 = 1.0f;
        }
        int size4 = arrayList2.size() / 9;
        ByteBuffer order = ByteBuffer.allocateDirect(size4 * 36).order(ByteOrder.nativeOrder());
        Iterator it3 = arrayList2.iterator();
        it3.getClass();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            next3.getClass();
            order.putFloat(((Number) next3).floatValue());
        }
        order.flip();
        nCreateBuilder = VertexBuffer.nCreateBuilder();
        new b0.a(nCreateBuilder, 8);
        VertexBuffer.nBuilderVertexCount(nCreateBuilder, size4);
        VertexBuffer.nBuilderBufferCount(nCreateBuilder, 1);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(1), 0, d.b(21), 0, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(2), 0, d.b(22), 12, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, d.b(4), 0, d.b(20), 28, 36);
        nBuilderBuild = VertexBuffer.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj8 = new Object();
            obj8.f4237a = nBuilderBuild;
            obj8.h(engine, order);
            ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(arrayList3.size() * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
            Iterator it4 = arrayList3.iterator();
            it4.getClass();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                next4.getClass();
                asShortBuffer.put((short) ((Number) next4).intValue());
            }
            asShortBuffer.flip();
            nCreateBuilder2 = IndexBuffer.nCreateBuilder();
            new b0.a(nCreateBuilder2, 3);
            IndexBuffer.nBuilderIndexCount(nCreateBuilder2, arrayList3.size());
            IndexBuffer.nBuilderBufferType(nCreateBuilder2, 0);
            nBuilderBuild2 = IndexBuffer.nBuilderBuild(nCreateBuilder2, engine.getNativeObject());
            if (nBuilderBuild2 != 0) {
                Object obj9 = new Object();
                obj9.f4219a = nBuilderBuild2;
                obj9.g(engine, asShortBuffer);
                return new pe.o(obj8, obj9, Integer.valueOf(arrayList3.size()));
            }
            x.o("Couldn't create IndexBuffer");
            return null;
        }
        x.o("Couldn't create VertexBuffer");
        return null;
    }

    public static void k0(Canvas canvas, StaticLayout staticLayout, TextPaint textPaint, float f10, float f11, float f12, int i, int i10) {
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(i10);
        if (f10 < 0.1f) {
            f10 = 0.1f;
        }
        textPaint.setShadowLayer(f10, f11, f12, i);
        staticLayout.draw(canvas);
        textPaint.clearShadowLayer();
    }

    public static final void l(ArrayList arrayList, float f10, float f11, float f12, float f13, float f14) {
        if (f12 <= 0.0f) {
            arrayList.add(new pe.j(Float.valueOf(f10), Float.valueOf(f11)));
            return;
        }
        int i = 0;
        while (true) {
            double radians = Math.toRadians((((f14 - f13) * i) / 10) + f13);
            double d2 = f12;
            arrayList.add(new pe.j(Float.valueOf((float) ((Math.cos(radians) * d2) + f10)), Float.valueOf((float) ((Math.sin(radians) * d2) + f11))));
            if (i != 10) {
                i++;
            } else {
                return;
            }
        }
    }

    public static final Path l0(RectF rectF) {
        float height = rectF.height();
        float f10 = 0.15f * height;
        float f11 = 0.16f * height;
        float f12 = height / 2.0f;
        if (f11 > f12) {
            f11 = f12;
        }
        float width = rectF.width() * 0.32f;
        float width2 = (rectF.width() / 2.0f) - f11;
        if (width > width2) {
            width = width2;
        }
        float f13 = rectF.top + f10;
        float f14 = rectF.bottom - f10;
        float centerX = rectF.centerX();
        Path path = new Path();
        float f15 = centerX - width;
        path.moveTo(f15, rectF.top);
        float f16 = centerX + width;
        path.lineTo(f16, rectF.top);
        path.lineTo(f16, f13);
        path.lineTo(rectF.right - f11, f13);
        float f17 = rectF.right;
        float f18 = f13 + f11;
        path.quadTo(f17, f13, f17, f18);
        float f19 = f14 - f11;
        path.lineTo(rectF.right, f19);
        float f20 = rectF.right;
        path.quadTo(f20, f14, f20 - f11, f14);
        path.lineTo(f16, f14);
        path.lineTo(f16, rectF.bottom);
        path.lineTo(f15, rectF.bottom);
        path.lineTo(f15, f14);
        path.lineTo(rectF.left + f11, f14);
        float f21 = rectF.left;
        path.quadTo(f21, f14, f21, f19);
        path.lineTo(rectF.left, f18);
        float f22 = rectF.left;
        path.quadTo(f22, f13, f11 + f22, f13);
        path.lineTo(f15, f13);
        path.close();
        return path;
    }

    public static final void m(ArrayList arrayList, float f10, float f11, float f12, f8 f8Var, f8 f8Var2, f8 f8Var3, float f13, float f14) {
        float[] Z = Z(f8Var2.f26196a, f8Var2.f26197b, f8Var2.f26198c, f8Var3.f26196a, f8Var3.f26197b, f8Var3.f26198c, f8Var.f26196a, f8Var.f26197b, f8Var.f26198c);
        arrayList.add(Float.valueOf(f10));
        arrayList.add(Float.valueOf(f11));
        arrayList.add(Float.valueOf(f12));
        arrayList.add(Float.valueOf(Z[0]));
        arrayList.add(Float.valueOf(Z[1]));
        arrayList.add(Float.valueOf(Z[2]));
        arrayList.add(Float.valueOf(Z[3]));
        arrayList.add(Float.valueOf(f13));
        arrayList.add(Float.valueOf(f14));
    }

    public static void m0(Canvas canvas, StaticLayout staticLayout, TextPaint textPaint, int i, float f10) {
        textPaint.clearShadowLayer();
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(f10);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setColor(i);
        staticLayout.draw(canvas);
        textPaint.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Type inference failed for: r1v50, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    public static pe.o n(Engine engine, List list, float f10, float f11) {
        float f12;
        float f13;
        t tVar;
        int i;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        int i11;
        float f18;
        float[] fArr;
        t tVar2;
        int i12;
        boolean z3;
        int i13;
        int[] O;
        int i14;
        float[] fArr2;
        t tVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        long nBuilderBuild2;
        int i19;
        float f19;
        float f20;
        float f21;
        float f22;
        int i20;
        float f23;
        float f24;
        float f25;
        float f26;
        int i21;
        float f27;
        float f28;
        List list2 = list;
        engine.getClass();
        int i22 = 0;
        x xVar = new x(0, 18);
        t tVar4 = new t(0, 4);
        int size = list2.size();
        Float valueOf = Float.valueOf(0.0f);
        int i23 = 0;
        float f29 = 0.0f;
        while (i23 < size) {
            o7 o7Var = (o7) list2.get(i23);
            i23++;
            o7 o7Var2 = (o7) list2.get(i23 % size);
            f29 += (o7Var.f26684a * o7Var2.f26685b) - (o7Var2.f26684a * o7Var.f26685b);
        }
        if (f29 >= 0.0f) {
            f12 = 1.0f;
        } else {
            f12 = -1.0f;
        }
        float f30 = 1.0E-6f;
        if (f11 > 1.0E-6f) {
            f13 = 0.9f * f10;
            if (f11 <= f13) {
                f13 = f11;
            }
        } else {
            f13 = 0.0f;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i24 = 8;
        if (f13 <= 0.0f) {
            arrayList.add(Float.valueOf(-f10));
            arrayList2.add(valueOf);
            arrayList.add(Float.valueOf(f10));
            arrayList2.add(valueOf);
            f17 = 1.0E-6f;
            f16 = f13;
            i = 0;
            tVar = tVar4;
        } else {
            int i25 = 0;
            while (true) {
                tVar = tVar4;
                i = i22;
                double d2 = ((8 - i25) * 1.5707963267948966d) / i24;
                f14 = f30;
                f15 = f13;
                double d10 = 1;
                arrayList.add(Float.valueOf((float) (((d10 - Math.sin(d2)) * f13) + (-f10))));
                arrayList2.add(Float.valueOf((float) (d10 - Math.cos(d2))));
                i10 = 8;
                if (i25 == 8) {
                    break;
                }
                i25++;
                i24 = 8;
                f30 = f14;
                tVar4 = tVar;
                i22 = i;
                f13 = f15;
            }
            int i26 = i;
            while (true) {
                double d11 = (i26 * 1.5707963267948966d) / i10;
                f16 = f15;
                f17 = f14;
                double d12 = 1;
                arrayList.add(Float.valueOf((float) (f10 - ((d12 - Math.sin(d11)) * f16))));
                arrayList2.add(Float.valueOf((float) (d12 - Math.cos(d11))));
                if (i26 == 8) {
                    break;
                }
                i26++;
                f15 = f16;
                i10 = 8;
                f14 = f17;
            }
        }
        int size2 = arrayList.size();
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        int i27 = i;
        while (i27 < size) {
            o7 o7Var3 = (o7) list2.get(i27);
            o7 o7Var4 = (o7) list2.get(((i27 - 1) + size) % size);
            int i28 = i27 + 1;
            o7 o7Var5 = (o7) list2.get(i28 % size);
            float f31 = o7Var4.f26684a;
            int i29 = i27;
            float f32 = o7Var3.f26684a;
            float f33 = f31 - f32;
            float f34 = o7Var4.f26685b;
            float f35 = o7Var3.f26685b;
            float f36 = f34 - f35;
            float f37 = o7Var5.f26684a - f32;
            float f38 = o7Var5.f26685b - f35;
            float sqrt = (float) Math.sqrt((f36 * f36) + (f33 * f33));
            float sqrt2 = (float) Math.sqrt((f38 * f38) + (f37 * f37));
            if (sqrt > f17) {
                f33 /= sqrt;
                f36 /= sqrt;
            }
            if (sqrt2 > f17) {
                f38 /= sqrt2;
                f28 = f37 / sqrt2;
            } else {
                f28 = f37;
            }
            float f39 = f33 + f28;
            float f40 = f36 + f38;
            float sqrt3 = (float) Math.sqrt((f40 * f40) + (f39 * f39));
            if (sqrt3 > f17) {
                f39 /= sqrt3;
                f40 /= sqrt3;
            }
            fArr3[i29] = f39;
            fArr4[i29] = f40;
            i27 = i28;
        }
        ArrayList arrayList3 = arrayList2;
        int i30 = i;
        while (i30 < size) {
            o7 o7Var6 = (o7) list2.get(i30);
            int i31 = i30 + 1;
            int i32 = i31 % size;
            o7 o7Var7 = (o7) list2.get(i32);
            char c10 = 2;
            float f41 = o7Var7.f26684a - o7Var6.f26684a;
            float f42 = o7Var7.f26685b - o7Var6.f26685b;
            float f43 = f42 * f12;
            float f44 = (-f41) * f12;
            if (o7Var6.f26687d && o7Var7.f26687d) {
                i19 = 1;
            } else {
                i19 = i;
            }
            if (i19 != 0) {
                f19 = o7Var6.f26686c;
            } else {
                f19 = 0.5f;
            }
            if (i19 != 0) {
                f20 = o7Var7.f26686c;
            } else {
                f20 = 0.5f;
            }
            int i33 = size2 - 1;
            float f45 = f16;
            int i34 = i;
            while (i34 < i33) {
                Object obj = arrayList.get(i34);
                obj.getClass();
                float floatValue = ((Number) obj).floatValue();
                int i35 = i34 + 1;
                Object obj2 = arrayList.get(i35);
                obj2.getClass();
                float floatValue2 = ((Number) obj2).floatValue();
                if (i19 != 0) {
                    f21 = (floatValue + f10) / (f10 * 2.0f);
                } else {
                    f21 = 0.5f;
                }
                if (i19 != 0) {
                    f22 = (floatValue2 + f10) / (2.0f * f10);
                } else {
                    f22 = 0.5f;
                }
                float p10 = p(list, arrayList3, f45, fArr3, i30, i34);
                float[] fArr5 = fArr4;
                float[] fArr6 = fArr3;
                float q10 = q(list, arrayList3, f45, fArr5, i30, i34);
                int i36 = i30;
                float[] fArr7 = new float[3];
                fArr7[i] = p10;
                fArr7[1] = floatValue;
                fArr7[c10] = q10;
                int i37 = i32;
                float p11 = p(list, arrayList3, f45, fArr6, i37, i34);
                float q11 = q(list, arrayList3, f45, fArr5, i37, i34);
                float[] fArr8 = new float[3];
                fArr8[i] = p11;
                fArr8[1] = floatValue;
                fArr8[c10] = q11;
                i34 = i35;
                float p12 = p(list, arrayList3, f45, fArr6, i37, i34);
                float q12 = q(list, arrayList3, f45, fArr5, i37, i34);
                float[] fArr9 = new float[3];
                fArr9[i] = p12;
                fArr9[1] = floatValue2;
                fArr9[c10] = q12;
                float p13 = p(list, arrayList3, f45, fArr6, i36, i34);
                float q13 = q(list, arrayList3, f45, fArr5, i36, i34);
                ArrayList arrayList4 = arrayList3;
                float[] fArr10 = new float[3];
                fArr10[i] = p13;
                fArr10[1] = floatValue2;
                fArr10[c10] = q13;
                float f46 = fArr8[i];
                float f47 = fArr7[i];
                float f48 = f46 - f47;
                float f49 = fArr8[1];
                float f50 = fArr7[1];
                float f51 = f49 - f50;
                float f52 = fArr8[c10];
                float f53 = fArr7[c10];
                float f54 = f52 - f53;
                float f55 = fArr9[i] - f47;
                float f56 = fArr9[1] - f50;
                float f57 = fArr9[c10] - f53;
                float f58 = (f51 * f57) - (f54 * f56);
                float f59 = (f54 * f55) - (f57 * f48);
                float f60 = (f48 * f56) - (f51 * f55);
                float f61 = f45;
                float sqrt4 = (float) Math.sqrt((f60 * f60) + (f59 * f59) + (f58 * f58));
                if (sqrt4 > 1.0E-9f) {
                    f58 /= sqrt4;
                    f59 /= sqrt4;
                    f60 /= sqrt4;
                    if ((f60 * f44) + (f59 * 0.0f) + (f58 * f43) < 0.0f) {
                        f27 = -1.0f;
                    } else {
                        f27 = 1.0f;
                    }
                    f23 = f58 * f27;
                    float f62 = f59 * f27;
                    f24 = f27 * f60;
                    i20 = i33;
                    f25 = f41;
                    f26 = f62;
                } else {
                    i20 = i33;
                    f23 = f43;
                    f24 = f44;
                    f25 = f41;
                    f26 = 0.0f;
                }
                if ((f60 * f44) + (f59 * 0.0f) + (f58 * f43) < 0.0f) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                int i38 = i20;
                int i39 = xVar.f4002v / 9;
                t tVar5 = tVar;
                float f63 = f42;
                float f64 = fArr7[i];
                float f65 = fArr7[1];
                float f66 = fArr7[c10];
                ArrayList arrayList5 = arrayList;
                int i40 = i;
                float f67 = f23;
                int i41 = size;
                char c11 = c10;
                float f68 = f21;
                o(xVar, f64, f65, f66, f67, f26, f24, f25, f63, f19, f68);
                float f69 = f19;
                float f70 = f20;
                o(xVar, fArr8[i40], fArr8[1], fArr8[c11], f67, f26, f24, f25, f63, f70, f68);
                float f71 = f22;
                o(xVar, fArr9[i40], fArr9[1], fArr9[c11], f67, f26, f24, f25, f63, f70, f71);
                f19 = f69;
                o(xVar, fArr10[i40], fArr10[1], fArr10[c11], f67, f26, f24, f25, f63, f19, f71);
                if (i21 == 0) {
                    tVar5.a(i39);
                    tVar5.a(i39 + 1);
                    int i42 = i39 + 2;
                    tVar5.a(i42);
                    tVar5.a(i39);
                    tVar5.a(i42);
                    tVar5.a(i39 + 3);
                } else {
                    tVar5.a(i39);
                    int i43 = i39 + 2;
                    tVar5.a(i43);
                    tVar5.a(i39 + 1);
                    tVar5.a(i39);
                    tVar5.a(i39 + 3);
                    tVar5.a(i43);
                }
                fArr4 = fArr5;
                f41 = f25;
                f42 = f63;
                size = i41;
                f20 = f70;
                arrayList = arrayList5;
                f45 = f61;
                fArr3 = fArr6;
                arrayList3 = arrayList4;
                i32 = i37;
                i33 = i38;
                c10 = c11;
                i = i40;
                tVar = tVar5;
                i30 = i36;
            }
            list2 = list;
            i30 = i31;
            f16 = f45;
        }
        ArrayList arrayList6 = arrayList3;
        float[] fArr11 = fArr3;
        float f72 = f16;
        float[] fArr12 = fArr4;
        ArrayList arrayList7 = arrayList;
        t tVar6 = tVar;
        int i44 = i;
        int i45 = 1;
        int size3 = list2.size();
        ArrayList arrayList8 = new ArrayList();
        if (size3 < 3) {
            i13 = i44;
            O = new int[i13];
            fArr = fArr12;
            tVar2 = tVar6;
            z3 = 2;
            i12 = 3;
        } else {
            float f73 = 0.0f;
            int i46 = 0;
            while (i46 < size3) {
                o7 o7Var8 = (o7) list2.get(i46);
                i46++;
                o7 o7Var9 = (o7) list2.get(i46 % size3);
                f73 += (o7Var8.f26684a * o7Var9.f26685b) - (o7Var9.f26684a * o7Var8.f26685b);
            }
            ArrayList arrayList9 = new ArrayList(size3);
            if (f73 >= 0.0f) {
                for (int i47 = 0; i47 < size3; i47++) {
                    arrayList9.add(Integer.valueOf(i47));
                }
            } else {
                for (int i48 = size3 - 1; -1 < i48; i48--) {
                    arrayList9.add(Integer.valueOf(i48));
                }
            }
            int i49 = 0;
            int i50 = 0;
            while (arrayList9.size() > 3 && i49 < 100000) {
                int i51 = i49 + 1;
                Object obj3 = arrayList9.get(((arrayList9.size() + i50) - i45) % arrayList9.size());
                obj3.getClass();
                o7 o7Var10 = (o7) list2.get(((Number) obj3).intValue());
                Object obj4 = arrayList9.get(i50);
                obj4.getClass();
                o7 o7Var11 = (o7) list2.get(((Number) obj4).intValue());
                int i52 = i50 + 1;
                Object obj5 = arrayList9.get(i52 % arrayList9.size());
                obj5.getClass();
                o7 o7Var12 = (o7) list2.get(((Number) obj5).intValue());
                f18 = 1.0E-7f;
                if (Math.abs(o7Var11.f26684a - o7Var10.f26684a) < 1.0E-5f && Math.abs(o7Var11.f26685b - o7Var10.f26685b) < 1.0E-5f) {
                    i17 = i45;
                } else {
                    i17 = 0;
                }
                i11 = i45;
                if (Math.abs(K(o7Var10.f26684a, o7Var10.f26685b, o7Var11.f26684a, o7Var11.f26685b, o7Var12.f26684a, o7Var12.f26685b)) < 1.0E-7f) {
                    i18 = i11;
                } else {
                    i18 = 0;
                }
                if (i17 == 0 && i18 == 0) {
                    if (i52 >= arrayList9.size()) {
                        break;
                    }
                    i50 = i52;
                } else {
                    arrayList9.remove(i50);
                    if (i50 >= arrayList9.size()) {
                        i49 = i51;
                        i45 = i11;
                        i50 = 0;
                    }
                }
                i49 = i51;
                i45 = i11;
            }
            i11 = i45;
            f18 = 1.0E-7f;
            int i53 = 0;
            while (arrayList9.size() > 3 && i53 < 20000) {
                int i54 = i53 + 1;
                int size4 = arrayList9.size();
                float f74 = 0.0f;
                int i55 = 0;
                int i56 = -1;
                while (true) {
                    if (i55 < size4) {
                        Object obj6 = arrayList9.get(((arrayList9.size() + i55) - 1) % arrayList9.size());
                        obj6.getClass();
                        int intValue = ((Number) obj6).intValue();
                        Object obj7 = arrayList9.get(i55);
                        obj7.getClass();
                        int intValue2 = ((Number) obj7).intValue();
                        int i57 = i55 + 1;
                        Object obj8 = arrayList9.get(i57 % arrayList9.size());
                        obj8.getClass();
                        int intValue3 = ((Number) obj8).intValue();
                        i14 = i54;
                        o7 o7Var13 = (o7) list2.get(intValue);
                        int i58 = size4;
                        o7 o7Var14 = (o7) list2.get(intValue2);
                        fArr2 = fArr12;
                        o7 o7Var15 = (o7) list2.get(intValue3);
                        tVar3 = tVar6;
                        float K = K(o7Var13.f26684a, o7Var13.f26685b, o7Var14.f26684a, o7Var14.f26685b, o7Var15.f26684a, o7Var15.f26685b);
                        if (K > 0.0f) {
                            Iterator it = arrayList9.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                float f75 = K;
                                int intValue4 = ((Number) next).intValue();
                                if (intValue4 != intValue && intValue4 != intValue2) {
                                    if (intValue4 == intValue3) {
                                        continue;
                                        K = f75;
                                    } else {
                                        o7 o7Var16 = (o7) list2.get(intValue4);
                                        float f76 = o7Var16.f26684a;
                                        float f77 = o7Var16.f26685b;
                                        float f78 = o7Var13.f26684a;
                                        float f79 = o7Var13.f26685b;
                                        float f80 = o7Var14.f26684a;
                                        float f81 = o7Var14.f26685b;
                                        float f82 = o7Var15.f26684a;
                                        float f83 = o7Var15.f26685b;
                                        float K2 = K(f76, f77, f78, f79, f80, f81);
                                        float K3 = K(f76, f77, f80, f81, f82, f83);
                                        float K4 = K(f76, f77, f82, f83, f78, f79);
                                        if (K2 >= -1.0E-7f && K3 >= -1.0E-7f && K4 >= -1.0E-7f) {
                                            i15 = 0;
                                        } else {
                                            i15 = i11;
                                        }
                                        if (K2 <= f18 && K3 <= f18 && K4 <= f18) {
                                            i16 = 0;
                                        } else {
                                            i16 = i11;
                                        }
                                        if (i15 == 0 || i16 == 0) {
                                            if (f75 > f74) {
                                                i56 = i55;
                                                f74 = f75;
                                            }
                                        }
                                    }
                                }
                                list2 = list;
                                K = f75;
                            }
                            arrayList8.add(Integer.valueOf(intValue));
                            arrayList8.add(Integer.valueOf(intValue2));
                            arrayList8.add(Integer.valueOf(intValue3));
                            arrayList9.remove(i55);
                            break;
                        }
                        list2 = list;
                        i55 = i57;
                        tVar6 = tVar3;
                        i54 = i14;
                        size4 = i58;
                        fArr12 = fArr2;
                    } else {
                        i14 = i54;
                        fArr2 = fArr12;
                        tVar3 = tVar6;
                        if (i56 < 0) {
                            i56 = 0;
                        }
                        Object obj9 = arrayList9.get(((arrayList9.size() + i56) - 1) % arrayList9.size());
                        obj9.getClass();
                        int intValue5 = ((Number) obj9).intValue();
                        Object obj10 = arrayList9.get(i56);
                        obj10.getClass();
                        int intValue6 = ((Number) obj10).intValue();
                        Object obj11 = arrayList9.get((i56 + 1) % arrayList9.size());
                        obj11.getClass();
                        int intValue7 = ((Number) obj11).intValue();
                        arrayList8.add(Integer.valueOf(intValue5));
                        arrayList8.add(Integer.valueOf(intValue6));
                        arrayList8.add(Integer.valueOf(intValue7));
                        arrayList9.remove(i56);
                    }
                }
                list2 = list;
                tVar6 = tVar3;
                i53 = i14;
                fArr12 = fArr2;
            }
            fArr = fArr12;
            tVar2 = tVar6;
            i12 = 3;
            if (arrayList9.size() == 3) {
                i13 = 0;
                arrayList8.add(arrayList9.get(0));
                i45 = i11;
                arrayList8.add(arrayList9.get(i45));
                z3 = 2;
                arrayList8.add(arrayList9.get(2));
            } else {
                i45 = i11;
                z3 = 2;
                i13 = 0;
            }
            O = qe.l.O(arrayList8);
        }
        int i59 = i45;
        t tVar7 = tVar2;
        float[] fArr13 = fArr;
        int[] iArr = O;
        r(size2, arrayList7, iArr, xVar, tVar7, list, arrayList6, f72, fArr11, fArr13, true);
        r(size2, arrayList7, iArr, xVar, tVar7, list, arrayList6, f72, fArr11, fArr13, false);
        int i60 = xVar.f4002v / 9;
        ByteBuffer order = ByteBuffer.allocateDirect(i60 * 36).order(ByteOrder.nativeOrder());
        float[] fArr14 = (float[]) xVar.f4003w;
        int i61 = xVar.f4002v;
        for (int i62 = i13; i62 < i61; i62++) {
            order.putFloat(fArr14[i62]);
        }
        order.flip();
        nCreateBuilder = VertexBuffer.nCreateBuilder();
        new b0.a(nCreateBuilder, 8);
        VertexBuffer.nBuilderVertexCount(nCreateBuilder, i60);
        VertexBuffer.nBuilderBufferCount(nCreateBuilder, 1);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, i13, 0, 20, i13, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, i59, 0, 21, 12, 36);
        VertexBuffer.nBuilderAttribute(nCreateBuilder, i12, 0, 19, 28, 36);
        nBuilderBuild = VertexBuffer.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj12 = new Object();
            obj12.f4237a = nBuilderBuild;
            obj12.h(engine, order);
            ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(tVar7.f1592a * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
            int[] iArr2 = tVar7.f1593b;
            int i63 = tVar7.f1592a;
            for (int i64 = i13; i64 < i63; i64++) {
                asShortBuffer.put((short) iArr2[i64]);
            }
            asShortBuffer.flip();
            nCreateBuilder2 = IndexBuffer.nCreateBuilder();
            new b0.a(nCreateBuilder2, i12);
            IndexBuffer.nBuilderIndexCount(nCreateBuilder2, tVar7.f1592a);
            IndexBuffer.nBuilderBufferType(nCreateBuilder2, i13);
            nBuilderBuild2 = IndexBuffer.nBuilderBuild(nCreateBuilder2, engine.getNativeObject());
            if (nBuilderBuild2 != 0) {
                Object obj13 = new Object();
                obj13.f4219a = nBuilderBuild2;
                obj13.g(engine, asShortBuffer);
                return new pe.o(obj12, obj13, Integer.valueOf(tVar7.f1592a));
            }
            x.o("Couldn't create IndexBuffer");
            return null;
        }
        x.o("Couldn't create VertexBuffer");
        return null;
    }

    public static final Path n0(RectF rectF) {
        float height = rectF.height();
        float width = rectF.width();
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f10 = 0.12f * height;
        float f11 = 0.08f * width;
        if (f10 > f11) {
            f10 = f11;
        }
        float f12 = 0.065f * width;
        float f13 = 0.16f * height;
        if (f12 > f13) {
            f12 = f13;
        }
        float f14 = rectF.top + f10;
        float f15 = rectF.bottom - f10;
        float f16 = rectF.left + f12;
        float f17 = rectF.right - f12;
        float f18 = height * 0.18f;
        float f19 = (f15 - f14) / 3.0f;
        if (f18 > f19) {
            f18 = f19;
        }
        float f20 = width * 0.15f;
        float f21 = ((f17 - f16) / 2.0f) - f18;
        if (f21 < 0.0f) {
            f21 = 0.0f;
        }
        if (f20 > f21) {
            f20 = f21;
        }
        if (f13 > f19) {
            f13 = f19;
        }
        Path path = new Path();
        path.moveTo(centerX, rectF.top);
        float f22 = f20 * 0.35f;
        float f23 = centerX - f22;
        float f24 = f10 * 0.15f;
        float f25 = f20 * 0.75f;
        float f26 = centerX - f25;
        float f27 = centerX - f20;
        path.cubicTo(f23, rectF.top + f24, f26, f14, f27, f14);
        float f28 = f16 + f18;
        path.lineTo(f28, f14);
        float f29 = f18;
        float f30 = f14 + f29;
        path.quadTo(f16, f14, f16, f30);
        float f31 = f12 * 0.3f;
        float f32 = f16 + f31;
        float f33 = f20;
        float f34 = centerY - f13;
        path.quadTo(f32, f34, rectF.left, centerY);
        float f35 = centerY + f13;
        float f36 = f15 - f29;
        path.quadTo(f32, f35, f16, f36);
        path.quadTo(f16, f15, f28, f15);
        path.lineTo(f27, f15);
        float f37 = rectF.bottom;
        path.cubicTo(f26, f15, f23, f37 - f24, centerX, f37);
        float f38 = centerX + f22;
        float f39 = centerX + f25;
        float f40 = centerX + f33;
        path.cubicTo(f38, rectF.bottom - f24, f39, f15, f40, f15);
        float f41 = f17 - f29;
        path.lineTo(f41, f15);
        path.quadTo(f17, f15, f17, f36);
        float f42 = f17 - f31;
        path.quadTo(f42, f35, rectF.right, centerY);
        path.quadTo(f42, f34, f17, f30);
        path.quadTo(f17, f14, f41, f14);
        path.lineTo(f40, f14);
        float f43 = rectF.top;
        path.cubicTo(f39, f14, f38, f43 + f24, centerX, f43);
        path.close();
        return path;
    }

    public static final void o(x xVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float[] Z = Z(f16, 0.0f, f17, (f14 * f17) - (f15 * 0.0f), (f15 * f16) - (f13 * f17), (f13 * 0.0f) - (f14 * f16), f13, f14, f15);
        xVar.d(f10);
        xVar.d(f11);
        xVar.d(f12);
        xVar.d(Z[0]);
        xVar.d(Z[1]);
        xVar.d(Z[2]);
        xVar.d(Z[3]);
        xVar.d(f18);
        xVar.d(f19);
    }

    public static final float p(List list, ArrayList arrayList, float f10, float[] fArr, int i, int i10) {
        o7 o7Var = (o7) list.get(i);
        boolean z3 = o7Var.f26688f;
        float f11 = o7Var.f26684a;
        if (z3 && ((Number) arrayList.get(i10)).floatValue() > 0.0f) {
            o7 o7Var2 = (o7) list.get(i);
            float f12 = o7Var2.f26689g;
            if (f12 == 0.0f && o7Var2.f26690h == 0.0f) {
                f12 = fArr[i];
            }
            Object obj = arrayList.get(i10);
            obj.getClass();
            return (((Number) obj).floatValue() * f12 * f10) + f11;
        }
        return f11;
    }

    public static final float q(List list, ArrayList arrayList, float f10, float[] fArr, int i, int i10) {
        o7 o7Var = (o7) list.get(i);
        boolean z3 = o7Var.f26688f;
        float f11 = o7Var.f26685b;
        if (z3 && ((Number) arrayList.get(i10)).floatValue() > 0.0f) {
            o7 o7Var2 = (o7) list.get(i);
            float f12 = o7Var2.f26689g;
            float f13 = o7Var2.f26690h;
            if (f12 == 0.0f && f13 == 0.0f) {
                f13 = fArr[i];
            }
            Object obj = arrayList.get(i10);
            obj.getClass();
            return (((Number) obj).floatValue() * f13 * f10) + f11;
        }
        return f11;
    }

    public static final void r(int i, ArrayList arrayList, int[] iArr, x xVar, t tVar, List list, ArrayList arrayList2, float f10, float[] fArr, float[] fArr2, boolean z3) {
        float f11;
        int i10 = z3 ? i - 1 : 0;
        if (z3) {
            f11 = 1.0f;
        } else {
            f11 = -1.0f;
        }
        float f12 = f11;
        Object obj = arrayList.get(i10);
        obj.getClass();
        float floatValue = ((Number) obj).floatValue();
        for (int i11 = 0; i11 < iArr.length; i11 += 3) {
            int i12 = iArr[i11];
            int i13 = iArr[i11 + 1];
            int i14 = iArr[i11 + 2];
            float p10 = p(list, arrayList2, f10, fArr, i12, i10);
            float q10 = q(list, arrayList2, f10, fArr2, i12, i10);
            float p11 = p(list, arrayList2, f10, fArr, i13, i10);
            float q11 = q(list, arrayList2, f10, fArr2, i13, i10);
            float p12 = p(list, arrayList2, f10, fArr, i14, i10);
            float q12 = q(list, arrayList2, f10, fArr2, i14, i10);
            float f13 = ((q12 - q10) * (p11 - p10)) - ((p12 - p10) * (q11 - q10));
            int i15 = xVar.f4002v / 9;
            o(xVar, p10, floatValue, q10, 0.0f, f12, 0.0f, 1.0f, 0.0f, 0.5f, 0.5f);
            o(xVar, p11, floatValue, q11, 0.0f, f12, 0.0f, 1.0f, 0.0f, 0.5f, 0.5f);
            o(xVar, p12, floatValue, q12, 0.0f, f12, 0.0f, 1.0f, 0.0f, 0.5f, 0.5f);
            if (f13 * f12 < 0.0f) {
                tVar.a(i15);
                tVar.a(i15 + 1);
                tVar.a(i15 + 2);
            } else {
                tVar.a(i15);
                tVar.a(i15 + 2);
                tVar.a(i15 + 1);
            }
        }
    }

    public static final pe.o s(Engine engine, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        engine.getClass();
        if (f12 < 0.002f) {
            f12 = 0.002f;
        }
        float f17 = f12 + 0.0f;
        o7[] v2 = v(f12, 1.0f, f11, 1.01f - ((f14 * 1.0f) / 2.0f), f16);
        o7[] v4 = v(f12, -1.0f, f10, ((f13 * 1.0f) / 2.0f) + 1.01f, f15);
        ArrayList arrayList = new ArrayList();
        float f18 = -f17;
        arrayList.add(t(f18, 0.0f));
        arrayList.add(t(f17, 0.0f));
        arrayList.add(t(f17, 0.023399998f));
        for (int i = 5; -1 < i; i--) {
            arrayList.add(v2[i]);
        }
        for (int i10 = 0; i10 < 6; i10++) {
            arrayList.add(v4[i10]);
        }
        arrayList.add(t(f18, 0.023399998f));
        return n(engine, e0(arrayList), 0.75f, 0.07f);
    }

    public static final o7 t(float f10, float f11) {
        return new o7(f10, f11, true, 224);
    }

    public static final o7[] v(float f10, float f11, float f12, float f13, float f14) {
        double radians = (float) Math.toRadians(b9.d(f12, 0.0f, 180.0f));
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f15 = f11 * f10;
        float f16 = (-f11) * cos;
        float f17 = -sin;
        float d2 = 0.026999999f - b9.d(0.015120001f, 0.001f, 0.025999999f);
        float f18 = 0.03f / f13;
        return new o7[]{w(cos, sin, f15, f11, f14, 0.0f, 0.026999999f, 0.5f, false, 0.0f, false, 0.0f, 0.0f), w(cos, sin, f15, f11, f14, f13, 0.026999999f, 0.5f, false, 0.5f, true, f16, f17), w(cos, sin, f15, f11, f14, f13, 0.0f, 1.0f, true, 0.5f, true, f16, f17), w(cos, sin, f15, f11, f14, 0.03f, 0.0f, f18, true, 0.5f, false, 0.0f, 0.0f), w(cos, sin, f15, f11, f14, 0.03f, d2, f18, true, 0.5f, false, 0.0f, 0.0f), w(cos, sin, f15, f11, f14, 0.0f, d2, 0.0f, true, 0.5f, false, 0.0f, 0.0f)};
    }

    public static final o7 w(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z3, float f18, boolean z9, float f19, float f20) {
        return new o7((f13 * ((f15 * f10) - (f16 * f11))) + f12, 0.023399998f + f14 + (f10 * f16) + (f11 * f15), f17, z3, f18, z9, f19, f20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f5 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #3 {all -> 0x005b, blocks: (B:12:0x004a, B:16:0x01b1, B:38:0x00ee, B:39:0x00f4, B:41:0x014e, B:18:0x01f5, B:21:0x024a, B:35:0x0268, B:36:0x026b, B:47:0x01ba, B:48:0x01f4, B:20:0x0247, B:32:0x0266), top: B:11:0x004a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0276 A[FINALLY_INSNS, LOOP:1: B:51:0x0274->B:52:0x0276, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0188 -> B:14:0x018c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x019c -> B:15:0x0198). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(android.content.Context r29, m3 r30, int r31, b r32, df.p r33, ve.c r34) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.e.y(android.content.Context, m3, int, b, df.p, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0084, code lost:
    
        if (r6 == r9) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x016b -> B:14:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0178 -> B:15:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(android.content.Context r27, m3 r28, int r29, b r30, df.p r31, ve.c r32) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.e.z(android.content.Context, m3, int, b, df.p, ve.c):java.lang.Object");
    }
}