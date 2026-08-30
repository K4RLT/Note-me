package e7;
import r.a;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import b8.y5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import wa.h8;
import ya.hb;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements ib.g, ib.a, v8.b, ib.e, u8.d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15937u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15938v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15939w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f15940x;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f15937u = i;
        this.f15938v = obj;
        this.f15939w = obj2;
        this.f15940x = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[SYNTHETIC] */
    @Override // u8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.apply(java.lang.Object):java.lang.Object");
    }

    @Override // ib.e
    public void d(Object obj) {
        j6.n nVar = (j6.n) this.f15938v;
        ib.o oVar = (ib.o) this.f15939w;
        lc.c cVar = (lc.c) this.f15940x;
        try {
            rd.c cVar2 = (rd.c) oVar.j();
            if (cVar2 != null) {
                ((Executor) nVar.f18940x).execute(new sd.a(cVar, ((gw) nVar.f18939w).i(cVar2), 0));
            }
        } catch (qd.c e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    @Override // v8.b
    public Object execute() {
        s8.a aVar = (s8.a) this.f15938v;
        n8.i iVar = (n8.i) this.f15939w;
        n8.h hVar = (n8.h) this.f15940x;
        u8.f fVar = aVar.f25035d;
        fVar.getClass();
        k8.d dVar = iVar.f21183c;
        String str = hVar.f21173a;
        String str2 = iVar.f21181a;
        String c10 = hb.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) fVar.k(new c(6, fVar, hVar, iVar))).getClass();
        aVar.f25032a.C(iVar, 1, false);
        return null;
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        rd.c cVar;
        URL url;
        switch (this.f15937u) {
            case 2:
                qd.a aVar = (qd.a) this.f15938v;
                ib.o oVar2 = (ib.o) this.f15939w;
                ib.o oVar3 = (ib.o) this.f15940x;
                if (oVar2.l() && oVar2.j() != null) {
                    rd.c cVar2 = (rd.c) oVar2.j();
                    if (oVar3.l() && (cVar = (rd.c) oVar3.j()) != null && cVar2.f24692c.equals(cVar.f24692c)) {
                        return h8.e(Boolean.FALSE);
                    }
                    rd.b bVar = aVar.f23984d;
                    Executor executor = bVar.f24686a;
                    return h8.c(new nd.e(bVar, 4, cVar2), executor).n(executor, new d(bVar, 7, cVar2)).g(aVar.f23982b, new y5(aVar));
                }
                return h8.e(Boolean.FALSE);
            default:
                rd.k kVar = (rd.k) this.f15938v;
                ib.o oVar4 = (ib.o) this.f15939w;
                ib.o oVar5 = (ib.o) this.f15940x;
                if (!oVar4.l()) {
                    return h8.d(new bc.i("Firebase Installations failed to get installation auth token for config update listener connection.", oVar4.i()));
                }
                if (!oVar5.l()) {
                    return h8.d(new bc.i("Firebase Installations failed to get installation ID for config update listener connection.", oVar5.i()));
                }
                try {
                    try {
                        url = new URL(kVar.c(kVar.f24735l));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    kVar.i(httpURLConnection, (String) oVar5.j(), ((hd.a) oVar4.j()).f18003a);
                    return h8.e(httpURLConnection);
                } catch (IOException e) {
                    return h8.d(new bc.i("Failed to open HTTP stream connection", e));
                }
        }
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        String d2;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f15938v;
        String str = (String) this.f15939w;
        com.google.android.gms.internal.mlkit_vision_digital_ink.r rVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.r) this.f15940x;
        String str2 = (String) obj;
        k6.i c10 = FirebaseMessaging.c(firebaseMessaging.f15599b);
        bc.g gVar = firebaseMessaging.f15598a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f3178b)) {
            d2 = "";
        } else {
            d2 = gVar.d();
        }
        String g8 = firebaseMessaging.i.g();
        synchronized (c10) {
            String a10 = com.google.android.gms.internal.mlkit_vision_digital_ink.a(System.currentTimeMillis(), str2, g8);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f19569v).edit();
                edit.putString(d2 + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (rVar == null || !str2.equals(rVar.f14879a)) {
            bc.g gVar2 = firebaseMessaging.f15598a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f3178b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f3178b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new nd.g(firebaseMessaging.f15599b).b(intent);
            }
        }
        return h8.e(str2);
    }
}
