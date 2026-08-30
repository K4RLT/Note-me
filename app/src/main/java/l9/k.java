package l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: u, reason: collision with root package name */
    public static final k f20054u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f20055v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f20056w;

    /* renamed from: x, reason: collision with root package name */
    public static final k f20057x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ k[] f20058y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l9.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l9.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l9.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l9.k] */
    static {
        k r02 = new Enum("SUCCESS", 0);
        f20054u = r02;
        k r12 = new Enum("PERMANENT_FAILURE", 1);
        f20055v = r12;
        k r22 = new Enum("RETRIABLE_FAILURE", 2);
        f20056w = r22;
        k r32 = new Enum("BUFFERED", 3);
        f20057x = r32;
        f20058y = new k[]{r02, r12, r22, r32};
    }

    public static k[] values() {
        return (k[]) f20058y.clone();
    }
}