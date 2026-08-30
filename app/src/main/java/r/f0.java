package r;
import j1.c;
import k1.f0;
import k1.l0;
import k1.p0;

/* loaded from: classes.dex */
public final class f0 implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f24071b = new f0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f24072c = new f0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24073a;

    public /* synthetic */ f0(int i) {
        this.f24073a = i;
    }

    @Override // p0
    public final l0 a(long j10, y2.m mVar, y2.c cVar) {
        switch (this.f24073a) {
            case 0:
                float t02 = cVar.t0(s.f24144a);
                return new k1.f0(new c(0.0f, -t02, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + t02));
            default:
                float t03 = cVar.t0(s.f24144a);
                return new k1.f0(new c(-t03, 0.0f, Float.intBitsToFloat((int) (j10 >> 32)) + t03, Float.intBitsToFloat((int) (j10 & 4294967295L))));
        }
    }
}
