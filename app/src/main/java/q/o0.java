package q;
import q.o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: u, reason: collision with root package name */
    public static final o0 f22960u;

    /* renamed from: v, reason: collision with root package name */
    public static final o0 f22961v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ o0[] f22962w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q.o0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q.o0] */
    static {
        o0 r02 = new Enum("Restart", 0);
        f22960u = r02;
        o0 r12 = new Enum("Reverse", 1);
        f22961v = r12;
        f22962w = new o0[]{r02, r12};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f22962w.clone();
    }
}