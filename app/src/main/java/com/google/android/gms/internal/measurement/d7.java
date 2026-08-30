package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d7 {

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13689a;

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f13690b;

    /* renamed from: c, reason: collision with root package name */
    public static final k4 f13691c;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        dVar.h("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f13689a = dVar.h("measurement.audience.refresh_event_count_filters_timestamp", false);
        f13690b = dVar.h("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f13691c = dVar.h("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
