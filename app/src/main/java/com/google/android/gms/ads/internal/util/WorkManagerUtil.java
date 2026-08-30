package com.google.android.gms.ads.internal.util;

import a6.d;
import a6.g;
import android.content.Context;
import android.os.Parcel;
import b6.r;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;
import j6.p;
import java.util.HashMap;
import java.util.LinkedHashSet;
import k6.c;
import k9.t;
import l9.i;
import oa.a;
import oa.b;
import qe.l;
import ra.e;

/* loaded from: classes.dex */
public class WorkManagerUtil extends ph implements t {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                a v12 = b.v1(parcel.readStrongBinder());
                i9.a aVar = (i9.a) qh.b(parcel, i9.a.CREATOR);
                qh.f(parcel);
                boolean zzg = zzg(v12, aVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzg ? 1 : 0);
                return true;
            }
            a v13 = b.v1(parcel.readStrongBinder());
            qh.f(parcel);
            zzf(v13);
            parcel2.writeNoException();
            return true;
        }
        a v14 = b.v1(parcel.readStrongBinder());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        qh.f(parcel);
        boolean zze = zze(v14, readString, readString2);
        parcel2.writeNoException();
        parcel2.writeInt(zze ? 1 : 0);
        return true;
    }

    @Override // k9.t
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new i9.a(str, str2, ""));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [a6.r, java.lang.Object] */
    @Override // k9.t
    public final void zzf(a aVar) {
        Context context = (Context) b.z1(aVar);
        try {
            r.c(context.getApplicationContext(), new a6.a(new Object()));
        } catch (IllegalStateException unused) {
        }
        try {
            r b10 = r.b(context);
            b10.f1775d.a(new c(b10));
            d dVar = new d(2, false, false, false, false, -1L, -1L, l.U(new LinkedHashSet()));
            e eVar = new e(OfflinePingSender.class);
            ((p) eVar.f24676w).f18951j = dVar;
            ((LinkedHashSet) eVar.f24677x).add("offline_ping_sender_work");
            b10.a(eVar.m());
        } catch (IllegalStateException e) {
            i.g("Failed to instantiate WorkManager.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a6.r, java.lang.Object] */
    @Override // k9.t
    public final boolean zzg(a aVar, i9.a aVar2) {
        Context context = (Context) b.z1(aVar);
        try {
            r.c(context.getApplicationContext(), new a6.a(new Object()));
        } catch (IllegalStateException unused) {
        }
        d dVar = new d(2, false, false, false, false, -1L, -1L, l.U(new LinkedHashSet()));
        HashMap hashMap = new HashMap();
        hashMap.put("uri", aVar2.f18354u);
        hashMap.put("gws_query_id", aVar2.f18355v);
        hashMap.put("image_url", aVar2.f18356w);
        g gVar = new g(hashMap);
        g.c(gVar);
        e eVar = new e(OfflineNotificationPoster.class);
        p pVar = (p) eVar.f24676w;
        pVar.f18951j = dVar;
        pVar.e = gVar;
        ((LinkedHashSet) eVar.f24677x).add("offline_notification_work");
        try {
            r.b(context).a(eVar.m());
            return true;
        } catch (IllegalStateException e) {
            i.g("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
