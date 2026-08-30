package q;
import q.j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: u, reason: collision with root package name */
    public static final j0 f22930u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j0[] f22931v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, q.j0] */
    static {
        j0 r02 = new Enum("Default", 0);
        f22930u = r02;
        f22931v = new j0[]{r02, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f22931v.clone();
    }
}