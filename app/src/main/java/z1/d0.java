package z1;

import java.util.Map;

/* loaded from: classes.dex */
public final class d0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f31792c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.l f31793d;
    public final /* synthetic */ e0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f31794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df.l f31795g;

    public d0(int i, int i10, Map map, df.l lVar, e0 e0Var, j0 j0Var, df.l lVar2) {
        this.f31790a = i;
        this.f31791b = i10;
        this.f31792c = map;
        this.f31793d = lVar;
        this.e = e0Var;
        this.f31794f = j0Var;
        this.f31795g = lVar2;
    }

    @Override // z1.q0
    public final void a() {
        b2.r rVar;
        b2.i0 i0Var = this.f31794f.f31828u;
        boolean j02 = this.e.j0();
        df.l lVar = this.f31795g;
        if (j02 && (rVar = ((b2.s) i0Var.Z.f1458x).l0) != null) {
            lVar.invoke(rVar.F);
        } else {
            lVar.invoke(((b2.s) i0Var.Z.f1458x).F);
        }
    }

    @Override // z1.q0
    public final Map b() {
        return this.f31792c;
    }

    @Override // z1.q0
    public final df.l c() {
        return this.f31793d;
    }

    @Override // z1.q0
    public final int getHeight() {
        return this.f31791b;
    }

    @Override // z1.q0
    public final int getWidth() {
        return this.f31790a;
    }
}
