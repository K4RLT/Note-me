package i0;
import l.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import c0.b0;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.ay1;
import com.google.android.gms.internal.ads.bb;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.jj0;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.lb0;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.rj0;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.zb0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ka;
import com.google.android.gms.internal.mlkit_vision_digital_ink.la;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pa;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ta;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import eb.a2;
import eb.b3;
import eb.d1;
import eb.k0;
import eb.t1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import lb.g1;
import lb.v;
import n9.w;
import q.x;
import ya.q0;

/* loaded from: classes.dex */
public class m implements bb, n9.e, a10, s81, da, uq, mb.f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18053u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18054v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18055w;

    public m(Context context) {
        this.f18053u = 20;
        this.f18054v = new AtomicLong(-1L);
        this.f18055w = new da.f(context, ha.b.C, new fa.o("mlkit:vision"), da.e.f15820b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0271 A[LOOP:0: B:2:0x0012->B:33:0x0271, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0291 A[EDGE_INSN: B:34:0x0291->B:35:0x0291 BREAK  A[LOOP:0: B:2:0x0012->B:33:0x0271], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    @Override // com.google.android.gms.internal.ads.bb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.eb a(com.google.android.gms.internal.ads.gb r23) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.a(com.google.android.gms.internal.ads.gb):com.google.android.gms.internal.ads.eb");
    }

    @Override // mb.f
    public Object b() {
        return new v(((c4.n) ((k6.i) this.f18055w).f19569v).f3851u, (g1) ((mb.e) this.f18054v).b());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        Context e = ((s5) this.f18055w).e();
        q2 q2Var = (q2) ((tq) this.f18054v).c();
        Pattern pattern = com.google.android.gms.internal.mlkit_vision_digital_ink.l.f14581a;
        tc.c cVar = new tc.c(e, 1);
        cVar.m("mdd_pds_config");
        cVar.n(n5.i("DiagFileGroups", q2Var));
        Uri k3 = cVar.k();
        pa.f(k3);
        return k3;
    }

    @Override // n9.e
    public /* synthetic */ Object d(Object obj) {
        as asVar = (as) this.f18055w;
        try {
            ((ks) this.f18054v).C = (w) obj;
            asVar.f();
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new iw(asVar);
    }

    public Bundle e(String str) {
        Bundle bundle;
        o5.b bVar = (o5.b) this.f18055w;
        if (bVar.f21778b) {
            Bundle bundle2 = (Bundle) bVar.f21783h;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = q0.a(str, bundle2);
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                bVar.f21783h = null;
            }
            return bundle;
        }
        x.o("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public boolean f(j6.j jVar) {
        boolean containsKey;
        synchronized (this.f18054v) {
            containsKey = ((LinkedHashMap) this.f18055w).containsKey(jVar);
        }
        return containsKey;
    }

    public void g() {
        String str = (String) this.f18055w;
        try {
            tc.c cVar = (tc.c) this.f18054v;
            cVar.getClass();
            new File((File) cVar.f25699w, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.a10
    public /* synthetic */ void h(String str, int i, String str2, boolean z3) {
        lb0 lb0Var = (lb0) this.f18055w;
        Map map = (Map) this.f18054v;
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        lb0Var.f8004b.d(hashMap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pe.g] */
    public InputMethodManager i() {
        return (InputMethodManager) this.f18054v.getValue();
    }

    public m5.d j() {
        m5.d dVar;
        o5.b bVar = (o5.b) this.f18055w;
        synchronized (((n8.m) bVar.f21781f)) {
            Iterator it = ((LinkedHashMap) bVar.f21782g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                m5.d dVar2 = (m5.d) entry.getValue();
                if (kotlin.jvm.internal.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public void k() {
        String str = (String) this.f18055w;
        if (((FileChannel) this.f18054v) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.f18054v = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.f18054v;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.f18054v = null;
                throw new IllegalStateException(a.k("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    public void l(Throwable th) {
        t1 t1Var = (t1) this.f18054v;
        t1Var.u();
        t1Var.D = false;
        d1 d1Var = (d1) t1Var.f3443v;
        if (!d1Var.A.F(null, eb.v.E0)) {
            t1Var.Y();
            t1Var.f().A.f(th, "registerTriggerAsync failed with throwable");
            return;
        }
        t1Var.S().add((b3) this.f18055w);
        if (t1Var.E > 64) {
            t1Var.E = 1;
            t1Var.f().D.h("registerTriggerAsync failed. May try later. App ID, throwable", k0.y(d1Var.m().B()), k0.y(th.toString()));
            return;
        }
        t1Var.f().D.i("registerTriggerAsync failed. App ID, delay in seconds, throwable", k0.y(d1Var.m().B()), k0.y(String.valueOf(t1Var.E)), k0.y(th.toString()));
        int i = t1Var.E;
        if (t1Var.F == null) {
            t1Var.F = new a2(t1Var, d1Var, 0);
        }
        t1Var.F.b(i * AdError.NETWORK_ERROR_CODE);
        t1Var.E <<= 1;
    }

    public void m(String str, m5.d dVar) {
        dVar.getClass();
        o5.b bVar = (o5.b) this.f18055w;
        synchronized (((n8.m) bVar.f21781f)) {
            if (!((LinkedHashMap) bVar.f21782g).containsKey(str)) {
                ((LinkedHashMap) bVar.f21782g).put(str, dVar);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public b6.n n(j6.j jVar) {
        b6.n nVar;
        synchronized (this.f18054v) {
            nVar = (b6.n) ((LinkedHashMap) this.f18055w).remove(jVar);
        }
        return nVar;
    }

    public List o(String str) {
        List P;
        str.getClass();
        synchronized (this.f18054v) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f18055w;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.a(((j6.j) entry.getKey()).f18928a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f18055w).remove((j6.j) it.next());
                }
                P = qe.l.P(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return P;
    }

    public void p() {
        if (((o5.b) this.f18055w).f21779c) {
            m5.a aVar = (m5.a) this.f18054v;
            if (aVar == null) {
                aVar = new m5.a(this);
            }
            this.f18054v = aVar;
            try {
                androidx.lifecycle.l.class.getDeclaredConstructor(null);
                m5.a aVar2 = (m5.a) this.f18054v;
                if (aVar2 != null) {
                    aVar2.f20610a.add(androidx.lifecycle.l.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        x.o("Can not perform this action after onSaveInstanceState");
    }

    public b6.n q(j6.j jVar) {
        b6.n nVar;
        synchronized (this.f18054v) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f18055w;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new b6.n(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                nVar = (b6.n) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* synthetic */ void mo202r(Object obj) {
        hb hbVar = (hb) this.f18054v;
        rj0 rj0Var = (rj0) obj;
        synchronized (hbVar) {
            try {
                ((jj0) hbVar.D).b(rj0Var, (qp0) this.f18055w);
                qp0 a10 = ((jj0) hbVar.D).a();
                if (a10 != null) {
                    hbVar.A(a10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(zb0 zb0Var) {
        Iterator it = ((CopyOnWriteArrayList) this.f18054v).iterator();
        while (it.hasNext()) {
            ay1 ay1Var = (ay1) it.next();
            Object obj = ay1Var.f4636b;
            Handler handler = ay1Var.f4635a;
            pu1 pu1Var = new pu1(zb0Var, 3, obj);
            String str = bq0.f4860a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    pu1Var.run();
                } else {
                    handler.post(pu1Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        hb hbVar = (hb) this.f18054v;
        synchronized (hbVar) {
            try {
                jj0 jj0Var = (jj0) hbVar.D;
                qp0 qp0Var = (qp0) this.f18055w;
                jj0Var.c(qp0Var);
                qp0 a10 = ((jj0) hbVar.D).a();
                if (qp0Var.f9963v0) {
                    while (a10 != null) {
                        hbVar.A(a10);
                        a10 = ((jj0) hbVar.D).a();
                    }
                } else if (a10 != null) {
                    hbVar.A(a10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f18053u) {
            case 12:
                return ((da) this.f18054v).toString();
            default:
                return super.toString();
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((ks) this.f18054v).f7860u.getClass().getCanonicalName();
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
            as asVar = (as) this.f18055w;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        if (!((la) this.f18055w).compareAndSet(ka.f14564u, ka.f14566w)) {
            ta taVar = ta.B;
            if (taVar != null) {
                return taVar;
            }
            return new ta();
        }
        return ((da) this.f18054v).zza();
    }

    public /* synthetic */ m(int i, Object obj, Object obj2, boolean z3) {
        this.f18053u = i;
        this.f18055w = obj;
        this.f18054v = obj2;
    }

    public /* synthetic */ m(Object obj, int i, Object obj2) {
        this.f18053u = i;
        this.f18055w = obj2;
        this.f18054v = obj;
    }

    public /* synthetic */ m(int i) {
        this.f18053u = i;
    }

    public m(s6 s6Var) {
        this.f18053u = 3;
        nb nbVar = new nb(0, false);
        this.f18055w = s6Var;
        this.f18054v = nbVar;
    }

    public m(j6.c cVar, la laVar, da daVar) {
        this.f18053u = 12;
        this.f18055w = laVar;
        this.f18054v = daVar;
    }

    public m(o5.b bVar) {
        this.f18053u = 17;
        this.f18055w = bVar;
    }

    public m(String str) {
        this.f18053u = 15;
        this.f18055w = str.concat(".lck");
    }

    public m() {
        this.f18053u = 1;
        this.f18054v = new Object();
        this.f18055w = new LinkedHashMap();
    }

    public m(c0.d dVar, c0.n nVar, b0 b0Var) {
        this.f18053u = 19;
        this.f18055w = dVar;
        this.f18054v = nVar;
    }

    public m(View view) {
        this.f18053u = 0;
        this.f18055w = view;
        this.f18054v = pe.a.c(pe.h.f22691v, new a2.c(15, this));
    }
}
