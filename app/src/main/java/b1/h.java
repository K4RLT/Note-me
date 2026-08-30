package b1;
import f.b;
import j.i0;
import l.a;
import m.d;
import q.x;
import u.a;
import v.c;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b8.b7;
import com.daren.scraply.MainActivity;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.is0;
import com.google.android.gms.internal.ads.iw0;
import com.google.android.gms.internal.ads.r7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r0.a1;
import wa.h8;
import ya.hb;
import ya.o9;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements q5.a, b, n3.d, z8.n, z8.o, ib.e, ic.d, gd.a, ib.c, ib.a, ib.d, ib.g, v8.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1343u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1344v;

    public /* synthetic */ h(fw fwVar) {
        this.f1343u = 4;
        e7.o oVar = e7.o.f15975a;
        this.f1344v = fwVar;
    }

    @Override // b
    public void a(Object obj) {
        ((df.l) ((a1) this.f1344v).getValue()).invoke(obj);
    }

    @Override // n3.d
    public boolean b() {
        return !((MainActivity) this.f1344v).O;
    }

    @Override // q5.a
    public q5.b c(is0 is0Var) {
        Context context = (Context) this.f1344v;
        String str = (String) is0Var.f7207x;
        iw0 iw0Var = (iw0) is0Var.f7208y;
        iw0Var.getClass();
        if (str != null && str.length() != 0) {
            return new r5.h(context, str, iw0Var, true, true);
        }
        x.n("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // ib.e
    public void d(Object obj) {
        switch (this.f1343u) {
            case 6:
                ((f8.a) this.f1344v).invoke(obj);
                return;
            case 7:
                ((f8.a) this.f1344v).invoke(obj);
                return;
            case 8:
                ((b7) this.f1344v).invoke(obj);
                return;
            case 9:
                ((b8.w) this.f1344v).invoke(obj);
                return;
            case 18:
                ((a1.f) this.f1344v).invoke(obj);
                return;
            default:
                ((a1.f) this.f1344v).invoke(obj);
                return;
        }
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        return this.f1344v;
    }

    @Override // v8.b
    public Object execute() {
        switch (this.f1343u) {
            case 23:
                u8.f fVar = (u8.f) ((com.google.android.gms.internal.consent_sdk.c) this.f1344v).D;
                SQLiteDatabase f10 = fVar.f();
                f10.beginTransaction();
                try {
                    f10.compileStatement("DELETE FROM log_event_dropped").execute();
                    f10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + fVar.f27123v.e()).execute();
                    f10.setTransactionSuccessful();
                    f10.endTransaction();
                    return null;
                } catch (Throwable th) {
                    f10.endTransaction();
                    throw th;
                }
            default:
                nd.o oVar = (nd.o) this.f1344v;
                Iterator it = ((Iterable) ((u8.f) oVar.f21272v).k(new x(23))).iterator();
                while (it.hasNext()) {
                    ((i0) oVar.f21273w).C((n8.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        switch (this.f1343u) {
            case 14:
                nd.c((Intent) this.f1344v);
                return;
            case 15:
                ((nd.x) this.f1344v).f21305b.d(null);
                return;
            default:
                ((ScheduledFuture) this.f1344v).cancel(false);
                return;
        }
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        ((CountDownLatch) this.f1344v).countDown();
        return null;
    }

    @Override // z8.o
    public void h(fp fpVar) {
        ((kotlin.jvm.internal.u) this.f1344v).f19783u = true;
    }

    @Override // gd.a
    public void i(gd.b bVar) {
        switch (this.f1343u) {
            case 12:
                lc.b bVar2 = (lc.b) this.f1344v;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar2.f20325b.set((lc.b) bVar.get());
                return;
            default:
                lc.c cVar = (lc.c) this.f1344v;
                j6.n nVar = ((qd.h) ((td.a) bVar.get())).a().i;
                ((Set) nVar.f18941y).add(cVar);
                ib.o b10 = ((rd.b) nVar.f18938v).b();
                b10.f((Executor) nVar.f18940x, new e7.c(5, nVar, b10, cVar));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    public r7 j(i0 i0Var) {
        InputStream inputStream;
        l8.b bVar = (l8.b) this.f1344v;
        URL url = (URL) i0Var.f18636v;
        String c10 = hb.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f20028g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) i0Var.f18638x;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    z5.h hVar = bVar.f20023a;
                    m8.m mVar = (m8.m) i0Var.f18637w;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    bd.d dVar = (bd.d) hVar.f31922v;
                    bd.e eVar = new bd.e(bufferedWriter, dVar.f3201u, dVar.f3202v, dVar.f3203w, dVar.f3204x);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.f3206b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = hb.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    hb.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    hb.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new r7(responseCode, (URL) null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                r7 r7Var = new r7(responseCode, (URL) null, m8.a(new BufferedReader(new InputStreamReader(inputStream))).f20753a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return r7Var;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new r7(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e) {
            e = e;
            hb.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new r7(500, (URL) null, 0L);
        } catch (UnknownHostException e8) {
            e = e8;
            hb.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new r7(500, (URL) null, 0L);
        } catch (IOException e10) {
            e = e10;
            hb.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new r7(400, (URL) null, 0L);
        } catch (zc.b e11) {
            e = e11;
            hb.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new r7(400, (URL) null, 0L);
        }
    }

    public void k() {
        df.p pVar = (df.p) this.f1344v;
        synchronized (p.f1387c) {
            Iterable iterable = (Iterable) p.f1391h;
            iterable.getClass();
            ArrayList arrayList = new ArrayList(qe.d(iterable, 10));
            boolean z3 = false;
            for (Object obj : iterable) {
                boolean z9 = true;
                if (!z3 && kotlin.jvm.internal.a(obj, pVar)) {
                    z3 = true;
                    z9 = false;
                }
                if (z9) {
                    arrayList.add(obj);
                }
            }
            p.f1391h = arrayList;
        }
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        return h8.e((rd.e) this.f1344v);
    }

    @Override // ib.d
    public void w(Exception exc) {
        switch (this.f1343u) {
            case 19:
                ((p7.g) this.f1344v).invoke(null);
                return;
            default:
                a1.g gVar = (a1.g) this.f1344v;
                o9.f31413c = false;
                gVar.invoke(Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ h(int i, Object obj) {
        this.f1343u = i;
        this.f1344v = obj;
    }
}
