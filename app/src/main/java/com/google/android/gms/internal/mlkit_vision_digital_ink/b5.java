package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b5 extends n4 {

    /* renamed from: x, reason: collision with root package name */
    public final transient e5 f14064x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f14065y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f14066z;

    public b5(e5 e5Var, Object[] objArr, int i) {
        this.f14064x = e5Var;
        this.f14065y = objArr;
        this.f14066z = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int a(Object[] objArr, int i) {
        return g().a(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14064x.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final k5 k() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4
    public final h4 q() {
        return new a5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14066z;
    }
}
