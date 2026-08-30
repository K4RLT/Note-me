package ea;
import p.g;
import q.x;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.z11;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i8;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends p {

    /* renamed from: b, reason: collision with root package name */
    public final i8 f16044b;

    /* renamed from: c, reason: collision with root package name */
    public final ib.h f16045c;

    /* renamed from: d, reason: collision with root package name */
    public final va.t f16046d;

    public v(int i, i8 i8Var, ib.h hVar, va.t tVar) {
        super(i);
        this.f16045c = hVar;
        this.f16044b = i8Var;
        this.f16046d = tVar;
        if (i == 2 && i8Var.f14468b) {
            x.n("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // ea.p
    public final boolean a(l lVar) {
        return this.f16044b.f14468b;
    }

    @Override // ea.p
    public final ca.d[] b(l lVar) {
        return (ca.d[]) this.f16044b.f14470d;
    }

    @Override // ea.p
    public final void c(Status status) {
        da.d dVar;
        this.f16046d.getClass();
        if (status.f4285w != null) {
            dVar = new da.d(status);
        } else {
            dVar = new da.d(status);
        }
        this.f16045c.c(dVar);
    }

    @Override // ea.p
    public final void d(Exception exc) {
        this.f16045c.c(exc);
    }

    @Override // ea.p
    public final void e(l lVar) {
        ib.h hVar = this.f16045c;
        try {
            i8 i8Var = this.f16044b;
            ((h) ((i8) i8Var.e).f14470d).accept(lVar.f16017v, hVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e8) {
            c(g(e8));
        } catch (RuntimeException e10) {
            hVar.c(e10);
        }
    }

    @Override // ea.p
    public final void f(e4 e4Var, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        Map map = (Map) e4Var.f13729w;
        ib.h hVar = this.f16045c;
        map.put(hVar, valueOf);
        hVar.f18363a.b(new z11(13, (Object) e4Var, (Object) hVar, false));
    }
}
