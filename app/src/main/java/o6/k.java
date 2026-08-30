package o6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: u, reason: collision with root package name */
    public static final k f21825u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f21826v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o6.k] */
    static {
        k r02 = new Enum("MergePathsApi19", 0);
        f21825u = r02;
        f21826v = new k[]{r02};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f21826v.clone();
    }
}