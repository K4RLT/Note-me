package o0;

import wa.b9;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21380u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f21381v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i, df.a aVar) {
        super(0);
        this.f21380u = i;
        this.f21381v = aVar;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f21380u) {
            case 0:
                return Float.valueOf(b9.d(((Number) this.f21381v.invoke()).floatValue(), 0.0f, 1.0f));
            default:
                return Float.valueOf(b9.d(((Number) this.f21381v.invoke()).floatValue(), 0.0f, 1.0f));
        }
    }
}
