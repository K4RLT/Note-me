package c2;
import c2.p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: u, reason: collision with root package name */
    public static final p2 f3621u;

    /* renamed from: v, reason: collision with root package name */
    public static final p2 f3622v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ p2[] f3623w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.p2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.p2] */
    static {
        p2 r02 = new Enum("Shown", 0);
        f3621u = r02;
        p2 r12 = new Enum("Hidden", 1);
        f3622v = r12;
        f3623w = new p2[]{r02, r12};
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) f3623w.clone();
    }
}