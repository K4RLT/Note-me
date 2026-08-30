package b8;
import d1.r;
import k9.z;
import r0.m;
import r0.y;
import z0.c;
import z7.l;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2141u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2142v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2143w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2144x;

    public /* synthetic */ h(int i, int i10, Object obj, Object obj2) {
        this.f2141u = i10;
        this.f2143w = obj;
        this.f2144x = obj2;
        this.f2142v = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2141u) {
            case 0:
                ((Integer) obj2).getClass();
                o.d((x5) this.f2143w, (r) this.f2144x, (m) obj, y.L(this.f2142v | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                r4.e((x.p) this.f2143w, (String) this.f2144x, (m) obj, y.L(this.f2142v | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                y.a((z) this.f2143w, (df.p) this.f2144x, (m) obj, y.L(this.f2142v | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                y.b((z[]) this.f2143w, (df.p) this.f2144x, (m) obj, y.L(this.f2142v | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int L = y.L(this.f2142v) | 1;
                ((c) this.f2143w).j(this.f2144x, (m) obj, L);
                break;
            default:
                ((Integer) obj2).getClass();
                l.c((String) this.f2143w, (df.a) this.f2144x, (m) obj, y.L(this.f2142v | 1));
                break;
        }
        return pe.z.f22715a;
    }
}
