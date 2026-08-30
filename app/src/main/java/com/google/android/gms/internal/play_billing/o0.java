package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final o0 f15497u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o0[] f15498v;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.o0, java.lang.Enum] */
    static {
        o0 r02 = new Enum("INSTANCE", 0);
        f15497u = r02;
        f15498v = new o0[]{r02};
    }

    public static o0[] values() {
        return (o0[]) f15498v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}