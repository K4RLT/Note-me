package ra;
import a.a;

import a1.n;
import a7.k;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.t0;
import androidx.lifecycle.y;
import b2.f1;
import b2.f2;
import b2.u;
import b2.v1;
import b3.s;
import c4.a0;
import c4.t;
import c4.w;
import c4.z;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.consent_sdk.a6;
import com.google.android.gms.internal.consent_sdk.c0;
import com.google.android.gms.internal.consent_sdk.d0;
import com.google.android.gms.internal.consent_sdk.d7;
import com.google.android.gms.internal.consent_sdk.e7;
import com.google.android.gms.internal.consent_sdk.f0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ab;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ac;
import com.google.android.gms.internal.mlkit_vision_digital_ink.cx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ex;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.j2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.jr;
import com.google.android.gms.internal.mlkit_vision_digital_ink.js;
import com.google.android.gms.internal.mlkit_vision_digital_ink.kb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.l;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.m;
import com.google.android.gms.internal.mlkit_vision_digital_ink.m0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.nw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.o2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ow;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pa;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.sl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.vq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.x0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import com.google.android.gms.internal.mlkit_vision_digital_ink.z4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.zb;
import d1.q;
import ib.h;
import ib.o;
import j2.j;
import j6.p;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n.i0;
import qe.x;
import wa.h8;
import z1.j0;

/* loaded from: classes.dex */
public class e implements y9.a, n, r0.c, ib.c, e7, ib.a, ib.g, uq, da {

    /* renamed from: y, reason: collision with root package name */
    public static e f24673y;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24674u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24675v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24676w;

    /* renamed from: x, reason: collision with root package name */
    public Object f24677x;

