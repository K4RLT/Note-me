package com.google.android.gms.internal.ads;
import a5.a;

/* loaded from: classes.dex */
public final class av1 extends Exception {

    /* renamed from: u, reason: collision with root package name */
    public final int f4617u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4618v;

    public av1(int i, boolean z3) {
        super(a5.a.f(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.f4618v = z3;
        this.f4617u = i;
    }
}
