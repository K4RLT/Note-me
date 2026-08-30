package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c5 extends n4 {

    /* renamed from: x, reason: collision with root package name */
    public final transient e5 f14148x;

    /* renamed from: y, reason: collision with root package name */
    public final transient d5 f14149y;

    public c5(e5 e5Var, d5 d5Var) {
        this.f14148x = e5Var;
        this.f14149y = d5Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int a(Object[] objArr, int i) {
        return this.f14149y.a(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f14148x.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n4, com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final h4 g() {
        return this.f14149y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f14149y.listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final k5 k() {
        return this.f14149y.listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14148x.f14245z;
    }
}
