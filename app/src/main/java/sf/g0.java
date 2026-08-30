package sf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f25171u;

    /* renamed from: v, reason: collision with root package name */
    public static final g0 f25172v;

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f25173w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g0[] f25174x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sf.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sf.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sf.g0] */
    static {
        g0 r02 = new Enum("START", 0);
        f25171u = r02;
        g0 r12 = new Enum("STOP", 1);
        f25172v = r12;
        g0 r22 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f25173w = r22;
        f25174x = new g0[]{r02, r12, r22};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f25174x.clone();
    }
}