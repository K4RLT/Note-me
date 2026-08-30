package n1;

import k1.r;
import kotlin.jvm.internal.m;
import pe.z;

/* loaded from: classes.dex */
public final class a extends m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final a f21010v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f21011w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21012u;

    static {
        int i = 1;
        f21010v = new a(i, 0);
        f21011w = new a(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i10) {
        super(i);
        this.f21012u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f21012u) {
            case 0:
                return z.f22715a;
            default:
                m1.d.t((m1.d) obj, r.f19520k, 0L, 0L, 0.0f, null, 126);
                return z.f22715a;
        }
    }
}
