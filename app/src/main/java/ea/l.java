package ea;
import d.c;
import n.f;
import q.b;
import q.x;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.z11;
import com.google.android.gms.internal.measurement.e4;
import fa.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import n.r0;

/* loaded from: classes.dex */
public final class l implements da.g, da.h {
    public final int A;
    public final u B;
    public boolean C;
    public final /* synthetic */ d G;

    /* renamed from: v, reason: collision with root package name */
    public final da.c f16017v;

    /* renamed from: w, reason: collision with root package name */
    public final a f16018w;

    /* renamed from: x, reason: collision with root package name */
    public final e4 f16019x;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedList f16016u = new LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f16020y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f16021z = new HashMap();
    public final ArrayList D = new ArrayList();
    public ca.b E = null;
    public int F = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public l(d dVar, da.f fVar) {
        this.G = dVar;
        Looper looper = dVar.G.getLooper();
        ra.e b10 = fVar.b();
        g9.n nVar = new g9.n((f) b10.f24675v, (String) b10.f24676w, (String) b10.f24677x);
        fb.b bVar = (fb.b) fVar.f15824w.f8422v;
        y.h(bVar);
        da.c a10 = bVar.a(fVar.f15822u, looper, nVar, fVar.f15825x, this, this);
        String str = fVar.f15823v;
        if (str != null && (a10 instanceof fa.e)) {
            ((fa.e) a10).M = str;
        }
        if (str != null && (a10 instanceof g)) {
            a5.a.p(a10);
            throw null;
        }
        this.f16017v = a10;
        this.f16018w = fVar.f15826y;
        this.f16019x = new e4(14);
        this.A = fVar.f15827z;
        if (a10.l()) {
            Context context = dVar.f16010y;
            bb.a aVar = dVar.G;
            ra.e b11 = fVar.b();
            this.B = new u(context, aVar, new g9.n((f) b11.f24675v, (String) b11.f24676w, (String) b11.f24677x));
            return;
        }
        this.B = null;
    }

    @Override // da.g
    public final void R(int i) {
        Looper myLooper = Looper.myLooper();
        bb.a aVar = this.G.G;
        if (myLooper == aVar.getLooper()) {
            f(i);
        } else {
            aVar.post(new c4.i(this, i, 9));
        }
    }

