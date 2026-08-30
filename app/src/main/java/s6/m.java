package s6;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24968u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f24969v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i) {
        super(0);
        this.f24968u = i;
        this.f24969v = nVar;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f24968u) {
            case 0:
                n nVar = this.f24969v;
                if (((o6.a) nVar.f24971v.getValue()) == null && ((Throwable) nVar.f24972w.getValue()) == null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 1:
                if (((Throwable) this.f24969v.f24972w.getValue()) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 2:
                n nVar2 = this.f24969v;
                if (((o6.a) nVar2.f24971v.getValue()) == null && ((Throwable) nVar2.f24972w.getValue()) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (((o6.a) this.f24969v.f24971v.getValue()) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }
}
