package com.google.android.gms.internal.play_billing;
import a0.a;
import b0.e1;
import c0.a;
import g3.a;
import q.x;
import x.n;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 implements Map, Serializable {
    public static final a0 A = new a0(0, null, new Object[0]);

    /* renamed from: u, reason: collision with root package name */
    public transient x f15365u;

    /* renamed from: v, reason: collision with root package name */
    public transient y f15366v;

    /* renamed from: w, reason: collision with root package name */
    public transient z f15367w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f15368x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f15369y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f15370z;

    public a0(int i, Object obj, Object[] objArr) {
        this.f15368x = obj;
        this.f15369y = objArr;
        this.f15370z = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01be  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.a0 a(int r19, java.lang.Object[] r20, b0.e1 r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a0.a(int, java.lang.Object[], b0.e1):com.google.android.gms.internal.play_billing.a0");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        z zVar = this.f15367w;
        if (zVar == null) {
            zVar = new z(this.f15369y, 1, this.f15370z);
            this.f15367w = zVar;
        }
        return zVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        x xVar = this.f15365u;
        if (xVar == null) {
            x xVar2 = new x(this, this.f15369y, this.f15370z);
            this.f15365u = xVar2;
            return xVar2;
        }
        return xVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f15370z
            java.lang.Object[] r3 = r9.f15369y
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f15368x
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = wa.c0.a(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = wa.c0.a(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = wa.c0.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        x xVar = this.f15365u;
        if (xVar == null) {
            xVar = new x(this, this.f15369y, this.f15370z);
            this.f15365u = xVar;
        }
        int i10 = 0;
        for (Object obj : xVar) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i10 += i;
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        y yVar = this.f15366v;
        if (yVar == null) {
            y yVar2 = new y(this, new z(this.f15369y, 0, this.f15370z));
            this.f15366v = yVar2;
            return yVar2;
        }
        return yVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f15370z;
    }

    public final String toString() {
        int i = this.f15370z;
        if (i >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(i * 8, 1073741824L));
            sb2.append('{');
            Iterator it = ((x) entrySet()).iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z3) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z3 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        q.x.n(g3.a.g(i, "size cannot be negative but was: "));
        return null;
    }

    @Override // java.util.Map
    public final Collection values() {
        z zVar = this.f15367w;
        if (zVar == null) {
            z zVar2 = new z(this.f15369y, 1, this.f15370z);
            this.f15367w = zVar2;
            return zVar2;
        }
        return zVar;
    }
}
