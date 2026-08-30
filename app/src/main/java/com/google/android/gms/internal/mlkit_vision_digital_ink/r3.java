package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r3 extends AbstractCollection {

    /* renamed from: u, reason: collision with root package name */
    public final Collection f14890u;

    /* renamed from: v, reason: collision with root package name */
    public final rl f14891v;

    public r3(n4 n4Var, rl rlVar) {
        n4Var.getClass();
        this.f14890u = n4Var;
        this.f14891v = rlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f14890u.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f14890u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f14890u.iterator();
        rl rlVar = this.f14891v;
        rlVar.getClass();
        return new o4(it, rlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f14890u.size();
    }
}
