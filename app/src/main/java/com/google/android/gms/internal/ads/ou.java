package com.google.android.gms.internal.ads;
import l9.i;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class ou implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f9235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu f9236c;

    public /* synthetic */ ou(pu puVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f9234a = i;
        this.f9235b = uncaughtExceptionHandler;
        this.f9236c = puVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f9234a) {
            case 0:
                uncaughtExceptionHandler = this.f9235b;
                try {
                    try {
                        this.f9236c.g(th);
                    } finally {
                    }
                } catch (Throwable unused) {
                    i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            default:
                uncaughtExceptionHandler = this.f9235b;
                try {
                    try {
                        this.f9236c.g(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
