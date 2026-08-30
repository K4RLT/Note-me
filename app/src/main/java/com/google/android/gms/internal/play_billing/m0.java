package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, k0 k0Var, long j10, Object obj, Object obj2) {
        while (!l0.a(unsafe, k0Var, j10, obj, obj2)) {
            if (unsafe.getObject(k0Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
