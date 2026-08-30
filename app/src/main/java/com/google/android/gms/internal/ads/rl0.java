package com.google.android.gms.internal.ads;
import f9.k;
import na.b;
import r.e;
import a0.k;
import ac.b;
import b.a;
import g9.r;
import h8.e;
import k9.a0;
import k9.b0;
import k9.f0;
import wa.h8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10233a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10234b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10235c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10236d;

    public rl0(px pxVar, ScheduledExecutorService scheduledExecutorService, wx wxVar) {
        this.f10233a = 4;
        this.f10234b = pxVar;
        this.f10236d = scheduledExecutorService;
        this.f10235c = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        Integer valueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        int i = this.f10233a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str6 = null;
        Object obj = this.f10234b;
        Object obj2 = this.f10236d;
        Object obj3 = this.f10235c;
        switch (i) {
            case 0:
                Executor executor = (Executor) obj3;
                ac.b c02 = ed1.c0((ac.b) obj, x20.i, executor);
                if (((Integer) g9.r.e.f17698c.a(sl.Vd)).intValue() > 0) {
                    c02 = ed1.Y(c02, ((Integer) r3.f17698c.a(r2)).intValue(), timeUnit, (ScheduledExecutorService) obj2);
                }
                return ed1.U(c02, Throwable.class, x20.f12434h, executor);
            case 1:
                return ((wx) obj).j(new qf(11, this));
            case 2:
                Context context = (Context) obj2;
                String str7 = ((ApplicationInfo) obj).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                if (packageInfo == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(packageInfo.versionCode);
                }
                if (packageInfo == null) {
                    str = null;
                } else {
                    str = packageInfo.versionName;
                }
                try {
                    k9.b0 b0Var = k9.f0.f19676l;
                    Context context2 = na.b.a(context).f3851u;
                    str2 = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str7, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    str2 = null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10814ke)).booleanValue()) {
                        try {
                            installSourceInfo = context.getPackageManager().getInstallSourceInfo(str7);
                        } catch (PackageManager.NameNotFoundException e) {
                            e = e;
                            str5 = null;
                        }
                        if (installSourceInfo != null) {
                            str5 = installSourceInfo.getInstallingPackageName();
                            try {
                                if (TextUtils.isEmpty(str5)) {
                                    k9.a0.k("No installing package name found");
                                    str5 = null;
                                }
                                initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                try {
                                } catch (PackageManager.NameNotFoundException e8) {
                                    e = e8;
                                    str6 = initiatingPackageName;
                                    f9.k.C.f16817h.d("PackageInfoSignalSource.getInstallSourceInfo", e);
                                    str3 = str5;
                                    str4 = str6;
                                    return ed1.e(new en0(str7, valueOf, str, str2, str3, str4));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                            }
                            if (TextUtils.isEmpty(initiatingPackageName)) {
                                k9.a0.k("No initiating package name found");
                                str3 = str5;
                                str4 = str6;
                                return ed1.e(new en0(str7, valueOf, str, str2, str3, str4));
                            }
                            str3 = str5;
                            str4 = initiatingPackageName;
                            return ed1.e(new en0(str7, valueOf, str, str2, str3, str4));
                        }
                    }
                }
                str3 = null;
                str4 = null;
                return ed1.e(new en0(str7, valueOf, str, str2, str3, str4));
            case 3:
                return ((wx) obj3).j(new qf(24, this));
            default:
                nl nlVar = sl.N3;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    if (((Boolean) rVar.f17698c.a(sl.S3)).booleanValue()) {
                        wx wxVar = (wx) obj3;
                        ac.b c03 = ed1.c0(xy.q(wa.h8.e(null)), x20.f12437l, wxVar);
                        if (((Boolean) lm.f8061a.p()).booleanValue()) {
                            c03 = ed1.Y(c03, ((Long) lm.f8062b.p()).longValue(), timeUnit, (ScheduledExecutorService) obj2);
                        }
                        return ed1.S(c03, Exception.class, new cv(5, this), wxVar);
                    }
                }
                return ed1.e(new dm0(str6, -1, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f10233a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            default:
                return 43;
        }
    }

    public /* synthetic */ rl0(int i, Object obj, Object obj2, Object obj3) {
        this.f10233a = i;
        this.f10234b = obj;
        this.f10235c = obj2;
        this.f10236d = obj3;
    }
}
