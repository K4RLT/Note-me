package x;
import w0.a;

import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.zb1;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends zb1 implements Runnable, q3.d, View.OnAttachStateChangeListener {

    /* renamed from: w, reason: collision with root package name */
    public final w0 f30032w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30033x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30034y;

    /* renamed from: z, reason: collision with root package name */
    public q3.q0 f30035z;

    public z(w0 w0Var) {
        super(!w0Var.f30027r ? 1 : 0);
        this.f30032w = w0Var;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final void a(q3.a0 a0Var) {
        this.f30033x = false;
        this.f30034y = false;
        q3.q0 q0Var = this.f30035z;
        if (a0Var.f23378a.b() != 0 && q0Var != null) {
            q3.n0 n0Var = q0Var.f23423a;
            w0 w0Var = this.f30032w;
            w0Var.f30026q.f(b.h(n0Var.g(8)));
            w0Var.f30025p.f(b.h(n0Var.g(8)));
            a(w0Var, q0Var);
        }
        this.f30035z = null;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final void b() {
        this.f30033x = true;
        this.f30034y = true;
    }

    @Override // q3.d
    public final q3.q0 c(View view, q3.q0 q0Var) {
        this.f30035z = q0Var;
        w0 w0Var = this.f30032w;
        u0 u0Var = w0Var.f30025p;
        q3.n0 n0Var = q0Var.f23423a;
        u0Var.f(b.h(n0Var.g(8)));
        if (this.f30033x) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f30034y) {
            w0Var.f30026q.f(b.h(n0Var.g(8)));
            a(w0Var, q0Var);
        }
        if (w0Var.f30027r) {
            return q3.q0.f23422b;
        }
        return q0Var;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final q3.q0 d(q3.q0 q0Var, List list) {
        w0 w0Var = this.f30032w;
        a(w0Var, q0Var);
        if (w0Var.f30027r) {
            return q3.q0.f23422b;
        }
        return q0Var;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final j6.l e(q3.a0 a0Var, j6.l lVar) {
        this.f30033x = false;
        return lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30033x) {
            this.f30033x = false;
            this.f30034y = false;
            q3.q0 q0Var = this.f30035z;
            if (q0Var != null) {
                w0 w0Var = this.f30032w;
                w0Var.f30026q.f(b.h(q0Var.f23423a.g(8)));
                a(w0Var, q0Var);
                this.f30035z = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
