package xa;
import b0.e1;
import k.b;
import u0.a;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t implements Map, Serializable {
    public static final t A = new t(0, null, new Object[0]);

    /* renamed from: u, reason: collision with root package name */
    public transient q f30529u;

    /* renamed from: v, reason: collision with root package name */
    public transient r f30530v;

    /* renamed from: w, reason: collision with root package name */
    public transient s f30531w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f30532x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f30533y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f30534z;

    public t(int i, Object obj, Object[] objArr) {
        this.f30532x = obj;
        this.f30533y = objArr;
        this.f30534z = i;
    }

    public static t a(Collection collection) {
        int i;
        int size;
        Object[] objArr;
        int length;
        int size2;
        boolean z3 = collection instanceof Collection;
        if (z3) {
            i = collection.size();
        } else {
            i = 4;
        }
        e1 e1Var = new e1(i);
        if (z3 && (size2 = (size = collection.size()) + size) > (length = (objArr = (Object[]) e1Var.f1180c).length)) {
            e1Var.f1180c = Arrays.copyOf(objArr, b(length, size2));
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e1Var.k(entry.getKey(), entry.getValue());
        }
        return e1Var.m();
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
        s sVar = this.f30531w;
        if (sVar == null) {
            sVar = new s(this.f30533y, 1, this.f30534z);
            this.f30531w = sVar;
        }
        return sVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        q qVar = this.f30529u;
        if (qVar == null) {
            q qVar2 = new q(this, this.f30533y, this.f30534z);
            this.f30529u = qVar2;
            return qVar2;
        }
        return qVar;
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
            int r2 = r9.f30534z
            java.lang.Object[] r3 = r9.f30533y
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
            java.lang.Object r2 = r9.f30532x
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
            int r2 = xa.a(r2)
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
            int r2 = xa.a(r2)
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
            int r6 = xa.a(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: xa.t.get(java.lang.Object):java.lang.Object");
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
        q qVar = this.f30529u;
        if (qVar == null) {
            qVar = new q(this, this.f30533y, this.f30534z);
            this.f30529u = qVar;
        }
        int i10 = 0;
        for (Object obj : qVar) {
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
        r rVar = this.f30530v;
        if (rVar == null) {
            r rVar2 = new r(this, new s(this.f30533y, 0, this.f30534z));
            this.f30530v = rVar2;
            return rVar2;
        }
        return rVar;
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
        return this.f30534z;
    }

    public final String toString() {
        int i = this.f30534z;
        u0.i(i, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb2.append('{');
        Iterator it = ((q) entrySet()).iterator();
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

    @Override // java.util.Map
    public final Collection values() {
        s sVar = this.f30531w;
        if (sVar == null) {
            s sVar2 = new s(this.f30533y, 1, this.f30534z);
            this.f30531w = sVar2;
            return sVar2;
        }
        return sVar;
    }
}
