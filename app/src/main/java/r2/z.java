package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: u, reason: collision with root package name */
    public static final z f24520u;

    /* renamed from: v, reason: collision with root package name */
    public static final z f24521v;

    /* renamed from: w, reason: collision with root package name */
    public static final z f24522w;

    /* renamed from: x, reason: collision with root package name */
    public static final z f24523x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ z[] f24524y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r2.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r2.z] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r2.z] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r2.z] */
    static {
        z r02 = new Enum("StartInput", 0);
        f24520u = r02;
        z r12 = new Enum("StopInput", 1);
        f24521v = r12;
        z r22 = new Enum("ShowKeyboard", 2);
        f24522w = r22;
        z r32 = new Enum("HideKeyboard", 3);
        f24523x = r32;
        f24524y = new z[]{r02, r12, r22, r32};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f24524y.clone();
    }
}