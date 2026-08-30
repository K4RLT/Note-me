package i0;

import pe.z;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final a f18031v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f18032w;

    /* renamed from: x, reason: collision with root package name */
    public static final a f18033x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18034u;

    static {
        int i = 1;
        f18031v = new a(i, 0);
        f18032w = new a(i, 1);
        f18033x = new a(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i10) {
        super(i);
        this.f18034u = i10;
    }

    @Override // df.l
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f18034u) {
            case 0:
                ((Number) obj).longValue();
                return z.f22715a;
            case 1:
                return z.f22715a;
            default:
                int i = ((r2.i) obj).f24490a;
                return z.f22715a;
        }
    }
}
