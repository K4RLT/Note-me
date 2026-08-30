package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Binder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class mf implements s81 {

    /* renamed from: u, reason: collision with root package name */
    public boolean f8336u;

    /* renamed from: v, reason: collision with root package name */
    public Object f8337v;

    /* renamed from: w, reason: collision with root package name */
    public Object f8338w;

    public mf(int i) {
        switch (i) {
            case 3:
                this.f8338w = l9.b.f20035b;
                return;
            case 7:
                this.f8337v = new ArrayList();
                this.f8338w = new HashMap();
                this.f8336u = false;
                return;
            case 8:
                this.f8337v = new Object();
                return;
            default:
                this.f8337v = new Object();
                this.f8338w = null;
                this.f8336u = false;
                return;
        }
    }

    public static mf b(a31 a31Var) {
        return new mf(new to0(6, a31Var));
    }

    public boolean a(long j10) {
        Object obj;
        List list = (List) ((j6.l) this.f8338w).f18933v;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (v1.s.a(((v1.v) obj).f27357a, j10)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        v1.v vVar = (v1.v) obj;
        if (vVar == null) {
            return false;
        }
        return vVar.f27363h;
    }

    public void c(Context context) {
        Application application;
        synchronized (this.f8337v) {
            try {
                if (!this.f8336u) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    if (application == null) {
                        int i = k9.a0.f19634b;
                        l9.i.f("Can not cast Context to Application");
                        return;
                    }
                    if (((gi) this.f8338w) == null) {
                        this.f8338w = new gi();
                    }
                    gi giVar = (gi) this.f8338w;
                    if (!giVar.C) {
                        application.registerActivityLifecycleCallbacks(giVar);
                        if (context instanceof Activity) {
                            giVar.a((Activity) context);
                        }
                        giVar.f6401v = application;
                        giVar.D = ((Long) g9.r.e.f17698c.a(sl.B1)).longValue();
                        giVar.C = true;
                    }
                    this.f8336u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(ib.m mVar) {
        synchronized (this.f8337v) {
            try {
                if (((ArrayDeque) this.f8338w) == null) {
                    this.f8338w = new ArrayDeque();
                }
                ((ArrayDeque) this.f8338w).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void e() {
        synchronized (this.f8338w) {
            try {
                cj cjVar = (cj) this.f8337v;
                if (cjVar == null) {
                    return;
                }
                cjVar.o();
                this.f8337v = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void f(int i) {
        if (this.f8336u) {
            return;
        }
        this.f8336u = true;
        l(new g9.y1(i, fk0.c(i, ((gi0) this.f8337v).f6406a), "undefined", null, null));
    }

    public void g(ii iiVar) {
        synchronized (this.f8337v) {
            try {
                if (((gi) this.f8338w) == null) {
                    this.f8338w = new gi();
                }
                gi giVar = (gi) this.f8338w;
                synchronized (giVar.f6402w) {
                    giVar.f6405z.add(iiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(ib.o oVar) {
        ib.m mVar;
        synchronized (this.f8337v) {
            if (((ArrayDeque) this.f8338w) != null && !this.f8336u) {
                this.f8336u = true;
                while (true) {
                    synchronized (this.f8337v) {
                        try {
                            mVar = (ib.m) ((ArrayDeque) this.f8338w).poll();
                            if (mVar == null) {
                                this.f8336u = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    mVar.b(oVar);
                }
            }
        }
    }

    public void i(ii iiVar) {
        synchronized (this.f8337v) {
            try {
                gi giVar = (gi) this.f8338w;
                if (giVar == null) {
                    return;
                }
                synchronized (giVar.f6402w) {
                    giVar.f6405z.remove(iiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity j() {
        synchronized (this.f8337v) {
            try {
                gi giVar = (gi) this.f8338w;
                if (giVar != null) {
                    return giVar.f6400u;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mf k(z21 z21Var) {
        z21Var.getClass();
        return new mf((p31) this.f8338w, this.f8336u, z21Var);
    }

    public synchronized void l(g9.y1 y1Var) {
        int i = 1;
        if (true == ((Boolean) g9.r.e.f17698c.a(sl.f10997w6)).booleanValue()) {
            i = 3;
        }
        ((yx) this.f8338w).c(new hi0(i, y1Var));
    }

    public boolean m() {
        synchronized (this.f8337v) {
            try {
                gi giVar = (gi) this.f8338w;
                if (giVar != null) {
                    return giVar.f6403x.get();
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List n(CharSequence charSequence) {
        charSequence.getClass();
        Iterator f10 = ((p31) this.f8338w).f(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            o31 o31Var = (o31) f10;
            if (o31Var.hasNext()) {
                arrayList.add((String) o31Var.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        rr0 rr0Var = (rr0) this.f8338w;
        rr0Var.a(true);
        ur0 ur0Var = (ur0) this.f8337v;
        ur0Var.a(rr0Var);
        if (this.f8336u) {
            ur0Var.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        rr0 rr0Var = (rr0) this.f8338w;
        if (rr0Var.zzb()) {
            ur0 ur0Var = (ur0) this.f8337v;
            rr0Var.b(th);
            rr0Var.a(false);
            ur0Var.a(rr0Var);
            if (this.f8336u) {
                ur0Var.h();
            }
        }
    }

    public mf(Context context, int i) {
        switch (i) {
            case 3:
                ExecutorService executorService = l9.b.f20035b;
                this.f8338w = executorService;
                executorService.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 6, context));
                return;
            default:
                this.f8338w = new Object();
                return;
        }
    }

    public mf(p31 p31Var, boolean z3, z21 z21Var) {
        this.f8338w = p31Var;
        this.f8336u = z3;
        this.f8337v = z21Var;
    }

    public mf(p31 p31Var) {
        this(p31Var, false, c31.f4986v);
    }
}
