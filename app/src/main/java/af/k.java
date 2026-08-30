package af;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: u, reason: collision with root package name */
    public static final k f379u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f380v;

    /* JADX INFO: Fake field, exist only in values array */
    k EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, af.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, af.k] */
    static {
        k r02 = new Enum("TOP_DOWN", 0);
        k r12 = new Enum("BOTTOM_UP", 1);
        f379u = r12;
        f380v = new k[]{r02, r12};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f380v.clone();
    }
}