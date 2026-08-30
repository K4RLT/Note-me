package xa;
import r0.a;
import r0.b;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z0 extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30726u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b1 f30727v;

    public /* synthetic */ z0(b1 b1Var, int i) {
        this.f30726u = i;
        this.f30727v = b1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f30726u) {
            case 0:
                this.f30727v.clear();
                return;
            default:
                this.f30727v.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f30726u
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            xa.b1 r0 = r4.f30727v
            boolean r5 = r0.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L37
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            xa.b1 r0 = r4.f30727v
            r0.getClass()
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L24
            xa.a1 r0 = a(r2, r1)     // Catch: java.lang.ClassCastException -> L24
            goto L25
        L24:
            r0 = r3
        L25:
            if (r0 == 0) goto L34
            java.lang.Object r2 = r0.B
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L34
            r3 = r0
        L34:
            if (r3 == 0) goto L37
            r1 = 1
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.z0.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f30726u) {
            case 0:
                return new y0(this.f30727v, 0);
            default:
                return new y0(this.f30727v, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f30726u
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            xa.b1 r0 = r5.f30727v
            r0.getClass()
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L12
            xa.a1 r2 = a(r6, r1)     // Catch: java.lang.ClassCastException -> L12
        L12:
            r6 = 1
            if (r2 == 0) goto L18
            b(r2, r6)
        L18:
            if (r2 == 0) goto L1b
            r1 = r6
        L1b:
            return r1
        L1c:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L22
            goto L4b
        L22:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            xa.b1 r0 = r5.f30727v
            r0.getClass()
            java.lang.Object r2 = r6.getKey()
            r3 = 0
            if (r2 == 0) goto L35
            xa.a1 r2 = a(r2, r1)     // Catch: java.lang.ClassCastException -> L35
            goto L36
        L35:
            r2 = r3
        L36:
            if (r2 == 0) goto L45
            java.lang.Object r4 = r2.B
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L45
            r3 = r2
        L45:
            if (r3 == 0) goto L4b
            r1 = 1
            b(r3, r1)
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.z0.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f30726u) {
            case 0:
                return this.f30727v.f30364x;
            default:
                return this.f30727v.f30364x;
        }
    }
}
