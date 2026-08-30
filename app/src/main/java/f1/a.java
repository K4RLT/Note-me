package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f16630u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f16631v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f16632w;

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f1.a, java.lang.Enum] */
    static {
        a r02 = new Enum("SHOW_ORIGINAL", 0);
        f16630u = r02;
        a r12 = new Enum("SHOW_TRANSLATED", 1);
        f16631v = r12;
        f16632w = new a[]{r02, r12};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16632w.clone();
    }
}