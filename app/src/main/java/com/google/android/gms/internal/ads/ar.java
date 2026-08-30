package com.google.android.gms.internal.ads;
import eb.d1;
import eb.h3;
import eb.q0;
import eb.v;
import fa.y;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class ar {

    /* renamed from: a, reason: collision with root package name */
    public long f4600a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4601b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f4602c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4603d;
    public final /* synthetic */ Object e;

    public ar(q0 q0Var, long j10) {
        boolean z3;
        this.e = q0Var;
        y.e("health_monitor");
        if (j10 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.b(z3);
        this.f4601b = "health_monitor:start";
        this.f4602c = "health_monitor:count";
        this.f4603d = "health_monitor:value";
        this.f4600a = j10;
    }

    public void a(com.google.android.gms.internal.measurement.h3 h3Var) {
        this.f4601b = h3Var;
    }

    public boolean b(long j10, com.google.android.gms.internal.measurement.z2 z2Var) {
        h3 h3Var = (h3) this.e;
        if (((ArrayList) this.f4603d) == null) {
            this.f4603d = new ArrayList();
        }
        if (((ArrayList) this.f4602c) == null) {
            this.f4602c = new ArrayList();
        }
        if (((ArrayList) this.f4603d).isEmpty() || ((((com.google.android.gms.internal.measurement.z2) ((ArrayList) this.f4603d).get(0)).B() / 1000) / 60) / 60 == ((z2Var.B() / 1000) / 60) / 60) {
            long a10 = this.f4600a + z2Var.a(null);
            h3Var.Q();
            if (a10 < Math.max(0, ((Integer) v.f16405j.a(null)).intValue())) {
                this.f4600a = a10;
                ((ArrayList) this.f4603d).add(z2Var);
                ((ArrayList) this.f4602c).add(Long.valueOf(j10));
                int size = ((ArrayList) this.f4603d).size();
                h3Var.Q();
                if (size < Math.max(1, ((Integer) v.f16407k.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        q0 q0Var = (q0) this.e;
        q0Var.u();
        ((d1) q0Var.f3443v).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = q0Var.D().edit();
        edit.remove((String) this.f4602c);
        edit.remove((String) this.f4603d);
        edit.putLong((String) this.f4601b, currentTimeMillis);
        edit.apply();
    }

    public ar(h3 h3Var) {
        this.e = h3Var;
    }

    public /* synthetic */ ar(dr drVar, ArrayList arrayList, long j10, cr crVar, uq uqVar) {
        this.f4601b = drVar;
        this.f4602c = arrayList;
        this.f4600a = j10;
        this.f4603d = crVar;
        this.e = uqVar;
    }
}
