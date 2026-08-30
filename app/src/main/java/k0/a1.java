package k0;
import c0.d0;
import e1.m;
import n.a0;
import n.o;
import r0.i1;
import r0.y;
import t0.a;

import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: l, reason: collision with root package name */
    public static final x90 f19216l;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19217a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19218b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final a0 f19219c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f19220d;
    public a0 e;

    /* renamed from: f, reason: collision with root package name */
    public m f19221f;

    /* renamed from: g, reason: collision with root package name */
    public r0 f19222g;

    /* renamed from: h, reason: collision with root package name */
    public y f19223h;
    public a0 i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f19224j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f19225k;

    static {
        o0 o0Var = o0.f19378x;
        f19216l = new x90(z0.f19462u, 1, o0Var);
    }

    public a1(long j10) {
        a0 a0Var = o.f20920a;
        this.f19219c = new a0();
        this.f19220d = new AtomicLong(j10);
        a0 a0Var2 = o.f20920a;
        a0Var2.getClass();
        this.f19225k = y.B(a0Var2);
    }

    public final a0 a() {
        return (a0) this.f19225k.getValue();
    }

    public final boolean b(z1.x xVar, long j10, long j11, s sVar, boolean z3) {
        r0 r0Var = this.f19222g;
        if (r0Var != null) {
            t0 t0Var = r0Var.f19402u;
            long a10 = a(t0Var, xVar, j10);
            long a11 = a(t0Var, xVar, j11);
            t0Var.l(z3);
            return t0Var.o(a10, a11, false, sVar);
        }
        return true;
    }

    public final ArrayList c(z1.x xVar) {
        boolean z3 = this.f19217a;
        ArrayList arrayList = this.f19218b;
        if (!z3) {
            qe.m(arrayList, new j2.w(1, new d0(12, xVar)));
            this.f19217a = true;
        }
        return arrayList;
    }

    public final void d(n nVar) {
        long j10 = nVar.f19361a;
        a0 a0Var = this.f19219c;
        if (a0Var.b(j10)) {
            this.f19218b.remove(nVar);
            a0Var.g(j10);
            a0 a0Var2 = this.f19224j;
            if (a0Var2 != null) {
                a0Var2.invoke(Long.valueOf(j10));
            }
        }
    }
}
