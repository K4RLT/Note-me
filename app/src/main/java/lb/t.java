package lb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements u, ib.d, mb.f {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ t f20274v = new t(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ t f20275w = new t(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ t f20276x = new t(2);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20277u;

    public /* synthetic */ t(int i) {
        this.f20277u = i;
    }

    @Override // lb.u
    public int a(int i, String str) {
        int i10 = this.f20277u;
        return i;
    }

    @Override // mb.f
    public Object b() {
        switch (this.f20277u) {
            case 3:
                return new Object();
            case 4:
                return new n0();
            case 5:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(s1.f20272c);
                ya.v0.a(newSingleThreadExecutor);
                return newSingleThreadExecutor;
            default:
                ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(s1.f20271b);
                ya.v0.a(newSingleThreadExecutor2);
                return newSingleThreadExecutor2;
        }
    }

    @Override // ib.d
    public void w(Exception exc) {
        r1.f20249k.g(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
