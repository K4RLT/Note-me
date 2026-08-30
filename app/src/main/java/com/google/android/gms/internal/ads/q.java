package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final hi f9685a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9686b;

    public q(hi hiVar, int[] iArr) {
        if (iArr.length == 0) {
            x21.P("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f9685a = hiVar;
        this.f9686b = iArr;
    }
}
