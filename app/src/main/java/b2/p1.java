package b2;
import b2.p1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: u, reason: collision with root package name */
    public static final p1 f1575u;

    /* renamed from: v, reason: collision with root package name */
    public static final p1 f1576v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ p1[] f1577w;

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.p1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [b2.p1, java.lang.Enum] */
    static {
        p1 r02 = new Enum("Width", 0);
        f1575u = r02;
        p1 r12 = new Enum("Height", 1);
        f1576v = r12;
        f1577w = new p1[]{r02, r12};
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) f1577w.clone();
    }
}