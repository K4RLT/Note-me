package com.google.android.gms.internal.ads;
import a0.l;
import ac.b;
import k9.a0;

import android.os.Bundle;
import com.facebook.ads.AdError;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class in0 implements i81, kt1 {

    /* renamed from: u, reason: collision with root package name */
    public boolean f7178u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7179v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f7180w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f7181x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7182y;

    /* renamed from: z, reason: collision with root package name */
    public Object f7183z;

    public in0(et1 et1Var) {
        this.f7181x = et1Var;
        fu1 fu1Var = new fu1();
        fu1Var.f6170y = vb.f11869d;
        this.f7180w = fu1Var;
        this.f7178u = true;
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public void a(vb vbVar) {
        kt1 kt1Var = (kt1) this.f7183z;
        if (kt1Var != null) {
            kt1Var.a(vbVar);
            vbVar = ((kt1) this.f7183z).f();
        }
        ((fu1) this.f7180w).a(vbVar);
    }

    public void b(zw1 zw1Var) {
        kt1 kt1Var;
        kt1 s02 = zw1Var.s0();
        if (s02 != null && s02 != (kt1Var = (kt1) this.f7183z)) {
            if (kt1Var == null) {
                this.f7183z = s02;
                this.f7182y = zw1Var;
                ((ew1) s02).a((vb) ((fu1) this.f7180w).f6170y);
                return;
            }
            throw new ns1(2, new IllegalStateException("Multiple renderer media clocks enabled."), AdError.NETWORK_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public boolean d() {
        if (this.f7178u) {
            return false;
        }
        kt1 kt1Var = (kt1) this.f7183z;
        kt1Var.getClass();
        return kt1Var.d();
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public long e() {
        if (this.f7178u) {
            return ((fu1) this.f7180w).e();
        }
        kt1 kt1Var = (kt1) this.f7183z;
        kt1Var.getClass();
        return kt1Var.e();
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public vb f() {
        kt1 kt1Var = (kt1) this.f7183z;
        if (kt1Var != null) {
            return kt1Var.f();
        }
        return (vb) ((fu1) this.f7180w).f6170y;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(8:5|6|7|8|(1:10)(1:67)|11|12|(2:14|(4:16|82|26|27)(1:35))(4:36|(1:38)|39|(2:41|(2:43|44)(2:45|46))(2:47|13a))))|71|72|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0062, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0063, code lost:
    
        k9.a0.l("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    @Override // com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ac.b mo207zza() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in0.mo207zza():ac.b");
    }

    public /* synthetic */ in0(kn0 kn0Var, String str, List list, Bundle bundle, boolean z3, boolean z9) {
        this.f7180w = kn0Var;
        this.f7181x = str;
        this.f7182y = list;
        this.f7183z = bundle;
        this.f7178u = z3;
        this.f7179v = z9;
    }
}
