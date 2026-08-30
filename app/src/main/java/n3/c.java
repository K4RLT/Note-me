package n3;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b1.h;
import com.daren.scraply.MainActivity;
import com.daren.scraply.R;
import j6.s;

/* loaded from: classes.dex */
public final class c extends s {

    /* renamed from: y, reason: collision with root package name */
    public a f21148y;

    /* renamed from: z, reason: collision with root package name */
    public final b f21149z;

    public c(MainActivity mainActivity) {
        super(mainActivity);
        this.f21149z = new b(this, mainActivity);
    }

    @Override // j6.s
    public final void f() {
        int i;
        MainActivity mainActivity = (MainActivity) this.f18981v;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f21149z);
    }

    @Override // j6.s
    public final void h(h hVar) {
        this.f18982w = hVar;
        View findViewById = ((MainActivity) this.f18981v).findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f21148y != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f21148y);
        }
        a aVar = new a(this, findViewById, 1);
        this.f21148y = aVar;
        viewTreeObserver.addOnPreDrawListener(aVar);
    }
}
