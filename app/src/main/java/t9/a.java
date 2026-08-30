package t9;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.sr1;
import com.google.android.gms.internal.ads.u10;
import g9.n;
import r9.d;

/* loaded from: classes.dex */
public final class a implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final o10 f25684a;

    /* renamed from: b, reason: collision with root package name */
    public final u10 f25685b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f25686c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f25687d;
    public final rr1 e;

    public a(o10 o10Var, u10 u10Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f25684a = o10Var;
        this.f25685b = u10Var;
        this.f25686c = rr1Var;
        this.f25687d = rr1Var2;
        this.e = rr1Var3;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n zzb() {
        return new n((Context) this.f25684a.zzb(), (l9.a) this.f25685b.zzb(), (PackageInfo) this.f25686c.zzb(), (String) this.f25687d.zzb(), (d) this.e.zzb());
    }
}
