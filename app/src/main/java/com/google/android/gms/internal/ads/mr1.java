package com.google.android.gms.internal.ads;
import l4.a;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mr1 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8403u;

    /* renamed from: v, reason: collision with root package name */
    public int f8404v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f8405w;

    public /* synthetic */ mr1(AbstractCollection abstractCollection, int i) {
        this.f8403u = i;
        this.f8405w = abstractCollection;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8403u) {
            case 0:
                int i = this.f8404v;
                nr1 nr1Var = (nr1) this.f8405w;
                if (i >= nr1Var.f8828u.size() && !nr1Var.f8829v.hasNext()) {
                    return false;
                }
                return true;
            case 1:
                if (this.f8404v < ((com.google.android.gms.internal.mlkit_vision_digital_ink.x6) ((androidx.datastore.preferences.protobuf.h1) this.f8405w).f732v).e) {
                    return true;
                }
                return false;
            default:
                int i10 = this.f8404v;
                com.google.android.gms.internal.mlkit_vision_digital_ink.s7 s7Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.s7) this.f8405w;
                if (i10 < s7Var.a() - s7Var.b()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8403u) {
            case 0:
                int i = this.f8404v;
                nr1 nr1Var = (nr1) this.f8405w;
                List list = nr1Var.f8828u;
                if (i < list.size()) {
                    int i10 = this.f8404v;
                    this.f8404v = i10 + 1;
                    return list.get(i10);
                }
                list.add(nr1Var.f8829v.next());
                return next();
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.x6 x6Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.x6) ((androidx.datastore.preferences.protobuf.h1) this.f8405w).f732v;
                int[] iArr = x6Var.f15232d;
                int i11 = this.f8404v;
                this.f8404v = i11 + 1;
                return x6Var.d(iArr[i11] & 31);
            default:
                int i12 = this.f8404v;
                com.google.android.gms.internal.mlkit_vision_digital_ink.s7 s7Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.s7) this.f8405w;
                if (i12 < s7Var.a() - s7Var.b()) {
                    Object obj = s7Var.f14964v.f15005u[s7Var.b() + i12];
                    this.f8404v = i12 + 1;
                    return obj;
                }
                l4.a.c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8403u) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
