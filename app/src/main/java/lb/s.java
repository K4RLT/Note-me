package lb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.hg;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.play.core.assetpacks.bn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final c7.a f20258a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f20259b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20260c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f20261d;
    public hg e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f20262f;

    /* renamed from: g, reason: collision with root package name */
    public final t0 f20263g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f20264h;
    public final e0 i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f20265j;

    /* renamed from: k, reason: collision with root package name */
    public final f1 f20266k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f20267l;

    /* renamed from: m, reason: collision with root package name */
    public final mb.e f20268m;

    /* renamed from: n, reason: collision with root package name */
    public final mb.e f20269n;

    /* renamed from: o, reason: collision with root package name */
    public final mb.e f20270o;

    public s(Context context, t0 t0Var, l0 l0Var, mb.e eVar, n0 n0Var, e0 e0Var, mb.e eVar2, mb.e eVar3, f1 f1Var) {
        c7.a aVar = new c7.a("AssetPackServiceListenerRegistry", 5);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE");
        this.f20261d = new HashSet();
        this.e = null;
        this.f20262f = false;
        this.f20258a = aVar;
        this.f20259b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f20260c = applicationContext != null ? applicationContext : context;
        this.f20267l = new Handler(Looper.getMainLooper());
        this.f20263g = t0Var;
        this.f20264h = l0Var;
        this.f20268m = eVar;
        this.f20265j = n0Var;
        this.i = e0Var;
        this.f20269n = eVar2;
        this.f20270o = eVar3;
        this.f20266k = f1Var;
    }

    public final void a() {
        hg hgVar;
        if ((this.f20262f || !this.f20261d.isEmpty()) && this.e == null) {
            hg hgVar2 = new hg(11, this);
            this.e = hgVar2;
            int i = Build.VERSION.SDK_INT;
            Context context = this.f20260c;
            IntentFilter intentFilter = this.f20259b;
            if (i >= 33) {
                context.registerReceiver(hgVar2, intentFilter, 2);
            } else {
                context.registerReceiver(hgVar2, intentFilter);
            }
        }
        if (!this.f20262f && this.f20261d.isEmpty() && (hgVar = this.e) != null) {
            this.f20260c.unregisterReceiver(hgVar);
            this.e = null;
        }
    }

    public final void b(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        c7.a aVar = this.f20258a;
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList != null && stringArrayList.size() == 1) {
                bn a10 = bn.a(bundleExtra, stringArrayList.get(0), this.f20265j, this.f20266k, t.f20274v);
                aVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", a10);
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
                if (pendingIntent != null) {
                    this.i.f20122a = pendingIntent;
                }
                ((Executor) this.f20270o.b()).execute(new ba.j(25, this, bundleExtra, a10));
                ((Executor) this.f20269n.b()).execute(new pu1(this, 20, bundleExtra));
                return;
            }
            aVar.c("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        aVar.c("Empty bundle received from broadcast.", new Object[0]);
    }
}
