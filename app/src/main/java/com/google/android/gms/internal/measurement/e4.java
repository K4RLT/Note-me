package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.ay;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.c90;
import com.google.android.gms.internal.ads.dr0;
import com.google.android.gms.internal.ads.hr0;
import com.google.android.gms.internal.ads.is;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.kr0;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.lx0;
import com.google.android.gms.internal.ads.o81;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.wr1;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xr1;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.zx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.jm;
import com.google.android.gms.internal.mlkit_vision_digital_ink.p8;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tr;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e4 implements c4, n9.e, s81, da, ib.c, p8.b, s0.j0, wc.a {

    /* renamed from: x, reason: collision with root package name */
    public static e4 f13726x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13727u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13728v;

    /* renamed from: w, reason: collision with root package name */
    public Object f13729w;

    public e4(gw gwVar) {
        this.f13727u = 17;
        Context context = (Context) gwVar.f14386v;
        int e = oc.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f13728v = "Unity";
            String string = context.getResources().getString(e);
            this.f13729w = string;
            String k3 = g3.a.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", k3, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f13728v = "Flutter";
                this.f13729w = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f13728v = null;
                this.f13729w = null;
            }
        }
        this.f13728v = null;
        this.f13729w = null;
    }

    @Override // s0.j0
    public List a(Integer num) {
        List a10 = ((s0.j0) this.f13728v).a(null);
        r0.e2 e2Var = (r0.e2) this.f13729w;
        int i = e2Var.f24236v;
        if (i < 0) {
            return a10;
        }
        return qe.l.E(wa.m.a(e2Var, num, i, Integer.valueOf(e2Var.D(i, e2Var.f24218b))), a10);
    }

    public z1.p0 b() {
        return (z1.p0) ((r0.i1) this.f13729w).getValue();
    }

    public void c(boolean z3, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f13728v)) {
            hashMap = new HashMap((Map) this.f13728v);
        }
        synchronized (((Map) this.f13729w)) {
            hashMap2 = new HashMap((Map) this.f13729w);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                g5.q.b();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((ib.h) entry2.getKey()).c(new da.d(status));
            }
        }
    }

    @Override // n9.e
    public Object d(Object obj) {
        as asVar = (as) this.f13728v;
        n9.k kVar = (n9.k) obj;
        try {
            ((ks) this.f13729w).f7864y = ((j8.a) kVar).f19038c;
            asVar.f();
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new is(asVar);
    }

    public long e() {
        return ((com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f13728v).a((Uri) this.f13729w);
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        kb.m mVar = (kb.m) this.f13728v;
        ib.h hVar = (ib.h) this.f13729w;
        synchronized (mVar.f19759f) {
            mVar.e.remove(hVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.sw1] */
    public void g(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f13729w;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f13729w = null;
        }
        create = LoudnessCodecController.create(i, o81.f9033u, new Object());
        this.f13729w = create;
        Iterator it = ((HashSet) this.f13728v).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    @Override // oe.a
    public Object get() {
        return new o8.d((Context) ((p8.c) this.f13728v).f22619u, (j.i0) ((k6.i) this.f13729w).get());
    }

    @Override // wc.a
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        wc.a[] aVarArr = (wc.a[]) this.f13728v;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            wc.a aVar = aVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.h(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((nf.a) this.f13729w).h(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public void i(dr0 dr0Var) {
        qf qfVar = new qf(5, (jh0) this.f13728v);
        wx wxVar = (wx) this.f13729w;
        ac.b j10 = wxVar.j(qfVar);
        j10.a(new t81(j10, 0, new lx0(this, 26, dr0Var)), wxVar);
    }

    public void j(wr1 wr1Var) {
        ((List) this.f13728v).add(wr1Var);
    }

    public long k(InputStream inputStream, long j10) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.h s5Var;
        com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f13728v;
        Uri uri = (Uri) this.f13729w;
        long a10 = iVar.a(uri);
        if (j10 <= a10) {
            if (j10 > 0) {
                s5Var = new jm(7);
            } else {
                s5Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.s5(2);
            }
            OutputStream outputStream = (OutputStream) iVar.c(uri, s5Var);
            try {
                long a11 = p8.a(inputStream, outputStream);
                outputStream.close();
                return j10 + a11;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j10), Long.valueOf(a10)));
    }

    public void l(wr1 wr1Var) {
        ((List) this.f13729w).add(wr1Var);
    }

    public xr1 m() {
        return new xr1((List) this.f13728v, (List) this.f13729w);
    }

    public void n(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (((HashSet) this.f13728v).remove(mediaCodec) && (loudnessCodecController = (LoudnessCodecController) this.f13729w) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L32;
     */
    @Override // com.google.android.gms.internal.measurement.c4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f13728v
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L9c
            boolean r2 = com.google.android.gms.internal.measurement.a4.f13637b
            r3 = 1
            if (r2 == 0) goto Ld
            goto L5a
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.a4> r2 = com.google.android.gms.internal.measurement.a4.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.a4.f13637b     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L5a
        L16:
            r10 = move-exception
            goto L9a
        L19:
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            r7 = 0
            if (r4 > r5) goto L50
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.a4.f13636a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2d
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.a4.f13636a = r5     // Catch: java.lang.Throwable -> L16
        L2d:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.a4.f13636a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L32
            goto L55
        L32:
            boolean r8 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L43
            if (r8 != 0) goto L51
            android.os.UserHandle r8 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L43
            boolean r0 = r5.isUserRunning(r8)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L43
            if (r0 != 0) goto L50
            goto L51
        L43:
            r5 = move-exception
            java.lang.String r7 = "DirectBootUtils"
            java.lang.String r8 = "Failed to check if user is unlocked."
            android.util.Log.w(r7, r8, r5)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.a4.f13636a = r6     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L1a
        L50:
            r3 = r7
        L51:
            if (r3 == 0) goto L55
            com.google.android.gms.internal.measurement.a4.f13636a = r6     // Catch: java.lang.Throwable -> L16
        L55:
            if (r3 == 0) goto L59
            com.google.android.gms.internal.measurement.a4.f13637b = r3     // Catch: java.lang.Throwable -> L16
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
        L5a:
            if (r3 != 0) goto L5d
            goto L9c
        L5d:
            com.google.android.gms.internal.ads.x90 r0 = new com.google.android.gms.internal.ads.x90     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            r2 = 12
            r0.<init>(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            r0.f12502v = r9     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            r0.f12503w = r10     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            java.lang.Object r0 = r0.m()     // Catch: java.lang.SecurityException -> L6d java.lang.NullPointerException -> L7b java.lang.IllegalStateException -> L7f
            goto L78
        L6d:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            java.lang.Object r0 = r0.m()     // Catch: java.lang.Throwable -> L81
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
        L78:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            return r0
        L7b:
            r0 = move-exception
            goto L86
        L7d:
            r0 = move-exception
            goto L86
        L7f:
            r0 = move-exception
            goto L86
        L81:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            throw r0     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
        L86:
            java.lang.String r2 = "GservicesLoader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to read GServices for: "
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            android.util.Log.e(r2, r10, r0)
            return r1
        L9a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r10
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e4.o(java.lang.String):java.lang.Object");
    }

    public Set p(a60 a60Var) {
        return Collections.singleton(new c90(a60Var, xx.f12657h));
    }

    public Set q(a60 a60Var) {
        return Collections.singleton(new c90(a60Var, xx.f12657h));
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f13727u) {
            case 5:
                ((ay) this.f13728v).mo205l(obj);
                return;
            default:
                ((kr0) ((k60) this.f13729w).f7670f).f7853c.P1(new bl0(4, (hr0) this.f13728v));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f13727u) {
            case 5:
                ((zx) this.f13729w).mo212zza();
                return;
            default:
                ((kr0) ((k60) this.f13729w).f7670f).f7853c.P1(new gw((hr0) this.f13728v, 8, th));
                return;
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((ks) this.f13729w).f7860u.getClass().getCanonicalName();
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to loaded mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            l9.i.a(sb2.toString());
            as asVar = (as) this.f13728v;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(new dw((tr) com.google.android.gms.internal.mlkit_vision_digital_ink.n5.r((ya) this.f13728v), (tr) com.google.android.gms.internal.mlkit_vision_digital_ink.n5.r((ya) this.f13729w)));
    }

    public /* synthetic */ e4(int i, boolean z3) {
        this.f13727u = i;
    }

    public /* synthetic */ e4(Object obj, int i, Object obj2) {
        this.f13727u = i;
        this.f13728v = obj2;
        this.f13729w = obj;
    }

    public e4(int i, int i10) {
        List arrayList;
        Object arrayList2;
        this.f13727u = 10;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.f13728v = arrayList;
        if (i10 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i10);
        }
        this.f13729w = arrayList2;
    }

    public e4(c2.b bVar, ay ayVar, zx zxVar) {
        this.f13727u = 5;
        this.f13728v = ayVar;
        this.f13729w = zxVar;
    }

    public e4(int i) {
        this.f13727u = i;
        switch (i) {
            case 11:
                this.f13728v = new HashSet();
                return;
            case 14:
                this.f13728v = Collections.synchronizedMap(new WeakHashMap());
                this.f13729w = Collections.synchronizedMap(new WeakHashMap());
                return;
            default:
                this.f13728v = null;
                this.f13729w = null;
                return;
        }
    }

    public e4(Context context) {
        this.f13727u = 0;
        this.f13728v = context;
        ContentObserver contentObserver = new ContentObserver(null);
        this.f13729w = contentObserver;
        context.getContentResolver().registerContentObserver(x3.f13964a, true, contentObserver);
    }

    public e4(wc.a[] aVarArr) {
        this.f13727u = 20;
        this.f13728v = aVarArr;
        this.f13729w = new Object();
    }

    public e4(b2.i0 i0Var, z1.p0 p0Var) {
        this.f13727u = 1;
        this.f13728v = i0Var;
        this.f13729w = r0.y.B(p0Var);
    }

    public /* synthetic */ e4(int i, Object obj, Object obj2, boolean z3) {
        this.f13727u = i;
        this.f13728v = obj;
        this.f13729w = obj2;
    }
}
