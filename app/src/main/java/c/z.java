package c;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3277u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g0 f3278v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(g0 g0Var, int i) {
        super(1);
        this.f3277u = i;
        this.f3278v = g0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f3277u) {
            case 0:
                ((b) obj).getClass();
                g0 g0Var = this.f3278v;
                qe.j jVar = g0Var.f3233b;
                ListIterator listIterator = jVar.listIterator(jVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((y) obj2).f3274a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                y yVar = (y) obj2;
                if (g0Var.f3234c != null) {
                    g0Var.b();
                }
                g0Var.f3234c = yVar;
                return pe.z.f22715a;
            default:
                ((b) obj).getClass();
                g0 g0Var2 = this.f3278v;
                if (g0Var2.f3234c == null) {
                    qe.j jVar2 = g0Var2.f3233b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((y) obj3).f3274a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return pe.z.f22715a;
        }
    }
}
