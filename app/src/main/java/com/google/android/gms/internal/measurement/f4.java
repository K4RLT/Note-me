package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* loaded from: classes.dex */
public final class f4 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        k4.i.incrementAndGet();
    }
}
