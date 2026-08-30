package u2;

import android.text.TextPaint;
import java.util.ArrayList;
import k1.n;
import k1.o0;
import k1.p;
import m2.q;
import m2.s;
import x2.l;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f25844a = new k(false);

    public static final void a(q qVar, p pVar, n nVar, float f10, o0 o0Var, l lVar, m1.e eVar) {
        ArrayList arrayList = qVar.f20553h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s sVar = (s) arrayList.get(i);
            sVar.f20561a.n(pVar, nVar, f10, o0Var, lVar, eVar);
            pVar.q(0.0f, sVar.f20561a.h());
        }
    }

    public static final void b(TextPaint textPaint, float f10) {
        if (!Float.isNaN(f10)) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f10 * 255));
        }
    }
}
