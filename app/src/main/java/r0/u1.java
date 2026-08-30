package r0;
import a1.c;
import a1.f;
import b1.d;
import b1.i;
import b1.j;
import b1.p;
import e0.b;
import n.i0;
import n.j0;
import q.n;
import q.x;
import r0.u1;
import r0.u;
import r0.z0;
import t0.e;
import t0.g;

import android.util.Log;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u1 extends u {

    /* renamed from: x, reason: collision with root package name */
    public static final sf.n0 f24393x = sf.b(b.f30038x);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference f24394y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final f f24395a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24396b;

    /* renamed from: c, reason: collision with root package name */
    public pf.d1 f24397c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f24398d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public Object f24399f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f24400g;

    /* renamed from: h, reason: collision with root package name */
    public final e f24401h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f24402j;

    /* renamed from: k, reason: collision with root package name */
    public final i0 f24403k;

    /* renamed from: l, reason: collision with root package name */
    public final j6.s f24404l;

    /* renamed from: m, reason: collision with root package name */
    public final i0 f24405m;

    /* renamed from: n, reason: collision with root package name */
    public final i0 f24406n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f24407o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f24408p;

    /* renamed from: q, reason: collision with root package name */
    public pf.l f24409q;

    /* renamed from: r, reason: collision with root package name */
    public k6.i f24410r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24411s;

    /* renamed from: t, reason: collision with root package name */
    public final sf.n0 f24412t;

    /* renamed from: u, reason: collision with root package name */
    public final pf.f1 f24413u;

    /* renamed from: v, reason: collision with root package name */
    public final te.g f24414v;

    /* renamed from: w, reason: collision with root package name */
    public final v0 f24415w;

    public u1(te.g gVar) {
        f fVar = new f(new c(26, this));
        this.f24395a = fVar;
        this.f24396b = new Object();
        this.e = new ArrayList();
        this.f24400g = new j0();
        this.f24401h = new e(new x[16]);
        this.i = new ArrayList();
        this.f24402j = new ArrayList();
        this.f24403k = new i0();
        this.f24404l = new j6.s();
        this.f24405m = new i0();
        this.f24406n = new i0();
        this.f24412t = sf.b(r1.f24363w);
        new ya.y(6);
        pf.f1 f1Var = new pf.f1((pf.d1) gVar.L(pf.w.f22803v));
        f1Var.p(new f(21, this));
        this.f24413u = f1Var;
        this.f24414v = gVar.V(fVar).V(f1Var);
        this.f24415w = new v0(8);
    }

    public static void r(d dVar) {
        try {
            if (!(dVar.w() instanceof j)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            dVar.c();
        }
    }

    public static final void x(ArrayList arrayList, u1 u1Var, x xVar) {
        arrayList.clear();
        synchronized (u1Var.f24396b) {
            Iterator it = u1Var.f24402j.iterator();
            if (it.hasNext()) {
                ((z0) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(Throwable th, x xVar) {
        if (((Boolean) f24394y.get()).booleanValue() && !(th instanceof k)) {
            synchronized (this.f24396b) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.i.clear();
                    this.f24401h.j();
                    this.f24400g = new j0();
                    this.f24402j.clear();
                    this.f24403k.a();
                    this.f24405m.a();
                    this.f24410r = new k6.i(23, th);
                    if (xVar != null) {
                        C(xVar);
                    }
                    t();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f24396b) {
            k6.i iVar = this.f24410r;
            if (iVar == null) {
                this.f24410r = new k6.i(23, th);
            } else {
                throw ((Throwable) iVar.f19569v);
            }
        }
        throw th;
    }

    public final boolean B() {
        synchronized (this.f24396b) {
            boolean z3 = true;
            if (this.f24400g.g()) {
                if (this.f24401h.f25619w == 0 && !u() && !this.f24403k.j()) {
                    z3 = false;
                }
                return z3;
            }
            List w10 = w();
            g gVar = new g(this.f24400g);
            this.f24400g = new j0();
            try {
                int size = w10.size();
                for (int i = 0; i < size; i++) {
                    ((x) w10.get(i)).x(gVar);
                    if (((r1) this.f24412t.getValue()).compareTo(r1.f24362v) <= 0) {
                        break;
                    }
                }
                synchronized (this.f24396b) {
                    if (t() == null) {
                        if (this.f24401h.f25619w == 0 && !u() && !this.f24403k.j()) {
                            z3 = false;
                        }
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return z3;
            } catch (Throwable th) {
                synchronized (this.f24396b) {
                    j0 j0Var = this.f24400g;
                    j0Var.getClass();
                    Iterator<E> it = gVar.iterator();
                    while (it.hasNext()) {
                        j0Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void C(x xVar) {
        ArrayList arrayList = this.f24407o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f24407o = arrayList;
        }
        if (!arrayList.contains(xVar)) {
            arrayList.add(xVar);
        }
        if (this.e.remove(xVar)) {
            this.f24399f = null;
        }
    }

    @Override // u
    public final void a(x xVar, df.p pVar) {
        Object obj;
        boolean z3;
        d dVar;
        d C;
        boolean z9 = xVar.N.F;
        synchronized (this.f24396b) {
            obj = null;
            if (((r1) this.f24412t.getValue()).compareTo(r1.f24362v) > 0) {
                boolean contains = w().contains(xVar);
                z3 = !contains;
                if (!contains) {
                    this.e.add(xVar);
                    this.f24399f = null;
                }
            } else {
                z3 = true;
            }
        }
        try {
            f fVar = new f(20, xVar);
            androidx.ink.authoring.compose.d dVar2 = new androidx.ink.authoring.compose.d(xVar, 17, obj);
            i k3 = p.k();
            if (k3 instanceof d) {
                dVar = (d) k3;
            } else {
                dVar = null;
            }
            if (dVar != null && (C = dVar.C(fVar, dVar2)) != null) {
                try {
                    i j10 = C.j();
                    try {
                        xVar.j(pVar);
                        if (!z9) {
                            p.k().m();
                        }
                        try {
                            synchronized (this.f24396b) {
                                ArrayList arrayList = this.f24402j;
                                if (arrayList.size() > 0) {
                                    ((z0) arrayList.get(0)).getClass();
                                    throw null;
                                }
                            }
                            try {
                                xVar.d();
                                xVar.f();
                                if (!z9) {
                                    p.k().m();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                A(th, null);
                                return;
                            }
                        } catch (Throwable th2) {
                            A(th2, xVar);
                            return;
                        }
                    } finally {
                        i.q(j10);
                    }
                } finally {
                    r(C);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            A(th3, xVar);
            if (z3) {
                synchronized (this.f24396b) {
                    if (this.e.remove(xVar)) {
                        this.f24399f = null;
                    }
                }
            }
        }
    }

    @Override // u
    public final boolean c() {
        return ((Boolean) f24394y.get()).booleanValue();
    }

    @Override // u
    public final boolean d() {
        return false;
    }

    @Override // u
    public final boolean e() {
        return false;
    }

    @Override // u
    public final long f() {
        return AdError.NETWORK_ERROR_CODE;
    }

    @Override // u
    public final t g() {
        return null;
    }

    @Override // u
    public final te.g i() {
        return this.f24414v;
    }

    @Override // u
    public final void j(x xVar) {
        pf.k kVar;
        synchronized (this.f24396b) {
            if (!this.f24401h.k(xVar)) {
                this.f24401h.b(xVar);
                kVar = t();
            } else {
                kVar = null;
            }
        }
        if (kVar != null) {
            ((pf.l) kVar).resumeWith(pe.z.f22715a);
        }
    }

    @Override // u
    public final y0 k(z0 z0Var) {
        y0 y0Var;
        synchronized (this.f24396b) {
            y0Var = (y0) this.f24405m.k(z0Var);
        }
        return y0Var;
    }

    @Override // u
    public final void n(x xVar) {
        synchronized (this.f24396b) {
            try {
                LinkedHashSet linkedHashSet = this.f24408p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f24408p = linkedHashSet;
                }
                linkedHashSet.add(xVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u
    public final void q(x xVar) {
        synchronized (this.f24396b) {
            if (this.e.remove(xVar)) {
                this.f24399f = null;
            }
            this.f24401h.m(xVar);
            this.i.remove(xVar);
        }
    }

    public final void s() {
        synchronized (this.f24396b) {
            if (((r1) this.f24412t.getValue()).compareTo(r1.f24365y) >= 0) {
                sf.n0 n0Var = this.f24412t;
                r1 r1Var = r1.f24362v;
                n0Var.getClass();
                n0Var.k(null, r1Var);
            }
        }
        this.f24413u.j(null);
    }

    public final pf.k t() {
        sf.n0 n0Var = this.f24412t;
        int compareTo = ((r1) n0Var.getValue()).compareTo(r1.f24362v);
        ArrayList arrayList = this.f24402j;
        ArrayList arrayList2 = this.i;
        e eVar = this.f24401h;
        if (compareTo <= 0) {
            for (x xVar : w()) {
            }
            this.e.clear();
            this.f24399f = qe.s.f24023u;
            this.f24400g = new j0();
            eVar.j();
            arrayList2.clear();
            arrayList.clear();
            this.f24407o = null;
            pf.l lVar = this.f24409q;
            if (lVar != null) {
                lVar.i(null);
            }
            this.f24409q = null;
            this.f24410r = null;
            return null;
        }
        k6.i iVar = this.f24410r;
        r1 r1Var = r1.f24366z;
        r1 r1Var2 = r1.f24363w;
        if (iVar == null) {
            if (this.f24397c == null) {
                this.f24400g = new j0();
                eVar.j();
                if (u()) {
                    r1Var2 = r1.f24364x;
                }
            } else {
                r1Var2 = (eVar.f25619w == 0 && !this.f24400g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !u() && !this.f24403k.j()) ? r1.f24365y : r1Var;
            }
        }
        n0Var.k(null, r1Var2);
        if (r1Var2 != r1Var) {
            return null;
        }
        pf.l lVar2 = this.f24409q;
        this.f24409q = null;
        return lVar2;
    }

    public final boolean u() {
        if (!this.f24411s && (this.f24395a.f24242x.get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        boolean z3;
        synchronized (this.f24396b) {
            if (!this.f24400g.h() && this.f24401h.f25619w == 0) {
                if (!u()) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List w() {
        List arrayList;
        Object r02 = this.f24399f;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty()) {
            arrayList = qe.s.f24023u;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.f24399f = arrayList;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        if (((pe.j) r10.get(r4)).f22694v == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0157, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0167, code lost:
    
        r11 = (pe.j) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016f, code lost:
    
        if (r11.f22694v != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0171, code lost:
    
        r11 = (z0) r11.f22693u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0178, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        r4 = r17.f24396b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        qe.n(r17.f24402j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0192, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019d, code lost:
    
        if (((pe.j) r11).f22694v == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019f, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a2, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a5, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.util.List r18, j0 r19) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.u1.y(java.util.List, j0):java.util.List");
    }

    public final x z(x xVar, j0 j0Var) {
        d dVar;
        d C;
        if (xVar.N.F || xVar.O == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f24408p;
        if (linkedHashSet == null || !linkedHashSet.contains(xVar)) {
            f fVar = new f(20, xVar);
            androidx.ink.authoring.compose.d dVar2 = new androidx.ink.authoring.compose.d(xVar, 17, j0Var);
            i k3 = p.k();
            if (k3 instanceof d) {
                dVar = (d) k3;
            } else {
                dVar = null;
            }
            if (dVar != null && (C = dVar.C(fVar, dVar2)) != null) {
                try {
                    i j10 = C.j();
                    if (j0Var != null) {
                        try {
                            if (j0Var.h()) {
                                androidx.ink.brush.b bVar = new androidx.ink.brush.b(j0Var, 7, xVar);
                                r rVar = xVar.N;
                                if (rVar.F) {
                                    c("Preparing a composition while composing is not supported");
                                }
                                rVar.F = true;
                                try {
                                    bVar.invoke();
                                    rVar.F = false;
                                } catch (Throwable th) {
                                    rVar.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            i.q(j10);
                            throw th2;
                        }
                    }
                    boolean w10 = xVar.w();
                    i.q(j10);
                    if (w10) {
                        return xVar;
                    }
                } finally {
                    r(C);
                }
            } else {
                x.o("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
        }
        return null;
    }

    @Override // u
    public final void l(Set set) {
    }
}