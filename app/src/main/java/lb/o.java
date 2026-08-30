package lb;
import c.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import wa.h8;

/* loaded from: classes.dex */
public final class o implements t1 {

    /* renamed from: g, reason: collision with root package name */
    public static final c7.a f20213g = new c7.a("AssetPackServiceImpl", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final Intent f20214h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final String f20215a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f20216b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f20217c;

    /* renamed from: d, reason: collision with root package name */
    public final mb.n f20218d;
    public final mb.n e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20219f = new AtomicBoolean();

    public o(Context context, n0 n0Var, f1 f1Var) {
        this.f20215a = context.getPackageName();
        this.f20216b = n0Var;
        this.f20217c = f1Var;
        boolean a10 = mb.a(context);
        c7.a aVar = f20213g;
        if (a10) {
            Context applicationContext = context.getApplicationContext();
            applicationContext = applicationContext == null ? context : applicationContext;
            Intent intent = f20214h;
            this.f20218d = new mb.n(applicationContext, aVar, "AssetPackService", intent);
            Context applicationContext2 = context.getApplicationContext();
            this.e = new mb.n(applicationContext2 != null ? applicationContext2 : context, aVar, "AssetPackService-keepAlive", intent);
        }
        aVar.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 20201);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static ib.o k() {
        f20213g.c("onError(%d)", -11);
        return h8.d(new da.k(-11, 1));
    }

    public static /* bridge */ /* synthetic */ Bundle m(HashMap hashMap) {
        Bundle j10 = j();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : hashMap.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        j10.putParcelableArrayList("installed_asset_module", arrayList);
        return j10;
    }

    public static /* bridge */ /* synthetic */ ArrayList n(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @Override // lb.t1
    public final ib.o a(ArrayList arrayList, HashMap hashMap) {
        mb.n nVar = this.f20218d;
        if (nVar == null) {
            return k();
        }
        f20213g.e("startDownload(%s)", arrayList);
        ib.h hVar = new ib.h();
        nVar.c(new c(this, hVar, arrayList, hashMap, hVar), hVar);
        k6.i iVar = new k6.i(6, this);
        ib.o oVar = hVar.f18363a;
        oVar.getClass();
        oVar.f(ib.i.f18364a, iVar);
        return oVar;
    }

    @Override // lb.t1
    public final void b(int i) {
        mb.n nVar = this.f20218d;
        if (nVar != null) {
            f20213g.e("notifySessionFailed", new Object[0]);
            ib.h hVar = new ib.h();
            nVar.c(new g(this, hVar, i, hVar), hVar);
            return;
        }
        throw new k0("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // lb.t1
    public final ib.o c(ArrayList arrayList, ic.c cVar, HashMap hashMap) {
        mb.n nVar = this.f20218d;
        if (nVar == null) {
            return k();
        }
        f20213g.e("getPackStates(%s)", arrayList);
        ib.h hVar = new ib.h();
        nVar.c(new d(this, hVar, arrayList, hashMap, hVar, cVar), hVar);
        return hVar.f18363a;
    }

    @Override // lb.t1
    public final void d(String str) {
        mb.n nVar = this.f20218d;
        if (nVar == null) {
            return;
        }
        f20213g.e("removePack(%s)", str);
        ib.h hVar = new ib.h();
        nVar.c(new b(this, hVar, str, hVar, 0), hVar);
    }

    @Override // lb.t1
    public final void e(String str, int i, int i10, String str2) {
        mb.n nVar = this.f20218d;
        if (nVar != null) {
            f20213g.e("notifyChunkTransferred", new Object[0]);
            ib.h hVar = new ib.h();
            nVar.c(new e(this, hVar, i, str, str2, i10, hVar, 0), hVar);
            return;
        }
        throw new k0("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // lb.t1
    public final synchronized void f() {
        if (this.e == null) {
            f20213g.g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        c7.a aVar = f20213g;
        aVar.e("keepAlive", new Object[0]);
        if (!this.f20219f.compareAndSet(false, true)) {
            aVar.e("Service is already kept alive.", new Object[0]);
        } else {
            ib.h hVar = new ib.h();
            this.e.c(new h(this, hVar, hVar), hVar);
        }
    }

    @Override // lb.t1
    public final void g(List list) {
        mb.n nVar = this.f20218d;
        if (nVar == null) {
            return;
        }
        f20213g.e("cancelDownloads(%s)", list);
        ib.h hVar = new ib.h();
        nVar.c(new b(this, hVar, list, hVar, 1), hVar);
    }

    @Override // lb.t1
    public final ib.o h(String str, int i, int i10, String str2) {
        mb.n nVar = this.f20218d;
        if (nVar == null) {
            return k();
        }
        f20213g.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i10), Integer.valueOf(i));
        ib.h hVar = new ib.h();
        nVar.c(new e(this, hVar, i, str, str2, i10, hVar, 1), hVar);
        return hVar.f18363a;
    }

    @Override // lb.t1
    public final ib.o i(HashMap hashMap) {
        mb.n nVar = this.f20218d;
        if (nVar == null) {
            return k();
        }
        f20213g.e("syncPacks", new Object[0]);
        ib.h hVar = new ib.h();
        nVar.c(new b(this, hVar, hashMap, hVar, 2), hVar);
        return hVar.f18363a;
    }

    public final void l(String str, int i, int i10) {
        mb.n nVar = this.f20218d;
        if (nVar != null) {
            f20213g.e("notifyModuleCompleted", new Object[0]);
            ib.h hVar = new ib.h();
            nVar.c(new f(this, hVar, i, str, hVar, i10), hVar);
            return;
        }
        throw new k0("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // lb.t1
    public final void f(int i, String str) {
        l(str, i, 10);
    }
}
