package pe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    public static final h f22690u;

    /* renamed from: v, reason: collision with root package name */
    public static final h f22691v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h[] f22692w;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pe.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pe.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pe.h] */
    static {
        h r02 = new Enum("SYNCHRONIZED", 0);
        h r12 = new Enum("PUBLICATION", 1);
        f22690u = r12;
        h r22 = new Enum("NONE", 2);
        f22691v = r22;
        f22692w = new h[]{r02, r12, r22};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f22692w.clone();
    }
}