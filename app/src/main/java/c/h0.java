package c;
import a0.f0;
import c.y;

/* loaded from: classes.dex */
public final class h0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3241d = 1;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c3.a aVar) {
        super(true);
        this.e = aVar;
    }

    @Override // y
    public final void a() {
        switch (this.f3241d) {
            case 0:
                ((c3.a) this.e).invoke(this);
                return;
            default:
                ((f0) this.e).s();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var) {
        super(false);
        this.e = f0Var;
    }
}
