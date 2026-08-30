package k0;
import k0.j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: u, reason: collision with root package name */
    public static final j0 f19314u;

    /* renamed from: v, reason: collision with root package name */
    public static final j0 f19315v;

    /* renamed from: w, reason: collision with root package name */
    public static final j0 f19316w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j0[] f19317x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k0.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k0.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k0.j0] */
    static {
        j0 r02 = new Enum("Left", 0);
        f19314u = r02;
        j0 r12 = new Enum("Middle", 1);
        f19315v = r12;
        j0 r22 = new Enum("Right", 2);
        f19316w = r22;
        f19317x = new j0[]{r02, r12, r22};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f19317x.clone();
    }
}