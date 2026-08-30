package com.google.android.gms.internal.ads;
import i0.m;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class hx1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6915a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6916b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final m f6917c;

    /* renamed from: d, reason: collision with root package name */
    public final z11 f6918d;
    public Looper e;

    /* renamed from: f, reason: collision with root package name */
    public uh f6919f;

    /* renamed from: g, reason: collision with root package name */
    public tu1 f6920g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f6921h;

    public hx1() {
        Object obj = null;
        this.f6917c = new m(new CopyOnWriteArrayList(), 11, obj);
        this.f6918d = new z11(10, (Object) new CopyOnWriteArrayList(), obj, false);
    }

    public abstract void a(y4 y4Var);

    public abstract void b(xx1 xx1Var);

    public abstract xx1 c(yx1 yx1Var, w wVar, long j10);

    public abstract y4 f();

    public void g() {
    }

    public abstract void h(as1 as1Var);

    public void i() {
    }

    public abstract void j();

    public final void k(uh uhVar) {
        this.f6919f = uhVar;
        ArrayList arrayList = this.f6915a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zx1) arrayList.get(i)).a(this, uhVar);
        }
    }

    public final void l(by1 by1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f6917c.f18054v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ay1 ay1Var = (ay1) it.next();
            if (ay1Var.f4636b == by1Var) {
                copyOnWriteArrayList.remove(ay1Var);
            }
        }
    }

    public final void m(kw1 kw1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f6918d.f13047w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            jw1 jw1Var = (jw1) it.next();
            if (jw1Var.f7556a == kw1Var) {
                copyOnWriteArrayList.remove(jw1Var);
            }
        }
    }

    public final void n(zx1 zx1Var, tu1 tu1Var, a0 a0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z3 = true;
        if (looper != null && looper != myLooper) {
            z3 = false;
        }
        b80.l(z3);
        this.f6920g = tu1Var;
        this.f6921h = a0Var;
        uh uhVar = this.f6919f;
        this.f6915a.add(zx1Var);
        if (this.e == null) {
            this.e = myLooper;
            this.f6916b.add(zx1Var);
            a0Var.getClass();
            h(a0Var);
            return;
        }
        if (uhVar != null) {
            o(zx1Var);
            zx1Var.a(this, uhVar);
        }
    }

    public final void o(zx1 zx1Var) {
        this.e.getClass();
        HashSet hashSet = this.f6916b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zx1Var);
        if (isEmpty) {
            g();
        }
    }

    public final void p(zx1 zx1Var) {
        HashSet hashSet = this.f6916b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(zx1Var);
        if (!isEmpty && hashSet.isEmpty()) {
            i();
        }
    }

    public final void q(zx1 zx1Var) {
        ArrayList arrayList = this.f6915a;
        arrayList.remove(zx1Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f6919f = null;
            this.f6920g = null;
            this.f6916b.clear();
            j();
            return;
        }
        p(zx1Var);
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }
}
