package q1;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final g f23261v;

    /* renamed from: w, reason: collision with root package name */
    public static final g f23262w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23263u;

    static {
        int i = 0;
        f23261v = new g(i, 0);
        f23262w = new g(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i10) {
        super(i);
        this.f23263u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f23263u) {
            case 0:
                return new k1.j(new PathMeasure());
            default:
                return pe.z.f22715a;
        }
    }
}
