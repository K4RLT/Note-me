package fa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class e0 extends t {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f16848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f16849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e eVar, int i, IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.f16849h = eVar;
        this.f16848g = iBinder;
    }

    @Override // fa.t
    public final boolean a() {
        IBinder iBinder = this.f16848g;
        try {
            y.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.f16849h;
            if (!eVar.u().equals(interfaceDescriptor)) {
                String u9 = eVar.u();
                Log.w("GmsClient", a5.a.l(new StringBuilder(u9.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", u9, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface n10 = eVar.n(iBinder);
            if (n10 == null || (!eVar.y(2, 4, n10) && !eVar.y(3, 4, n10))) {
                return false;
            }
            eVar.N = null;
            b bVar = eVar.I;
            if (bVar != null) {
                bVar.g0();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // fa.t
    public final void b(ca.b bVar) {
        c cVar = this.f16849h.J;
        if (cVar != null) {
            cVar.r0(bVar);
        }
        System.currentTimeMillis();
    }
}
