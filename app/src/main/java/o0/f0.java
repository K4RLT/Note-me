package o0;
import p.j;
import z1.a1;
import z1.z0;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21477u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f21478v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f21479w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f21480x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i, a1 a1Var, int i10) {
        super(1);
        this.f21477u = 0;
        this.f21479w = i;
        this.f21478v = a1Var;
        this.f21480x = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f21477u) {
            case 0:
                ((z0) obj).h((a1) this.f21478v, ff.a.b((this.f21479w - r0.f31769u) / 2.0f), ff.a.b((this.f21480x - r0.f31770v) / 2.0f), 0.0f);
                return pe.z.f22715a;
            case 1:
                z0.l((z0) obj, (a1) this.f21478v, this.f21479w, this.f21480x);
                return pe.z.f22715a;
            case 2:
                ((z0) obj).h((a1) this.f21478v, this.f21479w, this.f21480x, 0.0f);
                return pe.z.f22715a;
            case 3:
                ((z0) obj).h((a1) this.f21478v, this.f21479w, this.f21480x, 0.0f);
                return pe.z.f22715a;
            default:
                z0 z0Var = (z0) obj;
                for (a1 a1Var : (a1[]) this.f21478v) {
                    if (a1Var != null) {
                        long j10 = (a1Var.f31769u << 32) | (a1Var.f31770v & 4294967295L);
                        long j11 = (this.f21479w << 32) | (this.f21480x & 4294967295L);
                        float f10 = 1;
                        float f11 = (f10 - 1.0f) * ((((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f);
                        float f12 = (f10 - 1.0f) * ((((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f);
                        long round = (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
                        z0Var.h(a1Var, (int) (round >> 32), (int) (round & 4294967295L), 0.0f);
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(a1 a1Var, int i, int i10, int i11) {
        super(1);
        this.f21477u = i11;
        this.f21478v = a1Var;
        this.f21479w = i;
        this.f21480x = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1[] a1VarArr, j jVar, int i, int i10) {
        super(1);
        this.f21477u = 4;
        this.f21478v = a1VarArr;
        this.f21479w = i;
        this.f21480x = i10;
    }
}
