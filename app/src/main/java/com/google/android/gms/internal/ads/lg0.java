package com.google.android.gms.internal.ads;
import ac.b;
import ca.b;
import f9.k;
import fa.b;
import fa.c;
import g9.r;
import k9.a0;
import l9.i;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lg0 extends pg0 {
    public final /* synthetic */ int A;
    public final Context B;
    public final Executor C;

    public lg0(Context context, wx wxVar, int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = context;
                this.C = wxVar;
                this.f9519z = new cj(context, k.C.f16828t.a(), this, this, 2);
                return;
            default:
                this.B = context;
                this.C = wxVar;
                this.f9519z = new cj(context, k.C.f16828t.a(), this, this, 2);
                return;
        }
    }

    public b c(dv dvVar) {
        synchronized (this.f9515v) {
            try {
                if (this.f9516w) {
                    return this.f9514u;
                }
                this.f9516w = true;
                this.f9518y = dvVar;
                this.f9519z.m();
                yx yxVar = this.f9514u;
                yxVar.f12998u.a(new e40(13, this), xx.f12657h);
                pg0.b(this.B, yxVar, this.C);
                return yxVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b
    public final void g0() {
        av ng0Var;
        av ng0Var2;
        switch (this.A) {
            case 0:
                synchronized (this.f9515v) {
                    try {
                        if (!this.f9517x) {
                            this.f9517x = true;
                            try {
                                try {
                                    wu wuVar = (wu) this.f9519z.t();
                                    dv dvVar = this.f9518y;
                                    if (((Boolean) r.e.f17698c.a(sl.Ae)).booleanValue()) {
                                        ng0Var = new og0(this.f9514u, this.f9518y);
                                    } else {
                                        ng0Var = new ng0(this);
                                    }
                                    wuVar.X1(dvVar, ng0Var);
                                } catch (RemoteException | IllegalArgumentException unused) {
                                    this.f9514u.c(new cg0(1));
                                }
                            } catch (Throwable th) {
                                k.C.f16817h.d("RemoteAdRequestClientTask.onConnected", th);
                                this.f9514u.c(new cg0(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.f9515v) {
                    try {
                        if (!this.f9517x) {
                            this.f9517x = true;
                            try {
                                wu wuVar2 = (wu) this.f9519z.t();
                                dv dvVar2 = this.f9518y;
                                if (((Boolean) r.e.f17698c.a(sl.Ae)).booleanValue()) {
                                    ng0Var2 = new og0(this.f9514u, this.f9518y);
                                } else {
                                    ng0Var2 = new ng0(this);
                                }
                                wuVar2.s3(dvVar2, ng0Var2);
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f9514u.c(new cg0(1));
                            } catch (Throwable th3) {
                                k.C.f16817h.d("RemoteSignalsClientTask.onConnected", th3);
                                this.f9514u.c(new cg0(1));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.pg0, c
    public void r0(b bVar) {
        switch (this.A) {
            case 0:
                int i = a0.f19634b;
                i.a("Cannot connect to remote service, fallback to local instance.");
                this.f9514u.c(new cg0(1));
                return;
            default:
                super.r0(bVar);
                return;
        }
    }
}
