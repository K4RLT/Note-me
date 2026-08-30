package g5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: u, reason: collision with root package name */
    public static final t f17530u;

    /* renamed from: v, reason: collision with root package name */
    public static final t f17531v;

    /* renamed from: w, reason: collision with root package name */
    public static final t f17532w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ t[] f17533x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g5.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g5.t] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g5.t] */
    static {
        t r02 = new Enum("AUTOMATIC", 0);
        f17530u = r02;
        t r12 = new Enum("TRUNCATE", 1);
        f17531v = r12;
        t r22 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f17532w = r22;
        f17533x = new t[]{r02, r12, r22};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f17533x.clone();
    }
}