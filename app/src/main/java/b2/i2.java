package b2;
import b2.i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: u, reason: collision with root package name */
    public static final i2 f1501u;

    /* renamed from: v, reason: collision with root package name */
    public static final i2 f1502v;

    /* renamed from: w, reason: collision with root package name */
    public static final i2 f1503w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i2[] f1504x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b2.i2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b2.i2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, b2.i2] */
    static {
        i2 r02 = new Enum("ContinueTraversal", 0);
        f1501u = r02;
        i2 r12 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f1502v = r12;
        i2 r22 = new Enum("CancelTraversal", 2);
        f1503w = r22;
        f1504x = new i2[]{r02, r12, r22};
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) f1504x.clone();
    }
}