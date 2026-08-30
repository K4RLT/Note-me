package com.google.android.gms.internal.ads;
import ic.c;
import mc.c;
import q.x;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6518a;

    /* renamed from: b, reason: collision with root package name */
    public int f6519b;

    /* renamed from: c, reason: collision with root package name */
    public int f6520c;

    /* renamed from: d, reason: collision with root package name */
    public int f6521d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6522f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6523g;

    public h0(int i) {
        this.f6518a = 1;
        this.f6519b = i;
        if (i > 0) {
            this.f6522f = new c(17);
            this.f6523g = new Object();
        } else {
            x.n("maxSize <= 0");
            throw null;
        }
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public Object c(Object obj) {
        Object put;
        obj.getClass();
        synchronized (((c) this.f6523g)) {
            c cVar = (c) this.f6522f;
            cVar.getClass();
            Object obj2 = ((LinkedHashMap) cVar.f18393v).get(obj);
            if (obj2 != null) {
                this.f6521d++;
                return obj2;
            }
            this.e++;
            Object a10 = a(obj);
            if (a10 == null) {
                return null;
            }
            synchronized (((c) this.f6523g)) {
                c cVar2 = (c) this.f6522f;
                cVar2.getClass();
                put = ((LinkedHashMap) cVar2.f18393v).put(obj, a10);
                if (put != null) {
                    c cVar3 = (c) this.f6522f;
                    cVar3.getClass();
                    ((LinkedHashMap) cVar3.f18393v).put(obj, put);
                } else {
                    this.f6520c++;
                }
            }
            if (put != null) {
                b(obj, a10, put);
                return put;
            }
            f(this.f6519b);
            return a10;
        }
    }

    public Object d(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (((c) this.f6523g)) {
            this.f6520c++;
            c cVar = (c) this.f6522f;
            cVar.getClass();
            put = ((LinkedHashMap) cVar.f18393v).put(obj, obj2);
            if (put != null) {
                this.f6520c--;
            }
        }
        if (put != null) {
            b(obj, put, obj2);
        }
        f(this.f6519b);
        return put;
    }

    public Object e(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (((c) this.f6523g)) {
            c cVar = (c) this.f6522f;
            cVar.getClass();
            remove = ((LinkedHashMap) cVar.f18393v).remove(obj);
            if (remove != null) {
                this.f6520c--;
            }
        }
        if (remove != null) {
            b(obj, remove, null);
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0017, B:16:0x001f, B:18:0x0023, B:20:0x0032, B:22:0x0048, B:25:0x0067, B:27:0x006d, B:33:0x0052, B:34:0x0058, B:37:0x0063, B:12:0x0097, B:13:0x009e), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f6523g
            c r0 = (c) r0
            monitor-enter(r0)
            int r1 = r5.f6520c     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L97
            java.lang.Object r1 = r5.f6522f     // Catch: java.lang.Throwable -> L1c
            c r1 = (c) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f18393v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r5.f6520c     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L97
            goto L1f
        L1c:
            r6 = move-exception
            goto L9f
        L1f:
            int r1 = r5.f6520c     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L95
            java.lang.Object r1 = r5.f6522f     // Catch: java.lang.Throwable -> L1c
            c r1 = (c) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f18393v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L32
            goto L95
        L32:
            java.lang.Object r1 = r5.f6522f     // Catch: java.lang.Throwable -> L1c
            c r1 = (c) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f18393v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L58
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L52
        L50:
            r1 = r3
            goto L67
        L52:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L58:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L63
            goto L50
        L63:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1c
        L67:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L6d
            monitor-exit(r0)
            return
        L6d:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r5.f6522f     // Catch: java.lang.Throwable -> L1c
            c r4 = (c) r4     // Catch: java.lang.Throwable -> L1c
            r4.getClass()     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r4.f18393v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L1c
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1c
            int r4 = r5.f6520c     // Catch: java.lang.Throwable -> L1c
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + (-1)
            r5.f6520c = r4     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            r5.b(r2, r1, r3)
            goto L0
        L95:
            monitor-exit(r0)
            return
        L97:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L9f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h0.f(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(int i, float f10) {
        g0 g0Var;
        g0[] g0VarArr = (g0[]) this.f6523g;
        ArrayList arrayList = (ArrayList) this.f6522f;
        if (this.f6519b != 1) {
            Collections.sort(arrayList, c.G);
            this.f6519b = 1;
        }
        int i10 = this.e;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.e = i11;
            g0Var = g0VarArr[i11];
        } else {
            g0Var = new Object();
        }
        int i12 = this.f6520c;
        this.f6520c = i12 + 1;
        g0Var.f6232a = i12;
        g0Var.f6233b = i;
        g0Var.f6234c = f10;
        arrayList.add(g0Var);
        this.f6521d += i;
        while (true) {
            int i13 = this.f6521d;
            if (i13 > 2000) {
                int i14 = i13 - 2000;
                g0 g0Var2 = (g0) arrayList.get(0);
                int i15 = g0Var2.f6233b;
                if (i15 <= i14) {
                    this.f6521d -= i15;
                    arrayList.remove(0);
                    int i16 = this.e;
                    if (i16 < 5) {
                        this.e = i16 + 1;
                        g0VarArr[i16] = g0Var2;
                    }
                } else {
                    g0Var2.f6233b = i15 - i14;
                    this.f6521d -= i14;
                }
            } else {
                return;
            }
        }
    }

    public float h() {
        ArrayList arrayList = (ArrayList) this.f6522f;
        if (this.f6519b != 0) {
            Collections.sort(arrayList, c.F);
            this.f6519b = 0;
        }
        float f10 = this.f6521d;
        int i = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            float f11 = 0.5f * f10;
            g0 g0Var = (g0) arrayList.get(i10);
            i += g0Var.f6233b;
            if (i >= f11) {
                return g0Var.f6234c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((g0) arrayList.get(arrayList.size() - 1)).f6234c;
    }

    public String toString() {
        int i;
        String str;
        switch (this.f6518a) {
            case 1:
                synchronized (((c) this.f6523g)) {
                    try {
                        int i10 = this.f6521d;
                        int i11 = this.e + i10;
                        if (i11 != 0) {
                            i = (i10 * 100) / i11;
                        } else {
                            i = 0;
                        }
                        str = "LruCache[maxSize=" + this.f6519b + ",hits=" + this.f6521d + ",misses=" + this.e + ",hitRate=" + i + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public h0() {
        this.f6518a = 0;
        this.f6523g = new g0[5];
        this.f6522f = new ArrayList();
        this.f6519b = -1;
    }
}
