package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class q90 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9786a;

    public /* synthetic */ q90(int i) {
        this.f9786a = i;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f9786a) {
            case 0:
                return "interstitial";
            case 1:
                return kj.AD_LOADER;
            case 2:
                return "native";
            case 3:
                return null;
            case 4:
                return new zk0();
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return new vc0();
            case 9:
                return new Object();
            case 10:
                return new nd0();
            case 11:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new qd0(wxVar);
            case 12:
                return new sd0(11, 12, 1007);
            case 13:
                return new sd0(19, 20, 1008);
            case 14:
                return new sd0(13, 14, 1004);
            case 15:
                return new sd0(AdError.NO_FILL_ERROR_CODE, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 1003);
            case 16:
                return new sd0(15, 16, 1005);
            case 17:
                return new sd0(17, 18, 1006);
            case 18:
                return new ce0(ir0.SIGNALS, "ttc");
            case 19:
                return new ce0(ir0.PRELOADED_LOADER, "t_load_as");
            case 20:
                return new me0();
            case gl.zzm /* 21 */:
                return new cf0();
            case 22:
                k9.f0 f0Var = f9.k.C.f16813c;
                String uuid = UUID.randomUUID().toString();
                lo1.b(uuid);
                return uuid;
            case 23:
                return new lh0();
            case 24:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new ok0(wxVar2);
            case 25:
                return new Object();
            case 26:
                return new xl0();
            case 27:
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new om0(wxVar3, 0);
            case 28:
                List arrayList = new ArrayList();
                nl nlVar = sl.f10783id;
                g9.r rVar = g9.r.e;
                if (!((String) rVar.f17698c.a(nlVar)).isEmpty()) {
                    arrayList = Arrays.asList(((String) rVar.f17698c.a(nlVar)).split(","));
                }
                lo1.b(arrayList);
                return arrayList;
            default:
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new om0(wxVar4, 1);
        }
    }
}
