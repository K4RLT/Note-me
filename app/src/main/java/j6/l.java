package j6;
import c.c;
import d.b;
import d.c;
import q.h;
import q.x;
import r.e;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.WindowInsetsAnimation;
import androidx.datastore.preferences.protobuf.s1;
import androidx.work.impl.WorkDatabase_Impl;
import c7.x;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.eu1;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.g21;
import com.google.android.gms.internal.ads.gr0;
import com.google.android.gms.internal.ads.hu1;
import com.google.android.gms.internal.ads.jv1;
import com.google.android.gms.internal.ads.ku1;
import com.google.android.gms.internal.ads.ms;
import com.google.android.gms.internal.ads.pd1;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.re0;
import com.google.android.gms.internal.ads.s91;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.vs;
import com.google.android.gms.internal.ads.wd1;
import com.google.android.gms.internal.ads.wl;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.xl;
import com.google.android.gms.internal.ads.yi0;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.yx;
import com.google.android.gms.internal.ads.zd0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dt;
import com.google.android.gms.internal.mlkit_vision_digital_ink.eb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.es;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fa;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fs;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g8;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ga;
import com.google.android.gms.internal.mlkit_vision_digital_ink.h4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.h8;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ha;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ht;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i8;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.rl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ss;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.xs;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y6;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import com.google.android.gms.internal.mlkit_vision_digital_ink.z4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.zw;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import lb.k0;
import lb.o0;
import lb.q0;
import lb.r0;
import lb.s0;
import lb.t0;
import lb.t1;
import n9.z;
import org.json.JSONException;
import org.json.JSONObject;
import ya.j1;

