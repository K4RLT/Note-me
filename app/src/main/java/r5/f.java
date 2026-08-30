package r5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: u, reason: collision with root package name */
    public static final f f24559u;

    /* renamed from: v, reason: collision with root package name */
    public static final f f24560v;

    /* renamed from: w, reason: collision with root package name */
    public static final f f24561w;

    /* renamed from: x, reason: collision with root package name */
    public static final f f24562x;

    /* renamed from: y, reason: collision with root package name */
    public static final f f24563y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f[] f24564z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r5.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r5.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r5.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r5.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, r5.f] */
    static {
        f r02 = new Enum("ON_CONFIGURE", 0);
        f24559u = r02;
        f r12 = new Enum("ON_CREATE", 1);
        f24560v = r12;
        f r22 = new Enum("ON_UPGRADE", 2);
        f24561w = r22;
        f r32 = new Enum("ON_DOWNGRADE", 3);
        f24562x = r32;
        f r42 = new Enum("ON_OPEN", 4);
        f24563y = r42;
        f24564z = new f[]{r02, r12, r22, r32, r42};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f24564z.clone();
    }
}