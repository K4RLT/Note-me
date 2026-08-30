package de;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final m f15854u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m[] f15855v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, de.m] */
    static {
        m r02 = new Enum("INSTANCE", 0);
        f15854u = r02;
        f15855v = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f15855v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e.a().f15838a.post(runnable);
    }
}