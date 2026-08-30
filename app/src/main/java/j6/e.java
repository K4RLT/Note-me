package j6;
import q.f;
import q.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.e31;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.gi0;
import com.google.android.gms.internal.ads.gu1;
import com.google.android.gms.internal.ads.h0;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.h41;
import com.google.android.gms.internal.ads.hu1;
import com.google.android.gms.internal.ads.ie0;
import com.google.android.gms.internal.ads.iq0;
import com.google.android.gms.internal.ads.lt0;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.rs;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.sd1;
import com.google.android.gms.internal.ads.ud1;
import com.google.android.gms.internal.ads.uv1;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.vx1;
import com.google.android.gms.internal.ads.y60;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pa;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uq;
import g5.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import k9.a0;
import lb.q0;
import lb.s0;
import lb.t0;
import wa.l6;
import ya.c0;

/* loaded from: classes.dex */
public final class e implements fa.c, n9.e, s81, s90, ie0, uq, s0, ib.c, p8.b {

    /* renamed from: u, reason: collision with root package name */
    public Object f18918u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18919v;

    public e(int i) {
        switch (i) {
            case 8:
                lt0 lt0Var = new lt0(1);
                this.f18918u = lt0Var;
                this.f18919v = new bl0(6, lt0Var);
                return;
            case 9:
                this.f18918u = new HashMap();
                this.f18919v = new HashMap();
                return;
            case 18:
                this.f18918u = new Object();
                this.f18919v = new h0(16);
                return;
            default:
                this.f18918u = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x0072, TryCatch #0 {IOException -> 0x0072, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x0060), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [sg.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j6.e j(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L72
            sg.h[] r0 = new sg.h[r0]     // Catch: java.io.IOException -> L72
            sg.f r1 = new sg.f     // Catch: java.io.IOException -> L72
            r1.<init>()     // Catch: java.io.IOException -> L72
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L72
            if (r3 >= r4) goto L60
            r4 = r12[r3]     // Catch: java.io.IOException -> L72
            java.lang.String[] r5 = z6.a.f31932y     // Catch: java.io.IOException -> L72
            r6 = 34
            r1.H(r6)     // Catch: java.io.IOException -> L72
            int r7 = r4.length()     // Catch: java.io.IOException -> L72
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L72
            r11 = 128(0x80, float:1.794E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L72
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.N(r4, r9, r8)     // Catch: java.io.IOException -> L72
        L3d:
            r1.x(r10)     // Catch: java.io.IOException -> L72
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.N(r4, r9, r7)     // Catch: java.io.IOException -> L72
        L4a:
            r1.H(r6)     // Catch: java.io.IOException -> L72
            r1.readByte()     // Catch: java.io.IOException -> L72
            sg.h r4 = new sg.h     // Catch: java.io.IOException -> L72
            long r5 = r1.f25274v     // Catch: java.io.IOException -> L72
            byte[] r5 = r1.o(r5)     // Catch: java.io.IOException -> L72
            r4.<init>(r5)     // Catch: java.io.IOException -> L72
            r0[r3] = r4     // Catch: java.io.IOException -> L72
            int r3 = r3 + 1
            goto La
        L60:
            j6.e r1 = new j6.e     // Catch: java.io.IOException -> L72
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L72
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L72
            int r2 = sg.l.f25289w     // Catch: java.io.IOException -> L72
            sg.l r0 = ya.fc.b(r0)     // Catch: java.io.IOException -> L72
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L72
            return r1
        L72:
            r12 = move-exception
            g5.f(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.j(java.lang.String[]):j6.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList a() {
        Object arrayList;
        ArrayList arrayList2 = new ArrayList();
        ic.c cVar = (ic.c) this.f18919v;
        Context context = (Context) this.f18918u;
        Class cls = (Class) cVar.f18393v;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new hd.b(1, (String) it.next()));
        }
        return arrayList2;
    }

    @Override // lb.s0
    public Object b() {
        int i;
        t0 t0Var = (t0) this.f18918u;
        List list = (List) this.f18919v;
        t0Var.getClass();
        HashMap hashMap = new HashMap();
        for (q0 q0Var : t0Var.f20281c.values()) {
            String str = (String) q0Var.f20236c.f6276d;
            if (list.contains(str)) {
                q0 q0Var2 = (q0) hashMap.get(str);
                if (q0Var2 == null) {
                    i = -1;
                } else {
                    i = q0Var2.f20234a;
                }
                if (i < q0Var.f20234a) {
                    hashMap.put(str, q0Var);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        Context e = ((s5) this.f18918u).e();
        q2 q2Var = (q2) ((tq) this.f18919v).c();
        Pattern pattern = com.google.android.gms.internal.mlkit_vision_digital_ink.l.f14581a;
        tc.c cVar = new tc.c(e, 1);
        cVar.m("mdd_pds_config");
        cVar.n(n5.i("DiagSharedFiles", q2Var));
        Uri k3 = cVar.k();
        pa.f(k3);
        return k3;
    }

    @Override // n9.e
    public Object d(Object obj) {
        try {
            ((rs) this.f18918u).c0(new oa.b(((j8.a) ((n9.k) obj)).f19038c));
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new et((as) this.f18919v);
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
        Exception exc;
        try {
            iq0 iq0Var = (iq0) ((gi0) this.f18918u).f6407b;
            iq0Var.b(z3);
            try {
                iq0Var.f7192a.f0();
            } finally {
            }
        } catch (dq0 e) {
            int i = a0.f19634b;
            l9.i.g("Cannot show rewarded video.", e);
            throw new Exception(e.getCause());
        }
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        mb.n nVar = (mb.n) this.f18918u;
        ib.h hVar = (ib.h) this.f18919v;
        synchronized (nVar.f20784f) {
            nVar.e.remove(hVar);
        }
    }

    public Long g(String str) {
        v vVar = (v) this.f18918u;
        g5.a0 k3 = g5.a0.k(1, "SELECT long_value FROM Preference where `key`=?");
        k3.n(1, str);
        vVar.b();
        Cursor d2 = c0.d(vVar, k3, false);
        try {
            Long l10 = null;
            if (d2.moveToFirst() && !d2.isNull(0)) {
                l10 = Long.valueOf(d2.getLong(0));
            }
            return l10;
        } finally {
            d2.close();
            k3.m();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [w8.a, java.lang.Object] */
    @Override // oe.a
    public Object get() {
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = ((oe.a) this.f18918u).get();
        oe.a aVar = (oe.a) this.f18919v;
        return new u8.f(obj, obj2, u8.a.f27109f, (u8.h) obj3, aVar);
    }

    public void h(d dVar) {
        v vVar = (v) this.f18918u;
        vVar.b();
        vVar.c();
        try {
            ((b) this.f18919v).i(dVar);
            vVar.v();
        } finally {
            vVar.h();
        }
    }

    public AutofillId i(long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession k3 = uv1.k(this.f18918u);
            z5.h a10 = l6.a((View) this.f18919v);
            Objects.requireNonNull(a10);
            return f2.a.c(k3, ed.h.m(a10.f31922v), j10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0624, code lost:
    
        if ("return".equals(r3) != false) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:171:0x0403. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:194:0x05cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:334:0x09c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:429:0x0c2e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:447:0x0c79. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0024. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0036. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0c64  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, j6.n] */
    /* JADX WARN: Type inference failed for: r14v104, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r14v108, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v18, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v185, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v188, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v197 */
    /* JADX WARN: Type inference failed for: r14v218, types: [com.google.android.gms.internal.measurement.d] */
    /* JADX WARN: Type inference failed for: r14v223, types: [com.google.android.gms.internal.measurement.m] */
    /* JADX WARN: Type inference failed for: r14v226 */
    /* JADX WARN: Type inference failed for: r14v267, types: [com.google.android.gms.internal.measurement.p] */
    /* JADX WARN: Type inference failed for: r14v270 */
    /* JADX WARN: Type inference failed for: r14v271 */
    /* JADX WARN: Type inference failed for: r14v39, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v58, types: [com.google.android.gms.internal.measurement.o, com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r14v70, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r14v98, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v58, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v59, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v89, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v93, types: [com.google.android.gms.internal.measurement.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.n k(j6.n r13, com.google.android.gms.internal.measurement.n r14) {
        /*
            Method dump skipped, instructions count: 3846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.k(j6.n, com.google.android.gms.internal.measurement.n):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        ((hu1) obj).m((gu1) this.f18918u, (vx1) this.f18919v);
    }

    public void m(sd1 sd1Var) {
        if (sd1Var != null) {
            ud1 ud1Var = new ud1(sd1Var.f10594a, sd1Var.f10595b);
            HashMap hashMap = (HashMap) this.f18918u;
            if (hashMap.containsKey(ud1Var)) {
                sd1 sd1Var2 = (sd1) hashMap.get(ud1Var);
                if (sd1Var2.equals(sd1Var) && sd1Var.equals(sd1Var2)) {
                    return;
                } else {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ud1Var.toString()));
                }
            }
            hashMap.put(ud1Var, sd1Var);
            return;
        }
        g5.h("primitive constructor must be non-null");
    }

    public void n(com.google.android.gms.internal.measurement.s sVar) {
        ArrayList arrayList = sVar.f13905a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f18918u).put(((e0) obj).toString(), sVar);
        }
    }

    public synchronized void o(long j10, int i, long j11) {
        AtomicLong atomicLong = (AtomicLong) this.f18919v;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((ha.b) this.f18918u).d(new fa.n(0, Arrays.asList(new fa.k(24309, i, 0, j10, j11, null, null, 0, -1)))).d(new f3(this, elapsedRealtime, 6));
    }

    public void p(ArrayList arrayList) {
        h41 h41Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((q31) arrayList.get(i)).f9730a == 1) {
                try {
                    h41Var = new h41((q31) arrayList.get(i));
                } catch (e31 unused) {
                    h41Var = null;
                }
                this.f18919v = h41Var;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo202r(Object obj) {
        ((h00) obj).X0((String) this.f18918u, (mp) this.f18919v);
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
        synchronized (((mf) this.f18919v).f8338w) {
            ((fj) this.f18918u).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            ((rs) this.f18918u).r(aVar.a());
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f18919v;
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f18918u = obj2;
        this.f18919v = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f18918u = obj;
        this.f18919v = obj2;
    }

    public /* synthetic */ e(vd1 vd1Var) {
        this.f18918u = new HashMap(vd1Var.f11890a);
        this.f18919v = new HashMap(vd1Var.f11891b);
    }
}