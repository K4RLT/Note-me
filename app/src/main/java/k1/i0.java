package k1;
import k.b;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public interface i0 {
    static void a(i0 i0Var, j1.d dVar) {
        h hVar = (h) i0Var;
        if (hVar.f19482b == null) {
            hVar.f19482b = new RectF();
        }
        RectF rectF = hVar.f19482b;
        rectF.getClass();
        float f10 = dVar.f18767a;
        long j10 = dVar.f18773h;
        long j11 = dVar.f18772g;
        long j12 = dVar.f18771f;
        long j13 = dVar.e;
        rectF.set(f10, dVar.f18768b, dVar.f18769c, dVar.f18770d);
        if (hVar.f19483c == null) {
            hVar.f19483c = new float[8];
        }
        float[] fArr = hVar.f19483c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        Path path = hVar.f19481a;
        RectF rectF2 = hVar.f19482b;
        rectF2.getClass();
        float[] fArr2 = hVar.f19483c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, b(h0.f19485u));
    }

    static void b(i0 i0Var, j1.c cVar) {
        h hVar = (h) i0Var;
        h.m(cVar);
        if (hVar.f19482b == null) {
            hVar.f19482b = new RectF();
        }
        RectF rectF = hVar.f19482b;
        rectF.getClass();
        rectF.set(cVar.f18763a, cVar.f18764b, cVar.f18765c, cVar.f18766d);
        Path path = hVar.f19481a;
        RectF rectF2 = hVar.f19482b;
        rectF2.getClass();
        path.addRect(rectF2, b(h0.f19485u));
    }
}
