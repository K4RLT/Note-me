package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, z71 z71Var, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(z71Var, j10, obj, obj2)) {
            if (unsafe.getObject(z71Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
