package c2;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public static final m1 f3577u = new kotlin.jvm.internal.m(2);

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (!rVar.R(intValue & 1, z3)) {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
