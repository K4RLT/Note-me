package x2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f30049b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f30050c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f30051d;

    /* renamed from: a, reason: collision with root package name */
    public final float f30052a;

    static {
        a(0.0f);
        a(0.5f);
        f30049b = 0.5f;
        a(-1.0f);
        f30050c = -1.0f;
        a(1.0f);
        f30051d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f) {
            return;
        }
        s2.a.b("topRatio should be in [0..1] range or -1");
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f30049b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f30050c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f30051d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (Float.compare(this.f30052a, ((f) obj).f30052a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30052a);
    }

    public final String toString() {
        return b(this.f30052a);
    }
}
