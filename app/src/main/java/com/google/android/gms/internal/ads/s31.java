package com.google.android.gms.internal.ads;
import p.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s31 implements Serializable, r31 {

    /* renamed from: u, reason: collision with root package name */
    public final transient v31 f10486u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final r31 f10487v;

    /* renamed from: w, reason: collision with root package name */
    public volatile transient boolean f10488w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object f10489x;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.v31, java.lang.Object] */
    public s31(r31 r31Var) {
        this.f10487v = r31Var;
    }

    public final String toString() {
        Object obj;
        if (this.f10488w) {
            String valueOf = String.valueOf(this.f10489x);
            obj = p.a.o(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f10487v;
        }
        String obj2 = obj.toString();
        return p.a.o(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    @Override // com.google.android.gms.internal.ads.r31
    public final Object zza() {
        if (!this.f10488w) {
            synchronized (this.f10486u) {
                try {
                    if (!this.f10488w) {
                        Object zza = this.f10487v.zza();
                        this.f10489x = zza;
                        this.f10488w = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f10489x;
    }
}
