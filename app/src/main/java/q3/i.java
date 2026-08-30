package q3;
import h.a;
import j.a;
import q0.c;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class i implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public q0 f23405a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f23407c;

    public i(View view, d dVar) {
        this.f23406b = view;
        this.f23407c = dVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q0 c10 = c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        d dVar = this.f23407c;
        if (i < 30) {
            a(windowInsets, this.f23406b);
            if (c10.equals(this.f23405a)) {
                return dVar.c(view, c10).b();
            }
        }
        this.f23405a = c10;
        q0 c11 = dVar.c(view, c10);
        if (i >= 30) {
            return c11.b();
        }
        boolean z3 = p.f23420a;
        a(view);
        return c11.b();
    }
}
