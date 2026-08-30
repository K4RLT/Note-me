package q;
import q.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    public static final h f22911u;

    /* renamed from: v, reason: collision with root package name */
    public static final h f22912v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h[] f22913w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q.h] */
    static {
        h r02 = new Enum("BoundReached", 0);
        f22911u = r02;
        h r12 = new Enum("Finished", 1);
        f22912v = r12;
        f22913w = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f22913w.clone();
    }
}