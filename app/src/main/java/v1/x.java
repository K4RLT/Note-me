package v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: u, reason: collision with root package name */
    public static final x f27366u;

    /* renamed from: v, reason: collision with root package name */
    public static final x f27367v;

    /* renamed from: w, reason: collision with root package name */
    public static final x f27368w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x[] f27369x;

    /* JADX WARN: Type inference failed for: r0v0, types: [v1.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v1.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v1.x, java.lang.Enum] */
    static {
        x r02 = new Enum("Unknown", 0);
        f27366u = r02;
        x r12 = new Enum("Dispatching", 1);
        f27367v = r12;
        x r22 = new Enum("NotDispatching", 2);
        f27368w = r22;
        f27369x = new x[]{r02, r12, r22};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f27369x.clone();
    }
}