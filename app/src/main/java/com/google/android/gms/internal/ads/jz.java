package com.google.android.gms.internal.ads;
import f9.k;
import l9.d;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class jz {

    /* renamed from: u, reason: collision with root package name */
    public final Context f7583u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7584v;

    /* renamed from: w, reason: collision with root package name */
    public final WeakReference f7585w;

    public jz(h00 h00Var) {
        Context context = h00Var.getContext();
        this.f7583u = context;
        this.f7584v = f9.k.C.f16813c.E(context, h00Var.A().f20029u);
        this.f7585w = new WeakReference(h00Var);
    }

    public void a() {
    }

    public abstract boolean b(String str);

    public boolean d(String str, String[] strArr) {
        return b(str);
    }

    public boolean f(String str, String[] strArr, bz bzVar) {
        return b(str);
    }

    public void g(int i) {
    }

    public void h(int i) {
    }

    public void j(int i) {
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        l9.d.f20036b.post(new iz(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap hashMap) {
        h00 h00Var = (h00) this.f7585w.get();
        if (h00Var != null) {
            h00Var.b("onPrecacheEvent", hashMap);
        }
    }

    public void i(int i) {
    }
}
