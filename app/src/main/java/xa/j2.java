package xa;

/* loaded from: classes.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f30437a;

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f30438b;

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f30439c;

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f30440d;

    static {
        boolean z3;
        j1 j1Var;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f30437a = z3;
        if (z3) {
            f30438b = h2.f30425c;
            f30439c = h2.f30426d;
            j1Var = i2.f30430c;
        } else {
            j1Var = null;
            f30438b = null;
            f30439c = null;
        }
        f30440d = j1Var;
    }
}
