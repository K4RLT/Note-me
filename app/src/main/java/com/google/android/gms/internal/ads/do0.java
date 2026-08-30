package com.google.android.gms.internal.ads;
import c7.x;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class do0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5467a;

    /* renamed from: b, reason: collision with root package name */
    public final x f5468b;

    public /* synthetic */ do0(x xVar, int i) {
        this.f5467a = i;
        this.f5468b = xVar;
    }

    public Integer a() {
        Bundle bundle = ((dv) this.f5468b.f4003w).f5526u.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        i = 0;
                        break;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        i = 1;
                        break;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        i = 2;
                        break;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        i = 3;
                        break;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        i = 4;
                        break;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        i = 5;
                        break;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        i = 6;
                        break;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        i = 7;
                        break;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        i = 8;
                        break;
                    }
                    break;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f5467a) {
            case 0:
                String str = ((dv) this.f5468b.f4003w).f5529x;
                lo1.b(str);
                return str;
            case 1:
                return Integer.valueOf(this.f5468b.f4002v);
            case 2:
                return Boolean.valueOf(((dv) this.f5468b.f4003w).F);
            case 3:
                return Boolean.valueOf(((dv) this.f5468b.f4003w).E);
            case 4:
                String str2 = ((dv) this.f5468b.f4003w).B;
                lo1.b(str2);
                return str2;
            default:
                return a();
        }
    }
}
