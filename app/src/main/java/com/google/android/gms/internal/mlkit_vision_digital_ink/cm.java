package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class cm extends tl {
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void g(dm dmVar, dm dmVar2) {
        dmVar.f14193b = dmVar2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void n(dm dmVar, Thread thread) {
        dmVar.f14192a = thread;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean s(em emVar, am amVar, am amVar2) {
        synchronized (emVar) {
            try {
                if (emVar.f14259v == amVar) {
                    emVar.f14259v = amVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean v(em emVar, Object obj, Object obj2) {
        synchronized (emVar) {
            try {
                if (emVar.f14258u == obj) {
                    emVar.f14258u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean x(em emVar, dm dmVar, dm dmVar2) {
        synchronized (emVar) {
            try {
                if (emVar.f14260w == dmVar) {
                    emVar.f14260w = dmVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
