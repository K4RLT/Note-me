package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class f4 extends h4 {

    /* renamed from: w, reason: collision with root package name */
    public final transient h4 f14296w;

    public f4(h4 h4Var) {
        this.f14296w = h4Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4, com.google.android.gms.internal.mlkit_vision_digital_ink.c4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14296w.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        h4 h4Var = this.f14296w;
        pa.d(i, h4Var.size());
        return h4Var.get((h4Var.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f14296w.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (r0.size() - 1) - lastIndexOf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f14296w.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (r0.size() - 1) - indexOf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return this.f14296w.n();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4
    public final h4 p() {
        return this.f14296w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4, java.util.List
    /* renamed from: q */
    public final h4 subList(int i, int i10) {
        h4 h4Var = this.f14296w;
        pa.r(i, i10, h4Var.size());
        return h4Var.subList(h4Var.size() - i10, h4Var.size() - i).p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14296w.size();
    }
}
