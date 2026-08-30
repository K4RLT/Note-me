package com.google.android.gms.internal.ads;
import g5.q;
import r2.a;
import r2.b;
import r6.b;
import r6.c;
import r6.e;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class wl1 extends AbstractMap implements Serializable {
    public static final c B = new c(19);
    public sl1 A;

    /* renamed from: v, reason: collision with root package name */
    public vl1 f12276v;

    /* renamed from: z, reason: collision with root package name */
    public sl1 f12280z;

    /* renamed from: w, reason: collision with root package name */
    public int f12277w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f12278x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final c f12275u = B;

    /* renamed from: y, reason: collision with root package name */
    public final vl1 f12279y = new vl1();

    public final vl1 a(Object obj, boolean z3) {
        int i;
        vl1 vl1Var;
        Comparable comparable;
        vl1 vl1Var2;
        vl1 vl1Var3 = this.f12276v;
        c cVar = B;
        c cVar2 = this.f12275u;
        if (vl1Var3 != null) {
            if (cVar2 == cVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = vl1Var3.f11940z;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = cVar2.compare(obj, obj2);
                }
                if (i == 0) {
                    return vl1Var3;
                }
                if (i < 0) {
                    vl1Var2 = vl1Var3.f11936v;
                } else {
                    vl1Var2 = vl1Var3.f11937w;
                }
                if (vl1Var2 == null) {
                    break;
                }
                vl1Var3 = vl1Var2;
            }
        } else {
            i = 0;
        }
        if (!z3) {
            return null;
        }
        vl1 vl1Var4 = this.f12279y;
        if (vl1Var3 == null) {
            if (cVar2 == cVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            vl1Var = new vl1(null, obj, vl1Var4, vl1Var4.f11939y);
            this.f12276v = vl1Var;
        } else {
            vl1 vl1Var5 = new vl1(vl1Var3, obj, vl1Var4, vl1Var4.f11939y);
            if (i < 0) {
                vl1Var3.f11936v = vl1Var5;
            } else {
                vl1Var3.f11937w = vl1Var5;
            }
            e(vl1Var3, true);
            vl1Var = vl1Var5;
        }
        this.f12277w++;
        this.f12278x++;
        return vl1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        b(r0, false);
        r8 = r7.f11936v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = r8.B;
        r0.f11936v = r8;
        r8.f11935u = r0;
        r7.f11936v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r8 = r7.f11937w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r2 = r8.B;
        r0.f11937w = r8;
        r8.f11935u = r0;
        r7.f11937w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0.B = java.lang.Math.max(r1, r2) + 1;
        c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        r5 = r0;
        r0 = r0.f11936v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r8.B > r0.B) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r0 = r8;
        r8 = r8.f11937w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.internal.ads.vl1 r7, boolean r8) {
        /*
            r6 = this;
            if (r8 == 0) goto Lc
            com.google.android.gms.internal.ads.vl1 r8 = r7.f11939y
            com.google.android.gms.internal.ads.vl1 r0 = r7.f11938x
            r8.f11938x = r0
            com.google.android.gms.internal.ads.vl1 r0 = r7.f11938x
            r0.f11939y = r8
        Lc:
            com.google.android.gms.internal.ads.vl1 r8 = r7.f11936v
            com.google.android.gms.internal.ads.vl1 r0 = r7.f11937w
            com.google.android.gms.internal.ads.vl1 r1 = r7.f11935u
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L58
            if (r0 == 0) goto L58
            int r1 = r8.B
            int r4 = r0.B
            if (r1 <= r4) goto L26
        L1e:
            com.google.android.gms.internal.ads.vl1 r0 = r8.f11937w
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L2f
            goto L1e
        L26:
            com.google.android.gms.internal.ads.vl1 r8 = r0.f11936v
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L2e
            goto L26
        L2e:
            r0 = r8
        L2f:
            b(r0, r2)
            com.google.android.gms.internal.ads.vl1 r8 = r7.f11936v
            if (r8 == 0) goto L3f
            int r1 = r8.B
            r0.f11936v = r8
            r8.f11935u = r0
            r7.f11936v = r3
            goto L40
        L3f:
            r1 = r2
        L40:
            com.google.android.gms.internal.ads.vl1 r8 = r7.f11937w
            if (r8 == 0) goto L4c
            int r2 = r8.B
            r0.f11937w = r8
            r8.f11935u = r0
            r7.f11937w = r3
        L4c:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.B = r8
            c(r7, r0)
            return
        L58:
            if (r8 == 0) goto L60
            c(r7, r8)
            r7.f11936v = r3
            goto L6b
        L60:
            if (r0 == 0) goto L68
            c(r7, r0)
            r7.f11937w = r3
            goto L6b
        L68:
            c(r7, r3)
        L6b:
            e(r1, r2)
            int r7 = r6.f12277w
            int r7 = r7 + (-1)
            r6.f12277w = r7
            int r7 = r6.f12278x
            int r7 = r7 + 1
            r6.f12278x = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wl1.b(com.google.android.gms.internal.ads.vl1, boolean):void");
    }

    public final void c(vl1 vl1Var, vl1 vl1Var2) {
        vl1 vl1Var3 = vl1Var.f11935u;
        vl1Var.f11935u = null;
        if (vl1Var2 != null) {
            vl1Var2.f11935u = vl1Var3;
        }
        if (vl1Var3 != null) {
            if (vl1Var3.f11936v == vl1Var) {
                vl1Var3.f11936v = vl1Var2;
                return;
            } else {
                vl1Var3.f11937w = vl1Var2;
                return;
            }
        }
        this.f12276v = vl1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f12276v = null;
        this.f12277w = 0;
        this.f12278x++;
        vl1 vl1Var = this.f12279y;
        vl1Var.f11939y = vl1Var;
        vl1Var.f11938x = vl1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        vl1 vl1Var = null;
        if (obj != null) {
            try {
                vl1Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (vl1Var == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.ads.vl1 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.vl1 r0 = r9.f11936v
            com.google.android.gms.internal.ads.vl1 r1 = r9.f11937w
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.B
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.B
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.vl1 r0 = r1.f11936v
            com.google.android.gms.internal.ads.vl1 r3 = r1.f11937w
            if (r3 == 0) goto L22
            int r3 = r3.B
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.B
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.g(r1)
            r8.f(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.f(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.ads.vl1 r1 = r0.f11936v
            com.google.android.gms.internal.ads.vl1 r3 = r0.f11937w
            if (r3 == 0) goto L4e
            int r3 = r3.B
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.B
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.f(r0)
            r8.g(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.g(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.B = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.B = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.vl1 r9 = r9.f11935u
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wl1.e(com.google.android.gms.internal.ads.vl1, boolean):void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        sl1 sl1Var = this.f12280z;
        if (sl1Var == null) {
            sl1 sl1Var2 = new sl1(this, 0);
            this.f12280z = sl1Var2;
            return sl1Var2;
        }
        return sl1Var;
    }

    public final void f(vl1 vl1Var) {
        int i;
        int i10;
        vl1 vl1Var2 = vl1Var.f11936v;
        vl1 vl1Var3 = vl1Var.f11937w;
        vl1 vl1Var4 = vl1Var3.f11936v;
        vl1 vl1Var5 = vl1Var3.f11937w;
        vl1Var.f11937w = vl1Var4;
        if (vl1Var4 != null) {
            vl1Var4.f11935u = vl1Var;
        }
        c(vl1Var, vl1Var3);
        vl1Var3.f11936v = vl1Var;
        vl1Var.f11935u = vl1Var3;
        int i11 = 0;
        if (vl1Var2 != null) {
            i = vl1Var2.B;
        } else {
            i = 0;
        }
        if (vl1Var4 != null) {
            i10 = vl1Var4.B;
        } else {
            i10 = 0;
        }
        int max = Math.max(i, i10) + 1;
        vl1Var.B = max;
        if (vl1Var5 != null) {
            i11 = vl1Var5.B;
        }
        vl1Var3.B = Math.max(max, i11) + 1;
    }

    public final void g(vl1 vl1Var) {
        int i;
        int i10;
        vl1 vl1Var2 = vl1Var.f11936v;
        vl1 vl1Var3 = vl1Var.f11937w;
        vl1 vl1Var4 = vl1Var2.f11936v;
        vl1 vl1Var5 = vl1Var2.f11937w;
        vl1Var.f11936v = vl1Var5;
        if (vl1Var5 != null) {
            vl1Var5.f11935u = vl1Var;
        }
        c(vl1Var, vl1Var2);
        vl1Var2.f11937w = vl1Var;
        vl1Var.f11935u = vl1Var2;
        int i11 = 0;
        if (vl1Var3 != null) {
            i = vl1Var3.B;
        } else {
            i = 0;
        }
        if (vl1Var5 != null) {
            i10 = vl1Var5.B;
        } else {
            i10 = 0;
        }
        int max = Math.max(i, i10) + 1;
        vl1Var.B = max;
        if (vl1Var4 != null) {
            i11 = vl1Var4.B;
        }
        vl1Var2.B = Math.max(max, i11) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.android.gms.internal.ads.vl1 r3 = a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.A
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wl1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        sl1 sl1Var = this.A;
        if (sl1Var == null) {
            sl1 sl1Var2 = new sl1(this, 1);
            this.A = sl1Var2;
            return sl1Var2;
        }
        return sl1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                vl1 a10 = a(obj, true);
                Object obj3 = a10.A;
                a10.A = obj2;
                return obj3;
            }
            q.h("value == null");
            return null;
        }
        q.h("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.android.gms.internal.ads.vl1 r3 = a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            b(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.A
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wl1.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12277w;
    }
}
