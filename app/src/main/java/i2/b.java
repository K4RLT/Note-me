package i2;

import df.l;
import kotlin.jvm.internal.m;
import pe.z;

/* loaded from: classes.dex */
public final class b extends m implements l {

    /* renamed from: v, reason: collision with root package name */
    public static final b f18148v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f18149w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f18150x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18151u;

    static {
        int i = 1;
        f18148v = new b(i, 0);
        f18149w = new b(i, 1);
        f18150x = new b(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i10) {
        super(i);
        this.f18151u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f18151u) {
            case 0:
                ((Number) obj).longValue();
                return z.f22715a;
            case 1:
                return Integer.valueOf(((h) obj).f18165b);
            default:
                return Integer.valueOf(((h) obj).f18166c.b());
        }
    }
}
