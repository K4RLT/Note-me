package b0;
import a.a;
import g0.e1;
import g0.i0;
import q.e0;
import q.e;
import q.f0;
import q.j;
import r0.a1;
import t.t0;
import t0.e;

import com.google.android.gms.internal.ads.mu;
import r0.n2;
import t.x1;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1140u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1141v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1142w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1143x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.f1140u = i;
        this.f1141v = obj;
        this.f1142w = obj2;
        this.f1143x = obj3;
        this.f1144y = obj4;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // df.l
    public final Object invoke(Object obj) {
        long j10;
        switch (this.f1140u) {
            case 0:
                n0 n0Var = (n0) this.f1141v;
                n0Var.f1236c = new ra.e(5, (w) this.f1142w, (z1.k1) this.f1143x, (j1) this.f1144y);
                return new u(1, n0Var);
            case 1:
                e1 e1Var = (e1) this.f1141v;
                if (e1Var.b()) {
                    r2.y yVar = (r2.y) this.f1142w;
                    r2.x xVar = (r2.x) this.f1143x;
                    mu muVar = e1Var.f17065d;
                    r2.j jVar = (r2.j) this.f1144y;
                    i0 i0Var = e1Var.f17081v;
                    i0 i0Var2 = e1Var.f17082w;
                    Object obj2 = new Object();
                    b2.k0 k0Var = new b2.k0(6, muVar, i0Var, (Object) obj2);
                    r2.s sVar = yVar.f24518a;
                    sVar.h(xVar, jVar, k0Var, i0Var2);
                    r2.b0 b0Var = new r2.b0(yVar, sVar);
                    yVar.f24519b.set(b0Var);
                    obj2.f19787u = b0Var;
                    e1Var.e = b0Var;
                }
                return new Object();
            case 2:
                long longValue = ((Number) obj).longValue();
                pf.z zVar = (pf.z) this.f1144y;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f1143x;
                f0 f0Var = (f0) this.f1142w;
                n2 n2Var = (n2) ((a1) this.f1141v).getValue();
                if (n2Var != null) {
                    j10 = ((Number) n2Var.getValue()).longValue();
                } else {
                    j10 = longValue;
                }
                long j11 = f0Var.f22892c;
                e eVar = f0Var.f22890a;
                if (j11 == Long.MIN_VALUE || vVar.f19784u != e.m(zVar.A())) {
                    f0Var.f22892c = longValue;
                    Object[] objArr = eVar.f25617u;
                    int i = eVar.f25619w;
                    for (int i10 = 0; i10 < i; i10++) {
                        ((e0) objArr[i10]).A = true;
                    }
                    vVar.f19784u = e.m(zVar.A());
                }
                float f10 = vVar.f19784u;
                if (f10 == 0.0f) {
                    Object[] objArr2 = eVar.f25617u;
                    int i11 = eVar.f25619w;
                    for (int i12 = 0; i12 < i11; i12++) {
                        e0 e0Var = (e0) objArr2[i12];
                        e0Var.f22884x.setValue(e0Var.f22885y.f22843w);
                        e0Var.A = true;
                    }
                } else {
                    long j12 = ((float) (j10 - f0Var.f22892c)) / f10;
                    Object[] objArr3 = eVar.f25617u;
                    int i13 = eVar.f25619w;
                    boolean z3 = true;
                    for (int i14 = 0; i14 < i13; i14++) {
                        e0 e0Var2 = (e0) objArr3[i14];
                        if (!e0Var2.f22886z) {
                            e0Var2.C.f22891b.setValue(Boolean.FALSE);
                            if (e0Var2.A) {
                                e0Var2.A = false;
                                e0Var2.B = j12;
                            }
                            long j13 = j12 - e0Var2.B;
                            e0Var2.f22884x.setValue(e0Var2.f22885y.f(j13));
                            e0Var2.f22886z = e0Var2.f22885y.e(j13);
                        }
                        if (!e0Var2.f22886z) {
                            z3 = false;
                        }
                    }
                    f0Var.f22893d.setValue(Boolean.valueOf(!z3));
                }
                return pe.z.f22715a;
            default:
                j jVar2 = (j) obj;
                float floatValue = ((Number) jVar2.e.getValue()).floatValue();
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) this.f1141v;
                float f11 = floatValue - vVar2.f19784u;
                if (!t0.a(f11)) {
                    if (!t0.a(f11 - f5.a((f5.a) this.f1142w, (x1) this.f1143x, f11))) {
                        jVar2.a();
                        return pe.z.f22715a;
                    }
                    vVar2.f19784u += f11;
                }
                if (((Boolean) ((c3.h) this.f1144y).invoke(Float.valueOf(vVar2.f19784u))).booleanValue()) {
                    jVar2.a();
                }
                return pe.z.f22715a;
        }
    }
}