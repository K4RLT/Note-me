package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.b;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t7 extends AbstractMap {

    /* renamed from: z, reason: collision with root package name */
    public static final r7 f15004z = new r7(1);

    /* renamed from: u, reason: collision with root package name */
    public final Object[] f15005u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f15006v;

    /* renamed from: w, reason: collision with root package name */
    public final s7 f15007w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f15008x;

    /* renamed from: y, reason: collision with root package name */
    public String f15009y;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, com.google.android.gms.internal.mlkit_vision_digital_ink.t7] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.t7] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t7(com.google.android.gms.internal.mlkit_vision_digital_ink.t7 r22, com.google.android.gms.internal.mlkit_vision_digital_ink.t7 r23) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.t7.<init>(com.google.android.gms.internal.mlkit_vision_digital_ink.t7, com.google.android.gms.internal.mlkit_vision_digital_ink.t7):void");
    }

    public static boolean c(int i, int i10) {
        return i > 16 && i * 9 > i10 * 10;
    }

    public final int a(Map.Entry entry, int i, int i10, Object[] objArr, int[] iArr) {
        s7 s7Var = (s7) entry.getValue();
        int a10 = s7Var.a() - s7Var.b();
        System.arraycopy(s7Var.f14964v.f15005u, s7Var.b(), objArr, i10, a10);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new s7(this, i));
        int i11 = i10 + a10;
        iArr[i + 1] = i11;
        return i11;
    }

    public final Map.Entry b(int i) {
        if (i < this.f15006v[0]) {
            return (Map.Entry) this.f15005u[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f15007w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f15008x == null) {
            this.f15008x = Integer.valueOf(super.hashCode());
        }
        return this.f15008x.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f15009y == null) {
            this.f15009y = super.toString();
        }
        return this.f15009y;
    }

    public t7() {
        List list = Collections.EMPTY_LIST;
        this.f15007w = new s7(this, -1);
        this.f15008x = null;
        this.f15009y = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f15005u = c(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f15006v = iArr;
                return;
            } else {
                it2.next().getClass();
                g5.q.b();
                throw null;
            }
        }
        it.next().getClass();
        g5.q.b();
        throw null;
    }
}
