package k0;
import j1.b;
import q.l1;
import q.m1;
import q.n;
import q.r0;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n f19395a = new n(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f19396b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f19397c;

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f19398d;

    static {
        o0 o0Var = o0.f19376v;
        o0 o0Var2 = o0.f19377w;
        l1 l1Var = m1.f22948a;
        f19396b = new l1(o0Var, o0Var2);
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        f19397c = floatToRawIntBits;
        f19398d = new r0(new b(floatToRawIntBits));
    }
}
