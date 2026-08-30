package com.google.android.gms.internal.consent_sdk;
import q.x;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f13387a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f13388b = new c0();

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        x.o("Method must be call on main thread.");
    }
}
