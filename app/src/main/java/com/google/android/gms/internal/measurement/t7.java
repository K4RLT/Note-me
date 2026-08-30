package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13930a;

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f13931b;

    /* renamed from: c, reason: collision with root package name */
    public static final k4 f13932c;

    /* renamed from: d, reason: collision with root package name */
    public static final k4 f13933d;
    public static final k4 e;

    /* renamed from: f, reason: collision with root package name */
    public static final k4 f13934f;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        f13930a = dVar.h("measurement.test.boolean_flag", false);
        f13931b = dVar.f(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = k4.f13797g;
        f13932c = new k4(dVar, "measurement.test.double_flag", valueOf, 3);
        f13933d = dVar.f(-2L, "measurement.test.int_flag");
        e = dVar.f(-1L, "measurement.test.long_flag");
        f13934f = dVar.g("measurement.test.string_flag", "---");
    }
}
