package xa;
import x.n;
import c2.e;
import c2.i;
import q.x;
import z.b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f30721f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f30722a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f30723b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final n0 f30724c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f30725d;
    public final List e;

    static {
        x xVar = x.f30699d;
    }

    public z(p0 p0Var, int i, HashMap hashMap, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        r1 r1Var;
        p1 p1Var;
        n0 n0Var = new n0(arrayList2, hashMap);
        this.f30724c = n0Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(c2.A);
        if (i10 == 1) {
            r1Var = q1.f30506d;
        } else {
            r1Var = new r1(0);
        }
        arrayList3.add(r1Var);
        arrayList3.add(p0Var);
        arrayList3.addAll(arrayList);
        arrayList3.add(c2.f30385p);
        arrayList3.add(c2.f30377g);
        arrayList3.add(c2.f30375d);
        arrayList3.add(e);
        arrayList3.add(c2.f30376f);
        o1 o1Var = c2.f30380k;
        arrayList3.add(new b2(Long.TYPE, Long.class, o1Var));
        arrayList3.add(new b2(Double.TYPE, Double.class, new o1(1)));
        arrayList3.add(new b2(Float.TYPE, Float.class, new o1(2)));
        if (i11 == 2) {
            p1Var = q1.f30505c;
        } else {
            int i12 = 0;
            p1Var = new p1(new q1(i11, i12), i12);
        }
        arrayList3.add(p1Var);
        arrayList3.add(c2.f30378h);
        arrayList3.add(i);
        arrayList3.add(new z1(AtomicLong.class, new i2(o1Var, 1).b(), 0));
        int i13 = 0;
        arrayList3.add(new z1(AtomicLongArray.class, new i2(o1Var, 2).b(), i13));
        arrayList3.add(c2.f30379j);
        arrayList3.add(c2.f30381l);
        arrayList3.add(c2.f30386q);
        arrayList3.add(c2.f30387r);
        arrayList3.add(new z1(BigDecimal.class, c2.f30382m, i13));
        arrayList3.add(new z1(BigInteger.class, c2.f30383n, i13));
        arrayList3.add(new z1(w0.class, c2.f30384o, i13));
        arrayList3.add(c2.f30388s);
        arrayList3.add(c2.f30389t);
        arrayList3.add(c2.f30391v);
        arrayList3.add(c2.f30392w);
        arrayList3.add(c2.f30394y);
        arrayList3.add(c2.f30390u);
        arrayList3.add(c2.f30373b);
        arrayList3.add(e);
        arrayList3.add(c2.f30393x);
        if (j2.f30437a) {
            arrayList3.add(j2.f30439c);
            arrayList3.add(j2.f30438b);
            arrayList3.add(j2.f30440d);
        }
        arrayList3.add(k1.f30445d);
        arrayList3.add(c2.f30372a);
        arrayList3.add(new l1(n0Var, 0));
        arrayList3.add(new l1(n0Var, 1));
        z1 z1Var = new z1(n0Var);
        this.f30725d = z1Var;
        arrayList3.add(z1Var);
        arrayList3.add(c2.B);
        arrayList3.add(new y1(n0Var, i, p0Var, z1Var, arrayList2));
        this.e = Collections.unmodifiableList(arrayList3);
    }

    public final i0 a(k2 k2Var) {
        boolean z3;
        ConcurrentHashMap concurrentHashMap = this.f30723b;
        i0 i0Var = (i0) concurrentHashMap.get(k2Var);
        if (i0Var != null) {
            return i0Var;
        }
        ThreadLocal threadLocal = this.f30722a;
        Map map = (Map) threadLocal.get();
        boolean z9 = false;
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            i0 i0Var2 = (i0) map.get(k2Var);
            if (i0Var2 == null) {
                z3 = false;
            } else {
                return i0Var2;
            }
        }
        try {
            i2 i2Var = new i2();
            i0 i0Var3 = null;
            i2Var.f30432b = null;
            map.put(k2Var, i2Var);
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i0Var3 = ((j0) it.next()).a(this, k2Var);
                if (i0Var3 != null) {
                    if (i2Var.f30432b == null) {
                        i2Var.f30432b = i0Var3;
                        map.put(k2Var, i0Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z3) {
                threadLocal.remove();
                z9 = true;
            }
            if (i0Var3 != null) {
                if (z9) {
                    concurrentHashMap.putAll(map);
                }
                return i0Var3;
            }
            x.n("GSON (2.12.1) cannot handle ".concat(String.valueOf(k2Var)));
            return null;
        } catch (Throwable th) {
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        r10.f30457v = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xa.l2 r10, xa.k2 r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b(xa.l2, xa.k2):java.lang.Object");
    }

    public final String toString() {
        return a5.a.h("{serializeNulls:false,factories:", String.valueOf(this.e), ",instanceCreators:", this.f30724c.f30475a.toString(), "}");
    }
}
