package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: u, reason: collision with root package name */
    public final n f13764u;

    /* renamed from: v, reason: collision with root package name */
    public final String f13765v;

    public h(String str) {
        this.f13764u = n.f13848h;
        this.f13765v = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return new h(this.f13765v, this.f13764u.c());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.f13765v.equals(hVar.f13765v) && this.f13764u.equals(hVar.f13764u)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13764u.hashCode() + (this.f13765v.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, j6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public h(String str, n nVar) {
        this.f13764u = nVar;
        this.f13765v = str;
    }
}
