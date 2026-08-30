package z;

import java.util.List;
import pe.z;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final h f31685v;

    /* renamed from: w, reason: collision with root package name */
    public static final h f31686w;

    /* renamed from: x, reason: collision with root package name */
    public static final h f31687x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31688u;

    static {
        int i = 1;
        f31685v = new h(i, 0);
        f31686w = new h(i, 1);
        f31687x = new h(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, int i10) {
        super(i);
        this.f31688u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f31688u) {
            case 0:
                return z.f22715a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new m(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
