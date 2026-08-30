package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, z71 z71Var, long j10, y71 y71Var, y71 y71Var2) {
        while (!unsafe.compareAndSwapObject(z71Var, j10, y71Var, y71Var2)) {
            if (unsafe.getObject(z71Var, j10) != y71Var) {
                return false;
            }
        }
        return true;
    }
}
