package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o81 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final o81 f9033u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o81[] f9034v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.gms.internal.ads.o81] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f9033u = r02;
        f9034v = new o81[]{r02};
    }

    public static o81[] values() {
        return (o81[]) f9034v.clone();
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
