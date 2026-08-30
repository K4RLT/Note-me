package jc;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h extends d3.g implements ScheduledFuture {
    public final ScheduledFuture B;

    public h(g gVar) {
        this.B = gVar.a(new ic.c(5, this));
    }

    @Override // d3.g
    public final void c() {
        boolean z3;
        ScheduledFuture scheduledFuture = this.B;
        Object obj = this.f15715u;
        if ((obj instanceof d3.a) && ((d3.a) obj).f15698a) {
            z3 = true;
        } else {
            z3 = false;
        }
        scheduledFuture.cancel(z3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.B.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.B.getDelay(timeUnit);
    }
}
