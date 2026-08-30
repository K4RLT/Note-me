package j;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.consent_sdk.a6;
import com.google.android.gms.internal.consent_sdk.d7;
import com.google.android.gms.internal.consent_sdk.e7;
import com.google.android.gms.internal.consent_sdk.f7;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m0 implements e7, p8.b {
    public Object A;

    /* renamed from: u, reason: collision with root package name */
    public Object f18662u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18663v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18664w;

    /* renamed from: x, reason: collision with root package name */
    public Object f18665x;

    /* renamed from: y, reason: collision with root package name */
    public Object f18666y;

    /* renamed from: z, reason: collision with root package name */
    public Object f18667z;

    public m0(String str, tc.c cVar, nd.o oVar) {
        this.f18665x = new com.google.android.gms.internal.ads.d(this, false);
        this.f18666y = new com.google.android.gms.internal.ads.d(this, true);
        this.f18667z = new ad(2);
        this.A = new AtomicMarkableReference(null, false);
        this.f18664w = str;
        this.f18662u = new pc.g(cVar);
        this.f18663v = oVar;
    }

    public static void a(Menu menu, e2.b bVar) {
        int i;
        int i10 = bVar.f15896u;
        int i11 = bVar.f15897v;
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (Build.VERSION.SDK_INT <= 26) {
                                i = R.string.autofill;
                            } else {
                                i = android.R.string.autofill;
                            }
                        } else {
                            l4.a.o();
                            return;
                        }
                    } else {
                        i = android.R.string.selectAll;
                    }
                } else {
                    i = android.R.string.cut;
                }
            } else {
                i = android.R.string.paste;
            }
        } else {
            i = android.R.string.copy;
        }
        menu.add(0, i10, i11, i).setShowAsAction(1);
    }

    public static void b(Menu menu, e2.b bVar, df.a aVar) {
        int i = bVar.f15896u;
        if (aVar != null && menu.findItem(i) == null) {
            a(menu, bVar);
        } else if (aVar == null && menu.findItem(i) != null) {
            menu.removeItem(i);
        }
    }

    public void c(String str) {
        com.google.android.gms.internal.ads.d dVar = (com.google.android.gms.internal.ads.d) this.f18666y;
        synchronized (dVar) {
            try {
                if (!((pc.d) ((AtomicMarkableReference) dVar.f5230v).getReference()).a(str)) {
                    return;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) dVar.f5230v;
                atomicMarkableReference.set((pc.d) atomicMarkableReference.getReference(), true);
                k6.g gVar = new k6.g(1, dVar);
                AtomicReference atomicReference = (AtomicReference) dVar.f5231w;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                ((nd.o) ((m0) dVar.f5232x).f18663v).t(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // oe.a
    public Object get() {
        return new com.google.android.gms.internal.consent_sdk.c((Context) ((oe.a) this.f18662u).get(), (o8.d) ((oe.a) this.f18663v).get(), (u8.f) ((oe.a) this.f18664w).get(), (i0) ((i0) this.f18665x).get(), (Executor) ((oe.a) this.f18666y).get(), (u8.f) ((oe.a) this.f18667z).get(), new Object(), new Object(), (u8.f) ((oe.a) this.A).get(), 7);
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public Object zzb() {
        Application application = (Application) ((f7) this.f18662u).zzb();
        return new com.google.android.gms.internal.consent_sdk.k(application, (com.google.android.gms.internal.consent_sdk.r) ((d7) this.f18664w).zzb(), (com.google.android.gms.internal.consent_sdk.g) ((f7) this.f18665x).zzb(), (com.google.android.gms.internal.consent_sdk.o) ((a6) this.f18666y).f13354v, (com.google.android.gms.internal.consent_sdk.m) this.f18667z, (com.google.android.gms.internal.consent_sdk.y) ((f7) this.A).zzb());
    }

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f18662u = obj;
        this.f18663v = obj2;
        this.f18664w = obj3;
        this.f18665x = obj4;
        this.f18666y = obj5;
        this.f18667z = obj6;
        this.A = obj7;
    }
}
