package ea;
import p.g;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: b, reason: collision with root package name */
    public final ib.h f16047b;

    public w(f fVar, ib.h hVar) {
        super(4);
        this.f16047b = hVar;
    }

    @Override // ea.p
    public final boolean a(l lVar) {
        return false;
    }

    @Override // ea.p
    public final ca.d[] b(l lVar) {
        return null;
    }

    @Override // ea.p
    public final void c(Status status) {
        this.f16047b.c(new da.d(status));
    }

    @Override // ea.p
    public final void d(Exception exc) {
        this.f16047b.c(exc);
    }

    @Override // ea.p
    public final void e(l lVar) {
        try {
            h(lVar);
        } catch (DeadObjectException e) {
            c(g(e));
            throw e;
        } catch (RemoteException e8) {
            c(g(e8));
        } catch (RuntimeException e10) {
            this.f16047b.c(e10);
        }
    }

    public final void h(l lVar) {
        this.f16047b.d(Boolean.FALSE);
    }

    @Override // ea.p
    public final /* bridge */ /* synthetic */ void f(e4 e4Var, boolean z3) {
    }
}
