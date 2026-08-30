package eb;
import b0.e1;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.measurement.a8;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f3 extends e3 {
    public final e1 y(String str) {
        n0 p02;
        String str2;
        a8.a();
        e1 e1Var = null;
        if (((d1) this.f3443v).A.F(null, v.f16420r0)) {
            t();
            if (l3.A0(str)) {
                f().I.g("sgtm feature flag enabled.");
                n0 p03 = w().p0(str);
                if (p03 == null) {
                    return new e1(z(str), 1);
                }
                String g8 = p03.g();
                com.google.android.gms.internal.measurement.j2 O = x().O(str);
                if (O != null && (p02 = w().p0(str)) != null && ((O.I() && O.y().p() == 100) || t().y0(str, p02.l()) || (!TextUtils.isEmpty(g8) && g8.hashCode() % 100 < O.y().p()))) {
                    if (p03.p()) {
                        f().I.g("sgtm upload enabled in manifest.");
                        com.google.android.gms.internal.measurement.j2 O2 = x().O(p03.f());
                        if (O2 != null && O2.I()) {
                            String s10 = O2.y().s();
                            if (!TextUtils.isEmpty(s10)) {
                                String r8 = O2.y().r();
                                js jsVar = f().I;
                                if (TextUtils.isEmpty(r8)) {
                                    str2 = "Y";
                                } else {
                                    str2 = "N";
                                }
                                jsVar.h("sgtm configured with upload_url, server_info", s10, str2);
                                if (TextUtils.isEmpty(r8)) {
                                    e1Var = new e1(s10, 3);
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("x-sgtm-server-info", r8);
                                    if (!TextUtils.isEmpty(p03.l())) {
                                        hashMap.put("x-gtm-server-preview", p03.l());
                                    }
                                    e1Var = new e1(7, (char) 0);
                                    e1Var.f1180c = s10;
                                    e1Var.f1181d = hashMap;
                                    e1Var.f1179b = 3;
                                }
                            }
                        }
                    }
                    if (e1Var != null) {
                        return e1Var;
                    }
                } else {
                    return new e1(z(str), 1);
                }
            }
        }
        return new e1(z(str), 1);
    }

    public final String z(String str) {
        u0 x9 = x();
        x9.u();
        x9.U(str);
        String str2 = (String) x9.G.get(str);
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse((String) v.f16419r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(str2 + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) v.f16419r.a(null);
    }
}
