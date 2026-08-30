package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13959a;

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f13960b;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        dVar.h("measurement.dma_consent.client", true);
        dVar.h("measurement.dma_consent.client_bow_check2", true);
        dVar.h("measurement.dma_consent.separate_service_calls_fix", true);
        dVar.h("measurement.dma_consent.service", true);
        f13959a = dVar.h("measurement.dma_consent.service_database_update_fix", true);
        dVar.h("measurement.dma_consent.service_dcu_event", true);
        f13960b = dVar.h("measurement.dma_consent.service_dcu_event2", true);
        dVar.h("measurement.dma_consent.service_npa_remote_default", true);
        dVar.h("measurement.dma_consent.service_split_batch_on_consent", true);
        dVar.h("measurement.dma_consent.set_consent_inline_on_worker", true);
    }
}
