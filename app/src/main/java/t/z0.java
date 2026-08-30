package t;
import t.z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: u, reason: collision with root package name */
    public static final z0 f25597u;

    /* renamed from: v, reason: collision with root package name */
    public static final z0 f25598v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ z0[] f25599w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t.z0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t.z0] */
    static {
        z0 r02 = new Enum("Vertical", 0);
        f25597u = r02;
        z0 r12 = new Enum("Horizontal", 1);
        f25598v = r12;
        f25599w = new z0[]{r02, r12};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f25599w.clone();
    }
}