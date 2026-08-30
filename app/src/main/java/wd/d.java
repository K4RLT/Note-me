package wd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: u, reason: collision with root package name */
    public static final d f29890u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f29891v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f29892w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wd.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wd.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wd.d] */
    static {
        d r02 = new Enum("CRASHLYTICS", 0);
        f29890u = r02;
        d r12 = new Enum("PERFORMANCE", 1);
        f29891v = r12;
        f29892w = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f29892w.clone();
    }
}