package com.google.android.gms.internal.ads;
import g9.r;
import k9.a0;
import l9.i;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zj0 implements fi0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13177a;

    /* renamed from: b, reason: collision with root package name */
    public final od0 f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13179c;

    public zj0(od0 od0Var) {
        this.f13177a = 0;
        this.f13179c = new HashMap();
        this.f13178b = od0Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.zr, com.google.android.gms.internal.ads.h70] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ov, com.google.android.gms.internal.ads.h70] */
    @Override // com.google.android.gms.internal.ads.fi0
    public final gi0 a(String str, JSONObject jSONObject) {
        gi0 gi0Var;
        zs b10;
        switch (this.f13177a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap hashMap = (HashMap) this.f13179c;
                        gi0Var = (gi0) hashMap.get(str);
                        if (gi0Var == null) {
                            gi0Var = new gi0(this.f13178b.a(str, jSONObject), new ov(), str);
                            hashMap.put(str, gi0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gi0Var;
            default:
                if (((Boolean) r.e.f17698c.a(sl.f10818l2)).booleanValue()) {
                    try {
                        b10 = this.f13178b.b(str);
                    } catch (RemoteException e) {
                        int i = a0.f19634b;
                        i.d("Coundn't create RTB adapter: ", e);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((mk0) this.f13179c).f8360a;
                    if (concurrentHashMap.containsKey(str)) {
                        b10 = (zs) concurrentHashMap.get(str);
                    }
                    b10 = null;
                }
                if (b10 == null) {
                    return null;
                }
                return new gi0(b10, new zr(), str);
        }
    }

    public zj0(mk0 mk0Var, od0 od0Var) {
        this.f13177a = 1;
        this.f13179c = mk0Var;
        this.f13178b = od0Var;
    }
}
