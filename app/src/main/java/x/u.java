package x;
import x.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final u f30003u;

    /* renamed from: v, reason: collision with root package name */
    public static final u f30004v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f30005w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ u[] f30006x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x.u] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x.u] */
    static {
        u r02 = new Enum("Vertical", 0);
        f30003u = r02;
        u r12 = new Enum("Horizontal", 1);
        f30004v = r12;
        u r22 = new Enum("Both", 2);
        f30005w = r22;
        f30006x = new u[]{r02, r12, r22};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f30006x.clone();
    }
}