package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: k */
    public static final t41 f9291k = new Object();

    /* renamed from: a */
    public et1 f9292a;

    /* renamed from: b */
    public a0 f9293b;

    /* renamed from: c */
    public final Object f9294c;

    /* renamed from: d */
    public final Context f9295d;
    public j e;

    /* renamed from: f */
    public Thread f9296f;

    /* renamed from: g */
    public d f9297g;

    /* renamed from: h */
    public l50 f9298h;
    public Boolean i;

    /* renamed from: j */
    public final bx1 f9299j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.bx1] */
    public p(Context context) {
        Context context2;
        ?? obj = new Object();
        j jVar = j.F;
        this.f9294c = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f9295d = context2;
        this.f9299j = obj;
        if (jVar != null) {
            this.e = jVar;
        } else {
            i iVar = new i(jVar);
            iVar.a(jVar);
            this.e = new j(iVar);
        }
        this.f9298h = l50.f7948b;
        if (this.e.A && context == null) {
            x21.F("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static Pair a(q[] qVarArr, int i) {
        for (int i10 = 0; i10 < 2; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null && qVar.f9685a.f6821c == i) {
                return Pair.create(qVar, Integer.valueOf(i10));
            }
        }
        return null;
    }

    public static final Pair b(int i, t tVar, int[][][] iArr, l lVar, Comparator comparator) {
        RandomAccess randomAccess;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            if (i == tVar2.f11205a[i10]) {
                zy1 zy1Var = tVar2.f11206b[i10];
                for (int i11 = 0; i11 < zy1Var.f13337a; i11++) {
                    hi a10 = zy1Var.a(i11);
                    y51 p10 = lVar.p(i10, a10, iArr[i10][i11]);
                    int i12 = a10.f6819a;
                    boolean[] zArr = new boolean[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i13 + 1;
                        m mVar = (m) p10.get(i13);
                        int a11 = mVar.a();
                        if (!zArr[i13] && a11 != 0) {
                            if (a11 == 1) {
                                randomAccess = d51.q(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                for (int i15 = i14; i15 < i12; i15++) {
                                    m mVar2 = (m) p10.get(i15);
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i13 = i14;
                    }
                }
            }
            i10++;
            tVar2 = tVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((m) list.get(i16)).f8195w;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new q(mVar3.f8194v, iArr2), Integer.valueOf(mVar3.f8193u));
    }

    public static String e(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static int f(mw1 mw1Var, String str, boolean z3) {
        if (!TextUtils.isEmpty(str) && str.equals(mw1Var.f8450d)) {
            return 4;
        }
        String e = e(str);
        String e8 = e(mw1Var.f8450d);
        if (e8 != null && e != null) {
            if (!e8.startsWith(e) && !e.startsWith(e8)) {
                String str2 = bq0.f4860a;
                if (!e8.split("-", 2)[0].equals(e.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z3 || e8 != null) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int g(com.google.android.gms.internal.ads.mw1 r5, com.google.android.gms.internal.ads.d51 r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            com.google.android.gms.internal.ads.d51 r3 = r5.f8449c
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.ox1 r3 = (com.google.android.gms.internal.ads.ox1) r3
            java.lang.String r3 = r3.f9262b
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p.g(com.google.android.gms.internal.ads.mw1, com.google.android.gms.internal.ads.d51):int");
    }

    public static final q h(zy1 zy1Var, int[][] iArr, j jVar) {
        jVar.f9891q.getClass();
        int i = 0;
        hi hiVar = null;
        h hVar = null;
        for (int i10 = 0; i10 < zy1Var.f13337a; i10++) {
            hi a10 = zy1Var.a(i10);
            int[] iArr2 = iArr[i10];
            for (int i11 = 0; i11 < a10.f6819a; i11++) {
                if (zw1.K(iArr2[i11], jVar.B)) {
                    h hVar2 = new h(a10.f6822d[i11], iArr2[i11]);
                    if (hVar != null) {
                        if (w41.f12133a.d(hVar2.f6517v, hVar.f6517v).d(hVar2.f6516u, hVar.f6516u).e() <= 0) {
                        }
                    }
                    hiVar = a10;
                    i = i11;
                    hVar = hVar2;
                }
            }
        }
        if (hiVar == null) {
            return null;
        }
        return new q(hiVar, new int[]{i});
    }

    public static void j(t tVar, qm qmVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            zy1 zy1Var = tVar.f11206b[i];
            for (int i10 = 0; i10 < zy1Var.f13337a; i10++) {
                if (qmVar.f9895u.get(zy1Var.a(i10)) != null) {
                    g5.q.b();
                    return;
                }
            }
        }
        zy1 zy1Var2 = tVar.f11208d;
        for (int i11 = 0; i11 < zy1Var2.f13337a; i11++) {
            if (qmVar.f9895u.get(zy1Var2.a(i11)) != null) {
                g5.q.b();
                return;
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (hashMap.get(Integer.valueOf(tVar.f11205a[i12])) != null) {
                g5.q.b();
                return;
            }
        }
    }

    public static void k(t tVar, j jVar, q[] qVarArr) {
        for (int i = 0; i < 2; i++) {
            zy1 zy1Var = tVar.f11206b[i];
            Map map = (Map) jVar.D.get(i);
            if (map != null && map.containsKey(zy1Var)) {
                Map map2 = (Map) jVar.D.get(i);
                if (map2 != null && map2.get(zy1Var) != null) {
                    g5.q.b();
                    return;
                }
                qVarArr[i] = null;
            }
        }
    }

    public static void l(t tVar, j jVar, q[] qVarArr) {
        for (int i = 0; i < 2; i++) {
            int i10 = tVar.f11205a[i];
            if (jVar.E.get(i) || jVar.f9896v.contains(Integer.valueOf(i10))) {
                qVarArr[i] = null;
            }
        }
    }

    public final void c() {
        d dVar;
        j0 j0Var;
        Handler handler;
        boolean z3;
        synchronized (this.f9294c) {
            try {
                Thread thread = this.f9296f;
                if (thread != null) {
                    if (thread == Thread.currentThread()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    b80.L("DefaultTrackSelector is accessed on the wrong thread.", z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f9297g) != null) {
            Spatializer spatializer = (Spatializer) dVar.f5230v;
            if (spatializer != null && (j0Var = (j0) dVar.f5232x) != null && (handler = (Handler) dVar.f5231w) != null) {
                spatializer.removeOnSpatializerStateChangedListener(j0Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.f9297g = null;
        }
        this.f9292a = null;
        this.f9293b = null;
    }

    public final void d(l50 l50Var) {
        if (this.f9298h.equals(l50Var)) {
            return;
        }
        this.f9298h = l50Var;
        i();
    }

    public final void i() {
        boolean z3;
        et1 et1Var;
        d dVar;
        synchronized (this.f9294c) {
            try {
                z3 = false;
                if (this.e.A && Build.VERSION.SDK_INT >= 32 && (dVar = this.f9297g) != null && dVar.f5229u) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3 && (et1Var = this.f9292a) != null) {
            et1Var.A.c(10);
        }
    }
}
