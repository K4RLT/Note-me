package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes.dex */
public final class w81 extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final x81 f12169u;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f12169u.toString();
    }
}
