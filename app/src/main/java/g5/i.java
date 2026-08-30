package g5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: u, reason: collision with root package name */
    public static final i f17453u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f17454v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f17455w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i[] f17456x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g5.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g5.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g5.i] */
    static {
        i r02 = new Enum("NO_OP", 0);
        f17453u = r02;
        i r12 = new Enum("ADD", 1);
        f17454v = r12;
        i r22 = new Enum("REMOVE", 2);
        f17455w = r22;
        f17456x = new i[]{r02, r12, r22};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f17456x.clone();
    }
}