package oc;
import c.j;
import g.b;
import n.c;
import n.f;
import q.h;
import q.x;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import c0.z;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import eb.z1;
import j.m0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import qc.b0;
import qc.j0;
import qc.j1;
import qc.k0;
import qc.k1;
import qc.l1;
import qc.l2;
import qc.m1;
import qc.m2;
import wa.h8;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: r, reason: collision with root package name */
    public static final h f21898r = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f21899a;

    /* renamed from: b, reason: collision with root package name */
    public final z f21900b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.m f21901c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f21902d;
    public final nd.o e;

    /* renamed from: f, reason: collision with root package name */
    public final w f21903f;

    /* renamed from: g, reason: collision with root package name */
    public final tc.c f21904g;

    /* renamed from: h, reason: collision with root package name */
    public final b6.u f21905h;
    public final pc.e i;

    /* renamed from: j, reason: collision with root package name */
    public final lc.b f21906j;

    /* renamed from: k, reason: collision with root package name */
    public final mc.a f21907k;

    /* renamed from: l, reason: collision with root package name */
    public final j f21908l;

    /* renamed from: m, reason: collision with root package name */
    public final g9.n f21909m;

    /* renamed from: n, reason: collision with root package name */
    public s f21910n;

    /* renamed from: o, reason: collision with root package name */
    public final ib.h f21911o = new ib.h();

    /* renamed from: p, reason: collision with root package name */
    public final ib.h f21912p = new ib.h();

    /* renamed from: q, reason: collision with root package name */
    public final ib.h f21913q = new ib.h();

    public n(Context context, nd.o oVar, w wVar, z zVar, tc.c cVar, i0.m mVar, b6.u uVar, m0 m0Var, pc.e eVar, g9.n nVar, lc.b bVar, mc.a aVar, j jVar) {
        new AtomicBoolean(false);
        this.f21899a = context;
        this.e = oVar;
        this.f21903f = wVar;
        this.f21900b = zVar;
        this.f21904g = cVar;
        this.f21901c = mVar;
        this.f21905h = uVar;
        this.f21902d = m0Var;
        this.i = eVar;
        this.f21906j = bVar;
        this.f21907k = aVar;
        this.f21908l = jVar;
        this.f21909m = nVar;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [qc.m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [qc.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.y5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, qc.a0] */
    public static void a(n nVar, String str, Boolean bool) {
        int i;
        String str2;
        Integer num;
        Map unmodifiableMap;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String k3 = g3.a.k("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", k3, null);
        }
        Locale locale = Locale.US;
        w wVar = nVar.f21903f;
        b6.u uVar = nVar.f21905h;
        String str3 = wVar.f21950c;
        String str4 = (String) uVar.f1785y;
        String str5 = (String) uVar.f1786z;
        String str6 = wVar.c().f21870a;
        if (((String) uVar.f1783w) != null) {
            i = 4;
        } else {
            i = 1;
        }
        k1 k1Var = new k1(str3, str4, str5, str6, g3.a.b(i), (gw) uVar.B);
        String str7 = Build.VERSION.RELEASE;
        String str8 = Build.VERSION.CODENAME;
        m1 m1Var = new m1(g.h());
        Context context = nVar.f21899a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f21878u;
        String str9 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str9)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            f fVar2 = (f) f.f21879v.get(str9.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        }
        int ordinal = fVar.ordinal();
        String str10 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = b(context);
        boolean g8 = g.g();
        int d2 = g.d();
        String str11 = Build.MANUFACTURER;
        String str12 = Build.PRODUCT;
        nVar.f21906j.d(str, currentTimeMillis, new j1(k1Var, m1Var, new l1(ordinal, availableProcessors, b10, blockCount, g8, d2)));
        if (bool.booleanValue() && str != null) {
            m0 m0Var = nVar.f21902d;
            synchronized (((String) m0Var.f18664w)) {
                try {
                    m0Var.f18664w = str;
                    pc.d dVar = (pc.d) ((AtomicMarkableReference) ((com.google.android.gms.internal.ads.d) m0Var.f18665x).f5230v).getReference();
                    synchronized (dVar) {
                        unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar.f22652a));
                    }
                    List a10 = ((ad) m0Var.f18667z).a();
                    if (((String) ((AtomicMarkableReference) m0Var.A).getReference()) != null) {
                        str2 = str12;
                        ((pc.g) m0Var.f18662u).i(str, (String) ((AtomicMarkableReference) m0Var.A).getReference());
                    } else {
                        str2 = str12;
                    }
                    if (!unmodifiableMap.isEmpty()) {
                        ((pc.g) m0Var.f18662u).g(str, unmodifiableMap, false);
                    }
                    if (!a10.isEmpty()) {
                        ((pc.g) m0Var.f18662u).h(str, a10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            str2 = str12;
        }
        pc.e eVar = nVar.i;
        ((pc.c) eVar.f22657v).a();
        eVar.f22657v = pc.e.f22655w;
        if (str != null) {
            eVar.f22657v = new pc.l(((tc.c) eVar.f22656u).d(str, "userlog"));
        }
        nVar.f21908l.a(str);
        g9.n nVar2 = nVar.f21909m;
        r rVar = (r) nVar2.f17678v;
        Charset charset = m2.f23870a;
        Object obj = new Object();
        obj.f23678a = "19.0.3";
        b6.u uVar2 = rVar.f21935c;
        String str13 = (String) uVar2.f1781u;
        if (str13 != null) {
            obj.f23679b = str13;
            w wVar2 = rVar.f21934b;
            String str14 = wVar2.c().f21870a;
            if (str14 != null) {
                obj.f23681d = str14;
                obj.e = wVar2.c().f21871b;
                obj.f23682f = wVar2.c().f21872c;
                String str15 = (String) uVar2.f1785y;
                if (str15 != null) {
                    obj.f23684h = str15;
                    String str16 = (String) uVar2.f1786z;
                    if (str16 != null) {
                        obj.i = str16;
                        obj.f23680c = 4;
                        obj.f23688m = (byte) (obj.f23688m | 1);
                        Object obj2 = new Object();
                        obj2.f23798f = false;
                        byte b11 = (byte) (obj2.f23804m | 2);
                        obj2.f23797d = currentTimeMillis;
                        obj2.f23804m = (byte) (b11 | 1);
                        if (str != null) {
                            obj2.f23795b = str;
                            String str17 = r.f21932g;
                            if (str17 != null) {
                                obj2.f23794a = str17;
                                String str18 = wVar2.f21950c;
                                if (str18 != null) {
                                    String str19 = wVar2.c().f21870a;
                                    gw gwVar = (gw) uVar2.B;
                                    if (((e4) gwVar.f14387w) == null) {
                                        gwVar.f14387w = new e4(gwVar);
                                    }
                                    e4 e4Var = (e4) gwVar.f14387w;
                                    String str20 = (String) e4Var.f13728v;
                                    if (e4Var == null) {
                                        gwVar.f14387w = new e4(gwVar);
                                    }
                                    obj2.f23799g = new k0(str18, str15, str16, str19, str20, (String) ((e4) gwVar.f14387w).f13729w);
                                    Object obj3 = new Object();
                                    obj3.f15275a = 3;
                                    obj3.f15278d = (byte) (obj3.f15278d | 1);
                                    if (str7 != null) {
                                        obj3.f15276b = str7;
                                        if (str8 != null) {
                                            obj3.e = str8;
                                            obj3.f15277c = g.h();
                                            obj3.f15278d = (byte) (obj3.f15278d | 2);
                                            obj2.i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i10 = 7;
                                            if (!TextUtils.isEmpty(str9) && (num = (Integer) r.f21931f.get(str9.toLowerCase(locale))) != null) {
                                                i10 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b12 = b(rVar.f21933a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g10 = g.g();
                                            int d10 = g.d();
                                            Object obj4 = new Object();
                                            obj4.f23861a = i10;
                                            byte b13 = (byte) (obj4.f23868j | 1);
                                            obj4.f23868j = b13;
                                            if (str10 != null) {
                                                obj4.f23862b = str10;
                                                obj4.f23863c = availableProcessors2;
                                                obj4.f23864d = b12;
                                                obj4.e = blockCount2;
                                                obj4.f23865f = g10;
                                                obj4.f23866g = d10;
                                                obj4.f23868j = (byte) (((byte) (((byte) (((byte) (((byte) (b13 | 2)) | 4)) | 8)) | 16)) | 32);
                                                if (str11 != null) {
                                                    obj4.f23867h = str11;
                                                    if (str2 != null) {
                                                        obj4.i = str2;
                                                        obj2.f23801j = obj4.a();
                                                        obj2.f23803l = 3;
                                                        obj2.f23804m = (byte) (obj2.f23804m | 4);
                                                        obj.f23685j = obj2.a();
                                                        b0 a11 = obj.a();
                                                        tc.c cVar = ((tc.a) nVar2.f17679w).f25693b;
                                                        l2 l2Var = a11.f23710k;
                                                        if (l2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str21 = ((j0) l2Var).f23818b;
                                                        try {
                                                            tc.a.f25690g.getClass();
                                                            tc.a.f(cVar.d(str21, "report"), rc.a.f24679a.g(a11));
                                                            File d11 = cVar.d(str21, "start-time");
                                                            long j10 = ((j0) l2Var).f23820d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(d11), tc.a.e);
                                                            try {
                                                                outputStreamWriter.write("");
                                                                d11.setLastModified(j10 * 1000);
                                                                outputStreamWriter.close();
                                                            } finally {
                                                            }
                                                        } catch (IOException e) {
                                                            String k4 = g3.a.k("Could not persist report for session ", str21);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", k4, e);
                                                            }
                                                        }
                                                    } else {
                                                        g5.h("Null modelClass");
                                                    }
                                                } else {
                                                    g5.h("Null manufacturer");
                                                }
                                            } else {
                                                g5.h("Null model");
                                            }
                                        } else {
                                            g5.h("Null buildVersion");
                                        }
                                    } else {
                                        g5.h("Null version");
                                    }
                                } else {
                                    g5.h("Null identifier");
                                }
                            } else {
                                g5.h("Null generator");
                            }
                        } else {
                            g5.h("Null identifier");
                        }
                    } else {
                        g5.h("Null displayVersion");
                    }
                } else {
                    g5.h("Null buildVersion");
                }
            } else {
                g5.h("Null installationUuid");
            }
        } else {
            g5.h("Null gmpAppId");
        }
    }

    public static ib.o b(n nVar) {
        ib.o c10;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : tc.j(((File) nVar.f21904g.f25699w).listFiles(f21898r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    c10 = h8.e(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    c10 = h8.c(new m(nVar, parseLong), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(c10);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return h8.f(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f() {
        /*
            java.lang.Class<oc.n> r0 = oc.n.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "FirebaseCrashlytics"
            r2 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r1, r0, r2)
        L10:
            r0 = r2
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r1, r0, r2)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r2
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r1, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r1, r3, r2)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.f():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04d1 A[LOOP:2: B:68:0x04d1->B:74:0x04ee, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0508  */
    /* JADX WARN: Type inference failed for: r0v10, types: [oc.j] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, qc.c0] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, qc.o0] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r12v59, types: [qc.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, qc.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r32, com.google.android.gms.internal.mlkit_vision_digital_ink.lw r33) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.c(boolean, com.google.android.gms.internal.mlkit_vision_digital_ink.lw):void");
    }

    public final boolean d(lw lwVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.f21274x).get())) {
            s sVar = this.f21910n;
            if (sVar != null && sVar.e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, lwVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
                return false;
            }
        }
        x.o("Not running on background worker thread as intended.");
        return false;
    }

    public final String e() {
        NavigableSet c10 = ((tc.a) this.f21909m.f17679w).c();
        if (!c10.isEmpty()) {
            return (String) c10.first();
        }
        return null;
    }

    public final void g() {
        try {
            String f10 = f();
            if (f10 != null) {
                try {
                    this.f21902d.c(f10);
                } catch (IllegalArgumentException e) {
                    Context context = this.f21899a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e8) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ib.g, java.lang.Object] */
    public final ib.o h(ib.o oVar) {
        ib.o oVar2;
        ib.o oVar3;
        ib.h hVar = this.f21911o;
        tc.c cVar = ((tc.a) this.f21909m.f17679w).f25693b;
        if (tc.j(((File) cVar.f25701y).listFiles()).isEmpty() && tc.j(((File) cVar.f25702z).listFiles()).isEmpty() && tc.j(((File) cVar.A).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            hVar.d(Boolean.FALSE);
            return h8.e(null);
        }
        lc.d dVar = lc.d.f20327a;
        dVar.e("Crash reports are available to be sent.");
        z zVar = this.f21900b;
        if (zVar.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            hVar.d(Boolean.FALSE);
            oVar3 = h8.e(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.e("Notifying that unsent reports are available.");
            hVar.d(Boolean.TRUE);
            synchronized (zVar.f3440y) {
                oVar2 = ((ib.h) zVar.f3438w).f18363a;
            }
            ib.o m4 = oVar2.m(new Object());
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            ib.o oVar4 = this.f21912p.f18363a;
            ExecutorService executorService = y.f21955a;
            ib.h hVar2 = new ib.h();
            x xVar = new x(hVar2, 1);
            z1 z1Var = ib.i.f18364a;
            m4.g(z1Var, xVar);
            oVar4.getClass();
            oVar4.g(z1Var, xVar);
            oVar3 = hVar2.f18363a;
        }
        return oVar3.m(new pw(18, this, oVar, false));
    }
}