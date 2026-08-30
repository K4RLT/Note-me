package rd;

import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.f1;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import ib.o;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import wa.h8;

/* loaded from: classes.dex */
public final class f {
    public static final int[] i = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final hd.e f24704a;

    /* renamed from: b, reason: collision with root package name */
    public final gd.b f24705b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f24706c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f24707d;
    public final b e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f24708f;

    /* renamed from: g, reason: collision with root package name */
    public final i f24709g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f24710h;

    public f(hd.e eVar, gd.b bVar, Executor executor, Random random, b bVar2, ConfigFetchHttpClient configFetchHttpClient, i iVar, HashMap hashMap) {
        this.f24704a = eVar;
        this.f24705b = bVar;
        this.f24706c = executor;
        this.f24707d = random;
        this.e = bVar2;
        this.f24708f = configFetchHttpClient;
        this.f24709g = iVar;
        this.f24710h = hashMap;
    }

    public final e a(String str, String str2, Date date, HashMap hashMap) {
        Date date2;
        String str3;
        HttpURLConnection b10;
        ConfigFetchHttpClient configFetchHttpClient;
        HashMap d2;
        Long l10;
        String string;
        try {
            b10 = this.f24708f.b();
            configFetchHttpClient = this.f24708f;
            d2 = d();
            l10 = null;
            string = this.f24709g.f24719a.getString("last_fetch_etag", null);
            fc.b bVar = (fc.b) this.f24705b.get();
            if (bVar != null) {
                l10 = (Long) ((f1) ((fc.c) bVar).f16949a.f31922v).d(null, null, true).get("_fot");
            }
            date2 = date;
        } catch (qd.e e) {
            e = e;
            date2 = date;
        }
        try {
            e fetch = configFetchHttpClient.fetch(b10, str, str2, d2, string, hashMap, l10, date2);
            c cVar = fetch.f24702b;
            if (cVar != null) {
                i iVar = this.f24709g;
                long j10 = cVar.f24694f;
                synchronized (iVar.f24720b) {
                    iVar.f24719a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fetch.f24703c;
            if (str4 != null) {
                i iVar2 = this.f24709g;
                synchronized (iVar2.f24720b) {
                    iVar2.f24719a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f24709g.c(0, i.f24718f);
            return fetch;
        } catch (qd.e e8) {
            e = e8;
            qd.e eVar = e;
            int i10 = eVar.f23988u;
            i iVar3 = this.f24709g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                iVar3.c(iVar3.a().f24716a + 1, new Date(date2.getTime() + (TimeUnit.MINUTES.toMillis(i[Math.min(r13, 8) - 1]) / 2) + this.f24707d.nextInt((int) r2)));
            }
            h a10 = iVar3.a();
            int i11 = eVar.f23988u;
            if (a10.f24716a <= 1 && i11 != 429) {
                if (i11 != 401) {
                    if (i11 != 403) {
                        if (i11 != 429) {
                            if (i11 != 500) {
                                switch (i11) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new bc.i("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new qd.e(eVar.f23988u, "Fetch failed: ".concat(str3), eVar);
            }
            a10.f24717b.getTime();
            throw new bc.i("Fetch was throttled.");
        }
    }

    public final o b(o oVar, long j10, final HashMap hashMap) {
        o h3;
        boolean before;
        final Date date = new Date(System.currentTimeMillis());
        boolean l10 = oVar.l();
        Date date2 = null;
        i iVar = this.f24709g;
        if (l10) {
            Date date3 = new Date(iVar.f24719a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(i.e)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()));
            }
            if (before) {
                return h8.e(new e(2, null, null));
            }
        }
        Date date4 = iVar.a().f24717b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f24706c;
        if (date2 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date2.getTime() - date.getTime()) / 1000);
            date2.getTime();
            h3 = h8.d(new bc.i(str));
        } else {
            hd.d dVar = (hd.d) this.f24704a;
            final o c10 = dVar.c();
            final o d2 = dVar.d();
            h3 = h8.g(c10, d2).h(executor, new ib.a() { // from class: rd.d
                @Override // ib.a
                public final Object g(o oVar2) {
                    f fVar = f.this;
                    Date date5 = date;
                    HashMap hashMap2 = hashMap;
                    o oVar3 = c10;
                    if (!oVar3.l()) {
                        return h8.d(new bc.i("Firebase Installations failed to get installation ID for fetch.", oVar3.i()));
                    }
                    o oVar4 = d2;
                    if (!oVar4.l()) {
                        return h8.d(new bc.i("Firebase Installations failed to get installation auth token for fetch.", oVar4.i()));
                    }
                    try {
                        e a10 = fVar.a((String) oVar3.j(), ((hd.a) oVar4.j()).f18003a, date5, hashMap2);
                        if (a10.f24701a != 0) {
                            return h8.e(a10);
                        }
                        b bVar = fVar.e;
                        c cVar = a10.f24702b;
                        Executor executor2 = bVar.f24686a;
                        return h8.c(new nd.e(bVar, 4, cVar), executor2).n(executor2, new e7.d(bVar, 7, cVar)).n(fVar.f24706c, new b1.h(22, a10));
                    } catch (qd.c e) {
                        return h8.d(e);
                    }
                }
            });
        }
        return h3.h(executor, new e7.d(this, 9, date));
    }

    public final o c(int i10) {
        HashMap hashMap = new HashMap(this.f24710h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.e.b().h(this.f24706c, new e7.d(this, 8, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        fc.b bVar = (fc.b) this.f24705b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((f1) ((fc.c) bVar).f16949a.f31922v).d(null, null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
