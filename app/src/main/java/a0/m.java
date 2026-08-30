package a0;

import r0.n2;

/* loaded from: classes.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.t implements kf.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f106v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f106v = i10;
    }

    @Override // kotlin.jvm.internal.c
    public final kf.b computeReflected() {
        kotlin.jvm.internal.z.f19788a.getClass();
        return this;
    }

    @Override // kf.e
    public final Object get() {
        switch (this.f106v) {
            case 0:
                return ((n2) this.receiver).getValue();
            case 1:
                return ((n2) this.receiver).getValue();
            case 2:
                return ((n2) this.receiver).getValue();
            case 3:
                return this.receiver.getClass().getSimpleName();
            default:
                return ((n2) this.receiver).getValue();
        }
    }

    @Override // df.a
    public final Object invoke() {
        return get();
    }
}
