package gc;

import android.os.Bundle;
import eb.q1;
import java.util.Arrays;
import ya.df;
import ya.ef;
import zb.d;
import zb.e;
import zb.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f17737a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f17738b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f17739c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f17740d;
    public static final g e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f17741f;

    static {
        int i = e.f32030w;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f17737a = e.n(objArr, 15);
        zb.b bVar = d.f32029v;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        ef.a(objArr2, 7);
        f17738b = d.k(objArr2, 7);
        Object[] objArr3 = {"auto", "app", "am"};
        ef.a(objArr3, 3);
        f17739c = d.k(objArr3, 3);
        Object[] objArr4 = {"_r", "_dbg"};
        ef.a(objArr4, 2);
        f17740d = d.k(objArr4, 2);
        String[] strArr = q1.i;
        ef.a(strArr, 15);
        Object[] copyOf = Arrays.copyOf(new Object[4], df.a(4, 15));
        System.arraycopy(strArr, 0, copyOf, 0, 15);
        String[] strArr2 = q1.f16329j;
        ef.a(strArr2, 15);
        if (copyOf.length < 30) {
            copyOf = Arrays.copyOf(copyOf, df.a(copyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, copyOf, 15, 15);
        e = d.k(copyOf, 30);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        ef.a(objArr5, 2);
        f17741f = d.k(objArr5, 2);
    }

    public static boolean a(String str, Bundle bundle) {
        if (!f17738b.contains(str)) {
            if (bundle != null) {
                g gVar = f17740d;
                int i = gVar.f32036x;
                int i10 = 0;
                while (i10 < i) {
                    Object obj = gVar.get(i10);
                    i10++;
                    if (bundle.containsKey((String) obj)) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
            } else if (!e.contains(str2)) {
                g gVar = f17741f;
                int i = gVar.f32036x;
                int i10 = 0;
                while (i10 < i) {
                    Object obj = gVar.get(i10);
                    i10++;
                    if (str2.matches((String) obj)) {
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        }
        return false;
    }

    public static boolean c(String str, Bundle bundle, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (d(str) && bundle != null) {
            g gVar = f17740d;
            int i = gVar.f32036x;
            int i10 = 0;
            while (true) {
                if (i10 < i) {
                    Object obj = gVar.get(i10);
                    i10++;
                    if (bundle.containsKey((String) obj)) {
                        break;
                    }
                } else {
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case 101200:
                            if (str.equals("fcm")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 101230:
                            if (str.equals("fdl")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3142703:
                            if (str.equals("fiam")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            bundle.putString("_cis", "fcm_integration");
                            return true;
                        case 1:
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        case 2:
                            bundle.putString("_cis", "fiam_integration");
                            return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (!f17739c.contains(str)) {
            return true;
        }
        return false;
    }
}
