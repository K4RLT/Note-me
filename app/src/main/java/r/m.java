package r;
import j.i0;
import k1.n;
import m1.b;
import m1.d;
import m1.h;
import p.a;

import ya.sa;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ h B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f24121u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f24122v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f24123w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f24124x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f24125y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f24126z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z3, n nVar, long j10, float f10, float f11, long j11, long j12, h hVar) {
        super(1);
        this.f24121u = z3;
        this.f24122v = nVar;
        this.f24123w = j10;
        this.f24124x = f10;
        this.f24125y = f11;
        this.f24126z = j11;
        this.A = j12;
        this.B = hVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        b2.l0 l0Var = (b2.l0) obj;
        l0Var.b();
        b bVar = l0Var.f1533u;
        if (this.f24121u) {
            d.L(l0Var, this.f24122v, 0L, 0L, this.f24123w, null, 246);
        } else {
            long j10 = this.f24123w;
            float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float f10 = this.f24124x;
            if (intBitsToFloat < f10) {
                float f11 = this.f24125y;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.e() >> 32));
                float f12 = this.f24125y;
                float f13 = intBitsToFloat2 - f12;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) - f12;
                n nVar = this.f24122v;
                long j11 = this.f24123w;
                i0 i0Var = bVar.f20424v;
                long r8 = i0Var.r();
                i0Var.j().l();
                try {
                    ((ic.c) i0Var.f18636v).e(f11, f11, f13, intBitsToFloat3, 0);
                    d.L(l0Var, nVar, 0L, 0L, j11, null, 246);
                } finally {
                    a.v(i0Var, r8);
                }
            } else {
                d.L(l0Var, this.f24122v, this.f24126z, this.A, sa.c(j10, f10), this.B, 208);
            }
        }
        return pe.z.f22715a;
    }
}
