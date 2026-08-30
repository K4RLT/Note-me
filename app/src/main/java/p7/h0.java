package p7;
import r0.m;
import r0.y;

import w7.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22488u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f22489v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f22490w;

    public /* synthetic */ h0(int i, String str, boolean z3) {
        this.f22488u = 2;
        this.f22490w = z3;
        this.f22489v = str;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22488u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(1);
                m0.c((e0) this.f22489v, this.f22490w, (m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int L2 = y.L(1);
                m0.c((e0) this.f22489v, this.f22490w, (m) obj, L2);
                break;
            default:
                ((Integer) obj2).getClass();
                int L3 = y.L(1);
                h8.d(this.f22490w, (String) this.f22489v, (m) obj, L3);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ h0(e0 e0Var, boolean z3, int i, int i10) {
        this.f22488u = i10;
        this.f22489v = e0Var;
        this.f22490w = z3;
    }
}
