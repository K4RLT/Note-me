package ya;
import a1.a;
import i2.f;
import jf.b;
import n2.d;
import n2.h;
import o2.d;
import s2.a;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

/* loaded from: classes.dex */
public abstract class i1 {
    public static final float a(int i, int i10, float[] fArr) {
        return fArr[((i - i10) * 2) + 1];
    }

    public static final int b(h hVar, Layout layout, com.google.android.gms.internal.mlkit_vision_digital_ink.u0 u0Var, int i, RectF rectF, d dVar, a aVar, boolean z3) {
        boolean z9;
        d[] dVarArr;
        b bVar;
        float f10;
        float a10;
        d[] dVarArr2;
        int i10;
        int j10;
        float f11;
        float a11;
        int i11;
        int i12;
        int i13;
        float f12;
        float a12;
        Bidi createLineBidi;
        boolean z10;
        boolean z11;
        float a13;
        float a14;
        float f13;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i14 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i14];
        Layout layout2 = hVar.f21131f;
        int lineStart2 = layout2.getLineStart(i);
        int f14 = hVar.f(i);
        if (i14 < (f14 - lineStart2) * 2) {
            a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        f fVar = new f(hVar);
        boolean z12 = false;
        if (layout2.getParagraphDirection(i) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i15 = 0;
        while (lineStart2 < f14) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z9 && !isRtlCharAt) {
                a13 = fVar.a(lineStart2, z12, z12, true);
                f13 = fVar.a(lineStart2 + 1, true, true, true);
                z11 = z9;
            } else if (z9 && isRtlCharAt) {
                z11 = z9;
                f13 = fVar.a(lineStart2, false, false, false);
                a13 = fVar.a(lineStart2 + 1, true, true, false);
            } else {
                z11 = z9;
                if (isRtlCharAt) {
                    a14 = fVar.a(lineStart2, false, false, true);
                    a13 = fVar.a(lineStart2 + 1, true, true, true);
                } else {
                    a13 = fVar.a(lineStart2, false, false, false);
                    a14 = fVar.a(lineStart2 + 1, true, true, false);
                }
                f13 = a14;
            }
            fArr[i15] = a13;
            fArr[i15 + 1] = f13;
            i15 += 2;
            lineStart2++;
            z9 = z11;
            z12 = false;
        }
        Layout layout3 = (Layout) u0Var.f15036v;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int j11 = u0Var.j(lineStart3, false);
        int k3 = u0Var.k(j11);
        int i16 = lineStart3 - k3;
        int i17 = lineEnd2 - k3;
        Bidi e = u0Var.e(j11);
        if (e != null && (createLineBidi = e.createLineBidi(i16, i17)) != null) {
            int runCount = createLineBidi.getRunCount();
            dVarArr = new d[runCount];
            int i18 = 0;
            while (i18 < runCount) {
                int runStart = createLineBidi.getRunStart(i18) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i18) + lineStart3;
                int i19 = runCount;
                if (createLineBidi.getRunLevel(i18) % 2 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVarArr[i18] = new d(runStart, runLimit, z10);
                i18++;
                runCount = i19;
            }
        } else {
            dVarArr = new d[]{new d(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        }
        if (z3) {
            bVar = new b(0, dVarArr.length - 1, 1);
        } else {
            bVar = new b(dVarArr.length - 1, 0, -1);
        }
        int i20 = bVar.f19189u;
        int i21 = bVar.f19190v;
        int i22 = bVar.f19191w;
        if ((i22 <= 0 || i20 > i21) && (i22 >= 0 || i21 > i20)) {
            return -1;
        }
        while (true) {
            d dVar2 = dVarArr[i20];
            boolean z13 = dVar2.f21116c;
            int i23 = dVar2.f21114a;
            int i24 = dVar2.f21115b;
            if (z13) {
                f10 = fArr[((i24 - 1) - lineStart) * 2];
            } else {
                f10 = fArr[(i23 - lineStart) * 2];
            }
            if (z13) {
                a10 = a(i23, lineStart, fArr);
            } else {
                a10 = a(i24 - 1, lineStart, fArr);
            }
            float f15 = rectF.left;
            int i25 = i22;
            if (z3) {
                if (a10 >= f15) {
                    float f16 = rectF.right;
                    if (f10 <= f16) {
                        if ((!z13 && f15 <= f10) || (z13 && f16 >= a10)) {
                            i12 = i23;
                        } else {
                            int i26 = i24;
                            int i27 = i23;
                            while (true) {
                                i11 = i26;
                                if (i26 - i27 <= 1) {
                                    break;
                                }
                                int i28 = (i11 + i27) / 2;
                                float f17 = fArr[(i28 - lineStart) * 2];
                                if ((!z13 && f17 > rectF.left) || (z13 && f17 < rectF.right)) {
                                    i26 = i28;
                                } else {
                                    i26 = i11;
                                    i27 = i28;
                                }
                            }
                            if (z13) {
                                i12 = i11;
                            } else {
                                i12 = i27;
                            }
                        }
                        int j12 = dVar.j(i12);
                        if (j12 != -1 && (i13 = dVar.i(j12)) < i24) {
                            if (i13 >= i23) {
                                i23 = i13;
                            }
                            if (j12 > i24) {
                                j12 = i24;
                            }
                            dVarArr2 = dVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i29 = j12;
                            while (true) {
                                if (z13) {
                                    f12 = fArr[((i29 - 1) - lineStart) * 2];
                                } else {
                                    f12 = fArr[(i23 - lineStart) * 2];
                                }
                                rectF2.left = f12;
                                if (z13) {
                                    a12 = a(i23, lineStart, fArr);
                                } else {
                                    a12 = a(i29 - 1, lineStart, fArr);
                                }
                                rectF2.right = a12;
                                if (!((Boolean) aVar.invoke(rectF2, rectF)).booleanValue()) {
                                    i23 = dVar.g(i23);
                                    if (i23 == -1 || i23 >= i24) {
                                        break;
                                    }
                                    i29 = dVar.j(i23);
                                    if (i29 > i24) {
                                        i29 = i24;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i23 = -1;
                        }
                    }
                }
                dVarArr2 = dVarArr;
                i23 = -1;
            } else {
                dVarArr2 = dVarArr;
                if (a10 >= f15) {
                    float f18 = rectF.right;
                    if (f10 <= f18) {
                        if ((!z13 && f18 >= a10) || (z13 && f15 <= f10)) {
                            i10 = i24 - 1;
                        } else {
                            int i30 = i24;
                            int i31 = i23;
                            while (i30 - i31 > 1) {
                                int i32 = (i30 + i31) / 2;
                                float f19 = fArr[(i32 - lineStart) * 2];
                                int i33 = i30;
                                if ((!z13 && f19 > rectF.right) || (z13 && f19 < rectF.left)) {
                                    i30 = i32;
                                } else {
                                    i30 = i33;
                                    i31 = i32;
                                }
                            }
                            int i34 = i30;
                            if (z13) {
                                i10 = i34;
                            } else {
                                i10 = i31;
                            }
                        }
                        int i35 = dVar.i(i10 + 1);
                        if (i35 != -1 && (j10 = dVar.j(i35)) > i23) {
                            if (i35 < i23) {
                                i35 = i23;
                            }
                            if (j10 <= i24) {
                                i24 = j10;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i36 = i35;
                            while (true) {
                                if (z13) {
                                    f11 = fArr[((i24 - 1) - lineStart) * 2];
                                } else {
                                    f11 = fArr[(i36 - lineStart) * 2];
                                }
                                rectF3.left = f11;
                                if (z13) {
                                    a11 = a(i36, lineStart, fArr);
                                } else {
                                    a11 = a(i24 - 1, lineStart, fArr);
                                }
                                rectF3.right = a11;
                                if (!((Boolean) aVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i24 = dVar.h(i24);
                                    if (i24 == -1 || i24 <= i23) {
                                        break;
                                    }
                                    i36 = dVar.i(i24);
                                    if (i36 < i23) {
                                        i36 = i23;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i24 = -1;
                i23 = i24;
            }
            if (i23 >= 0) {
                return i23;
            }
            if (i20 == i21) {
                return -1;
            }
            i20 += i25;
            i22 = i25;
            dVarArr = dVarArr2;
        }
    }
}
