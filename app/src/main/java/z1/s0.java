package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: u, reason: collision with root package name */
    public static final s0 f31887u;

    /* renamed from: v, reason: collision with root package name */
    public static final s0 f31888v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ s0[] f31889w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z1.s0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z1.s0] */
    static {
        s0 r02 = new Enum("Min", 0);
        f31887u = r02;
        s0 r12 = new Enum("Max", 1);
        f31888v = r12;
        f31889w = new s0[]{r02, r12};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f31889w.clone();
    }
}