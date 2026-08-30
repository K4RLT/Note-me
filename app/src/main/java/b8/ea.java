package b8;
import d1.r;
import e1.j;
import kb.c;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class ea implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2041u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2042v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2043w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f2044x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f2045y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f2046z;

    public /* synthetic */ ea(float f10, int i, int i10, long j10, r rVar) {
        this.f2046z = rVar;
        this.f2045y = j10;
        this.f2044x = f10;
        this.f2042v = i;
        this.f2043w = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2041u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(this.f2042v | 1);
                j(this.f2044x, L, this.f2043w, this.f2045y, this.f2046z, (m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(3457);
                c(this.f2042v, this.f2043w, this.f2044x, this.f2045y, this.f2046z, (m) obj, L2);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ ea(int i, int i10, float f10, long j10, r rVar, int i11) {
        this.f2042v = i;
        this.f2043w = i10;
        this.f2044x = f10;
        this.f2045y = j10;
        this.f2046z = rVar;
    }
}
