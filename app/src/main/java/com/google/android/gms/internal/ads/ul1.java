package com.google.android.gms.internal.ads;
import g5.q;
import l4.a;
import xa.a1;
import xa.b1;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ul1 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11671u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f11672v;

    /* renamed from: w, reason: collision with root package name */
    public Map.Entry f11673w;

    /* renamed from: x, reason: collision with root package name */
    public Map.Entry f11674x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f11675y;

    public ul1(wl1 wl1Var) {
        Objects.requireNonNull(wl1Var);
        this.f11675y = wl1Var;
        this.f11673w = wl1Var.f12279y.f11938x;
        this.f11674x = null;
        this.f11672v = wl1Var.f12278x;
    }

    public vl1 a() {
        wl1 wl1Var = (wl1) this.f11675y;
        vl1 vl1Var = (vl1) this.f11673w;
        if (vl1Var != wl1Var.f12279y) {
            if (wl1Var.f12278x == this.f11672v) {
                this.f11673w = vl1Var.f11938x;
                this.f11674x = vl1Var;
                return vl1Var;
            }
            a.m();
            return null;
        }
        a.c();
        return null;
    }

    public a1 b() {
        b1 b1Var = (b1) this.f11675y;
        a1 a1Var = (a1) this.f11673w;
        if (a1Var != b1Var.f30366z) {
            if (b1Var.f30365y == this.f11672v) {
                this.f11673w = a1Var.f30356x;
                this.f11674x = a1Var;
                return a1Var;
            }
            a.m();
            return null;
        }
        a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11671u) {
            case 0:
                if (((vl1) this.f11673w) != ((wl1) this.f11675y).f12279y) {
                    return true;
                }
                return false;
            default:
                if (((a1) this.f11673w) != ((b1) this.f11675y).f30366z) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        switch (this.f11671u) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11671u) {
            case 0:
                vl1 vl1Var = (vl1) this.f11674x;
                if (vl1Var != null) {
                    wl1 wl1Var = (wl1) this.f11675y;
                    wl1Var.b(vl1Var, true);
                    this.f11674x = null;
                    this.f11672v = wl1Var.f12278x;
                    return;
                }
                q.l();
                return;
            default:
                a1 a1Var = (a1) this.f11674x;
                if (a1Var != null) {
                    b1 b1Var = (b1) this.f11675y;
                    b1Var.b(a1Var, true);
                    this.f11674x = null;
                    this.f11672v = b1Var.f30365y;
                    return;
                }
                q.l();
                return;
        }
    }

    public ul1(b1 b1Var) {
        Objects.requireNonNull(b1Var);
        this.f11675y = b1Var;
        this.f11673w = b1Var.f30366z.f30356x;
        this.f11674x = null;
        this.f11672v = b1Var.f30365y;
    }
}
