package m2;
import m.h;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.gl;
import java.util.List;
import u7.r1;
import u7.z0;
import wa.b9;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20475u;

    public /* synthetic */ f0(y2.e eVar) {
        this.f20475u = 12;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        x2.r rVar;
        Boolean bool;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i = this.f20475u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                obj.getClass();
                return new x2.e(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                if (obj2 != null) {
                    rVar = (x2.r) obj2;
                } else {
                    rVar = null;
                }
                rVar.getClass();
                int i10 = rVar.f30073a;
                Object obj3 = list.get(1);
                if (obj3 != null) {
                    bool = (Boolean) obj3;
                } else {
                    bool = null;
                }
                bool.getClass();
                return new x2.s(i10, bool.booleanValue());
            case 2:
                if (((Character) obj).charValue() == '-') {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 3:
                if (((Character) obj).charValue() == '-') {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 4:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 5:
                if (((Character) obj).charValue() == ':') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 6:
                if (((Character) obj).charValue() == ':') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 7:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    z13 = true;
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 8:
                ((Integer) obj).intValue();
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            case 9:
                ((Integer) obj).getClass();
                return zVar;
            case 10:
                ((v7.n) obj).getClass();
                return zVar;
            case 11:
                te.e eVar = (te.e) obj;
                if (!(eVar instanceof pf.v)) {
                    return null;
                }
                return (pf.v) eVar;
            case 12:
                throw p.a.f(obj);
            case 13:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 14:
                b2.l0 l0Var = (b2.l0) obj;
                l0Var.getClass();
                l0Var.b();
                Float valueOf = Float.valueOf(0.4f);
                long j10 = k1.r.f19520k;
                pe.j jVar = new pe.j(valueOf, new k1.r(j10));
                Float valueOf2 = Float.valueOf(1.0f);
                long j11 = k1.r.f19513b;
                m1.d.y0(l0Var, eb.w.j(new pe.j[]{jVar, new pe.j(valueOf2, new k1.r(k1.r.c(j11, 0.85f)))}, 0L, Float.intBitsToFloat((int) (l0Var.f1533u.e() >> 32)) / 2.0f, 10), 0.0f, 0L, 0.0f, null, 126);
                m1.d.y0(l0Var, eb.w.h(qe.h(new k1.r(k1.r.c(j11, 0.8f)), new k1.r(j10)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r5.e() & 4294967295L)) / 1.5f) & 4294967295L), 8), 0.0f, 0L, 0.0f, new m1.h(l0Var.l0((float) 2.5d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                m1.d.y0(l0Var, eb.w.h(qe.h(new k1.r(j10), new k1.r(k1.r.c(k1.r.f19515d, 0.6f))), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r5.e() & 4294967295L)) / 3.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r5.e() & 4294967295L))) & 4294967295L), 8), 0.0f, 0L, 0.0f, new m1.h(l0Var.l0(2), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                return zVar;
            case 15:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Paint paint = r1Var.e;
                paint.setColor(-1);
                float f10 = r1Var.f26778d;
                float f11 = f10 * 8.0f;
                paint.setShadowLayer(f11, 0.0f, f10 * 4.0f, Color.argb(80, 0, 0, 0));
                Canvas canvas = r1Var.f26775a;
                RectF rectF = r1Var.f26776b;
                float f12 = 12.0f * f10;
                canvas.drawRoundRect(rectF, f12, f12, paint);
                Paint paint2 = r1Var.f26779f;
                paint2.setColor(Color.argb(255, 200, 200, 200));
                paint2.setStrokeWidth(f10 * 2.0f);
                float f13 = f10 * 6.0f;
                canvas.drawRoundRect(z0.c(rectF, f11), f13, f13, paint2);
                return zVar;
            case 16:
                r1 r1Var2 = (r1) obj;
                r1Var2.getClass();
                Paint paint3 = r1Var2.e;
                paint3.setColor(Color.argb(255, 245, 240, 225));
                float f14 = r1Var2.f26778d;
                paint3.setShadowLayer(f14 * 8.0f, 0.0f, 3.0f * f14, Color.argb(100, 0, 0, 0));
                RectF rectF2 = r1Var2.f26776b;
                float f15 = f14 * 16.0f;
                Path path = new Path();
                path.moveTo(rectF2.left + f15, rectF2.top);
                path.lineTo(rectF2.right - f15, rectF2.top);
                path.lineTo(rectF2.right, rectF2.top + f15);
                path.lineTo(rectF2.right, rectF2.bottom - f15);
                path.lineTo(rectF2.right - f15, rectF2.bottom);
                path.lineTo(rectF2.left + f15, rectF2.bottom);
                path.lineTo(rectF2.left, rectF2.bottom - f15);
                path.lineTo(rectF2.left, rectF2.top + f15);
                path.close();
                Canvas canvas2 = r1Var2.f26775a;
                canvas2.drawPath(path, paint3);
                Paint paint4 = r1Var2.f26779f;
                paint4.setColor(-16777216);
                paint4.setStrokeWidth(f14 * 2.0f);
                canvas2.drawPath(path, paint4);
                paint4.setStrokeWidth(f14 * 1.0f);
                canvas2.save();
                canvas2.scale(0.96f, 0.94f, r1Var2.f26777c, rectF2.centerY());
                canvas2.drawPath(path, paint4);
                canvas2.restore();
                return zVar;
            case 17:
                r1 r1Var3 = (r1) obj;
                r1Var3.getClass();
                Paint paint5 = r1Var3.e;
                paint5.setColor(Color.argb(255, 90, 50, 30));
                float f16 = r1Var3.f26778d;
                float f17 = 12.0f * f16;
                paint5.setShadowLayer(f17, 0.0f, f16 * 6.0f, Color.argb(160, 0, 0, 0));
                Canvas canvas3 = r1Var3.f26775a;
                RectF rectF3 = r1Var3.f26776b;
                float f18 = f16 * 20.0f;
                canvas3.drawRoundRect(rectF3, f18, f18, paint5);
                Paint paint6 = r1Var3.f26779f;
                paint6.setColor(Color.argb(200, 210, 180, 140));
                paint6.setStrokeWidth(3.0f * f16);
                paint6.setPathEffect(new DashPathEffect(new float[]{f16 * 10.0f, f16 * 8.0f}, 0.0f));
                canvas3.drawRoundRect(z0.c(rectF3, f17), f17, f17, paint6);
                paint6.setPathEffect(null);
                return zVar;
            case 18:
                r1 r1Var4 = (r1) obj;
                r1Var4.getClass();
                Paint paint7 = r1Var4.e;
                paint7.setColor(Color.argb(255, 250, 250, 250));
                float f19 = r1Var4.f26778d;
                paint7.setShadowLayer(f19 * 6.0f, 0.0f, f19 * 4.0f, Color.argb(90, 0, 0, 0));
                float f20 = 24.0f * f19;
                float f21 = f19 * 16.0f;
                RectF rectF4 = r1Var4.f26776b;
                float centerY = rectF4.centerY();
                Path path2 = new Path();
                path2.moveTo(rectF4.left - f20, rectF4.top);
                path2.lineTo(rectF4.right + f20, rectF4.top);
                path2.lineTo((rectF4.right + f20) - f21, centerY);
                path2.lineTo(rectF4.right + f20, rectF4.bottom);
                path2.lineTo(rectF4.left - f20, rectF4.bottom);
                path2.lineTo((rectF4.left - f20) + f21, centerY);
                path2.close();
                r1Var4.f26775a.drawPath(path2, paint7);
                return zVar;
            case 19:
                r1 r1Var5 = (r1) obj;
                r1Var5.getClass();
                Paint paint8 = r1Var5.e;
                paint8.setColor(Color.argb(255, 200, 160, 120));
                float f22 = r1Var5.f26778d;
                paint8.setShadowLayer(f22 * 10.0f, 0.0f, 5.0f * f22, Color.argb(120, 0, 0, 0));
                float f23 = 30.0f * f22;
                Path path3 = new Path();
                RectF rectF5 = r1Var5.f26776b;
                path3.moveTo(rectF5.left + f23, rectF5.top);
                path3.lineTo(rectF5.right, rectF5.top);
                path3.lineTo(rectF5.right, rectF5.bottom);
                path3.lineTo(rectF5.left + f23, rectF5.bottom);
                path3.lineTo(rectF5.left, rectF5.bottom - f23);
                path3.lineTo(rectF5.left, rectF5.top + f23);
                path3.close();
                Canvas canvas4 = r1Var5.f26775a;
                canvas4.drawPath(path3, paint8);
                Paint paint9 = new Paint(1);
                paint9.setColor(Color.argb(200, 50, 50, 50));
                canvas4.drawCircle((f22 * 20.0f) + rectF5.left, rectF5.centerY(), f22 * 8.0f, paint9);
                return zVar;
            case 20:
                r1 r1Var6 = (r1) obj;
                r1Var6.getClass();
                Paint paint10 = r1Var6.e;
                paint10.setColor(Color.argb(245, 10, 10, 10));
                float f24 = r1Var6.f26778d;
                paint10.setShadowLayer(15.0f * f24, 0.0f, f24 * 8.0f, Color.argb(100, 0, 0, 0));
                r1Var6.f26775a.drawRect(r1Var6.f26776b, paint10);
                return zVar;
            case gl.zzm /* 21 */:
                r1 r1Var7 = (r1) obj;
                r1Var7.getClass();
                Paint paint11 = r1Var7.f26779f;
                int i11 = z0.f27081a;
                paint11.setColor(i11);
                float f25 = r1Var7.f26778d;
                paint11.setStrokeWidth(3.0f * f25);
                Canvas canvas5 = r1Var7.f26775a;
                RectF rectF6 = r1Var7.f26776b;
                canvas5.drawRect(rectF6, paint11);
                paint11.setStrokeWidth(1.0f * f25);
                canvas5.drawRect(z0.c(rectF6, f25 * 8.0f), paint11);
                Paint paint12 = new Paint(1);
                paint12.setColor(i11);
                float f26 = f25 * 6.0f;
                canvas5.drawCircle(rectF6.left, rectF6.top, f26, paint12);
                canvas5.drawCircle(rectF6.right, rectF6.top, f26, paint12);
                canvas5.drawCircle(rectF6.left, rectF6.bottom, f26, paint12);
                canvas5.drawCircle(rectF6.right, rectF6.bottom, f26, paint12);
                return zVar;
            case 22:
                r1 r1Var8 = (r1) obj;
                r1Var8.getClass();
                Paint paint13 = r1Var8.e;
                paint13.setColor(Color.argb(255, 220, 220, 225));
                float f27 = r1Var8.f26778d;
                float f28 = f27 * 4.0f;
                paint13.setShadowLayer(f27 * 8.0f, f27 * 2.0f, f28, Color.argb(130, 0, 0, 0));
                Canvas canvas6 = r1Var8.f26775a;
                RectF rectF7 = r1Var8.f26776b;
                canvas6.drawRoundRect(rectF7, f28, f28, paint13);
                Paint paint14 = new Paint(1);
                paint14.setColor(Color.argb(255, 150, 150, 155));
                float f29 = f27 * 10.0f;
                float f30 = f27 * 3.0f;
                canvas6.drawCircle(rectF7.left + f29, rectF7.top + f29, f30, paint14);
                canvas6.drawCircle(rectF7.right - f29, rectF7.top + f29, f30, paint14);
                canvas6.drawCircle(rectF7.left + f29, rectF7.bottom - f29, f30, paint14);
                canvas6.drawCircle(rectF7.right - f29, rectF7.bottom - f29, f30, paint14);
                return zVar;
            case 23:
                r1 r1Var9 = (r1) obj;
                r1Var9.getClass();
                Paint paint15 = r1Var9.e;
                paint15.setColor(Color.argb(230, 255, 255, 255));
                float f31 = r1Var9.f26778d;
                paint15.setShadowLayer(f31 * 20.0f, 0.0f, f31 * 10.0f, Color.argb(60, 0, 0, 0));
                Canvas canvas7 = r1Var9.f26775a;
                RectF rectF8 = r1Var9.f26776b;
                float f32 = f31 * 16.0f;
                canvas7.drawRoundRect(rectF8, f32, f32, paint15);
                Paint paint16 = r1Var9.f26779f;
                paint16.setColor(Color.argb(150, 255, 255, 255));
                paint16.setStrokeWidth(f31 * 4.0f);
                RectF c10 = z0.c(rectF8, (-2.0f) * f31);
                float f33 = f31 * 18.0f;
                canvas7.drawRoundRect(c10, f33, f33, paint16);
                return zVar;
            case 24:
                r1 r1Var10 = (r1) obj;
                r1Var10.getClass();
                Canvas canvas8 = r1Var10.f26775a;
                Paint paint17 = r1Var10.e;
                float f34 = r1Var10.f26778d;
                Paint paint18 = r1Var10.f26779f;
                RectF rectF9 = r1Var10.f26776b;
                float height = rectF9.height();
                float width = rectF9.width() - (((height - ((height * 2.0f) * 0.13f)) / 2.0f) * 2.0f);
                if (width < 0.0f) {
                    width = 0.0f;
                }
                int e = b9.e(ff.a.b(width / (height * 0.62f)), 2, 12);
                Path D = u7.e.D(rectF9, e);
                paint17.setColor(Color.argb(255, 247, 198, 208));
                paint17.setShadowLayer(f34 * 9.0f, 0.0f, f34 * 4.0f, Color.argb(70, 0, 0, 0));
                canvas8.drawPath(D, paint17);
                paint18.setColor(Color.argb(255, 230, 147, 168));
                paint18.setStrokeWidth(2.5f * f34);
                canvas8.drawPath(D, paint18);
                paint18.setStrokeWidth(f34 * 1.6f);
                paint18.setPathEffect(new DashPathEffect(new float[]{f34 * 7.0f, f34 * 6.0f}, 0.0f));
                canvas8.drawPath(u7.e.D(z0.c(rectF9, f34 * 8.0f), e), paint18);
                paint18.setPathEffect(null);
                return zVar;
            case 25:
                r1 r1Var11 = (r1) obj;
                r1Var11.getClass();
                RectF rectF10 = r1Var11.f26776b;
                Path f35 = u7.e.f(rectF10, 0.1f, 0.16f, 0.22f);
                Paint paint19 = r1Var11.e;
                paint19.setColor(Color.argb(255, 233, 229, 219));
                float f36 = r1Var11.f26778d;
                float f37 = f36 * 9.0f;
                paint19.setShadowLayer(f37, 0.0f, f36 * 4.0f, Color.argb(70, 0, 0, 0));
                Canvas canvas9 = r1Var11.f26775a;
                canvas9.drawPath(f35, paint19);
                Paint paint20 = r1Var11.f26779f;
                paint20.setColor(Color.argb(255, 199, 191, 176));
                paint20.setStrokeWidth(f36 * 2.0f);
                canvas9.drawPath(f35, paint20);
                paint20.setStrokeWidth(1.4f * f36);
                float f38 = f36 * 6.0f;
                paint20.setPathEffect(new DashPathEffect(new float[]{f38, f38}, 0.0f));
                canvas9.drawPath(u7.e.f(z0.c(rectF10, f37), 0.1f, 0.16f, 0.22f), paint20);
                paint20.setPathEffect(null);
                return zVar;
            case 26:
                r1 r1Var12 = (r1) obj;
                r1Var12.getClass();
                RectF rectF11 = r1Var12.f26776b;
                Path f39 = u7.e.f(rectF11, 0.15f, 0.22f, 0.18f);
                Paint paint21 = r1Var12.e;
                paint21.setColor(Color.argb(255, 251, 220, 213));
                float f40 = r1Var12.f26778d;
                float f41 = f40 * 10.0f;
                paint21.setShadowLayer(f41, 0.0f, f40 * 4.0f, Color.argb(75, 0, 0, 0));
                Canvas canvas10 = r1Var12.f26775a;
                canvas10.drawPath(f39, paint21);
                Paint paint22 = r1Var12.f26779f;
                paint22.setColor(Color.argb(255, 201, 154, 91));
                paint22.setStrokeWidth(2.5f * f40);
                canvas10.drawPath(f39, paint22);
                paint22.setStrokeWidth(f40 * 1.6f);
                paint22.setPathEffect(new DashPathEffect(new float[]{8.0f * f40, f40 * 7.0f}, 0.0f));
                canvas10.drawPath(u7.e.f(z0.c(rectF11, f41), 0.15f, 0.22f, 0.18f), paint22);
                paint22.setPathEffect(null);
                return zVar;
            case 27:
                r1 r1Var13 = (r1) obj;
                r1Var13.getClass();
                RectF rectF12 = r1Var13.f26776b;
                Path l0 = u7.e.l0(rectF12);
                Paint paint23 = r1Var13.e;
                paint23.setColor(Color.argb(255, 233, 230, 222));
                float f42 = r1Var13.f26778d;
                float f43 = f42 * 9.0f;
                paint23.setShadowLayer(f43, 0.0f, f42 * 4.0f, Color.argb(70, 0, 0, 0));
                Canvas canvas11 = r1Var13.f26775a;
                canvas11.drawPath(l0, paint23);
                Paint paint24 = r1Var13.f26779f;
                paint24.setColor(Color.argb(255, 176, 24, 74));
                paint24.setStrokeWidth(3.0f * f42);
                canvas11.drawPath(l0, paint24);
                paint24.setStrokeWidth(f42 * 1.6f);
                canvas11.drawPath(u7.e.l0(z0.c(rectF12, f43)), paint24);
                return zVar;
            case 28:
                r1 r1Var14 = (r1) obj;
                r1Var14.getClass();
                RectF rectF13 = r1Var14.f26776b;
                Path Y = u7.e.Y(rectF13);
                Paint paint25 = r1Var14.e;
                paint25.setColor(Color.argb(255, 240, 201, 180));
                float f44 = r1Var14.f26778d;
                paint25.setShadowLayer(f44 * 9.0f, 0.0f, f44 * 4.0f, Color.argb(70, 0, 0, 0));
                Canvas canvas12 = r1Var14.f26775a;
                canvas12.drawPath(Y, paint25);
                Paint paint26 = r1Var14.f26779f;
                paint26.setColor(Color.argb(255, 201, 143, FacebookMediationAdapter.ERROR_NULL_CONTEXT));
                paint26.setStrokeWidth(2.2f * f44);
                canvas12.drawPath(Y, paint26);
                paint26.setStrokeWidth(1.2f * f44);
                canvas12.drawPath(u7.e.Y(z0.c(rectF13, f44 * 7.0f)), paint26);
                return zVar;
            default:
                r1 r1Var15 = (r1) obj;
                r1Var15.getClass();
                RectF rectF14 = r1Var15.f26776b;
                Path n02 = u7.e.n0(rectF14);
                Paint paint27 = r1Var15.e;
                paint27.setColor(Color.argb(255, 252, 250, 235));
                float f45 = r1Var15.f26778d;
                paint27.setShadowLayer(f45 * 10.0f, 0.0f, 5.0f * f45, Color.argb(85, 0, 0, 0));
                Canvas canvas13 = r1Var15.f26775a;
                canvas13.drawPath(n02, paint27);
                Paint paint28 = r1Var15.f26779f;
                paint28.setColor(Color.argb(255, 25, 25, 25));
                paint28.setStrokeWidth(3.5f * f45);
                canvas13.drawPath(n02, paint28);
                Path n03 = u7.e.n0(z0.c(rectF14, 7.5f * f45));
                float f46 = f45 * 1.6f;
                paint28.setStrokeWidth(f46);
                paint28.setColor(Color.argb(220, 50, 50, 50));
                paint28.setPathEffect(new DashPathEffect(new float[]{6.5f * f45, 5.5f * f45}, 0.0f));
                canvas13.drawPath(n03, paint28);
                paint28.setPathEffect(null);
                float width2 = rectF14.width() * 0.52f;
                float f47 = r1Var15.f26777c;
                float f48 = width2 / 2.0f;
                float f49 = f47 - f48;
                float f50 = f47 + f48;
                float f51 = (f45 * 16.0f) / 2.0f;
                float centerY2 = rectF14.centerY() - f51;
                float centerY3 = rectF14.centerY() + f51;
                paint28.setColor(Color.argb(190, 40, 40, 40));
                paint28.setStrokeWidth(f46);
                r1Var15.f26775a.drawLine(f49, centerY2, f50, centerY2, paint28);
                r1Var15.f26775a.drawLine(f49, centerY3, f50, centerY3, paint28);
                return zVar;
        }
    }

    public /* synthetic */ f0(int i) {
        this.f20475u = i;
    }
}
