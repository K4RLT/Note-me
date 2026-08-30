package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final u f13573u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ u[] f13574v;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.gms.internal.consent_sdk.u, java.lang.Enum] */
    static {
        u r02 = new Enum("DEBUG_PARAM_UNKNOWN", 0);
        u r12 = new Enum("ALWAYS_SHOW", 1);
        u r22 = new Enum("GEO_OVERRIDE_EEA", 2);
        u r32 = new Enum("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        u r42 = new Enum("GEO_OVERRIDE_OTHER", 4);
        u r52 = new Enum("GEO_OVERRIDE_NON_EEA", 5);
        u r62 = new Enum("PREVIEWING_DEBUG_MESSAGES", 6);
        f13573u = r62;
        f13574v = new u[]{r02, r12, r22, r32, r42, r52, r62, new Enum("GEO_OVERRIDE_USFL", 7)};
    }

    public static u[] values() {
        return (u[]) f13574v.clone();
    }
}