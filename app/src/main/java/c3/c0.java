package c3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: u, reason: collision with root package name */
    public static final c0 f3757u;

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f3758v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c0[] f3759w;

    /* JADX WARN: Type inference failed for: r0v0, types: [c3.c0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c3.c0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [c3.c0, java.lang.Enum] */
    static {
        c0 r02 = new Enum("Inherit", 0);
        f3757u = r02;
        c0 r12 = new Enum("SecureOn", 1);
        f3758v = r12;
        f3759w = new c0[]{r02, r12, new Enum("SecureOff", 2)};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f3759w.clone();
    }
}