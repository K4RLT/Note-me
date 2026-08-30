package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.bj0;

/* loaded from: classes.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final bj0 f13945a;

    static {
        bj0 bj0Var;
        synchronized (w3.class) {
            try {
                if (w3.f13952a == null) {
                    bj0 bj0Var2 = new bj0(3);
                    synchronized (w3.class) {
                        if (w3.f13952a == null) {
                            w3.f13952a = bj0Var2;
                        } else {
                            throw new IllegalStateException("init() already called");
                        }
                    }
                }
                bj0Var = w3.f13952a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f13945a = bj0Var;
    }
}
