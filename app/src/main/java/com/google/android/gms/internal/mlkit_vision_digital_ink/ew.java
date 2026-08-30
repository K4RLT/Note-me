package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.h;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ew {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14283a;

    public ew(Context context, int i) {
        boolean z3;
        switch (i) {
            case 1:
                new ConcurrentHashMap();
                if (context != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                pa.h(z3, "Context cannot be null", new Object[0]);
                this.f14283a = context.getApplicationContext();
                return;
            default:
                this.f14283a = context.getApplicationContext();
                return;
        }
    }
}
