package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class sa extends m9 implements Runnable {
    public ya B;

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        ya yaVar = this.B;
        if (yaVar != null) {
            return p.a.k("delegate=[", yaVar.toString(), "]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void e() {
        this.B = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ya yaVar = this.B;
        if (yaVar != null) {
            f(yaVar);
        }
    }
}
