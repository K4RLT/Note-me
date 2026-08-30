package p;
import j.c;
import m1.d;
import m1.e;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22197u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f22198v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f22199w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f22200x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22201y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, long j10, long j11, Object obj2, int i) {
        super(1);
        this.f22197u = i;
        this.f22200x = obj;
        this.f22198v = j10;
        this.f22199w = j11;
        this.f22201y = obj2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f22197u) {
            case 0:
                z1.z0 z0Var = (z1.z0) obj;
                z1.a1 a1Var = (z1.a1) this.f22200x;
                long j10 = this.f22198v;
                long j11 = this.f22199w;
                b2.k0 k0Var = (b2.k0) this.f22201y;
                z0Var.getClass();
                z1.z0.b(z0Var, a1Var);
                a1Var.r0(y2.c(((((int) (j10 >> 32)) + ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))) & 4294967295L), a1Var.f31773y), 0.0f, k0Var);
                return pe.z.f22715a;
            default:
                b2.l0 l0Var = (b2.l0) obj;
                l0Var.b();
                d.q(l0Var, (k1.n) this.f22200x, this.f22198v, this.f22199w, 0.0f, (e) this.f22201y, 0, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                return pe.z.f22715a;
        }
    }
}
