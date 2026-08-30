package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f51 extends m61 {

    /* renamed from: v, reason: collision with root package name */
    public final b51 f5937v;

    /* renamed from: w, reason: collision with root package name */
    public Object f5938w;

    /* renamed from: x, reason: collision with root package name */
    public m61 f5939x;

    public f51(l51 l51Var) {
        super(0);
        Objects.requireNonNull(l51Var);
        this.f5937v = l51Var.f7950x.entrySet().k().listIterator(0);
        this.f5938w = null;
        this.f5939x = n51.f8548y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f5939x.hasNext() && !this.f5937v.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m61, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f5939x.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f5937v.next();
            this.f5938w = entry.getKey();
            this.f5939x = ((z41) entry.getValue()).a();
        }
        Object obj = this.f5938w;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f5939x.next());
    }
}
