package c7;
import b0.b;
import b0.x;
import c0.c;
import t.g;
import t.h;
import t.i;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class a0 implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3897u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3898v;

    public /* synthetic */ a0(int i, Object obj) {
        this.f3897u = i;
        this.f3898v = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.oh] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.h hVar = null;
        Object r12 = 0;
        switch (this.f3897u) {
            case 0:
                com.google.android.gms.internal.play_billing.g("BillingClientTesting", "Billing Override Service connected.");
                b0 b0Var = (b0) this.f3898v;
                int i = com.google.android.gms.internal.play_billing.g.f15424v;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.h) {
                        hVar = (com.google.android.gms.internal.play_billing.h) queryLocalInterface;
                    } else {
                        hVar = new oh(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                b0Var.G = hVar;
                b0Var.F = 2;
                int i10 = c0.f3927a;
                e3 c10 = c(26, i3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                pw pwVar = b0Var.f3909h;
                pwVar.getClass();
                try {
                    pwVar.C(c10, (l3) pwVar.f14821v);
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to log.", th);
                    return;
                }
            case 1:
                kb.m mVar = (kb.m) this.f3898v;
                mVar.f19756b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                mVar.a().post(new kb.l(this, iBinder));
                return;
            case 2:
                mb.n nVar = (mb.n) this.f3898v;
                nVar.f20781b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                nVar.a().post(new lb.h(this, iBinder));
                return;
            case 3:
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
                }
                ((qb.l) this.f3898v).c(new iv1(this, 25, iBinder));
                return;
            case 4:
                vb.h hVar2 = (vb.h) this.f3898v;
                hVar2.f27522b.n("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hVar2.a().post(new ub.d(this, iBinder));
                return;
            default:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                j6.i iVar = (j6.i) this.f3898v;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) iVar.f18926w;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                iVar.f18925v = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                pf.x(pf.b((te.g) iVar.f18924u), null, new l5.a(iVar, arrayList, r12 == true ? 1 : 0, 19), 3);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f3897u) {
            case 0:
                com.google.android.gms.internal.play_billing.h("BillingClientTesting", "Billing Override Service disconnected.");
                b0 b0Var = (b0) this.f3898v;
                b0Var.G = null;
                b0Var.F = 0;
                return;
            case 1:
                kb.m mVar = (kb.m) this.f3898v;
                mVar.f19756b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                mVar.a().post(new kb.k(1, this));
                return;
            case 2:
                mb.n nVar = (mb.n) this.f3898v;
                nVar.f20781b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                nVar.a().post(new mb.m(1, this));
                return;
            case 3:
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
                }
                ((qb.l) this.f3898v).c(new a6.x(29, this));
                return;
            case 4:
                vb.h hVar = (vb.h) this.f3898v;
                hVar.f27522b.n("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hVar.a().post(new vb.g(1, this));
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ((j6.i) this.f3898v).f18925v = null;
                return;
        }
    }
}