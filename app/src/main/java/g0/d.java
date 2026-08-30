package g0;
import b0.t0;
import h1.d;
import j2.j;
import k0.j0;
import k0.k0;
import k0.l0;
import k0.v0;
import k1.l;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17035u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f17036v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(long j10, int i) {
        super(1);
        this.f17035u = i;
        this.f17036v = j10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f17035u) {
            case 0:
                h1.d dVar = (h1.d) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f17824u.e() >> 32)) / 2.0f;
                return dVar.b(new t0(intBitsToFloat, 1, v0.q(dVar, intBitsToFloat), new l(this.f17036v, 5)));
            default:
                ((j) obj).k(l0.f19351c, new k0(r0.f17268u, this.f17036v, j0.f19315v, true));
                return pe.z.f22715a;
        }
    }
}
