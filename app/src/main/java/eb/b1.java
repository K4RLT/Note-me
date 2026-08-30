package eb;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class b1 extends FutureTask implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final long f16063u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f16064v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16065w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y0 f16066x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(y0 y0Var, Callable callable, boolean z3) {
        super(callable);
        this.f16066x = y0Var;
        long andIncrement = y0.F.getAndIncrement();
        this.f16063u = andIncrement;
        this.f16065w = "Task exception on worker thread";
        this.f16064v = z3;
        if (andIncrement == Long.MAX_VALUE) {
            y0Var.f().A.g("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        boolean z3 = b1Var.f16064v;
        boolean z9 = this.f16064v;
        if (z9 != z3) {
            if (z9) {
                return -1;
            }
            return 1;
        }
        long j10 = b1Var.f16063u;
        long j11 = this.f16063u;
        if (j11 < j10) {
            return -1;
        }
        if (j11 > j10) {
            return 1;
        }
        this.f16066x.f().B.f(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f16066x.f().A.f(th, this.f16065w);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(y0 y0Var, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        this.f16066x = y0Var;
        long andIncrement = y0.F.getAndIncrement();
        this.f16063u = andIncrement;
        this.f16065w = str;
        this.f16064v = z3;
        if (andIncrement == Long.MAX_VALUE) {
            y0Var.f().A.g("Tasks index overflow");
        }
    }
}
