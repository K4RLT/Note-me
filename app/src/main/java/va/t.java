package va;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.r6;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.y6;
import com.google.android.gms.internal.play_billing.s3;
import eb.b0;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes.dex */
public class t implements ic.d, k8.e, b0 {

    /* renamed from: v, reason: collision with root package name */
    public static t f27509v;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27510u;

    public /* synthetic */ t(int i) {
        this.f27510u = i;
    }

    public Signature[] a(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // k8.e
    public Object apply(Object obj) {
        return ((s3) obj).b();
    }

    public boolean b(CharSequence charSequence) {
        return charSequence instanceof o3.a;
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        switch (this.f27510u) {
            case 1:
                return new de.g();
            case 2:
                de.a aVar = new de.a();
                c4.o oVar = new c4.o(1);
                ReferenceQueue referenceQueue = aVar.f15831a;
                Set set = aVar.f15832b;
                set.add(new de.l(aVar, referenceQueue, set, oVar));
                Thread thread = new Thread(new pu1(referenceQueue, 6, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            case 3:
                return new ce.d(ce.a.class, nVar.e(be.a.class));
            default:
                return new de.k((Context) nVar.a(Context.class));
        }
    }

    @Override // eb.b0
    public Object zza() {
        switch (this.f27510u) {
            case 14:
                i6.f13778v.get();
                Long l10 = (Long) k6.f13804a.a();
                l10.getClass();
                return l10;
            case 15:
                y6.f13986v.get();
                Boolean bool = (Boolean) a7.f13640a.a();
                bool.getClass();
                return bool;
            case 16:
                p6.f13880v.get();
                Boolean bool2 = (Boolean) r6.f13899a.a();
                bool2.getClass();
                return bool2;
            case 17:
                i6.f13778v.get();
                Long l11 = (Long) k6.I.a();
                l11.getClass();
                return l11;
            case 18:
                i6.f13778v.get();
                Long l12 = (Long) k6.Y.a();
                l12.getClass();
                return l12;
            case 19:
                p6.f13880v.get();
                Boolean bool3 = (Boolean) r6.f13900b.a();
                bool3.getClass();
                return bool3;
            case 20:
                i6.f13778v.get();
                Long l13 = (Long) k6.f13821t.a();
                l13.getClass();
                return l13;
            case gl.zzm /* 21 */:
                i6.f13778v.get();
                Long l14 = (Long) k6.W.a();
                l14.getClass();
                return l14;
            case 22:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.V.a()).longValue());
            case 23:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13817p.a()).longValue());
            case 24:
                i6.f13778v.get();
                Long l15 = (Long) k6.f13826y.a();
                l15.getClass();
                return l15;
            case 25:
                r7.f13903v.get();
                return Integer.valueOf((int) ((Long) t7.f13933d.a()).longValue());
            case 26:
                r7.f13903v.get();
                Double d2 = (Double) t7.f13932c.a();
                d2.getClass();
                return d2;
            case 27:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13814m.a()).longValue());
            case 28:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13806c.a()).longValue());
            default:
                i6.f13778v.get();
                return (String) k6.F.a();
        }
    }
}
