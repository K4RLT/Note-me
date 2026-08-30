package k0;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19212u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f19213v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(o oVar, int i) {
        super(0);
        this.f19212u = i;
        this.f19213v = oVar;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        switch (this.f19212u) {
            case 0:
                if ((this.f19213v.a() & 9223372034707292159L) != 9205357640488583168L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                if ((this.f19213v.a() & 9223372034707292159L) != 9205357640488583168L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}
