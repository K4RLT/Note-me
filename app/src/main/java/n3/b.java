package n3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.daren.scraply.MainActivity;
import n1.f;

/* loaded from: classes.dex */
public final class b implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21147u;

    public b(c cVar, MainActivity mainActivity) {
        this.f21147u = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (f1.b.y(view2)) {
            SplashScreenView n10 = f1.b.n(view2);
            n10.getClass();
            build = f.e().build();
            build.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = n10.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.f21147u.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
