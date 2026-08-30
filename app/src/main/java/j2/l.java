package j2;
import u.b;
import u.c;

import pe.z;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18818u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f18819v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i) {
        super(1);
        this.f18818u = i;
        this.f18819v = str;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f18818u) {
            case 0:
                b((j) obj, this.f18819v);
                return z.f22715a;
            case 1:
                j jVar = (j) obj;
                b(jVar, this.f18819v);
                c(jVar, 5);
                return z.f22715a;
            default:
                j jVar2 = (j) obj;
                b(jVar2, this.f18819v);
                c(jVar2, 5);
                return z.f22715a;
        }
    }
}
