package s5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: u, reason: collision with root package name */
    public static final c f24912u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f24913v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f24914w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f24915x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f24916y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ c[] f24917z;

    /* JADX WARN: Type inference failed for: r0v0, types: [s5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [s5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [s5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [s5.c, java.lang.Enum] */
    static {
        c r02 = new Enum("END", 0);
        f24912u = r02;
        c r12 = new Enum("ROLLBACK", 1);
        f24913v = r12;
        c r22 = new Enum("BEGIN_EXCLUSIVE", 2);
        f24914w = r22;
        c r32 = new Enum("BEGIN_IMMEDIATE", 3);
        f24915x = r32;
        c r42 = new Enum("BEGIN_DEFERRED", 4);
        f24916y = r42;
        f24917z = new c[]{r02, r12, r22, r32, r42};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f24917z.clone();
    }
}