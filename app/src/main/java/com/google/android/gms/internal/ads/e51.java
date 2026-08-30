package com.google.android.gms.internal.ads;
import a5.a;
import g3.a;

/* loaded from: classes.dex */
public final class e51 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5594a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5595b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5596c;

    public e51(Object obj, Object obj2, Object obj3) {
        this.f5594a = obj;
        this.f5595b = obj2;
        this.f5596c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5594a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f5595b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f5596c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + valueOf3.length() + 1 + valueOf4.length());
        a.t(sb2, "Multiple entries with same key: ", valueOf, "=", valueOf2);
        return new IllegalArgumentException(a.l(sb2, " and ", valueOf3, "=", valueOf4));
    }
}
