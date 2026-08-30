package ja;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.oh;
import fa.h;

/* loaded from: classes.dex */
public final class g extends h {
    @Override // fa.e
    public final int i() {
        return 17895000;
    }

    @Override // fa.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 4);
    }

    @Override // fa.e
    public final ca.d[] q() {
        return sa.b.f25129d;
    }

    @Override // fa.e
    public final String u() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // fa.e
    public final String v() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // fa.e
    public final boolean w() {
        return true;
    }
}
