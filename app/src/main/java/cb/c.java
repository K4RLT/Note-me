package cb;
import b.b;

import android.os.Bundle;
import android.os.SystemClock;
import eb.d1;
import eb.e2;
import eb.k2;
import eb.k3;
import eb.l2;
import eb.l3;
import eb.q;
import eb.t1;
import eb.y0;
import fa.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.r0;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f4071a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f4072b;

    public c(d1 d1Var) {
        y.h(d1Var);
        this.f4071a = d1Var;
        t1 t1Var = d1Var.J;
        d1.c(t1Var);
        this.f4072b = t1Var;
    }

    @Override // eb.j2
    public final void C(String str) {
        d1 d1Var = this.f4071a;
        q j10 = d1Var.j();
        d1Var.H.getClass();
        j10.D(SystemClock.elapsedRealtime(), str);
    }

    @Override // eb.j2
    public final long b() {
        l3 l3Var = this.f4071a.F;
        d1.b(l3Var);
        return l3Var.H0();
    }

    @Override // eb.j2
    public final String d() {
        l2 l2Var = ((d1) this.f4072b.f3443v).I;
        d1.c(l2Var);
        k2 k2Var = l2Var.f16222x;
        if (k2Var != null) {
            return k2Var.f16207b;
        }
        return null;
    }

    @Override // eb.j2
    public final String e() {
        return (String) this.f4072b.B.get();
    }

    @Override // eb.j2
    public final List e0(String str, String str2) {
        t1 t1Var = this.f4072b;
        if (t1Var.h().F()) {
            t1Var.f().A.g("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (de.b()) {
            t1Var.f().A.g("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        y0 y0Var = ((d1) t1Var.f3443v).D;
        d1.d(y0Var);
        y0Var.z(atomicReference, 5000L, "get conditional user properties", new b9.a(t1Var, atomicReference, str, str2, 2, false));
        List list = (List) atomicReference.get();
        if (list == null) {
            t1Var.f().A.f(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return l3.s0(list);
    }

    @Override // eb.j2
    public final String f() {
        return (String) this.f4072b.B.get();
    }

    @Override // eb.j2
    public final void f0(String str, Bundle bundle, String str2) {
        t1 t1Var = this.f4071a.J;
        d1.c(t1Var);
        t1Var.M(str, bundle, str2);
    }

    @Override // eb.j2
    public final String g() {
        l2 l2Var = ((d1) this.f4072b.f3443v).I;
        d1.c(l2Var);
        k2 k2Var = l2Var.f16222x;
        if (k2Var != null) {
            return k2Var.f16206a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map, n.r0] */
    @Override // eb.j2
    public final Map g0(String str, String str2, boolean z3) {
        t1 t1Var = this.f4072b;
        if (t1Var.h().F()) {
            t1Var.f().A.g("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (de.b()) {
            t1Var.f().A.g("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        y0 y0Var = ((d1) t1Var.f3443v).D;
        d1.d(y0Var);
        y0Var.z(atomicReference, 5000L, "get user properties", new e2(t1Var, atomicReference, str, str2, z3, 0));
        List<k3> list = (List) atomicReference.get();
        if (list == null) {
            t1Var.f().A.f(Boolean.valueOf(z3), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        r0 r0Var = new r0(list.size());
        for (k3 k3Var : list) {
            Object zza = k3Var.zza();
            if (zza != null) {
                r0Var.put(k3Var.f16212v, zza);
            }
        }
        return r0Var;
    }

    @Override // eb.j2
    public final void k0(Bundle bundle) {
        t1 t1Var = this.f4072b;
        ((d1) t1Var.f3443v).H.getClass();
        t1Var.a0(bundle, System.currentTimeMillis());
    }

    @Override // eb.j2
    public final void m0(String str, Bundle bundle, String str2) {
        t1 t1Var = this.f4072b;
        ((d1) t1Var.f3443v).H.getClass();
        t1Var.P(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // eb.j2
    public final int o(String str) {
        y.e(str);
        return 25;
    }

    @Override // eb.j2
    public final void t(String str) {
        d1 d1Var = this.f4071a;
        q j10 = d1Var.j();
        d1Var.H.getClass();
        j10.A(SystemClock.elapsedRealtime(), str);
    }
}