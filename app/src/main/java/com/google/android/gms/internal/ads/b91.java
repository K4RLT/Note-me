package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b91 extends q71 implements Runnable {
    public final Runnable B;

    public b91(Runnable runnable) {
        runnable.getClass();
        this.B = runnable;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String h() {
        String obj = this.B.toString();
        return p.a.o(new StringBuilder(obj.length() + 7), "task=[", obj, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.B.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
