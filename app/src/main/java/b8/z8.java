package b8;
import r0.i0;

/* loaded from: classes.dex */
public final class z8 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.l f3098b;

    public /* synthetic */ z8(int i, df.l lVar) {
        this.f3097a = i;
        this.f3098b = lVar;
    }

    @Override // i0
    public final void a() {
        switch (this.f3097a) {
            case 0:
                this.f3098b.invoke(null);
                return;
            default:
                this.f3098b.invoke(0);
                return;
        }
    }
}
