package v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: u, reason: collision with root package name */
    public static final l f27331u;

    /* renamed from: v, reason: collision with root package name */
    public static final l f27332v;

    /* renamed from: w, reason: collision with root package name */
    public static final l f27333w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ l[] f27334x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.l] */
    static {
        l r02 = new Enum("Initial", 0);
        f27331u = r02;
        l r12 = new Enum("Main", 1);
        f27332v = r12;
        l r22 = new Enum("Final", 2);
        f27333w = r22;
        f27334x = new l[]{r02, r12, r22};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f27334x.clone();
    }
}