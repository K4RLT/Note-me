package j6;
import c.a;
import q.l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.gi0;
import com.google.android.gms.internal.ads.gu1;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.iq0;
import com.google.android.gms.internal.ads.is;
import com.google.android.gms.internal.ads.jv1;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.ma0;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.n30;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.x90;
import com.google.android.gms.internal.ads.y60;
import com.google.android.gms.internal.ads.yg1;
import com.google.android.gms.internal.ads.z11;
import com.google.android.gms.internal.consent_sdk.g7;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.hb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ia;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ka;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pa;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import eb.v2;
import g5.a0;
import j.i0;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import lb.b1;
import lb.j0;
import lb.p0;
import q.x;
import wa.la;
import ya.c0;
import ya.q0;

/* loaded from: classes.dex */
public class c implements qb, n9.e, s81, s90, uq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18913u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18914v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18915w;

    /* JADX WARN: Type inference failed for: r4v14, types: [tc.c, java.lang.Object, mb.f] */
    public c(c4.n nVar) {
        this.f18913u = 15;
        k6.i iVar = new k6.i(5, nVar);
        mb.e a10 = mb.e.a(new j0(iVar, 1));
        boolean z3 = false;
        mb.e a11 = mb.e.a(new i0.m(16, iVar, a10, z3));
        mb.e a12 = mb.e.a(p0.f20230b);
        mb.e a13 = mb.e.a(new mu(a11, 17, a10));
        mb.e a14 = mb.e.a(new lb.p(iVar, a12, a13, 0));
        mb.e a15 = mb.e.a(new j0(iVar, 2));
        ic.c cVar = new ic.c(14, z3);
        mb.e a16 = mb.e.a(lb.a.f20076b);
        mb.e a17 = mb.e.a(new i0(a11, cVar, a12, a16));
        ic.c cVar2 = new ic.c(14, false);
        mb.e a18 = mb.e.a(new lw(a17, cVar, mb.e.a(new u0(a11, cVar, cVar2, a12, a13, 7)), mb.e.a(new b1(a11, 1)), mb.e.a(new b1(a11, 0)), mb.e.a(new g9.n(a11, cVar, a17, a16, a12, a13, 10)), mb.e.a(new x90(a11, 17, cVar)), mb.e.a(new u0(a11, cVar, a17, a16, a12, 8)), mb.e.a(new i0(5, a17, a11, mb.e.a(new k6.i(3, cVar))))));
        mb.e a19 = mb.e.a(lb.a.f20075a);
        mb.e a20 = mb.e.a(new com.google.android.gms.internal.consent_sdk.c(iVar, a17, a18, cVar, a12, a19, a16, mb.e.a(p0.f20231c), a13, 5));
        if (((mb.e) cVar2.f18393v) == null) {
            cVar2.f18393v = a20;
            Object obj = new Object();
            obj.f25697u = a15;
            obj.f25698v = cVar2;
            obj.f25699w = a12;
            obj.f25700x = iVar;
            obj.f25701y = a10;
            obj.f25702z = a16;
            obj.A = a13;
            mb.e a21 = mb.e.a(new lb.p(iVar, a14, mb.e.a(obj), 1));
            if (((mb.e) cVar.f18393v) == null) {
                cVar.f18393v = a21;
                mb.e a22 = mb.e.a(new com.google.android.gms.internal.consent_sdk.c(a11, cVar, cVar2, mb.e.a(new k6.i(8, iVar)), a17, a12, a19, a16, a13, 6));
                this.f18914v = mb.e.a(new z11(a22, 15, iVar));
                this.f18915w = mb.e.a(new i(iVar, a11, a22, mb.e.a(new j0(iVar, 0))));
                return;
            }
            g5.l();
            throw null;
        }
        g5.l();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j6.c a(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2d java.io.IOException -> L2f
            j6.c r2 = new j6.c     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            r3 = 14
            r4 = 0
            r2.<init>(r3, r5, r0, r4)     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            return r2
        L24:
            r2 = move-exception
            goto L39
        L26:
            r2 = move-exception
            goto L39
        L28:
            r2 = move-exception
            goto L39
        L2a:
            r2 = move-exception
        L2b:
            r0 = r1
            goto L39
        L2d:
            r2 = move-exception
            goto L2b
        L2f:
            r2 = move-exception
            goto L2b
        L31:
            r2 = move-exception
        L32:
            r5 = r1
            r0 = r5
            goto L39
        L35:
            r2 = move-exception
            goto L32
        L37:
            r2 = move-exception
            goto L32
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a(android.content.Context):j6.c");
    }

    public ArrayList b(String str) {
        String string;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18914v;
        a0 k3 = a0.k(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (d2.isNull(0)) {
                    string = null;
                } else {
                    string = d2.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            d2.close();
            k3.m();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        Context e = ((s5) this.f18914v).e();
        q2 q2Var = (q2) ((tq) this.f18915w).c();
        Pattern pattern = com.google.android.gms.internal.mlkit_vision_digital_ink.l.f14581a;
        tc.c cVar = new tc.c(e, 1);
        cVar.m("mdd_pds_config");
        cVar.n(n5.i("DestSharedFiles", q2Var));
        Uri k3 = cVar.k();
        pa.f(k3);
        return k3;
    }

    @Override // n9.e
    public /* synthetic */ Object d(Object obj) {
        as asVar = (as) this.f18914v;
        try {
            ((ks) this.f18915w).D = (n9.h) obj;
            asVar.f();
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new is(asVar);
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
        Exception exc;
        try {
            iq0 iq0Var = (iq0) ((gi0) this.f18914v).f6407b;
            iq0Var.b(z3);
            try {
                iq0Var.f7192a.Y1(new oa.b(context));
            } finally {
            }
        } catch (dq0 e) {
            throw new Exception(e.getCause());
        }
    }

    public void f(Bundle bundle) {
        o5.b bVar = (o5.b) this.f18914v;
        m5.e eVar = (m5.e) bVar.f21780d;
        if (!bVar.f21777a) {
            bVar.c();
        }
        if (eVar.g().f1084d.compareTo(androidx.lifecycle.p.f1051x) < 0) {
            if (!bVar.f21778b) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundle2 = q0.a("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
                }
                bVar.f21783h = bundle2;
                bVar.f21778b = true;
                return;
            }
            x.o("SavedStateRegistry was already restored.");
            return;
        }
        l4.a.f(eVar.g().f1084d, "performRestore cannot be called when owner is ");
    }

    public void g(Bundle bundle) {
        o5.b bVar = (o5.b) this.f18914v;
        Bundle a10 = la.a((pe.j[]) Arrays.copyOf(new pe.j[0], 0));
        Bundle bundle2 = (Bundle) bVar.f21783h;
        if (bundle2 != null) {
            a10.putAll(bundle2);
        }
        synchronized (((n8.m) bVar.f21781f)) {
            for (Map.Entry entry : ((LinkedHashMap) bVar.f21782g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle a11 = ((m5.d) entry.getValue()).a();
                str.getClass();
                a11.getClass();
                a10.putBundle(str, a11);
            }
        }
        if (!a10.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", a10);
        }
    }

    public void h() {
        try {
            ((FileLock) this.f18915w).release();
            ((FileChannel) this.f18914v).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void i(b6.n nVar, ra.e eVar) {
        ((m6.a) this.f18915w).a(new ba.j((b6.h) this.f18914v, nVar, eVar));
    }

    public void j(b6.n nVar, int i) {
        nVar.getClass();
        ((m6.a) this.f18915w).a(new ma0((b6.h) this.f18914v, nVar, false, i));
    }

    public void k(n nVar, ra.e eVar) {
        int i;
        TreeMap treeMap = (TreeMap) this.f18915w;
        j6 j6Var = new j6(eVar);
        TreeMap treeMap2 = (TreeMap) this.f18914v;
        for (Integer num : treeMap2.keySet()) {
            com.google.android.gms.internal.measurement.c cVar = (com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.c) eVar.f24676w).clone();
            com.google.android.gms.internal.measurement.n e = ((com.google.android.gms.internal.measurement.o) treeMap2.get(num)).e(nVar, Collections.singletonList(j6Var));
            if (e instanceof com.google.android.gms.internal.measurement.g) {
                i = o0.j(((com.google.android.gms.internal.measurement.g) e).f13756u.doubleValue());
            } else {
                i = -1;
            }
            if (i == 2 || i == -1) {
                eVar.f24676w = cVar;
            }
        }
        Iterator it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.n e8 = ((com.google.android.gms.internal.measurement.o) treeMap.get((Integer) it.next())).e(nVar, Collections.singletonList(j6Var));
            if (e8 instanceof com.google.android.gms.internal.measurement.g) {
                o0.j(((com.google.android.gms.internal.measurement.g) e8).f13756u.doubleValue());
            }
        }
    }

    public Enum m(Object obj) {
        Enum r02 = (Enum) ((Map) this.f18915w).get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public boolean n(int i) {
        return ((jv1) this.f18914v).f7550a.get(i);
    }

    public Object o(yg1 yg1Var) {
        Object obj = ((Map) this.f18914v).get(yg1Var);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(yg1Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Executor, com.google.android.gms.internal.mlkit_vision_digital_ink.la, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public ya p(da daVar, Executor executor) {
        executor.getClass();
        AtomicReference atomicReference = new AtomicReference(ka.f14564u);
        atomicReference.f14600v = executor;
        atomicReference.f14599u = this;
        i0.m mVar = new i0.m(this, (com.google.android.gms.internal.mlkit_vision_digital_ink.la) atomicReference, daVar);
        AtomicReference atomicReference2 = (AtomicReference) this.f18914v;
        Object obj = new Object();
        ya yaVar = (ya) atomicReference2.getAndSet(obj);
        hb hbVar = new hb(mVar);
        yaVar.g(hbVar, atomicReference);
        ya n10 = n5.n(hbVar);
        g7 g7Var = new g7(hbVar, obj, yaVar, n10, atomicReference, 1);
        ia iaVar = ia.f14473u;
        n10.g(g7Var, iaVar);
        hbVar.g(g7Var, iaVar);
        return n10;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* synthetic */ void mo202r(Object obj) {
        switch (this.f18913u) {
            case 5:
                String str = (String) this.f18914v;
                String str2 = (String) obj;
                n30 n30Var = (n30) this.f18915w;
                n30Var.B.a(n30Var.A.b(n30Var.f8536y, n30Var.f8537z, false, str, str2, n30Var.c(), n30Var.I, n30Var.M), n30Var.H);
                return;
            default:
                ((h00) obj).h1((String) this.f18914v, (mp) this.f18915w);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f18913u) {
            case 5:
                n30 n30Var = (n30) this.f18915w;
                n30Var.B.a(n30Var.A.b(n30Var.f8536y, n30Var.f8537z, false, (String) this.f18914v, null, n30Var.c(), n30Var.I, n30Var.M), null);
                return;
            default:
                return;
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((ks) this.f18915w).f7860u.getClass().getCanonicalName();
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            l9.i.a(sb2.toString());
            as asVar = (as) this.f18914v;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.qb
    public File zza() {
        if (((File) this.f18914v) == null) {
            this.f18914v = new File(((Context) this.f18915w).getCacheDir(), "volley");
        }
        return (File) this.f18914v;
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f18915w;
    }

    private final void l(Throwable th) {
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, boolean z3) {
        this.f18913u = i;
        this.f18914v = obj;
        this.f18915w = obj2;
    }

    public c(Context context) {
        this.f18913u = 3;
        this.f18915w = context;
        this.f18914v = null;
    }

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f18913u = i;
        this.f18914v = obj2;
        this.f18915w = obj;
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f18913u = i;
        this.f18914v = obj2;
        this.f18915w = obj3;
    }

    public c(jv1 jv1Var, SparseArray sparseArray) {
        this.f18913u = 9;
        this.f18914v = jv1Var;
        SparseBooleanArray sparseBooleanArray = jv1Var.f7550a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            b80.N(i, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i);
            gu1 gu1Var = (gu1) sparseArray.get(keyAt);
            gu1Var.getClass();
            sparseArray2.append(keyAt, gu1Var);
        }
        this.f18915w = sparseArray2;
    }

    public c(v2 v2Var) {
        this.f18913u = 13;
        this.f18915w = v2Var;
    }

    public c(int i) {
        this.f18913u = i;
        switch (i) {
            case 11:
                this.f18914v = new AtomicReference(va.f15125v);
                this.f18915w = new ra.e(17, false);
                return;
            case 17:
                this.f18914v = new AtomicInteger();
                this.f18915w = new AtomicInteger();
                return;
            case 18:
                return;
            default:
                this.f18914v = new TreeMap();
                this.f18915w = new TreeMap();
                return;
        }
    }

    public c(o5.b bVar) {
        this.f18913u = 16;
        this.f18914v = bVar;
        this.f18915w = new i0.m(bVar);
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f18913u = 0;
        this.f18914v = workDatabase_Impl;
        this.f18915w = new b(workDatabase_Impl, 0);
    }

    public c(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18913u = 2;
        this.f18914v = r1;
        this.f18915w = r0;
        float[] fArr = {f10, f11, f12};
        float[] fArr2 = {f13, f14, f15};
    }

    public c(b6.h hVar, m6.a aVar) {
        this.f18913u = 1;
        hVar.getClass();
        aVar.getClass();
        this.f18914v = hVar;
        this.f18915w = aVar;
    }
}