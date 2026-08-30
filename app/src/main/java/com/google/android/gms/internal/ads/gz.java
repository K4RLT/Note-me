package com.google.android.gms.internal.ads;
import z5.h;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class gz implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6507u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6508v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6509w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6510x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6511y;

    public /* synthetic */ gz(x00 x00Var, View view, mw mwVar, int i) {
        this.f6509w = x00Var;
        this.f6510x = view;
        this.f6511y = mwVar;
        this.f6508v = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6507u) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f6509w);
                hashMap.put("cachedSrc", (String) this.f6510x);
                hashMap.put("totalBytes", Integer.toString(this.f6508v));
                ((jz) this.f6511y).n(hashMap);
                return;
            case 1:
                ((x00) this.f6509w).r((View) this.f6510x, (mw) this.f6511y, this.f6508v - 1);
                return;
            default:
                s21 s21Var = (s21) this.f6509w;
                q21 q21Var = (q21) this.f6510x;
                int i = this.f6508v;
                z5.h hVar = (z5.h) this.f6511y;
                String str = s21Var.f10470b;
                try {
                    bj0 bj0Var = s21Var.f10469a;
                    if (bj0Var != null) {
                        l21 l21Var = (l21) bj0Var.D;
                        if (l21Var != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("callerPackage", str);
                            bundle.putInt("displayMode", i);
                            String str2 = q21Var.f9720a;
                            if (!s21.b(str2)) {
                                str2.getClass();
                                bundle.putString("sessionToken", str2.trim());
                            }
                            String str3 = q21Var.f9721b;
                            if (!s21.b(str3)) {
                                str3.getClass();
                                bundle.putString("appId", str3.trim());
                            }
                            r21 r21Var = new r21(s21Var, hVar);
                            j21 j21Var = (j21) l21Var;
                            Parcel g22 = j21Var.g2();
                            qh.c(g22, bundle);
                            qh.e(g22, r21Var);
                            j21Var.o3(g22, 3);
                            return;
                        }
                        return;
                    }
                    throw null;
                } catch (RemoteException e) {
                    s21.f10467c.e(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ gz(s21 s21Var, q21 q21Var, int i, z5.h hVar) {
        this.f6509w = s21Var;
        this.f6510x = q21Var;
        this.f6508v = i;
        this.f6511y = hVar;
    }

    public gz(jz jzVar, String str, String str2, int i) {
        this.f6509w = str;
        this.f6510x = str2;
        this.f6508v = i;
        this.f6511y = jzVar;
    }
}
