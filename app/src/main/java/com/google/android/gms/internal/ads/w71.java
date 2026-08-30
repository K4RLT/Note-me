package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class w71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, r71 r71Var, long j10, o71 o71Var, o71 o71Var2) {
        while (!unsafe.compareAndSwapObject(r71Var, j10, o71Var, o71Var2)) {
            if (unsafe.getObject(r71Var, j10) != o71Var) {
                return false;
            }
        }
        return true;
    }
}
