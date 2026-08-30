package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y01 implements w01 {

    /* renamed from: a, reason: collision with root package name */
    public final bw0 f12702a;

    /* renamed from: b, reason: collision with root package name */
    public final l11 f12703b;

    /* renamed from: c, reason: collision with root package name */
    public final t11 f12704c;

    /* renamed from: d, reason: collision with root package name */
    public final h21 f12705d;
    public final ExecutorService e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f12706f = new AtomicReference("2.904631200.-1");

    public y01(bw0 bw0Var, l11 l11Var, t11 t11Var, h21 h21Var, ExecutorService executorService) {
        this.f12702a = bw0Var;
        this.f12703b = l11Var;
        this.f12704c = t11Var;
        this.f12705d = h21Var;
        this.e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final h91 a(Context context, View view, Activity activity) {
        return ed1.E(new vb0(this, context, view, activity, 3), this.e);
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final void b(InputEvent inputEvent) {
        xv0 b10 = this.f12702a.b();
        h21 h21Var = this.f12705d;
        if (b10 == null) {
            h21Var.b(15004);
        } else {
            if (!(inputEvent instanceof MotionEvent)) {
                return;
            }
            try {
                b10.g((MotionEvent) inputEvent);
            } catch (aw0 e) {
                h21Var.d(15005, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final h91 c(Context context) {
        return ed1.E(new xe(this, 12, context), this.e);
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final h91 d(Context context, String str, View view) {
        return ed1.E(new vb0(this, context, str, view, 4), this.e);
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final int e() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final String zza() {
        return (String) this.f12706f.get();
    }

    @Override // com.google.android.gms.internal.ads.w01
    public final q81 zzb() {
        q81 t3 = q81.t(this.f12703b.zzb());
        i6 i6Var = i6.C;
        o81 o81Var = o81.f9033u;
        final int i = 0;
        b81 c02 = ed1.c0(ed1.d0(ed1.S(t3, Throwable.class, i6Var, o81Var), new f31(this) { // from class: com.google.android.gms.internal.ads.x01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y01 f12397b;

            {
                this.f12397b = this;
            }

            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        vy0 vy0Var = (vy0) obj;
                        y01 y01Var = this.f12397b;
                        if (y01Var.f12704c.b(vy0Var) && vy0Var != null) {
                            return new Boolean(true);
                        }
                        y01Var.f12705d.b(15003);
                        throw new ab.b(1);
                    default:
                        uv0 uv0Var = (uv0) obj;
                        if (uv0Var != null) {
                            File file = uv0Var.f11730b;
                            if (Build.VERSION.SDK_INT >= 34) {
                                file.setReadOnly();
                            }
                            y01 y01Var2 = this.f12397b;
                            y01Var2.f12705d.f(15002, new ac.a(y01Var2, 26, uv0Var));
                            return new Boolean(true);
                        }
                        throw new ab.b(3);
                }
            }
        }, o81Var), new dq(15, this), o81Var);
        final int i10 = 1;
        return ed1.d0(ed1.d0(c02, new f31(this) { // from class: com.google.android.gms.internal.ads.x01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y01 f12397b;

            {
                this.f12397b = this;
            }

            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        vy0 vy0Var = (vy0) obj;
                        y01 y01Var = this.f12397b;
                        if (y01Var.f12704c.b(vy0Var) && vy0Var != null) {
                            return new Boolean(true);
                        }
                        y01Var.f12705d.b(15003);
                        throw new ab.b(1);
                    default:
                        uv0 uv0Var = (uv0) obj;
                        if (uv0Var != null) {
                            File file = uv0Var.f11730b;
                            if (Build.VERSION.SDK_INT >= 34) {
                                file.setReadOnly();
                            }
                            y01 y01Var2 = this.f12397b;
                            y01Var2.f12705d.f(15002, new ac.a(y01Var2, 26, uv0Var));
                            return new Boolean(true);
                        }
                        throw new ab.b(3);
                }
            }
        }, o81Var), i6.B, o81Var);
    }
}
