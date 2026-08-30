package s9;

import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.sr1;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25075a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.s f25076b;

    public /* synthetic */ j(c4.s sVar, int i) {
        this.f25075a = i;
        this.f25076b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f25075a) {
            case 0:
                String str = this.f25076b.f3857v;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            return kj.AD_LOADER;
                        }
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            return kj.INTERSTITIAL;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            return kj.REWARD_BASED_VIDEO_AD;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            return kj.BANNER;
                        }
                        break;
                }
                return kj.AD_INITIATER_UNSPECIFIED;
            case 1:
                String lowerCase = this.f25076b.f3857v.toLowerCase(Locale.ROOT);
                lo1.b(lowerCase);
                return lowerCase;
            default:
                HashSet hashSet = new HashSet();
                hashSet.add(this.f25076b.f3857v.toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
