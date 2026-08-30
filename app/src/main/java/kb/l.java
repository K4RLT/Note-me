package kb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import c4.s;
import c7.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ IBinder f19752v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f19753w;

    public l(a0 a0Var, IBinder iBinder) {
        this.f19753w = a0Var;
        this.f19752v = iBinder;
    }

    @Override // kb.i
    public final void a() {
        g eVar;
        m mVar = (m) this.f19753w.f3898v;
        int i = f.f19745v;
        IBinder iBinder = this.f19752v;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof g) {
                eVar = (g) queryLocalInterface;
            } else {
                eVar = new e(iBinder);
            }
        }
        mVar.f19765m = eVar;
        int i10 = 0;
        mVar.f19756b.a("linkToDeath", new Object[0]);
        try {
            mVar.f19765m.asBinder().linkToDeath(mVar.f19762j, 0);
        } catch (RemoteException e) {
            s sVar = mVar.f19756b;
            Object[] objArr = new Object[0];
            sVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", s.b(sVar.f3857v, "linkToDeath failed", objArr), e);
            }
        }
        mVar.f19760g = false;
        ArrayList arrayList = mVar.f19758d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        mVar.f19758d.clear();
    }
}
