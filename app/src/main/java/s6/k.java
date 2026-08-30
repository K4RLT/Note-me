package s6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: u, reason: collision with root package name */
    public static final k f24964u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f24965v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s6.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s6.k] */
    static {
        k r02 = new Enum("Immediately", 0);
        f24964u = r02;
        f24965v = new k[]{r02, new Enum("OnIterationFinish", 1)};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f24965v.clone();
    }
}