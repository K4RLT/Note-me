package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.mlkit_vision_digital_ink.yl;

/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public Object f15395a;

    /* renamed from: b, reason: collision with root package name */
    public e4 f15396b;

    /* renamed from: c, reason: collision with root package name */
    public f4 f15397c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15398d;

    public final void a(Object obj) {
        this.f15398d = true;
        e4 e4Var = this.f15396b;
        if (e4Var != null) {
            d4 d4Var = e4Var.f15415v;
            d4Var.getClass();
            if (obj == null) {
                obj = b4.A;
            }
            if (b4.f15386z.d(d4Var, null, obj)) {
                b4.c(d4Var);
                this.f15395a = null;
                this.f15396b = null;
                this.f15397c = null;
            }
        }
    }

    public final void finalize() {
        f4 f4Var;
        e4 e4Var = this.f15396b;
        if (e4Var != null && !e4Var.f15415v.isDone()) {
            e4Var.b(new yl("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f15395a)), 3));
        }
        if (!this.f15398d && (f4Var = this.f15397c) != null) {
            f4Var.i(null);
        }
    }
}
