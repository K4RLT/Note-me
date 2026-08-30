package a0;

import java.util.List;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final w f149v;

    /* renamed from: w, reason: collision with root package name */
    public static final w f150w;

    /* renamed from: x, reason: collision with root package name */
    public static final w f151x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f152u;

    static {
        int i = 1;
        f149v = new w(i, 0);
        f150w = new w(i, 1);
        f151x = new w(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i10) {
        super(i);
        this.f152u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f152u) {
            case 0:
                return pe.z.f22715a;
            case 1:
                List list = (List) obj;
                return new l0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return qe.s.f24023u;
        }
    }
}
