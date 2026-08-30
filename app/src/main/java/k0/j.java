package k0;
import k0.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: u, reason: collision with root package name */
    public static final j f19310u;

    /* renamed from: v, reason: collision with root package name */
    public static final j f19311v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f19312w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j[] f19313x;

    /* JADX WARN: Type inference failed for: r0v0, types: [k0.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k0.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k0.j, java.lang.Enum] */
    static {
        j r02 = new Enum("BEFORE", 0);
        f19310u = r02;
        j r12 = new Enum("ON", 1);
        f19311v = r12;
        j r22 = new Enum("AFTER", 2);
        f19312w = r22;
        f19313x = new j[]{r02, r12, r22};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f19313x.clone();
    }
}