package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13988a;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        dVar.h("measurement.collection.enable_session_stitching_token.client.dev", true);
        dVar.h("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f13988a = dVar.h("measurement.session_stitching_token_enabled", false);
        dVar.h("measurement.link_sst_to_sid", true);
    }
}
