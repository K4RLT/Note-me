package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class fa implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14305a;

    public /* synthetic */ fa(int i) {
        this.f14305a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14305a) {
            case 0:
                return null;
            case 1:
                HashMap hashMap = sl.f14972g;
                Log.i("MddModelManager", "registerFileGroups(): Done.");
                return Boolean.TRUE;
            case 2:
            case 3:
            default:
                return null;
        }
    }
}
