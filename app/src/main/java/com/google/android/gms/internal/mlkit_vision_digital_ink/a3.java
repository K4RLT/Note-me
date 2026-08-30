package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a3 implements Serializable, z2 {

    /* renamed from: u, reason: collision with root package name */
    public final transient c3 f14007u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final z2 f14008v;

    /* renamed from: w, reason: collision with root package name */
    public volatile transient boolean f14009w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object f14010x;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.c3, java.lang.Object] */
    public a3(z2 z2Var) {
        z2Var.getClass();
        this.f14008v = z2Var;
    }

    public final String toString() {
        Object obj;
        if (this.f14009w) {
            obj = p.a.k("<supplier that returned ", String.valueOf(this.f14010x), ">");
        } else {
            obj = this.f14008v;
        }
        return p.a.k("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z2
    public final Object zza() {
        if (!this.f14009w) {
            synchronized (this.f14007u) {
                try {
                    if (!this.f14009w) {
                        Object zza = this.f14008v.zza();
                        this.f14010x = zza;
                        this.f14009w = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f14010x;
    }
}
