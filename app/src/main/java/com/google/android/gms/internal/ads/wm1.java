package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class wm1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile wm1 f12302a;

    /* renamed from: b, reason: collision with root package name */
    public static final wm1 f12303b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.wm1] */
    static {
        Object obj = new Object();
        Map map = Collections.EMPTY_MAP;
        f12303b = obj;
    }

    public static wm1 a() {
        wm1 wm1Var = f12302a;
        if (wm1Var != null) {
            return wm1Var;
        }
        synchronized (wm1.class) {
            try {
                wm1 wm1Var2 = f12302a;
                if (wm1Var2 != null) {
                    return wm1Var2;
                }
                int i = em1.f5727a;
                wm1 r8 = an1.r();
                f12302a = r8;
                return r8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}