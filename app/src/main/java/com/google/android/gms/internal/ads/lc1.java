package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class lc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f8011a = Logger.getLogger(lc1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f8012b = new AtomicBoolean(false);

    public static boolean a() {
        if (f8012b.get()) {
            return true;
        }
        return false;
    }
}
