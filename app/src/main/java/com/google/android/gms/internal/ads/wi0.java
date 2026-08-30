package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wi0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12247a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik0 f12249c;

    public wi0(ik0 ik0Var, z zVar, Executor executor) {
        this.f12249c = ik0Var;
        this.f12247a = new WeakReference(zVar);
        this.f12248b = executor;
    }
}
