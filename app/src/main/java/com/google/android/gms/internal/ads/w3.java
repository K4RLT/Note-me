package com.google.android.gms.internal.ads;
import b0.a;

/* loaded from: classes.dex */
public final class w3 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12112a;

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f12113b;

    /* renamed from: c, reason: collision with root package name */
    public final c3 f12114c;

    public w3(int i) {
        this.f12112a = i;
        switch (i) {
            case 1:
                this.f12113b = new xk0(4);
                this.f12114c = new c3("image/webp", -1, -1);
                return;
            default:
                this.f12113b = new xk0(4);
                this.f12114c = new c3("image/avif", -1, -1);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
        int i = this.f12112a;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        switch (this.f12112a) {
            case 0:
                i2 i2Var = (i2) o2Var;
                i2Var.d(4, false);
                xk0 xk0Var = this.f12113b;
                xk0Var.y(4);
                i2Var.E(xk0Var.f12580a, 0, 4, false);
                if (xk0Var.P() != 1718909296) {
                    return false;
                }
                xk0Var.y(4);
                i2Var.E(xk0Var.f12580a, 0, 4, false);
                if (xk0Var.P() != 1635150182) {
                    return false;
                }
                return true;
            default:
                xk0 xk0Var2 = this.f12113b;
                xk0Var2.y(4);
                i2 i2Var2 = (i2) o2Var;
                i2Var2.E(xk0Var2.f12580a, 0, 4, false);
                if (xk0Var2.P() != 1380533830) {
                    return false;
                }
                i2Var2.d(4, false);
                xk0Var2.y(4);
                i2Var2.E(xk0Var2.f12580a, 0, 4, false);
                if (xk0Var2.P() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        switch (this.f12112a) {
            case 0:
                this.f12114c.f(p2Var);
                return;
            default:
                this.f12114c.f(p2Var);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        switch (this.f12112a) {
            case 0:
                this.f12114c.g(j10, j11);
                return;
            default:
                this.f12114c.g(j10, j11);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, a aVar) {
        switch (this.f12112a) {
            case 0:
                return this.f12114c.h(o2Var, aVar);
            default:
                return this.f12114c.h(o2Var, aVar);
        }
    }

    private final void a() {
    }

    private final void c() {
    }
}
