package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q41 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9743u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f9744v;

    /* renamed from: w, reason: collision with root package name */
    public int f9745w;

    /* renamed from: x, reason: collision with root package name */
    public int f9746x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f9747y;

    public q41(s41 s41Var) {
        int i;
        Objects.requireNonNull(s41Var);
        this.f9747y = s41Var;
        this.f9744v = s41Var.f10519y;
        if (s41Var.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f9745w = i;
        this.f9746x = -1;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9743u) {
            case 0:
                if (this.f9745w >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f9745w >= 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.f9745w >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f9745w >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9743u) {
            case 0:
                s41 s41Var = (s41) this.f9747y;
                if (s41Var.f10519y == this.f9744v) {
                    if (hasNext()) {
                        int i = this.f9745w;
                        this.f9746x = i;
                        Object a10 = a(i);
                        int i10 = this.f9745w + 1;
                        if (i10 >= s41Var.f10520z) {
                            i10 = -1;
                        }
                        this.f9745w = i10;
                        return a10;
                    }
                    l4.a.c();
                } else {
                    l4.a.m();
                }
                return null;
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.w3 w3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.w3) this.f9747y;
                if (w3Var.f15175y == this.f9744v) {
                    if (hasNext()) {
                        int i11 = this.f9745w;
                        this.f9746x = i11;
                        Object a11 = a(i11);
                        int i12 = this.f9745w + 1;
                        if (i12 >= w3Var.f15176z) {
                            i12 = -1;
                        }
                        this.f9745w = i12;
                        return a11;
                    }
                    l4.a.c();
                } else {
                    l4.a.m();
                }
                return null;
            case 2:
                xa.d dVar = (xa.d) this.f9747y;
                if (dVar.f30400y == this.f9744v) {
                    if (hasNext()) {
                        int i13 = this.f9745w;
                        this.f9746x = i13;
                        Object a12 = a(i13);
                        int i14 = this.f9745w + 1;
                        if (i14 >= dVar.f30401z) {
                            i14 = -1;
                        }
                        this.f9745w = i14;
                        return a12;
                    }
                    l4.a.c();
                } else {
                    l4.a.m();
                }
                return null;
            default:
                ya.d dVar2 = (ya.d) this.f9747y;
                if (dVar2.f31193y == this.f9744v) {
                    if (hasNext()) {
                        int i15 = this.f9745w;
                        this.f9746x = i15;
                        Object a13 = a(i15);
                        int i16 = this.f9745w + 1;
                        if (i16 >= dVar2.f31194z) {
                            i16 = -1;
                        }
                        this.f9745w = i16;
                        return a13;
                    }
                    l4.a.c();
                } else {
                    l4.a.m();
                }
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f9743u) {
            case 0:
                s41 s41Var = (s41) this.f9747y;
                if (s41Var.f10519y == this.f9744v) {
                    if (this.f9746x >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    b80.L("no calls to next() since the last call to remove()", z3);
                    this.f9744v += 32;
                    s41Var.remove(s41Var.b()[this.f9746x]);
                    this.f9745w--;
                    this.f9746x = -1;
                    return;
                }
                l4.a.m();
                return;
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.w3 w3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.w3) this.f9747y;
                if (w3Var.f15175y == this.f9744v) {
                    if (this.f9746x >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    com.google.android.gms.internal.mlkit_vision_digital_ink.pa.s("no calls to next() since the last call to remove()", z9);
                    this.f9744v += 32;
                    w3Var.remove(w3Var.b()[this.f9746x]);
                    this.f9745w--;
                    this.f9746x = -1;
                    return;
                }
                l4.a.m();
                return;
            case 2:
                xa.d dVar = (xa.d) this.f9747y;
                int i = dVar.f30400y;
                int i10 = this.f9744v;
                if (i == i10) {
                    int i11 = this.f9746x;
                    if (i11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f9744v = i10 + 32;
                        dVar.remove(dVar.a()[i11]);
                        this.f9745w--;
                        this.f9746x = -1;
                        return;
                    }
                    q.x.o("no calls to next() since the last call to remove()");
                    return;
                }
                l4.a.m();
                return;
            default:
                ya.d dVar2 = (ya.d) this.f9747y;
                int i12 = dVar2.f31193y;
                int i13 = this.f9744v;
                if (i12 == i13) {
                    int i14 = this.f9746x;
                    if (i14 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f9744v = i13 + 32;
                        Object[] objArr = dVar2.f31191w;
                        objArr.getClass();
                        dVar2.remove(objArr[i14]);
                        this.f9745w--;
                        this.f9746x = -1;
                        return;
                    }
                    q.x.o("no calls to next() since the last call to remove()");
                    return;
                }
                l4.a.m();
                return;
        }
    }

    public q41(com.google.android.gms.internal.mlkit_vision_digital_ink.w3 w3Var) {
        Objects.requireNonNull(w3Var);
        this.f9747y = w3Var;
        this.f9744v = w3Var.f15175y;
        this.f9745w = w3Var.isEmpty() ? -1 : 0;
        this.f9746x = -1;
    }

    public q41(xa.d dVar) {
        Objects.requireNonNull(dVar);
        this.f9747y = dVar;
        this.f9744v = dVar.f30400y;
        this.f9745w = dVar.isEmpty() ? -1 : 0;
        this.f9746x = -1;
    }

    public q41(ya.d dVar) {
        this.f9747y = dVar;
        this.f9744v = dVar.f31193y;
        this.f9745w = dVar.isEmpty() ? -1 : 0;
        this.f9746x = -1;
    }
}
