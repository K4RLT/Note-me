package o0;
import j1.e;
import m1.d;

import wa.r8;
import wa.u8;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f21440u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f21441v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j10, int i) {
        super(1);
        this.f21440u = j10;
        this.f21441v = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        float min = Math.min(dVar.l0(v0.f21707d), e.b(dVar.e()));
        float b10 = (e.b(dVar.e()) - min) / 2;
        long j10 = this.f21440u;
        if (this.f21441v == 1) {
            float f10 = min / 2.0f;
            d.D(dVar, j10, f10, r8.a((e.d(dVar.e()) - f10) - b10, e.b(dVar.e()) / 2.0f), null, 120);
        } else {
            d.t(dVar, j10, r8.a((e.d(dVar.e()) - min) - b10, (e.b(dVar.e()) - min) / 2.0f), u8.a(min, min), 0.0f, null, 120);
        }
        return pe.z.f22715a;
    }
}
