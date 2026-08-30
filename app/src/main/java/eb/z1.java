package eb;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z1 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16470u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f16471v;

    public z1() {
        this.f16470u = 1;
        bb.a aVar = new bb.a(Looper.getMainLooper(), 0, false);
        Looper.getMainLooper();
        this.f16471v = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16470u) {
            case 0:
                ((t1) this.f16471v).h().D(runnable);
                return;
            case 1:
                ((bb.a) this.f16471v).post(runnable);
                return;
            case 2:
                ((m6.b) this.f16471v).f20615c.post(runnable);
                return;
            default:
                ((Executor) this.f16471v).execute(new jc.j(2, runnable));
                return;
        }
    }

    public /* synthetic */ z1(int i, Object obj) {
        this.f16470u = i;
        this.f16471v = obj;
    }
}
