package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vt0 {

    /* renamed from: u, reason: collision with root package name */
    public static final vt0 f11982u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ vt0[] f11983v;

    /* JADX INFO: Fake field, exist only in values array */
    vt0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.vt0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.vt0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.vt0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.vt0, java.lang.Enum] */
    static {
        vt0 r02 = new Enum("VIDEO_CONTROLS", 0);
        vt0 r12 = new Enum("CLOSE_AD", 1);
        vt0 r22 = new Enum("NOT_VISIBLE", 2);
        f11982u = r22;
        f11983v = new vt0[]{r02, r12, r22, new Enum("OTHER", 3)};
    }

    public static vt0[] values() {
        return (vt0[]) f11983v.clone();
    }
}
