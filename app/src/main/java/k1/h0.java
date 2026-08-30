package k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: u, reason: collision with root package name */
    public static final h0 f19485u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ h0[] f19486v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k1.h0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k1.h0] */
    static {
        h0 r02 = new Enum("CounterClockwise", 0);
        f19485u = r02;
        f19486v = new h0[]{r02, new Enum("Clockwise", 1)};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f19486v.clone();
    }
}