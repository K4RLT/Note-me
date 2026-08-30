package c;
import c.i0;
import c.j;
import f.b;
import f.c;
import f.e;
import f.g;
import f.h;
import g.b;
import i0.b;
import i0.m;
import q.x;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.o0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ya.gd;

/* loaded from: classes.dex */
public abstract class o extends f3.a implements z0, androidx.lifecycle.k, m5.e, i0, h {
    public static final /* synthetic */ int N = 0;
    public final pe.n A;
    public final AtomicInteger B;
    public final m C;
    public final CopyOnWriteArrayList D;
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public final CopyOnWriteArrayList I;
    public boolean J;
    public boolean K;
    public final pe.n L;
    public final pe.n M;

    /* renamed from: v */
    public final ca.i f3263v;

    /* renamed from: w */
    public final k6.i f3264w;

    /* renamed from: x */
    public final j6.c f3265x;

    /* renamed from: y */
    public y0 f3266y;

    /* renamed from: z */
    public final k f3267z;

    public o() {
        ca.i iVar = new ca.i();
        this.f3263v = iVar;
        this.f3264w = new k6.i(new d(this, 0));
        o5.b bVar = new o5.b(this, new a1.c(23, this));
        j6.c cVar = new j6.c(bVar);
        this.f3265x = cVar;
        this.f3267z = new k(this);
        this.A = new pe.n(new n(this, 2));
        this.B = new AtomicInteger();
        this.C = new m(this);
        this.D = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        androidx.lifecycle.y yVar = this.f16650u;
        if (yVar != null) {
            final int i = 0;
            yVar.a(new androidx.lifecycle.u(this) { // from class: c.e

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ o f3225v;

                {
                    this.f3225v = this;
                }

                @Override // androidx.lifecycle.u
                public final void k(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
                    Window window;
                    View peekDecorView;
                    switch (i) {
                        case 0:
                            o oVar2 = this.f3225v;
                            if (oVar == androidx.lifecycle.o.ON_STOP && (window = oVar2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            o oVar3 = this.f3225v;
                            if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                                oVar3.f3263v.f4043v = null;
                                if (!oVar3.isChangingConfigurations()) {
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) oVar3.d().f1090a;
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((u0) it.next()).b();
                                    }
                                    linkedHashMap.clear();
                                }
                                k kVar = oVar3.f3267z;
                                o oVar4 = kVar.f3247x;
                                oVar4.getWindow().getDecorView().removeCallbacks(kVar);
                                oVar4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                                return;
                            }
                            return;
                    }
                }
            });
            final int i10 = 1;
            this.f16650u.a(new androidx.lifecycle.u(this) { // from class: c.e

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ o f3225v;

                {
                    this.f3225v = this;
                }

                @Override // androidx.lifecycle.u
                public final void k(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
                    Window window;
                    View peekDecorView;
                    switch (i10) {
                        case 0:
                            o oVar2 = this.f3225v;
                            if (oVar == androidx.lifecycle.o.ON_STOP && (window = oVar2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            o oVar3 = this.f3225v;
                            if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                                oVar3.f3263v.f4043v = null;
                                if (!oVar3.isChangingConfigurations()) {
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) oVar3.d().f1090a;
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((u0) it.next()).b();
                                    }
                                    linkedHashMap.clear();
                                }
                                k kVar = oVar3.f3267z;
                                o oVar4 = kVar.f3247x;
                                oVar4.getWindow().getDecorView().removeCallbacks(kVar);
                                oVar4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                                return;
                            }
                            return;
                    }
                }
            });
            this.f16650u.a(new m5.b(this, i10));
            bVar.c();
            o0.d(this);
            ((m) cVar.f18915w).m("android:support:activity-result", new f(0, this));
            g gVar = new g(this);
            o oVar = (o) iVar.f4043v;
            if (oVar != null) {
                gVar.a(oVar);
            }
            ((CopyOnWriteArraySet) iVar.f4042u).add(gVar);
            this.L = new pe.n(new n(this, 0));
            this.M = new pe.n(new n(this, 3));
            return;
        }
        x.o("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    @Override // i0
    public final g0 a() {
        return (g0) this.M.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3267z.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.k
    public final w0 b() {
        return (w0) this.L.getValue();
    }

    @Override // androidx.lifecycle.k
    public final w4.b c() {
        Bundle bundle;
        w4.c cVar = new w4.c(w4.a.f27706b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f27707a;
        if (application != null) {
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(v0.f1076d, application2);
        }
        linkedHashMap.put(o0.f1044a, this);
        linkedHashMap.put(o0.f1045b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(o0.f1046c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.z0
    public final y0 d() {
        if (getApplication() != null) {
            if (this.f3266y == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f3266y = jVar.f3242a;
                }
                if (this.f3266y == null) {
                    this.f3266y = new y0(3);
                }
            }
            y0 y0Var = this.f3266y;
            y0Var.getClass();
            return y0Var;
        }
        x.o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // m5.e
    public final m f() {
        return (m) this.f3265x.f18915w;
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.y g() {
        return this.f16650u;
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final g i(b bVar, b bVar2) {
        m mVar = this.C;
        mVar.getClass();
        String str = "activity_rq#" + this.B.getAndIncrement();
        LinkedHashMap linkedHashMap = mVar.f3256c;
        androidx.lifecycle.y yVar = this.f16650u;
        if (yVar.f1084d.compareTo(androidx.lifecycle.p.f1051x) < 0) {
            mVar.c(str);
            e eVar = (e) linkedHashMap.get(str);
            if (eVar == null) {
                eVar = new e(yVar);
            }
            e eVar2 = eVar;
            c cVar = new c(mVar, str, bVar2, bVar, 0);
            eVar2.f16612a.a(cVar);
            eVar2.f16613b.add(cVar);
            linkedHashMap.put(str, eVar2);
            return new g(mVar, str, bVar, 0);
        }
        StringBuilder sb2 = new StringBuilder("LifecycleOwner ");
        sb2.append(this);
        androidx.lifecycle.p pVar = yVar.f1084d;
        sb2.append(" is attempting to register while current state is ");
        sb2.append(pVar);
        sb2.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb2.toString().toString());
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        if (!this.C.a(i, i10, intent)) {
            super.onActivityResult(i, i10, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(configuration);
        }
    }

    @Override // f3.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f3265x.f(bundle);
        ca.i iVar = this.f3263v;
        iVar.getClass();
        iVar.f4043v = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f4042u).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = androidx.lifecycle.k0.f1037v;
        androidx.lifecycle.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f3264w.f19569v).iterator();
            if (it.hasNext()) {
                ((f4.f) it.next()).getClass();
                throw null;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f3264w.f19569v).iterator();
            if (it.hasNext()) {
                ((f4.f) it.next()).getClass();
                throw null;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        configuration.getClass();
        this.J = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.J = false;
            Iterator it = this.G.iterator();
            while (it.hasNext()) {
                ((p3.a) it.next()).accept(new f3.b(z3));
            }
        } catch (Throwable th) {
            this.J = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f3264w.f19569v).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            ((f4.f) it.next()).getClass();
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        configuration.getClass();
        this.K = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.K = false;
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                ((p3.a) it.next()).accept(new f3.r(z3));
            }
        } catch (Throwable th) {
            this.K = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f3264w.f19569v).iterator();
            if (it.hasNext()) {
                ((f4.f) it.next()).getClass();
                throw null;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.C.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, j] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        y0 y0Var = this.f3266y;
        if (y0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            y0Var = jVar.f3242a;
        }
        if (y0Var == null) {
            return null;
        }
        Object obj = new Object();
        obj.f3242a = y0Var;
        return obj;
    }

    @Override // f3.a, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.y yVar = this.f16650u;
        if (yVar != null) {
            yVar.c("setCurrentState");
            yVar.e(androidx.lifecycle.p.f1050w);
        }
        super.onSaveInstanceState(bundle);
        this.f3265x.g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (gd.b()) {
                gd.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x xVar = (x) this.A.getValue();
            synchronized (xVar.f3271b) {
                try {
                    xVar.f3272c = true;
                    ArrayList arrayList = xVar.f3273d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((df.a) obj).invoke();
                    }
                    xVar.f3273d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3267z.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3267z.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3267z.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.J) {
            return;
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(new f3.b(z3));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.K) {
            return;
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(new f3.r(z3));
        }
    }
}