package w7;
import r0.m;
import r0.r;

import android.net.Uri;

/* loaded from: classes.dex */
public final class e6 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28159u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.q f28160v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28161w;

    public /* synthetic */ e6(int i, df.q qVar, Object obj) {
        this.f28159u = i;
        this.f28160v = qVar;
        this.f28161w = obj;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f28159u) {
            case 0:
                this.f28160v.b((ma) this.f28161w, (Float) obj, (Float) obj2);
                return pe.z.f22715a;
            case 1:
                this.f28160v.b((Uri) this.f28161w, (Float) obj, (Float) obj2);
                return pe.z.f22715a;
            default:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    this.f28160v.b((t9) this.f28161w, rVar, 0);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
        }
    }
}
