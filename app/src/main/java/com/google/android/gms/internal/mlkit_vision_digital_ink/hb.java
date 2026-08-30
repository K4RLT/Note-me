package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public final class hb extends ma implements RunnableFuture {
    public volatile xa C;

    public hb(da daVar) {
        this.C = new gb(this, daVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        xa xaVar = this.C;
        if (xaVar != null) {
            return p.a.k("task=[", xaVar.toString(), "]");
        }
        return super.d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void e() {
        xa xaVar;
        if (p() && (xaVar = this.C) != null) {
            xaVar.g();
        }
        this.C = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        xa xaVar = this.C;
        if (xaVar != null) {
            xaVar.run();
        }
        this.C = null;
    }

    public hb(Callable callable) {
        this.C = new gb(this, callable);
    }
}
