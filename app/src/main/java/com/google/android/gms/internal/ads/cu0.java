package com.google.android.gms.internal.ads;
import ac.b;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cu0 implements fu0 {
    public static final cu0 e = new cu0(new Object());

    /* renamed from: a, reason: collision with root package name */
    public boolean f5171a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5172b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5173c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5174d;

    public cu0(zd1 zd1Var, hx0 hx0Var, po0 po0Var) {
        this.f5171a = false;
        this.f5172b = false;
        this.f5173c = po0Var;
        b C = ((jk0) hx0Var.f6914v).C(po0Var.f9567b, po0Var.f9566a, null);
        lr lrVar = new lr(this, hx0Var, zd1Var, po0Var, 5);
        Executor executor = po0Var.e;
        this.f5174d = ed1.U(ed1.c0(C, lrVar, executor), Exception.class, new dq(this, hx0Var), executor);
    }

    @Override // com.google.android.gms.internal.ads.fu0
    public void a(boolean z3) {
        Date date;
        if (!this.f5172b && z3) {
            Date date2 = new Date();
            Date date3 = (Date) this.f5173c;
            if (date3 == null || date2.after(date3)) {
                this.f5173c = date2;
                if (this.f5171a) {
                    Iterator it = Collections.unmodifiableCollection(eu0.f5810c.f5812b).iterator();
                    while (it.hasNext()) {
                        nu0 nu0Var = ((tt0) it.next()).f11440d;
                        Date date4 = (Date) this.f5173c;
                        if (date4 != null) {
                            date = (Date) date4.clone();
                        } else {
                            date = null;
                        }
                        nu0Var.f(date);
                    }
                }
            }
        }
        this.f5172b = z3;
    }

    public cu0(gu0 gu0Var) {
        this.f5174d = gu0Var;
    }
}
