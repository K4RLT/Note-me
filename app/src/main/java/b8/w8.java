package b8;
import r0.m;
import r0.y;
import z7.d;
import z7.p;

/* loaded from: classes.dex */
public final /* synthetic */ class w8 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2941u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2942v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f2943w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f2944x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.a f2945y;

    public /* synthetic */ w8(String str, String str2, boolean z3, df.a aVar, int i, int i10) {
        this.f2941u = i10;
        this.f2942v = str;
        this.f2943w = str2;
        this.f2944x = z3;
        this.f2945y = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2941u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(3073);
                z9.f(this.f2942v, this.f2943w, this.f2944x, this.f2945y, (m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int L2 = y.L(3073);
                d.b(this.f2942v, this.f2943w, this.f2944x, this.f2945y, (m) obj, L2);
                break;
            default:
                ((Integer) obj2).getClass();
                int L3 = y.L(1);
                p.d(this.f2942v, this.f2943w, this.f2944x, this.f2945y, (m) obj, L3);
                break;
        }
        return pe.z.f22715a;
    }
}
