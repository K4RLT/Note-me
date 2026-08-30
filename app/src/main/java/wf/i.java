package wf;

import pf.b0;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f29920w;

    public i(Runnable runnable, long j10, boolean z3) {
        super(j10, z3);
        this.f29920w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29920w.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f29920w;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.o(runnable));
        sb2.append(", ");
        sb2.append(this.f29918u);
        sb2.append(", ");
        if (this.f29919v) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return p.a.n(sb2, str, ']');
    }
}
