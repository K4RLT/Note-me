package com.google.android.gms.internal.ads;
import a0.k;
import a0.l;
import ac.b;
import c0.z;
import f9.k;
import g9.d3;
import g9.r;
import g9.y1;
import g9.z1;
import i0.m;
import j6.s;
import k9.a0;
import k9.f0;
import l9.i;
import l9.l;
import oa.b;
import r.e;
import r9.a;
import r9.b;
import r9.c;
import r9.d;
import s9.m;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hx0 implements qa, b10, zx, s81, dr0, n80, xg0, y40, a10, i81, el0 {

    /* renamed from: w, reason: collision with root package name */
    public static hx0 f6912w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6913u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f6914v;

    public hx0(ko koVar) {
        Context context;
        this.f6913u = 6;
        this.f6914v = koVar;
        try {
            context = (Context) oa.b.z1(koVar.b0());
        } catch (RemoteException | NullPointerException e) {
            l9.i.d("", e);
            context = null;
        }
        if (context != null) {
            try {
                ((ko) this.f6914v).h2(new oa.b(new FrameLayout(context)));
            } catch (RemoteException e8) {
                l9.i.d("", e8);
            }
        }
    }

    public static final hx0 d(Context context) {
        hx0 hx0Var;
        synchronized (hx0.class) {
            try {
                if (f6912w == null) {
                    f6912w = new hx0(context);
                }
                hx0Var = f6912w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hx0Var;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public /* synthetic */ ac.b a(dv dvVar) {
        return ((eh0) ((pr1) ((zd1) this.f6914v).f13144x).zzb()).w4(dvVar, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.internal.ads.qa
    public void b(MessageDigest[] messageDigestArr, long j10, int i) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f6914v;
        synchronized (byteBuffer) {
            int i10 = (int) j10;
            byteBuffer.position(i10);
            byteBuffer.limit(i10 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.m8 c(com.google.android.gms.internal.ads.o2 r18, com.google.android.gms.internal.ads.s6 r19, int r20) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hx0.c(com.google.android.gms.internal.ads.o2, com.google.android.gms.internal.ads.s6, int):com.google.android.gms.internal.ads.m8");
    }

    @Override // com.google.android.gms.internal.ads.el0
    public void e(z40 z40Var) {
        op0 op0Var = (op0) this.f6914v;
        yc0 yc0Var = (yc0) z40Var;
        synchronized (op0Var) {
            try {
                op0Var.f9192x = yc0Var;
                if (((Boolean) g9.r.e.f17698c.a(sl.f10949t4)).booleanValue()) {
                    yc0Var.f12850u.f12926a = op0Var.f9191w;
                }
                op0Var.f9192x.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [c0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lw, java.lang.Object] */
    public zw1[] f(Handler handler, rs1 rs1Var, rs1 rs1Var2) {
        boolean z3;
        boolean z9;
        boolean z10;
        vu1 vu1Var;
        wz wzVar = (wz) this.f6914v;
        bx1 bx1Var = bx1.f4903u;
        Context context = wzVar.f12372u;
        yv1 yv1Var = new yv1(context);
        b80.K(!yv1Var.f12981c);
        yv1Var.f12981c = true;
        if (yv1Var.f12983f == null) {
            yv1Var.f12983f = new hq0(new t10[0]);
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = yv1Var.e;
        x90 x90Var = yv1Var.f12984g;
        if (lwVar == null) {
            if (x90Var == null) {
                yv1Var.f12984g = new x90(context, 11);
            }
            if (yv1Var.f12982d == null) {
                yv1Var.f12982d = s6.D;
            }
            zd1 zd1Var = new zd1(context);
            bl0 bl0Var = null;
            if (context != null) {
                vu1Var = null;
            } else {
                vu1Var = yv1Var.f12980b;
            }
            Context context2 = (Context) zd1Var.f13142v;
            if (context2 == null) {
                zd1Var.f13143w = vu1Var;
            }
            x90 x90Var2 = yv1Var.f12984g;
            zd1Var.f13144x = x90Var2;
            if (x90Var2 == null) {
                zd1Var.f13144x = new x90(context2, 11);
            }
            Object obj = new Object();
            Context context3 = (Context) zd1Var.f13142v;
            obj.f14643u = context3;
            x90 x90Var3 = (x90) zd1Var.f13144x;
            x90Var3.getClass();
            obj.C = x90Var3;
            obj.f14647y = (vu1) zd1Var.f13143w;
            if (context3 != null) {
                bl0Var = new bl0(17, obj);
            }
            obj.f14644v = bl0Var;
            obj.f14646x = s6.f10534z;
            yv1Var.e = obj;
        } else {
            if (x90Var == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
            if (yv1Var.f12982d == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            b80.K(z9);
        }
        int i = 4;
        ew1 ew1Var = new ew1(context, new rl(context, i), handler, rs1Var2, new cw1(yv1Var));
        Object obj2 = new Object();
        obj2.f3437v = context;
        obj2.f3438w = bx1.f4903u;
        obj2.f3439x = new rl(context, i);
        obj2.f3438w = bx1Var;
        obj2.f3440y = handler;
        obj2.f3441z = rs1Var;
        b80.K(!obj2.f3436u);
        Handler handler2 = (Handler) obj2.f3440y;
        if ((handler2 == null && ((rs1) obj2.f3441z) == null) || (handler2 != null && ((rs1) obj2.f3441z) != null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        b80.K(z10);
        obj2.f3436u = true;
        return new zw1[]{ew1Var, new y0(obj2)};
    }

    @Override // com.google.android.gms.internal.ads.a10
    public /* synthetic */ void h(String str, int i, String str2, boolean z3) {
        h00 h00Var = (h00) this.f6914v;
        h00Var.l1();
        h00Var.j0().D();
    }

    public void k(boolean z3) {
        synchronized (hx0.class) {
            try {
                j6.s sVar = (j6.s) this.f6914v;
                sVar.j(Boolean.valueOf(z3), "paidv2_publisher_option");
                if (!z3) {
                    sVar.p("paidv2_creation_time");
                    sVar.p("paidv2_id");
                    sVar.p("vendor_scoped_gpid_v2_id");
                    sVar.p("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.google.android.gms.internal.ads.qw] */
    @Override // com.google.android.gms.internal.ads.dr0
    public Object l(Object obj) {
        com.google.android.gms.internal.ads.qw r62;
        r9.a aVar;
        r9.c cVar;
        r9.b bVar;
        switch (this.f6913u) {
            case 12:
                wp0 wp0Var = (wp0) obj;
                i0.m mVar = ((i50) this.f6914v).f6991d;
                ArrayList arrayList = (ArrayList) wp0Var.f12313b.f11472x;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    vp0 vp0Var = (vp0) obj2;
                    Map map = (Map) mVar.f18055w;
                    String str = vp0Var.f11966a;
                    JSONObject jSONObject = vp0Var.f11967b;
                    if (map.containsKey(str) && jSONObject != null) {
                        a30 a30Var = (a30) map.get(str);
                        switch (a30Var.f4330a) {
                            case 0:
                                if (((Boolean) g9.r.e.f17698c.a(sl.Aa)).booleanValue()) {
                                    nf0 nf0Var = (nf0) a30Var.f4331b;
                                    synchronized (nf0Var) {
                                        nf0Var.f8701p = jSONObject;
                                    }
                                    break;
                                } else {
                                    continue;
                                }
                            case 1:
                                if (jSONObject.has("AvailableMemoryTier")) {
                                    int optInt = jSONObject.optInt("AvailableMemoryTier", -1);
                                    r9.b[] values = r9.b.values();
                                    int length = values.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length) {
                                            bVar = values[i10];
                                            if (bVar.f24663u != optInt) {
                                                i10++;
                                            }
                                        } else {
                                            bVar = null;
                                        }
                                    }
                                    if (bVar != null) {
                                        ((r9.d) a30Var.f4331b).f24670d.set(bVar);
                                    }
                                }
                                if (jSONObject.has("AvailableProcessorTier")) {
                                    int optInt2 = jSONObject.optInt("AvailableProcessorTier", -1);
                                    r9.c[] values2 = r9.c.values();
                                    int length2 = values2.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            cVar = values2[i11];
                                            if (cVar.f24666u != optInt2) {
                                                i11++;
                                            }
                                        } else {
                                            cVar = null;
                                        }
                                    }
                                    if (cVar != null) {
                                        ((r9.d) a30Var.f4331b).e.set(cVar);
                                    }
                                }
                                if (jSONObject.has("AdvertisedMemoryTier")) {
                                    int optInt3 = jSONObject.optInt("AdvertisedMemoryTier", -1);
                                    r9.a[] values3 = r9.a.values();
                                    int length3 = values3.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length3) {
                                            r9.a aVar2 = values3[i12];
                                            if (aVar2.f24660u == optInt3) {
                                                aVar = aVar2;
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            aVar = null;
                                        }
                                    }
                                    if (aVar != null) {
                                        r9.d dVar = (r9.d) a30Var.f4331b;
                                        synchronized (dVar) {
                                            dVar.f24669c.set(aVar);
                                            dVar.f24667a.getSharedPreferences("admob", 0).edit().putInt("advertised_memory_tier", aVar.f24660u).apply();
                                        }
                                        break;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            default:
                                long optLong = jSONObject.optLong("timestamp");
                                if (jSONObject.optBoolean("npa_reset")) {
                                    r62 = -1;
                                } else {
                                    r62 = jSONObject.optBoolean("npa");
                                }
                                ((qw) ((x90) a30Var.f4331b).f12503w).a(r62, optLong);
                                break;
                        }
                    } else {
                        Map map2 = (Map) mVar.f18054v;
                        if (map2.containsKey(str) && jSONObject != null) {
                            u20 u20Var = (u20) map2.get(str);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            u20Var.a(hashMap);
                        }
                    }
                }
                return wp0Var;
            default:
                rh0.k((SQLiteDatabase) obj, (l9.l) this.f6914v);
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f6913u) {
            case 11:
                n30 n30Var = (n30) this.f6914v;
                ws0 ws0Var = n30Var.A;
                wp0 wp0Var = n30Var.f8536y;
                qp0 qp0Var = n30Var.f8537z;
                ArrayList b10 = ws0Var.b(wp0Var, qp0Var, false, "", (String) obj, qp0Var.f9928c, null, null);
                int i = 1;
                if (true == f9.k.C.f16817h.i(n30Var.f8532u)) {
                    i = 2;
                }
                n30Var.B.b(i, b10);
                return;
            case 19:
                ((gf0) obj).G = true;
                ((wf0) this.f6914v).f12229x.b();
                return;
            default:
                wp0 wp0Var2 = (wp0) obj;
                if (((Boolean) g9.r.e.f17698c.a(sl.O2)).booleanValue()) {
                    ((kg0) this.f6914v).f7746k.S(wp0Var2);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        int i = this.f6913u;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.n81, ac.b, com.google.android.gms.internal.ads.e81] */
    @Override // com.google.android.gms.internal.ads.i81
    /* renamed from: zza, reason: collision with other method in class */
    public ac.b mo207zza() {
        Bundle bundle;
        String str;
        HashMap hashMap;
        Bundle bundle2;
        d61 a10;
        Bundle bundle3;
        kn0 kn0Var = (kn0) this.f6914v;
        nl nlVar = sl.f10877oc;
        g9.r rVar = g9.r.e;
        boolean booleanValue = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
        String str2 = kn0Var.e.f4583g;
        if (booleanValue) {
            str2 = str2.toLowerCase(Locale.ROOT);
        }
        if (((Boolean) rVar.f17698c.a(sl.f10805k2)).booleanValue()) {
            cf0 cf0Var = kn0Var.f7820h;
            synchronized (cf0Var) {
                bundle = new Bundle(cf0Var.f5083u);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle4 = bundle;
        if (((Boolean) rVar.f17698c.a(sl.f10680c5)).booleanValue()) {
            mx n10 = f9.k.C.f16817h.g().n();
            if (!TextUtils.isEmpty(n10.e) && n10.f8476g != null) {
                if (n10.b()) {
                    str = "VALID";
                } else {
                    str = "INVALID";
                }
            } else {
                str = "EMPTY";
            }
        } else {
            str = "";
        }
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = kn0Var.e.f4598w;
        if (jSONArray != null) {
            HashMap hashMap2 = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String str4 = "";
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        str4 = optJSONArray.getString(0);
                    }
                    String str5 = str4;
                    if (!TextUtils.isEmpty(str5)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        Bundle bundle5 = new Bundle();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle5.putString(next, optJSONObject.optString(next, ""));
                            }
                        }
                        hashMap2.put(str5, new rk0(str5, true, true, false, bundle5));
                    }
                } catch (JSONException e) {
                    f9.k.C.f16817h.d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                    k9.a0.l("Malformed RTB adapter config.", e);
                }
            }
            kn0Var.a(arrayList, hashMap2);
        } else {
            boolean booleanValue2 = ((Boolean) rVar.f17698c.a(sl.f10948t2)).booleanValue();
            ok0 ok0Var = kn0Var.f7816c;
            String str6 = kn0Var.i;
            if (!booleanValue2) {
                Iterator it = ((a61) ok0Var.a(str6, str2).entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str7 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Bundle bundle6 = kn0Var.e.f4581d.G;
                    if (bundle6 != null) {
                        bundle3 = bundle6.getBundle(str7);
                    } else {
                        bundle3 = null;
                    }
                    arrayList.add(kn0Var.b(str7, list, bundle3, true, true));
                }
                synchronized (ok0Var) {
                    if (TextUtils.isEmpty(f9.k.C.f16817h.g().n().e)) {
                        a10 = d61.A;
                    } else {
                        a10 = d61.a(ok0Var.f9143b);
                    }
                }
                kn0Var.a(arrayList, a10);
            } else {
                synchronized (ok0Var) {
                    try {
                        d61 a11 = ok0Var.a(str6, str2);
                        d61 i10 = ok0Var.i(str2);
                        hashMap = new HashMap();
                        Iterator it2 = ((a61) a11.entrySet()).iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            String str8 = (String) entry2.getKey();
                            if (i10.containsKey(str8)) {
                                rk0 rk0Var = (rk0) i10.get(str8);
                                List list2 = (List) entry2.getValue();
                                boolean z3 = rk0Var.f10224b;
                                boolean z9 = rk0Var.f10225c;
                                boolean z10 = rk0Var.f10226d;
                                if (list2 != null && !list2.isEmpty()) {
                                    bundle2 = (Bundle) list2.get(0);
                                } else {
                                    bundle2 = new Bundle();
                                }
                                hashMap.put(str8, new rk0(str8, z3, z9, z10, bundle2));
                            }
                        }
                        m61 a12 = i10.entrySet().a();
                        while (a12.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) a12.next();
                            String str9 = (String) entry3.getKey();
                            if (!hashMap.containsKey(str9) && ((rk0) entry3.getValue()).f10226d) {
                                hashMap.put(str9, (rk0) entry3.getValue());
                            }
                        }
                    } finally {
                    }
                }
                kn0Var.a(arrayList, hashMap);
            }
        }
        d51 u9 = d51.u(arrayList);
        h60 h60Var = new h60(arrayList, bundle4, str3);
        wx wxVar = kn0Var.f7814a;
        e81 e81Var = new e81(u9, true, false);
        e81Var.J = new m81(e81Var, h60Var, wxVar);
        e81Var.x();
        return e81Var;
    }

    private final void g(Throwable th) {
    }

    private final void i(Throwable th) {
    }

    private final void j(Throwable th) {
    }

    public hx0(int i) {
        this.f6913u = i;
        switch (i) {
            case 2:
                this.f6914v = new xk0(10);
                return;
            default:
                this.f6914v = new CopyOnWriteArrayList();
                return;
        }
    }

    public hx0(Context context) {
        this.f6913u = 0;
        if (j6.s.f18979x == null) {
            j6.s.f18979x = new j6.s(context);
        }
        this.f6914v = j6.s.f18979x;
    }

    public /* synthetic */ hx0(int i, Object obj) {
        this.f6913u = i;
        this.f6914v = obj;
    }

    public hx0(br brVar) {
        this.f6913u = 8;
        Objects.requireNonNull(brVar);
        this.f6914v = brVar;
    }

    public hx0(ByteBuffer byteBuffer) {
        this.f6913u = 4;
        this.f6914v = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        switch (this.f6913u) {
            case 13:
                ((z60) obj).o((g9.y1) this.f6914v);
                return;
            case 14:
                ((t70) obj).c((g9.d3) this.f6914v);
                return;
            case 15:
                ((k80) obj).G((nk) this.f6914v);
                return;
            default:
                ((j90) obj).a((s9.m) this.f6914v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.qa, com.google.android.gms.internal.ads.b10, com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public long mo212zza() {
        return ((ByteBuffer) this.f6914v).capacity();
    }

    @Override // com.google.android.gms.internal.ads.y40
    /* renamed from: zza, reason: collision with other method in class */
    public g9.z1 mo208zza() {
        try {
            return ((iq0) this.f6914v).f7192a.d0();
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.b10, com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public void mo212zza() {
        switch (this.f6913u) {
            case 7:
                ar arVar = (ar) this.f6914v;
                f9.k.C.f16819k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = arVar.f4600a;
                ArrayList arrayList = (ArrayList) arVar.f4602c;
                arrayList.add(Long.valueOf(currentTimeMillis - j10));
                String valueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 52);
                sb2.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb2.append(valueOf);
                sb2.append(" ms.");
                k9.a0.k(sb2.toString());
                k9.f0.f19676l.postDelayed(new zq((dr) arVar.f4601b, (cr) arVar.f4603d, (uq) arVar.e, arrayList, j10, 1), ((Integer) g9.r.e.f17698c.a(sl.f10691d)).intValue());
                return;
            case 8:
                ((br) this.f6914v).e.m();
                return;
            case 17:
                ((fj) this.f6914v).d();
                return;
            case 22:
                String str = "persistFlags";
                ac.b a10 = ((a8) this.f6914v).a();
                if (!((Boolean) g9.r.e.f17698c.a(sl.D8)).booleanValue()) {
                    x21.i(a10, "persistFlags", xx.f12657h);
                    return;
                }
                a10.a(new t81(a10, 0, new q91(str, 6)), xx.f12657h);
                return;
            default:
                op0 op0Var = (op0) this.f6914v;
                synchronized (op0Var) {
                    op0Var.f9192x = null;
                }
                return;
        }
    }
}
