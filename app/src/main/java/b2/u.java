package b2;
import b2.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final u f1598u;

    /* renamed from: v, reason: collision with root package name */
    public static final u f1599v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f1600w;

    /* renamed from: x, reason: collision with root package name */
    public static final u f1601x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ u[] f1602y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b2.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b2.u] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, b2.u] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, b2.u] */
    static {
        u r02 = new Enum("LookaheadMeasurement", 0);
        f1598u = r02;
        u r12 = new Enum("LookaheadPlacement", 1);
        f1599v = r12;
        u r22 = new Enum("Measurement", 2);
        f1600w = r22;
        u r32 = new Enum("Placement", 3);
        f1601x = r32;
        f1602y = new u[]{r02, r12, r22, r32};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f1602y.clone();
    }
}