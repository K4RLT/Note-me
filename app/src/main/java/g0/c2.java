package g0;
import m.h;
import t.z0;

/* loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public static final c2 f17034u = new kotlin.jvm.internal.m(2);

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        d2 d2Var = (d2) obj2;
        Float valueOf = Float.valueOf(d2Var.f17047a.h());
        if (((z0) d2Var.f17051f.getValue()) == z0.f25597u) {
            z3 = true;
        } else {
            z3 = false;
        }
        return qe.h(valueOf, Boolean.valueOf(z3));
    }
}
