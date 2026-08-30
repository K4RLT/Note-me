package wa;
import g0.b;
import p0.c;
import a0.k0;
import i0.l;
import m2.g0;
import m2.g;
import m2.p0;
import r2.a;
import r2.e;
import r2.w;
import z7.h;
import z7.i;

import android.view.inputmethod.HandwritingGesture;

/* loaded from: classes.dex */
public abstract class y7 {
    public static int a(HandwritingGesture handwritingGesture, k0 k0Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        k0Var.invoke(new a(fallbackText, 1));
        return 5;
    }

    public static void b(long j10, g gVar, boolean z3, k0 k0Var) {
        int i;
        if (z3) {
            int i10 = p0.f20545c;
            int i11 = (int) (j10 >> 32);
            int i12 = (int) (j10 & 4294967295L);
            int i13 = 10;
            if (i11 > 0) {
                i = Character.codePointBefore(gVar, i11);
            } else {
                i = 10;
            }
            if (i12 < gVar.f20477v.length()) {
                i13 = Character.codePointAt(gVar, i12);
            }
            if (i(i) && (h(i13) || g(i13))) {
                do {
                    i11 -= Character.charCount(i);
                    if (i11 == 0) {
                        break;
                    } else {
                        i = Character.codePointBefore(gVar, i11);
                    }
                } while (i(i));
                j10 = g0.b(i11, i12);
            } else if (i(i13) && (h(i) || g(i))) {
                do {
                    i12 += Character.charCount(i13);
                    if (i12 == gVar.f20477v.length()) {
                        break;
                    } else {
                        i13 = Character.codePointAt(gVar, i12);
                    }
                } while (i(i13));
                j10 = g0.b(i11, i12);
            }
        }
        int i14 = (int) (4294967295L & j10);
        k0Var.invoke(new l(new g[]{new w(i14, i14), new e(p0.c(j10), 0)}));
    }
}
