package wa;
import wa.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: u, reason: collision with root package name */
    public static final c f29579u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c[] f29580v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wa.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wa.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wa.c] */
    static {
        c r02 = new Enum("DEFAULT", 0);
        f29579u = r02;
        f29580v = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f29580v.clone();
    }
}