package c3;
import p.b;

import z1.h1;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3769u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d1.r f3770v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.p f3771w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3772x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(d1.r rVar, df.p pVar, int i, int i10) {
        super(2);
        this.f3769u = i10;
        this.f3770v = rVar;
        this.f3771w = pVar;
        this.f3772x = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3769u;
        r0.m mVar = (r0.m) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                wa.b(this.f3770v, this.f3771w, mVar, r0.y.L(this.f3772x | 1));
                return pe.z.f22715a;
            default:
                h1.b(this.f3770v, this.f3771w, mVar, r0.y.L(this.f3772x | 1));
                return pe.z.f22715a;
        }
    }
}
