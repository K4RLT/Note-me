package cd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: u, reason: collision with root package name */
    public static final d f4085u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f4086v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cd.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cd.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cd.d] */
    static {
        d r02 = new Enum("DEFAULT", 0);
        f4085u = r02;
        f4086v = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4086v.clone();
    }
}