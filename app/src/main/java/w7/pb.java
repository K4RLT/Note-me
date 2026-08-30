package w7;
import d.f;
import d1.o;
import d1.r;
import k.a;
import k1.b;
import k1.l0;
import k1.s;
import m1.d;
import r0.l;
import r0.m;
import r0.q1;
import r0.v0;
import r0.y;
import y2.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class pb {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28924a = new HashMap();

    public static final void a(final int i, final String str, final float f10, final s sVar, r rVar, float f11, float f12, float f13, long j10, m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        long j11;
        int i15;
        boolean z3;
        String str2;
        final r rVar2;
        final float f14;
        final float f15;
        final float f16;
        q1 t3;
        df.p pVar;
        boolean z9;
        float f17;
        float f18;
        float f19;
        long j12;
        Resources resources;
        BitmapFactory.Options options;
        boolean z10;
        boolean z11;
        ColorFilter colorFilter;
        boolean z12;
        str.getClass();
        r rVar3 = (r) mVar;
        rVar3.c0(1041494628);
        if (rVar3.d(i)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i16 = i10 | i12;
        if (rVar3.f(str)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i17 = i16 | i13;
        if (rVar3.f(sVar)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i18 = i17 | i14;
        int i19 = 14376960 | i18;
        int i20 = i11 & 256;
        if (i20 != 0) {
            i19 = 115040256 | i18;
            j11 = j10;
        } else {
            j11 = j10;
            if ((i10 & 100663296) == 0) {
                if (rVar3.e(j11)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i19 |= i15;
            }
        }
        if ((38347923 & i19) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i19 & 1, z3)) {
            float f20 = 3;
            float f21 = 0;
            int i21 = i19;
            float f22 = 0;
            if (i20 != 0) {
                j11 = r.c(r.f19513b, 0.55f);
            }
            Context context = (Context) rVar3.j(AndroidCompositionLocals_androidKt.f642b);
            c cVar = (c) rVar3.j(c2.p1.f3606h);
            int t02 = cVar.t0(f10);
            int t03 = cVar.t0(f22);
            final float l0 = cVar.l0(f20);
            final float l02 = cVar.l0(f21);
            if ((i21 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean d2 = z9 | rVar3.d(t02) | rVar3.d(t03);
            Object O = rVar3.O();
            v0 v0Var = l.f24285a;
            if (!d2 && O != v0Var) {
                f17 = f20;
                f18 = f22;
                f19 = f21;
                j12 = j11;
            } else {
                f17 = f20;
                f18 = f22;
                f19 = f21;
                pe.o oVar = new pe.o(Integer.valueOf(i), Integer.valueOf(t02), Integer.valueOf(t03));
                HashMap hashMap = f28924a;
                mb mbVar = (mb) hashMap.get(oVar);
                if (mbVar != null) {
                    O = mbVar;
                    j12 = j11;
                } else {
                    try {
                        resources = context.getResources();
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeResource(resources, i, options);
                    } catch (Throwable unused) {
                    }
                    if (options.outHeight > 0) {
                        j12 = j11;
                        int i22 = 1;
                        while (true) {
                            try {
                                int i23 = i22 * 2;
                                if (options.outHeight / i23 < t02 * 2) {
                                    break;
                                } else {
                                    i22 = i23;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i22;
                        options2.inScaled = false;
                        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options2);
                        if (decodeResource == null) {
                            O = null;
                        } else {
                            float height = t03 / (t02 / decodeResource.getHeight());
                            if (height < 0.5f) {
                                height = 0.5f;
                            }
                            int[] iArr = new int[2];
                            Paint paint = new Paint(1);
                            paint.setMaskFilter(new BlurMaskFilter(height, BlurMaskFilter.Blur.NORMAL));
                            Bitmap extractAlpha = decodeResource.extractAlpha(paint, iArr);
                            extractAlpha.getClass();
                            mb mbVar2 = new mb(decodeResource, extractAlpha, iArr[0], iArr[1]);
                            hashMap.put(oVar, mbVar2);
                            O = mbVar2;
                        }
                    }
                    j12 = j11;
                    O = null;
                }
                rVar3.k0(O);
            }
            final mb mbVar3 = (mb) O;
            final o oVar2 = o.f15687a;
            if (mbVar3 == null) {
                t3 = rVar3.t();
                if (t3 != null) {
                    final int i24 = 0;
                    final float f23 = f17;
                    final float f24 = f18;
                    final float f25 = f19;
                    final long j13 = j12;
                    pVar = new df.p() { // from class: w7.nb
                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i24) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    a(i, str, f10, sVar, oVar2, f23, f25, f24, j13, (m) obj, y.L(i10 | 1), i11);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    a(i, str, f10, sVar, oVar2, f23, f25, f24, j13, (m) obj, y.L(i10 | 1), i11);
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            str2 = str;
            float f26 = f17;
            float f27 = f18;
            float f28 = f19;
            j11 = j12;
            Bitmap bitmap = mbVar3.f28740a;
            float width = (bitmap.getWidth() / bitmap.getHeight()) * f10;
            if ((234881024 & i21) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O2 = rVar3.O();
            Object obj = O2;
            if (z10 || O2 == v0Var) {
                Paint paint2 = new Paint(1);
                paint2.setFilterBitmap(true);
                paint2.setColor(l0.F(j11));
                rVar3.k0(paint2);
                obj = paint2;
            }
            final Paint paint3 = (Paint) obj;
            if ((i21 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O3 = rVar3.O();
            Object obj2 = O3;
            if (z11 || O3 == v0Var) {
                Paint paint4 = new Paint(1);
                paint4.setFilterBitmap(true);
                if (sVar != null) {
                    colorFilter = sVar.f19525a;
                } else {
                    colorFilter = null;
                }
                paint4.setColorFilter(colorFilter);
                rVar3.k0(paint4);
                obj2 = paint4;
            }
            final Paint paint5 = (Paint) obj2;
            r n10 = androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.f(oVar2, f10), width);
            if ((i21 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object O4 = rVar3.O();
            if (z12 || O4 == v0Var) {
                O4 = new b8.w(str2, 20);
                rVar3.k0(O4);
            }
            r a10 = j2.a(n10, false, (df.l) O4);
            boolean h3 = rVar3.h(mbVar3) | rVar3.c(l0) | rVar3.c(l02) | rVar3.h(paint3) | rVar3.h(paint5);
            Object O5 = rVar3.O();
            if (h3 || O5 == v0Var) {
                O5 = new df.l() { // from class: w7.ob
                    @Override // df.l
                    public final Object invoke(Object obj3) {
                        d dVar = (d) obj3;
                        dVar.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                        mb mbVar4 = mb.this;
                        Bitmap bitmap2 = mbVar4.f28740a;
                        float height2 = intBitsToFloat / bitmap2.getHeight();
                        Canvas a11 = b.a(dVar.p0().j());
                        a11.save();
                        a11.translate((mbVar4.f28742c * height2) + l0, (mbVar4.f28743d * height2) + l02);
                        a11.scale(height2, height2);
                        a11.drawBitmap(mbVar4.f28741b, 0.0f, 0.0f, paint3);
                        a11.restore();
                        a11.save();
                        a11.scale(height2, height2);
                        a11.drawBitmap(bitmap2, 0.0f, 0.0f, paint5);
                        a11.restore();
                        return pe.z.f22715a;
                    }
                };
                rVar3.k0(O5);
            }
            ya.ta.a(a10, (df.l) O5, rVar3, 0);
            f16 = f27;
            rVar2 = oVar2;
            f14 = f26;
            f15 = f28;
        } else {
            str2 = str;
            rVar3.U();
            rVar2 = rVar;
            f14 = f11;
            f15 = f12;
            f16 = f13;
        }
        final long j14 = j11;
        t3 = rVar3.t();
        if (t3 != null) {
            final int i25 = 1;
            final String str3 = str2;
            pVar = new df.p() { // from class: w7.nb
                @Override // df.p
                public final Object invoke(Object obj3, Object obj22) {
                    switch (i25) {
                        case 0:
                            ((Integer) obj22).getClass();
                            a(i, str3, f10, sVar, rVar2, f14, f15, f16, j14, (m) obj3, y.L(i10 | 1), i11);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            a(i, str3, f10, sVar, rVar2, f14, f15, f16, j14, (m) obj3, y.L(i10 | 1), i11);
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }
}
