package wf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: u, reason: collision with root package name */
    public static final b f29901u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f29902v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f29903w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f29904x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f29905y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ b[] f29906z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wf.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wf.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wf.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wf.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, wf.b] */
    static {
        b r02 = new Enum("CPU_ACQUIRED", 0);
        f29901u = r02;
        b r12 = new Enum("BLOCKING", 1);
        f29902v = r12;
        b r22 = new Enum("PARKING", 2);
        f29903w = r22;
        b r32 = new Enum("DORMANT", 3);
        f29904x = r32;
        b r42 = new Enum("TERMINATED", 4);
        f29905y = r42;
        f29906z = new b[]{r02, r12, r22, r32, r42};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f29906z.clone();
    }
}