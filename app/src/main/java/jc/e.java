package jc;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19141u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f19142v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Runnable f19143w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ic.c f19144x;

    public /* synthetic */ e(f fVar, Runnable runnable, ic.c cVar, int i) {
        this.f19141u = i;
        this.f19142v = fVar;
        this.f19143w = runnable;
        this.f19144x = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19141u) {
            case 0:
                ExecutorService executorService = this.f19142v.f19145u;
                final int i = 0;
                final Runnable runnable = this.f19143w;
                final ic.c cVar = this.f19144x;
                executorService.execute(new Runnable() { // from class: jc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar.f18393v).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) cVar.f18393v).m(e8);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.f18393v;
                                try {
                                    runnable2.run();
                                    hVar.l(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.m(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f19142v.f19145u;
                final int i10 = 2;
                final Runnable runnable2 = this.f19143w;
                final ic.c cVar2 = this.f19144x;
                executorService2.execute(new Runnable() { // from class: jc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar2.f18393v).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) cVar2.f18393v).m(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) cVar2.f18393v;
                                try {
                                    runnable22.run();
                                    hVar.l(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.m(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f19142v.f19145u;
                final int i11 = 1;
                final Runnable runnable3 = this.f19143w;
                final ic.c cVar3 = this.f19144x;
                executorService3.execute(new Runnable() { // from class: jc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar3.f18393v).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) cVar3.f18393v).m(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) cVar3.f18393v;
                                try {
                                    runnable22.run();
                                    hVar.l(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.m(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
