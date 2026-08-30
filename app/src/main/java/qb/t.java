package qb;

import android.content.Context;
import android.util.Log;
import b0.e1;
import com.google.android.gms.internal.ads.j41;
import j.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.ScheduledExecutorService;
import wa.h8;
import ya.bb;
import ya.eg;
import ya.g1;
import ya.h1;
import ya.ja;
import ya.pf;
import ya.y;
import ya.yc;
import ya.za;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23672u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23673v;

    public /* synthetic */ t(pf pfVar) {
        this.f23672u = 3;
        bb bbVar = bb.UNKNOWN_EVENT;
        this.f23673v = pfVar;
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [j.m0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        String str;
        String str2;
        j41 j41Var;
        switch (this.f23672u) {
            case 0:
                Iterator it = ((d) this.f23673v).f23628c.values().iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a(4);
                    it.remove();
                }
                Log.d("HsdpClientImpl", "HSDP overlays: empty");
                return;
            case 1:
                Context context = (Context) ((ra.e) this.f23673v).f24675v;
                long j11 = ra.e.D(context).getLong("app_set_id_last_used_time", -1L);
                if (j11 != -1) {
                    j10 = j11 + 33696000000L;
                } else {
                    j10 = -1;
                }
                if (j10 != -1 && System.currentTimeMillis() > j10) {
                    if (!ra.e.D(context).edit().remove("app_set_id").commit()) {
                        String valueOf = String.valueOf(context.getPackageName());
                        if (valueOf.length() != 0) {
                            str2 = "Failed to clear app set ID generated for App ".concat(valueOf);
                        } else {
                            str2 = new String("Failed to clear app set ID generated for App ");
                        }
                        Log.e("AppSet", str2);
                    }
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        String valueOf2 = String.valueOf(context.getPackageName());
                        if (valueOf2.length() != 0) {
                            str = "Failed to clear app set ID last used time for App ".concat(valueOf2);
                        } else {
                            str = new String("Failed to clear app set ID last used time for App ");
                        }
                        Log.e("AppSet", str);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                rd.k kVar = (rd.k) this.f23673v;
                ScheduledExecutorService scheduledExecutorService = kVar.f24730f;
                if (kVar.a()) {
                    rd.h b10 = kVar.f24738o.b();
                    kVar.f24737n.getClass();
                    if (new Date(System.currentTimeMillis()).before(b10.f24717b)) {
                        kVar.h();
                        return;
                    }
                    hd.d dVar = (hd.d) kVar.i;
                    ib.o d2 = dVar.d();
                    ib.o c10 = dVar.c();
                    ib.o h3 = h8.g(d2, c10).h(scheduledExecutorService, new e7.c(3, kVar, d2, c10));
                    h8.g(h3).g(scheduledExecutorService, new e7.d(kVar, 10, h3));
                    return;
                }
                return;
            default:
                pf pfVar = (pf) this.f23673v;
                bb bbVar = bb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap = pfVar.f31443j;
                eg egVar = (eg) hashMap.get(bbVar);
                if (egVar != null) {
                    eg egVar2 = egVar;
                    yc ycVar = egVar2.f31203u;
                    if (ycVar == null) {
                        eg egVar3 = egVar2;
                        yc ycVar2 = new yc(egVar3, egVar3.f31286w);
                        egVar2.f31203u = ycVar2;
                        ycVar = ycVar2;
                    }
                    Iterator it2 = ycVar.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object obj = (Collection) egVar.f31286w.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        if (list instanceof RandomAccess) {
                            j41Var = new j41(egVar, next, list, (j41) null);
                        } else {
                            j41Var = new j41(egVar, next, list, (j41) null);
                        }
                        ArrayList arrayList = new ArrayList(j41Var);
                        Collections.sort(arrayList);
                        g9.n nVar = new g9.n(14);
                        int size = arrayList.size();
                        long j12 = 0;
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            j12 += ((Long) obj2).longValue();
                        }
                        nVar.f17680x = Long.valueOf((j12 / arrayList.size()) & Long.MAX_VALUE);
                        nVar.f17678v = Long.valueOf(pf.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        nVar.A = Long.valueOf(pf.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        nVar.f17682z = Long.valueOf(pf.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        nVar.f17681y = Long.valueOf(pf.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        nVar.f17679w = Long.valueOf(pf.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        ja jaVar = new ja(nVar);
                        int size2 = arrayList.size();
                        Object obj3 = new Object();
                        obj3.f18664w = za.TYPE_THIN;
                        y yVar = new y(1, false);
                        yVar.f31592w = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        yVar.f31591v = (g1) next;
                        yVar.f31593x = jaVar;
                        obj3.A = new h1(yVar);
                        de.m.f15854u.execute(new b9.a(pfVar, new e1((m0) obj3, 0), bbVar, pfVar.c()));
                    }
                    hashMap.remove(bbVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t(int i, Object obj) {
        this.f23672u = i;
        this.f23673v = obj;
    }
}