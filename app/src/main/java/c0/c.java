package c0;

import java.util.List;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final c f3284v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f3285w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3286u;

    static {
        int i = 1;
        f3284v = new c(i, 0);
        f3285w = new c(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i10) {
        super(i);
        this.f3286u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3286u) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new d(intValue, ((Float) obj3).floatValue(), new a2.c(4, list));
            default:
                return pe.z.f22715a;
        }
    }
}
