package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: u, reason: collision with root package name */
    public static final j f30057u;

    /* renamed from: v, reason: collision with root package name */
    public static final j f30058v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ j[] f30059w;

    /* JADX WARN: Type inference failed for: r0v0, types: [x2.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x2.j, java.lang.Enum] */
    static {
        j r02 = new Enum("Ltr", 0);
        f30057u = r02;
        j r12 = new Enum("Rtl", 1);
        f30058v = r12;
        f30059w = new j[]{r02, r12};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f30059w.clone();
    }
}