package com.google.android.gms.internal.ads;
import oa.b;
import pa.d;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class dw0 {

    /* renamed from: a, reason: collision with root package name */
    public final fw0 f5541a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5542b = true;

    public dw0(fw0 fw0Var) {
        this.f5541a = fw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.fw0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static dw0 a(Context context, String str) {
        Object ohVar;
        try {
            try {
                try {
                    IBinder b10 = d.c(context, d.f22621b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b10 == null) {
                        ohVar = 0;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof fw0) {
                            ohVar = (fw0) queryLocalInterface;
                        } else {
                            ohVar = new oh(b10, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 0);
                        }
                    }
                    ohVar.P3(new b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new dw0(ohVar);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (Exception e8) {
                throw new Exception(e8);
            }
        } catch (RemoteException | ov0 | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new dw0(new gw0());
        }
    }
}