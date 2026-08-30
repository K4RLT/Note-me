package rf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f24769u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f24770v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f24771w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a[] f24772x;

    /* JADX WARN: Type inference failed for: r0v0, types: [rf.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rf.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rf.a, java.lang.Enum] */
    static {
        a r02 = new Enum("SUSPEND", 0);
        f24769u = r02;
        a r12 = new Enum("DROP_OLDEST", 1);
        f24770v = r12;
        a r22 = new Enum("DROP_LATEST", 2);
        f24771w = r22;
        f24772x = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f24772x.clone();
    }
}