package r0;
import n.d0;
import n.i0;
import n.n0;
import t0.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l1 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m1 f24286u;

    public l1(m1 m1Var) {
        this.f24286u = m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // df.a
    public final Object invoke() {
        Object valueOf;
        boolean z3;
        Object obj;
        ArrayList arrayList = this.f24286u.f24292a;
        i0 i0Var = new i0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) arrayList.get(i);
            Object obj2 = s0Var.f24373b;
            int i10 = s0Var.f24372a;
            if (obj2 != null) {
                valueOf = new r0(Integer.valueOf(i10), s0Var.f24373b);
            } else {
                valueOf = Integer.valueOf(i10);
            }
            int f10 = i0Var.f(valueOf);
            if (f10 < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                obj = null;
            } else {
                obj = i0Var.f20894c[f10];
            }
            if (obj != null) {
                if (obj instanceof d0) {
                    d0 d0Var = (d0) obj;
                    d0Var.a(s0Var);
                    s0Var = d0Var;
                } else {
                    Object[] objArr = n0.f20918a;
                    d0 d0Var2 = new d0(2);
                    d0Var2.a(obj);
                    d0Var2.a(s0Var);
                    s0Var = d0Var2;
                }
            }
            if (z3) {
                int i11 = ~f10;
                i0Var.f20893b[i11] = valueOf;
                i0Var.f20894c[i11] = s0Var;
            } else {
                i0Var.f20894c[f10] = s0Var;
            }
        }
        return new a(i0Var);
    }
}
