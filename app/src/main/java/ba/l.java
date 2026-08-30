package ba;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.t81;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3142u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f3143v;

    public /* synthetic */ l(n nVar, int i) {
        this.f3142u = i;
        this.f3143v = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3142u) {
            case 0:
                break;
            case 1:
                n nVar = this.f3143v;
                synchronized (nVar) {
                    if (nVar.f3145u == 1) {
                        nVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f3143v.a("Service disconnected");
                return;
        }
        while (true) {
            n nVar2 = this.f3143v;
            synchronized (nVar2) {
                try {
                    if (nVar2.f3145u == 2) {
                        if (nVar2.f3148x.isEmpty()) {
                            nVar2.c();
                            return;
                        }
                        o oVar = (o) nVar2.f3148x.poll();
                        nVar2.f3149y.put(oVar.f3151a, oVar);
                        ((ScheduledExecutorService) nVar2.f3150z.f3159w).schedule(new t81(nVar2, 2, oVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(oVar)));
                        }
                        q qVar = nVar2.f3150z;
                        Messenger messenger = nVar2.f3146v;
                        int i = oVar.f3153c;
                        Context context = (Context) qVar.f3158v;
                        Message obtain = Message.obtain();
                        obtain.what = i;
                        obtain.arg1 = oVar.f3151a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", oVar.a());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle("data", oVar.f3154d);
                        obtain.setData(bundle);
                        try {
                            j6.l lVar = nVar2.f3147w;
                            Messenger messenger2 = (Messenger) lVar.f18933v;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) lVar.f18934w;
                                if (gVar != null) {
                                    Messenger messenger3 = gVar.f3128u;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e) {
                            nVar2.a(e.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
