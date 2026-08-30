package k0;
import s.k;

import ya.qb;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19358u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f19359v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j1 f19360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(k kVar, j1 j1Var, int i) {
        super(0);
        this.f19358u = i;
        this.f19359v = kVar;
        this.f19360w = j1Var;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.jvm.internal.m, df.a] */
    @Override // df.a
    public final Object invoke() {
        switch (this.f19358u) {
            case 0:
                this.f19360w.d();
                qb.a(this.f19359v);
                return pe.z.f22715a;
            case 1:
                this.f19360w.b(false);
                qb.a(this.f19359v);
                return pe.z.f22715a;
            case 2:
                this.f19360w.m();
                qb.a(this.f19359v);
                return pe.z.f22715a;
            case 3:
                this.f19360w.n();
                qb.a(this.f19359v);
                return pe.z.f22715a;
            default:
                Object r02 = this.f19360w.f19323g;
                if (r02 != 0) {
                    r02.invoke();
                }
                qb.a(this.f19359v);
                return pe.z.f22715a;
        }
    }
}