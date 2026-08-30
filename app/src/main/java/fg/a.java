package fg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f16956u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f16957v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f16958w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fg.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fg.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fg.a] */
    static {
        a r02 = new Enum("NONE", 0);
        f16956u = r02;
        a r12 = new Enum("ALL_JSON_OBJECTS", 1);
        a r22 = new Enum("POLYMORPHIC", 2);
        f16957v = r22;
        f16958w = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16958w.clone();
    }
}