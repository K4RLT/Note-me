package ub;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c7.a0;
import ib.h;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends vb.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27149v = 1;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27150w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27151x;

    public d(a0 a0Var, IBinder iBinder) {
        this.f27150w = iBinder;
        this.f27151x = a0Var;
    }

    @Override // vb.e
    public final void a() {
        HashMap hashMap;
        vb.d dVar = null;
        int i = 0;
        switch (this.f27149v) {
            case 0:
                try {
                    f fVar = (f) this.f27151x;
                    vb.d dVar2 = fVar.f27156a.f27531m;
                    String str = fVar.f27157b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = g.f27158a;
                    synchronized (g.class) {
                        hashMap = g.f27158a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    f fVar2 = (f) this.f27151x;
                    h hVar = (h) this.f27150w;
                    String str2 = fVar2.f27157b;
                    e eVar = new e(fVar2, hVar);
                    vb.b bVar = (vb.b) dVar2;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i10 = vb.a.f27511a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(eVar);
                    try {
                        bVar.f27512u.transact(2, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    f fVar3 = (f) this.f27151x;
                    c7.a aVar = f.f27155c;
                    Object[] objArr = {fVar3.f27157b};
                    aVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", c7.a.p(aVar.f3896v, "error requesting in-app review for %s", objArr), e);
                    }
                    ((h) this.f27150w).c(new RuntimeException(e));
                    return;
                }
            default:
                vb.h hVar2 = (vb.h) ((a0) this.f27151x).f3898v;
                IBinder iBinder = (IBinder) this.f27150w;
                int i11 = vb.c.f27513v;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    if (queryLocalInterface instanceof vb.d) {
                        dVar = (vb.d) queryLocalInterface;
                    } else {
                        dVar = new vb.b(iBinder);
                    }
                }
                hVar2.f27531m = dVar;
                c7.a aVar2 = hVar2.f27522b;
                aVar2.n("linkToDeath", new Object[0]);
                try {
                    hVar2.f27531m.asBinder().linkToDeath(hVar2.f27528j, 0);
                } catch (RemoteException e8) {
                    Object[] objArr2 = new Object[0];
                    aVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", c7.a.p(aVar2.f3896v, "linkToDeath failed", objArr2), e8);
                    }
                }
                hVar2.f27526g = false;
                ArrayList arrayList = hVar2.f27524d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                hVar2.f27524d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, h hVar, h hVar2) {
        super(hVar);
        this.f27150w = hVar2;
        this.f27151x = fVar;
    }
}
