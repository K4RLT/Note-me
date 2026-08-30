package a9;

import android.os.RemoteException;
import g9.e2;
import g9.k0;
import g9.w2;
import l9.i;
import q.x;
import z8.h;
import z8.k;
import z8.s;
import z8.t;

/* loaded from: classes.dex */
public final class c extends k {
    public h[] getAdSizes() {
        return (h[]) this.f31994u.f17620h;
    }

    public d getAppEventListener() {
        return (d) this.f31994u.i;
    }

    public s getVideoController() {
        return (s) this.f31994u.f17617d;
    }

    public t getVideoOptions() {
        return (t) this.f31994u.f17622k;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr != null && hVarArr.length > 0) {
            this.f31994u.i(hVarArr);
        } else {
            x.n("The supported ad sizes must contain at least one valid ad size.");
        }
    }

    public void setAppEventListener(d dVar) {
        this.f31994u.j(dVar);
    }

    public void setManualImpressionsEnabled(boolean z3) {
        e2 e2Var = this.f31994u;
        e2Var.f17614a = z3;
        try {
            k0 k0Var = (k0) e2Var.f17621j;
            if (k0Var != null) {
                k0Var.G2(z3);
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    public void setVideoOptions(t tVar) {
        w2 w2Var;
        e2 e2Var = this.f31994u;
        e2Var.f17622k = tVar;
        try {
            k0 k0Var = (k0) e2Var.f17621j;
            if (k0Var != null) {
                if (tVar == null) {
                    w2Var = null;
                } else {
                    w2Var = new w2(tVar);
                }
                k0Var.d3(w2Var);
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }
}
