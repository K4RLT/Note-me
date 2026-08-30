package k9;
import s.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.cy;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.s00;
import java.lang.ref.WeakReference;
import r0.p1;
import r0.v0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19731a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19732b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19733c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19734d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19735f;

    public z(p1 p1Var, Object obj, boolean z3, v0 v0Var, boolean z9) {
        this.f19734d = p1Var;
        this.f19731a = z3;
        this.e = v0Var;
        this.f19732b = z9;
        this.f19735f = obj;
        this.f19733c = true;
    }

    public Object a() {
        if (this.f19731a) {
            return null;
        }
        Object obj = this.f19735f;
        if (obj != null) {
            return obj;
        }
        r0.d("Unexpected form of a provided value");
        l4.a.p();
        return null;
    }

    public void b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View decorView;
        s00 s00Var = (s00) this.e;
        if (!this.f19731a) {
            Activity activity = (Activity) this.f19735f;
            ViewTreeObserver viewTreeObserver3 = null;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver2 = decorView.getViewTreeObserver();
                } else {
                    viewTreeObserver2 = null;
                }
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(s00Var);
                }
            }
            s00 s00Var2 = (s00) this.f19734d;
            fp fpVar = f9.k.C.B;
            cy cyVar = new cy(s00Var2, s00Var);
            View view = (View) ((WeakReference) cyVar.f11688u).get();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
                viewTreeObserver3 = viewTreeObserver;
            }
            if (viewTreeObserver3 != null) {
                cyVar.U1(viewTreeObserver3);
            }
            this.f19731a = true;
        }
    }

    public z(Activity activity, s00 s00Var, s00 s00Var2) {
        this.f19735f = activity;
        this.f19734d = s00Var;
        this.e = s00Var2;
    }
}
