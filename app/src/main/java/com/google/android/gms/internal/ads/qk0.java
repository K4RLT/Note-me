package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import g9.y1;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qk0 extends ph implements bt {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f9860y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final yx f9861u;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f9862v;

    /* renamed from: w, reason: collision with root package name */
    public final long f9863w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9864x;

    public qk0(String str, zs zsVar, yx yxVar, long j10) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f9862v = jSONObject;
        this.f9864x = false;
        this.f9861u = yxVar;
        this.f9863w = j10;
        try {
            jSONObject.put("adapter_version", zsVar.b().toString());
            jSONObject.put("sdk_version", zsVar.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final synchronized void G(String str) {
        if (this.f9864x) {
            return;
        }
        if (str == null) {
            synchronized (this) {
                v4(2, "Adapter returned null signals");
            }
            return;
        }
        try {
            JSONObject jSONObject = this.f9862v;
            jSONObject.put("signals", str);
            nl nlVar = sl.f10772i2;
            r rVar = r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                k.C.f16819k.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f9863w);
            }
            if (((Boolean) rVar.f17698c.a(sl.f10757h2)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f9861u.b(this.f9862v);
        this.f9864x = true;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
                qh.f(parcel);
                synchronized (this) {
                    v4(2, y1Var.f17715v);
                }
            } else {
                String readString = parcel.readString();
                qh.f(parcel);
                synchronized (this) {
                    v4(2, readString);
                }
            }
        } else {
            String readString2 = parcel.readString();
            qh.f(parcel);
            G(readString2);
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void v4(int i, String str) {
        try {
            if (this.f9864x) {
                return;
            }
            try {
                JSONObject jSONObject = this.f9862v;
                jSONObject.put("signal_error", str);
                nl nlVar = sl.f10772i2;
                r rVar = r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    k.C.f16819k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f9863w);
                }
                if (((Boolean) rVar.f17698c.a(sl.f10757h2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f9861u.b(this.f9862v);
            this.f9864x = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
