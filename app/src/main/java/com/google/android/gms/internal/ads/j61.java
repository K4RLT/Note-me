package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class j61 extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7360u;

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f7360u) {
            case 0:
                return xy.X(this, collection);
            case 1:
                return com.google.android.gms.internal.mlkit_vision_digital_ink.f7.f(this, collection);
            default:
                return ya.le.a(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f7360u) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            case 1:
                collection.getClass();
                return super.retainAll(collection);
            default:
                collection.getClass();
                return super.retainAll(collection);
        }
    }
}
