package com.google.android.gms.internal.ads;
import g3.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vx implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12060a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12062c;

    public vx(String str, int i) {
        this.f12060a = i;
        switch (i) {
            case 1:
                this.f12062c = str;
                this.f12061b = new AtomicInteger(1);
                return;
            default:
                this.f12062c = str;
                this.f12061b = new AtomicInteger(1);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f12060a) {
            case 0:
                int andIncrement = this.f12061b.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f12062c;
                StringBuilder sb2 = new StringBuilder(g3.a.v(str, 12, length));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement);
                return new Thread(runnable, sb2.toString());
            default:
                int andIncrement2 = this.f12061b.getAndIncrement();
                int length2 = String.valueOf(andIncrement2).length();
                String str2 = this.f12062c;
                StringBuilder sb3 = new StringBuilder(g3.a.v(str2, 12, length2));
                sb3.append("AdWorker(");
                sb3.append(str2);
                sb3.append(") #");
                sb3.append(andIncrement2);
                return new Thread(runnable, sb3.toString());
        }
    }
}
