package u7;
import c.b;
import j6.c;
import l.a;
import l.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.Base64;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public abstract class t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final fg.s f26895a = wa.a(new y0(23));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    public static final List a(String str) {
        qe.s kVar;
        qe.s sVar = qe.s.f24023u;
        if (str != null && !mf.f.u(str)) {
            try {
                byte[] decode = Base64.decode(str, 2);
                decode.getClass();
                String str2 = new String(decode, mf.a.f20798a);
                fg.s sVar2 = f26895a;
                ag.a serializer = s6.Companion.serializer();
                serializer.getClass();
                kVar = (List) sVar2.a(new eg.c(serializer), str2);
            } catch (Throwable th) {
                kVar = new pe.k(th);
            }
            if (pe.a(kVar) == null) {
                sVar = kVar;
            }
            return sVar;
        }
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [pe.k] */
    public static final void b(Context context, String str, List list, Bitmap bitmap) {
        float d2;
        float f10;
        Bitmap kVar;
        Context context2 = context;
        context2.getClass();
        str.getClass();
        list.getClass();
        if (!list.isEmpty()) {
            Canvas canvas = new Canvas(bitmap);
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f11 = 1.01f / width;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s6 a10 = a((s6) it.next());
                String str2 = a10.e;
                if (kotlin.jvm.internal.a(str2, "front") || kotlin.jvm.internal.a(str2, "strap")) {
                    t1 e = e(d(context2, str, a10.f26861b));
                    if (e != null) {
                        if (kotlin.jvm.internal.a(str2, "strap")) {
                            d2 = 0.8f * width;
                        } else {
                            d2 = b9.d(a10.f26864f, 0.0f, 1.0f) * width;
                        }
                        float f12 = d2;
                        float d10 = b9.d(a10.f26865g, 0.0f, 1.0f) * height;
                        float d11 = b9.d(a10.i, 0.05f, 20.0f) / f11;
                        Path path = new Path();
                        path.setFillType(Path.FillType.WINDING);
                        float[] fArr = e.f26878a;
                        short[] sArr = e.f26881d;
                        int i = 0;
                        while (true) {
                            int i10 = i + 2;
                            float[] fArr2 = fArr;
                            f10 = width;
                            if (i10 >= sArr.length) {
                                break;
                            }
                            int i11 = (sArr[i] & 65535) * 3;
                            int i12 = (sArr[i + 1] & 65535) * 3;
                            int i13 = (sArr[i10] & 65535) * 3;
                            float f13 = fArr2[i12];
                            float f14 = fArr2[i11];
                            int i14 = i13 + 1;
                            float f15 = fArr2[i14];
                            float f16 = fArr2[i11 + 1];
                            float f17 = (f15 - f16) * (f13 - f14);
                            int i15 = i12 + 1;
                            if (f17 - ((fArr2[i13] - f14) * (fArr2[i15] - f16)) > 0.0f) {
                                path.moveTo(f14, f16);
                                path.lineTo(fArr2[i12], fArr2[i15]);
                                path.lineTo(fArr2[i13], fArr2[i14]);
                                path.close();
                            }
                            i += 3;
                            fArr = fArr2;
                            width = f10;
                        }
                        Paint paint = new Paint(1);
                        c cVar = e.e;
                        float[] fArr3 = (float[]) cVar.f18914v;
                        float f18 = fArr3[0];
                        float[] fArr4 = (float[]) cVar.f18915w;
                        float f19 = fArr4[0];
                        float f20 = f18 - f19;
                        float f21 = fArr3[1];
                        float f22 = fArr4[1];
                        float f23 = f21 + f22;
                        float f24 = f19 * 2.0f;
                        float f25 = 2.0f * f22;
                        String str3 = a10.f26862c;
                        Bitmap bitmap2 = null;
                        if (str3 != null) {
                            try {
                                kVar = BitmapFactory.decodeFile(d(context2, str, str3).getAbsolutePath());
                            } catch (Throwable th) {
                                kVar = new pe.k(th);
                            }
                            if (!(kVar instanceof pe.k)) {
                                bitmap2 = kVar;
                            }
                            bitmap2 = bitmap2;
                        }
                        Bitmap bitmap3 = bitmap2;
                        canvas.save();
                        canvas.translate(f12, d10);
                        canvas.rotate(-a10.f26866h);
                        canvas.scale(d11, -d11);
                        paint.setColor(Color.argb(70, 0, 0, 0));
                        canvas.save();
                        canvas.translate(0.006f, -0.008f);
                        canvas.drawPath(path, paint);
                        canvas.restore();
                        if (bitmap3 != null) {
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            matrix.setScale(f24 / bitmap3.getWidth(), (-f25) / bitmap3.getHeight());
                            matrix.postTranslate(f20, f23);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                        } else {
                            paint.setColor(a10.f26867j);
                        }
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawPath(path, paint);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(0.6f * f11);
                        canvas.drawPath(path, paint);
                        canvas.restore();
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                        }
                        context2 = context;
                        width = f10;
                    }
                }
            }
        }
    }

    public static final String c(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        ag.a serializer = s6.Companion.serializer();
        serializer.getClass();
        byte[] bytes = f26895a.b(new eg.c(serializer), list).getBytes(mf.a.f20798a);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 2);
        encodeToString.getClass();
        return encodeToString;
    }

    public static final File d(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        return new File(v7.b(context), a.l("orn_", str, ".", new File(str2).getName()));
    }

    public static final t1 e(File file) {
        Object kVar;
        ByteBuffer order;
        byte[] bArr;
        Object obj = null;
        try {
            order = ByteBuffer.wrap(af.e(file)).order(ByteOrder.LITTLE_ENDIAN);
            bArr = new byte[8];
            order.get(bArr);
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (new String(bArr, mf.a.f20799b).equals("SCRMESH1")) {
            int i = order.getInt();
            int i10 = order.getInt();
            if (i > 0 && i <= 65535 && i10 > 0 && i10 % 3 == 0) {
                int i11 = i * 3;
                float[] fArr = new float[i11];
                float[] fArr2 = new float[i11];
                float[] fArr3 = new float[i * 2];
                float f10 = -3.4028235E38f;
                float f11 = -3.4028235E38f;
                float f12 = Float.MAX_VALUE;
                float f13 = Float.MAX_VALUE;
                float f14 = Float.MAX_VALUE;
                float f15 = -3.4028235E38f;
                for (int i12 = 0; i12 < i; i12++) {
                    float f16 = order.getFloat();
                    float f17 = order.getFloat();
                    float f18 = order.getFloat();
                    int i13 = i12 * 3;
                    fArr[i13] = f16;
                    int i14 = i13 + 1;
                    fArr[i14] = f17;
                    int i15 = i13 + 2;
                    fArr[i15] = f18;
                    fArr2[i13] = order.getFloat();
                    fArr2[i14] = order.getFloat();
                    fArr2[i15] = order.getFloat();
                    int i16 = i12 * 2;
                    fArr3[i16] = order.getFloat();
                    fArr3[i16 + 1] = order.getFloat();
                    if (f16 < f12) {
                        f12 = f16;
                    }
                    if (f17 < f13) {
                        f13 = f17;
                    }
                    if (f18 < f14) {
                        f14 = f18;
                    }
                    if (f16 > f10) {
                        f10 = f16;
                    }
                    if (f17 > f15) {
                        f15 = f17;
                    }
                    if (f18 > f11) {
                        f11 = f18;
                    }
                }
                float f19 = f15;
                short[] sArr = new short[i10];
                for (int i17 = 0; i17 < i10; i17++) {
                    sArr[i17] = order.getShort();
                }
                kVar = new t1(fArr, fArr2, fArr3, sArr, new c((f12 + f10) / 2.0f, (f13 + f19) / 2.0f, (f14 + f11) / 2.0f, ((f10 - f12) / 2.0f) + 0.002f, ((f19 - f13) / 2.0f) + 0.002f, ((f11 - f14) / 2.0f) + 0.002f));
                if (!(kVar instanceof pe.k)) {
                    obj = kVar;
                }
                return (t1) obj;
            }
        }
        return null;
    }
}