    public final void a(ca.b bVar) {
        HashSet hashSet = this.f16020y;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (y.l(bVar, ca.b.f4020z)) {
                    this.f16017v.f();
                }
                throw null;
            }
            g5.b();
            return;
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        y.c(this.G.G);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z3) {
        boolean z9;
        y.c(this.G.G);
        boolean z10 = true;
        if (status != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (exc != null) {
            z10 = false;
        }
        if (z9 != z10) {
            Iterator it = this.f16016u.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (!z3 || pVar.f16026a == 2) {
                    if (status != null) {
                        pVar.c(status);
                    } else {
                        pVar.d(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        x.n("Status XOR exception should be null");
    }

    public final void d() {
        LinkedList linkedList = this.f16016u;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            if (this.f16017v.h()) {
                if (h(pVar)) {
                    linkedList.remove(pVar);
                }
            } else {
                return;
            }
        }
    }

    public final void e() {
        d dVar = this.G;
        y.c(dVar.G);
        this.E = null;
        a(ca.b.f4020z);
        bb.a aVar = dVar.G;
        if (this.C) {
            a aVar2 = this.f16018w;
            aVar.removeMessages(11, aVar2);
            aVar.removeMessages(9, aVar2);
            this.C = false;
        }
        Iterator it = this.f16021z.values().iterator();
        if (!it.hasNext()) {
            d();
            g();
        } else {
            throw null;
        }
    }

    public final void f(int i) {
        d dVar = this.G;
        bb.a aVar = dVar.G;
        y.c(dVar.G);
        this.E = null;
        this.C = true;
        String k3 = this.f16017v.k();
        e4 e4Var = this.f16019x;
        e4Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (k3 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(k3);
        }
        e4Var.c(true, new Status(20, sb2.toString(), null, null));
        a aVar2 = this.f16018w;
        aVar.sendMessageDelayed(Message.obtain(aVar, 9, aVar2), 5000L);
        aVar.sendMessageDelayed(Message.obtain(aVar, 11, aVar2), 120000L);
        ((SparseIntArray) dVar.A.f13046v).clear();
        Iterator it = this.f16021z.values().iterator();
        while (it.hasNext()) {
            ((t) it.next()).getClass();
        }
    }

    public final void g() {
        d dVar = this.G;
        bb.a aVar = dVar.G;
        a aVar2 = this.f16018w;
        aVar.removeMessages(12, aVar2);
        aVar.sendMessageDelayed(aVar.obtainMessage(12, aVar2), dVar.f16006u);
    }

    @Override // da.g
    public final void g0() {
        Looper myLooper = Looper.myLooper();
        bb.a aVar = this.G.G;
        if (myLooper == aVar.getLooper()) {
            e();
        } else {
            aVar.post(new a6.x(7, this));
        }
    }

    public final boolean h(p pVar) {
        ca.d dVar;
        if (pVar == null) {
            e4 e4Var = this.f16019x;
            da.c cVar = this.f16017v;
            pVar.f(e4Var, cVar.l());
            try {
                pVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                R(1);
                cVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        ca.d[] b10 = pVar.b(this);
        if (b10 != null && b10.length != 0) {
            ca.d[] j10 = this.f16017v.j();
            if (j10 == null) {
                j10 = new ca.d[0];
            }
            r0 r0Var = new r0(j10.length);
            for (ca.d dVar2 : j10) {
                r0Var.put(dVar2.f4029u, Long.valueOf(dVar2.a()));
            }
            int length = b10.length;
            for (int i = 0; i < length; i++) {
                dVar = b10[i];
                Long l10 = (Long) r0Var.get(dVar.f4029u);
                if (l10 == null || l10.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            e4 e4Var2 = this.f16019x;
            da.c cVar2 = this.f16017v;
            pVar.f(e4Var2, cVar2.l());
            try {
                pVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                R(1);
                cVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f16017v.getClass().getName() + " could not execute call because it requires feature (" + dVar.f4029u + ", " + dVar.a() + ").");
        if (this.G.H && pVar.a(this)) {
            m mVar = new m(this.f16018w, dVar);
            int indexOf = this.D.indexOf(mVar);
            ArrayList arrayList = this.D;
            if (indexOf >= 0) {
                m mVar2 = (m) arrayList.get(indexOf);
                this.G.G.removeMessages(15, mVar2);
                bb.a aVar = this.G.G;
                aVar.sendMessageDelayed(Message.obtain(aVar, 15, mVar2), 5000L);
            } else {
                arrayList.add(mVar);
                bb.a aVar2 = this.G.G;
                aVar2.sendMessageDelayed(Message.obtain(aVar2, 15, mVar), 5000L);
                bb.a aVar3 = this.G.G;
                aVar3.sendMessageDelayed(Message.obtain(aVar3, 16, mVar), 120000L);
                ca.b bVar = new ca.b(2, null, null);
                if (!i(bVar)) {
                    this.G.b(bVar, this.A);
                }
            }
            return false;
        }
        pVar.d(new da.l(dVar));
        return true;
    }

    public final boolean i(ca.b bVar) {
        synchronized (d.K) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [c0.z, java.lang.Object, fa.d] */
    public final void j() {
        d dVar = this.G;
        y.c(dVar.G);
        da.c cVar = this.f16017v;
        if (!cVar.h() && !cVar.e()) {
            try {
                z11 z11Var = dVar.A;
                Context context = dVar.f16010y;
                SparseIntArray sparseIntArray = (SparseIntArray) z11Var.f13046v;
                y.h(context);
                int i = cVar.i();
                int i10 = ((SparseIntArray) z11Var.f13046v).get(i, -1);
                if (i10 == -1) {
                    i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < sparseIntArray.size()) {
                            int keyAt = sparseIntArray.keyAt(i11);
                            if (keyAt > i && sparseIntArray.get(keyAt) == 0) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 == -1) {
                        i10 = ((ca.e) z11Var.f13047w).c(context, i);
                    }
                    sparseIntArray.put(i, i10);
                }
                if (i10 != 0) {
                    ca.b bVar = new ca.b(i10, null, null);
                    Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                    l(bVar, null);
                    return;
                }
                Object obj = new Object();
                obj.f3441z = dVar;
                obj.f3439x = null;
                obj.f3440y = null;
                obj.f3436u = false;
                obj.f3437v = cVar;
                obj.f3438w = this.f16018w;
                if (cVar.l()) {
                    u uVar = this.B;
                    y.h(uVar);
                    Handler handler = uVar.f16040w;
                    g9.n nVar = uVar.f16043z;
                    gb.a aVar = uVar.A;
                    if (aVar != null) {
                        aVar.o();
                    }
                    nVar.A = Integer.valueOf(System.identityHashCode(uVar));
                    uVar.A = (gb.a) uVar.f16041x.a(uVar.f16039v, handler.getLooper(), nVar, (fb.a) nVar.f17682z, uVar, uVar);
                    uVar.B = obj;
                    Set set = uVar.f16042y;
                    if (set != null && !set.isEmpty()) {
                        gb.a aVar2 = uVar.A;
                        aVar2.getClass();
                        aVar2.a(new fa.l((fa.e) aVar2));
                    } else {
                        handler.post(new a6.x(9, uVar));
                    }
                }
                try {
                    cVar.a(obj);
                } catch (SecurityException e) {
                    l(new ca.b(10, null, null), e);
                }
            } catch (IllegalStateException e8) {
                l(new ca.b(10, null, null), e8);
            }
        }
    }

    public final void k(p pVar) {
        y.c(this.G.G);
        boolean h3 = this.f16017v.h();
        LinkedList linkedList = this.f16016u;
        if (h3) {
            if (h(pVar)) {
                g();
                return;
            } else {
                linkedList.add(pVar);
                return;
            }
        }
        linkedList.add(pVar);
        ca.b bVar = this.E;
        if (bVar != null && bVar.f4022v != 0 && bVar.f4023w != null) {
            l(bVar, null);
        } else {
            j();
        }
    }

    public final void l(ca.b bVar, RuntimeException runtimeException) {
        gb.a aVar;
        y.c(this.G.G);
        u uVar = this.B;
        if (uVar != null && (aVar = uVar.A) != null) {
            aVar.o();
        }
        y.c(this.G.G);
        this.E = null;
        ((SparseIntArray) this.G.A.f13046v).clear();
        a(bVar);
        if ((this.f16017v instanceof ha.c) && bVar.f4022v != 24) {
            d dVar = this.G;
            dVar.f16007v = true;
            bb.a aVar2 = dVar.G;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(19), 300000L);
        }
        if (bVar.f4022v == 4) {
            b(d.J);
            return;
        }
        if (this.f16016u.isEmpty()) {
            this.E = bVar;
            return;
        }
        d dVar2 = this.G;
        if (runtimeException != null) {
            y.c(dVar2.G);
            c(null, runtimeException, false);
            return;
        }
        boolean z3 = dVar2.H;
        a aVar3 = this.f16018w;
        if (z3) {
            c(c(aVar3, bVar), null, true);
            if (!this.f16016u.isEmpty() && !i(bVar) && !this.G.b(bVar, this.A)) {
                if (bVar.f4022v == 18) {
                    this.C = true;
                }
                if (this.C) {
                    d dVar3 = this.G;
                    a aVar4 = this.f16018w;
                    bb.a aVar5 = dVar3.G;
                    aVar5.sendMessageDelayed(Message.obtain(aVar5, 9, aVar4), 5000L);
                    return;
                }
                b(c(this.f16018w, bVar));
                return;
            }
            return;
        }
        b(c(aVar3, bVar));
    }

    public final void m(ca.b bVar) {
        y.c(this.G.G);
        da.c cVar = this.f16017v;
        cVar.d("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    public final void n() {
        y.c(this.G.G);
        Status status = d.I;
        b(status);
        this.f16019x.c(false, status);
        for (f fVar : (f[]) this.f16021z.keySet().toArray(new f[0])) {
            k(new w(fVar, new ib.h()));
        }
        a(new ca.b(4, null, null));
        da.c cVar = this.f16017v;
        if (cVar.h()) {
            cVar.g(new pd.c(this));
        }
    }

    @Override // da.h
    public final void r0(ca.b bVar) {
        l(bVar, null);
    }
}