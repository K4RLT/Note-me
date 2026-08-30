package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f22717u;

    /* renamed from: v, reason: collision with root package name */
    public static final a0 f22718v;

    /* renamed from: w, reason: collision with root package name */
    public static final a0 f22719w;

    /* renamed from: x, reason: collision with root package name */
    public static final a0 f22720x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a0[] f22721y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pf.a0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pf.a0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pf.a0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pf.a0] */
    static {
        a0 r02 = new Enum("DEFAULT", 0);
        f22717u = r02;
        a0 r12 = new Enum("LAZY", 1);
        f22718v = r12;
        a0 r22 = new Enum("ATOMIC", 2);
        f22719w = r22;
        a0 r32 = new Enum("UNDISPATCHED", 3);
        f22720x = r32;
        f22721y = new a0[]{r02, r12, r22, r32};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f22721y.clone();
    }
}