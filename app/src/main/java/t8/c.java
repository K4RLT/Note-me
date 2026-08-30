package t8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: u, reason: collision with root package name */
    public static final c f25668u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f25669v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f25670w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c[] f25671x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t8.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t8.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t8.c] */
    static {
        c r02 = new Enum("NETWORK_UNMETERED", 0);
        f25668u = r02;
        c r12 = new Enum("DEVICE_IDLE", 1);
        f25669v = r12;
        c r22 = new Enum("DEVICE_CHARGING", 2);
        f25670w = r22;
        f25671x = new c[]{r02, r12, r22};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f25671x.clone();
    }
}