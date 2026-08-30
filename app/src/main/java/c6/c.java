package c6;

import a6.d;
import a6.q;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import b6.h;
import b6.j;
import c7.n;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ra;
import f6.e;
import i0.m;
import j6.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import nd.o;
import pf.d1;
import wa.y8;

/* loaded from: classes.dex */
public final class c implements j, e, b6.c {
    public static final String I = q.f("GreedyScheduler");
    public final h A;
    public final j6.c B;
    public final a6.a C;
    public Boolean E;
    public final n F;
    public final m6.a G;
    public final o H;

    /* renamed from: u, reason: collision with root package name */
    public final Context f3888u;

    /* renamed from: w, reason: collision with root package name */
    public final a f3890w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3891x;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f3889v = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final Object f3892y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public final m f3893z = new m();
    public final HashMap D = new HashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [nd.o, java.lang.Object] */
    public c(Context context, a6.a aVar, h6.j jVar, h hVar, j6.c cVar, m6.a aVar2) {
        this.f3888u = context;
        pd.c cVar2 = aVar.f249f;
        this.f3890w = new a(this, cVar2, aVar.f247c);
        cVar2.getClass();
        Object obj = new Object();
        obj.f21271u = cVar2;
        obj.f21272v = cVar;
        obj.f21273w = new Object();
        obj.f21274x = new LinkedHashMap();
        this.H = obj;
        this.G = aVar2;
        this.F = new n(jVar);
        this.C = aVar;
        this.A = hVar;
        this.B = cVar;
    }

    @Override // b6.j
    public final void a(p... pVarArr) {
        long max;
        if (this.E == null) {
            this.E = Boolean.valueOf(k6.n.a(this.f3888u, this.C));
        }
        if (!this.E.booleanValue()) {
            q.d().e(I, "Ignoring schedule request in a secondary process");
            return;
        }
        int i = 1;
        if (!this.f3891x) {
            this.A.a(this);
            this.f3891x = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = pVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            p pVar = pVarArr[i10];
            if (!this.f3893z.f(y8.a(pVar))) {
                synchronized (this.f3892y) {
                    try {
                        j6.j a10 = y8.a(pVar);
                        b bVar = (b) this.D.get(a10);
                        if (bVar == null) {
                            int i11 = pVar.f18952k;
                            this.C.f247c.getClass();
                            bVar = new b(i11, System.currentTimeMillis());
                            this.D.put(a10, bVar);
                        }
                        max = (Math.max((pVar.f18952k - bVar.f3886a) - 5, 0) * 30000) + bVar.f3887b;
                    } finally {
                    }
                }
                long max2 = Math.max(pVar.a(), max);
                this.C.f247c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f18945b == i) {
                    if (currentTimeMillis < max2) {
                        a aVar = this.f3890w;
                        if (aVar != null) {
                            pd.c cVar = aVar.f3883b;
                            HashMap hashMap = aVar.f3885d;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f18944a);
                            if (runnable != null) {
                                ((Handler) cVar.f22681u).removeCallbacks(runnable);
                            }
                            ra raVar = new ra(2, aVar, pVar, false);
                            hashMap.put(pVar.f18944a, raVar);
                            aVar.f3884c.getClass();
                            ((Handler) cVar.f22681u).postDelayed(raVar, max2 - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        d dVar = pVar.f18951j;
                        if (dVar.f260c) {
                            q.d().a(I, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (!dVar.f264h.isEmpty()) {
                            q.d().a(I, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f18944a);
                        }
                    } else if (!this.f3893z.f(y8.a(pVar))) {
                        q.d().a(I, "Starting work for " + pVar.f18944a);
                        m mVar = this.f3893z;
                        mVar.getClass();
                        b6.n q10 = mVar.q(y8.a(pVar));
                        this.H.v(q10);
                        j6.c cVar2 = this.B;
                        cVar2.getClass();
                        cVar2.i(q10, null);
                    }
                }
            }
            i10++;
            i = 1;
        }
        synchronized (this.f3892y) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(",", hashSet2);
                    q.d().a(I, "Starting tracking for " + join);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        p pVar2 = (p) it.next();
                        j6.j a11 = y8.a(pVar2);
                        if (!this.f3889v.containsKey(a11)) {
                            this.f3889v.put(a11, f6.j.a(this.F, pVar2, ((m6.b) this.G).f20614b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // f6.e
    public final void b(p pVar, f6.c cVar) {
        j6.j a10 = y8.a(pVar);
        boolean z3 = cVar instanceof f6.a;
        j6.c cVar2 = this.B;
        o oVar = this.H;
        String str = I;
        m mVar = this.f3893z;
        if (z3) {
            if (!mVar.f(a10)) {
                q.d().a(str, "Constraints met: Scheduling work ID " + a10);
                b6.n q10 = mVar.q(a10);
                oVar.v(q10);
                cVar2.getClass();
                cVar2.i(q10, null);
                return;
            }
            return;
        }
        q.d().a(str, "Constraints not met: Cancelling work ID " + a10);
        b6.n n10 = mVar.n(a10);
        if (n10 != null) {
            oVar.d(n10);
            int i = ((f6.b) cVar).f16758a;
            cVar2.getClass();
            cVar2.j(n10, i);
        }
    }

    @Override // b6.j
    public final boolean c() {
        return false;
    }

    @Override // b6.j
    public final void d(String str) {
        Runnable runnable;
        if (this.E == null) {
            this.E = Boolean.valueOf(k6.n.a(this.f3888u, this.C));
        }
        boolean booleanValue = this.E.booleanValue();
        String str2 = I;
        if (!booleanValue) {
            q.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f3891x) {
            this.A.a(this);
            this.f3891x = true;
        }
        q.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f3890w;
        if (aVar != null && (runnable = (Runnable) aVar.f3885d.remove(str)) != null) {
            ((Handler) aVar.f3883b.f22681u).removeCallbacks(runnable);
        }
        for (b6.n nVar : this.f3893z.o(str)) {
            this.H.d(nVar);
            j6.c cVar = this.B;
            cVar.getClass();
            cVar.j(nVar, -512);
        }
    }

    @Override // b6.c
    public final void e(j6.j jVar, boolean z3) {
        d1 d1Var;
        b6.n n10 = this.f3893z.n(jVar);
        if (n10 != null) {
            this.H.d(n10);
        }
        synchronized (this.f3892y) {
            d1Var = (d1) this.f3889v.remove(jVar);
        }
        if (d1Var != null) {
            q.d().a(I, "Stopping tracking for " + jVar);
            d1Var.j(null);
        }
        if (!z3) {
            synchronized (this.f3892y) {
                this.D.remove(jVar);
            }
        }
    }
}