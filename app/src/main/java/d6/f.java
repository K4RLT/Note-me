package d6;
import g.a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15742u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f15743v;

    public /* synthetic */ f(g gVar, int i) {
        this.f15742u = i;
        this.f15743v = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15742u) {
            case 0:
                a(this.f15743v);
                return;
            default:
                g.c(this.f15743v);
                return;
        }
    }
}
