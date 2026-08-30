package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class io0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f7184b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7185a;

    public io0(Handler handler) {
        this.f7185a = handler;
    }

    public static /* synthetic */ void f(fo0 fo0Var) {
        ArrayList arrayList = f7184b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(fo0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fo0 g() {
        fo0 fo0Var;
        ArrayList arrayList = f7184b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    fo0Var = new Object();
                } else {
                    fo0Var = (fo0) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fo0Var;
    }

    public final boolean a() {
        return this.f7185a.hasMessages(37);
    }

    public final fo0 b(int i, Object obj) {
        fo0 g8 = g();
        g8.f6137a = this.f7185a.obtainMessage(i, obj);
        return g8;
    }

    public final void c(int i) {
        this.f7185a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.f7185a.removeMessages(i);
    }

    public final void e(Runnable runnable) {
        this.f7185a.post(runnable);
    }
}
