package c2;
import r0.u1;

import android.view.View;
import com.google.android.gms.internal.ads.mw;
import com.google.android.gms.internal.ads.x00;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y2 implements View.OnAttachStateChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3733u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3734v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3735w;

    public y2(x00 x00Var, mw mwVar) {
        this.f3734v = mwVar;
        Objects.requireNonNull(x00Var);
        this.f3735w = x00Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3733u) {
            case 0:
                return;
            default:
                ((x00) this.f3735w).r(view, (mw) this.f3734v, 10);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3733u) {
            case 0:
                ((View) this.f3734v).removeOnAttachStateChangeListener(this);
                ((u1) this.f3735w).s();
                return;
            default:
                return;
        }
    }

    public y2(View view, u1 u1Var) {
        this.f3734v = view;
        this.f3735w = u1Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
