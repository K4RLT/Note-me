package g0;
import k1.l0;
import k1.r;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final j f17136v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f17137w;

    /* renamed from: x, reason: collision with root package name */
    public static final j f17138x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17139u;

    static {
        int i = 0;
        f17136v = new j(i, 0);
        f17137w = new j(i, 1);
        f17138x = new j(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i10) {
        super(i);
        this.f17139u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f17139u) {
            case 0:
                return new r(l0.c(1308617531));
            case 1:
                return new y2.j(0L);
            default:
                return new y2.j(0L);
        }
    }
}
