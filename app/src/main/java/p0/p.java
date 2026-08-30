package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: u, reason: collision with root package name */
    public static final p f22350u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ p[] f22351v;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [p0.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p0.p, java.lang.Enum] */
    static {
        p r02 = new Enum("Filled", 0);
        p r12 = new Enum("Outlined", 1);
        f22350u = r12;
        f22351v = new p[]{r02, r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f22351v.clone();
    }
}