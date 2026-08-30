package p0;

import m2.q0;
import pe.z;
import r0.y;
import ya.k9;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22321u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f22322v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f22323w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.p f22324x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f22325y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(long j10, q0 q0Var, df.p pVar, int i, int i10) {
        super(2);
        this.f22321u = i10;
        this.f22322v = j10;
        this.f22323w = q0Var;
        this.f22324x = pVar;
        this.f22325y = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22321u) {
            case 0:
                ((Number) obj2).intValue();
                k9.a(this.f22322v, this.f22323w, this.f22324x, (r0.m) obj, y.L(this.f22325y | 1));
                return z.f22715a;
            default:
                ((Number) obj2).intValue();
                o.b(this.f22322v, this.f22323w, this.f22324x, (r0.m) obj, y.L(this.f22325y | 1));
                return z.f22715a;
        }
    }
}
