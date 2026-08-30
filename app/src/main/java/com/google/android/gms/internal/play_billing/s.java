package com.google.android.gms.internal.play_billing;
import p.a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15520b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15521c;

    public s(Object obj, Object obj2, Object obj3) {
        this.f15519a = obj;
        this.f15520b = obj2;
        this.f15521c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f15519a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f15520b);
        return new IllegalArgumentException(p.a.o(p.a.q("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f15521c)));
    }
}
