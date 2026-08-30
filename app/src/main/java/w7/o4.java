package w7;
import r0.m;
import r0.r;
import z.b;

/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements df.r {
    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z3;
        ((Integer) obj2).intValue();
        m mVar = (m) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((b) obj).getClass();
        if ((intValue & 129) != 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            n4.M0(0, rVar);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
