package kb;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import g5.q;
import java.util.ArrayList;
import mb.n;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19749b;

    public /* synthetic */ j(int i, Object obj) {
        this.f19748a = i;
        this.f19749b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f19748a) {
            case 0:
                m mVar = (m) this.f19749b;
                int i = 0;
                mVar.f19756b.a("reportBinderDeath", new Object[0]);
                if (mVar.i.get() == null) {
                    mVar.f19756b.a("%s : Binder has died.", mVar.f19757c);
                    ArrayList arrayList = mVar.f19758d;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        RemoteException remoteException = new RemoteException(String.valueOf(mVar.f19757c).concat(" : Binder has died."));
                        ib.h hVar = ((i) obj).f19747u;
                        if (hVar != null) {
                            hVar.c(remoteException);
                        }
                    }
                    mVar.f19758d.clear();
                    synchronized (mVar.f19759f) {
                        mVar.d();
                    }
                    return;
                }
                q.b();
                return;
            case 1:
                n nVar = (n) this.f19749b;
                int i10 = 0;
                nVar.f20781b.e("reportBinderDeath", new Object[0]);
                if (nVar.i.get() == null) {
                    nVar.f20781b.e("%s : Binder has died.", nVar.f20782c);
                    ArrayList arrayList2 = nVar.f20783d;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        RemoteException remoteException2 = new RemoteException(String.valueOf(nVar.f20782c).concat(" : Binder has died."));
                        ib.h hVar2 = ((mb.l) obj2).f20776u;
                        if (hVar2 != null) {
                            hVar2.c(remoteException2);
                        }
                    }
                    nVar.f20783d.clear();
                    synchronized (nVar.f20784f) {
                        nVar.e();
                    }
                    return;
                }
                q.b();
                return;
            case 2:
                qb.l lVar = (qb.l) this.f19749b;
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "Binder has died: ".concat(lVar.f23649c));
                }
                ArrayList arrayList3 = lVar.f23650d;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                lVar.c(new qb.k(lVar, 1));
                return;
            default:
                vb.h hVar3 = (vb.h) this.f19749b;
                int i11 = 0;
                hVar3.f27522b.n("reportBinderDeath", new Object[0]);
                if (hVar3.i.get() == null) {
                    hVar3.f27522b.n("%s : Binder has died.", hVar3.f27523c);
                    ArrayList arrayList4 = hVar3.f27524d;
                    int size3 = arrayList4.size();
                    while (i11 < size3) {
                        Object obj3 = arrayList4.get(i11);
                        i11++;
                        RemoteException remoteException3 = new RemoteException(String.valueOf(hVar3.f27523c).concat(" : Binder has died."));
                        ib.h hVar4 = ((vb.e) obj3).f27514u;
                        if (hVar4 != null) {
                            hVar4.c(remoteException3);
                        }
                    }
                    hVar3.f27524d.clear();
                    synchronized (hVar3.f27525f) {
                        hVar3.c();
                    }
                    return;
                }
                q.b();
                return;
        }
    }
}
