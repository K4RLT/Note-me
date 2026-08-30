package ya;
import r.e;
import g9.o0;
import g9.r;
import g9.z2;
import qb.s;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.aq0;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xx;

/* loaded from: classes.dex */
public abstract class zb {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    return "0";
                }
                return str;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    return "1";
                }
                return str;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    return "2";
                }
                return str;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    return "3";
                }
                return str;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    return "4";
                }
                return str;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    return "5";
                }
                return str;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    return "6";
                }
                return str;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    return "7";
                }
                return str;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    return "8";
                }
                return str;
            default:
                return str;
        }
    }

    public static String b(z2 z2Var) {
        Bundle bundle;
        if (z2Var != null && (bundle = z2Var.f17723w) != null) {
            return bundle.getString("query_info_type");
        }
        return "unspecified";
    }

    public static int c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (!TextUtils.isEmpty(string)) {
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        return 1;
                    }
                    return 2;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        return 3;
                    }
                    return 2;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        return 4;
                    }
                    return 2;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        return 5;
                    }
                    return 2;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        return 6;
                    }
                    return 2;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        return 7;
                    }
                    return 2;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        return 8;
                    }
                    return 2;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        return 9;
                    }
                    return 2;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        return 10;
                    }
                    return 2;
                default:
                    return 2;
            }
        }
        return 2;
    }

    public static void d(fe0 fe0Var, String str, Pair... pairArr) {
        if (!((Boolean) r.e.f17698c.a(sl.Q7)).booleanValue()) {
            return;
        }
        xx.f12651a.execute(new s(3, fe0Var, str, pairArr));
    }

    public static int e(aq0 aq0Var) {
        if (aq0Var.f4594s) {
            return 2;
        }
        z2 z2Var = aq0Var.f4581d;
        o0 o0Var = z2Var.M;
        String str = z2Var.R;
        if (o0Var == null && str == null) {
            return 1;
        }
        if (o0Var != null && str != null) {
            return 5;
        }
        if (o0Var != null) {
            return 3;
        }
        return 4;
    }
}
