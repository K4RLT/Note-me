package com.google.android.gms.internal.ads;
import b.a;
import ca.f;
import f.a;
import fa.y;
import l9.a;
import na.b;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class mw {

    /* renamed from: l, reason: collision with root package name */
    public static final List f8437l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final pp1 f8438a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8439b;
    public final Context e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8442f;

    /* renamed from: g, reason: collision with root package name */
    public final nw f8443g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8440c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8441d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f8444h = new Object();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f8445j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8446k = false;

    public mw(Context context, l9.a aVar, nw nwVar, String str) {
        fa.y.i(nwVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8439b = new LinkedHashMap();
        this.f8443g = nwVar;
        Iterator it = nwVar.f8882y.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        pp1 C = qq1.C();
        C.b();
        ((qq1) C.f4845v).N(9);
        if (str != null) {
            C.b();
            ((qq1) C.f4845v).D(str);
            C.b();
            ((qq1) C.f4845v).E(str);
        }
        qp1 z3 = rp1.z();
        String str2 = this.f8443g.f8878u;
        if (str2 != null) {
            z3.b();
            ((rp1) z3.f4845v).A(str2);
        }
        rp1 rp1Var = (rp1) z3.c();
        C.b();
        ((qq1) C.f4845v).F(rp1Var);
        kq1 z9 = lq1.z();
        boolean d2 = na.b.a(this.e).d();
        z9.b();
        ((lq1) z9.f4845v).C(d2);
        String str3 = aVar.f20029u;
        if (str3 != null) {
            z9.b();
            ((lq1) z9.f4845v).A(str3);
        }
        ca.f fVar = ca.f.f4036b;
        Context context2 = this.e;
        fVar.getClass();
        long a10 = ca.f.a(context2);
        if (a10 > 0) {
            z9.b();
            ((lq1) z9.f4845v).B(a10);
        }
        lq1 lq1Var = (lq1) z9.c();
        C.b();
        ((qq1) C.f4845v).K(lq1Var);
        this.f8438a = C;
    }

    public final void a(String str) {
        synchronized (this.f8444h) {
            pp1 pp1Var = this.f8438a;
            if (str == null) {
                pp1Var.b();
                ((qq1) pp1Var.f4845v).I();
            } else {
                pp1Var.b();
                ((qq1) pp1Var.f4845v).H(str);
            }
        }
    }

    public final void b(String str, Map map, int i) {
        String str2;
        String str3;
        mm1 mm1Var;
        mm1 mm1Var2;
        synchronized (this.f8444h) {
            int i10 = 1;
            if (i == 3) {
                try {
                    this.f8446k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f8439b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    hq1 hq1Var = (hq1) linkedHashMap.get(str);
                    hq1Var.b();
                    ((jq1) hq1Var.f4845v).G(4);
                }
                return;
            }
            hq1 B = jq1.B();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            i10 = 0;
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
            }
            if (i10 != 0) {
                B.b();
                ((jq1) B.f4845v).G(i10);
            }
            int size = linkedHashMap.size();
            B.b();
            ((jq1) B.f4845v).C(size);
            B.b();
            ((jq1) B.f4845v).D(str);
            xp1 z3 = zp1.z();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        vp1 z9 = wp1.z();
                        if (str2.isEmpty()) {
                            mm1Var = om1.f9167v;
                        } else {
                            mm1Var = new mm1(str2.getBytes(StandardCharsets.UTF_8));
                        }
                        z9.b();
                        ((wp1) z9.f4845v).A(mm1Var);
                        if (str3.isEmpty()) {
                            mm1Var2 = om1.f9167v;
                        } else {
                            mm1Var2 = new mm1(str3.getBytes(StandardCharsets.UTF_8));
                        }
                        z9.b();
                        ((wp1) z9.f4845v).B(mm1Var2);
                        wp1 wp1Var = (wp1) z9.c();
                        z3.b();
                        ((zp1) z3.f4845v).A(wp1Var);
                    }
                }
            }
            zp1 zp1Var = (zp1) z3.c();
            B.b();
            ((jq1) B.f4845v).E(zp1Var);
            linkedHashMap.put(str, B);
        }
    }
}
