package b2;
import b2.e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final e0 f1443u;

    /* renamed from: v, reason: collision with root package name */
    public static final e0 f1444v;

    /* renamed from: w, reason: collision with root package name */
    public static final e0 f1445w;

    /* renamed from: x, reason: collision with root package name */
    public static final e0 f1446x;

    /* renamed from: y, reason: collision with root package name */
    public static final e0 f1447y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e0[] f1448z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b2.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b2.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, b2.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, b2.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, b2.e0] */
    static {
        e0 r02 = new Enum("Measuring", 0);
        f1443u = r02;
        e0 r12 = new Enum("LookaheadMeasuring", 1);
        f1444v = r12;
        e0 r22 = new Enum("LayingOut", 2);
        f1445w = r22;
        e0 r32 = new Enum("LookaheadLayingOut", 3);
        f1446x = r32;
        e0 r42 = new Enum("Idle", 4);
        f1447y = r42;
        f1448z = new e0[]{r02, r12, r22, r32, r42};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f1448z.clone();
    }
}