package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class op {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9185a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9186b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f9187c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f9188d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z3) {
        if (this.f9188d.get()) {
            return this.f9185a;
        }
        return z3;
    }
}
