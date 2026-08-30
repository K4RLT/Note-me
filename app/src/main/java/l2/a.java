package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f19880u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f19881v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f19882w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l2.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l2.a] */
    static {
        a r02 = new Enum("On", 0);
        f19880u = r02;
        a r12 = new Enum("Off", 1);
        f19881v = r12;
        f19882w = new a[]{r02, r12, new Enum("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19882w.clone();
    }
}