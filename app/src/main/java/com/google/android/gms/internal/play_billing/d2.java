package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class d2 implements h2 {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f15403b = new p1(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f15404a;

    public d2() {
        int i = d1.f15402a;
        d2 d2Var = new d2(p1.f15508b, f15403b);
        Charset charset = w1.f15539a;
        this.f15404a = d2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    public o2 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            h2 h2Var = ((h2[]) this.f15404a)[i];
            if (h2Var.b(cls)) {
                return h2Var.a(cls);
            }
        }
        androidx.datastore.preferences.protobuf.s1.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    public boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((h2[]) this.f15404a)[i].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i, Object obj, p2 p2Var) {
        i1 i1Var = (i1) this.f15404a;
        b1 b1Var = (b1) obj;
        i1Var.j(i, 2);
        i1Var.l(b1Var.c(p2Var));
        p2Var.h(b1Var, this);
    }

    public d2(h2... h2VarArr) {
        this.f15404a = h2VarArr;
    }

    public d2(i1 i1Var) {
        Charset charset = w1.f15539a;
        this.f15404a = i1Var;
        i1Var.f15445a = this;
    }
}
