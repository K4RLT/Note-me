package b2;
import b2.t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: u, reason: collision with root package name */
    public static final t0 f1594u;

    /* renamed from: v, reason: collision with root package name */
    public static final t0 f1595v;

    /* renamed from: w, reason: collision with root package name */
    public static final t0 f1596w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ t0[] f1597x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b2.t0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b2.t0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, b2.t0] */
    static {
        t0 r02 = new Enum("IsPlacedInLookahead", 0);
        f1594u = r02;
        t0 r12 = new Enum("IsPlacedInApproach", 1);
        f1595v = r12;
        t0 r22 = new Enum("IsNotPlaced", 2);
        f1596w = r22;
        f1597x = new t0[]{r02, r12, r22};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f1597x.clone();
    }
}