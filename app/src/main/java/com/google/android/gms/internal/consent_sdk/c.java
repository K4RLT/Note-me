package com.google.android.gms.internal.consent_sdk;
import b6.u;
import c.a;
import c4.n;
import d7.a;
import g2.a;
import j6.c;
import j6.n;
import k6.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.daren.scraply.MainActivity;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.o80;
import com.google.android.gms.internal.ads.tl;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.vl;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ab;
import com.google.android.gms.internal.mlkit_vision_digital_ink.eb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.jm;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements mb.f {
    public static c E;
    public Object A;
    public Object B;
    public Object C;
    public Object D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13370u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13371v;

    /* renamed from: w, reason: collision with root package name */
    public Object f13372w;

    /* renamed from: x, reason: collision with root package name */
    public Object f13373x;

    /* renamed from: y, reason: collision with root package name */
    public Object f13374y;

    /* renamed from: z, reason: collision with root package name */
    public Object f13375z;

    public c(Application application) {
        this.f13370u = 0;
        this.f13371v = this;
        a6 a6Var = new a6(8, application);
        this.f13372w = a6Var;
        d7 a10 = a(new e(a6Var, 1));
        this.f13373x = a10;
        d7 a11 = a(z.f13619b);
        this.f13374y = a11;
        d7 a12 = a(new a6(3, new b(this)));
        this.f13375z = a12;
        e4 e4Var = new e4(a6Var, a10, 1);
        d7 a13 = a(new j4(24));
        this.A = a13;
        f fVar = new f(a6Var, a10, a(new e4(a6Var, a(new e(a6Var, 0)), 0)));
        this.D = fVar;
        d7 a14 = a(new ra.e(12, a11, a6Var, a(new e(a6Var, 2))));
        this.B = a14;
        this.C = a(new n(a10, new u(a6Var, a11, a10, a12, e4Var, new n(a13, fVar, a10, a14, 2), a13, a14), a12, a14, 3));
    }

    public static c d(MainActivity mainActivity) {
        c cVar;
        synchronized (c.class) {
            try {
                if (E == null) {
                    Application application = (Application) mainActivity.getApplicationContext();
                    application.getClass();
                    E = new c(application);
                }
                cVar = E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x041a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(n8.i r48, int r49) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.a(n8.i, int):void");
    }

    @Override // mb.f
    public Object b() {
        switch (this.f13370u) {
            case 5:
                Context context = ((n) ((i) this.f13371v).f19569v).f3851u;
                Object b10 = ((mb.e) this.f13372w).b();
                Object b11 = ((mb.e) this.f13373x).b();
                mb.e eVar = new mb.e(new i(9, (ic.c) this.f13374y));
                Object b12 = ((mb.e) this.f13375z).b();
                Object b13 = ((mb.e) this.A).b();
                return new lb.s(context, (lb.t0) b10, (lb.l0) b11, eVar, (lb.n0) b12, (lb.e0) b13, new mb.e(new i(9, (mb.e) this.B)), new mb.e(new i(9, (mb.e) this.C)), (lb.f1) ((mb.e) this.D).b());
            default:
                Object b14 = ((mb.e) this.f13371v).b();
                mb.e eVar2 = new mb.e(new i(9, (ic.c) this.f13372w));
                Object b15 = ((ic.c) this.f13373x).b();
                mb.b bVar = (mb.b) ((mb.e) this.f13374y).b();
                Object b16 = ((mb.e) this.f13375z).b();
                Object b17 = ((mb.e) this.A).b();
                Object b18 = ((mb.e) this.B).b();
                return new lb.r1((lb.v) b14, eVar2, (lb.s) b15, bVar, (lb.n0) b17, (lb.e0) b18, new mb.e(new i(9, (mb.e) this.C)), (lb.f1) ((mb.e) this.D).b());
        }
    }

    public i20 c() {
        lo1.c((Context) this.f13373x, Context.class);
        lo1.c((HashMap) this.B, Map.class);
        lo1.c((wd) this.C, wd.class);
        lo1.c((yx0) this.D, yx0.class);
        return new i20((o80) this.f13371v, (tw) this.f13372w, (Context) this.f13373x, (View) this.f13374y, (Activity) this.f13375z, (String) this.A, (HashMap) this.B, (wd) this.C, (yx0) this.D);
    }

    public LinkedHashMap e(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            tl tlVar = (tl) ((HashMap) this.f13373x).get(str);
            if (tlVar == null) {
                tlVar = tl.f11370b;
            }
            linkedHashMap2.put(str, tlVar.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public void f(LinkedHashMap linkedHashMap, vl vlVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse((String) this.f13374y).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (vlVar != null) {
            String str = vlVar.f11933b;
            String str2 = vlVar.f11932a;
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("&it=");
                sb2.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("&blat=");
                sb2.append(str);
            }
            uri = sb2.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (((AtomicBoolean) this.C).get()) {
            File file = (File) this.D;
            try {
                if (file != null) {
                    try {
                        fileOutputStream = new FileOutputStream(file, true);
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        fileOutputStream.write(uri.getBytes());
                        fileOutputStream.write(10);
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e8) {
                            int i = k9.a0.f19634b;
                            l9.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                            return;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        int i10 = k9.a0.f19634b;
                        l9.i.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                return;
                            } catch (IOException e11) {
                                l9.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e12) {
                                int i11 = k9.a0.f19634b;
                                l9.i.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                            }
                        }
                        throw th;
                    }
                }
                int i12 = k9.a0.f19634b;
                l9.i.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            k9.f0 f0Var = f9.k.C.f16813c;
            new k9.u((Context) this.f13375z, (String) this.A, uri, null).r();
        }
    }

    public ya g() {
        ya yaVar;
        synchronized (this.B) {
            ya yaVar2 = (ya) this.D;
            if (yaVar2 != null && yaVar2.isDone()) {
                try {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.n5.r((ya) this.D);
                } catch (ExecutionException unused) {
                    this.D = null;
                }
            }
            if (((ya) this.D) == null) {
                this.D = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.n(((j6.c) this.C).p(com.google.android.gms.internal.mlkit_vision_digital_ink.a(new com.google.android.gms.internal.mlkit_vision_digital_ink.z0(this, 1)), (eb) this.f13374y));
            }
            yaVar = (ya) this.D;
        }
        return yaVar;
    }

    public /* synthetic */ c(o80 o80Var, tw twVar) {
        this.f13370u = 2;
        this.f13371v = o80Var;
        this.f13372w = twVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.f13370u = i;
        this.f13371v = obj;
        this.f13372w = obj2;
        this.f13373x = obj3;
        this.f13374y = obj4;
        this.f13375z = obj5;
        this.A = obj6;
        this.B = obj7;
        this.C = obj8;
        this.D = obj9;
    }

    public c(int i) {
        this.f13370u = i;
        switch (i) {
            case 3:
                return;
            default:
                this.f13371v = new ArrayBlockingQueue(100);
                this.f13372w = new LinkedHashMap();
                this.f13373x = new HashMap();
                this.B = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
                return;
        }
    }

    public c(String str, va vaVar, com.google.android.gms.internal.mlkit_vision_digital_ink.h1 h1Var, ab abVar, com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar, jm jmVar) {
        this.f13370u = 4;
        this.B = new Object();
        this.C = new j6.c(11);
        this.D = null;
        this.f13371v = str;
        this.f13372w = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.n(vaVar);
        this.f13373x = h1Var;
        this.f13374y = new eb(abVar);
        this.f13375z = iVar;
        this.A = jmVar;
    }
}
