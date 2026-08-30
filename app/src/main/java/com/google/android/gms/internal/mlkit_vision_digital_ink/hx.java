package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import x.o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hx {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14445a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14446b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14447c;

    public hx(Object obj, Object obj2, boolean z3) {
        this.f14445a = z3;
        this.f14446b = obj;
        this.f14447c = obj2;
    }

    public final Object a() {
        if (this.f14445a) {
            return this.f14446b;
        }
        q.x.o("Either was not left");
        return null;
    }

    public final Object b() {
        if (!this.f14445a) {
            return this.f14447c;
        }
        q.x.o("Either was not right");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hx) {
            hx hxVar = (hx) obj;
            boolean z3 = hxVar.f14445a;
            if (this.f14445a) {
                if (z3) {
                    Object a10 = a();
                    Object a11 = hxVar.a();
                    if (a10 != a11) {
                        if (a10 != null && a10.equals(a11)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if (!z3) {
                Object b10 = b();
                Object b11 = hxVar.b();
                if (b10 != b11) {
                    if (b10 != null && b10.equals(b11)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14445a), this.f14446b, this.f14447c});
    }
}
