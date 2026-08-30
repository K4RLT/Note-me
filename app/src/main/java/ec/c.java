package ec;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.q0;
import eb.j2;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class c implements j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f16475a;

    public c(f1 f1Var) {
        this.f16475a = f1Var;
    }

    @Override // eb.j2
    public final void C(String str) {
        f1 f1Var = this.f16475a;
        f1Var.e(new l1(f1Var, str, 0));
    }

    @Override // eb.j2
    public final long b() {
        q0 q0Var = new q0();
        f1 f1Var = this.f16475a;
        f1Var.e(new m1(f1Var, q0Var, 3));
        Long l10 = (Long) q0.r0(q0Var.g0(500L), Long.class);
        if (l10 == null) {
            long nanoTime = System.nanoTime();
            f1Var.f13747b.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = f1Var.f13750f + 1;
            f1Var.f13750f = i;
            return nextLong + i;
        }
        return l10.longValue();
    }

    @Override // eb.j2
    public final String d() {
        q0 q0Var = new q0();
        f1 f1Var = this.f16475a;
        f1Var.e(new m1(f1Var, q0Var, 4));
        return (String) q0.r0(q0Var.g0(500L), String.class);
    }

    @Override // eb.j2
    public final String e() {
        q0 q0Var = new q0();
        f1 f1Var = this.f16475a;
        f1Var.e(new m1(f1Var, q0Var, 0));
        return (String) q0.r0(q0Var.g0(50L), String.class);
    }

    @Override // eb.j2
    public final List e0(String str, String str2) {
        return this.f16475a.c(str, str2);
    }

    @Override // eb.j2
    public final String f() {
        q0 q0Var = new q0();
        f1 f1Var = this.f16475a;
        f1Var.e(new m1(f1Var, q0Var, 1));
        return (String) q0.r0(q0Var.g0(500L), String.class);
    }

    @Override // eb.j2
    public final void f0(String str, Bundle bundle, String str2) {
        f1 f1Var = this.f16475a;
        f1Var.e(new i1(f1Var, str, str2, bundle, 1));
    }

    @Override // eb.j2
    public final String g() {
        q0 q0Var = new q0();
        f1 f1Var = this.f16475a;
        f1Var.e(new m1(f1Var, q0Var, 2));
        return (String) q0.r0(q0Var.g0(500L), String.class);
    }

    @Override // eb.j2
    public final Map g0(String str, String str2, boolean z3) {
        return this.f16475a.d(str, str2, z3);
    }

    @Override // eb.j2
    public final void k0(Bundle bundle) {
        f1 f1Var = this.f16475a;
        f1Var.e(new g1(f1Var, bundle, 0));
    }

    @Override // eb.j2
    public final void m0(String str, Bundle bundle, String str2) {
        f1 f1Var = this.f16475a;
        f1Var.e(new h1(f1Var, str, str2, bundle, true, 2));
    }

    @Override // eb.j2
    public final int o(String str) {
        return this.f16475a.a(str);
    }

    @Override // eb.j2
    public final void t(String str) {
        f1 f1Var = this.f16475a;
        f1Var.e(new l1(f1Var, str, 1));
    }
}
