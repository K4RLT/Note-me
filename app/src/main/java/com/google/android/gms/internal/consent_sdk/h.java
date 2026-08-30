package com.google.android.gms.internal.consent_sdk;
import c.d;
import d0.a;
import d7.a;
import e7.c;
import e7.e;
import g5.q;
import j.m0;
import q.l;

import android.util.Log;
import android.webkit.WebSettings;
import com.daren.scraply.MainActivity;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13427u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13428v;

    public /* synthetic */ h(int i, Object obj) {
        this.f13427u = i;
        this.f13428v = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z3;
        int i = 4;
        int i10 = 0;
        switch (this.f13427u) {
            case 0:
                ((k) this.f13428v).b(new l1(4, "Web view timed out."));
                return;
            case 1:
                y yVar = (y) this.f13428v;
                AtomicReference atomicReference = yVar.f13615k;
                String str2 = (String) yVar.f13607a.get();
                if (str2 == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                    return;
                }
                int size = ((Queue) atomicReference.get()).size();
                while (i10 < size) {
                    p2 p2Var = (p2) ((Queue) atomicReference.get()).poll();
                    if (p2Var != null) {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str2).toURL().openConnection();
                            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(yVar.f13608b));
                            httpURLConnection.setConnectTimeout(10000);
                            httpURLConnection.setReadTimeout(30000);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            int c10 = p2Var.c();
                            Logger logger = i5.f13440g;
                            if (c10 > 4096) {
                                c10 = 4096;
                            }
                            i5 i5Var = new i5(outputStream, c10);
                            p2Var.a(i5Var);
                            if (i5Var.e > 0) {
                                i5Var.j();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode != 200 && responseCode != 204) {
                                if (httpURLConnection.getErrorStream() != null) {
                                    str = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                                } else {
                                    str = null;
                                }
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + str);
                                ((Queue) atomicReference.get()).add(p2Var);
                            }
                        } catch (IOException e) {
                            Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e.getMessage())));
                            ((Queue) atomicReference.get()).add(p2Var);
                        } catch (URISyntaxException e8) {
                            Log.w("UserMessagingPlatform", "Metrics reporting URL " + str2 + " is not valid: " + e8.getMessage());
                        }
                    }
                    i10++;
                }
                return;
            default:
                e7.c cVar = (e7.c) this.f13428v;
                MainActivity mainActivity = (MainActivity) cVar.f15938v;
                e7.e eVar = new e7.e((kotlin.jvm.internal.u) cVar.f15939w, (d7.a) cVar.f15940x);
                c d2 = c.d(mainActivity);
                w2 w2Var = (w2) ((d7) d2.C).zzb();
                g gVar = w2Var.f13589a;
                if (!gVar.f13407b.getBoolean("is_pub_misconfigured", false)) {
                    synchronized (w2Var.f13591c) {
                        z3 = w2Var.e;
                    }
                    if (z3) {
                        i10 = gVar.f13407b.getInt("consent_status", 0);
                    }
                    if (i10 != 1 && i10 != 3) {
                        ((Queue) ((y) ((d7) d2.B).zzb()).i.get()).add(Long.valueOf(System.currentTimeMillis()));
                        n nVar = (n) ((d7) d2.f13375z).zzb();
                        d0.a();
                        m mVar = new m(mainActivity, eVar);
                        a6 a6Var = new a6(2, eVar);
                        nVar.getClass();
                        d0.a();
                        o oVar = (o) nVar.f13496c.get();
                        if (oVar == null) {
                            a6Var.d(new l1(3, "No available form can be built.").a());
                            return;
                        }
                        b bVar = (b) nVar.f13494a.zzb();
                        bVar.getClass();
                        c cVar2 = bVar.f13361u;
                        d7 a10 = d7.a(new a6(i, (a6) cVar2.f13372w));
                        a6 a6Var2 = new a6(8, oVar);
                        a6 a6Var3 = new a6(7);
                        a6 a6Var4 = (a6) cVar2.f13372w;
                        d7 d7Var = (d7) cVar2.A;
                        f fVar = (f) cVar2.D;
                        d7 d7Var2 = (d7) cVar2.f13373x;
                        d7 a11 = d7.a(new j.m0(a6Var4, (d7) cVar2.f13374y, a10, d7Var2, a6Var2, new m(a10, new g9.n(a6Var4, a10, d7Var, fVar, a6Var3, d7Var2, 1)), (d7) cVar2.B));
                        if (((d7) a6Var3.f13354v) == null) {
                            a6Var3.f13354v = a11;
                            k kVar = (k) a6Var3.zzb();
                            kVar.f13472n = true;
                            kVar.a(mVar, a6Var);
                            return;
                        }
                        g5.q.l();
                        return;
                    }
                }
                eVar.a(null);
                return;
        }
    }
}
