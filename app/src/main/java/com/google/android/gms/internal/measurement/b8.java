package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13661a;

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f13662b;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        dVar.h("measurement.client.sessions.background_sessions_enabled", true);
        f13661a = dVar.h("measurement.client.sessions.enable_fix_background_engagement", false);
        dVar.h("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f13662b = dVar.h("measurement.client.sessions.enable_pause_engagement_in_background", true);
        dVar.h("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        dVar.h("measurement.client.sessions.session_id_enabled", true);
        dVar.f(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
