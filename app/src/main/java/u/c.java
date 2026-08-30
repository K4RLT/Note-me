package u;
import a.a;
import m.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import b1.c0;
import b1.v;
import b1.y;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.um;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uw;
import g9.r;
import j.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import n.q;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import pe.o;
import q.u;
import q.x;
import qb.s;
import qe.b0;
import t.f1;
import u7.b8;
import u7.m3;
import u7.q1;
import v1.t;
import wa.b9;
import wa.h8;
import xa.c1;
import xa.h1;
import xa.v2;

/* loaded from: classes.dex */
public final class c implements b, p8.b, ib.g, c1, y3.b, z5.m {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25763u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25764v;

    public c(Context context) {
        this.f25763u = 13;
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f25764v = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static void g(Context context, z8.g gVar, v9.a aVar) {
        sl.a(context);
        if (((Boolean) um.f11683j.p()).booleanValue()) {
            if (((Boolean) r.e.f17698c.a(sl.Cc)).booleanValue()) {
                l9.b.f20035b.execute(new s(5, context, gVar, aVar));
                return;
            }
        }
        new mu(context, 0, gVar.f31983a).l(aVar);
    }

    @Override // u.b
    public Object a(f1 f1Var, Float f10, Float f11, df.l lVar, g gVar) {
        Object a10 = a(f1Var, f10.floatValue(), q.e.b(28, 0.0f, f11.floatValue()), (u) this.f25764v, lVar, gVar);
        if (a10 == ue.a.f27192u) {
            return a10;
        }
        return (a) a10;
    }

    @Override // z5.m
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f25764v).getSupportedFeatures();
    }

    public void c(v7.l lVar, Context context) {
        int i;
        context.getClass();
        String str = lVar.f27450a;
        int i10 = lVar.f27451b;
        pe.j jVar = new pe.j(str, Integer.valueOf(i10));
        int x9 = ((m3) this.f25764v).x(str);
        List list = lVar.f27452c;
        if (list != null) {
            m3 m3Var = (m3) this.f25764v;
            y yVar = m3Var.f26533f;
            pe.j jVar2 = new pe.j(str, Integer.valueOf(i10));
            Object obj = yVar.get(jVar2);
            if (obj == null) {
                obj = new v();
                yVar.put(jVar2, obj);
            }
            v vVar = (v) obj;
            ArrayList arrayList = new ArrayList(qe.d(vVar, 10));
            ListIterator listIterator = vVar.listIterator();
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (!c0Var.hasNext()) {
                    break;
                } else {
                    arrayList.add(((u7.b) c0Var.next()).f25917a);
                }
            }
            Set U = qe.l.U(arrayList);
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(qe.d(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((u7.b) it.next()).f25917a);
            }
            Set b10 = b0.b(U, qe.l.U(arrayList2));
            vVar.clear();
            vVar.addAll(list);
            if (!b10.isEmpty()) {
                m3Var.Q(qe.l.P(b10));
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                m3Var.D0(str, i10, (u7.b) it2.next());
            }
        }
        List list3 = lVar.f27453d;
        if (list3 != null) {
            m3 m3Var2 = (m3) this.f25764v;
            y yVar2 = m3Var2.f26534g;
            pe.j jVar3 = new pe.j(str, Integer.valueOf(i10));
            Object obj2 = yVar2.get(jVar3);
            if (obj2 == null) {
                obj2 = new v();
                yVar2.put(jVar3, obj2);
            }
            v vVar2 = (v) obj2;
            ArrayList arrayList3 = new ArrayList(qe.d(vVar2, 10));
            ListIterator listIterator2 = vVar2.listIterator();
            while (true) {
                c0 c0Var2 = (c0) listIterator2;
                if (!c0Var2.hasNext()) {
                    break;
                } else {
                    arrayList3.add(((u7.d) c0Var2.next()).f26033a);
                }
            }
            Set U2 = qe.l.U(arrayList3);
            List list4 = list3;
            ArrayList arrayList4 = new ArrayList(qe.d(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((u7.d) it3.next()).f26033a);
            }
            Set b11 = b0.b(U2, qe.l.U(arrayList4));
            vVar2.clear();
            vVar2.addAll(list3);
            if (!b11.isEmpty()) {
                m3Var2.Q(qe.l.P(b11));
            }
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                m3Var2.I0(str, i10, (u7.d) it4.next());
            }
        }
        List list5 = lVar.e;
        if (list5 != null) {
            m3 m3Var3 = (m3) this.f25764v;
            y yVar3 = m3Var3.f26535h;
            pe.j jVar4 = new pe.j(str, Integer.valueOf(i10));
            Object obj3 = yVar3.get(jVar4);
            if (obj3 == null) {
                obj3 = new v();
                yVar3.put(jVar4, obj3);
            }
            v vVar3 = (v) obj3;
            ArrayList arrayList5 = new ArrayList(qe.d(vVar3, 10));
            ListIterator listIterator3 = vVar3.listIterator();
            while (true) {
                c0 c0Var3 = (c0) listIterator3;
                if (!c0Var3.hasNext()) {
                    break;
                } else {
                    arrayList5.add(((u7.c) c0Var3.next()).f25969a);
                }
            }
            Set U3 = qe.l.U(arrayList5);
            List list6 = list5;
            ArrayList arrayList6 = new ArrayList(qe.d(list6, 10));
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList6.add(((u7.c) it5.next()).f25969a);
            }
            Set b12 = b0.b(U3, qe.l.U(arrayList6));
            vVar3.clear();
            vVar3.addAll(list5);
            if (!b12.isEmpty()) {
                m3Var3.Q(qe.l.P(b12));
            }
            Iterator it6 = list6.iterator();
            while (it6.hasNext()) {
                m3Var3.G0(str, i10, (u7.c) it6.next());
            }
        }
        List list7 = lVar.f27454f;
        if (list7 != null) {
            m3 m3Var4 = (m3) this.f25764v;
            m3Var4.i.put(jVar, list7);
            Iterator it7 = list7.iterator();
            while (it7.hasNext()) {
                m3Var4.E0(str, i10, ((q1) it7.next()).f26742a);
            }
        }
        b8 b8Var = lVar.f27455g;
        if (b8Var != null) {
            m3 m3Var5 = (m3) this.f25764v;
            m3Var5.f26537k.put(jVar, b8Var);
            m3Var5.F0(i10, str);
        }
        HashMap hashMap = lVar.f27456h;
        if (hashMap != null) {
            i0 i0Var = ((m3) this.f25764v).f26540n;
            synchronized (i0Var) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    List list8 = (List) entry.getValue();
                    o oVar = new o(str, Integer.valueOf(i10), Integer.valueOf(intValue));
                    ((ConcurrentHashMap) i0Var.f18637w).put(oVar, list8);
                    i0Var.D(context, oVar);
                }
            }
        }
        Integer num = lVar.i;
        int i11 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (lVar.f27459l) {
            nd.o oVar2 = ((m3) this.f25764v).f26539m;
            List list9 = u7.a.f25881a;
            oVar2.r(i10, i * 2, context, str);
        }
        if (lVar.f27460m) {
            ((m3) this.f25764v).f26539m.r(i10, u7.a.b(i), context, str);
        }
        Bitmap bitmap = lVar.f27457j;
        if (bitmap != null) {
            m3 m3Var6 = (m3) this.f25764v;
            List list10 = u7.a.f25881a;
            int i12 = i * 2;
            nd.o oVar3 = m3Var6.f26539m;
            oVar3.getClass();
            ((ConcurrentHashMap) oVar3.f21272v).put(new o(str, Integer.valueOf(i10), Integer.valueOf(i12)), bitmap);
            m3Var6.f26539m.m(i10, i12, context, str);
        }
        Bitmap bitmap2 = lVar.f27458k;
        if (bitmap2 != null) {
            m3 m3Var7 = (m3) this.f25764v;
            int b13 = u7.a.b(i);
            nd.o oVar4 = m3Var7.f26539m;
            oVar4.getClass();
            ((ConcurrentHashMap) oVar4.f21272v).put(new o(str, Integer.valueOf(i10), Integer.valueOf(b13)), bitmap2);
            m3Var7.f26539m.m(i10, b13, context, str);
        }
        ArrayList arrayList7 = lVar.f27461n;
        if (arrayList7 != null) {
            if (arrayList7.isEmpty() || x9 < 0) {
                arrayList7 = null;
            }
            if (arrayList7 != null) {
                m3 m3Var8 = (m3) this.f25764v;
                HashSet hashSet = new HashSet();
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                paint.setFilterBitmap(false);
                int size = arrayList7.size();
                while (i11 < size) {
                    Object obj4 = arrayList7.get(i11);
                    i11++;
                    v7.g gVar = (v7.g) obj4;
                    if (!gVar.f27428d.isRecycled()) {
                        Bitmap g02 = m3Var8.g0(x9, i10, gVar.f27425a, context);
                        if (!g02.isRecycled() && g02.isMutable()) {
                            new Canvas(g02).drawBitmap(gVar.f27428d, gVar.f27426b, gVar.f27427c, paint);
                            hashSet.add(Integer.valueOf(gVar.f27425a));
                        }
                    }
                }
                Iterator it8 = hashSet.iterator();
                while (it8.hasNext()) {
                    m3Var8.f26539m.m(i10, ((Number) it8.next()).intValue(), context, str);
                }
            }
        }
        if (x9 >= 0) {
            ((m3) this.f25764v).B(x9, i10);
        }
        ((m3) this.f25764v).Z0(((m3) this.f25764v).f26543q.h() + 1);
    }

    @Override // z5.m
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ug.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f25764v).createWebView(webView));
    }

    public void d(String str, int i, v7.l lVar, Context context) {
        int j10;
        Bitmap bitmap;
        lVar.getClass();
        context.getClass();
        m3 m3Var = (m3) this.f25764v;
        int x9 = m3Var.x(str);
        if (x9 >= 0) {
            Integer num = lVar.i;
            if (num != null) {
                j10 = num.intValue();
            } else {
                j10 = m3Var.j(x9, i);
            }
            lVar.i = Integer.valueOf(j10);
            List list = u7.a.f25881a;
            int i10 = j10 * 2;
            Bitmap bitmap2 = null;
            if (!m3Var.k0(x9, i, i10, context)) {
                lVar.f27459l = true;
            } else {
                try {
                    Bitmap g02 = m3Var.g0(x9, i, i10, context);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    jf.d dVar = v7.j.f27439a;
                    config.getClass();
                    bitmap = g02.copy(config, true);
                } catch (OutOfMemoryError unused) {
                    bitmap = null;
                }
                lVar.f27457j = bitmap;
            }
            int b10 = u7.a.b(j10);
            if (!m3Var.k0(x9, i, b10, context)) {
                lVar.f27460m = true;
                return;
            }
            try {
                Bitmap g03 = m3Var.g0(x9, i, b10, context);
                Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                jf.d dVar2 = v7.j.f27439a;
                config2.getClass();
                bitmap2 = g03.copy(config2, true);
            } catch (OutOfMemoryError unused2) {
            }
            lVar.f27458k = bitmap2;
        }
    }

    public void e(String str, int i, int i10, int i11, int i12, int i13, int i14, v7.l lVar, Context context) {
        lVar.getClass();
        context.getClass();
        m3 m3Var = (m3) this.f25764v;
        int x9 = m3Var.x(str);
        if (x9 >= 0) {
            try {
                Bitmap g02 = m3Var.g0(x9, i, i10, context);
                int e = b9.e(i11, 0, g02.getWidth());
                int e8 = b9.e(i12, 0, g02.getHeight());
                int e10 = b9.e(i13, e, g02.getWidth());
                int e11 = b9.e(i14, e8, g02.getHeight());
                if (e10 > e && e11 > e8) {
                    Bitmap bitmap = null;
                    try {
                        bitmap = Bitmap.createBitmap(g02, e, e8, e10 - e, e11 - e8);
                    } catch (IllegalArgumentException | OutOfMemoryError unused) {
                    }
                    if (bitmap != null) {
                        v7.g gVar = new v7.g(i10, e, e8, bitmap);
                        ArrayList arrayList = lVar.f27461n;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            lVar.f27461n = arrayList;
                        }
                        arrayList.add(gVar);
                    }
                }
            } catch (OutOfMemoryError unused2) {
            }
        }
    }

    public void f(String str, int i, v7.l lVar) {
        HashMap hashMap;
        lVar.getClass();
        pe.j jVar = new pe.j(str, Integer.valueOf(i));
        Iterable iterable = (v) ((m3) this.f25764v).f26533f.get(jVar);
        if (iterable == null) {
            iterable = qe.s.f24023u;
        }
        lVar.f27452c = qe.l.P(iterable);
        Iterable iterable2 = (v) ((m3) this.f25764v).f26534g.get(jVar);
        if (iterable2 == null) {
            iterable2 = qe.s.f24023u;
        }
        lVar.f27453d = qe.l.P(iterable2);
        Iterable iterable3 = (v) ((m3) this.f25764v).f26535h.get(jVar);
        if (iterable3 == null) {
            iterable3 = qe.s.f24023u;
        }
        lVar.e = qe.l.P(iterable3);
        List list = (List) ((m3) this.f25764v).i.get(jVar);
        if (list == null) {
            list = u7.a.f25881a;
        }
        lVar.f27454f = list;
        b8 b8Var = (b8) ((m3) this.f25764v).f26537k.get(jVar);
        if (b8Var == null) {
            b8Var = new b8();
        }
        lVar.f27455g = b8Var;
        i0 i0Var = ((m3) this.f25764v).f26540n;
        synchronized (i0Var) {
            try {
                jf.d dVar = v7.j.f27439a;
                int i10 = dVar.f19189u;
                int i11 = dVar.f19190v;
                hashMap = null;
                if (i10 <= i11) {
                    while (true) {
                        List list2 = (List) ((ConcurrentHashMap) i0Var.f18637w).get(new o(str, Integer.valueOf(i), Integer.valueOf(i10)));
                        if (list2 != null) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            HashMap hashMap2 = hashMap;
                            hashMap.put(Integer.valueOf(i10), list2);
                            hashMap = hashMap2;
                        }
                        if (i10 == i11) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            } finally {
            }
        }
        lVar.f27456h = hashMap;
    }

    @Override // oe.a
    public Object get() {
        return new u8.h((Context) ((oe.a) this.f25764v).get(), "com.google.android.datatransport.events", Integer.valueOf(u8.h.f27129x).intValue());
    }

    @Override // z5.m
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) ug.a(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f25764v).getProfileStore());
    }

    @Override // z5.m
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ug.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f25764v).getStatics());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.m, df.l] */
    @Override // y3.b
    public Object h(y3.a aVar) {
        return ((kotlin.jvm.internal.m) this.f25764v).invoke(aVar);
    }

    public Boolean i() {
        Bundle bundle = (Bundle) this.f25764v;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void j(vd.b0 b0Var) {
        ((n8.o) ((k8.f) ((gd.b) this.f25764v).get())).a("FIREBASE_APPQUALITY_SESSION", new k8.c("json"), new x(25, this)).a(new k8.a(b0Var, k8.d.f19626u, null), new l4.a(17));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.mf] */
    public mf k(j6.l lVar, c2.x xVar) {
        int i;
        long G;
        long j10;
        boolean z3;
        q qVar = (q) this.f25764v;
        List list = (List) lVar.f18933v;
        q qVar2 = new q(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            v1.v vVar = (v1.v) list.get(i10);
            long j11 = vVar.f27357a;
            v1.u uVar = (v1.u) qVar.b(j11);
            if (uVar == null) {
                i = i10;
                j10 = vVar.f27358b;
                G = vVar.f27360d;
                z3 = false;
            } else {
                long j12 = uVar.f27354a;
                boolean z9 = uVar.f27356c;
                i = i10;
                G = xVar.G(uVar.f27355b);
                j10 = j12;
                z3 = z9;
            }
            long j13 = vVar.f27357a;
            List list2 = list;
            int i11 = size;
            qVar2.d(j13, new t(j13, vVar.f27358b, vVar.f27360d, vVar.e, vVar.f27361f, j10, G, z3, vVar.f27362g, vVar.i, vVar.f27364j, vVar.f27365k));
            boolean z10 = vVar.e;
            if (z10) {
                qVar.d(j11, new v1.u(vVar.f27358b, vVar.f27359c, z10));
            } else {
                qVar.e(j11);
            }
            i10 = i + 1;
            list = list2;
            size = i11;
        }
        Object obj = new Object();
        obj.f8337v = qVar2;
        obj.f8338w = lVar;
        return obj;
    }

    public JSONObject l() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f25764v;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(oc.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        oc.g.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    oc.g.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            oc.g.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            oc.g.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        lw lwVar = (lw) this.f25764v;
        c7.a aVar = (c7.a) lwVar.f14648z;
        uw uwVar = (uw) lwVar.f14644v;
        String str = aVar.f3896v;
        FileWriter fileWriter2 = null;
        try {
            HashMap k3 = c7.a.k(uwVar);
            i0 i0Var = new i0(k3, str);
            i0Var.v("User-Agent", "Crashlytics Android SDK/19.0.3");
            i0Var.v("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c7.a.b(i0Var, uwVar);
            String concat = "Requesting settings from ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat, null);
            }
            String str2 = "Settings query params were: " + k3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str2, null);
            }
            jSONObject = aVar.l(i0Var.g());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            vc.a f10 = ((t.a) lwVar.f14645w).f(jSONObject);
            c cVar = (c) lwVar.f14647y;
            long j10 = f10.f27535c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar.f25764v);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        oc.g.c(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e8) {
                    e = e8;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    oc.g.c(fileWriter, "Failed to close settings writer.");
                    lw.d("Loaded settings: ", jSONObject);
                    String str3 = (String) uwVar.f15104g;
                    SharedPreferences.Editor edit = ((Context) lwVar.f14643u).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str3);
                    edit.apply();
                    ((AtomicReference) lwVar.B).set(f10);
                    ((ib.h) ((AtomicReference) lwVar.C).get()).d(f10);
                    return h8.e(null);
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                oc.g.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            oc.g.c(fileWriter, "Failed to close settings writer.");
            lw.d("Loaded settings: ", jSONObject);
            String str32 = (String) uwVar.f15104g;
            SharedPreferences.Editor edit2 = ((Context) lwVar.f14643u).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str32);
            edit2.apply();
            ((AtomicReference) lwVar.B).set(f10);
            ((ib.h) ((AtomicReference) lwVar.C).get()).d(f10);
        }
        return h8.e(null);
    }

    @Override // xa.c1
    public Object zza() {
        switch (this.f25763u) {
            case 10:
                Type type = (Type) this.f25764v;
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    throw new ab.b("Invalid EnumSet type: ".concat(String.valueOf(type.toString())), 21);
                }
                throw new ab.b("Invalid EnumSet type: ".concat(String.valueOf(type.toString())), 21);
            default:
                Class cls = (Class) this.f25764v;
                try {
                    return h1.f30424a.a(cls);
                } catch (Exception e) {
                    l4.a.k(p.a.k("Unable to create instance of ", String.valueOf(cls), ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
                    return null;
                }
        }
    }

    public c(t.a aVar) {
        this.f25763u = 12;
        v2 v2Var = v2.f30693c;
        this.f25764v = aVar;
    }

    public /* synthetic */ c(int i, Object obj) {
        this.f25763u = i;
        this.f25764v = obj;
    }

    public c(tc.c cVar) {
        this.f25763u = 6;
        this.f25764v = new File((File) cVar.f25699w, "com.crashlytics.settings.json");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(df.l lVar) {
        this.f25763u = 14;
        this.f25764v = (kotlin.jvm.internal.m) lVar;
    }

    public c(int i) {
        this.f25763u = i;
        switch (i) {
            case 15:
                return;
            default:
                this.f25764v = new q((Object) null);
                return;
        }
    }
}