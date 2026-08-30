package ya;
import a7.l;
import o6.a;
import r0.a1;
import r0.m;
import r0.r;
import r0.v0;
import r0.y;
import s6.g;

import android.content.Context;
import android.graphics.Matrix;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class vb {
    public static final g a(a aVar, l lVar, m mVar) {
        r rVar = (r) mVar;
        rVar.b0(683659508);
        if (!Float.isInfinite(1.0f) && !Float.isNaN(1.0f)) {
            rVar.b0(2024497114);
            rVar.b0(-610207850);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new g();
                rVar.k0(O);
            }
            g gVar = (g) O;
            rVar.p(false);
            rVar.p(false);
            rVar.b0(-180606964);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = y.B(true);
                rVar.k0(O2);
            }
            a1 a1Var = (a1) O2;
            rVar.p(false);
            rVar.b0(-180606834);
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            Matrix matrix = l.f341a;
            float f10 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            rVar.p(false);
            y.i(new Object[]{aVar, true, lVar, Float.valueOf(f10), Integer.MAX_VALUE}, new a(gVar, aVar, f10, lVar, a1Var, null), rVar);
            rVar.p(false);
            return gVar;
        }
        throw new IllegalArgumentException(("Speed must be a finite number. It is 1.0.").toString());
    }
}
