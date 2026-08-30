package ya;
import l.c;
import p.a;
import a7.l;
import b8.u4;
import v6.b;
import y6.f;
import y6.p;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class fe {
    public static a a(b bVar, a aVar) {
        return new a(0, p.a(bVar, aVar, 1.0f, f.f30927v, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b, a] */
    public static b b(a aVar, a aVar2, boolean z3) {
        float f10;
        if (z3) {
            f10 = l.c();
        } else {
            f10 = 1.0f;
        }
        return new a(5, p.a(aVar, aVar2, f10, f.f30928w, false));
    }

    public static a c(b bVar, a aVar, int i) {
        u4 u4Var = new u4(13);
        u4Var.f2825v = i;
        ArrayList a10 = p.a(bVar, aVar, 1.0f, u4Var, false);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            a aVar2 = (a) a10.get(i10);
            c cVar = (c) aVar2.f1794b;
            c cVar2 = (c) aVar2.f1795c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f27712a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f27712a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar2 = new a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a10.set(i10, aVar2);
        }
        return new a(1, a10);
    }

    public static a d(a aVar, a aVar2) {
        return new a(2, p.a(aVar, aVar2, 1.0f, f.f30929x, false));
    }

    public static a e(b bVar, a aVar) {
        return new a(3, p.a(bVar, aVar, l.c(), f.f30931z, true));
    }
}
