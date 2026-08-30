package i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: u, reason: collision with root package name */
    public static final b f18095u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f18096v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f18097w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b[] f18098x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i1.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i1.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i1.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, i1.b] */
    static {
        b r02 = new Enum("None", 0);
        f18095u = r02;
        b r12 = new Enum("Cancelled", 1);
        f18096v = r12;
        b r22 = new Enum("Redirected", 2);
        f18097w = r22;
        f18098x = new b[]{r02, r12, r22, new Enum("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18098x.clone();
    }
}