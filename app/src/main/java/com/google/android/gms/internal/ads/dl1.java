package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class dl1 extends xy implements Map {
    public final Map P;

    public dl1(Map map) {
        super(24);
        this.P = map;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ Object F() {
        return this.P;
    }

    @Override // java.util.Map
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && this.P.containsKey(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r0.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r3.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000d, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            com.google.android.gms.internal.ads.h61 r0 = (com.google.android.gms.internal.ads.h61) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
            if (r3 != 0) goto L22
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto Lf
            goto L38
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L22
        L38:
            r3 = 1
            return r3
        L3a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dl1.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return xy.D(this.P.entrySet(), u2.f11519y);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && an1.x(obj, this)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.P.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return xy.K(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.P;
        if (map.isEmpty()) {
            return true;
        }
        if (map.size() == 1 && map.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return xy.D(this.P.keySet(), u2.f11520z);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.P.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.P.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.P.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.P;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.P.values();
    }
}
