package r0;
import r0.k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: u, reason: collision with root package name */
    public static final k1 f24276u;

    /* renamed from: v, reason: collision with root package name */
    public static final k1 f24277v;

    /* renamed from: w, reason: collision with root package name */
    public static final k1 f24278w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k1[] f24279x;

    /* JADX INFO: Fake field, exist only in values array */
    k1 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r0.k1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r0.k1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r0.k1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r0.k1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, r0.k1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, r0.k1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, r0.k1] */
    static {
        k1 r02 = new Enum("Invalid", 0);
        k1 r12 = new Enum("Cancelled", 1);
        f24276u = r12;
        k1 r22 = new Enum("InitialPending", 2);
        k1 r32 = new Enum("RecomposePending", 3);
        k1 r42 = new Enum("Recomposing", 4);
        f24277v = r42;
        k1 r52 = new Enum("ApplyPending", 5);
        f24278w = r52;
        f24279x = new k1[]{r02, r12, r22, r32, r42, r52, new Enum("Applied", 6)};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f24279x.clone();
    }
}