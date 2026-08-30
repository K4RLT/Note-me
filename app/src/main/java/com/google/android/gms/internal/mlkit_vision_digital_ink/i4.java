package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;

/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14457a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14458b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14459c;

    public i4(Object obj, Object obj2, Object obj3) {
        this.f14457a = obj;
        this.f14458b = obj2;
        this.f14459c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f14457a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f14458b);
        return new IllegalArgumentException(p.a.o(p.a.q("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f14459c)));
    }
}
