package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ia implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final ia f14473u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ ia[] f14474v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.gms.internal.mlkit_vision_digital_ink.ia] */
    static {
        ia r02 = new Enum("INSTANCE", 0);
        f14473u = r02;
        f14474v = new ia[]{r02};
    }

    public static ia[] values() {
        return (ia[]) f14474v.clone();
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