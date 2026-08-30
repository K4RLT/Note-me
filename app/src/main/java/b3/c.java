package b3;

import pe.z;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final c f1643v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f1644w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f1645x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f1646y;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1647u;

    static {
        int i = 1;
        f1643v = new c(i, 0);
        f1644w = new c(i, 1);
        f1645x = new c(i, 2);
        f1646y = new c(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i10) {
        super(i);
        this.f1647u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f1647u) {
            case 0:
                k kVar = (k) obj;
                kVar.getHandler().post(new a(1, kVar.K));
                return z.f22715a;
            case 1:
                return z.f22715a;
            case 2:
                return z.f22715a;
            default:
                return z.f22715a;
        }
    }
}