/* loaded from: classes.dex */
public final class l implements n9.e, a10, gr0, wd1, re0, b0, da, zw, s0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18932u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18933v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18934w;

    public l(IBinder iBinder) {
        this.f18932u = 1;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f18933v = new Messenger(iBinder);
            this.f18934w = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f18934w = new ba.g(iBinder);
            this.f18933v = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            s1.b();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b0
    public n a(com.google.android.gms.internal.measurement.n nVar) {
        n u9 = ((n) this.f18933v).u();
        String str = (String) this.f18934w;
        u9.w(str, nVar);
        ((HashMap) u9.f18941y).put(str, Boolean.TRUE);
        return u9;
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [lb.o0, java.lang.Object] */
    @Override // lb.s0
    public Object b() {
        r0 r0Var;
        boolean z3;
        t0 t0Var = (t0) this.f18933v;
        Bundle bundle = (Bundle) this.f18934w;
        HashMap hashMap = t0Var.f20281c;
        mb.e eVar = t0Var.e;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            g21 g21Var = t0Var.a(i).f20236c;
            String str = (String) g21Var.f6276d;
            int i10 = bundle.getInt(j1.a("status", str));
            int i11 = g21Var.f6274b;
            if (lb.a.c(i11, i10)) {
                t0.f20278f.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i11));
                int i12 = g21Var.f6274b;
                if (i12 == 4) {
                    ((t1) eVar.b()).f(i, str);
                } else if (i12 == 5) {
                    ((t1) eVar.b()).b(i);
                } else if (i12 == 6) {
                    ((t1) eVar.b()).g(Arrays.asList(str));
                }
            } else {
                g21Var.f6274b = i10;
                if (i10 != 5 && i10 != 6 && i10 != 4) {
                    ArrayList arrayList = (ArrayList) g21Var.f6277f;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        r0 r0Var2 = (r0) obj;
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(j1.b("chunk_intents", str, r0Var2.f20244a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (parcelableArrayList.get(i14) != null && ((Intent) parcelableArrayList.get(i14)).getData() != null) {
                                    ((o0) r0Var2.f20247d.get(i14)).f20220a = true;
                                }
                            }
                        }
                    }
                } else {
                    t0Var.b(new x(t0Var, i, 15));
                    t0Var.f20280b.b(str);
                }
            }
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                String str2 = stringArrayList.get(0);
                long j10 = bundle.getLong(j1.a("pack_version", str2));
                String string = bundle.getString(j1.a("pack_version_tag", str2), "");
                int i15 = bundle.getInt(j1.a("status", str2));
                long j11 = bundle.getLong(j1.a("total_bytes_to_download", str2));
                List stringArrayList2 = bundle.getStringArrayList(j1.a("slice_ids", str2));
                ArrayList arrayList2 = new ArrayList();
                if (stringArrayList2 == null) {
                    stringArrayList2 = Collections.EMPTY_LIST;
                }
                Iterator it = stringArrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    List parcelableArrayList2 = bundle.getParcelableArrayList(j1.b("chunk_intents", str2, str3));
                    ArrayList arrayList3 = new ArrayList();
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = Collections.EMPTY_LIST;
                    }
                    Iterator it2 = parcelableArrayList2.iterator();
                    while (it2.hasNext()) {
                        if (((Intent) it2.next()) != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Iterator it3 = it;
                        Object obj2 = new Object();
                        obj2.f20220a = z3;
                        arrayList3.add(obj2);
                        it = it3;
                    }
                    Iterator it4 = it;
                    String string2 = bundle.getString(j1.b("uncompressed_hash_sha256", str2, str3));
                    long j12 = bundle.getLong(j1.b("uncompressed_size", str2, str3));
                    int i16 = bundle.getInt(j1.b("patch_format", str2, str3), 0);
                    if (i16 != 0) {
                        r0Var = new r0(str3, string2, j12, arrayList3, 0, i16);
                    } else {
                        r0Var = new r0(str3, string2, j12, arrayList3, bundle.getInt(j1.b("compression_format", str2, str3), 0), 0);
                    }
                    arrayList2.add(r0Var);
                    it = it4;
                }
                hashMap.put(Integer.valueOf(i), new q0(i, bundle.getInt("app_version_code"), new g21(str2, j10, i15, j11, arrayList2, string)));
            } else {
                throw new k0("Session without pack received.");
            }
        }
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.zw
    /* renamed from: c */
    public void mo217c() {
        ((ss) this.f18933v).getClass();
        va vaVar = va.f15125v;
    }

    @Override // n9.e
    public /* bridge */ /* synthetic */ Object d(Object obj) {
        try {
            ((vs) this.f18933v).k1(new ms(0, (z) obj));
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new et((as) this.f18934w);
    }

    @Override // com.google.android.gms.internal.ads.wd1
    public Object e(s91 s91Var) {
        return ((vd1) this.f18933v).a(s91Var.f10566a, ((xd1) this.f18934w).zzb());
    }

    @Override // com.google.android.gms.internal.ads.re0
    public /* synthetic */ void f(Object obj, jv1 jv1Var) {
        hu1 hu1Var = (hu1) obj;
        hu1Var.l((eu1) this.f18934w, new c(jv1Var, ((ku1) this.f18933v).e));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.zw
    public ya g(z4 z4Var) {
        rl rlVar = new rl(7, this);
        z4Var.getClass();
        h4 s10 = h4.s(new pd1(z4Var, rlVar));
        fa faVar = new fa(4);
        Executor executor = (Executor) this.f18934w;
        int i = g2.f14354a;
        xe xeVar = new xe(q1.b(), 14, faVar);
        ha haVar = new ha(s10, false);
        haVar.H = new ga(haVar, xeVar, executor, 1);
        haVar.w();
        return haVar;
    }

    @Override // com.google.android.gms.internal.ads.a10
    public void h(String str, int i, String str2, boolean z3) {
        yx yxVar = (yx) this.f18934w;
        if (z3) {
            if (((Boolean) g9.e.f17698c.a(sl.M2)).booleanValue()) {
                a5.a.u(f9.k.C.f16819k, (zd0) this.f18933v, "rendering-webview-load-html-end");
            }
            yxVar.b(null);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Ad Web View failed to load. Error code: ");
        sb2.append(i);
        sb2.append(", Description: ");
        sb2.append(str);
        yxVar.c(new Exception(a5.a.k(sb2, ", Failing URL: ", str2)));
    }

    public File i() {
        if (((File) this.f18933v) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f18933v) == null) {
                        bc.g gVar = (bc.g) this.f18934w;
                        gVar.a();
                        this.f18933v = new File(gVar.f3177a.getFilesDir(), "PersistedInstallation." + ((bc.g) this.f18934w).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f18933v;
    }

    public void j(id.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f18424a);
            jSONObject.put("Status", q0.b(aVar.f18425b));
            jSONObject.put("AuthToken", aVar.f18426c);
            jSONObject.put("RefreshToken", aVar.f18427d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f18428f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f18429g);
            bc.g gVar = (bc.g) this.f18934w;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f3177a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(i())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public id.a k() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(i());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = q0.c(5)[optInt];
        if (i != 0) {
            if (i == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new id.a(optString, i, optString2, optString3, optLong2, optLong, optString4);
            }
            x.o("Missing required properties:".concat(str));
            return null;
        }
        g5.h("Null registrationStatus");
        return null;
    }

    public String toString() {
        switch (this.f18932u) {
            case 18:
                return "Bounds{lower=" + ((j3.c) this.f18933v) + " upper=" + ((j3.c) this.f18934w) + "}";
            default:
                return super.toString();
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            ((vs) this.f18933v).r(aVar.a());
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        dt dtVar = (dt) this.f18933v;
        y6 y6Var = (y6) this.f18934w;
        String str = y6Var.f15279a;
        int i = h8.f14398a;
        i8 t3 = g8.f14365a.t();
        t3.b(str);
        ht htVar = new ht(t3.c().toString());
        es t10 = fs.t();
        t10.m(str);
        t10.n(dtVar.f14213a.getPackageName());
        u0 u0Var = new u0(dtVar, htVar, (fs) t10.i(), y6Var, str, 2);
        s5 s5Var = dtVar.f14219h;
        eb ebVar = dtVar.f14218g;
        return n5.q(s5Var.i(u0Var, ebVar), new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(q1.b(), 3, new xs(dtVar, y6Var)), ebVar);
    }

    public l(fp fpVar, fp fpVar2) {
        this.f18932u = 14;
        this.f18934w = fpVar;
        this.f18933v = fpVar2;
    }

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.f18932u = i;
        this.f18933v = obj;
        this.f18934w = obj2;
    }

    public /* synthetic */ l(int i, Object obj) {
        this.f18932u = i;
        this.f18934w = obj;
    }

    public l(wl wlVar) {
        this.f18932u = 3;
        this.f18934w = wlVar;
        this.f18933v = new HashMap();
    }

    public l(com.google.android.gms.internal.ads.dt dtVar, vs vsVar, as asVar) {
        this.f18932u = 4;
        this.f18933v = vsVar;
        this.f18934w = asVar;
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f18932u = 0;
        this.f18933v = workDatabase_Impl;
        this.f18934w = new b(workDatabase_Impl, 3);
    }

    public l() {
        this.f18932u = 17;
        this.f18933v = new LinkedHashMap();
        this.f18934w = new LinkedHashMap();
    }

    public l(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f18932u = 18;
        lowerBound = bounds.getLowerBound();
        this.f18933v = j3.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f18934w = j3.c(upperBound);
    }

    @Override // com.google.android.gms.internal.ads.gr0
    /* renamed from: zza, reason: collision with other method in class */
    public void mo227zza() {
        yi0 yi0Var = (yi0) this.f18933v;
        xl xlVar = (xl) this.f18934w;
        yl ylVar = (yl) yi0Var.f12887d;
        Parcel g22 = ylVar.g2();
        qh.e(g22, xlVar);
        ylVar.v2(g22, 1);
    }
}