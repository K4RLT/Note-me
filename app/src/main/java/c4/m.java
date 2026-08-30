package c4;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends wa.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa.r f3849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f3850b;

    public m(wa.r rVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f3849a = rVar;
        this.f3850b = threadPoolExecutor;
    }

    @Override // wa.r
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f3850b;
        try {
            this.f3849a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // wa.r
    public final void b(j6.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f3850b;
        try {
            this.f3849a.b(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
