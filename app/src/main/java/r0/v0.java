package r0;
import l.a;
import w0.b;
import w0.k;

/* loaded from: classes.dex */
public final class v0 implements te.f {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v0 f24417v = new v0(0);

    /* renamed from: w, reason: collision with root package name */
    public static final v0 f24418w = new v0(1);

    /* renamed from: x, reason: collision with root package name */
    public static final v0 f24419x = new v0(2);

    /* renamed from: y, reason: collision with root package name */
    public static final v0 f24420y = new v0(3);

    /* renamed from: z, reason: collision with root package name */
    public static final v0 f24421z = new v0(4);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24422u;

    public /* synthetic */ v0(int i) {
        this.f24422u = i;
    }

    public static final void a(v0 v0Var) {
        sf.n0 n0Var;
        b bVar;
        int i;
        Object obj;
        b bVar2;
        sf.n0 n0Var2 = u1.f24393x;
        do {
            n0Var = u1.f24393x;
            bVar = (b) n0Var.getValue();
            b bVar3 = bVar.f30041w;
            a aVar = (a) bVar3.get(v0Var);
            if (aVar == null) {
                bVar2 = bVar;
            } else {
                Object obj2 = aVar.f30036a;
                Object obj3 = aVar.f30037b;
                k kVar = bVar3.f27660u;
                if (v0Var != null) {
                    i = v0Var.hashCode();
                } else {
                    i = 0;
                }
                k v2 = kVar.v(i, v0Var, 0);
                if (kVar != v2) {
                    if (v2 == null) {
                        bVar3 = b.f27659w;
                    } else {
                        bVar3 = new b(v2, bVar3.f27661v - 1);
                    }
                }
                b bVar4 = b.f30796a;
                if (obj2 != bVar4) {
                    Object obj4 = bVar3.get(obj2);
                    obj4.getClass();
                    bVar3 = bVar3.c(obj2, new a(((a) obj4).f30036a, obj3));
                }
                if (obj3 != bVar4) {
                    Object obj5 = bVar3.get(obj3);
                    obj5.getClass();
                    bVar3 = bVar3.c(obj3, new a(obj2, ((a) obj5).f30037b));
                }
                if (obj2 != bVar4) {
                    obj = bVar.f30039u;
                } else {
                    obj = obj3;
                }
                if (obj3 != bVar4) {
                    obj2 = bVar.f30040v;
                }
                bVar2 = new b(obj, obj2, bVar3);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!n0Var.i(bVar, bVar2));
    }

    public boolean b(Object obj, Object obj2) {
        switch (this.f24422u) {
            case 1:
                return false;
            case 2:
                if (obj == obj2) {
                    return true;
                }
                return false;
            default:
                return kotlin.jvm.internal.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f24422u) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
