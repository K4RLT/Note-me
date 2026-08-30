package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: u, reason: collision with root package name */
    public static final m f30814u;

    /* renamed from: v, reason: collision with root package name */
    public static final m f30815v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ m[] f30816w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y2.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y2.m] */
    static {
        m r02 = new Enum("Ltr", 0);
        f30814u = r02;
        m r12 = new Enum("Rtl", 1);
        f30815v = r12;
        f30816w = new m[]{r02, r12};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f30816w.clone();
    }
}