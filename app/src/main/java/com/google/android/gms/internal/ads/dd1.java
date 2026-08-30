package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dd1 extends v91 {

    /* renamed from: a, reason: collision with root package name */
    public final zd1 f5405a;

    public dd1(zd1 zd1Var) {
        this.f5405a = zd1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        if (((ih1) this.f5405a.f13143w).G() != 5) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dd1) {
            zd1 zd1Var = ((dd1) obj).f5405a;
            ih1 ih1Var = (ih1) this.f5405a.f13143w;
            int G = ih1Var.G();
            ih1 ih1Var2 = (ih1) zd1Var.f13143w;
            if (G == ih1Var2.G() && ih1Var.z().equals(ih1Var2.z()) && ih1Var.A().equals(ih1Var2.A())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zd1 zd1Var = this.f5405a;
        return Objects.hash((ih1) zd1Var.f13143w, (gl1) zd1Var.f13142v);
    }

    public final String toString() {
        String str;
        ih1 ih1Var = (ih1) this.f5405a.f13143w;
        String z3 = ih1Var.z();
        int G = ih1Var.G() - 2;
        if (G != 1) {
            if (G != 2) {
                if (G != 3) {
                    if (G != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return a5.a.h("(typeUrl=", z3, ", outputPrefixType=", str, ")");
    }
}
