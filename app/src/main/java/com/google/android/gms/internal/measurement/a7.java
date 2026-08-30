package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13640a;

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f13641b;

    /* renamed from: c, reason: collision with root package name */
    public static final k4 f13642c;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        dVar.h("measurement.client.ad_id_consent_fix", true);
        dVar.h("measurement.service.consent.aiid_reset_fix", false);
        dVar.h("measurement.service.consent.aiid_reset_fix2", true);
        f13640a = dVar.h("measurement.service.consent.app_start_fix", true);
        f13641b = dVar.h("measurement.service.consent.params_on_fx", true);
        f13642c = dVar.h("measurement.service.consent.pfo_on_fx", true);
    }
}
