package r;
import r.u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final u0 f24148u;

    /* renamed from: v, reason: collision with root package name */
    public static final u0 f24149v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u0[] f24150w;

    /* JADX WARN: Type inference failed for: r0v0, types: [r.u0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r.u0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r.u0, java.lang.Enum] */
    static {
        u0 r02 = new Enum("Default", 0);
        f24148u = r02;
        u0 r12 = new Enum("UserInput", 1);
        f24149v = r12;
        f24150w = new u0[]{r02, r12, new Enum("PreventUserInput", 2)};
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f24150w.clone();
    }
}