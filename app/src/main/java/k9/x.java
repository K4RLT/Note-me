package k9;

import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.sr1;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xx;

/* loaded from: classes.dex */
public final class x implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19726a;

    /* renamed from: b, reason: collision with root package name */
    public final sr1 f19727b;

    public /* synthetic */ x(sr1 sr1Var, int i) {
        this.f19726a = i;
        this.f19727b = sr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f19726a) {
            case 0:
                return new w(((o10) this.f19727b).a());
            case 1:
                return new r9.d(((o10) this.f19727b).a());
            default:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new mr(wxVar, 15, ((rw) this.f19727b).a());
        }
    }
}
