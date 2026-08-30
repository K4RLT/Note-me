package c7;
import d0.e;
import t.i;

import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.c3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3927a = 0;

    static {
        int i = e;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = com.google.android.gms.internal.play_billing.t.f15532a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static b3 b(int i, int i10, f fVar, String str, i3 i3Var) {
        try {
            f3 p10 = g3.p();
            int i11 = fVar.f3946a;
            p10.b();
            g3.u((g3) p10.f15516v, i11);
            String str2 = fVar.f3948c;
            p10.b();
            g3.r((g3) p10.f15516v, str2);
            int i12 = fVar.f3947b;
            if (i12 != 0) {
                p10.b();
                g3.s((g3) p10.f15516v, i12);
            }
            if (i != 0) {
                p10.b();
                g3.t((g3) p10.f15516v, i);
            }
            if (str != null) {
                p10.b();
                g3.q((g3) p10.f15516v, str);
            }
            a3 s10 = b3.s();
            s10.c(p10);
            s10.b();
            b3.r((b3) s10.f15516v, i10);
            if (!i3Var.equals(i3.BROADCAST_ACTION_UNSPECIFIED)) {
                s10.b();
                b3.v((b3) s10.f15516v, i3Var);
            }
            return (b3) s10.a();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static e3 c(int i, i3 i3Var) {
        try {
            c3 q10 = e3.q();
            q10.b();
            e3.p((e3) q10.f15516v, i);
            if (!i3Var.equals(i3.BROADCAST_ACTION_UNSPECIFIED)) {
                q10.b();
                e3.s((e3) q10.f15516v, i3Var);
            }
            return (e3) q10.a();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
