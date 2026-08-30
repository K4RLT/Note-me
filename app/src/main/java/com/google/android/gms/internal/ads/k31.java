package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k31 implements i31 {

    /* renamed from: u, reason: collision with root package name */
    public static final k31 f7643u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k31[] f7644v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.gms.internal.ads.k31] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.google.android.gms.internal.ads.k31] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.google.android.gms.internal.ads.k31] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.google.android.gms.internal.ads.k31] */
    static {
        k31 r02 = new Enum("ALWAYS_TRUE", 0);
        f7643u = r02;
        f7644v = new k31[]{r02, new Enum("ALWAYS_FALSE", 1), new Enum("IS_NULL", 2), new Enum("NOT_NULL", 3)};
    }

    public static k31[] values() {
        return (k31[]) f7644v.clone();
    }

    @Override // com.google.android.gms.internal.ads.i31
    public final /* synthetic */ boolean l(Object obj) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}