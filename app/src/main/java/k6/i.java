package k6;
import c.d;
import p.a;
import q.a0;
import q.n1;
import q.q;
import q.r;
import q.s;
import r.e;
import t.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.ads.ib;
import com.google.android.gms.internal.ads.ja1;
import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.k90;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.x90;
import com.google.android.gms.internal.ads.yx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import ig.z;
import j.i0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import lb.c0;
import lb.v;
import oc.y;
import org.json.JSONException;
import org.json.JSONObject;
import p.u1;
import q.b0;
import q.o1;
import q.q1;
import q.x;
import wa.b9;
import wa.h8;
import ya.zb;

/* loaded from: classes.dex */
public class i implements ib, mb.f, ib.e, mc.b, nc.a, p8.b, r, q1, ib.a, p5.b, s81 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19568u;

    /* renamed from: v, reason: collision with root package name */
    public Object f19569v;

    public i(Context context) {
        boolean isEmpty;
        this.f19568u = 12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f19569v = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    public static String z(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void A() {
        eo eoVar = ((q9.e) this.f19569v).f23619v;
        if (eoVar == null) {
            return;
        }
        try {
            eoVar.j3(null);
        } catch (RemoteException e) {
            l9.i.d("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // q1, n1
    public boolean a() {
        ((j6.i) this.f19569v).getClass();
        return false;
    }

    @Override // mb.f
    public Object b() {
        switch (this.f19568u) {
            case 3:
                return new c0(new mb.e(new i(9, (ic.c) this.f19569v)));
            case 5:
                return ((c4.n) this.f19569v).f3851u;
            case 8:
                return new mb.b(((c4.n) ((i) this.f19569v).f19569v).f3851u);
            default:
                return ((mb.f) this.f19569v).b();
        }
    }

    @Override // nc.a
    public void c(oc.o oVar) {
        this.f19569v = oVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // ib.e
    public void d(Object obj) {
        switch (this.f19568u) {
            case 4:
                v vVar = (v) this.f19569v;
                List list = (List) obj;
                int a10 = vVar.f20290b.a();
                ArrayList f10 = vVar.f();
                int size = f10.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = f10.get(i);
                    i++;
                    File file = (File) obj2;
                    if (!list.contains(file.getName()) && v.b(file, true) != a10) {
                        v.h(file);
                    }
                }
                return;
            default:
                ((lb.o) this.f19569v).f();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ib
    public void e(jb jbVar) {
        ((yx) this.f19569v).c(jbVar);
    }

    @Override // n1
    public long f(q qVar, q qVar2, q qVar3) {
        return ((j6.i) this.f19569v).f(qVar, qVar2, qVar3);
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        x90 x90Var = (x90) this.f19569v;
        if (!oVar.l() && !oVar.f18384d) {
            Exception i = oVar.i();
            if (i instanceof da.d) {
                int i10 = ((da.d) i).f15819u.f4283u;
                if (i10 != 43001 && i10 != 43002 && i10 != 43003 && i10 != 17) {
                    if (i10 == 43000) {
                        return h8.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    }
                    if (i10 == 15) {
                        return h8.d(new Exception("The operation to get app set ID timed out. Please try again later."));
                    }
                    return oVar;
                }
                return ((ra.e) x90Var.f12503w).a();
            }
            return oVar;
        }
        return oVar;
    }

    @Override // oe.a
    public Object get() {
        return new i0(12, (Context) ((p8.c) this.f19569v).f22619u, new Object(), new Object());
    }

    @Override // mc.b
    public void h(String str, Bundle bundle) {
        oc.o oVar = (oc.o) this.f19569v;
        if (oVar != null) {
            try {
                String str2 = "$A$:" + z(str, bundle);
                oc.q qVar = oVar.f21914a;
                long currentTimeMillis = System.currentTimeMillis() - qVar.f21920d;
                oc.n nVar = qVar.f21922g;
                nVar.e.t(new oc.l(nVar, currentTimeMillis, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // n1
    public q i(long j10, q qVar, q qVar2, q qVar3) {
        return ((j6.i) this.f19569v).i(j10, qVar, qVar2, qVar3);
    }

    @Override // p5.b
    public p5.a j(String str) {
        String substring;
        str.getClass();
        q5.b bVar = (q5.b) this.f19569v;
        String databaseName = bVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                x.j(a.k("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str)) {
            int lastIndexOf = databaseName.lastIndexOf(47, databaseName.length() - 1);
            if (lastIndexOf != -1) {
                databaseName = databaseName.substring(lastIndexOf + 1, databaseName.length());
            }
            int lastIndexOf2 = str.lastIndexOf(47, str.length() - 1);
            if (lastIndexOf2 == -1) {
                substring = str;
            } else {
                substring = str.substring(lastIndexOf2 + 1, str.length());
            }
            if (!databaseName.equals(substring)) {
                throw new IllegalArgumentException(("This driver is configured to open a database named '" + bVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
            }
        }
        return new s5.a(bVar.y());
    }

    public void l(CancellationException cancellationException) {
        t0.e eVar = (t0.e) this.f19569v;
        int i = eVar.f25619w;
        pf.k[] kVarArr = new pf.k[i];
        for (int i10 = 0; i10 < i; i10++) {
            kVarArr[i10] = ((h) eVar.f25617u[i10]).f25406b;
        }
        for (int i11 = 0; i11 < i; i11++) {
            kVarArr[i11].i(cancellationException);
        }
        if (eVar.f25619w == 0) {
            return;
        }
        w.a.c("uncancelled requests present");
    }

    @Override // n1
    public q m(long j10, q qVar, q qVar2, q qVar3) {
        return ((j6.i) this.f19569v).m(j10, qVar, qVar2, qVar3);
    }

    public synchronized void n(z zVar) {
        ((LinkedHashSet) this.f19569v).remove(zVar);
    }

    @Override // p5.b
    public boolean o() {
        return true;
    }

    public r3.e p(int i) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f19568u) {
            case 27:
                int i = a0.f19634b;
                l9.i.a("Initialized webview successfully for SDKCore.");
                if (((Boolean) g9.e.f17698c.a(sl.f10716eb)).booleanValue()) {
                    s9.i iVar = (s9.i) this.f19569v;
                    zb.d(iVar.F, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(iVar.X.get())));
                    iVar.W.set(true);
                    return;
                }
                return;
            default:
                k90 k90Var = (k90) this.f19569v;
                s9.m mVar = (s9.m) obj;
                synchronized (k90Var) {
                    k90Var.P1(new hx0(16, mVar));
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f19568u) {
            case 27:
                f9.k.C.f16817h.d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
                Pair pair = new Pair("sgf_reason", th.getMessage());
                Pair pair2 = new Pair("se", "query_g");
                Pair pair3 = new Pair("ad_format", "BANNER");
                Pair pair4 = new Pair("rtype", Integer.toString(6));
                Pair pair5 = new Pair("scar", "true");
                s9.i iVar = (s9.i) this.f19569v;
                zb.d(iVar.F, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(iVar.X.get())));
                int i = a0.f19634b;
                l9.i.d("Failed to initialize webview for loading SDKCore. ", th);
                nl nlVar = sl.f10716eb;
                g9.r rVar = g9.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && !iVar.W.get()) {
                    if (iVar.X.getAndIncrement() < ((Integer) rVar.f17698c.a(sl.f10733fb)).intValue()) {
                        iVar.y4();
                        return;
                    }
                    return;
                }
                return;
            default:
                k90 k90Var = (k90) this.f19569v;
                String message = th.getMessage();
                synchronized (k90Var) {
                    k90Var.P1(new ja1(message, 7));
                }
                return;
        }
    }

    @Override // n1
    public q u(q qVar, q qVar2, q qVar3) {
        return ((j6.i) this.f19569v).u(qVar, qVar2, qVar3);
    }

    public r3.e v(int i) {
        return null;
    }

    public void w(lw lwVar, Thread thread, Throwable th) {
        oc.n nVar = (oc.n) this.f19569v;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y.a(nVar.e.u(new oc.k(nVar, System.currentTimeMillis(), th, thread, lwVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public boolean x(int i, int i10, Bundle bundle) {
        return false;
    }

    public void y() {
        t0.e eVar = (t0.e) this.f19569v;
        jf.d i = b9.i(0, eVar.f25619w);
        int i10 = i.f19189u;
        int i11 = i.f19190v;
        if (i10 <= i11) {
            while (true) {
                ((h) eVar.f25617u[i10]).f25406b.resumeWith(pe.z.f22715a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        eVar.j();
    }

    @Override // r
    public a0 get(int i) {
        return (b0) this.f19569v;
    }

    public /* synthetic */ i(int i, boolean z3) {
        this.f19568u = i;
    }

    public i(int i) {
        this.f19568u = i;
        switch (i) {
            case 13:
                this.f19569v = new HashSet();
                return;
            case 24:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f19569v = new r3.f(this);
                    return;
                } else {
                    this.f19569v = new r3.f(this);
                    return;
                }
            case 29:
                this.f19569v = new t0.e(new h[16]);
                return;
            default:
                this.f19569v = new LinkedHashSet();
                return;
        }
    }

    public i(y2.c cVar) {
        this.f19568u = 16;
        this.f19569v = new je.e(u1.f22268a, cVar);
    }

    public i(WorkDatabase workDatabase) {
        this.f19568u = 0;
        workDatabase.getClass();
        this.f19569v = workDatabase;
    }

    public i(q5.b bVar) {
        this.f19568u = 26;
        bVar.getClass();
        this.f19569v = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[LOOP:1: B:14:0x0047->B:15:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 17
            r0.f19568u = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            s[][] r4 = new s[r2]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            s[] r11 = new s[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            s r12 = new s
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.f19569v = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.i.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ic.c, q3.g] */
    public i(View view) {
        this.f19568u = 21;
        if (Build.VERSION.SDK_INT >= 30) {
            ic.c cVar = new ic.c(23, view);
            cVar.f23393w = view;
            this.f19569v = cVar;
            return;
        }
        this.f19569v = new ic.c(23, view);
    }

    public /* synthetic */ i(int i, Object obj) {
        this.f19568u = i;
        this.f19569v = obj;
    }

    public i(d dVar) {
        this.f19568u = 20;
        this.f19569v = new CopyOnWriteArrayList();
        new HashMap();
    }

    public i(float f10, float f11, q qVar) {
        r iVar;
        this.f19568u = 19;
        int[] iArr = o1.f22963a;
        if (qVar != null) {
            iVar = new ic.c(f10, f11, qVar);
        } else {
            iVar = new i(f10, f11);
        }
        this.f19569v = new j6.i(iVar);
    }

    public i(float f10, float f11) {
        this.f19568u = 18;
        this.f19569v = new b0(f10, f11, 0.01f);
    }

    public void k(int i, r3.e eVar, String str, Bundle bundle) {
    }
}