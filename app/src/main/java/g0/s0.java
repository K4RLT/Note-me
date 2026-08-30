package g0;
import g0.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: u, reason: collision with root package name */
    public static final s0 f17275u;

    /* renamed from: v, reason: collision with root package name */
    public static final s0 f17276v;

    /* renamed from: w, reason: collision with root package name */
    public static final s0 f17277w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ s0[] f17278x;

    /* JADX WARN: Type inference failed for: r0v0, types: [g0.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g0.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [g0.s0, java.lang.Enum] */
    static {
        s0 r02 = new Enum("None", 0);
        f17275u = r02;
        s0 r12 = new Enum("Selection", 1);
        f17276v = r12;
        s0 r22 = new Enum("Cursor", 2);
        f17277w = r22;
        f17278x = new s0[]{r02, r12, r22};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f17278x.clone();
    }
}