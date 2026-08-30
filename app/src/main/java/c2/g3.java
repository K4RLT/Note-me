package c2;
import a0.u;
import r0.t;
import r0.x;

import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class g3 implements t, androidx.lifecycle.u {

    /* renamed from: u, reason: collision with root package name */
    public final x f3542u;

    /* renamed from: v, reason: collision with root package name */
    public final x f3543v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3544w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.lifecycle.y f3545x;

    /* renamed from: y, reason: collision with root package name */
    public df.p f3546y = n1.f3583a;

    public g3(x xVar, x xVar2) {
        this.f3542u = xVar;
        this.f3543v = xVar2;
    }

    public final void a() {
        if (!this.f3544w) {
            this.f3544w = true;
            this.f3542u.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.y yVar = this.f3545x;
            if (yVar != null) {
                yVar.f(this);
            }
        }
        this.f3543v.l();
    }

    public final void b(df.p pVar) {
        this.f3542u.setOnViewTreeOwnersAvailable(new u(this, 17, pVar));
    }

    @Override // androidx.lifecycle.u
    public final void k(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            a();
        } else if (oVar == androidx.lifecycle.o.ON_CREATE && !this.f3544w) {
            b(this.f3546y);
        }
    }
}
