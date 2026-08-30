package g0;
import g0.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: u, reason: collision with root package name */
    public static final r0 f17268u;

    /* renamed from: v, reason: collision with root package name */
    public static final r0 f17269v;

    /* renamed from: w, reason: collision with root package name */
    public static final r0 f17270w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ r0[] f17271x;

    /* JADX WARN: Type inference failed for: r0v0, types: [g0.r0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g0.r0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [g0.r0, java.lang.Enum] */
    static {
        r0 r02 = new Enum("Cursor", 0);
        f17268u = r02;
        r0 r12 = new Enum("SelectionStart", 1);
        f17269v = r12;
        r0 r22 = new Enum("SelectionEnd", 2);
        f17270w = r22;
        f17271x = new r0[]{r02, r12, r22};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f17271x.clone();
    }
}