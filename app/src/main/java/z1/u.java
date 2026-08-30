package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final u f31893u;

    /* renamed from: v, reason: collision with root package name */
    public static final u f31894v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u[] f31895w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z1.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z1.u] */
    static {
        u r02 = new Enum("Min", 0);
        f31893u = r02;
        u r12 = new Enum("Max", 1);
        f31894v = r12;
        f31895w = new u[]{r02, r12};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f31895w.clone();
    }
}