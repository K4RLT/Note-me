package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;
import ra.e;

import com.google.android.gms.internal.ads.y81;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class ja {

    /* renamed from: c, reason: collision with root package name */
    public static final y81 f14509c = new y81(ja.class, 1);

    /* renamed from: a, reason: collision with root package name */
    public ra.e f14510a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14511b;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f14509c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", p.a.l("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }
}
