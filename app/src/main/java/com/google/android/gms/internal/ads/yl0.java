package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class yl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12906a;

    /* renamed from: b, reason: collision with root package name */
    public final wx f12907b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12908c;

    public /* synthetic */ yl0(Context context, wx wxVar, int i) {
        this.f12906a = i;
        this.f12908c = context;
        this.f12907b = wxVar;
    }

    public Intent a() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.f10956tc)).booleanValue();
        Context context = this.f12908c;
        if (booleanValue && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
            return registerReceiver;
        }
        return context.registerReceiver(null, intentFilter);
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        switch (this.f12906a) {
            case 0:
                boolean z3 = false;
                Object obj = null;
                if (!((Boolean) g9.r.e.f17698c.a(sl.f11021xe)).booleanValue()) {
                    return ed1.e(new zl0(0, obj, z3));
                }
                ContentResolver contentResolver = this.f12908c.getContentResolver();
                if (contentResolver == null) {
                    return ed1.e(new zl0(0, obj, z3));
                }
                return this.f12907b.j(new qf(10, contentResolver));
            case 1:
                return this.f12907b.j(new qf(13, this));
            case 2:
                return this.f12907b.j(new qf(14, this));
            case 3:
                return this.f12907b.j(new qf(16, this));
            case 4:
                return this.f12907b.j(new qf(17, this));
            case 5:
                return this.f12907b.j(new qf(26, this));
            case 6:
                if (((Boolean) pm.f9546b.p()).booleanValue()) {
                    return this.f12907b.j(new qf(27, this));
                }
                return ed1.e(new rn0(-1, -1));
            default:
                return this.f12907b.j(new qf(29, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f12906a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ yl0(wx wxVar, Context context, int i) {
        this.f12906a = i;
        this.f12907b = wxVar;
        this.f12908c = context;
    }
}
