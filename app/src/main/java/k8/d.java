package k8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: u, reason: collision with root package name */
    public static final d f19626u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f19627v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f19628w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d[] f19629x;

    /* JADX WARN: Type inference failed for: r0v0, types: [k8.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k8.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k8.d, java.lang.Enum] */
    static {
        d r02 = new Enum("DEFAULT", 0);
        f19626u = r02;
        d r12 = new Enum("VERY_LOW", 1);
        f19627v = r12;
        d r22 = new Enum("HIGHEST", 2);
        f19628w = r22;
        f19629x = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19629x.clone();
    }
}