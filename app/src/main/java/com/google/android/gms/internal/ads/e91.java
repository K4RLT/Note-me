package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class e91 extends TimeoutException {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5623u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e91(String str, int i) {
        super(str);
        this.f5623u = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f5623u;
        synchronized (this) {
            switch (i) {
                case 0:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                default:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
            }
        }
    }
}
