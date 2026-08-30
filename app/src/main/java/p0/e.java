package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: u, reason: collision with root package name */
    public static final e f22317u;

    /* renamed from: v, reason: collision with root package name */
    public static final e f22318v;

    /* renamed from: w, reason: collision with root package name */
    public static final e f22319w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e[] f22320x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p0.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p0.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p0.e] */
    static {
        e r02 = new Enum("Focused", 0);
        f22317u = r02;
        e r12 = new Enum("UnfocusedEmpty", 1);
        f22318v = r12;
        e r22 = new Enum("UnfocusedNotEmpty", 2);
        f22319w = r22;
        f22320x = new e[]{r02, r12, r22};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f22320x.clone();
    }
}