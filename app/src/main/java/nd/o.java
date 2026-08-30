package nd;
import f.d;
import j.a;
import o.a;
import p.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import b8.u9;
import com.google.android.gms.internal.ads.zv1;
import com.google.android.gms.internal.consent_sdk.e0;
import com.google.android.gms.internal.consent_sdk.l1;
import com.google.android.gms.internal.consent_sdk.p0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pf.b0;
import pf.d1;
import pf.l0;
import pf.r1;
import t.m1;
import u7.i0;
import wa.h8;

/* loaded from: classes.dex */
public final class o implements e0, e1.f, l9.e {

    /* renamed from: y, reason: collision with root package name */
    public static o f21270y;

    /* renamed from: u, reason: collision with root package name */
    public Object f21271u;

    /* renamed from: v, reason: collision with root package name */
    public Object f21272v;

    /* renamed from: w, reason: collision with root package name */
    public Object f21273w;

    /* renamed from: x, reason: collision with root package name */
    public Object f21274x;

    public o(ExecutorService executorService, int i) {
        switch (i) {
            case 7:
                this.f21272v = h8.e(null);
                this.f21273w = new Object();
                this.f21274x = new ThreadLocal();
                this.f21271u = executorService;
                executorService.execute(new a6.x(27, this));
                return;
            default:
                this.f21274x = new ArrayDeque();
                this.f21272v = new ArrayDeque();
                this.f21273w = new ArrayDeque();
                this.f21271u = executorService;
                return;
        }
    }

    public static final Bitmap f(File file) {
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            options.inSampleSize = 1;
            return BitmapFactory.decodeFile(absolutePath, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static File g(int i, int i10, Context context, String str) {
        context.getClass();
        str.getClass();
        File file = new File(context.getFilesDir(), "drawings");
        if (!file.exists()) {
            file.mkdirs();
        }
        String a10 = v7.a(i10);
        if (!str.startsWith("?")) {
            return new File(file, a.j(i, ".png", a.q("drawing_", a10, "_notebook_", str, "_spread_")));
        }
        return new File(file, a.j(i, ".png", a.q("drawing_", a10, "_book_", str, "_spread_")));
    }

    public static synchronized o j() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f21270y == null) {
                    f21270y = new o(0);
                }
                oVar = f21270y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x020f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    @Override // com.google.android.gms.internal.consent_sdk.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r20, org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.a(java.lang.String, org.json.JSONObject):boolean");
    }

    public void b(pe.o oVar, df.a aVar) {
        if (!((ConcurrentHashMap.KeySetView) this.f21274x).contains(oVar)) {
            aVar.invoke();
        } else {
            b0.x((y4.a) this.f21271u, null, new p7.k(this, oVar, aVar, (te.c) null, 5), 3);
        }
    }

