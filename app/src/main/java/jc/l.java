package jc;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final l f19157u;

    /* renamed from: v, reason: collision with root package name */
    public static final Handler f19158v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ l[] f19159w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jc.l] */
    static {
        l r02 = new Enum("INSTANCE", 0);
        f19157u = r02;
        f19159w = new l[]{r02};
        f19158v = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f19159w.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f19158v.post(runnable);
    }
}