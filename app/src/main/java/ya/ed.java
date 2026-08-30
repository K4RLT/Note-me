package ya;
import j1.b;
import v1.d;
import v1.r;
import v1.t;
import y1.a;

import com.google.android.gms.internal.ads.n00;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ed {
    public static final void a(n00 n00Var, t tVar) {
        boolean b10 = r.b(tVar);
        long j10 = tVar.f27342b;
        if (b10) {
            n00Var.c();
        }
        if (!r.d(tVar)) {
            List b11 = tVar.b();
            int size = b11.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) b11.get(i);
                n00Var.a(dVar.f27290a, b.h(dVar.f27292c, 0L));
            }
            n00Var.a(j10, b.h(tVar.f27350l, 0L));
        }
        if (r.d(tVar) && j10 - n00Var.f8504a > 40) {
            n00Var.c();
        }
        n00Var.f8504a = j10;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i = 0; i < length; i++) {
            f10 += fArr[i] * fArr2[i];
        }
        return f10;
    }

    public static final void c(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float b10;
        if (i == 0) {
            a.a("At least one point must be provided");
        }
        int i10 = 2 >= i ? i - 1 : 2;
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i];
        }
        for (int i13 = 0; i13 < i; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i];
        }
        float[][] fArr6 = new float[i11];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        for (int i17 = 0; i17 < i11; i17++) {
            float[] fArr7 = fArr5[i17];
            float[] fArr8 = fArr4[i17];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i18 = 0; i18 < i17; i18++) {
                float[] fArr9 = fArr5[i18];
                float b11 = b(fArr7, fArr9);
                for (int i19 = 0; i19 < i; i19++) {
                    fArr7[i19] = fArr7[i19] - (fArr9[i19] * b11);
                }
            }
            float sqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f10 = 1.0f / sqrt;
            for (int i20 = 0; i20 < i; i20++) {
                fArr7[i20] = fArr7[i20] * f10;
            }
            float[] fArr10 = fArr6[i17];
            for (int i21 = 0; i21 < i11; i21++) {
                if (i21 < i17) {
                    b10 = 0.0f;
                } else {
                    b10 = b(fArr7, fArr4[i21]);
                }
                fArr10[i21] = b10;
            }
        }
        for (int i22 = i10; -1 < i22; i22--) {
            float b12 = b(fArr5[i22], fArr2);
            float[] fArr11 = fArr6[i22];
            int i23 = i22 + 1;
            if (i23 <= i10) {
                int i24 = i10;
                while (true) {
                    b12 -= fArr11[i24] * fArr3[i24];
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            fArr3[i22] = b12 / fArr11[i22];
        }
    }
}
