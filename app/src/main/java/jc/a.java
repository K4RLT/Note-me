package jc;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f19123a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f19124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19125c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f19126d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f19124b = str;
        this.f19125c = i;
        this.f19126d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new b6.g(this, 13, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f19124b + " Thread #" + this.f19123a.getAndIncrement());
        return newThread;
    }
}
