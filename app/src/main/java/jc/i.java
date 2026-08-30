package jc;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final i f19147u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i[] f19148v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jc.i] */
    static {
        i r02 = new Enum("INSTANCE", 0);
        f19147u = r02;
        f19148v = new i[]{r02};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f19148v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}