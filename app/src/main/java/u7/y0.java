package u7;
import b.a;
import c.a;
import d.a;
import f7.b;
import f7.c;
import f7.d;
import j1.b;
import k1.m0;
import q.g;
import q1.a;
import r0.j0;
import w7.y2;
import x7.f0;
import z0.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Choreographer;
import android.view.TextureView;
import com.google.android.gms.internal.ads.gl;
import wa.b9;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27051u;

    public /* synthetic */ y0(int i) {
        this.f27051u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [d, java.lang.Object, android.view.Choreographer$FrameCallback] */
    @Override // df.l
    public final Object invoke(Object obj) {
        Paint paint;
        int i;
        String str;
        long longValue;
        int i10 = 0;
        switch (this.f27051u) {
            case 0:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Paint paint2 = r1Var.e;
                paint2.setColor(-1);
                float f10 = r1Var.f26778d;
                paint2.setShadowLayer(9.0f * f10, 0.0f, 4.0f * f10, Color.argb(80, 0, 0, 0));
                Canvas canvas = r1Var.f26775a;
                RectF rectF = r1Var.f26776b;
                canvas.drawRect(rectF, paint2);
                Paint paint3 = r1Var.f26779f;
                paint3.setColor(-16777216);
                paint3.setStrokeWidth(3.8f * f10);
                canvas.drawRect(rectF, paint3);
                paint3.setStrokeWidth(f10 * 1.5f);
                RectF c10 = c(rectF, 5.5f * f10);
                canvas.drawRect(c10, paint3);
                Paint paint4 = new Paint(1);
                paint4.setColor(-16777216);
                paint4.setTextAlign(Paint.Align.CENTER);
                paint4.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
                float f11 = 10.0f * f10;
                paint4.setTextSize(f11);
                float f12 = (16.0f * f10) + c10.top;
                canvas.drawText("COMPOSITION BOOK", r1Var.f26777c, f12, paint4);
                float f13 = f11 + c10.left;
                float f14 = c10.right - f11;
                float height = c10.height() * 0.18f;
                if (height >= f11) {
                    f11 = height;
                }
                float f15 = (12.0f * f10) + f12;
                paint3.setColor(Color.argb(160, 80, 80, 80));
                paint3.setStrokeWidth(1.1f * f10);
                while (i10 < 3) {
                    float f16 = (i10 * f11) + f15;
                    if (f16 < c10.bottom - (18.0f * f10)) {
                        paint = paint3;
                        r1Var.f26775a.drawLine(f13, f16, f14, f16, paint);
                    } else {
                        paint = paint3;
                    }
                    i10++;
                    f13 = f13;
                    paint3 = paint;
                }
                float f17 = f13;
                Paint paint5 = new Paint(1);
                paint5.setColor(-16777216);
                paint5.setTextAlign(Paint.Align.LEFT);
                paint5.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
                paint5.setTextSize(5.2f * f10);
                canvas.drawText("100 SHEETS", f17, c10.bottom - (13.0f * f10), paint5);
                canvas.drawText("9.75 X 7.5 IN / 24.76 X 19.0 CM", f17, c10.bottom - (f10 * 6.0f), paint5);
                return pe.z.f22715a;
            case 1:
                r1 r1Var2 = (r1) obj;
                r1Var2.getClass();
                RectF rectF2 = r1Var2.f26776b;
                Path E = e.E(rectF2);
                Paint paint6 = r1Var2.e;
                paint6.setColor(-1);
                float f18 = r1Var2.f26778d;
                float f19 = 10.0f * f18;
                paint6.setShadowLayer(f19, 0.0f, 5.0f * f18, Color.argb(85, 0, 0, 0));
                Canvas canvas2 = r1Var2.f26775a;
                canvas2.drawPath(E, paint6);
                Paint paint7 = r1Var2.f26779f;
                paint7.setColor(-16777216);
                paint7.setStrokeWidth(3.8f * f18);
                canvas2.drawPath(E, paint7);
                Path E2 = e.E(c(rectF2, 6.5f * f18));
                paint7.setStrokeWidth(1.5f * f18);
                canvas2.drawPath(E2, paint7);
                Paint paint8 = new Paint(1);
                paint8.setColor(-16777216);
                paint8.setTextAlign(Paint.Align.CENTER);
                paint8.setTypeface(Typeface.create(Typeface.SERIF, 1));
                paint8.setTextSize(f19);
                float f20 = 12.0f * f18;
                float height2 = (rectF2.height() * 0.28f) + rectF2.top + f20;
                float f21 = r1Var2.f26777c;
                canvas2.drawText("COMPOSITION", f21, height2, paint8);
                canvas2.drawText("BOOK", f21, f20 + height2, paint8);
                float width = (rectF2.width() * 0.5f) / 2.0f;
                float f22 = f21 - width;
                float f23 = f21 + width;
                float centerY = (8.0f * f18) + rectF2.centerY();
                float f24 = (14.0f * f18) + centerY;
                paint7.setColor(Color.argb(180, 50, 50, 50));
                paint7.setStrokeWidth(f18 * 1.3f);
                r1Var2.f26775a.drawLine(f22, centerY, f23, centerY, paint7);
                r1Var2.f26775a.drawLine(f22, f24, f23, f24, paint7);
                return pe.z.f22715a;
            case 2:
                r1 r1Var3 = (r1) obj;
                r1Var3.getClass();
                Paint paint9 = r1Var3.e;
                paint9.setColor(Color.argb(255, 30, 30, 30));
                float f25 = r1Var3.f26778d;
                paint9.setShadowLayer(10.0f * f25, 0.0f, 5.0f * f25, Color.argb(120, 0, 0, 0));
                Canvas canvas3 = r1Var3.f26775a;
                RectF rectF3 = r1Var3.f26776b;
                canvas3.drawRect(rectF3, paint9);
                Paint paint10 = r1Var3.f26779f;
                paint10.setColor(z0.f27081a);
                paint10.setStrokeWidth(4.0f * f25);
                canvas3.drawRect(c(rectF3, f25 * 6.0f), paint10);
                return pe.z.f22715a;
            case 3:
                ((r1) obj).getClass();
                return pe.z.f22715a;
            case 4:
                b bVar = (b) obj;
                bVar.getClass();
                return a(bVar, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, !bVar.i, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194047);
            case 5:
                c cVar = (c) obj;
                cVar.getClass();
                return a(cVar, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, !cVar.f25980n, false, null, 57343);
            case 6:
                d dVar = (d) obj;
                dVar.getClass();
                return a(dVar, null, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, !dVar.f26041k, false, null, false, false, null, null, 0, 0.0f, 523263);
            case 7:
                c8 c8Var = (c8) obj;
                c8Var.getClass();
                return c8Var.f26032x;
            case 8:
                b bVar2 = (b) obj;
                bVar2.getClass();
                return bVar2.f25917a;
            case 9:
                d dVar2 = (d) obj;
                dVar2.getClass();
                return dVar2.f26033a;
            case 10:
                c cVar2 = (c) obj;
                cVar2.getClass();
                return cVar2.f25969a;
            case 11:
                ((Boolean) obj).getClass();
                return pe.z.f22715a;
            case 12:
                b bVar3 = (b) obj;
                bVar3.getClass();
                return a(bVar3, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, null, null, !bVar3.f25929o, 0.0f, 0.0f, 0.0f, 0.0f, null, 4177919);
            case 13:
                fg.h hVar = (fg.h) obj;
                hVar.getClass();
                hVar.f16978c = true;
                return pe.z.f22715a;
            case 14:
                b bVar4 = (b) obj;
                bVar4.getClass();
                return a(bVar4, null, "empty_frame", 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194301);
            case 15:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                return a(q1Var, 0, false, !q1Var.f26745d, null, 23);
            case 16:
                b bVar5 = (b) obj;
                bVar5.getClass();
                return a(bVar5, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, !bVar5.f25924j, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4193791);
            case 17:
                c cVar3 = (c) obj;
                cVar3.getClass();
                return a(cVar3, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, !cVar3.f25981o, null, 49151);
            case 18:
                d dVar3 = (d) obj;
                dVar3.getClass();
                return a(dVar3, null, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, true ^ dVar3.f26042l, null, false, false, null, null, 0, 0.0f, 522239);
            case 19:
                q1 q1Var2 = (q1) obj;
                q1Var2.getClass();
                return a(q1Var2, 0, !q1Var2.f26744c, false, null, 27);
            case 20:
                f0.f(((Float) obj).floatValue());
                return pe.z.f22715a;
            case gl.zzm /* 21 */:
                f0.f(((Float) obj).floatValue());
                return pe.z.f22715a;
            case 22:
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                textureView.setOpaque(false);
                return textureView;
            case 23:
                fg.h hVar2 = (fg.h) obj;
                hVar2.getClass();
                hVar2.f16978c = true;
                hVar2.f16976a = false;
                return pe.z.f22715a;
            case 24:
                ((Float) obj).getClass();
                return Float.valueOf(0.016f);
            case 25:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.h(1.15f);
                m0Var.i(1.15f);
                m0Var.j(12.0f);
                return pe.z.f22715a;
            case 26:
                ((Integer) obj).getClass();
                return Boolean.FALSE;
            case 27:
                ((j0) obj).getClass();
                synchronized (b.f16774a) {
                    b.f16775b = System.currentTimeMillis();
                    b.f16776c = 0;
                    b.f16777d = 0;
                    b.e = 0;
                    b.f16778f.clear();
                }
                c.o("canvas");
                if (!wa.n6.f29759a) {
                    int i11 = 20;
                    try {
                        qd.a a10 = ((qd.h) bc.g.c().b(qd.h.class)).a();
                        a10.getClass();
                        rd.m c11 = a10.c("perf_sampling_percent");
                        int i12 = c11.f24742a;
                        if (i12 != 0) {
                            if (i12 == 0) {
                                longValue = 0;
                            } else {
                                if (i12 == 0) {
                                    str = "";
                                } else {
                                    str = c11.f24743b;
                                }
                                String trim = str.trim();
                                try {
                                    longValue = Long.valueOf(trim).longValue();
                                } catch (NumberFormatException e) {
                                    throw new IllegalArgumentException("[Value: " + trim + "] cannot be converted to a long.", e);
                                }
                            }
                            i11 = b9.e((int) longValue, 0, 100);
                        }
                    } catch (Exception unused) {
                    }
                    if (i11 > 0) {
                        jf.d i13 = b9.i(0, 100);
                        gf.c cVar4 = gf.d.f17754u;
                        i13.getClass();
                        try {
                            gf.c cVar5 = gf.d.f17754u;
                            if (!i13.isEmpty()) {
                                int i14 = i13.f19190v;
                                int i15 = i13.f19189u;
                                if (i14 < Integer.MAX_VALUE) {
                                    i = gf.d.f17755v.e(i15, i14 + 1);
                                } else if (i15 > Integer.MIN_VALUE) {
                                    i = gf.d.f17755v.e(i15 - 1, i14) + 1;
                                } else {
                                    i = gf.d.f17755v.c();
                                }
                            } else {
                                g5.g(i13, "Cannot get random in empty range: ");
                                i = 0;
                            }
                            if (i < i11) {
                                wa.n6.f29759a = true;
                                wa.n6.f29760b = 0;
                                wa.n6.f29761c = 0L;
                                wa.n6.f29762d = 0L;
                                wa.n6.e = 0.0f;
                                Object obj2 = new Object();
                                wa.n6.f29763f = obj2;
                                Choreographer.getInstance().postFrameCallback(obj2);
                                Log.d("PerfSampler", "Ventana de medida iniciada (muestreo " + i11 + "%)");
                            }
                        } catch (IllegalArgumentException e8) {
                            l4.a.h(e8.getMessage());
                            return null;
                        }
                    }
                }
                return new y2(0);
            case 28:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            default:
                return (b) obj;
        }
    }
}