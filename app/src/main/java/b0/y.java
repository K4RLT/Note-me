package b0;
import d1.r;
import f0.b;
import f0.d;
import p.a;
import r0.m;
import r0.y;
import z0.c;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1282u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1283v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1284w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1285x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1286y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1287z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Object obj, int i, Object obj2, int i10) {
        super(2);
        this.f1282u = 0;
        this.f1286y = zVar;
        this.f1283v = obj;
        this.f1284w = i;
        this.f1287z = obj2;
        this.f1285x = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1282u) {
            case 0:
                ((Number) obj2).intValue();
                z zVar = (z) this.f1286y;
                d(zVar, this.f1283v, this.f1284w, this.f1287z, (m) obj, r0.y.L(this.f1285x | 1));
                return pe.z.f22715a;
            case 1:
                ((Number) obj2).intValue();
                k0 k0Var = (k0) this.f1286y;
                c cVar = (c) this.f1287z;
                b(this.f1283v, this.f1284w, k0Var, cVar, (m) obj, r0.y.L(this.f1285x | 1));
                return pe.z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a.b((df.l) this.f1286y, (r) this.f1283v, (df.l) this.f1287z, (m) obj, r0.y.L(this.f1284w | 1), this.f1285x);
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                wa.a((df.a) this.f1286y, (c3.u) this.f1283v, (c) this.f1287z, (m) obj, r0.y.L(this.f1284w | 1), this.f1285x);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Object obj, int i, k0 k0Var, c cVar, int i10) {
        super(2);
        this.f1282u = 1;
        this.f1283v = obj;
        this.f1284w = i;
        this.f1286y = k0Var;
        this.f1287z = cVar;
        this.f1285x = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(pe.d dVar, Object obj, pe.d dVar2, int i, int i10, int i11) {
        super(2);
        this.f1282u = i11;
        this.f1286y = dVar;
        this.f1283v = obj;
        this.f1287z = dVar2;
        this.f1284w = i;
        this.f1285x = i10;
    }
}
