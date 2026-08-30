package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class cb extends m9 implements Runnable {
    public final Runnable B;

    public cb(Runnable runnable) {
        runnable.getClass();
        this.B = runnable;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        return p.a.k("task=[", this.B.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.B.run();
        } catch (Throwable th) {
            o(th);
            throw th;
        }
    }
}
