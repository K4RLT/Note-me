package jb;

import android.os.RemoteException;
import android.util.Log;
import c4.s;
import com.google.android.gms.internal.measurement.e4;
import kb.m;

/* loaded from: classes.dex */
public final class g extends kb.i {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f19109v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ib.h f19110w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19111x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19112y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ib.h hVar, String str, ib.h hVar2) {
        super(hVar);
        this.f19112y = iVar;
        this.f19111x = str;
        this.f19110w = hVar2;
    }

    @Override // kb.i
    public final void a() {
        switch (this.f19109v) {
            case 0:
                ib.h hVar = this.f19110w;
                i iVar = (i) this.f19112y;
                String str = (String) this.f19111x;
                try {
                    iVar.f19118a.f19765m.E0(iVar.f19119b, i.a(iVar, str), new h(iVar, hVar, str));
                    return;
                } catch (RemoteException e) {
                    s sVar = i.e;
                    Object[] objArr = {str};
                    sVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", s.b(sVar.f3857v, "requestUpdateInfo(%s)", objArr), e);
                    }
                    hVar.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((m) this.f19112y).f19759f) {
                    try {
                        m mVar = (m) this.f19112y;
                        ib.h hVar2 = this.f19110w;
                        mVar.e.add(hVar2);
                        hVar2.f18363a.b(new e4(16, mVar, hVar2, false));
                        if (((m) this.f19112y).f19763k.getAndIncrement() > 0) {
                            ((m) this.f19112y).f19756b.a("Already connected to the service.", new Object[0]);
                        }
                        m.b((m) this.f19112y, (g) this.f19111x);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, ib.h hVar, ib.h hVar2, g gVar) {
        super(hVar);
        this.f19112y = mVar;
        this.f19110w = hVar2;
        this.f19111x = gVar;
    }
}
