package s6;

import pe.z;
import r0.y;
import ya.wb;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24954u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o6.a f24955v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f24956w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d1.r f24957x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o6.a aVar, df.a aVar2, d1.r rVar, int i, int i10) {
        super(2);
        this.f24954u = i10;
        this.f24955v = aVar;
        this.f24956w = aVar2;
        this.f24957x = rVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24954u;
        r0.m mVar = (r0.m) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                wb.a(this.f24955v, this.f24956w, this.f24957x, mVar, y.L(385));
                return z.f22715a;
            default:
                wb.a(this.f24955v, this.f24956w, this.f24957x, mVar, y.L(385));
                return z.f22715a;
        }
    }
}
