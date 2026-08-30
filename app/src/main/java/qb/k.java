package qb;

import android.content.Context;
import android.util.Log;
import c7.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23645u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f23646v;

    public /* synthetic */ k(l lVar, int i) {
        this.f23645u = i;
        this.f23646v = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23645u) {
            case 0:
                l lVar = this.f23646v;
                if (lVar.f23655k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "Unbind from service.");
                    }
                    Context context = lVar.f23648b;
                    a0 a0Var = lVar.f23654j;
                    a0Var.getClass();
                    context.unbindService(a0Var);
                    lVar.f23651f = false;
                    lVar.f23655k = null;
                    lVar.f23654j = null;
                    ArrayList arrayList = lVar.f23650d;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in unbind()");
                    lVar.b();
                    return;
                }
                return;
            default:
                l lVar2 = this.f23646v;
                if (lVar2.f23655k != null) {
                    lVar2.f23655k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in reportBinderDeath()");
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
