package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class hu0 {

    /* renamed from: a, reason: collision with root package name */
    public final av0 f6894a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6895b;

    /* renamed from: c, reason: collision with root package name */
    public final vt0 f6896c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6897d = "Ad overlay";

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    public hu0(View view, vt0 vt0Var) {
        this.f6894a = new WeakReference(view);
        this.f6895b = view.getClass().getCanonicalName();
        this.f6896c = vt0Var;
    }
}
