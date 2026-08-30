package b2;
import b2.o1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: u, reason: collision with root package name */
    public static final o1 f1565u;

    /* renamed from: v, reason: collision with root package name */
    public static final o1 f1566v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ o1[] f1567w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b2.o1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b2.o1] */
    static {
        o1 r02 = new Enum("Min", 0);
        f1565u = r02;
        o1 r12 = new Enum("Max", 1);
        f1566v = r12;
        f1567w = new o1[]{r02, r12};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f1567w.clone();
    }
}