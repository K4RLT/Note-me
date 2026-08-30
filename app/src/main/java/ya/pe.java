package ya;
import fa.y;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f31430a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f31431b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f31432c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f31433d;
    public final Boolean e;

    public /* synthetic */ pe(com.google.android.gms.internal.mlkit_vision_digital_ink.u0 u0Var) {
        this.f31430a = (Boolean) u0Var.f15036v;
        this.f31431b = (Boolean) u0Var.f15037w;
        this.f31432c = (Boolean) u0Var.f15038x;
        this.f31433d = (Boolean) u0Var.f15039y;
        this.e = (Boolean) u0Var.f15040z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        if (y.l(this.f31430a, peVar.f31430a) && y.l(this.f31431b, peVar.f31431b) && y.l(this.f31432c, peVar.f31432c) && y.l(this.f31433d, peVar.f31433d) && y.l(this.e, peVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31430a, this.f31431b, this.f31432c, this.f31433d, this.e});
    }
}
