package ja;
import a.a;

import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i8;
import da.j;
import fa.y;
import ib.o;
import java.util.Arrays;
import va.t;
import wa.h8;

/* loaded from: classes.dex */
public final class f extends da.f {
    public static final mu C = new mu("ModuleInstall.API", new fb.b(3), new t(11));

    public final o d(j... jVarArr) {
        boolean z3;
        if (jVarArr.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.a("Please provide at least one OptionalModuleApi.", z3);
        for (j jVar : jVarArr) {
            y.i(jVar, "Requested API must not be null.");
        }
        a a10 = a(Arrays.asList(jVarArr), false);
        if (a10.f19093u.isEmpty()) {
            return h8.e(new ia.a(0, true));
        }
        i8 i8Var = new i8();
        i8Var.e = new ca.d[]{sa.b.f25128c};
        i8Var.f14469c = 27301;
        i8Var.f14468b = false;
        i8Var.f14470d = new ic.c(this, a10);
        return c(0, i8Var.a());
    }
}
