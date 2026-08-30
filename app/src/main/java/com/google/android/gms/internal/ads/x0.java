package com.google.android.gms.internal.ads;
import g9.c3;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public int f12384a;

    /* renamed from: b, reason: collision with root package name */
    public int f12385b;

    /* renamed from: c, reason: collision with root package name */
    public int f12386c;

    public x0() {
        this.f12384a = 0;
        this.f12385b = 0;
        this.f12386c = 0;
    }

    public static x0 a(g9.c3 c3Var) {
        if (c3Var.f17592x) {
            return new x0(3, 0, 0);
        }
        if (c3Var.C) {
            return new x0(2, 0, 0);
        }
        if (c3Var.B) {
            return new x0(0, 0, 0);
        }
        return new x0(1, c3Var.f17594z, c3Var.f17591w);
    }

    public boolean b() {
        if (this.f12384a == 3) {
            return true;
        }
        return false;
    }

    public x0(int i, int i10, int i11) {
        this.f12384a = i;
        this.f12386c = i10;
        this.f12385b = i11;
    }

    public /* synthetic */ x0(int i, int i10, int i11, boolean z3) {
        this.f12384a = i;
        this.f12385b = i10;
        this.f12386c = i11;
    }
}
