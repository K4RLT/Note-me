package w7;
import k1.l0;
import k1.r;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class x8 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29456u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29457v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29458w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29459x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29460y;

    public /* synthetic */ x8(u7.m3 m3Var, int i, int i10, Object obj, int i11) {
        this.f29456u = i11;
        this.f29457v = m3Var;
        this.f29458w = i;
        this.f29459x = i10;
        this.f29460y = obj;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f29456u) {
            case 0:
                long j10 = ((r) obj).f19523a;
                String str = ((u7.b) this.f29460y).f25917a;
                int F = l0.F(j10);
                str.getClass();
                this.f29457v.x0(this.f29458w, this.f29459x, str, new b8.x7(F, 6));
                return pe.z.f22715a;
            default:
                long j11 = ((r) obj).f19523a;
                u7.m3.r1(this.f29457v, this.f29458w, this.f29459x, ((u7.d) this.f29460y).f26033a, null, null, Integer.valueOf(l0.F(j11)), null, null, null, null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                return pe.z.f22715a;
        }
    }
}
