package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes.dex */
public final class tu1 {

    /* renamed from: c, reason: collision with root package name */
    public static final tu1 f11450c;

    /* renamed from: a, reason: collision with root package name */
    public final String f11451a;

    /* renamed from: b, reason: collision with root package name */
    public final lt0 f11452b;

    static {
        new tu1("");
        f11450c = new tu1("preload");
    }

    public tu1(String str) {
        lt0 lt0Var;
        LogSessionId logSessionId;
        this.f11451a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            lt0Var = new lt0(12);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            lt0Var.f8135v = logSessionId;
        } else {
            lt0Var = null;
        }
        this.f11452b = lt0Var;
    }
}
