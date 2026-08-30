package ya;
import ya.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final u f31520u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ u[] f31521v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ya.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ya.u] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ya.u] */
    static {
        u r02 = new Enum("DEFAULT", 0);
        f31520u = r02;
        f31521v = new u[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static u[] values() {
        return (u[]) f31521v.clone();
    }
}