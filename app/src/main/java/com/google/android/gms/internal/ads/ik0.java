package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ik0 {

    /* renamed from: f, reason: collision with root package name */
    public static ik0 f7153f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7154a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7155b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7156c;

    /* renamed from: d, reason: collision with root package name */
    public int f7157d;
    public boolean e;

    public ik0(Context context) {
        Executor h3 = b80.h();
        this.f7154a = h3;
        this.f7155b = new CopyOnWriteArrayList();
        this.f7156c = new Object();
        this.f7157d = 0;
        h3.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 21, context));
    }

    public static synchronized ik0 a(Context context) {
        ik0 ik0Var;
        synchronized (ik0.class) {
            try {
                if (f7153f == null) {
                    f7153f = new ik0(context);
                }
                ik0Var = f7153f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ik0Var;
    }

    public final int b() {
        int i;
        synchronized (this.f7156c) {
            i = this.f7157d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7155b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            wi0 wi0Var = (wi0) it.next();
            if (wi0Var.f12247a.get() == null) {
                copyOnWriteArrayList.remove(wi0Var);
            }
        }
        synchronized (this.f7156c) {
            try {
                if (this.e && this.f7157d == i) {
                    return;
                }
                this.e = true;
                this.f7157d = i;
                Iterator it2 = this.f7155b.iterator();
                while (it2.hasNext()) {
                    wi0 wi0Var2 = (wi0) it2.next();
                    wi0Var2.getClass();
                    wi0Var2.f12248b.execute(new e40(17, wi0Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
