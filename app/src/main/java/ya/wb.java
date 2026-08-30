package ya;
import d1.r;
import df.a;
import o6.a;
import o6.j;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import s6.h;
import s6.i;
import ta.a;
import x.m;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;

/* loaded from: classes.dex */
public abstract class wb {
    public static final void a(a aVar, a aVar2, r rVar, m mVar, int i) {
        aVar2.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(382909894);
        rVar2.b0(185152185);
        Object O = rVar2.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = new j();
            rVar2.k0(O);
        }
        j jVar = (j) O;
        rVar2.p(false);
        rVar2.b0(185152232);
        Object O2 = rVar2.O();
        if (O2 == v0Var) {
            O2 = new Matrix();
            rVar2.k0(O2);
        }
        Matrix matrix = (Matrix) O2;
        rVar2.p(false);
        rVar2.b0(185152312);
        boolean f10 = rVar2.f(aVar);
        Object O3 = rVar2.O();
        if (f10 || O3 == v0Var) {
            O3 = y.B(null);
            rVar2.k0(O3);
        }
        a1 a1Var = (a1) O3;
        rVar2.p(false);
        rVar2.b0(185152364);
        if (aVar.b() == 0.0f) {
            m.a(6, rVar, rVar2);
            rVar2.p(false);
            q1 t3 = rVar2.t();
            if (t3 != null) {
                t3.f24332d = new h(aVar, aVar2, rVar, i, 0);
                return;
            }
            return;
        }
        rVar2.p(false);
        Rect rect = aVar.f21792k;
        Context context = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
        int width = rect.width();
        int height = rect.height();
        rVar.getClass();
        a(rVar.d(new LottieAnimationSizeElement(width, height)), new i(rect, matrix, jVar, aVar, context, aVar2, a1Var), rVar2, 0);
        q1 t10 = rVar2.t();
        if (t10 != null) {
            t10.f24332d = new h(aVar, aVar2, rVar, i, 1);
        }
    }
}
