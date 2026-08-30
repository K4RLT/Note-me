package ea;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f16026a;

    public p(int i) {
        this.f16026a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(l lVar);

    public abstract ca.d[] b(l lVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(l lVar);

    public abstract void f(e4 e4Var, boolean z3);
}
