package x;
import x.d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: u, reason: collision with root package name */
    public static final d0 f29952u;

    /* renamed from: v, reason: collision with root package name */
    public static final d0 f29953v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d0[] f29954w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x.d0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x.d0] */
    static {
        d0 r02 = new Enum("Min", 0);
        f29952u = r02;
        d0 r12 = new Enum("Max", 1);
        f29953v = r12;
        f29954w = new d0[]{r02, r12};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f29954w.clone();
    }
}