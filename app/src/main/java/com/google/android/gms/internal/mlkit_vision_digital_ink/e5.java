package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class e5 implements Map, Serializable {
    public static final e5 A = new e5(0, null, new Object[0]);

    /* renamed from: u, reason: collision with root package name */
    public transient b5 f14240u;

    /* renamed from: v, reason: collision with root package name */
    public transient c5 f14241v;

    /* renamed from: w, reason: collision with root package name */
    public transient d5 f14242w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f14243x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f14244y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f14245z;

    public e5(int i, Object obj, Object[] objArr) {
        this.f14243x = obj;
        this.f14244y = objArr;
        this.f14245z = i;
    }

    public static e5 b(Map map) {
        int i;
        if ((map instanceof e5) && !(map instanceof SortedMap)) {
            return (e5) map;
        }
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        j4 j4Var = new j4(i);
        j4Var.b(entrySet);
        return j4Var.c(true);
    }

    public static e5 c(zb zbVar, zb zbVar2, zb zbVar3) {
        return f(3, new Object[]{b.PENDING, zbVar, b.UNSPECIFIED, zbVar2, b.DOWNLOADED, zbVar3}, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019e  */
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
    public static com.google.android.gms.internal.mlkit_vision_digital_ink.e5 f(int r19, java.lang.Object[] r20, com.google.android.gms.internal.mlkit_vision_digital_ink.j4 r21) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.e5.f(int, java.lang.Object[], com.google.android.gms.internal.mlkit_vision_digital_ink.j4):com.google.android.gms.internal.mlkit_vision_digital_ink.e5");
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c4 values() {
        d5 d5Var = this.f14242w;
        if (d5Var == null) {
            d5 d5Var2 = new d5(this.f14244y, 1, this.f14245z);
            this.f14242w = d5Var2;
            return d5Var2;
        }
        return d5Var;
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
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final n4 entrySet() {
        b5 b5Var = this.f14240u;
        if (b5Var == null) {
            b5 b5Var2 = new b5(this, this.f14244y, this.f14245z);
            this.f14240u = b5Var2;
            return b5Var2;
        }
        return b5Var;
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
            int r2 = r9.f14245z
            java.lang.Object[] r3 = r9.f14244y
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
            java.lang.Object r2 = r9.f14243x
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
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.tl.a(r2)
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
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.tl.a(r2)
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
            int r6 = com.google.android.gms.internal.mlkit_vision_digital_ink.tl.a(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.e5.get(java.lang.Object):java.lang.Object");
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
        int i10 = 0;
        for (Object obj : entrySet()) {
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
        c5 c5Var = this.f14241v;
        if (c5Var == null) {
            c5 c5Var2 = new c5(this, new d5(this.f14244y, 0, this.f14245z));
            this.f14241v = c5Var2;
            return c5Var2;
        }
        return c5Var;
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
        return this.f14245z;
    }

    public final String toString() {
        int i = this.f14245z;
        n5.d(i, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb2.append('{');
        Iterator it = ((b5) entrySet()).iterator();
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
}
