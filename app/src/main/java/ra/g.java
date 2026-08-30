package ra;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i8;
import ib.o;
import va.t;
import wa.h8;

/* loaded from: classes.dex */
public final class g extends da.f implements y9.a {
    public static final mu E = new mu("AppSet.API", new fb.b(4), new t(11));
    public final Context C;
    public final ca.f D;

    public g(Context context, ca.f fVar) {
        super(context, E, da.b.f15818a, da.e.f15820b);
        this.C = context;
        this.D = fVar;
    }

    @Override // y9.a
    public final o a() {
        if (this.D.c(this.C, 212800000) == 0) {
            i8 i8Var = new i8();
            i8Var.e = new ca.d[]{y9.d.f31002a};
            i8Var.f14470d = new Object();
            i8Var.f14468b = false;
            i8Var.f14469c = 27601;
            return c(0, i8Var.a());
        }
        return h8.d(new da.d(new Status(17, null, null, null)));
    }
}
