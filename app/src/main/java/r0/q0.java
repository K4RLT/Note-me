package r0;
import r0.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: u, reason: collision with root package name */
    public static final q0 f24324u;

    /* renamed from: v, reason: collision with root package name */
    public static final q0 f24325v;

    /* renamed from: w, reason: collision with root package name */
    public static final q0 f24326w;

    /* renamed from: x, reason: collision with root package name */
    public static final q0 f24327x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ q0[] f24328y;

    /* JADX WARN: Type inference failed for: r0v0, types: [r0.q0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r0.q0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r0.q0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [r0.q0, java.lang.Enum] */
    static {
        q0 r02 = new Enum("IGNORED", 0);
        f24324u = r02;
        q0 r12 = new Enum("SCHEDULED", 1);
        f24325v = r12;
        q0 r22 = new Enum("DEFERRED", 2);
        f24326w = r22;
        q0 r32 = new Enum("IMMINENT", 3);
        f24327x = r32;
        f24328y = new q0[]{r02, r12, r22, r32};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f24328y.clone();
    }
}