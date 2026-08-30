package com.google.android.gms.internal.ads;
import ac.b;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a21 implements y11, ny0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4324a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4325b;

    /* renamed from: c, reason: collision with root package name */
    public final h21 f4326c;

    /* renamed from: d, reason: collision with root package name */
    public final wx f4327d;
    public final rx0 e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4328f;

    /* renamed from: g, reason: collision with root package name */
    public b f4329g;

    public a21(Context context, h21 h21Var, rx0 rx0Var, wx wxVar) {
        this.f4324a = 0;
        this.f4328f = new AtomicBoolean(false);
        this.f4329g = ed1.e("E");
        this.f4325b = context;
        this.f4326c = h21Var;
        this.e = rx0Var;
        this.f4327d = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void a(HashMap hashMap) {
        switch (this.f4324a) {
            case 0:
                d(hashMap);
                return;
            default:
                hashMap.put("gs", this.f4329g);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void b(HashMap hashMap) {
        switch (this.f4324a) {
            case 0:
                d(hashMap);
                return;
            default:
                hashMap.put("gs", this.f4329g);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void c(HashMap hashMap, Context context, View view) {
        switch (this.f4324a) {
            case 0:
                d(hashMap);
                return;
            default:
                hashMap.put("gs", this.f4329g);
                return;
        }
    }

    public void d(HashMap hashMap) {
        synchronized (this) {
            hashMap.put("ai", this.f4329g);
        }
    }

    @Override // com.google.android.gms.internal.ads.ny0
    public final b zza() {
        switch (this.f4324a) {
            case 0:
                if (this.f4328f.getAndSet(true)) {
                    return v81.f11836v;
                }
                return this.f4327d.j(new bo0(8, this));
            default:
                if (!this.f4328f.getAndSet(true) && this.e.R()) {
                    return this.f4327d.f(new qu0(6, this));
                }
                return v81.f11836v;
        }
    }

    public a21(Context context, h21 h21Var, wx wxVar, rx0 rx0Var) {
        this.f4324a = 1;
        this.f4328f = new AtomicBoolean(false);
        this.f4329g = v81.f11836v;
        this.f4325b = context;
        this.f4326c = h21Var;
        this.f4327d = wxVar;
        this.e = rx0Var;
    }
}
