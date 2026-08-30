package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: u, reason: collision with root package name */
    public static final t0 f31890u;

    /* renamed from: v, reason: collision with root package name */
    public static final t0 f31891v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ t0[] f31892w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z1.t0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z1.t0] */
    static {
        t0 r02 = new Enum("Width", 0);
        f31890u = r02;
        t0 r12 = new Enum("Height", 1);
        f31891v = r12;
        f31892w = new t0[]{r02, r12};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f31892w.clone();
    }
}