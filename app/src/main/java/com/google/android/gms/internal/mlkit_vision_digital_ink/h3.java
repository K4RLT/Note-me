package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.j41;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class h3 extends e3 implements ListIterator {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j41 f14392y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j41 j41Var, int i) {
        super(j41Var, ((List) j41Var.f7318w).listIterator(i));
        this.f14392y = j41Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        j41 j41Var = this.f14392y;
        boolean isEmpty = j41Var.isEmpty();
        a();
        ((ListIterator) this.f14234v).add(obj);
        ((k3) j41Var.A).getClass();
        if (isEmpty) {
            j41Var.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f14234v).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f14234v).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f14234v).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f14234v).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f14234v).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j41 j41Var) {
        super(j41Var);
        this.f14392y = j41Var;
    }
}
