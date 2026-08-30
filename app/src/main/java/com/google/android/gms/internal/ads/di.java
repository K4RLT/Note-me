package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class di implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5435a;

    public di(p80 p80Var) {
        this.f5435a = 21;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.c10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.i80, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f5435a) {
            case 0:
                return new Object();
            case 1:
                ?? obj = new Object();
                obj.f4942a = null;
                return obj;
            case 2:
                return f9.k.C.f16817h;
            case 3:
                ExecutorService executorService = xx.f12656g;
                lo1.b(executorService);
                return new to0(3, executorService);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = g9.p.f17688g.f17693f;
                lo1.b(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new s6(29);
            case 8:
                return new fp(10);
            case 9:
                return new fp(14);
            case 10:
                return f9.k.C.f16833y;
            case 11:
                return new Object();
            case 12:
                return kj.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return kj.BANNER;
            case 15:
                return "banner";
            case 16:
                return new q50();
            case 17:
                return new Object();
            case 18:
                return new c80();
            case 19:
                ?? obj2 = new Object();
                nl nlVar = sl.O1;
                g9.r rVar = g9.r.e;
                obj2.f7048u = ((Integer) rVar.f17698c.a(nlVar)).intValue();
                obj2.f7049v = ((Integer) rVar.f17698c.a(sl.f11005we)).intValue();
                return obj2;
            case 20:
                Set set = Collections.EMPTY_SET;
                lo1.b(set);
                return set;
            case gl.zzm /* 21 */:
                Set set2 = Collections.EMPTY_SET;
                lo1.b(set2);
                return set2;
            case 22:
                Set set3 = Collections.EMPTY_SET;
                lo1.b(set3);
                return set3;
            case 23:
                Set set4 = Collections.EMPTY_SET;
                lo1.b(set4);
                return set4;
            case 24:
                Set set5 = Collections.EMPTY_SET;
                lo1.b(set5);
                return set5;
            case 25:
                Set set6 = Collections.EMPTY_SET;
                lo1.b(set6);
                return set6;
            case 26:
                Set set7 = Collections.EMPTY_SET;
                lo1.b(set7);
                return set7;
            case 27:
                Set set8 = Collections.EMPTY_SET;
                lo1.b(set8);
                return set8;
            case 28:
                return new Object();
            default:
                return kj.INTERSTITIAL;
        }
    }

    public /* synthetic */ di(int i) {
        this.f5435a = i;
    }
}
