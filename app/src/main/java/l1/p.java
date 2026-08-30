package l1;

import wa.b9;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19857u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f19858v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f19857u = i;
        this.f19858v = qVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f19857u) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f19858v.f19868n.invoke(b9.c(doubleValue, r10.e, r10.f19861f)));
            default:
                return Double.valueOf(b9.c(this.f19858v.f19865k.invoke(((Number) obj).doubleValue()), r10.e, r10.f19861f));
        }
    }
}
