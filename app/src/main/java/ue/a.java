package ue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f27192u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f27193v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f27194w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a[] f27195x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ue.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ue.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ue.a] */
    static {
        a r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f27192u = r02;
        a r12 = new Enum("UNDECIDED", 1);
        f27193v = r12;
        a r22 = new Enum("RESUMED", 2);
        f27194w = r22;
        f27195x = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27195x.clone();
    }
}