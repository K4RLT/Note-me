package k0;
import k0.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: u, reason: collision with root package name */
    public static final i f19302u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f19303v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f19304w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i[] f19305x;

    /* JADX WARN: Type inference failed for: r0v0, types: [k0.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k0.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k0.i, java.lang.Enum] */
    static {
        i r02 = new Enum("CROSSED", 0);
        f19302u = r02;
        i r12 = new Enum("NOT_CROSSED", 1);
        f19303v = r12;
        i r22 = new Enum("COLLAPSED", 2);
        f19304w = r22;
        f19305x = new i[]{r02, r12, r22};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f19305x.clone();
    }
}