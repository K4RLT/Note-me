package q1;
import l.a;
import p.a;

import java.util.List;
import k1.r0;

/* loaded from: classes.dex */
public final class d0 extends b0 {
    public final int A;
    public final float B;

    /* renamed from: u, reason: collision with root package name */
    public final List f23244u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23245v;

    /* renamed from: w, reason: collision with root package name */
    public final k1.n f23246w;

    /* renamed from: x, reason: collision with root package name */
    public final k1.n f23247x;

    /* renamed from: y, reason: collision with root package name */
    public final float f23248y;

    /* renamed from: z, reason: collision with root package name */
    public final int f23249z;

    public d0(List list, int i, r0 r0Var, r0 r0Var2, float f10, int i10, int i11, float f11) {
        this.f23244u = list;
        this.f23245v = i;
        this.f23246w = r0Var;
        this.f23247x = r0Var2;
        this.f23248y = f10;
        this.f23249z = i10;
        this.A = i11;
        this.B = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d0.class == obj.getClass()) {
                d0 d0Var = (d0) obj;
                if (kotlin.jvm.internal.a(this.f23246w, d0Var.f23246w) && kotlin.jvm.internal.a(this.f23247x, d0Var.f23247x) && this.f23248y == d0Var.f23248y && this.f23249z == d0Var.f23249z && this.A == d0Var.A && this.B == d0Var.B && this.f23245v == d0Var.f23245v && kotlin.jvm.internal.a(this.f23244u, d0Var.f23244u)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f23244u.hashCode() * 31;
        int i10 = 0;
        k1.n nVar = this.f23246w;
        if (nVar != null) {
            i = nVar.hashCode();
        } else {
            i = 0;
        }
        int a10 = a.a((hashCode + i) * 31, 31, 1.0f);
        k1.n nVar2 = this.f23247x;
        if (nVar2 != null) {
            i10 = nVar2.hashCode();
        }
        return Integer.hashCode(this.f23245v) + a.a(a.a(a.a(a.a(a.b(this.A, a.b(this.f23249z, a.a(a.a((a10 + i10) * 31, 31, 1.0f), 31, this.f23248y), 31), 31), 31, this.B), 31, 0.0f), 31, 1.0f), 31, 0.0f);
    }
}
