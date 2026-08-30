package xa;
import b1.b;
import b1.c;
import q.h;
import r2.a;
import r2.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class b1 extends AbstractMap implements Serializable {
    public static final x0 C = new Object();
    public z0 A;
    public z0 B;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30362v;

    /* renamed from: w, reason: collision with root package name */
    public a1 f30363w;

    /* renamed from: z, reason: collision with root package name */
    public final a1 f30366z;

    /* renamed from: x, reason: collision with root package name */
    public int f30364x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f30365y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final x0 f30361u = C;

    public b1(boolean z3) {
        this.f30362v = z3;
        this.f30366z = new a1(z3);
    }

    public final a1 a(Object obj, boolean z3) {
        int i;
        a1 a1Var;
        Comparable comparable;
        a1 a1Var2;
        a1 a1Var3 = this.f30363w;
        x0 x0Var = C;
        x0 x0Var2 = this.f30361u;
        if (a1Var3 != null) {
            if (x0Var2 == x0Var) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = a1Var3.f30358z;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = x0Var2.compare(obj, obj2);
                }
                if (i == 0) {
                    return a1Var3;
                }
                if (i < 0) {
                    a1Var2 = a1Var3.f30354v;
                } else {
                    a1Var2 = a1Var3.f30355w;
                }
                if (a1Var2 == null) {
                    break;
                }
                a1Var3 = a1Var2;
            }
        } else {
            i = 0;
        }
        if (!z3) {
            return null;
        }
        a1 a1Var4 = this.f30366z;
        if (a1Var3 == null) {
            if (x0Var2 == x0Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            a1Var = new a1(this.f30362v, null, obj, a1Var4, a1Var4.f30357y);
            this.f30363w = a1Var;
        } else {
            a1 a1Var5 = a1Var3;
            a1Var = new a1(this.f30362v, a1Var5, obj, a1Var4, a1Var4.f30357y);
            if (i < 0) {
                a1Var5.f30354v = a1Var;
            } else {
                a1Var5.f30355w = a1Var;
            }
            c(a1Var5, true);
        }
        this.f30364x++;
        this.f30365y++;
        return a1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        b(r0, false);
        r8 = r7.f30354v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = r8.C;
        r0.f30354v = r8;
        r8.f30353u = r0;
        r7.f30354v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r8 = r7.f30355w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r2 = r8.C;
        r0.f30355w = r8;
        r8.f30353u = r0;
        r7.f30355w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0.C = java.lang.Math.max(r1, r2) + 1;
        e(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        r5 = r0;
        r0 = r0.f30354v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r8.C > r0.C) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r0 = r8;
        r8 = r8.f30355w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(xa.a1 r7, boolean r8) {
        /*
            r6 = this;
            if (r8 == 0) goto Lc
            xa.a1 r8 = r7.f30357y
            xa.a1 r0 = r7.f30356x
            r8.f30356x = r0
            xa.a1 r0 = r7.f30356x
            r0.f30357y = r8
        Lc:
            xa.a1 r8 = r7.f30354v
            xa.a1 r0 = r7.f30355w
            xa.a1 r1 = r7.f30353u
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L58
            if (r0 == 0) goto L58
            int r1 = r8.C
            int r4 = r0.C
            if (r1 <= r4) goto L26
        L1e:
            xa.a1 r0 = r8.f30355w
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L2f
            goto L1e
        L26:
            xa.a1 r8 = r0.f30354v
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L2e
            goto L26
        L2e:
            r0 = r8
        L2f:
            r6.b(r0, r2)
            xa.a1 r8 = r7.f30354v
            if (r8 == 0) goto L3f
            int r1 = r8.C
            r0.f30354v = r8
            r8.f30353u = r0
            r7.f30354v = r3
            goto L40
        L3f:
            r1 = r2
        L40:
            xa.a1 r8 = r7.f30355w
            if (r8 == 0) goto L4c
            int r2 = r8.C
            r0.f30355w = r8
            r8.f30353u = r0
            r7.f30355w = r3
        L4c:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.C = r8
            r6.e(r7, r0)
            return
        L58:
            if (r8 == 0) goto L60
            r6.e(r7, r8)
            r7.f30354v = r3
            goto L6b
        L60:
            if (r0 == 0) goto L68
            r6.e(r7, r0)
            r7.f30355w = r3
            goto L6b
        L68:
            r6.e(r7, r3)
        L6b:
            r6.c(r1, r2)
            int r7 = r6.f30364x
            int r7 = r7 + (-1)
            r6.f30364x = r7
            int r7 = r6.f30365y
            int r7 = r7 + 1
            r6.f30365y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b(xa.a1, boolean):void");
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
    public final void c(xa.a1 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            xa.a1 r0 = r9.f30354v
            xa.a1 r1 = r9.f30355w
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.C
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.C
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            xa.a1 r0 = r1.f30354v
            xa.a1 r3 = r1.f30355w
            if (r3 == 0) goto L22
            int r3 = r3.C
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.C
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
            xa.a1 r1 = r0.f30354v
            xa.a1 r3 = r0.f30355w
            if (r3 == 0) goto L4e
            int r3 = r3.C
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.C
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
            r9.C = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.C = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            xa.a1 r9 = r9.f30353u
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.c(xa.a1, boolean):void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f30363w = null;
        this.f30364x = 0;
        this.f30365y++;
        a1 a1Var = this.f30366z;
        a1Var.f30357y = a1Var;
        a1Var.f30356x = a1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a1 a1Var = null;
        if (obj != null) {
            try {
                a1Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (a1Var == null) {
            return false;
        }
        return true;
    }

    public final void e(a1 a1Var, a1 a1Var2) {
        a1 a1Var3 = a1Var.f30353u;
        a1Var.f30353u = null;
        if (a1Var2 != null) {
            a1Var2.f30353u = a1Var3;
        }
        if (a1Var3 != null) {
            if (a1Var3.f30354v == a1Var) {
                a1Var3.f30354v = a1Var2;
                return;
            } else {
                a1Var3.f30355w = a1Var2;
                return;
            }
        }
        this.f30363w = a1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        z0 z0Var = this.A;
        if (z0Var == null) {
            z0 z0Var2 = new z0(this, 0);
            this.A = z0Var2;
            return z0Var2;
        }
        return z0Var;
    }

    public final void f(a1 a1Var) {
        int i;
        int i10;
        a1 a1Var2 = a1Var.f30354v;
        a1 a1Var3 = a1Var.f30355w;
        a1 a1Var4 = a1Var3.f30354v;
        a1 a1Var5 = a1Var3.f30355w;
        a1Var.f30355w = a1Var4;
        if (a1Var4 != null) {
            a1Var4.f30353u = a1Var;
        }
        e(a1Var, a1Var3);
        a1Var3.f30354v = a1Var;
        a1Var.f30353u = a1Var3;
        int i11 = 0;
        if (a1Var2 != null) {
            i = a1Var2.C;
        } else {
            i = 0;
        }
        if (a1Var4 != null) {
            i10 = a1Var4.C;
        } else {
            i10 = 0;
        }
        int max = Math.max(i, i10) + 1;
        a1Var.C = max;
        if (a1Var5 != null) {
            i11 = a1Var5.C;
        }
        a1Var3.C = Math.max(max, i11) + 1;
    }

    public final void g(a1 a1Var) {
        int i;
        int i10;
        a1 a1Var2 = a1Var.f30354v;
        a1 a1Var3 = a1Var.f30355w;
        a1 a1Var4 = a1Var2.f30354v;
        a1 a1Var5 = a1Var2.f30355w;
        a1Var.f30354v = a1Var5;
        if (a1Var5 != null) {
            a1Var5.f30353u = a1Var;
        }
        e(a1Var, a1Var2);
        a1Var2.f30355w = a1Var;
        a1Var.f30353u = a1Var2;
        int i11 = 0;
        if (a1Var3 != null) {
            i = a1Var3.C;
        } else {
            i = 0;
        }
        if (a1Var5 != null) {
            i10 = a1Var5.C;
        } else {
            i10 = 0;
        }
        int max = Math.max(i, i10) + 1;
        a1Var.C = max;
        if (a1Var4 != null) {
            i11 = a1Var4.C;
        }
        a1Var2.C = Math.max(max, i11) + 1;
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
            xa.a1 r3 = a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.B
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        z0 z0Var = this.B;
        if (z0Var == null) {
            z0 z0Var2 = new z0(this, 1);
            this.B = z0Var2;
            return z0Var2;
        }
        return z0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f30362v) {
                g5.h("value == null");
                return null;
            }
            a1 a10 = a(obj, true);
            Object obj3 = a10.B;
            a10.B = obj2;
            return obj3;
        }
        g5.h("key == null");
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
            xa.a1 r3 = a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            b(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.B
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b1.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30364x;
    }
}