    @Override // l9.e
    public void c(JsonWriter jsonWriter) {
        String str = (String) this.f21271u;
        String str2 = (String) this.f21272v;
        Map map = (Map) this.f21273w;
        byte[] bArr = (byte[]) this.f21274x;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        l9.d(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public void d(b6.n nVar) {
        Runnable runnable;
        nVar.getClass();
        synchronized (this.f21273w) {
            runnable = (Runnable) ((LinkedHashMap) this.f21274x).remove(nVar);
        }
        if (runnable != null) {
            ((Handler) ((pd.c) this.f21271u).f22681u).removeCallbacks(runnable);
        }
    }

    public void e(String str, int i, int i10) {
        d1 d1Var = (d1) ((ConcurrentHashMap) this.f21273w).remove(new pe.o(str, Integer.valueOf(i), Integer.valueOf(i10)));
        if (d1Var != null) {
            d1Var.j(null);
        }
    }

    public synchronized ExecutorService h() {
        try {
            if (((ExecutorService) this.f21271u) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                byte[] bArr = jg.b.f19199a;
                this.f21271u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new a6.b("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExecutorService) this.f21271u;
    }

    public void i(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        n();
    }

    public boolean k(Context context) {
        boolean z3;
        if (((Boolean) this.f21273w) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f21273w = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f21272v).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f21273w).booleanValue();
    }

    public boolean l(Context context) {
        boolean z3;
        if (((Boolean) this.f21272v) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f21272v = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f21272v).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f21272v).booleanValue();
    }

    public void m(int i, int i10, Context context, String str) {
        context.getClass();
        pe.o oVar = new pe.o(str, Integer.valueOf(i), Integer.valueOf(i10));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f21273w;
        d1 d1Var = (d1) concurrentHashMap.remove(oVar);
        te.c cVar = null;
        if (d1Var != null) {
            d1Var.j(null);
        }
        concurrentHashMap.put(oVar, b0.x((y4.a) this.f21271u, null, new m1(this, oVar, context, cVar, 12), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.f21274x     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6b
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6b
            ig.t r2 = (ig.t) r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r4 = r8.f21272v     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch: java.lang.Throwable -> L6b
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L6b
            r5 = 64
            if (r4 < r5) goto L28
            goto L6d
        L28:
            java.lang.Object r4 = r8.f21272v     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L6b
        L30:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L6b
            ig.t r5 = (ig.t) r5     // Catch: java.lang.Throwable -> L6b
            ig.u r5 = r5.f18579x     // Catch: java.lang.Throwable -> L6b
            a4.b r5 = r5.f18584y     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r5 = r5.f240c     // Catch: java.lang.Throwable -> L6b
            ig.n r5 = (ig.n) r5     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = r5.f18538d     // Catch: java.lang.Throwable -> L6b
            ig.u r6 = r2.f18579x     // Catch: java.lang.Throwable -> L6b
            a4.b r6 = r6.f18584y     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r6 = r6.f240c     // Catch: java.lang.Throwable -> L6b
            ig.n r6 = (ig.n) r6     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.f18538d     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L30
            int r3 = r3 + 1
            goto L30
        L59:
            r4 = 5
            if (r3 < r4) goto L5d
            goto Le
        L5d:
            r1.remove()     // Catch: java.lang.Throwable -> L6b
            r0.add(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r8.f21272v     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L6b
            r3.add(r2)     // Catch: java.lang.Throwable -> L6b
            goto Le
        L6b:
            r0 = move-exception
            goto Lc9
        L6d:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r8.f21272v     // Catch: java.lang.Throwable -> Lc6
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Lc6
            r1.size()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r1 = r8.f21273w     // Catch: java.lang.Throwable -> Lc6
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Lc6
            r1.size()     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
            int r1 = r0.size()
        L82:
            if (r3 >= r1) goto Lc5
            java.lang.Object r2 = r0.get(r3)
            ig.t r2 = (ig.t) r2
            java.util.concurrent.ExecutorService r4 = r8.h()
            ig.u r5 = r2.f18579x
            r4.execute(r2)     // Catch: java.lang.Throwable -> L94 java.util.concurrent.RejectedExecutionException -> L96
            goto Lb6
        L94:
            r0 = move-exception
            goto Lb9
        L96:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L94
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L94
            ig.b r4 = r5.f18583x     // Catch: java.lang.Throwable -> L94
            r4.getClass()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.mlkit_vision_digital_ink.br r4 = r2.f18578w     // Catch: java.lang.Throwable -> L94
            r4.a(r6)     // Catch: java.lang.Throwable -> L94
            ig.q r4 = r5.f18580u
            nd.o r4 = r4.f18564u
            java.lang.Object r5 = r4.f21272v
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5
            r4.i(r5, r2)
        Lb6:
            int r3 = r3 + 1
            goto L82
        Lb9:
            ig.q r1 = r5.f18580u
            nd.o r1 = r1.f18564u
            java.lang.Object r3 = r1.f21272v
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            r1.i(r3, r2)
            throw r0
        Lc5:
            return
        Lc6:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc6
            throw r0     // Catch: java.lang.Throwable -> L6b
        Lc9:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.o.n():void");
    }

    public void o(pe.o oVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f21272v;
        Set keySet = concurrentHashMap.keySet();
        keySet.getClass();
        for (Object obj : qe.l.P(keySet)) {
            obj.getClass();
            pe.o oVar2 = (pe.o) obj;
            if (!oVar2.equals(oVar) && !((ConcurrentHashMap.KeySetView) this.f21274x).contains(oVar2) && !((ConcurrentHashMap) this.f21273w).containsKey(oVar2)) {
                concurrentHashMap.remove(oVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0048, blocks: (B:12:0x003f, B:18:0x005b, B:24:0x007f, B:26:0x008b, B:27:0x008e, B:99:0x0072), top: B:11:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [nd.o] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void p(android.content.Context r9, java.lang.String r10, int r11, int r12, int r13, boolean r14, final df.a r15) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.o.p(android.content.Context, java.lang.String, int, int, int, boolean, df.a):void");
    }

    public void q(String str, int i, int i10) {
        ((ConcurrentHashMap) this.f21272v).remove(new pe.o(str, Integer.valueOf(i), Integer.valueOf(i10)));
    }

    public void r(int i, int i10, Context context, String str) {
        context.getClass();
        pe.o oVar = new pe.o(str, Integer.valueOf(i), Integer.valueOf(i10));
        d1 d1Var = (d1) ((ConcurrentHashMap) this.f21273w).remove(oVar);
        if (d1Var != null) {
            d1Var.j(null);
        }
        ((ConcurrentHashMap) this.f21272v).remove(oVar);
        b(oVar, new i0(this, context, str, i, i10));
    }

    public r1 s(Context context, pe.o oVar) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) ((ConcurrentHashMap) this.f21272v).get(oVar);
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            Bitmap.Config config = bitmap2.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            jf.d dVar = v7.j.f27439a;
            config.getClass();
            try {
                bitmap = bitmap2.copy(config, false);
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                ((ConcurrentHashMap.KeySetView) this.f21274x).add(oVar);
                y4.a aVar = (y4.a) this.f21271u;
                wf.e eVar = l0.f22767a;
                return b0.x(aVar, wf.d.f29913w, new u9(this, context, oVar, bitmap, null, 5, false), 2);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ib.a] */
    public ib.o t(Callable callable) {
        ib.o g8;
        synchronized (this.f21273w) {
            g8 = ((ib.o) this.f21272v).g((Executor) this.f21271u, new ic.c(19, callable));
            this.f21272v = g8.g((Executor) this.f21271u, new Object());
        }
        return g8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ib.a] */
    public ib.o u(Callable callable) {
        ib.o h3;
        synchronized (this.f21273w) {
            h3 = ((ib.o) this.f21272v).h((Executor) this.f21271u, new ic.c(19, callable));
            this.f21272v = h3.g((Executor) this.f21271u, new Object());
        }
        return h3;
    }

    public void v(b6.n nVar) {
        b6.g gVar = new b6.g(this, 3, nVar);
        synchronized (this.f21273w) {
        }
        ((Handler) ((pd.c) this.f21271u).f22681u).postDelayed(gVar, 5400000L);
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, ba.r] */
    public ba.r w(zv1 zv1Var) {
        boolean z3;
        int i;
        com.google.android.gms.internal.consent_sdk.o oVar;
        String str;
        com.google.android.gms.internal.consent_sdk.g gVar = (com.google.android.gms.internal.consent_sdk.g) this.f21273w;
        com.google.android.gms.internal.consent_sdk.y yVar = (com.google.android.gms.internal.consent_sdk.y) this.f21274x;
        int i10 = zv1Var.f13277a;
        if (i10 == 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        gVar.f13407b.edit().putBoolean("is_pub_misconfigured", z3).commit();
        int i11 = i10 - 1;
        if (i10 != 0) {
            int i12 = 3;
            switch (i11) {
                case 1:
                case 2:
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 2;
                    break;
                case 5:
                    i = 1;
                    break;
                case 6:
                    throw new l1(1, "Invalid response from server: ".concat(String.valueOf((String) zv1Var.e)));
                case 7:
                    throw new l1(3, "Publisher misconfiguration: ".concat(String.valueOf((String) zv1Var.e)));
                default:
                    throw new l1(1, "Invalid response from server.");
            }
            int i13 = zv1Var.f13278b;
            int i14 = i13 - 1;
            if (i13 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        i12 = 2;
                    } else {
                        throw new l1(1, "Invalid response from server.");
                    }
                }
                String str2 = (String) zv1Var.f13279c;
                if (str2 == null) {
                    oVar = null;
                } else {
                    oVar = new com.google.android.gms.internal.consent_sdk.o((String) zv1Var.f13280d, str2);
                }
                yVar.f13607a.set((String) zv1Var.f13283h);
                gVar.f13407b.edit().putStringSet("stored_info", new HashSet((List) zv1Var.f13281f)).commit();
                for (com.google.android.gms.internal.consent_sdk.w wVar : (List) zv1Var.f13282g) {
                    int i15 = wVar.f13588b;
                    int i16 = i15 - 1;
                    if (i15 != 0) {
                        if (i16 != 0) {
                            if (i16 != 1) {
                                if (i16 == 2) {
                                    str = "clear";
                                } else {
                                    throw new RuntimeException(null, null);
                                }
                            } else {
                                str = "write";
                            }
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            p0 p0Var = (p0) this.f21271u;
                            String str3 = wVar.f13587a;
                            e0[] e0VarArr = {(o) this.f21272v};
                            p0Var.getClass();
                            p0Var.f13521a.execute(new ba.j(5, str, str3, e0VarArr));
                        }
                    } else {
                        throw null;
                    }
                }
                Object obj = new Object();
                obj.f3161u = i;
                obj.f3162v = i12;
                obj.f3163w = oVar;
                return obj;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e0
    /* renamed from: zza */
    public Executor mo192zza() {
        return (Executor) this.f21274x;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f21271u = obj;
        this.f21272v = obj2;
        this.f21274x = obj4;
        this.f21273w = obj3;
    }

    public o(int i) {
        switch (i) {
            case 5:
                this.f21274x = new ArrayDeque();
                this.f21272v = new ArrayDeque();
                this.f21273w = new ArrayDeque();
                return;
            default:
                this.f21271u = null;
                this.f21272v = null;
                this.f21273w = null;
                this.f21274x = new ArrayDeque();
                return;
        }
    }
}