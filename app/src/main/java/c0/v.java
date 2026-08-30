package c0;
import b0.c0;
import k.a;

import t.z0;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ int A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3407u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c0 f3408v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f3409w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f3410x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f3411y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d1.i f3412z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, long j10, u uVar, long j11, d1.i iVar, int i, int i10) {
        super(1);
        this.f3407u = i10;
        switch (i10) {
            case 1:
                this.f3408v = c0Var;
                this.f3409w = j10;
                this.f3410x = uVar;
                this.f3411y = j11;
                this.f3412z = iVar;
                this.A = i;
                super(1);
                return;
            default:
                this.f3408v = c0Var;
                this.f3409w = j10;
                this.f3410x = uVar;
                this.f3411y = j11;
                this.f3412z = iVar;
                this.A = i;
                return;
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3407u) {
            case 0:
                int intValue = ((Number) obj).intValue();
                d1.h hVar = d1.c.H;
                c0 c0Var = this.f3408v;
                return wa.a(c0Var, intValue, this.f3409w, this.f3410x, this.f3411y, z0.f25598v, hVar, this.f3412z, c0Var.f1163v.getLayoutDirection(), false, this.A);
            default:
                int intValue2 = ((Number) obj).intValue();
                d1.h hVar2 = d1.c.H;
                c0 c0Var2 = this.f3408v;
                return wa.a(c0Var2, intValue2, this.f3409w, this.f3410x, this.f3411y, z0.f25598v, hVar2, this.f3412z, c0Var2.f1163v.getLayoutDirection(), false, this.A);
        }
    }
}
