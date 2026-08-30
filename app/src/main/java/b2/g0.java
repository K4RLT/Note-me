package b2;
import b2.g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f1466u;

    /* renamed from: v, reason: collision with root package name */
    public static final g0 f1467v;

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f1468w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g0[] f1469x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b2.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b2.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, b2.g0] */
    static {
        g0 r02 = new Enum("InMeasureBlock", 0);
        f1466u = r02;
        g0 r12 = new Enum("InLayoutBlock", 1);
        f1467v = r12;
        g0 r22 = new Enum("NotUsed", 2);
        f1468w = r22;
        f1469x = new g0[]{r02, r12, r22};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f1469x.clone();
    }
}