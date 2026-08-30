package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nv1 extends Exception {

    /* renamed from: u, reason: collision with root package name */
    public final int f8875u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8876v;

    /* renamed from: w, reason: collision with root package name */
    public final mw1 f8877w;

    public nv1(int i, mw1 mw1Var, boolean z3) {
        super(a5.a.f(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.f8876v = z3;
        this.f8875u = i;
        this.f8877w = mw1Var;
    }
}
