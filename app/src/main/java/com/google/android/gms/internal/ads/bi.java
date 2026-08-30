package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import k9.f0;
import l9.i;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bi implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long I = ((Long) r.e.f17698c.a(sl.U1)).longValue();
    public final WeakReference A;
    public final wf B;
    public final ra C;
    public boolean D;
    public int E;
    public final HashSet F;
    public final DisplayMetrics G;
    public final Rect H;

    /* renamed from: u, reason: collision with root package name */
    public final Context f4795u;

    /* renamed from: v, reason: collision with root package name */
    public final Application f4796v;

    /* renamed from: w, reason: collision with root package name */
    public final PowerManager f4797w;

    /* renamed from: x, reason: collision with root package name */
    public final KeyguardManager f4798x;

    /* renamed from: y, reason: collision with root package name */
    public hg f4799y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f4800z;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ra, java.lang.Object] */
    public bi(Context context, View view) {
        View view2;
        Object obj = new Object();
        obj.f10163v = Long.MIN_VALUE;
        obj.f10164w = new Object();
        obj.f10162u = I;
        this.C = obj;
        this.D = false;
        this.E = -1;
        this.F = new HashSet();
        Context applicationContext = context.getApplicationContext();
        this.f4795u = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f4797w = (PowerManager) applicationContext.getSystemService("power");
        this.f4798x = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f4796v = (Application) applicationContext;
            this.B = new wf((Application) applicationContext, this);
        }
        this.G = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.H = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.A;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.A = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f10 = rect.left;
        float f11 = this.G.density;
        return new Rect((int) (f10 / f11), (int) (rect.top / f11), (int) (rect.right / f11), (int) (rect.bottom / f11));
    }

    public final void b() {
        f0.f19676l.post(new f(8, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.A;
        if (weakReference != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) weakReference.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.E = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x015e, code lost:
    
        if (r12 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        if (r12 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0139, code lost:
    
        r12 = r17;
        r5 = true;
        r6 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024f A[LOOP:1: B:88:0x0249->B:90:0x024f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r32) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi.d(int):void");
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f4800z = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f4799y == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            hg hgVar = new hg(1, this);
            this.f4799y = hgVar;
            Context context = this.f4795u;
            is0 is0Var = k.C.f16834z;
            synchronized (is0Var) {
                if (is0Var.f7205v) {
                    ((WeakHashMap) is0Var.f7207x).put(hgVar, intentFilter);
                } else {
                    sl.a(context);
                    if (((Boolean) r.e.f17698c.a(sl.f10956tc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(hgVar, intentFilter, 4);
                    } else {
                        context.registerReceiver(hgVar, intentFilter);
                    }
                }
            }
        }
        Application application = this.f4796v;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.B);
            } catch (Exception e) {
                int i = a0.f19634b;
                i.d("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f4800z;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f4800z = null;
            }
        } catch (Exception e) {
            int i = a0.f19634b;
            i.d("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e8) {
            int i10 = a0.f19634b;
            i.d("Error while unregistering listeners from the ViewTreeObserver.", e8);
        }
        hg hgVar = this.f4799y;
        if (hgVar != null) {
            try {
                k.C.f16834z.d(this.f4795u, hgVar);
            } catch (IllegalStateException e10) {
                int i11 = a0.f19634b;
                i.d("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                k.C.f16817h.d("ActiveViewUnit.stopScreenStatusMonitoring", e11);
            }
            this.f4799y = null;
        }
        Application application = this.f4796v;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.B);
            } catch (Exception e12) {
                int i12 = a0.f19634b;
                i.d("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.E = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.E = -1;
        d(3);
        b();
        f(view);
    }
}