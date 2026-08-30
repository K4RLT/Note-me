package jc;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19135u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f19136v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Runnable f19137w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f19138x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f19139y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f19140z;

    public /* synthetic */ d(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i) {
        this.f19135u = i;
        this.f19136v = fVar;
        this.f19137w = runnable;
        this.f19138x = j10;
        this.f19139y = j11;
        this.f19140z = timeUnit;
    }

    @Override // jc.g
    public final ScheduledFuture a(ic.c cVar) {
        switch (this.f19135u) {
            case 0:
                f fVar = this.f19136v;
                return fVar.f19146v.scheduleAtFixedRate(new e(fVar, this.f19137w, cVar, 0), this.f19138x, this.f19139y, this.f19140z);
            default:
                f fVar2 = this.f19136v;
                return fVar2.f19146v.scheduleWithFixedDelay(new e(fVar2, this.f19137w, cVar, 2), this.f19138x, this.f19139y, this.f19140z);
        }
    }
}
