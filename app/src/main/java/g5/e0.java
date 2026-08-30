package g5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final e0 f17434u;

    /* renamed from: v, reason: collision with root package name */
    public static final e0 f17435v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e0[] f17436w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g5.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g5.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g5.e0] */
    static {
        e0 r02 = new Enum("DEFERRED", 0);
        f17434u = r02;
        e0 r12 = new Enum("IMMEDIATE", 1);
        f17435v = r12;
        f17436w = new e0[]{r02, r12, new Enum("EXCLUSIVE", 2)};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f17436w.clone();
    }
}