package eb;
import a0.k;
import f.c;
import r.e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.daren.scraply.data.local.ScraplyDatabase;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.f90;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.x00;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.d8;
import com.google.android.gms.internal.measurement.e8;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.internal.measurement.v6;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.w6;
import com.google.android.gms.internal.measurement.x7;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import wa.y6;

/* loaded from: classes.dex */
public /* synthetic */ class y implements b0, dd.a, ic.d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16457u;

    public /* synthetic */ y(int i) {
        this.f16457u = i;
    }

    public static final void c(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z3, be0 be0Var) {
        Context context2;
        j9.a aVar;
        if (adOverlayInfoParcel.E == 4 && adOverlayInfoParcel.f4265w == null) {
            g9.a aVar2 = adOverlayInfoParcel.f4264v;
            if (aVar2 != null) {
                aVar2.L();
            }
            f90 f90Var = adOverlayInfoParcel.O;
            if (f90Var != null) {
                f90Var.M();
            }
            Activity f10 = adOverlayInfoParcel.f4266x.f();
            j9.e eVar = adOverlayInfoParcel.f4263u;
            if (eVar != null && eVar.D && f10 != null) {
                context2 = f10;
            } else {
                context2 = context;
            }
            y yVar = f9.k.C.f16811a;
            j9.c cVar = adOverlayInfoParcel.C;
            if (eVar != null) {
                aVar = eVar.C;
            } else {
                aVar = null;
            }
            g(context2, eVar, cVar, aVar, be0Var, adOverlayInfoParcel.K);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.G.f20032x);
        intent.putExtra("shouldCallOnOverlayOpened", z3);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) g9.e.f17698c.a(sl.Ie)).booleanValue()) {
            k9.f0 f0Var = f9.k.C.f16813c;
            k9.f0.v(context, intent, be0Var, adOverlayInfoParcel.K);
        } else {
            k9.f0 f0Var2 = f9.k.C.f16813c;
            k9.f0.s(context, intent);
        }
    }

    public static final boolean d(Context context, Intent intent, j9.c cVar, j9.a aVar, boolean z3, be0 be0Var, String str, Bundle bundle) {
        int i;
        if (z3) {
            try {
                i = f9.k.C.f16813c.J(context, intent.getData(), bundle);
                if (cVar != null) {
                    cVar.h();
                }
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i10 = k9.a0.f19634b;
                l9.i.f(message);
                i = 6;
            }
            if (aVar != null) {
                aVar.w(i);
            }
            if (i == 5) {
                return true;
            }
            return false;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 21);
            sb2.append("Launching an intent: ");
            sb2.append(uri);
            k9.k(sb2.toString());
            if (((Boolean) g9.e.f17698c.a(sl.Ie)).booleanValue()) {
                k9.f0 f0Var = f9.k.C.f16813c;
                k9.f0.v(context, intent, be0Var, str);
            } else {
                k9.f0 f0Var2 = f9.k.C.f16813c;
                k9.f0.s(context, intent);
            }
            if (cVar != null) {
                cVar.h();
            }
            if (aVar != null) {
                aVar.g0(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            String message2 = e8.getMessage();
            int i11 = k9.a0.f19634b;
            l9.i.f(message2);
            if (aVar != null) {
                aVar.g0(false);
            }
            return false;
        }
    }

    public static final boolean g(Context context, j9.e eVar, j9.c cVar, j9.a aVar, be0 be0Var, String str) {
        int i = 0;
        if (eVar == null) {
            int i10 = k9.a0.f19634b;
            l9.i.f("No intent data for launcher overlay.");
            return false;
        }
        sl.a(context);
        Intent intent = eVar.B;
        if (intent != null) {
            return d(context, intent, cVar, aVar, eVar.D, be0Var, str, eVar.E);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f19070v;
        if (TextUtils.isEmpty(str2)) {
            int i11 = k9.a0.f19634b;
            l9.i.f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f19071w;
        if (!TextUtils.isEmpty(str3)) {
            intent2.setDataAndType(Uri.parse(str2), str3);
        } else {
            intent2.setData(Uri.parse(str2));
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f19072x;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f19073y;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                int i12 = k9.a0.f19634b;
                l9.i.f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = eVar.f19074z;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i13 = k9.a0.f19634b;
                l9.i.f("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        nl nlVar = sl.f10996w5;
        g9.r rVar = g9.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) rVar.f17698c.a(sl.f10980v5)).booleanValue()) {
                k9.f0 f0Var = f9.k.C.f16813c;
                k9.f0.L(context, intent2);
            }
        }
        return d(context, intent2, cVar, aVar, eVar.D, be0Var, str, eVar.E);
    }

    public ScraplyDatabase a(Context context) {
        ScraplyDatabase scraplyDatabase;
        context.getClass();
        ScraplyDatabase scraplyDatabase2 = ScraplyDatabase.f4149m;
        if (scraplyDatabase2 == null) {
            synchronized (this) {
                scraplyDatabase = ScraplyDatabase.f4149m;
                if (scraplyDatabase == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    g5.r a10 = y6.a(applicationContext, ScraplyDatabase.class, "scraply.db");
                    a10.a((j5.a[]) Arrays.copyOf(ScraplyDatabase.f4150n, 1));
                    a10.f17517d.add(ScraplyDatabase.f4151o);
                    a10.f17517d.add(ScraplyDatabase.f4152p);
                    ExecutorService executorService = ScraplyDatabase.f4153q;
                    a10.f17518f = new i7.a(0, executorService);
                    a10.f17519g = new i7.a(0, executorService);
                    g5.v b10 = a10.b();
                    ScraplyDatabase.f4149m = (ScraplyDatabase) b10;
                    scraplyDatabase = (ScraplyDatabase) b10;
                }
            }
            return scraplyDatabase;
        }
        return scraplyDatabase2;
    }

    public CookieManager b() {
        f9.k kVar = f9.k.C;
        k9.f0 f0Var = kVar.f16813c;
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                int i = k9.a0.f19634b;
                l9.i.d("Failed to obtain CookieManager.", th);
                kVar.f16817h.e("ApiLevelUtil.getCookieManager", th);
            }
        }
        return null;
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        switch (this.f16457u) {
            case 27:
                Context context = (Context) nVar.a(Context.class);
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.sl(context, new j6.n(context), (le.a) de.c().a(le.a.class));
            default:
                return new le.a((le.d) nVar.a(le.d.class));
        }
    }

    public x00 f(q00 q00Var, jj jjVar, boolean z3, wh0 wh0Var) {
        return new x00(q00Var, jjVar, z3, wh0Var);
    }

    public int h(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean j(Context context) {
        return false;
    }

    public Intent k(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int m(AudioManager audioManager) {
        return 0;
    }

    public int n(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // eb.b0
    public Object zza() {
        switch (this.f16457u) {
            case 0:
                i6.f13778v.get();
                return (String) k6.B.a();
            case 1:
                i6.f13778v.get();
                return (String) k6.f13823v.a();
            case 2:
                i6.f13778v.get();
                return (String) k6.Z.a();
            case 3:
                b7.f13659v.get();
                Boolean bool = (Boolean) d7.f13690b.a();
                bool.getClass();
                return bool;
            case 4:
                b7.f13659v.get();
                Boolean bool2 = (Boolean) d7.f13689a.a();
                bool2.getClass();
                return bool2;
            case 5:
                d8.f13692v.get();
                Boolean bool3 = (Boolean) f8.f13755a.a();
                bool3.getClass();
                return bool3;
            case 6:
                e8.f13740v.get();
                Boolean bool4 = (Boolean) g8.f13763a.a();
                bool4.getClass();
                return bool4;
            case 7:
                a8.f13643v.get();
                Boolean bool5 = (Boolean) c8.f13679c.a();
                bool5.getClass();
                return bool5;
            case 8:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.O.a()).longValue());
            case 9:
                a8.f13643v.get();
                Boolean bool6 = (Boolean) c8.f13677a.a();
                bool6.getClass();
                return bool6;
            case 10:
                j7.f13793v.get();
                Boolean bool7 = (Boolean) l7.f13838a.a();
                bool7.getClass();
                return bool7;
            case 11:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.R.a()).longValue());
            case 12:
                v7.f13949v.get();
                Boolean bool8 = (Boolean) x7.f13975b.a();
                bool8.getClass();
                return bool8;
            case 13:
                v7.f13949v.get();
                Boolean bool9 = (Boolean) x7.f13977d.a();
                bool9.getClass();
                return bool9;
            case 14:
                v7.f13949v.get();
                Boolean bool10 = (Boolean) x7.f13974a.a();
                bool10.getClass();
                return bool10;
            case 15:
                u6.f13938v.get();
                Boolean bool11 = (Boolean) w6.f13960b.a();
                bool11.getClass();
                return bool11;
            case 16:
                u6.f13938v.get();
                Boolean bool12 = (Boolean) w6.f13959a.a();
                bool12.getClass();
                return bool12;
            case 17:
                k7.f13828v.get();
                Boolean bool13 = (Boolean) m7.f13847a.a();
                bool13.getClass();
                return bool13;
            default:
                t6.f13928v.get();
                Boolean bool14 = (Boolean) v6.f13948a.a();
                bool14.getClass();
                return bool14;
        }
    }

    public void i(Context context) {
    }

    public void l(Activity activity) {
    }
}
