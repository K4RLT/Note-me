package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lu0 {

    /* renamed from: d, reason: collision with root package name */
    public static final lu0 f8151d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f8152a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8153b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8154c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.lu0, java.lang.Object] */
    static {
        com.google.android.gms.internal.ads.lu0 obj = new Object();
        obj.f8153b = false;
        obj.f8154c = false;
        f8151d = obj;
    }

    public final void a(boolean z3, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        if (z9 || z3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f8154c || this.f8153b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            Iterator it = Collections.unmodifiableCollection(eu0.f5810c.f5811a).iterator();
            while (it.hasNext()) {
                nu0 nu0Var = ((tt0) it.next()).f11440d;
                if (z9 || z3) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (nu0Var.f8868b.get() != 0) {
                    if (true != z12) {
                        str = "unlocked";
                    } else {
                        str = "locked";
                    }
                    s6.A.C(nu0Var.c(), "setDeviceLockState", str);
                }
            }
        }
    }
}
