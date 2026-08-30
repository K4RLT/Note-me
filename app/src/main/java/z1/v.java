package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: u, reason: collision with root package name */
    public static final v f31898u;

    /* renamed from: v, reason: collision with root package name */
    public static final v f31899v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v[] f31900w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z1.v] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z1.v] */
    static {
        v r02 = new Enum("Width", 0);
        f31898u = r02;
        v r12 = new Enum("Height", 1);
        f31899v = r12;
        f31900w = new v[]{r02, r12};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f31900w.clone();
    }
}