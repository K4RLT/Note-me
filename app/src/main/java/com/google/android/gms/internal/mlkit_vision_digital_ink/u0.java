package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.internal.ads.rr0;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.zt0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u0 implements da, mb.f, m2.u, p8.b, s81 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15035u;

    /* renamed from: v, reason: collision with root package name */
    public Object f15036v;

    /* renamed from: w, reason: collision with root package name */
    public Object f15037w;

    /* renamed from: x, reason: collision with root package name */
    public Object f15038x;

    /* renamed from: y, reason: collision with root package name */
    public Object f15039y;

    /* renamed from: z, reason: collision with root package name */
    public Object f15040z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    public u0(m2.g gVar, m2.q0 q0Var, List list, y2.c cVar, q2.h hVar) {
        List list2;
        int i;
        String str;
        ArrayList arrayList;
        String str2;
        qe.s sVar;
        List list3;
        m2.g gVar2 = gVar;
        m2.q0 q0Var2 = q0Var;
        this.f15035u = 9;
        this.f15036v = gVar2;
        this.f15037w = list;
        final int i10 = 0;
        df.a aVar = new df.a(this) { // from class: m2.r

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u0 f20559v;

            {
                this.f20559v = this;
            }

            @Override // df.a
            public final Object invoke() {
                Object obj;
                float f10;
                Object obj2;
                float f11;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f20559v.f15040z;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float c10 = ((t) obj3).f20568a.c();
                            int i11 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i11);
                                    float c11 = ((t) obj4).f20568a.c();
                                    if (Float.compare(c10, c11) < 0) {
                                        obj3 = obj4;
                                        c10 = c11;
                                    }
                                    if (i11 != size) {
                                        i11++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        if (tVar != null) {
                            f10 = tVar.f20568a.c();
                        } else {
                            f10 = 0.0f;
                        }
                        return Float.valueOf(f10);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f20559v.f15040z;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c12 = ((t) obj5).f20568a.C.c();
                            int i12 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float c13 = ((t) obj6).f20568a.C.c();
                                    if (Float.compare(c12, c13) < 0) {
                                        obj5 = obj6;
                                        c12 = c13;
                                    }
                                    if (i12 != size2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        if (tVar2 != null) {
                            f11 = tVar2.f20568a.C.c();
                        } else {
                            f11 = 0.0f;
                        }
                        return Float.valueOf(f11);
                }
            }
        };
        pe.h hVar2 = pe.h.f22691v;
        this.f15038x = pe.a.c(hVar2, aVar);
        final int i11 = 1;
        this.f15039y = pe.a.c(hVar2, new df.a(this) { // from class: m2.r

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u0 f20559v;

            {
                this.f20559v = this;
            }

            @Override // df.a
            public final Object invoke() {
                Object obj;
                float f10;
                Object obj2;
                float f11;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f20559v.f15040z;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float c10 = ((t) obj3).f20568a.c();
                            int i112 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i112);
                                    float c11 = ((t) obj4).f20568a.c();
                                    if (Float.compare(c10, c11) < 0) {
                                        obj3 = obj4;
                                        c10 = c11;
                                    }
                                    if (i112 != size) {
                                        i112++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        if (tVar != null) {
                            f10 = tVar.f20568a.c();
                        } else {
                            f10 = 0.0f;
                        }
                        return Float.valueOf(f10);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f20559v.f15040z;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c12 = ((t) obj5).f20568a.C.c();
                            int i12 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float c13 = ((t) obj6).f20568a.C.c();
                                    if (Float.compare(c12, c13) < 0) {
                                        obj5 = obj6;
                                        c12 = c13;
                                    }
                                    if (i12 != size2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        if (tVar2 != null) {
                            f11 = tVar2.f20568a.C.c();
                        } else {
                            f11 = 0.0f;
                        }
                        return Float.valueOf(f11);
                }
            }
        });
        m2.v vVar = q0Var2.f20556b;
        m2.g gVar3 = m2.h.f20483a;
        ArrayList arrayList2 = gVar2.f20479x;
        String str3 = gVar2.f20477v;
        qe.s sVar2 = qe.s.f24023u;
        if (arrayList2 != null) {
            list2 = qe.l.K(arrayList2, new m2.f(1));
        } else {
            list2 = sVar2;
        }
        ArrayList arrayList3 = new ArrayList();
        qe.j jVar = new qe.j();
        int size = list2.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            m2.e eVar = (m2.e) list2.get(i12);
            m2.e a10 = m2.e.a(eVar, vVar.a((m2.v) eVar.f20451a), i10, 14);
            Object obj = a10.f20451a;
            int i14 = a10.f20453c;
            int i15 = a10.f20452b;
            while (i13 < i15 && !jVar.isEmpty()) {
                m2.e eVar2 = (m2.e) jVar.last();
                List list4 = list2;
                int i16 = eVar2.f20453c;
                qe.s sVar3 = sVar2;
                Object obj2 = eVar2.f20451a;
                if (i15 < i16) {
                    arrayList3.add(new m2.e(obj2, i13, i15));
                    i13 = i15;
                    list2 = list4;
                    sVar2 = sVar3;
                } else {
                    int i17 = size;
                    arrayList3.add(new m2.e(obj2, i13, i16));
                    i13 = eVar2.f20453c;
                    while (!jVar.isEmpty() && i13 == ((m2.e) jVar.last()).f20453c) {
                        jVar.removeLast();
                    }
                    list2 = list4;
                    sVar2 = sVar3;
                    size = i17;
                }
            }
            List list5 = list2;
            qe.s sVar4 = sVar2;
            int i18 = size;
            if (i13 < i15) {
                arrayList3.add(new m2.e(vVar, i13, i15));
                i13 = i15;
            }
            m2.e eVar3 = (m2.e) jVar.o();
            if (eVar3 != null) {
                int i19 = eVar3.f20453c;
                Object obj3 = eVar3.f20451a;
                int i20 = eVar3.f20452b;
                if (i20 == i15 && i19 == i14) {
                    jVar.removeLast();
                    jVar.addLast(new m2.e(((m2.v) obj3).a((m2.v) obj), i15, i14));
                } else if (i20 == i19) {
                    arrayList3.add(new m2.e(obj3, i20, i19));
                    jVar.removeLast();
                    jVar.addLast(new m2.e(obj, i15, i14));
                } else if (i19 >= i14) {
                    jVar.addLast(new m2.e(((m2.v) obj3).a((m2.v) obj), i15, i14));
                } else {
                    q.x.m();
                    throw null;
                }
            } else {
                jVar.addLast(new m2.e(obj, i15, i14));
            }
            i12++;
            list2 = list5;
            sVar2 = sVar4;
            size = i18;
            i10 = 0;
        }
        qe.s sVar5 = sVar2;
        while (i13 <= str3.length() && !jVar.isEmpty()) {
            m2.e eVar4 = (m2.e) jVar.last();
            Object obj4 = eVar4.f20451a;
            int i21 = eVar4.f20453c;
            arrayList3.add(new m2.e(obj4, i13, i21));
            while (!jVar.isEmpty() && i21 == ((m2.e) jVar.last()).f20453c) {
                jVar.removeLast();
            }
            i13 = i21;
        }
        if (i13 < str3.length()) {
            arrayList3.add(new m2.e(vVar, i13, str3.length()));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new m2.e(vVar, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i22 = i;
        while (i22 < size2) {
            m2.e eVar5 = (m2.e) arrayList3.get(i22);
            int i23 = eVar5.f20452b;
            int i24 = eVar5.f20453c;
            if (i23 != i24) {
                str = str3.substring(i23, i24);
            } else {
                str = "";
            }
            List a11 = m2.h.a(gVar2, i23, i24, new j7.p(5));
            m2.g gVar4 = new m2.g(str, a11 == null ? sVar5 : a11);
            m2.v vVar2 = (m2.v) eVar5.f20451a;
            if (vVar2.f20572b == Integer.MIN_VALUE) {
                arrayList = arrayList3;
                str2 = str3;
                vVar2 = new m2.v(vVar2.f20571a, vVar.f20572b, vVar2.f20573c, vVar2.f20574d, vVar2.e, vVar2.f20575f, vVar2.f20576g, vVar2.f20577h, vVar2.i);
            } else {
                arrayList = arrayList3;
                str2 = str3;
            }
            m2.q0 q0Var3 = new m2.q0(q0Var2.f20555a, vVar.a(vVar2));
            Object r52 = gVar4.f20476u;
            if (r52 == 0) {
                sVar = sVar5;
            } else {
                sVar = r52;
            }
            List list6 = (List) this.f15037w;
            ArrayList arrayList5 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i25 = 0;
            while (i25 < size3) {
                m2.e eVar6 = (m2.e) list6.get(i25);
                int i26 = eVar6.f20452b;
                m2.v vVar3 = vVar;
                int i27 = eVar6.f20453c;
                if (m2.h.b(i23, i24, i26, i27)) {
                    if (i23 > i26 || i27 > i24) {
                        s2.a.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList5.add(new m2.e(eVar6.f20451a, i26 - i23, i27 - i23));
                } else {
                    list3 = list6;
                }
                i25++;
                list6 = list3;
                vVar = vVar3;
            }
            arrayList4.add(new m2.t(new u2.c(str, q0Var3, sVar, arrayList5, hVar, cVar), i23, i24));
            i22++;
            gVar2 = gVar;
            q0Var2 = q0Var;
            str3 = str2;
            arrayList3 = arrayList;
        }
        this.f15040z = arrayList4;
    }

    public static u0 g(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        u0 u0Var = new u0(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) u0Var.f15039y)) {
            try {
                ((ArrayDeque) u0Var.f15039y).clear();
                String string = ((SharedPreferences) u0Var.f15036v).getString((String) u0Var.f15037w, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) u0Var.f15038x)) {
                    String[] split = string.split((String) u0Var.f15038x, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) u0Var.f15039y).add(str);
                        }
                    }
                    return u0Var;
                }
                return u0Var;
            } finally {
            }
        }
    }

    @Override // m2.u
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f15040z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((m2.t) arrayList.get(i)).f20568a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // mb.f
    public Object b() {
        switch (this.f15035u) {
            case 7:
                Object b10 = ((mb.e) this.f15036v).b();
                int i = 9;
                return new lb.g0((lb.v) b10, new mb.e(new k6.i(i, (ic.c) this.f15037w)), new mb.e(new k6.i(i, (ic.c) this.f15038x)), (lb.n0) ((mb.e) this.f15039y).b(), (lb.f1) ((mb.e) this.f15040z).b());
            default:
                Object b11 = ((mb.e) this.f15036v).b();
                int i10 = 9;
                return new lb.k1((lb.v) b11, new mb.e(new k6.i(9, (ic.c) this.f15037w)), (lb.t0) ((mb.e) this.f15038x).b(), new mb.e(new k6.i(i10, (mb.e) this.f15039y)), (lb.n0) ((mb.e) this.f15040z).b());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pe.g] */
    @Override // m2.u
    public float c() {
        return ((Number) this.f15038x.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pe.g] */
    @Override // m2.u
    public float d() {
        return ((Number) this.f15039y.getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi e(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f15036v
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f15037w
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f15038x
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f15039y
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f15040z
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.k(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f15040z
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f15040z = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.u0.e(int):java.text.Bidi");
    }

    public a4.b f() {
        if (((ig.n) this.f15036v) != null) {
            return new a4.b(this);
        }
        q.x.o("url == null");
        return null;
    }

    @Override // oe.a
    public Object get() {
        return new s8.a((Executor) ((oe.a) this.f15036v).get(), (o8.d) ((oe.a) this.f15037w).get(), (j.i0) ((j.i0) this.f15038x).get(), (u8.f) ((oe.a) this.f15039y).get(), (u8.f) ((oe.a) this.f15040z).get());
    }

    public float h(int i, boolean z3) {
        Layout layout = (Layout) this.f15036v;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z3) {
            return layout.getPrimaryHorizontal(i);
        }
        return layout.getSecondaryHorizontal(i);
    }

    public float i(int i, boolean z3, boolean z9) {
        boolean z10;
        Bidi bidi;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        int i12 = i;
        Layout layout = (Layout) this.f15036v;
        if (!z9) {
            return h(i, z3);
        }
        int a10 = ya.c1.a(layout, i12, z9);
        int lineStart = layout.getLineStart(a10);
        int lineEnd = layout.getLineEnd(a10);
        if (i12 != lineStart && i12 != lineEnd) {
            return h(i, z3);
        }
        if (i12 != 0 && i12 != layout.getText().length()) {
            int j10 = j(i12, z9);
            if (layout.getParagraphDirection(layout.getLineForOffset(k(j10))) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int l10 = l(lineEnd, lineStart);
            int k3 = k(j10);
            int i13 = lineStart - k3;
            int i14 = l10 - k3;
            Bidi e = e(j10);
            if (e != null) {
                bidi = e.createLineBidi(i13, i14);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                n2.d[] dVarArr = new n2.d[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    int runStart = bidi.getRunStart(i15) + lineStart;
                    int runLimit = bidi.getRunLimit(i15) + lineStart;
                    if (bidi.getRunLevel(i15) % 2 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    dVarArr[i15] = new n2.d(runStart, runLimit, z14);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) bidi.getRunLevel(i16);
                }
                Bidi.reorderVisually(bArr, 0, dVarArr, 0, runCount);
                if (i12 == lineStart) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < runCount) {
                            if (dVarArr[i17].f21114a == i12) {
                                i11 = i17;
                                break;
                            }
                            i17++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    n2.d dVar = dVarArr[i11];
                    if (!z3 && z10 != dVar.f21116c) {
                        z13 = z10;
                    } else if (!z10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i11 == 0 && z13) {
                        return layout.getLineLeft(a10);
                    }
                    if (i11 == runCount - 1 && !z13) {
                        return layout.getLineRight(a10);
                    }
                    if (z13) {
                        return layout.getPrimaryHorizontal(dVarArr[i11 - 1].f21114a);
                    }
                    return layout.getPrimaryHorizontal(dVarArr[i11 + 1].f21114a);
                }
                if (i12 > l10) {
                    i12 = l(i12, lineStart);
                }
                int i18 = 0;
                while (true) {
                    if (i18 < runCount) {
                        if (dVarArr[i18].f21115b == i12) {
                            i10 = i18;
                            break;
                        }
                        i18++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                n2.d dVar2 = dVarArr[i10];
                if (!z3 && z10 != dVar2.f21116c) {
                    if (!z10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = z10;
                }
                if (i10 == 0 && z12) {
                    return layout.getLineLeft(a10);
                }
                if (i10 == runCount - 1 && !z12) {
                    return layout.getLineRight(a10);
                }
                if (z12) {
                    return layout.getPrimaryHorizontal(dVarArr[i10 - 1].f21115b);
                }
                return layout.getPrimaryHorizontal(dVarArr[i10 + 1].f21115b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z3 || z10 == isRtlCharAt) {
                if (!z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (i12 == lineStart) {
                z11 = z10;
            } else if (!z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return layout.getLineLeft(a10);
            }
            return layout.getLineRight(a10);
        }
        return h(i, z3);
    }

    public int j(int i, boolean z3) {
        int i10;
        ArrayList arrayList = (ArrayList) this.f15037w;
        int b10 = qe.m.b(arrayList, Integer.valueOf(i));
        if (b10 < 0) {
            i10 = -(b10 + 1);
        } else {
            i10 = b10 + 1;
        }
        if (z3 && i10 > 0) {
            int i11 = i10 - 1;
            if (i == ((Number) arrayList.get(i11)).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public int k(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f15037w).get(i - 1)).intValue();
    }

    public int l(int i, int i10) {
        while (i > i10) {
            char charAt = ((Layout) this.f15036v).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((kotlin.jvm.internal.l.b(charAt, 8192) < 0 || kotlin.jvm.internal.l.b(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void m(String str, er erVar) {
        if (str != null) {
            if (str.length() != 0) {
                if (erVar != null && !ya.z0.a(str)) {
                    q.x.n(p.a.k("method ", str, " must not have a request body."));
                    return;
                }
                if (erVar == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
                    q.x.n(p.a.k("method ", str, " must have a request body."));
                    return;
                } else {
                    this.f15037w = str;
                    this.f15039y = erVar;
                    return;
                }
            }
            q.x.n("method.length() == 0");
            return;
        }
        g5.q.h("method == null");
    }

    public void n(String str) {
        ((f4.h) this.f15038x).e(str);
    }

    public void o(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.f15036v).put(str, obj);
        sf.n0 n0Var = (sf.n0) ((LinkedHashMap) this.f15038x).get(str);
        if (n0Var != null) {
            n0Var.j(obj);
        }
        sf.n0 n0Var2 = (sf.n0) ((LinkedHashMap) this.f15039y).get(str);
        if (n0Var2 != null) {
            n0Var2.j(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0 p(n0 n0Var) {
        String substring;
        boolean z3;
        bn bnVar;
        bn bnVar2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f15036v;
        Uri uri = n0Var.f14688a;
        Pair pair = (Pair) concurrentHashMap.get(uri);
        boolean z9 = false;
        Object[] objArr = 0;
        if (pair == null) {
            Uri uri2 = n0Var.f14688a;
            pa.q(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String lastPathSegment = uri2.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf == -1) {
                substring = "";
            } else {
                substring = lastPathSegment.substring(lastIndexOf + 1);
            }
            pa.q(substring.equals("pb"), "Uri extension must be .pb: %s", uri2);
            d1 d1Var = (d1) ((HashMap) this.f15040z).get("singleproc");
            if (d1Var != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            pa.q(z3, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String lastPathSegment2 = n0Var.f14688a.getLastPathSegment();
            if (lastPathSegment2 == null) {
                lastPathSegment2 = "";
            }
            int lastIndexOf2 = lastPathSegment2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                lastPathSegment2 = lastPathSegment2.substring(0, lastIndexOf2);
            }
            String str = lastPathSegment2;
            w9 q10 = n5.q(n5.m(n0Var.f14688a), (t0) this.f15039y, ia.f14473u);
            ab abVar = (ab) this.f15037w;
            i iVar = (i) this.f15038x;
            d1Var.getClass();
            if (n0Var.e) {
                bnVar = bn.f14099b;
                if (bnVar == null) {
                    synchronized (bn.class) {
                        try {
                            bnVar2 = bn.f14099b;
                            if (bnVar2 == null) {
                                oo ooVar = oo.f14756c;
                                bnVar2 = gn.j();
                                bn.f14099b = bnVar2;
                            }
                        } finally {
                        }
                    }
                    bnVar = bnVar2;
                }
            } else {
                bn bnVar3 = bn.f14099b;
                oo ooVar2 = oo.f14756c;
                bnVar = bn.f14100c;
            }
            s0 s0Var = new s0(new com.google.android.gms.internal.consent_sdk.c(str, n5.m(n0Var.f14688a), new h1(n0Var.f14689b, bnVar), abVar, iVar, new jm(12)), q10);
            h4 h4Var = n0Var.f14690c;
            if (!h4Var.isEmpty()) {
                r0 r0Var = new r0(h4Var, objArr == true ? 1 : 0, abVar);
                synchronized (s0Var.f14950g) {
                    s0Var.i.add(r0Var);
                }
            }
            pair = Pair.create(s0Var, n0Var);
            Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uri, pair);
            if (pair2 != null) {
                pair = pair2;
            }
        }
        s0 s0Var2 = (s0) pair.first;
        n0 n0Var2 = (n0) pair.second;
        if (n0Var.equals(n0Var2)) {
            return s0Var2;
        }
        String e = tl.e("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", n0Var.f14689b.getClass().getSimpleName(), n0Var.f14688a);
        pa.q(n0Var.f14688a.equals(n0Var2.f14688a), e, "uri");
        pa.q(n0Var.f14689b.equals(n0Var2.f14689b), e, "schema");
        pa.q(n0Var.f14690c.equals(n0Var2.f14690c), e, "migrations");
        pa.q(n0Var.f14691d.equals(n0Var2.f14691d), e, "variantConfig");
        if (n0Var.e == n0Var2.e) {
            z9 = true;
        }
        pa.q(z9, e, "useGeneratedExtensionRegistry");
        q.x.n(tl.e(e, "unknown"));
        return null;
    }

    public void q() {
        xr xrVar = (xr) ((yr) this.f15038x).g();
        long andSet = ((AtomicLong) this.f15040z).getAndSet(0L);
        xrVar.b();
        yr.A((yr) xrVar.f14430v, andSet);
        long andSet2 = ((AtomicLong) this.f15039y).getAndSet(0L);
        xrVar.b();
        yr.E((yr) xrVar.f14430v, andSet2);
        yr yrVar = (yr) xrVar.i();
        ex exVar = (ex) this.f15037w;
        exVar.getClass();
        x9 b10 = exVar.f14285a.b(new rl(8, yrVar), exVar.f14286b);
        s5 s5Var = new s5(21, this);
        int i = g2.f14354a;
        b10.g(new ra(b10, 0, new pw(q1.b(), 12, s5Var)), ia.f14473u);
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        com.google.android.gms.internal.ads.cx cxVar = (com.google.android.gms.internal.ads.cx) this.f15038x;
        rr0 rr0Var = (rr0) this.f15039y;
        ac.b bVar = (ac.b) this.f15036v;
        s9.i iVar = (s9.i) this.f15040z;
        AtomicBoolean atomicBoolean = iVar.W;
        s9.m mVar = (s9.m) obj;
        ur0 E4 = s9.i.E4(bVar, (com.google.android.gms.internal.ads.jx) this.f15037w);
        atomicBoolean.set(true);
        if (!((Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f11016x8)).booleanValue()) {
            if (cxVar != null) {
                try {
                    cxVar.o("QueryInfo generation has been disabled.");
                } catch (RemoteException e) {
                    String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                    int i = k9.a0.f19634b;
                    l9.i.c(concat);
                }
            }
            if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                rr0Var.R("QueryInfo generation has been disabled.");
                rr0Var.a(false);
                E4.a(rr0Var);
                E4.h();
                return;
            }
            return;
        }
        try {
            try {
                if (mVar == null) {
                    if (cxVar != null) {
                        cxVar.m0(null, null, null);
                    }
                    rr0Var.a(true);
                    if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                        E4.a(rr0Var);
                        E4.h();
                        return;
                    }
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(mVar.f25084b).optString("request_id", ""))) {
                        int i10 = k9.a0.f19634b;
                        l9.i.f("The request ID is empty in request JSON.");
                        if (cxVar != null) {
                            cxVar.o("Internal error: request ID is empty in request JSON.");
                        }
                        rr0Var.R("Request ID empty");
                        rr0Var.a(false);
                        if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                            E4.a(rr0Var);
                            E4.h();
                            return;
                        }
                        return;
                    }
                    Bundle bundle = mVar.f25086d;
                    boolean z3 = iVar.K;
                    String str = iVar.L;
                    String str2 = iVar.M;
                    if (z3 && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, iVar.N.get());
                    }
                    if (iVar.J && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(iVar.P)) {
                            iVar.P = f9.k.C.f16813c.E(iVar.f25071w, iVar.O.f20029u);
                        }
                        bundle.putString(str, iVar.P);
                    }
                    if (cxVar != null) {
                        cxVar.m0(mVar.f25083a, bundle, mVar.f25084b);
                    }
                    rr0Var.a(true);
                    if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                        E4.a(rr0Var);
                        E4.h();
                    }
                } catch (JSONException e8) {
                    int i11 = k9.a0.f19634b;
                    l9.i.f("Failed to create JSON object from the request string.");
                    if (cxVar != null) {
                        String obj2 = e8.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 33);
                        sb2.append("Internal error for request JSON: ");
                        sb2.append(obj2);
                        cxVar.o(sb2.toString());
                    }
                    rr0Var.b(e8);
                    rr0Var.a(false);
                    f9.k.C.f16817h.d("SignalGeneratorImpl.generateSignals.onSuccess", e8);
                    if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                        E4.a(rr0Var);
                        E4.h();
                    }
                }
            } catch (RemoteException e10) {
                rr0Var.b(e10);
                rr0Var.a(false);
                int i12 = k9.a0.f19634b;
                l9.i.d("", e10);
                f9.k.C.f16817h.d("SignalGeneratorImpl.generateSignals.onSuccess", e10);
                if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                    E4.a(rr0Var);
                    E4.h();
                }
            }
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
                E4.a(rr0Var);
                E4.h();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.D8)).booleanValue()) {
            f9.k.C.f16817h.e("SignalGeneratorImpl.generateSignals", th);
        } else {
            f9.k.C.f16817h.d("SignalGeneratorImpl.generateSignals", th);
        }
        ur0 E4 = s9.i.E4((ac.b) this.f15036v, (com.google.android.gms.internal.ads.jx) this.f15037w);
        if (((Boolean) com.google.android.gms.internal.ads.rm.e.p()).booleanValue() && E4 != null) {
            rr0 rr0Var = (rr0) this.f15039y;
            rr0Var.b(th);
            rr0Var.a(false);
            E4.a(rr0Var);
            E4.h();
        }
        com.google.android.gms.internal.ads.cx cxVar = (com.google.android.gms.internal.ads.cx) this.f15038x;
        if (cxVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            cxVar.o(message);
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.d("", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00aa  */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya zza() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.u0.zza():com.google.android.gms.internal.mlkit_vision_digital_ink.ya");
    }

    public /* synthetic */ u0(Context context, Executor executor) {
        this.f15035u = 1;
        this.f15039y = new w0(0);
        this.f15036v = context;
        this.f15037w = executor;
    }

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f15035u = i;
        this.f15036v = obj;
        this.f15037w = obj2;
        this.f15038x = obj3;
        this.f15039y = obj4;
        this.f15040z = obj5;
    }

    public /* synthetic */ u0(boolean z3) {
        this.f15035u = 6;
    }

    public u0(Context context, ex exVar, yr yrVar) {
        this.f15035u = 5;
        this.f15039y = new AtomicLong();
        this.f15040z = new AtomicLong();
        this.f15036v = context;
        this.f15037w = exVar;
        this.f15038x = yrVar;
    }

    public u0(ab abVar, i iVar, HashMap hashMap) {
        this.f15035u = 0;
        this.f15036v = new ConcurrentHashMap();
        this.f15037w = abVar;
        this.f15038x = iVar;
        this.f15040z = hashMap;
        pa.p(!hashMap.isEmpty());
        this.f15039y = new t0(0);
    }

    public u0(s9.i iVar, ac.b bVar, com.google.android.gms.internal.ads.jx jxVar, com.google.android.gms.internal.ads.cx cxVar, rr0 rr0Var) {
        this.f15035u = 13;
        this.f15036v = bVar;
        this.f15037w = jxVar;
        this.f15038x = cxVar;
        this.f15039y = rr0Var;
        this.f15040z = iVar;
    }

    public u0(Map map) {
        this.f15035u = 15;
        map.getClass();
        this.f15036v = new LinkedHashMap(map);
        this.f15037w = new LinkedHashMap();
        this.f15038x = new LinkedHashMap();
        this.f15039y = new LinkedHashMap();
        this.f15040z = new c.f(2, this);
    }

    public u0(Drawable.Callback callback) {
        this.f15035u = 14;
        this.f15036v = new zt0();
        this.f15040z = new HashMap();
        this.f15037w = new HashMap();
        this.f15039y = ".ttf";
        if (!(callback instanceof View)) {
            a7.d.a("LottieDrawable must be inside of a view for images to work.");
            this.f15038x = null;
        } else {
            this.f15038x = ((View) callback).getContext().getAssets();
        }
    }

    public u0(Layout layout) {
        this.f15035u = 10;
        this.f15036v = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int r8 = mf.f.r(((Layout) this.f15036v).getText(), '\n', i, 4);
            i = r8 < 0 ? ((Layout) this.f15036v).getText().length() : r8 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.f15036v).getText().length());
        this.f15037w = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f15038x = arrayList2;
        this.f15039y = new boolean[((ArrayList) this.f15037w).size()];
        ((ArrayList) this.f15037w).size();
    }

    public /* synthetic */ u0(int i) {
        this.f15035u = i;
    }

    public u0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f15035u = 11;
        this.f15039y = new ArrayDeque();
        this.f15036v = sharedPreferences;
        this.f15037w = "topic_operation_queue";
        this.f15038x = ",";
        this.f15040z = scheduledThreadPoolExecutor;
    }

    public u0() {
        this.f15035u = 6;
        this.f15040z = Collections.EMPTY_MAP;
        this.f15037w = "GET";
        this.f15038x = new f4.h(1);
    }
}
