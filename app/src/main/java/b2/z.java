package b2;
import z1.q0;

import java.util.Map;

/* loaded from: classes.dex */
public final class z implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f1632a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1633b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1634c;

    public z(q0 q0Var, a0 a0Var) {
        this.f1632a = q0Var;
        y yVar = a0Var.m0;
        yVar.getClass();
        this.f1633b = yVar.f31769u;
        y yVar2 = a0Var.m0;
        yVar2.getClass();
        this.f1634c = yVar2.f31770v;
    }

    @Override // q0
    public final void a() {
        this.f1632a.a();
    }

    @Override // q0
    public final Map b() {
        return this.f1632a.b();
    }

    @Override // q0
    public final df.l c() {
        return this.f1632a.c();
    }

    @Override // q0
    public final int getHeight() {
        return this.f1634c;
    }

    @Override // q0
    public final int getWidth() {
        return this.f1633b;
    }
}
