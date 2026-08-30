package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Set;

/* loaded from: classes.dex */
public final class ba extends nw {
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nw
    public final int a(ha haVar) {
        int i;
        synchronized (haVar) {
            i = haVar.C - 1;
            haVar.C = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nw
    public final void n(ha haVar, Set set) {
        synchronized (haVar) {
            try {
                if (haVar.B == null) {
                    haVar.B = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
