package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o01 {
    public static final /* synthetic */ o01[] A;

    /* renamed from: u, reason: collision with root package name */
    public static final o01 f8901u;

    /* renamed from: v, reason: collision with root package name */
    public static final o01 f8902v;

    /* renamed from: w, reason: collision with root package name */
    public static final o01 f8903w;

    /* renamed from: x, reason: collision with root package name */
    public static final o01 f8904x;

    /* renamed from: y, reason: collision with root package name */
    public static final o01 f8905y;

    /* renamed from: z, reason: collision with root package name */
    public static final o01 f8906z;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.o01, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.o01, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.o01, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.o01, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.o01, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.o01, java.lang.Enum] */
    static {
        ?? r02 = new Enum("RESULT_UNKNOWN", 0);
        f8901u = r02;
        ?? r12 = new Enum("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        f8902v = r12;
        ?? r22 = new Enum("RESULT_UPDATED", 2);
        f8903w = r22;
        ?? r32 = new Enum("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        f8904x = r32;
        ?? r42 = new Enum("RESULT_FAILURE_INVALID_RESPONSE", 4);
        f8905y = r42;
        ?? r52 = new Enum("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f8906z = r52;
        A = new o01[]{r02, r12, r22, r32, r42, r52};
    }

    public static o01[] values() {
        return (o01[]) A.clone();
    }
}
