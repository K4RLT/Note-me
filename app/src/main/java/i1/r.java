package i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: u, reason: collision with root package name */
    public static final r f18130u;

    /* renamed from: v, reason: collision with root package name */
    public static final r f18131v;

    /* renamed from: w, reason: collision with root package name */
    public static final r f18132w;

    /* renamed from: x, reason: collision with root package name */
    public static final r f18133x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r[] f18134y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i1.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i1.r] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i1.r] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, i1.r] */
    static {
        r r02 = new Enum("Active", 0);
        f18130u = r02;
        r r12 = new Enum("ActiveParent", 1);
        f18131v = r12;
        r r22 = new Enum("Captured", 2);
        f18132w = r22;
        r r32 = new Enum("Inactive", 3);
        f18133x = r32;
        f18134y = new r[]{r02, r12, r22, r32};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f18134y.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        l4.a.o();
        return false;
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        l4.a.o();
                        return false;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}