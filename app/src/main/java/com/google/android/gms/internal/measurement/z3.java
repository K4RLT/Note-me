package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13991a;

    /* renamed from: b, reason: collision with root package name */
    public final yb.d f13992b;

    public z3(Context context, yb.d dVar) {
        this.f13991a = context;
        this.f13992b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof z3) {
                z3 z3Var = (z3) obj;
                if (this.f13991a.equals(z3Var.f13991a)) {
                    yb.d dVar = z3Var.f13992b;
                    yb.d dVar2 = this.f13992b;
                    if (dVar2 == null) {
                        if (dVar == null) {
                            return true;
                        }
                        return false;
                    }
                    if (dVar2.equals(dVar)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f13991a.hashCode() ^ 1000003) * 1000003;
        yb.d dVar = this.f13992b;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return a5.a.h("FlagsContext{context=", String.valueOf(this.f13991a), ", hermeticFileOverrides=", String.valueOf(this.f13992b), "}");
    }
}
