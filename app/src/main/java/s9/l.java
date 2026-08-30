package s9;
import r.e;

import com.google.android.gms.internal.ads.hr0;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.ir0;
import com.google.android.gms.internal.ads.j50;
import com.google.android.gms.internal.ads.k90;
import com.google.android.gms.internal.ads.kr0;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.sr1;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xx;
import k9.x;

/* loaded from: classes.dex */
public final class l implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final rr1 f25079a;

    /* renamed from: b, reason: collision with root package name */
    public final x f25080b;

    /* renamed from: c, reason: collision with root package name */
    public final j50 f25081c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f25082d;

    public l(rr1 rr1Var, x xVar, j50 j50Var, rr1 rr1Var2) {
        this.f25079a = rr1Var;
        this.f25080b = xVar;
        this.f25081c = j50Var;
        this.f25082d = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        kr0 kr0Var = (kr0) this.f25079a.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        mr mrVar = new mr(wxVar, 15, ((rw) this.f25080b.f19727b).a());
        i60 b10 = this.f25081c.b();
        k90 k90Var = (k90) this.f25082d.zzb();
        hr0 j10 = kr0Var.a(b10.e(), ir0.GENERATE_SIGNALS).g(mrVar).i(((Integer) g9.e.f17698c.a(sl.A6)).intValue()).j();
        j10.a(new t81(j10, 0, new k6.i(28, k90Var)), wxVar);
        return j10;
    }
}
