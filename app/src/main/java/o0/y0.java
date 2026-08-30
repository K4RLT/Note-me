package o0;
import f1.e;
import m1.d;
import m1.h;
import q.e0;

import r0.n2;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ float A;
    public final /* synthetic */ long B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f21746u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f21747v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f21748w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n2 f21749x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n2 f21750y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n2 f21751z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(long j10, h hVar, e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, float f10, long j11) {
        super(1);
        this.f21746u = j10;
        this.f21747v = hVar;
        this.f21748w = e0Var;
        this.f21749x = e0Var2;
        this.f21750y = e0Var3;
        this.f21751z = e0Var4;
        this.A = f10;
        this.B = j11;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        d dVar = (d) obj;
        long j10 = this.f21746u;
        h hVar = this.f21747v;
        e(dVar, 0.0f, 360.0f, j10, hVar);
        float floatValue = (((Number) this.f21748w.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.f21749x.getValue()).floatValue();
        n2 n2Var = this.f21750y;
        float abs = Math.abs(floatValue2 - ((Number) n2Var.getValue()).floatValue());
        float floatValue3 = ((Number) n2Var.getValue()).floatValue() + ((Number) this.f21751z.getValue()).floatValue() + (floatValue - 90.0f);
        if (hVar.f20432c == 0) {
            f10 = 0.0f;
        } else {
            f10 = ((this.A / (e / 2)) * 57.29578f) / 2.0f;
        }
        e(dVar, floatValue3 + f10, Math.max(abs, 0.1f), this.B, hVar);
        return pe.z.f22715a;
    }
}
