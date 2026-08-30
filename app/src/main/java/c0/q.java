package c0;
import b0.x;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3394u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f3395v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pf.z f3396w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(d dVar, pf.z zVar, int i) {
        super(0);
        this.f3394u = i;
        this.f3395v = dVar;
        this.f3396w = zVar;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f3394u) {
            case 0:
                d dVar = this.f3395v;
                if (dVar.b()) {
                    pf.x(this.f3396w, null, new s(dVar, null, 0), 3);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                d dVar2 = this.f3395v;
                if (dVar2.c()) {
                    pf.x(this.f3396w, null, new s(dVar2, null, 1), 3);
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 2:
                d dVar3 = this.f3395v;
                if (dVar3.b()) {
                    pf.x(this.f3396w, null, new s(dVar3, null, 0), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                d dVar4 = this.f3395v;
                if (dVar4.c()) {
                    pf.x(this.f3396w, null, new s(dVar4, null, 1), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }
}
