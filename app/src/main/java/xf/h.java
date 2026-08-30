package xf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    public static final h f30790u;

    /* renamed from: v, reason: collision with root package name */
    public static final h f30791v;

    /* renamed from: w, reason: collision with root package name */
    public static final h f30792w;

    /* renamed from: x, reason: collision with root package name */
    public static final h f30793x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ h[] f30794y;

    /* JADX WARN: Type inference failed for: r0v0, types: [xf.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xf.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xf.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xf.h, java.lang.Enum] */
    static {
        h r02 = new Enum("SUCCESSFUL", 0);
        f30790u = r02;
        h r12 = new Enum("REREGISTER", 1);
        f30791v = r12;
        h r22 = new Enum("CANCELLED", 2);
        f30792w = r22;
        h r32 = new Enum("ALREADY_SELECTED", 3);
        f30793x = r32;
        f30794y = new h[]{r02, r12, r22, r32};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f30794y.clone();
    }
}