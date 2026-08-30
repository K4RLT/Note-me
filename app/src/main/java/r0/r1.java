package r0;
import r0.r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r1 {
    public static final /* synthetic */ r1[] A;

    /* renamed from: u, reason: collision with root package name */
    public static final r1 f24361u;

    /* renamed from: v, reason: collision with root package name */
    public static final r1 f24362v;

    /* renamed from: w, reason: collision with root package name */
    public static final r1 f24363w;

    /* renamed from: x, reason: collision with root package name */
    public static final r1 f24364x;

    /* renamed from: y, reason: collision with root package name */
    public static final r1 f24365y;

    /* renamed from: z, reason: collision with root package name */
    public static final r1 f24366z;

    /* JADX WARN: Type inference failed for: r0v0, types: [r0.r1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r0.r1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r0.r1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [r0.r1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [r0.r1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [r0.r1, java.lang.Enum] */
    static {
        r1 r02 = new Enum("ShutDown", 0);
        f24361u = r02;
        r1 r12 = new Enum("ShuttingDown", 1);
        f24362v = r12;
        r1 r22 = new Enum("Inactive", 2);
        f24363w = r22;
        r1 r32 = new Enum("InactivePendingWork", 3);
        f24364x = r32;
        r1 r42 = new Enum("Idle", 4);
        f24365y = r42;
        r1 r52 = new Enum("PendingWork", 5);
        f24366z = r52;
        A = new r1[]{r02, r12, r22, r32, r42, r52};
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) A.clone();
    }
}