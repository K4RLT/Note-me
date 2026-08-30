package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: u, reason: collision with root package name */
    public static final b f27690u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f27691v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b[] f27692w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w1.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w1.b] */
    static {
        b r02 = new Enum("Lsq2", 0);
        f27690u = r02;
        b r12 = new Enum("Impulse", 1);
        f27691v = r12;
        f27692w = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f27692w.clone();
    }
}