    public e(Class cls) {
        this.f24674u = 2;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.f24675v = randomUUID;
        String uuid = ((UUID) this.f24675v).toString();
        uuid.getClass();
        this.f24676w = new p(uuid, 0, cls.getName(), (String) null, (a6.g) null, (a6.g) null, 0L, 0L, 0L, (a6.d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.b(1));
        linkedHashSet.add(strArr[0]);
        this.f24677x = linkedHashSet;
    }

    public static final SharedPreferences D(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void E(Context context) {
        String str;
        SharedPreferences D = D(context);
        if (!D.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new Exception("Failed to store the app set ID last used time.");
        }
    }

    public static boolean t(Editable editable, KeyEvent keyEvent, boolean z3) {
        a0[] a0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (a0VarArr = (a0[]) editable.getSpans(selectionStart, selectionEnd, a0.class)) != null && a0VarArr.length > 0) {
                for (a0 a0Var : a0VarArr) {
                    int spanStart = editable.getSpanStart(a0Var);
                    int spanEnd = editable.getSpanEnd(a0Var);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A() {
        i0 i0Var = (i0) this.f24675v;
        String str = (String) this.f24676w;
        List list = (List) i0Var.k(str);
        if (list != null) {
            list.remove((df.a) this.f24677x);
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            i0Var.m(str, list);
        }
    }

    public ya B(String str) {
        cx.l("%s: submitting request for in-progress download future with key: %s", str);
        xe xeVar = new xe(this, 16, str);
        Executor executor = (Executor) this.f24676w;
        j6.c cVar = (j6.c) ((s5) ((s5) this.f24675v).f14961v).f14961v;
        int i = g2.f14354a;
        xe xeVar2 = new xe(q1.b(), 14, xeVar);
        cVar.getClass();
        executor.getClass();
        return cVar.p(new s5(cVar, xeVar2), executor);
    }

    public jr C() {
        vq vqVar = (vq) this.f24675v;
        vqVar.getClass();
        if (((String) this.f24676w) == null) {
            this.f24676w = "Download result code: ".concat(String.valueOf(vqVar.name()));
        }
        return new jr(this);
    }

    @Override // y9.a
    public o a() {
        h hVar = new h();
        ((ExecutorService) this.f24677x).execute(new pu1(this, 26, hVar));
        return hVar.f18363a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        switch (this.f24674u) {
            case 22:
                s0 s0Var = (s0) ((tq) this.f24675v).c();
                Executor executor = (Executor) ((tq) this.f24677x).c();
                k kVar = u2.f15041a;
                return new ex(s0Var, executor);
            default:
                Context e = ((s5) this.f24676w).e();
                q2 q2Var = (q2) ((tq) this.f24677x).c();
                pw pwVar = (pw) this.f24675v;
                pwVar.getClass();
                Pattern pattern = l.f14581a;
                tc.c cVar = new tc.c(e, 1);
                cVar.m("mdd_pds_config");
                cVar.n(n5.i("LoggingState", q2Var));
                Uri k3 = cVar.k();
                m0 a10 = n0.a();
                a10.b(k3);
                a10.a(js.u());
                a10.c(false);
                u0 u0Var = new u0(e.getApplicationContext(), (ab) pwVar.f14821v);
                u0Var.f15038x = nw.q("gms_icing_mdd_network_usage_monitor", q2Var);
                int i = 3;
                u0Var.f15040z = new s5(i, new ow(i));
                a10.e(new x0(u0Var));
                s0 p10 = ((u0) pwVar.f14822w).p(a10.d());
                pa.f(p10);
                return p10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object clone() {
        switch (this.f24674u) {
            case 13:
                com.google.android.gms.internal.measurement.c cVar = (com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.c) this.f24675v).clone();
                int i = 0;
                e eVar = new e(13, (boolean) (0 == true ? 1 : 0));
                eVar.f24675v = cVar;
                eVar.f24676w = (com.google.android.gms.internal.measurement.c) cVar.clone();
                eVar.f24677x = new ArrayList();
                ArrayList arrayList = (ArrayList) this.f24677x;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) eVar.f24677x).add((com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.c) obj).clone());
                }
                return eVar;
            default:
                return super.clone();
        }
    }

    @Override // r0.c
    public void d(int i, Object obj) {
        ((b2.i0) this.f24677x).B(i, (b2.i0) obj);
    }

    @Override // r0.c
    public void e(Object obj) {
        ((ArrayList) this.f24676w).add(this.f24677x);
        this.f24677x = obj;
    }

    @Override // ib.c
    public void f(o oVar) {
        ba.b bVar = (ba.b) this.f24675v;
        String str = (String) this.f24676w;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f24677x;
        synchronized (bVar.f3116a) {
            bVar.f3116a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // ib.a
    public Object g(o oVar) {
        Exception i;
        m mVar;
        q2 s2Var;
        zb zbVar;
        sl slVar = (sl) this.f24675v;
        je.b bVar = (je.b) this.f24676w;
        y2 y2Var = (y2) this.f24677x;
        Log.i("MddModelManager", "download: complete");
        if (oVar.l()) {
            mVar = (m) oVar.j();
            i = null;
        } else {
            i = oVar.i();
            mVar = null;
        }
        ArrayList arrayList = new ArrayList();
        Throwable th = i;
        while (th != null && !(th instanceof jr) && !(th instanceof o2)) {
            th = th.getCause();
        }
        if (th instanceof jr) {
            arrayList.add(Integer.valueOf(((jr) th).f14530u.f15147u));
        } else if (th instanceof o2) {
            z4 z4Var = ((o2) th).f14731u;
            int i10 = z4Var.f15327x;
            for (int i11 = 0; i11 < i10; i11++) {
                Throwable th2 = (Throwable) z4Var.get(i11);
                if (th2 instanceof jr) {
                    arrayList.add(Integer.valueOf(((jr) th2).f14530u.f15147u));
                }
            }
        }
        le.a aVar = slVar.e;
        if (mVar == null) {
            s2Var = j2.f14494u;
        } else {
            s2Var = new s2(mVar.y());
        }
        long a10 = y2Var.a(TimeUnit.MILLISECONDS);
        aVar.getClass();
        if (s2Var.c()) {
            zbVar = (zb) le.a.f20330b.get(s2Var.a());
        } else {
            zbVar = null;
        }
        if (zbVar == null) {
            zbVar = zb.DOWNLOAD_NULL_RESULT;
        }
        le.c cVar = new le.c(aVar.f20332a, 314);
        cVar.f(zbVar);
        cVar.d(bVar);
        cVar.c(a10);
        if (!arrayList.isEmpty()) {
            kb kbVar = cVar.f20338a;
            kbVar.b();
            ac.v((ac) kbVar.f14430v, arrayList);
        }
        cVar.g();
        if (mVar != null) {
            Log.i("MddModelManager", "download: returned with status ".concat(String.valueOf(mVar.y())));
            int ordinal = mVar.y().ordinal();
            if (ordinal == 0 || ordinal == 2 || ordinal == 3) {
                q.x.o(g3.a.g(mVar.y().f14046u, "Download failed with status: "));
                return null;
            }
        }
        if (i == null) {
            return h8.e(null);
        }
        Log.i("MddModelManager", "download: failed with exception: ".concat(String.valueOf(i.getLocalizedMessage())));
        throw i;
    }

    @Override // r0.c
    public void h() {
        e1.c cVar;
        b2.i0 i0Var = (b2.i0) this.f24677x;
        f1 f1Var = i0Var.Z;
        if (!i0Var.I()) {
            y1.a("onReuse is only expected on attached node");
        }
        s sVar = i0Var.I;
        if (sVar != null) {
            View view = sVar.f1671v;
            if (view.getParent() != sVar) {
                sVar.addView(view);
            } else {
                sVar.f1675z.invoke();
            }
        }
        j0 j0Var = i0Var.f1479b0;
        if (j0Var != null) {
            j0Var.e(false);
        }
        i0Var.N = false;
        if (i0Var.f1488k0) {
            i0Var.f1488k0 = false;
        } else {
            q qVar = (b2.g2) i0Var.Z.f1460z;
            for (q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f15692y) {
                if (qVar2.H) {
                    qVar2.T0();
                }
            }
            for (q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.f15692y) {
                if (qVar3.H) {
                    qVar3.V0();
                }
            }
            while (qVar != null) {
                if (qVar.H) {
                    qVar.P0();
                }
                qVar = qVar.f15692y;
            }
        }
        int i = i0Var.f1490v;
        i0Var.f1490v = j2.k.f18817a.addAndGet(1);
        v1 v1Var = i0Var.H;
        if (v1Var != null) {
            c2.x xVar = (c2.x) v1Var;
            xVar.getLayoutNodes().g(i);
            xVar.getLayoutNodes().i(i0Var.f1490v, i0Var);
        }
        for (q qVar4 = (q) f1Var.A; qVar4 != null; qVar4 = qVar4.f15693z) {
            qVar4.O0();
        }
        f1Var.p();
        if (f1Var.n(8)) {
            i0Var.G();
        }
        b2.i0.W(i0Var);
        v1 v1Var2 = i0Var.H;
        if (v1Var2 != null) {
            c2.x xVar2 = (c2.x) v1Var2;
            if (c2.x.e() && (cVar = xVar2.f3690c0) != null) {
                c2.x xVar3 = cVar.f15877c;
                pd.c cVar2 = cVar.f15875a;
                n.x xVar4 = cVar.f15881h;
                if (xVar4.e(i)) {
                    cVar2.o(xVar3, i, false);
                }
                j x9 = i0Var.x();
                if (x9 != null && x9.f18813u.b(j2.s.f18853q)) {
                    xVar4.a(i0Var.f1490v);
                    cVar2.o(xVar3, i0Var.f1490v, true);
                }
            }
            xVar2.getRectManager().f(i0Var, true);
        }
    }

    public void i(b2.i0 i0Var, u uVar) {
        z5.h hVar = (z5.h) this.f24675v;
        z5.h hVar2 = (z5.h) this.f24676w;
        z5.h hVar3 = (z5.h) this.f24677x;
        int ordinal = uVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (i0Var.B != null) {
                            hVar3.c(i0Var);
                            return;
                        } else {
                            hVar2.c(i0Var);
                            return;
                        }
                    }
                    l4.a.o();
                    return;
                }
                if (i0Var.B != null) {
                    hVar3.c(i0Var);
                    return;
                } else {
                    hVar.c(i0Var);
                    return;
                }
            }
            hVar2.c(i0Var);
            hVar3.c(i0Var);
            return;
        }
        hVar.c(i0Var);
        hVar3.c(i0Var);
    }

    @Override // r0.c
    public void j(int i, int i10, int i11) {
        ((b2.i0) this.f24677x).M(i, i10, i11);
    }

    @Override // r0.c
    public void k(int i, int i10) {
        ((b2.i0) this.f24677x).Q(i, i10);
    }

    @Override // r0.c
    public void l() {
        this.f24677x = ((ArrayList) this.f24676w).remove(r0.size() - 1);
    }

    public a6.s m() {
        boolean z3;
        a6.s sVar = new a6.s((UUID) this.f24675v, (p) this.f24676w, (LinkedHashSet) this.f24677x);
        a6.d dVar = ((p) this.f24676w).f18951j;
        if (dVar.f264h.isEmpty() && !dVar.f261d && !dVar.f259b && !dVar.f260c) {
            z3 = false;
        } else {
            z3 = true;
        }
        p pVar = (p) this.f24676w;
        if (pVar.f18958q) {
            if (!z3) {
                if (pVar.f18949g > 0) {
                    q.x.n("Expedited jobs cannot be delayed");
                    return null;
                }
            } else {
                q.x.n("Expedited jobs only support network and storage constraints");
                return null;
            }
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.f24675v = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        p pVar2 = (p) this.f24676w;
        pVar2.getClass();
        this.f24676w = new p(uuid, pVar2.f18945b, pVar2.f18946c, pVar2.f18947d, new a6.g(pVar2.e), new a6.g(pVar2.f18948f), pVar2.f18949g, pVar2.f18950h, pVar2.i, new a6.d(pVar2.f18951j), pVar2.f18952k, pVar2.f18953l, pVar2.f18954m, pVar2.f18955n, pVar2.f18956o, pVar2.f18957p, pVar2.f18958q, pVar2.f18959r, pVar2.f18960s, pVar2.f18962u, pVar2.f18963v, pVar2.f18964w, 524288);
        return sVar;
    }

    @Override // r0.c
    public /* bridge */ /* synthetic */ void n(int i, Object obj) {
    }

    @Override // r0.c
    public void o() {
        v1 v1Var = ((b2.i0) this.f24675v).H;
        if (v1Var != null) {
            ((c2.x) v1Var).x();
        }
    }

    @Override // r0.c
    public Object p() {
        return this.f24677x;
    }

    @Override // ib.g
    public o q(Object obj) {
        q2 s2Var;
        zb zbVar;
        ke.a aVar = (ke.a) this.f24675v;
        ce.c cVar = (ce.c) this.f24676w;
        y2 y2Var = (y2) this.f24677x;
        m mVar = (m) obj;
        Log.i("MddModelManager", "getDownloadedFilesForModel(): started");
        Log.i("MddModelManager", "getDownloadedFilesForModel(): acquired result.");
        if (mVar == null) {
            s2Var = j2.f14494u;
        } else {
            s2Var = new s2(mVar.y());
        }
        le.a aVar2 = aVar.e;
        long a10 = y2Var.a(TimeUnit.MILLISECONDS);
        aVar2.getClass();
        je.b bVar = (je.b) cVar;
        if (s2Var.c()) {
            zbVar = (zb) le.a.f20331c.get(s2Var.a());
        } else {
            zbVar = null;
        }
        if (zbVar == null) {
            zbVar = zb.GET_DOWNLOADED_FILES_NULL_RESULT;
        }
        le.c cVar2 = new le.c(aVar2.f20332a, 314);
        cVar2.f(zbVar);
        cVar2.d(bVar);
        cVar2.c(a10);
        cVar2.g();
        if (mVar == null) {
            Log.e("MddModelManager", "getDownloadedFilesForModel(): Resulting file group empty.");
            return h8.e(null);
        }
        int ordinal = mVar.y().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw new RuntimeException(null, null);
                }
            } else {
                return h8.e(new ke.b(aVar.f14975c, mVar));
            }
        }
        Log.e("MddModelManager", "getDownloadedFilesForModel(): Resulting file not correctly downloaded. State: " + mVar.y().f14046u);
        return h8.e(null);
    }

    public void r() {
        ((ArrayList) this.f24676w).clear();
        this.f24677x = this.f24675v;
        ((b2.i0) this.f24675v).P();
    }

    public boolean s(b2.i0 i0Var) {
        boolean z3;
        boolean z9;
        if (i0Var.B == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!((f2) ((z5.h) this.f24675v).f31922v).contains(i0Var) && !((f2) ((z5.h) this.f24676w).f31922v).contains(i0Var)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z3 || !z9) {
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f24674u) {
            case 15:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f24675v);
                sb2.append('{');
                e eVar = (e) ((e) this.f24676w).f24677x;
                String str = "";
                while (eVar != null) {
                    Object obj = eVar.f24676w;
                    sb2.append(str);
                    String str2 = (String) eVar.f24675v;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    eVar = (e) eVar.f24677x;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 26:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f24675v);
                sb3.append('{');
                com.google.android.gms.internal.play_billing.l lVar = ((com.google.android.gms.internal.play_billing.l) this.f24676w).f15480b;
                String str3 = "";
                while (lVar != null) {
                    Object obj2 = lVar.f15479a;
                    sb3.append(str3);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    lVar = lVar.f15480b;
                    str3 = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f24675v;
        cd.f fVar = new cd.f(byteArrayOutputStream, hashMap, (HashMap) this.f24676w, (zc.d) this.f24677x);
        if (obj == null) {
            return;
        }
        zc.d dVar = (zc.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public boolean v(CharSequence charSequence, int i, int i10, z zVar) {
        int i11;
        if ((zVar.f3880c & 3) == 0) {
            c4.d dVar = (c4.d) this.f24677x;
            d4.a b10 = zVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.f15727x).getShort(a10 + b10.f15724u);
            }
            dVar.getClass();
            ThreadLocal threadLocal = c4.d.f3827b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i < i10) {
                sb2.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f3828a;
            String sb3 = sb2.toString();
            int i12 = j3.d.f18878a;
            boolean hasGlyph = textPaint.hasGlyph(sb3);
            int i13 = zVar.f3880c & 4;
            if (hasGlyph) {
                i11 = i13 | 2;
            } else {
                i11 = i13 | 1;
            }
            zVar.f3880c = i11;
        }
        if ((zVar.f3880c & 3) != 2) {
            return false;
        }
        return true;
    }

    public boolean w() {
        boolean z3;
        if (((f2) ((z5.h) this.f24675v).f31922v).isEmpty() && ((f2) ((z5.h) this.f24677x).f31922v).isEmpty() && ((f2) ((z5.h) this.f24676w).f31922v).isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public void x(androidx.lifecycle.o oVar) {
        t0 t0Var = (t0) this.f24677x;
        if (t0Var != null) {
            t0Var.run();
        }
        t0 t0Var2 = new t0((y) this.f24675v, oVar);
        this.f24677x = t0Var2;
        ((Handler) this.f24676w).postAtFrontOfQueue(t0Var2);
    }

    public Object y(CharSequence charSequence, int i, int i10, int i11, boolean z3, c4.q qVar) {
        int i12;
        w wVar;
        char c10;
        t tVar = new t((w) ((j6.n) this.f24676w).f18940x);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i13 = 0;
        boolean z9 = true;
        int i14 = i;
        loop0: while (true) {
            i12 = i14;
            while (i14 < i10 && i13 < i11 && z9) {
                SparseArray sparseArray = ((w) tVar.f3862f).f3871a;
                if (sparseArray == null) {
                    wVar = null;
                } else {
                    wVar = (w) sparseArray.get(codePointAt);
                }
                if (tVar.f3859b != 2) {
                    if (wVar == null) {
                        tVar.a();
                        c10 = 1;
                    } else {
                        tVar.f3859b = 2;
                        tVar.f3862f = wVar;
                        tVar.f3861d = 1;
                        c10 = 2;
                    }
                } else {
                    if (wVar != null) {
                        tVar.f3862f = wVar;
                        tVar.f3861d++;
                    } else {
                        if (codePointAt == 65038) {
                            tVar.a();
                        } else if (codePointAt != 65039) {
                            w wVar2 = (w) tVar.f3862f;
                            if (wVar2.f3872b != null) {
                                if (tVar.f3861d == 1) {
                                    if (tVar.b()) {
                                        tVar.f3863g = (w) tVar.f3862f;
                                        tVar.a();
                                    } else {
                                        tVar.a();
                                    }
                                } else {
                                    tVar.f3863g = wVar2;
                                    tVar.a();
                                }
                                c10 = 3;
                            } else {
                                tVar.a();
                            }
                        }
                        c10 = 1;
                    }
                    c10 = 2;
                }
                tVar.f3860c = codePointAt;
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            if (z3 || !v(charSequence, i12, i14, ((w) tVar.f3863g).f3872b)) {
                                z9 = qVar.e(charSequence, i12, i14, ((w) tVar.f3863g).f3872b);
                                i13++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i14;
                        if (charCount < i10) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i14 = charCount;
                    }
                } else {
                    i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (i14 < i10) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                }
            }
        }
        if (tVar.f3859b == 2 && ((w) tVar.f3862f).f3872b != null && ((tVar.f3861d > 1 || tVar.b()) && i13 < i11 && z9 && (z3 || !v(charSequence, i12, i14, ((w) tVar.f3862f).f3872b)))) {
            qVar.e(charSequence, i12, i14, ((w) tVar.f3862f).f3872b);
        }
        return qVar.getResult();
    }

    public void z(long j10) {
        TimeUnit.MILLISECONDS.getClass();
        ((p) this.f24676w).f18949g = j10;
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((p) this.f24676w).f18949g) {
            return;
        }
        q.x.n("The given initial delay is too large and will cause an overflow!");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        String str = (String) this.f24676w;
        e eVar = (e) this.f24675v;
        lx lxVar = (lx) this.f24677x;
        try {
            HashMap hashMap = (HashMap) eVar.f24677x;
            hashMap.size();
            hashMap.put(str, lxVar);
            return va.f15125v;
        } catch (Exception e) {
            cx.j(e, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", str);
            return n5.l(e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public Object zzb() {
        Application application = (Application) ((a6) this.f24676w).f13354v;
        c0 c0Var = d0.f13388b;
        f0.c(c0Var);
        return new com.google.android.gms.internal.consent_sdk.y(application, c0Var, (com.google.android.gms.internal.consent_sdk.x) ((d7) this.f24677x).zzb(), false);
    }

    public /* synthetic */ e(int i, boolean z3) {
        this.f24674u = i;
    }

    public /* synthetic */ e(sl slVar, je.b bVar, ce.b bVar2, y2 y2Var) {
        this.f24674u = 18;
        this.f24675v = slVar;
        this.f24676w = bVar;
        this.f24677x = y2Var;
    }

    public e(Context context) {
        this.f24674u = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f24676w = newSingleThreadScheduledExecutor;
        this.f24677x = Executors.newSingleThreadExecutor();
        this.f24675v = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new qb.t(1, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(Executor executor) {
        this.f24674u = 25;
        this.f24675v = new s5(22);
        this.f24677x = new HashMap();
        this.f24676w = executor;
    }

    public e(float[] fArr, float[] fArr2, long[] jArr) {
        this.f24674u = 29;
        int length = fArr.length;
        boolean z3 = false;
        if (length == fArr2.length && (jArr == null || length == jArr.length)) {
            z3 = true;
        }
        fa.y.k(z3);
        this.f24675v = fArr;
        this.f24676w = fArr2;
        this.f24677x = jArr;
    }

    public e(String str, int i) {
        this.f24674u = i;
        switch (i) {
            case 26:
                Object obj = new Object();
                this.f24676w = obj;
                this.f24677x = obj;
                this.f24675v = str;
                return;
            default:
                e eVar = new e(14, false);
                this.f24676w = eVar;
                this.f24677x = eVar;
                this.f24675v = str;
                return;
        }
    }

    public e(androidx.lifecycle.z zVar) {
        this.f24674u = 4;
        this.f24675v = new y(zVar, true);
        this.f24676w = new Handler();
    }

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f24674u = i;
        this.f24675v = obj;
        this.f24676w = obj2;
        this.f24677x = obj3;
    }

    public e(j6.n nVar, de.b bVar, c4.d dVar, Set set) {
        this.f24674u = 10;
        this.f24675v = bVar;
        this.f24676w = nVar;
        this.f24677x = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            y(str, 0, str.length(), 1, true, new c4.s(str, 0));
        }
    }

    public e(b2.i0 i0Var) {
        this.f24674u = 7;
        this.f24675v = i0Var;
        this.f24676w = new ArrayList();
        this.f24677x = i0Var;
    }

    public e(int i) {
        this.f24674u = i;
        switch (i) {
            case 6:
                this.f24675v = new z5.h(3);
                this.f24676w = new z5.h(3);
                this.f24677x = new z5.h(3);
                return;
            default:
                List list = Collections.EMPTY_LIST;
                this.f24675v = list;
                this.f24676w = list;
                return;
        }
    }
}
