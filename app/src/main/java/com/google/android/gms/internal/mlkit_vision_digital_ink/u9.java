package com.google.android.gms.internal.mlkit_vision_digital_ink;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u9 {
    public static /* synthetic */ boolean a(Unsafe unsafe, s9 s9Var, long j10, Object obj, Object obj2) {
        while (!t9.a(unsafe, s9Var, j10, obj, obj2)) {
            if (unsafe.getObject(s9Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
