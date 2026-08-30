package xf;

import c4.s;
import df.l;
import df.p;
import df.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pe.z;
import pf.b2;
import pf.j;
import pf.k;
import qe.m;
import uf.r;
import vd.n;

/* loaded from: classes.dex */
public final class e implements j, b2 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30779z = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* renamed from: u, reason: collision with root package name */
    public final te.g f30780u;

    /* renamed from: w, reason: collision with root package name */
    public Object f30782w;
    private volatile /* synthetic */ Object state$volatile = g.f30786a;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f30781v = new ArrayList(2);

    /* renamed from: x, reason: collision with root package name */
    public int f30783x = -1;

    /* renamed from: y, reason: collision with root package name */
    public Object f30784y = g.f30789d;

    public e(te.g gVar) {
        this.f30780u = gVar;
    }

    @Override // pf.b2
    public final void a(r rVar, int i) {
        this.f30782w = rVar;
        this.f30783x = i;
    }

    @Override // pf.j
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30779z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == g.f30787b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g.f30788c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f30781v;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ((c) obj2).a();
            }
            this.f30784y = g.f30789d;
            this.f30781v = null;
            return;
        }
    }

    public final Object c(ve.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30779z;
        Object obj = atomicReferenceFieldUpdater.get(this);
        obj.getClass();
        c cVar2 = (c) obj;
        Object obj2 = cVar2.f30771d;
        Object obj3 = this.f30784y;
        ArrayList arrayList = this.f30781v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj4 = arrayList.get(i);
                i++;
                c cVar3 = (c) obj4;
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, g.f30787b);
            this.f30784y = g.f30789d;
            this.f30781v = null;
        }
        Object b10 = cVar2.f30770c.b(cVar2.f30768a, obj2, obj3);
        te.c cVar4 = cVar2.e;
        if (obj2 == g.e) {
            return ((l) cVar4).invoke(cVar);
        }
        return ((p) cVar4).invoke(b10, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ve.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof xf.d
            if (r0 == 0) goto L13
            r0 = r11
            xf.d r0 = (xf.d) r0
            int r1 = r0.f30778x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30778x = r1
            goto L18
        L13:
            xf.d r0 = new xf.d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f30776v
            int r1 = r0.f30778x
            ue.a r2 = ue.a.f27192u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L39
            if (r1 == r5) goto L32
            if (r1 != r4) goto L2b
            pe.a.e(r11)
            return r11
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r11)
        L30:
            r11 = 0
            return r11
        L32:
            xf.e r1 = r0.f30775u
            pe.a.e(r11)
            goto Lbe
        L39:
            pe.a.e(r11)
            r0.f30775u = r10
            r0.f30778x = r5
            pf.l r11 = new pf.l
            te.c r1 = ya.rc.b(r0)
            r11.<init>(r5, r1)
            r11.s()
        L4c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = xf.e.f30779z
            java.lang.Object r6 = r1.get(r10)
            pe.z r7 = pe.z.f22715a
            c4.s r8 = xf.g.f30786a
            if (r6 != r8) goto L69
        L58:
            boolean r8 = r1.compareAndSet(r10, r6, r11)
            if (r8 == 0) goto L62
            r11.v(r10)
            goto Lb3
        L62:
            java.lang.Object r8 = r1.get(r10)
            if (r8 == r6) goto L58
            goto L4c
        L69:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L9a
        L6d:
            boolean r7 = r1.compareAndSet(r10, r6, r8)
            if (r7 == 0) goto L93
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r1 = r6.iterator()
        L79:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r1.next()
            xf.c r6 = r10.e(r6)
            r6.getClass()
            r6.f30773g = r3
            r7 = -1
            r6.f30774h = r7
            r10.f(r6, r5)
            goto L79
        L93:
            java.lang.Object r7 = r1.get(r10)
            if (r7 == r6) goto L6d
            goto L4c
        L9a:
            boolean r1 = r6 instanceof xf.c
            if (r1 == 0) goto Lca
            xf.c r6 = (xf.c) r6
            java.lang.Object r1 = r10.f30784y
            df.q r5 = r6.f30772f
            if (r5 == 0) goto Laf
            java.lang.Object r6 = r6.f30771d
            java.lang.Object r1 = r5.b(r10, r6, r1)
            df.q r1 = (df.q) r1
            goto Lb0
        Laf:
            r1 = r3
        Lb0:
            r11.h(r7, r1)
        Lb3:
            java.lang.Object r11 = r11.r()
            if (r11 != r2) goto Lba
            r7 = r11
        Lba:
            if (r7 != r2) goto Lbd
            goto Lc8
        Lbd:
            r1 = r10
        Lbe:
            r0.f30775u = r3
            r0.f30778x = r4
            java.lang.Object r11 = r1.c(r0)
            if (r11 != r2) goto Lc9
        Lc8:
            return r2
        Lc9:
            return r11
        Lca:
            java.lang.String r11 = "unexpected state: "
            l4.a.n(r6, r11)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: xf.e.d(ve.c):java.lang.Object");
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f30781v;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((c) obj3).f30768a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        n.c("Clause with object ", obj, " is not found");
        return null;
    }

    public final void f(c cVar, boolean z3) {
        Object obj = cVar.f30768a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30779z;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z3) {
            ArrayList arrayList = this.f30781v;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((c) obj2).f30768a == obj) {
                        l4.a.f(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        cVar.f30769b.b(obj, this, cVar.f30771d);
        if (this.f30784y == g.f30789d) {
            if (!z3) {
                ArrayList arrayList2 = this.f30781v;
                arrayList2.getClass();
                arrayList2.add(cVar);
            }
            cVar.f30773g = this.f30782w;
            cVar.f30774h = this.f30783x;
            this.f30782w = null;
            this.f30783x = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, cVar);
    }

    public final int g(Object obj, Object obj2) {
        q qVar;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30779z;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof k) {
                c e = e(obj);
                if (e != null) {
                    q qVar2 = e.f30772f;
                    if (qVar2 != null) {
                        qVar = (q) qVar2.b(this, e.f30771d, obj2);
                    } else {
                        qVar = null;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    k kVar = (k) obj3;
                    this.f30784y = obj2;
                    s g8 = kVar.g(z.f22715a, qVar);
                    if (g8 == null) {
                        this.f30784y = g.f30789d;
                        return 2;
                    }
                    kVar.n(g8);
                    return 0;
                }
                continue;
            } else {
                if (!kotlin.jvm.internal.l.a(obj3, g.f30787b) && !(obj3 instanceof c)) {
                    if (kotlin.jvm.internal.l.a(obj3, g.f30788c)) {
                        return 2;
                    }
                    if (kotlin.jvm.internal.l.a(obj3, g.f30786a)) {
                        List g10 = m.g(obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, g10)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        return 1;
                    }
                    if (obj3 instanceof List) {
                        ArrayList F = qe.l.F((Collection) obj3, obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, F)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        return 1;
                    }
                    l4.a.n(obj3, "Unexpected state: ");
                    return 0;
                }
                return 3;
            }
        }
    }
}
