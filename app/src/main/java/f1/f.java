package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: u, reason: collision with root package name */
    public static final f f16647u;

    /* renamed from: v, reason: collision with root package name */
    public static final f f16648v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f[] f16649w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f1.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f1.f] */
    static {
        f r02 = new Enum("VIEW_APPEAR", 0);
        f16647u = r02;
        f r12 = new Enum("VIEW_DISAPPEAR", 1);
        f16648v = r12;
        f16649w = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f16649w.clone();
    }
}