package i1;

import pe.z;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final l f18113v;

    /* renamed from: w, reason: collision with root package name */
    public static final l f18114w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f18115x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18116u;

    static {
        int i = 1;
        f18113v = new l(i, 0);
        f18114w = new l(i, 1);
        f18115x = new l(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i10) {
        super(i);
        this.f18116u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f18116u) {
            case 0:
                return z.f22715a;
            case 1:
                return z.f22715a;
            case 2:
                return Boolean.valueOf(((s) obj).c1(7));
            default:
                return Boolean.valueOf(((s) obj).c1(7));
        }
    }
}
