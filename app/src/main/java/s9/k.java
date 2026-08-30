package s9;

import com.google.android.gms.internal.ads.c90;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.sr1;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xx;

/* loaded from: classes.dex */
public final class k implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25077a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f25078b;

    public /* synthetic */ k(rr1 rr1Var, int i) {
        this.f25077a = i;
        this.f25078b = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f25077a) {
            case 0:
                v vVar = (v) this.f25078b.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new c90(vVar, wxVar);
            default:
                return new u((fe0) this.f25078b.zzb());
        }
    }
}
