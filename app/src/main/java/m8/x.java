package m8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: u, reason: collision with root package name */
    public static final x f20756u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x[] f20757v;

    /* JADX INFO: Fake field, exist only in values array */
    x EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m8.x] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m8.x] */
    static {
        x r02 = new Enum("UNKNOWN", 0);
        x r12 = new Enum("ANDROID_FIREBASE", 1);
        f20756u = r12;
        f20757v = new x[]{r02, r12};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f20757v.clone();
    }
}