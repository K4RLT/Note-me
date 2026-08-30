package u7;
import c.c;
import c.f;
import c.i;
import c.p;
import m3.e;
import m3.f;
import m3.g;
import m3.i;
import p.k;
import y0.a;
import b.a;
import b1.c0;
import b1.f0;
import b1.g0;
import b1.i;
import b1.p;
import b1.q;
import b1.v;
import b1.w;
import b1.y;
import b2.f1;
import b8.l2;
import e0.b;
import f7.c;
import j6.n;
import l.d;
import l7.e;
import l7.h;
import l7.k;
import l7.t;
import p7.x0;
import p7.y0;
import q.x;
import r0.g1;
import u7.e3;
import u7.h3;
import u7.i3;
import u7.m3;
import u7.x2;
import w7.n4;
import w7.x4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import wa.b9;

/* loaded from: classes.dex */
public final class m3 extends androidx.lifecycle.u0 {
    public boolean A;
    public pf.r1 B;
    public final ConcurrentHashMap C;
    public final ConcurrentHashMap.KeySetView D;
    public boolean E;
    public boolean F;
    public Bitmap G;
    public Bitmap H;
    public Bitmap I;
    public Bitmap J;
    public Bitmap K;
    public float L;
    public Bitmap M;
    public Bitmap N;
    public boolean O;
    public final float P;

    /* renamed from: b, reason: collision with root package name */
    public final n f26530b;

    /* renamed from: c, reason: collision with root package name */
    public final sf.n0 f26531c;

    /* renamed from: d, reason: collision with root package name */
    public final sf.a0 f26532d;
    public final y e;

    /* renamed from: f, reason: collision with root package name */
    public final y f26533f;

    /* renamed from: g, reason: collision with root package name */
    public final y f26534g;

    /* renamed from: h, reason: collision with root package name */
    public final y f26535h;
    public final y i;

    /* renamed from: j, reason: collision with root package name */
    public final y f26536j;

    /* renamed from: k, reason: collision with root package name */
    public final y f26537k;

    /* renamed from: l, reason: collision with root package name */
    public final y f26538l;

    /* renamed from: m, reason: collision with root package name */
    public final nd.o f26539m;

    /* renamed from: n, reason: collision with root package name */
    public final j.i0 f26540n;

    /* renamed from: o, reason: collision with root package name */
    public final f1 f26541o;

    /* renamed from: p, reason: collision with root package name */
    public final v7.k f26542p;

    /* renamed from: q, reason: collision with root package name */
    public final f1 f26543q;

    /* renamed from: r, reason: collision with root package name */
    public long f26544r;

    /* renamed from: s, reason: collision with root package name */
    public final g1 f26545s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f26546t;

    /* renamed from: u, reason: collision with root package name */
    public List f26547u;

    /* renamed from: v, reason: collision with root package name */
    public final ConcurrentHashMap f26548v;

    /* renamed from: w, reason: collision with root package name */
    public final fg.s f26549w;

    /* renamed from: x, reason: collision with root package name */
    public volatile v2 f26550x;

    /* renamed from: y, reason: collision with root package name */
    public final sf.n0 f26551y;

    /* renamed from: z, reason: collision with root package name */
    public final sf.a0 f26552z;

    /* JADX WARN: Type inference failed for: r7v11, types: [nd.o, java.lang.Object] */
    public m3(n nVar) {
        this.f26530b = nVar;
        qe.s sVar = qe.s.f24023u;
        int i = 0;
        sf.n0 b10 = sf.b(new m2(sVar, sVar, 0));
        this.f26531c = b10;
        this.f26532d = new sf.a0(b10);
        this.e = new y();
        this.f26533f = new y();
        this.f26534g = new y();
        this.f26535h = new y();
        this.i = new y();
        this.f26536j = new y();
        this.f26537k = new y();
        this.f26538l = new y();
        a h3 = androidx.lifecycle.h(this);
        Object obj = new Object();
        obj.f21271u = h3;
        obj.f21272v = new ConcurrentHashMap();
        obj.f21273w = new ConcurrentHashMap();
        obj.f21274x = ConcurrentHashMap.newKeySet();
        this.f26539m = obj;
        this.f26540n = new j.i0(androidx.lifecycle.h(this));
        this.f26541o = new f1(androidx.lifecycle.h(this), new n2(this, i));
        int i10 = 2;
        this.f26542p = new v7.k(new c(i10, this));
        this.f26543q = new f1(0);
        this.f26545s = new g1(0L);
        this.f26547u = sVar;
        this.f26548v = new ConcurrentHashMap();
        this.f26549w = wa.a(new y0(13));
        this.f26550x = new v2(0.5f, 0.5f, 0.45f, 0.55f);
        sf.n0 b11 = sf.b(sVar);
        this.f26551y = b11;
        this.f26552z = new sf.a0(b11);
        int i11 = 1;
        v7.f.f27424b = new n2(this, i11);
        te.c cVar = null;
        pf.b0.x(androidx.lifecycle.h(this), null, new q2(this, cVar, i), 3);
        pf.b0.x(androidx.lifecycle.h(this), null, new q2(this, cVar, i11), 3);
        pf.b0.x(androidx.lifecycle.h(this), null, new q2(this, cVar, i10), 3);
        List list = e.f22444a;
        e.f22448f = new n2(this, i10);
        this.C = new ConcurrentHashMap();
        this.D = ConcurrentHashMap.newKeySet();
        this.L = -1.0f;
        this.P = 0.35f;
    }

    public static String L(String str) {
        String str2;
        if (!kotlin.jvm.internal.a(str, "empty_frame")) {
            try {
                File file = new File(str);
                if (file.exists()) {
                    String d2 = af.d(file);
                    String uuid = UUID.randomUUID().toString();
                    if (d2.length() > 0) {
                        str2 = ".".concat(d2);
                    } else {
                        str2 = "";
                    }
                    File file2 = new File(file.getParentFile(), uuid + str2);
                    af.b(file, file2);
                    return file2.getAbsolutePath();
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean b0(b bVar) {
        if (kotlin.jvm.internal.a(bVar.f25918b, "empty_frame")) {
            List list = bVar.f25928n;
            if (list != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()) != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final boolean c1(float f10, Bitmap bitmap, int i, Paint paint, int[] iArr, Bitmap bitmap2, Canvas canvas, float f11, float f12) {
        int round = Math.round(f11 - f10);
        int round2 = Math.round(f12 - f10);
        int max = Math.max(0, round);
        int max2 = Math.max(0, round2);
        int min = Math.min(bitmap.getWidth(), round + i);
        int min2 = Math.min(bitmap.getHeight(), i + round2);
        if (min <= max || min2 <= max2) {
            return false;
        }
        bitmap2.eraseColor(0);
        canvas.drawBitmap(bitmap, new Rect(max, max2, min, min2), new Rect(max - round, max2 - round2, min - round, min2 - round2), paint);
        iArr[0] = round;
        iArr[1] = round2;
        return true;
    }

    public static final void d1(int i, Canvas canvas, float f10) {
        Paint paint = new Paint();
        paint.setColor(Color.argb((int) (b9.d(f10, 0.0f, 1.0f) * 255.0f), 255, 255, 255));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        float f11 = i;
        canvas.drawRect(0.0f, 0.0f, f11, f11, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011e A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:18:0x010d, B:20:0x011e, B:21:0x0121), top: B:17:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(u7.m3 r16, java.lang.String r17, int r18, long r19, java.lang.String r21, android.content.Context r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, ve.c r26) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.e(u7.m3, java.lang.String, int, long, java.lang.String, android.content.Context, java.lang.Integer, java.lang.String, java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:14:0x00c0, B:22:0x0047, B:23:0x009d, B:25:0x00a8, B:41:0x0088), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pf.k1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(u7.m3 r11, int r12, ve.c r13) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.f(u7.m3, int, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(u7.m3 r7, int r8, ve.c r9) {
        /*
            boolean r0 = r9 instanceof e3
            if (r0 == 0) goto L13
            r0 = r9
            e3 r0 = (e3) r0
            int r1 = r0.f26130x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26130x = r1
            goto L18
        L13:
            e3 r0 = new e3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f26128v
            int r1 = r0.f26130x
            r2 = 2
            r3 = 1
            pe.z r4 = pe.z.f22715a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            pf.q r7 = r0.f26127u
            pe.a.e(r9)     // Catch: java.lang.Throwable -> L2c
            goto L77
        L2c:
            r8 = move-exception
            goto L7d
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L35:
            pe.a.e(r9)
            return r4
        L39:
            pe.a.e(r9)
            java.util.List r9 = r7.f26547u
            java.lang.Object r9 = qe.l.y(r8, r9)
            b r9 = (b) r9
            if (r9 == 0) goto L81
            java.lang.String r9 = r9.f21848a
            if (r9 != 0) goto L4b
            goto L81
        L4b:
            pf.q r1 = pf.b0.a()
            java.util.concurrent.ConcurrentHashMap r5 = r7.f26548v
            java.lang.String r6 = r7.y(r8)
            java.lang.Object r5 = r5.putIfAbsent(r6, r1)
            pf.q r5 = (pf.q) r5
            ue.a r6 = ue.a.f27192u
            if (r5 == 0) goto L6b
            r7 = 0
            r0.f26127u = r7
            r0.f26130x = r3
            java.lang.Object r7 = r5.t(r0)
            if (r7 != r6) goto L81
            goto L75
        L6b:
            r0.f26127u = r1     // Catch: java.lang.Throwable -> L7b
            r0.f26130x = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r7.r0(r8, r9, r0)     // Catch: java.lang.Throwable -> L7b
            if (r7 != r6) goto L76
        L75:
            return r6
        L76:
            r7 = r1
        L77:
            r7.W(r4)
            return r4
        L7b:
            r8 = move-exception
            r7 = r1
        L7d:
            r7.W(r4)
            throw r8
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.g(u7.m3, int, ve.c):java.lang.Object");
    }

    public static final void h(m3 m3Var, x2 x2Var, a aVar) {
        Object kVar;
        ArrayList arrayList;
        b bVar;
        Object kVar2;
        Object kVar3;
        Object kVar4;
        Object kVar5;
        Object kVar6;
        HashSet hashSet = x2Var.f27019g;
        fg.s sVar = m3Var.f26549w;
        String str = aVar.e;
        String str2 = aVar.f21847k;
        int i = aVar.f21841c;
        Object obj = null;
        switch (str.hashCode()) {
            case -891980232:
                if (str.equals("stroke")) {
                    try {
                        sVar.getClass();
                        kVar = (q) sVar.a(q.Companion.serializer(), str2);
                    } catch (Throwable th) {
                        kVar = new pe.k(th);
                    }
                    if (kVar instanceof pe.k) {
                        kVar = null;
                    }
                    q qVar = (q) kVar;
                    if (qVar != null) {
                        int i10 = 2;
                        int i11 = (i * 2) + 2 + aVar.f21842d;
                        ArrayList r8 = qe.l.r(qVar.f20002a, 2);
                        ArrayList arrayList2 = new ArrayList();
                        int size = r8.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = r8.get(i12);
                            i12++;
                            List list = (List) obj2;
                            if (list.size() == i10) {
                                float floatValue = ((Number) list.get(0)).floatValue();
                                float floatValue2 = ((Number) list.get(1)).floatValue();
                                arrayList = r8;
                                bVar = new b((Float.floatToRawIntBits(floatValue2) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32));
                            } else {
                                arrayList = r8;
                                bVar = null;
                            }
                            if (bVar != null) {
                                arrayList2.add(bVar);
                            }
                            r8 = arrayList;
                            i10 = 2;
                        }
                        HashMap hashMap = x2Var.f27014a;
                        Integer valueOf = Integer.valueOf(i11);
                        Object obj3 = hashMap.get(valueOf);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            hashMap.put(valueOf, obj3);
                        }
                        ((List) obj3).add(new c8(arrayList2, qVar.f20003b, qVar.f20004c, aVar.f21839a));
                        return;
                    }
                    return;
                }
                return;
            case 3556653:
                if (str.equals("text")) {
                    try {
                        sVar.getClass();
                        kVar2 = (t) sVar.a(t.Companion.serializer(), str2);
                    } catch (Throwable th2) {
                        kVar2 = new pe.k(th2);
                    }
                    if (!(kVar2 instanceof pe.k)) {
                        obj = kVar2;
                    }
                    t tVar = (t) obj;
                    if (tVar != null) {
                        HashMap hashMap2 = x2Var.f27016c;
                        Integer valueOf2 = Integer.valueOf(i);
                        Object obj4 = hashMap2.get(valueOf2);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            hashMap2.put(valueOf2, obj4);
                        }
                        ((List) obj4).add(new d(aVar.f21839a, tVar.f20006a, tVar.f20009d, tVar.f20007b, tVar.f20008c, aVar.f21844g, aVar.f21845h, aVar.i, aVar.f21846j, aVar.f21843f, tVar.f20012h, tVar.i, tVar.f20013j, tVar.e, tVar.f20010f, tVar.f20014k, tVar.f20015l, tVar.f20016m, tVar.f20017n));
                        hashSet.add(Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                return;
            case 100313435:
                if (str.equals("image")) {
                    try {
                        sVar.getClass();
                        kVar3 = (e) sVar.a(e.Companion.serializer(), str2);
                    } catch (Throwable th3) {
                        kVar3 = new pe.k(th3);
                    }
                    if (!(kVar3 instanceof pe.k)) {
                        obj = kVar3;
                    }
                    e eVar = (e) obj;
                    if (eVar != null) {
                        HashMap hashMap3 = x2Var.f27015b;
                        Integer valueOf3 = Integer.valueOf(i);
                        Object obj5 = hashMap3.get(valueOf3);
                        if (obj5 == null) {
                            obj5 = new ArrayList();
                            hashMap3.put(valueOf3, obj5);
                        }
                        ((List) obj5).add(new b(aVar.f21839a, eVar.f19969a, aVar.f21844g, aVar.f21845h, aVar.i, aVar.f21846j, eVar.f19970b, aVar.f21843f, eVar.f19971c, eVar.f19972d, eVar.e, eVar.f19973f, eVar.f19974g, eVar.f19975h, eVar.i, eVar.f19976j, eVar.f19977k, eVar.f19978l, eVar.f19979m, eVar.f19980n, eVar.f19981o, eVar.f19982p));
                        hashSet.add(Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                return;
            case 106434956:
                if (str.equals("paper") && i >= 0) {
                    try {
                        sVar.getClass();
                        kVar4 = (k) sVar.a(k.Companion.serializer(), str2);
                    } catch (Throwable th4) {
                        kVar4 = new pe.k(th4);
                    }
                    if (!(kVar4 instanceof pe.k)) {
                        obj = kVar4;
                    }
                    k kVar7 = (k) obj;
                    if (kVar7 != null) {
                        x2Var.f27018f.put(Integer.valueOf(i), new b8(kVar7.f19989a, kVar7.f19990b));
                        hashSet.add(Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                return;
            case 109399969:
                if (str.equals("shape")) {
                    try {
                        sVar.getClass();
                        kVar5 = (n) sVar.a(n.Companion.serializer(), str2);
                    } catch (Throwable th5) {
                        kVar5 = new pe.k(th5);
                    }
                    if (!(kVar5 instanceof pe.k)) {
                        obj = kVar5;
                    }
                    n nVar = (n) obj;
                    if (nVar != null) {
                        HashMap hashMap4 = x2Var.f27017d;
                        Integer valueOf4 = Integer.valueOf(i);
                        Object obj6 = hashMap4.get(valueOf4);
                        if (obj6 == null) {
                            obj6 = new ArrayList();
                            hashMap4.put(valueOf4, obj6);
                        }
                        ((List) obj6).add(new c(aVar.f21839a, nVar.f19992a, nVar.f19993b, nVar.f19994c, nVar.f19995d, nVar.e, nVar.f19996f, nVar.f19997g, aVar.f21844g, aVar.f21845h, aVar.i, aVar.f21846j, aVar.f21843f, nVar.f19998h, nVar.i, nVar.f19999j));
                        hashSet.add(Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                return;
            case 927583160:
                if (str.equals("ink_layer")) {
                    try {
                        sVar.getClass();
                        kVar6 = (h) sVar.a(h.Companion.serializer(), str2);
                    } catch (Throwable th6) {
                        kVar6 = new pe.k(th6);
                    }
                    if (kVar6 instanceof pe.k) {
                        kVar6 = null;
                    }
                    h hVar = (h) kVar6;
                    if (hVar == null) {
                        hVar = new h(true, false, null, 0);
                    }
                    HashMap hashMap5 = x2Var.e;
                    Integer valueOf5 = Integer.valueOf(i);
                    Object obj7 = hashMap5.get(valueOf5);
                    if (obj7 == null) {
                        obj7 = new ArrayList();
                        hashMap5.put(valueOf5, obj7);
                    }
                    ((List) obj7).add(new q1(hVar.f19987d, aVar.f21843f, hVar.f19986c, hVar.f19984a, hVar.f19985b));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(u7.m3 r11, android.content.Context r12, java.lang.String r13, ve.c r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.i(u7.m3, android.content.Context, java.lang.String, ve.c):java.lang.Object");
    }

    public static void m(List list, List list2, df.l lVar) {
        if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list.addAll(list2);
                return;
            }
            HashSet hashSet = new HashSet(list.size() * 2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object invoke = lVar.invoke(it.next());
                if (((String) invoke).length() <= 0) {
                    invoke = null;
                }
                String str = (String) invoke;
                if (str != null) {
                    hashSet.add(str);
                }
            }
            for (Object obj : list2) {
                String str2 = (String) lVar.invoke(obj);
                if (str2.length() == 0 || hashSet.add(str2)) {
                    list.add(obj);
                }
            }
        }
    }

    public static int m1(m3 m3Var, b bVar) {
        Object value;
        te.c cVar;
        Iterator it = m3Var.f26547u.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.a(((b) it.next()).f21848a, bVar.f21848a)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return -1;
        }
        ArrayList R = qe.l.R(m3Var.f26547u);
        R.set(i, bVar);
        m3Var.f26547u = R;
        sf.n0 n0Var = m3Var.f26531c;
        do {
            value = n0Var.getValue();
            cVar = null;
        } while (!n0Var.i(value, a((m2) value, R, null, 0, 6)));
        pf.b0.x(androidx.lifecycle.h(m3Var), null, new a(m3Var, bVar, cVar, 15), 3);
        return i;
    }

    public static void n(m3 m3Var, int i, int i10, b bVar, String str, String str2, int i11) {
        String str3;
        boolean z3;
        b bVar2;
        String str4 = null;
        if ((i11 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i11 & 16) == 0) {
            str4 = str2;
        }
        if ((i11 & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        m3Var.getClass();
        m3Var.K0(i, i10, true);
        y yVar = m3Var.f26533f;
        pe.j jVar = new pe.j(m3Var.y(i), Integer.valueOf(i10));
        Object obj = yVar.get(jVar);
        if (obj == null) {
            obj = new v();
            yVar.put(jVar, obj);
        }
        v vVar = (v) obj;
        if (bVar.f25923h <= 0) {
            bVar2 = a(bVar, null, null, 0.0f, 0.0f, 0.0f, 0.0f, m3Var.B0(i, i10), false, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194175);
        } else {
            bVar2 = bVar;
        }
        vVar.add(bVar2);
        m3Var.B(i, i10);
        a.x(m3Var.f26543q, 1, m3Var);
        if (z3) {
            if (str3 == null) {
                if (!kotlin.jvm.internal.a(bVar2.f25918b, "empty_frame") && bVar2.f25922g == null) {
                    str3 = "photo";
                } else {
                    str3 = "frame";
                }
            }
            c.e(str3, m3Var.M(i, i10), str4);
        }
        m3Var.D0(m3Var.y(i), i10, bVar2);
    }

    public static String o0(String str, int i, int i10) {
        if (i10 == 0) {
            return "ink::" + str + "::" + i;
        }
        StringBuilder m4 = a5.a.m("ink::", str, "::", i, "::");
        m4.append(i10);
        return m4.toString();
    }

    public static void o1(m3 m3Var, int i, int i10, String str, float f10, float f11, float f12, float f13, Float f14, Float f15, int i11) {
        Float f16;
        float f17;
        float f18;
        Float f19 = null;
        if ((i11 & 128) != 0) {
            f16 = null;
        } else {
            f16 = f14;
        }
        if ((i11 & 256) == 0) {
            f19 = f15;
        }
        m3Var.getClass();
        str.getClass();
        v vVar = (v) a.h(m3Var.y(i), Integer.valueOf(i10), m3Var.f26535h);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i12 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((c) c0Var.next()).f25969a, str)) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 >= 0) {
                m3Var.K0(i, i10, false);
                c cVar = (c) vVar.get(i12);
                if (f16 != null) {
                    f17 = f16.floatValue();
                } else {
                    f17 = cVar.f25974g;
                }
                float f20 = f17;
                if (f19 != null) {
                    f18 = f19.floatValue();
                } else {
                    f18 = cVar.f25975h;
                }
                vVar.set(i12, a(cVar, null, null, null, 0.0f, 0.0f, f20, f18, f10, f11, f12, f13, 0, false, false, null, 61503));
            }
        }
    }

    public static void r1(m3 m3Var, int i, int i10, String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, String str4, Integer num2, Float f10, int i11) {
        String str5;
        String str6;
        Integer num3;
        Boolean bool3;
        Boolean bool4;
        String str7;
        Integer num4;
        int i12;
        boolean z3;
        boolean z9;
        int i13;
        float f11;
        Float f12 = null;
        if ((i11 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i11 & 16) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i11 & 32) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i11 & 64) != 0) {
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i11 & 128) != 0) {
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        if ((i11 & 256) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i11 & 512) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 1024) == 0) {
            f12 = f10;
        }
        m3Var.getClass();
        str.getClass();
        v vVar = (v) a.h(m3Var.y(i), Integer.valueOf(i10), m3Var.f26534g);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i14 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((d) c0Var.next()).f26033a, str)) {
                        break;
                    } else {
                        i14++;
                    }
                } else {
                    i14 = -1;
                    break;
                }
            }
            if (i14 >= 0) {
                m3Var.K0(i, i10, true);
                d dVar = (d) vVar.get(i14);
                if (str5 == null) {
                    str5 = dVar.f26034b;
                }
                String str8 = str5;
                if (str6 == null) {
                    str6 = dVar.f26035c;
                }
                String str9 = str6;
                if (num3 != null) {
                    i12 = num3.intValue();
                } else {
                    i12 = dVar.f26036d;
                }
                int i15 = i12;
                if (bool3 != null) {
                    z3 = bool3.booleanValue();
                } else {
                    z3 = dVar.f26044n;
                }
                boolean z10 = z3;
                if (bool4 != null) {
                    z9 = bool4.booleanValue();
                } else {
                    z9 = dVar.f26045o;
                }
                boolean z11 = z9;
                if (str7 == null) {
                    str7 = dVar.f26047q;
                }
                String str10 = str7;
                if (num4 != null) {
                    i13 = num4.intValue();
                } else {
                    i13 = dVar.f26048r;
                }
                int i16 = i13;
                if (f12 != null) {
                    f11 = f12.floatValue();
                } else {
                    f11 = dVar.f26049s;
                }
                vVar.set(i14, a(dVar, null, str8, str9, i15, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, z10, z11, null, str10, i16, f11, 40945));
                m3Var.B(i, i10);
                m3Var.Z0(m3Var.f26543q.h() + 1);
                m3Var.I0(m3Var.y(i), i10, (d) vVar.get(i14));
            }
        }
    }

    public static void t0(m3 m3Var, int i, int i10, String str, Boolean bool, Boolean bool2, int i11) {
        if ((i11 & 8) != 0) {
            bool = null;
        }
        if ((i11 & 16) != 0) {
            bool2 = null;
        }
        m3Var.getClass();
        str.getClass();
        List H = qe.l.H(m3Var.g1(i, i10));
        ArrayList arrayList = new ArrayList(qe.m.d(H, 10));
        Iterator it = H.iterator();
        while (it.hasNext()) {
            arrayList.add(((a8) it.next()).a());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int indexOf = arrayList2.indexOf(str);
        if (indexOf >= 0) {
            Boolean bool3 = Boolean.TRUE;
            if (kotlin.jvm.internal.a(bool, bool3)) {
                arrayList2.remove(indexOf);
                arrayList2.add(0, str);
            } else {
                Boolean bool4 = Boolean.FALSE;
                if (kotlin.jvm.internal.a(bool, bool4)) {
                    arrayList2.remove(indexOf);
                    arrayList2.add(str);
                } else if (kotlin.jvm.internal.a(bool2, bool3) && indexOf > 0) {
                    arrayList2.remove(indexOf);
                    arrayList2.add(indexOf - 1, str);
                } else if (kotlin.jvm.internal.a(bool2, bool4) && indexOf < arrayList2.size() - 1) {
                    arrayList2.remove(indexOf);
                    arrayList2.add(indexOf + 1, str);
                } else {
                    return;
                }
            }
            m3Var.W0(i, i10, arrayList2);
        }
    }

    public static final int w(float f10) {
        float pow;
        float d2 = b9.d(f10, 0.0f, 1.0f);
        if (d2 <= 0.0031308f) {
            pow = d2 * 12.92f;
        } else {
            pow = (((float) Math.pow(d2, 0.4166666666666667d)) * 1.055f) - 0.055f;
        }
        return (int) (b9.d(pow, 0.0f, 1.0f) * 255.0f);
    }

    public static Bitmap z(int i, float f10, boolean z3) {
        float f11 = i / 2.0f;
        int[] iArr = new int[i * i];
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = 0; i11 < i; i11++) {
                float f12 = ((i11 + 0.5f) - f11) / f11;
                float f13 = ((i10 + 0.5f) - f11) / f11;
                float d2 = b9.d((b9.d((float) Math.sqrt((f13 * f13) + (f12 * f12)), 0.0f, 1.0f) - 0.2f) / 0.8f, 0.0f, 1.0f);
                float f14 = (1.0f - ((3.0f - (d2 * 2.0f)) * (d2 * d2))) * f10;
                if (z3) {
                    f14 = 1.0f - f14;
                }
                iArr[(i10 * i) + i11] = (b9.e((int) (f14 * 255.0f), 0, 255) << 24) | 16777215;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
        return createBitmap;
    }

    public final void A(int i, int i10) {
        int i11;
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.f26538l;
        Integer num = (Integer) yVar.get(jVar);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        yVar.put(jVar, Integer.valueOf(i11 + 1));
    }

    public final void A0(int i, int i10, String str, df.l lVar) {
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26534g);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((d) c0Var.next()).f26033a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, true);
                vVar.set(i11, lVar.invoke(vVar.get(i11)));
                I0(y(i), i10, (d) vVar.get(i11));
                B(i, i10);
                a.x(this.f26543q, 1, this);
            }
        }
    }

    public final void B(int i, int i10) {
        int i11;
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.f26538l;
        Integer num = (Integer) yVar.get(jVar);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        yVar.put(jVar, Integer.valueOf(i11 + 1));
        this.f26544r = SystemClock.uptimeMillis();
        if (i10 == -2) {
            this.f26541o.f(O(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B0(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.B0(int, int):int");
    }

    public final void C() {
        this.f26546t = false;
    }

    public final String C0(int i) {
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null) {
            return bVar.f21848a;
        }
        return null;
    }

    public final void D(int i, int i10, Context context) {
        int i11;
        b bVar;
        jf.d dVar = v7.j.f27439a;
        int i12 = dVar.f19189u;
        int i13 = dVar.f19190v;
        if (i12 <= i13) {
            while (true) {
                this.f26539m.q(y(i), i10, i12);
                nd.o.g(i10, i12, context, y(i)).delete();
                if (i12 == i13) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f26540n.e(context, y(i), i10, v7.j.f27439a);
        F(i, i10);
        E(i, i10);
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.f26538l;
        Integer num = (Integer) yVar.get(jVar);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        yVar.put(jVar, Integer.valueOf(i11 + 1));
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26533f);
        if (vVar != null && (bVar = w.e(vVar).f1328c) != null) {
            ListIterator listIterator = bVar.listIterator(0);
            while (listIterator.hasNext()) {
                O0(((b) listIterator.next()).f25917a, i, i10);
            }
        }
        a.x(this.f26543q, 1, this);
    }

    public final void D0(String str, int i, b bVar) {
        if (str.startsWith("?")) {
            return;
        }
        e eVar = new e(bVar.f25918b, bVar.f25922g, bVar.i, bVar.f25924j, bVar.f25925k, bVar.f25926l, bVar.f25927m, bVar.f25928n, bVar.f25929o, bVar.f25930p, bVar.f25931q, bVar.f25932r, bVar.f25933s, bVar.f25934t, bVar.f25935u, bVar.f25936v);
        fg.s sVar = this.f26549w;
        sVar.getClass();
        pf.b0.x(androidx.lifecycle.h(this), null, new j3(this, new a(bVar.f25917a, str, i, 2, "image", bVar.f25923h, bVar.f25919c, bVar.f25920d, bVar.e, bVar.f25921f, sVar.b(e.Companion.serializer(), eVar)), null, 0), 3);
    }

    public final void E(int i, int i10) {
        String y10 = y(i);
        List list = (List) this.i.remove(new pe.j(y10, Integer.valueOf(i10)));
        this.f26536j.remove(new pe.j(y10, Integer.valueOf(i10)));
        if (list != null && !y10.startsWith("?")) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(qe.m.d(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(o0(y10, i10, ((q1) it.next()).f26742a));
            }
            Q(arrayList);
        }
    }

    public final void E0(String str, int i, int i10) {
        te.c cVar;
        Object obj;
        if (!str.startsWith("?")) {
            List list = (List) a.h(str, Integer.valueOf(i), this.i);
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    cVar = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((q1) obj).f26742a == i10) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                q1 q1Var = (q1) obj;
                if (q1Var == null) {
                    return;
                }
                h hVar = new h(q1Var.f26744c, q1Var.f26745d, q1Var.e, q1Var.f26742a);
                fg.s sVar = this.f26549w;
                sVar.getClass();
                pf.b0.x(androidx.lifecycle.h(this), null, new j3(this, new a(o0(str, i, i10), str, i, 2, "ink_layer", q1Var.f26743b, 0.0f, 0.0f, 1.0f, 0.0f, sVar.b(h.Companion.serializer(), hVar)), cVar, 1), 3);
            }
        }
    }

    public final void F(int i, int i10) {
        String y10 = y(i);
        if (this.f26537k.remove(new pe.j(y10, Integer.valueOf(i10))) != null && !y10.startsWith("?")) {
            Q(qe.m.g("paper::" + y10 + "::" + i10));
        }
    }

    public final void F0(int i, String str) {
        if (!str.startsWith("?")) {
            b8 b8Var = (b8) a.h(str, Integer.valueOf(i), this.f26537k);
            if (b8Var == null) {
                return;
            }
            k kVar = new k(b8Var.f25967a, b8Var.f25968b);
            fg.s sVar = this.f26549w;
            sVar.getClass();
            pf.b0.x(androidx.lifecycle.h(this), null, new j3(this, new a("paper::" + str + "::" + i, str, i, 2, "paper", 0, 0.0f, 0.0f, 1.0f, 0.0f, sVar.b(k.Companion.serializer(), kVar)), null, 2), 3);
        }
    }

    public final void G(Context context, int i) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            this.f26541o.g(context, str);
        }
    }

    public final void G0(String str, int i, c cVar) {
        if (str.startsWith("?")) {
            return;
        }
        n nVar = new n(cVar.f25970b, cVar.f25971c, cVar.f25972d, cVar.e, cVar.f25973f, cVar.f25974g, cVar.f25975h, cVar.f25980n, cVar.f25981o, cVar.f25982p);
        fg.s sVar = this.f26549w;
        sVar.getClass();
        pf.b0.x(androidx.lifecycle.h(this), null, new j3(this, new a(cVar.f25969a, str, i, 2, "shape", cVar.f25979m, cVar.i, cVar.f25976j, cVar.f25977k, cVar.f25978l, sVar.b(n.Companion.serializer(), nVar)), null, 3), 3);
    }

    public final void H(int i, int i10) {
        B(i, i10);
        a.x(this.f26543q, 1, this);
    }

    public final void H0(int i, int i10, int i11, Context context) {
        context.getClass();
        this.f26539m.m(i10, i11, context, y(i));
    }

    public final void I(int i, int i10) {
        b bVar;
        X();
        B(i, i10);
        a.x(this.f26543q, 1, this);
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26533f);
        if (vVar != null && (bVar = w.e(vVar).f1328c) != null) {
            ListIterator listIterator = bVar.listIterator(0);
            while (listIterator.hasNext()) {
                D0(y(i), i10, (b) listIterator.next());
            }
        }
    }

    public final void I0(String str, int i, d dVar) {
        if (str.startsWith("?")) {
            return;
        }
        t tVar = new t(dVar.f26034b, dVar.f26036d, dVar.e, dVar.f26035c, dVar.f26044n, dVar.f26045o, dVar.f26041k, dVar.f26042l, dVar.f26043m, dVar.f26046p, dVar.f26047q, dVar.f26048r, dVar.f26049s);
        fg.s sVar = this.f26549w;
        sVar.getClass();
        pf.b0.x(androidx.lifecycle.h(this), null, new j3(this, new a(dVar.f26033a, str, i, 2, "text", dVar.f26040j, dVar.f26037f, dVar.f26038g, dVar.f26039h, dVar.i, sVar.b(t.Companion.serializer(), tVar)), null, 4), 3);
    }

    public final void J(int i, int i10) {
        b bVar;
        X();
        B(i, i10);
        a.x(this.f26543q, 1, this);
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26535h);
        if (vVar != null && (bVar = w.e(vVar).f1328c) != null) {
            ListIterator listIterator = bVar.listIterator(0);
            while (listIterator.hasNext()) {
                G0(y(i), i10, (c) listIterator.next());
            }
        }
    }

    public final void J0(int i, int i10, Context context) {
        context.getClass();
        pf.r1 r1Var = this.B;
        if (r1Var != null) {
            r1Var.j(null);
        }
        this.B = pf.b0.x(androidx.lifecycle.h(this), null, new r2(this, i, i10, context, null), 3);
    }

    public final void K(int i, int i10) {
        b bVar;
        X();
        B(i, i10);
        a.x(this.f26543q, 1, this);
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26534g);
        if (vVar != null && (bVar = w.e(vVar).f1328c) != null) {
            ListIterator listIterator = bVar.listIterator(0);
            while (listIterator.hasNext()) {
                I0(y(i), i10, (d) listIterator.next());
            }
        }
    }

    public final void K0(int i, int i10, boolean z3) {
        this.f26542p.g(i10, y(i), z3);
    }

    public final void L0(Context context) {
        context.getClass();
        nd.o oVar = this.f26539m;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oVar.f21272v;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) oVar.f21273w;
        Set keySet = concurrentHashMap2.keySet();
        keySet.getClass();
        for (Object obj : qe.l.P(keySet)) {
            obj.getClass();
            pe.o oVar2 = (pe.o) obj;
            pf.d1 d1Var = (pf.d1) concurrentHashMap2.remove(oVar2);
            if (d1Var != null) {
                d1Var.j(null);
            }
            if (oVar.s(context, oVar2) == null && concurrentHashMap.containsKey(oVar2)) {
                linkedHashSet.add(oVar2);
            }
        }
        Set keySet2 = concurrentHashMap.keySet();
        keySet2.getClass();
        for (Object obj2 : qe.l.P(keySet2)) {
            obj2.getClass();
            pe.o oVar3 = (pe.o) obj2;
            if (!linkedHashSet.contains(oVar3) && !((ConcurrentHashMap.KeySetView) oVar.f21274x).contains(oVar3)) {
                concurrentHashMap.remove(oVar3);
            }
        }
        f1 f1Var = this.f26541o;
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) f1Var.A;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) f1Var.D;
        Set keySet3 = concurrentHashMap4.keySet();
        keySet3.getClass();
        for (String str : qe.l.P(keySet3)) {
            pf.d1 d1Var2 = (pf.d1) concurrentHashMap4.remove(str);
            if (d1Var2 != null) {
                d1Var2.j(null);
            }
            if (f1Var.q(context, str) == null && concurrentHashMap3.containsKey(str)) {
                linkedHashSet2.add(str);
            }
        }
        Set keySet4 = concurrentHashMap3.keySet();
        keySet4.getClass();
        for (String str2 : qe.l.P(keySet4)) {
            if (!linkedHashSet2.contains(str2) && !((ConcurrentHashMap.KeySetView) f1Var.E).contains(str2)) {
                concurrentHashMap3.remove(str2);
            }
        }
        v7.k kVar = this.f26542p;
        v7.k.h(kVar.f27441b, kVar.f27443d);
        v7.k.h(kVar.f27442c, kVar.e);
        y0.f22612b.clear();
        this.f26540n.i(context);
        v6.f26972g = null;
        v6.f26973h = null;
        HashMap hashMap = v6.i;
        synchronized (hashMap) {
            hashMap.clear();
        }
        z6.f27107a.clear();
        x4.f29438c.clear();
    }

    public final int M(int i, int i10) {
        int i11;
        int i12;
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        v vVar = (v) this.f26533f.get(jVar);
        int i13 = 0;
        if (vVar != null) {
            i11 = vVar.size();
        } else {
            i11 = 0;
        }
        v vVar2 = (v) this.f26534g.get(jVar);
        if (vVar2 != null) {
            i12 = vVar2.size();
        } else {
            i12 = 0;
        }
        int i14 = i11 + i12;
        v vVar3 = (v) this.f26535h.get(jVar);
        if (vVar3 != null) {
            i13 = vVar3.size();
        }
        return i14 + i13;
    }

    public final void M0(Context context, int i) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            f1 f1Var = this.f26541o;
            f1Var.getClass();
            File file = new File(f1.h(context), a.k("cover_", str, ".jpg"));
            ((ConcurrentHashMap) f1Var.f1459y).remove(file.getAbsolutePath());
            try {
                file.delete();
            } catch (Exception unused) {
            }
            v7.d a10 = v7.a(f1Var.m(context, str), null, false, 0, false, null, null, 0, 0.0f, 1.0f, 0.0f, 0.0f, null, 0, null, 30974);
            ((ConcurrentHashMap) f1Var.f1458x).put(str, a10);
            f1.o(str, context, a10);
            f1Var.f(str);
        }
    }

    public final String N(Context context, int i) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            this.f26541o.getClass();
            File file = new File(f1.h(context), a.k("coverdraw_", str, ".png"));
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            return null;
        }
        return null;
    }

    public final void N0(int i, int i10, Context context, String str) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        str.getClass();
        context.getClass();
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        Integer c10 = a.c(str);
        if (c10 != null) {
            int intValue = c10.intValue();
            pe.j jVar2 = new pe.j(y(i), Integer.valueOf(i10));
            List list = (List) this.i.get(jVar2);
            if (list == null) {
                list = a.f25881a;
            }
            if (list.size() > 1) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((q1) it.next()).f26742a == intValue) {
                            K0(i, i10, true);
                            String y10 = y(i);
                            int i11 = intValue * 2;
                            int[] iArr = {i11, a.b(intValue)};
                            for (int i12 = 0; i12 < 2; i12++) {
                                int i13 = iArr[i12];
                                this.f26539m.e(y10, i10, i13);
                                this.f26539m.q(y10, i10, i13);
                                try {
                                    this.f26539m.getClass();
                                    nd.o.g(i10, i13, context, y10).delete();
                                } catch (Throwable unused) {
                                }
                            }
                            this.f26540n.e(context, y10, i10, qe.m.h(Integer.valueOf(i11), Integer.valueOf(a.b(intValue))));
                            y yVar = this.i;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list2) {
                                if (((q1) obj).f26742a != intValue) {
                                    arrayList.add(obj);
                                }
                            }
                            yVar.put(jVar2, arrayList);
                            Integer num = (Integer) this.f26536j.get(jVar2);
                            if (num != null && num.intValue() == intValue) {
                                this.f26536j.remove(jVar2);
                            }
                            if (!y10.startsWith("?")) {
                                Q(qe.m.g(o0(y10, i10, intValue)));
                            }
                            B(i, i10);
                            a.x(this.f26543q, 1, this);
                            this.f26546t = true;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        v vVar = (v) this.f26533f.get(jVar);
        if (vVar != null && !vVar.isEmpty()) {
            ListIterator listIterator = vVar.listIterator();
            do {
                c0Var3 = (c0) listIterator;
                if (c0Var3.hasNext()) {
                }
            } while (!kotlin.jvm.internal.a(((b) c0Var3.next()).f25917a, str));
            O0(str, i, i10);
            return;
        }
        v vVar2 = (v) this.f26534g.get(jVar);
        if (vVar2 != null && !vVar2.isEmpty()) {
            ListIterator listIterator2 = vVar2.listIterator();
            do {
                c0Var2 = (c0) listIterator2;
                if (c0Var2.hasNext()) {
                }
            } while (!kotlin.jvm.internal.a(((d) c0Var2.next()).f26033a, str));
            Q0(str, i, i10);
            return;
        }
        v vVar3 = (v) this.f26535h.get(jVar);
        if (vVar3 != null && !vVar3.isEmpty()) {
            ListIterator listIterator3 = vVar3.listIterator();
            do {
                c0Var = (c0) listIterator3;
                if (!c0Var.hasNext()) {
                    return;
                }
            } while (!kotlin.jvm.internal.a(((c) c0Var.next()).f25969a, str));
            P0(str, i, i10);
        }
    }

    public final String O(int i) {
        String str;
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            return str;
        }
        return a.g(i, "?");
    }

    public final void O0(String str, int i, int i10) {
        str.getClass();
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26533f);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((b) c0Var.next()).f25917a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, true);
                vVar.remove(i11);
                B(i, i10);
                Z0(this.f26543q.h() + 1);
                Q(qe.m.g(str));
            }
        }
    }

    public final int P(int i) {
        String O = O(i);
        f1 f1Var = this.f26541o;
        f1Var.getClass();
        Integer num = (Integer) ((y) f1Var.f1460z).get(O);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void P0(String str, int i, int i10) {
        str.getClass();
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26535h);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((c) c0Var.next()).f25969a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, true);
                vVar.remove(i11);
                B(i, i10);
                Z0(this.f26543q.h() + 1);
                Q(qe.m.g(str));
            }
        }
    }

    public final void Q(List list) {
        pf.b0.x(androidx.lifecycle.h(this), null, new a(this, list, null, 14), 3);
    }

    public final void Q0(String str, int i, int i10) {
        str.getClass();
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26534g);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((d) c0Var.next()).f26033a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, true);
                vVar.remove(i11);
                B(i, i10);
                Z0(this.f26543q.h() + 1);
                Q(qe.m.g(str));
            }
        }
    }

    public final void R(Context context, String str) {
        String str2;
        Object obj;
        context.getClass();
        str.getClass();
        int size = this.f26547u.size() - 1;
        if (size < 0) {
            size = 0;
        }
        c.i("notebook_deleted", c.c(new pe.j("total", Integer.valueOf(size))));
        c.p(size);
        Iterator it = this.f26547u.iterator();
        while (true) {
            str2 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.a(((b) obj).f21848a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            str2 = bVar.f21853g;
        }
        a h3 = androidx.lifecycle.h(this);
        wf.e eVar = pf.l0.f22767a;
        pf.b0.x(h3, wf.d.f29913w, new l2(this, context, str, str2, (te.c) null), 2);
    }

    public final void R0(int i, int i10, Context context) {
        context.getClass();
        Z(i, i10, context, l(i, i10));
        this.f26542p.e(context, y(i), i10);
    }

    public final int S(int i, int i10, Context context) {
        int i11;
        Context context2;
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null) {
            int i12 = bVar.f21850c;
            if (i12 <= 1) {
                D(i, i10, context);
                return 0;
            }
            int i13 = i12 - 1;
            int i14 = i10;
            while (i14 < i13) {
                jf.d dVar = v7.j.f27439a;
                int i15 = dVar.f19189u;
                int i16 = dVar.f19190v;
                if (i15 <= i16) {
                    int i17 = i15;
                    while (true) {
                        i11 = i;
                        context2 = context;
                        a1(i11, i14 + 1, i14, i17, context2);
                        if (i17 != i16) {
                            i17++;
                            i = i11;
                            context = context2;
                        }
                    }
                } else {
                    i11 = i;
                    context2 = context;
                }
                int i18 = i14 + 1;
                v0(i11, i18, i14);
                u0(i11, i18, i14, false);
                w0(i11, i18, i14);
                i14 = i18;
                i = i11;
                context = context2;
            }
            D(i, i13, context);
            m1(this, a(bVar, null, i13, 123));
            int i19 = i12 - 2;
            if (i10 > i19) {
                return i19;
            }
        }
        return i10;
    }

    public final void S0(int i) {
        sf.n0 n0Var;
        Object value;
        te.c cVar;
        do {
            n0Var = this.f26531c;
            value = n0Var.getValue();
            cVar = null;
        } while (!n0Var.i(value, a((m2) value, null, null, i, 3)));
        pf.b0.x(androidx.lifecycle.h(this), null, new z2(this, i, cVar, 1), 3);
    }

    public final String T(String str, int i, int i10) {
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        ArrayList arrayList;
        str.getClass();
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        v vVar = (v) this.f26533f.get(jVar);
        String str3 = null;
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    obj3 = c0Var.next();
                    if (kotlin.jvm.internal.a(((b) obj3).f25917a, str)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            b bVar = (b) obj3;
            if (bVar != null) {
                String i11 = a.i();
                b a10 = a(bVar, i11, null, bVar.f25919c + 0.03f, bVar.f25920d + 0.03f, 0.0f, 0.0f, 0, false, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194162);
                String str4 = a10.f25918b;
                String L = L(str4);
                if (L == null) {
                    str2 = str4;
                } else {
                    str2 = L;
                }
                List list = a10.f25928n;
                if (list != null) {
                    List<String> list2 = list;
                    ArrayList arrayList2 = new ArrayList(qe.m.d(list2, 10));
                    for (String str5 : list2) {
                        if (str5 != null) {
                            String L2 = L(str5);
                            if (L2 != null) {
                                str5 = L2;
                            }
                        } else {
                            str5 = null;
                        }
                        arrayList2.add(str5);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                String str6 = a10.f25934t;
                if (str6 != null && (str3 = L(str6)) == null) {
                    str3 = str6;
                }
                n(this, i, i10, a(a10, null, str2, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, null, arrayList, false, 0.0f, 0.0f, 0.0f, 0.0f, str3, 3661821), null, null, 56);
                return i11;
            }
        }
        v vVar2 = (v) this.f26534g.get(jVar);
        if (vVar2 != null) {
            ListIterator listIterator2 = vVar2.listIterator();
            while (true) {
                c0 c0Var2 = (c0) listIterator2;
                if (c0Var2.hasNext()) {
                    obj2 = c0Var2.next();
                    if (kotlin.jvm.internal.a(((d) obj2).f26033a, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            d dVar = (d) obj2;
            if (dVar != null) {
                String i12 = a.i();
                p(i, i10, a(dVar, i12, null, null, 0, dVar.f26037f + 0.03f, dVar.f26038g + 0.03f, 0.0f, 0.0f, 0, false, false, null, false, false, null, null, 0, 0.0f, 523678));
                return i12;
            }
        }
        v vVar3 = (v) this.f26535h.get(jVar);
        if (vVar3 != null) {
            ListIterator listIterator3 = vVar3.listIterator();
            while (true) {
                c0 c0Var3 = (c0) listIterator3;
                if (c0Var3.hasNext()) {
                    obj = c0Var3.next();
                    if (kotlin.jvm.internal.a(((c) obj).f25969a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c cVar = (c) obj;
            if (cVar != null) {
                String i13 = a.i();
                o(i, i10, a(cVar, i13, null, null, 0.0f, 0.0f, 0.0f, 0.0f, cVar.i + 0.03f, cVar.f25976j + 0.03f, 0.0f, 0.0f, 0, false, false, null, 60670));
                return i13;
            }
        }
        return null;
    }

    public final void T0(int i, Context context, Uri uri) {
        String str;
        context.getClass();
        uri.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            f1 f1Var = this.f26541o;
            f1Var.getClass();
            a aVar = (a) f1Var.f1456v;
            wf.e eVar = pf.l0.f22767a;
            pf.b0.x(aVar, wf.d.f29913w, new l2(f1Var, context, str, (Parcelable) uri, (te.c) null, 26), 2);
        }
    }

    public final void U() {
        v7.k kVar = this.f26542p;
        if (!kVar.i && kVar.f27445g) {
            int i = kVar.f27446h - 1;
            kVar.f27446h = i;
            if (i <= 0) {
                kVar.f27446h = 0;
                kVar.b();
                kVar.f27445g = false;
            }
        }
    }

    public final void U0(v2 v2Var) {
        this.f26550x = v2Var;
    }

    public final void V(int i, int i10, b bVar, float f10, Context context) {
        boolean z3;
        float f11;
        int i11;
        float f12;
        Rect rect;
        Bitmap bitmap;
        int i12 = i;
        bVar.getClass();
        context.getClass();
        boolean z9 = true;
        if (!this.F && !Z(i12, i10, context, l(i, i10))) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.F = false;
        if (!bVar.isEmpty()) {
            synchronized (b.f16774a) {
                b.f16777d++;
            }
            int[] l10 = l(i, i10);
            float f13 = 2048;
            float f14 = f13 / 1.3333334f;
            int round = Math.round(f14);
            float f15 = ((((((f13 / f13) * 3.6864f) * f10) / f13) * f13) / 2.0f) + 2.0f;
            ListIterator listIterator = bVar.listIterator(0);
            float f16 = Float.MAX_VALUE;
            float f17 = -3.4028235E38f;
            float f18 = -3.4028235E38f;
            float f19 = Float.MAX_VALUE;
            while (listIterator.hasNext()) {
                boolean z10 = z9;
                long j10 = ((b) listIterator.next()).f18762a;
                boolean z11 = z3;
                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f13;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * round;
                if (intBitsToFloat < f16) {
                    f16 = intBitsToFloat;
                }
                if (intBitsToFloat > f17) {
                    f17 = intBitsToFloat;
                }
                if (intBitsToFloat2 < f19) {
                    f19 = intBitsToFloat2;
                }
                if (intBitsToFloat2 > f18) {
                    f18 = intBitsToFloat2;
                }
                z9 = z10;
                z3 = z11;
            }
            boolean z12 = z3;
            float f20 = f13;
            Rect rect2 = new Rect(b9.e((int) (f16 - f15), 0, 2048), b9.e((int) (f19 - f15), 0, round), b9.e(((int) (f17 + f15)) + 1, 0, 2048), b9.e(((int) (f18 + f15)) + 1, 0, round));
            float round2 = Math.round(f14);
            int i13 = 0;
            while (i13 < 2) {
                int i14 = l10[i13];
                try {
                    Bitmap g02 = g0(i12, i10, i14, context);
                    if (!z12) {
                        float f21 = round2;
                        v7.k kVar = this.f26542p;
                        int i15 = i13;
                        String y10 = y(i);
                        int i16 = rect2.left;
                        int i17 = rect2.top;
                        i11 = i15;
                        int i18 = rect2.right;
                        int i19 = rect2.bottom;
                        f12 = f20;
                        f11 = f21;
                        rect = rect2;
                        bitmap = g02;
                        kVar.f(y10, i10, i14, i16, i17, i18, i19, context);
                    } else {
                        f11 = round2;
                        i11 = i13;
                        f12 = f20;
                        rect = rect2;
                        bitmap = g02;
                    }
                    n4.f1(new Canvas(bitmap), bVar, f10, f12, f11);
                } catch (OutOfMemoryError unused) {
                    f11 = round2;
                    i11 = i13;
                    f12 = f20;
                    rect = rect2;
                }
                i13 = i11 + 1;
                round2 = f11;
                rect2 = rect;
                i12 = i;
                f20 = f12;
            }
            H(i, i10);
            int[] l11 = l(i, i10);
            for (int i20 = 0; i20 < 2; i20++) {
                this.f26539m.m(i10, l11[i20], context, y(i));
            }
        }
    }

    public final void V0(int i, Context context, Integer num) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            f1 f1Var = this.f26541o;
            f1Var.getClass();
            v7.d a10 = v7.a(f1Var.m(context, str), null, false, 0, false, num, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, null, 32751);
            ((ConcurrentHashMap) f1Var.f1458x).put(str, a10);
            f1.o(str, context, a10);
            f1Var.f(str);
        }
    }

    public final void W(int i, int i10, float f10, float f11, int i11, Context context) {
        context.getClass();
        Z(i, i10, context, l(i, i10));
        this.f26544r = SystemClock.uptimeMillis();
        pf.b0.x(androidx.lifecycle.h(this), pf.l0.f22767a, new g3(this, i, i10, context, f10, f11, i11, null), 2);
    }

    public final void W0(int i, int i10, List list) {
        b bVar;
        b bVar2;
        b bVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList F;
        list.getClass();
        K0(i, i10, true);
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        int size = list.size();
        Iterator it = list.iterator();
        int i15 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            y yVar = this.f26535h;
            y yVar2 = this.f26534g;
            y yVar3 = this.f26533f;
            if (hasNext) {
                Object next = it.next();
                int i16 = i15 + 1;
                if (i15 >= 0) {
                    String str = (String) next;
                    int i17 = (size - i15) * 10;
                    Integer c10 = a.c(str);
                    if (c10 != null) {
                        y yVar4 = this.i;
                        List list2 = (List) yVar4.get(jVar);
                        if (list2 == null) {
                            list2 = a.f25881a;
                        }
                        Iterator it2 = list2.iterator();
                        int i18 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                if (((q1) it2.next()).f26742a == c10.intValue()) {
                                    break;
                                } else {
                                    i18++;
                                }
                            } else {
                                i18 = -1;
                                break;
                            }
                        }
                        if (i18 >= 0) {
                            F = new ArrayList(list2);
                            F.set(i18, a((q1) F.get(i18), i17, false, false, null, 29));
                        } else {
                            F = qe.l.F(list2, new q1(c10.intValue(), i17, 28));
                        }
                        yVar4.put(jVar, F);
                    } else {
                        v vVar = (v) yVar3.get(jVar);
                        if (vVar != null) {
                            ListIterator listIterator = vVar.listIterator();
                            i11 = 0;
                            while (true) {
                                c0 c0Var = (c0) listIterator;
                                if (!c0Var.hasNext()) {
                                    break;
                                } else if (kotlin.jvm.internal.a(((b) c0Var.next()).f25917a, str)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        i11 = -1;
                        if (i11 >= 0) {
                            Object obj = yVar3.get(jVar);
                            obj.getClass();
                            Object obj2 = yVar3.get(jVar);
                            obj2.getClass();
                            ((v) obj).set(i11, a((b) ((v) obj2).get(i11), null, null, 0.0f, 0.0f, 0.0f, 0.0f, i17, false, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194175));
                        } else {
                            v vVar2 = (v) yVar2.get(jVar);
                            if (vVar2 != null) {
                                ListIterator listIterator2 = vVar2.listIterator();
                                i12 = 0;
                                while (true) {
                                    c0 c0Var2 = (c0) listIterator2;
                                    if (!c0Var2.hasNext()) {
                                        break;
                                    } else if (kotlin.jvm.internal.a(((d) c0Var2.next()).f26033a, str)) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            i12 = -1;
                            if (i12 >= 0) {
                                Object obj3 = yVar2.get(jVar);
                                obj3.getClass();
                                Object obj4 = yVar2.get(jVar);
                                obj4.getClass();
                                ((v) obj3).set(i12, a((d) ((v) obj4).get(i12), null, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, i17, false, false, null, false, false, null, null, 0, 0.0f, 523775));
                            } else {
                                v vVar3 = (v) yVar.get(jVar);
                                if (vVar3 != null) {
                                    ListIterator listIterator3 = vVar3.listIterator();
                                    int i19 = 0;
                                    while (true) {
                                        c0 c0Var3 = (c0) listIterator3;
                                        if (c0Var3.hasNext()) {
                                            if (kotlin.jvm.internal.a(((c) c0Var3.next()).f25969a, str)) {
                                                i14 = i19;
                                                break;
                                            }
                                            i19++;
                                        } else {
                                            i14 = -1;
                                            break;
                                        }
                                    }
                                    i13 = i14;
                                } else {
                                    i13 = -1;
                                }
                                if (i13 >= 0) {
                                    Object obj5 = yVar.get(jVar);
                                    obj5.getClass();
                                    Object obj6 = yVar.get(jVar);
                                    obj6.getClass();
                                    ((v) obj5).set(i13, a((c) ((v) obj6).get(i13), null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, i17, false, false, null, 61439));
                                }
                            }
                        }
                    }
                    i15 = i16;
                } else {
                    qe.m.l();
                    throw null;
                }
            } else {
                v vVar4 = (v) a.h(y(i), Integer.valueOf(i10), yVar3);
                if (vVar4 != null && (bVar3 = w.e(vVar4).f1328c) != null) {
                    ListIterator listIterator4 = bVar3.listIterator(0);
                    while (listIterator4.hasNext()) {
                        D0(y(i), i10, (b) listIterator4.next());
                    }
                }
                v vVar5 = (v) a.h(y(i), Integer.valueOf(i10), yVar2);
                if (vVar5 != null && (bVar2 = w.e(vVar5).f1328c) != null) {
                    ListIterator listIterator5 = bVar2.listIterator(0);
                    while (listIterator5.hasNext()) {
                        I0(y(i), i10, (d) listIterator5.next());
                    }
                }
                v vVar6 = (v) a.h(y(i), Integer.valueOf(i10), yVar);
                if (vVar6 != null && (bVar = w.e(vVar6).f1328c) != null) {
                    ListIterator listIterator6 = bVar.listIterator(0);
                    while (listIterator6.hasNext()) {
                        G0(y(i), i10, (c) listIterator6.next());
                    }
                }
                Iterator it3 = q0(i, i10).iterator();
                while (it3.hasNext()) {
                    E0(y(i), i10, ((q1) it3.next()).f26742a);
                }
                B(i, i10);
                a.x(this.f26543q, 1, this);
                return;
            }
        }
    }

    public final void X() {
        v7.k kVar = this.f26542p;
        if (!kVar.i && !kVar.f27445g && kVar.f27444f != null) {
            kVar.b();
        }
    }

    public final void X0(int i, Context context, boolean z3) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            f1 f1Var = this.f26541o;
            f1Var.getClass();
            v7.d a10 = v7.a(f1Var.m(context, str), null, false, 0, z3, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, null, 32759);
            ((ConcurrentHashMap) f1Var.f1458x).put(str, a10);
            f1.o(str, context, a10);
            f1Var.f(str);
        }
    }

    public final void Y(Context context, String str) {
        b bVar;
        str.getClass();
        int x9 = x(str);
        if (x9 >= 0 && (bVar = (b) qe.l.y(x9, this.f26547u)) != null) {
            int i = bVar.f21850c;
            for (int i10 = 0; i10 < i; i10++) {
                if (this.f26540n.u(context, str, i10)) {
                    Z(x9, i10, context, qe.l.O(qe.l.P(v7.j.f27439a)));
                }
            }
        }
    }

    public final void Y0(String str, int i, int i10, String str2) {
        b8 i12 = i1(i, i10);
        if (str == null) {
            str = i12.f25967a;
        }
        if (str2 == null) {
            str2 = i12.f25968b;
        }
        b8 b8Var = new b8(str, str2);
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.f26537k;
        if (b8Var.equals(yVar.get(jVar))) {
            return;
        }
        K0(i, i10, true);
        yVar.put(new pe.j(y(i), Integer.valueOf(i10)), b8Var);
        F0(i10, y(i));
        B(i, i10);
        a.x(this.f26543q, 1, this);
    }

    public final boolean Z(int i, int i10, Context context, int[] iArr) {
        int i11;
        boolean z3;
        String y10 = y(i);
        j.i0 i0Var = this.f26540n;
        synchronized (i0Var) {
            context.getClass();
            int length = iArr.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (!i0Var.q(context, new pe.o(y10, Integer.valueOf(i10), Integer.valueOf(iArr[i12]))).isEmpty()) {
                        z3 = true;
                        break;
                    }
                    i12++;
                } else {
                    z3 = false;
                    break;
                }
            }
        }
        if (!z3) {
            return false;
        }
        u(i, i10);
        this.f26542p.g(i10, y10, true);
        this.f26542p.e(context, y10, i10);
        ArrayList arrayList = new ArrayList();
        try {
            for (int i13 : iArr) {
                List J = this.f26540n.J(i10, i13, context, y10);
                if (!J.isEmpty()) {
                    x0 x0Var = y0.f22611a;
                    y0.a(g0(i, i10, i13, context), J);
                    this.f26539m.m(i10, i13, context, y10);
                }
                arrayList.add(Integer.valueOf(i13));
            }
        } catch (OutOfMemoryError unused) {
        }
        this.f26540n.e(context, y10, i10, arrayList);
        U();
        H(i, i10);
        return true;
    }

    public final void Z0(int i) {
        this.f26543q.i(i);
    }

    public final ArrayList a0(Context context) {
        context.getClass();
        nd.o oVar = this.f26539m;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oVar.f21273w;
        Set keySet = concurrentHashMap.keySet();
        keySet.getClass();
        for (Object obj : qe.l.P(keySet)) {
            obj.getClass();
            pe.o oVar2 = (pe.o) obj;
            pf.d1 d1Var = (pf.d1) concurrentHashMap.remove(oVar2);
            if (d1Var != null) {
                d1Var.j(null);
            }
            pf.r1 s10 = oVar.s(context, oVar2);
            if (s10 != null) {
                arrayList.add(s10);
            }
        }
        f1 f1Var = this.f26541o;
        f1Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f1Var.D;
        Set keySet2 = concurrentHashMap2.keySet();
        keySet2.getClass();
        for (String str : qe.l.P(keySet2)) {
            pf.d1 d1Var2 = (pf.d1) concurrentHashMap2.remove(str);
            if (d1Var2 != null) {
                d1Var2.j(null);
            }
            pf.r1 q10 = f1Var.q(context, str);
            if (q10 != null) {
                arrayList2.add(q10);
            }
        }
        return qe.l.E(qe.l.E(arrayList, arrayList2), this.f26540n.i(context));
    }

    public final void a1(int i, int i10, int i11, int i12, Context context) {
        this.f26540n.B(context, y(i), i10, i11, i12, false);
        this.f26539m.p(context, y(i), i10, i11, i12, false, new o2(this, i, i11, 0));
        A(i, i11);
    }

    public final void b1(int i, int i10, int i11, Context context) {
        b bVar;
        int i12;
        b bVar2;
        if (i11 > 0 && (bVar = (b) qe.l.y(i, this.f26547u)) != null) {
            int i13 = bVar.f21850c - 1;
            if (i10 <= i13) {
                while (true) {
                    jf.d dVar = v7.j.f27439a;
                    int i14 = dVar.f19189u;
                    int i15 = dVar.f19190v;
                    if (i14 <= i15) {
                        while (true) {
                            a1(i, i13, i13 + i11, i14, context);
                            i12 = i13;
                            if (i14 == i15) {
                                break;
                            }
                            i14++;
                            i13 = i12;
                        }
                    } else {
                        i12 = i13;
                    }
                    int i16 = i12 + i11;
                    v0(i, i12, i16);
                    u0(i, i12, i16, false);
                    v vVar = (v) a.h(y(i), Integer.valueOf(i16), this.f26533f);
                    if (vVar != null && (bVar2 = w.e(vVar).f1328c) != null) {
                        ListIterator listIterator = bVar2.listIterator(0);
                        while (listIterator.hasNext()) {
                            O0(((b) listIterator.next()).f25917a, i, i16);
                        }
                    }
                    for (b bVar3 : qe.l.P(f1(i, i12))) {
                        O0(bVar3.f25917a, i, i12);
                        n(this, i, i16, bVar3, null, null, 24);
                    }
                    if (i12 == i10) {
                        break;
                    } else {
                        i13 = i12 - 1;
                    }
                }
            }
            int i17 = i10 + i11;
            for (int i18 = i10; i18 < i17; i18++) {
                D(i, i18, context);
            }
        }
    }

    public final Bitmap c0(Context context, int i) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            return this.f26541o.l(context, str);
        }
        Bitmap createBitmap = Bitmap.createBitmap(1024, 1536, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        return createBitmap;
    }

    @Override // androidx.lifecycle.u0
    public final void d() {
        List list = e.f22444a;
        e.f22448f = null;
    }

    public final v7.d d0(Context context, int i) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            return this.f26541o.m(context, str);
        }
        return new v7.d(null, true, v7.c.f27404a, false, null, "none", 0, 0.35f, 1.0f, 0.0f, 0.0f, null, false, v7.c.f27405b, qe.s.f24023u);
    }

    public final File e0(int i, int i10, int i11, Context context) {
        String str;
        String str2;
        File file = new File(context.getFilesDir(), "drawings");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (i11 == 0) {
            str = "highlighter";
        } else {
            str = "main";
        }
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null) {
            str2 = bVar.f21848a;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return new File(file, a.j(i10, ".png", a.q("drawing_", str, "_notebook_", str2, "_page_")));
        }
        return new File(file, a.j(i10, ".png", a5.a.m("drawing_", str, "_book_", i, "_page_")));
    }

    public final boolean e1(int i, int i10, Context context) {
        context.getClass();
        return l0(i, i10, context);
    }

    public final boolean f0() {
        return this.f26546t;
    }

    public final List f1(int i, int i10) {
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26533f);
        if (vVar != null) {
            return vVar;
        }
        return qe.s.f24023u;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:45|(7:50|51|(10:57|58|(1:60)|61|(1:63)(1:67)|64|65|56|(0)(0)|28)|55|56|(0)(0)|28)|69|51|(1:53)|57|58|(0)|61|(0)(0)|64|65|56|(0)(0)|28) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:78|79|(4:84|18|(0)(0)|28)|85|86|(6:113|114|115|116|117|(1:119))(1:88)|89|(3:107|108|(1:110))|91|92|93|94|95|96|(0)(0)|28) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0116 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x0030, B:11:0x003b, B:13:0x004c, B:20:0x0176, B:22:0x017f, B:24:0x0187, B:26:0x0194, B:31:0x019e, B:34:0x01d1, B:37:0x01b1, B:43:0x01bb, B:45:0x0069, B:47:0x006f, B:51:0x007f, B:53:0x008b, B:58:0x0092, B:60:0x009b, B:61:0x009e, B:64:0x00af, B:67:0x00a5, B:70:0x0053, B:76:0x005d, B:79:0x00be, B:81:0x00ce, B:85:0x00d8, B:114:0x00fc, B:117:0x0108, B:119:0x0116, B:89:0x0128, B:108:0x012e, B:110:0x0144, B:92:0x0153, B:95:0x015f, B:104:0x016d, B:105:0x0170), top: B:3:0x0017, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0176 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x0030, B:11:0x003b, B:13:0x004c, B:20:0x0176, B:22:0x017f, B:24:0x0187, B:26:0x0194, B:31:0x019e, B:34:0x01d1, B:37:0x01b1, B:43:0x01bb, B:45:0x0069, B:47:0x006f, B:51:0x007f, B:53:0x008b, B:58:0x0092, B:60:0x009b, B:61:0x009e, B:64:0x00af, B:67:0x00a5, B:70:0x0053, B:76:0x005d, B:79:0x00be, B:81:0x00ce, B:85:0x00d8, B:114:0x00fc, B:117:0x0108, B:119:0x0116, B:89:0x0128, B:108:0x012e, B:110:0x0144, B:92:0x0153, B:95:0x015f, B:104:0x016d, B:105:0x0170), top: B:3:0x0017, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b A[Catch: all -> 0x0038, OutOfMemoryError -> 0x00b4, TryCatch #0 {OutOfMemoryError -> 0x00b4, blocks: (B:58:0x0092, B:60:0x009b, B:61:0x009e, B:64:0x00af, B:67:0x00a5), top: B:57:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a5 A[Catch: all -> 0x0038, OutOfMemoryError -> 0x00b4, TryCatch #0 {OutOfMemoryError -> 0x00b4, blocks: (B:58:0x0092, B:60:0x009b, B:61:0x009e, B:64:0x00af, B:67:0x00a5), top: B:57:0x0092 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap g0(int r22, int r23, int r24, android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.g0(int, int, int, android.content.Context):android.graphics.Bitmap");
    }

    public final List g1(int i, int i10) {
        if (Looper.getMainLooper().isCurrentThread()) {
            return h1(i, i10);
        }
        i u9 = p.k().u(null);
        try {
            i j10 = u9.j();
            try {
                return h1(i, i10);
            } finally {
                i.q(j10);
            }
        } finally {
            u9.c();
        }
    }

    public final Bitmap h0(int i, int i10, int i11, Context context) {
        context.getClass();
        try {
            return g0(i, i10, i11, context);
        } catch (OutOfMemoryError e) {
            try {
                kc.c cVar = (kc.c) bc.g.c().b(kc.c.class);
                if (cVar != null) {
                    cVar.a(e);
                    return null;
                }
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public final List h1(int i, int i10) {
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        ArrayList arrayList = new ArrayList();
        v vVar = (v) this.f26533f.get(jVar);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (!c0Var.hasNext()) {
                    break;
                }
                arrayList.add(new w7((b) c0Var.next()));
            }
        }
        v vVar2 = (v) this.f26534g.get(jVar);
        if (vVar2 != null) {
            ListIterator listIterator2 = vVar2.listIterator();
            while (true) {
                c0 c0Var2 = (c0) listIterator2;
                if (!c0Var2.hasNext()) {
                    break;
                }
                arrayList.add(new z7((d) c0Var2.next()));
            }
        }
        v vVar3 = (v) this.f26535h.get(jVar);
        if (vVar3 != null) {
            ListIterator listIterator3 = vVar3.listIterator();
            while (true) {
                c0 c0Var3 = (c0) listIterator3;
                if (!c0Var3.hasNext()) {
                    break;
                }
                arrayList.add(new y7((c) c0Var3.next()));
            }
        }
        for (q1 q1Var : q0(i, i10)) {
            arrayList.add(new x7(q1Var.f26742a, q1Var.f26743b, q1Var.e, q1Var.f26744c, q1Var.f26745d));
        }
        return qe.l.K(arrayList, new y2(1));
    }

    public final sf.a0 i0() {
        return this.f26532d;
    }

    public final b8 i1(int i, int i10) {
        b8 b8Var = (b8) a.h(y(i), Integer.valueOf(i10), this.f26537k);
        if (b8Var == null) {
            return new b8();
        }
        return b8Var;
    }

    public final int j(int i, int i10) {
        Object next;
        List q02 = q0(i, i10);
        Integer num = (Integer) a.h(y(i), Integer.valueOf(i10), this.f26536j);
        if (num != null) {
            List list = q02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((q1) it.next()).f26742a == num.intValue()) {
                        return num.intValue();
                    }
                }
            }
        }
        List list2 = q02;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            q1 q1Var = (q1) obj;
            if (!q1Var.f26745d && q1Var.f26744c) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        Object obj2 = null;
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int i11 = ((q1) next).f26743b;
                do {
                    Object next2 = it2.next();
                    int i12 = ((q1) next2).f26743b;
                    if (i11 < i12) {
                        next = next2;
                        i11 = i12;
                    }
                } while (it2.hasNext());
            }
        }
        q1 q1Var2 = (q1) next;
        if (q1Var2 == null) {
            Iterator it3 = list2.iterator();
            if (it3.hasNext()) {
                obj2 = it3.next();
                if (it3.hasNext()) {
                    int i13 = ((q1) obj2).f26743b;
                    do {
                        Object next3 = it3.next();
                        int i14 = ((q1) next3).f26743b;
                        if (i13 < i14) {
                            obj2 = next3;
                            i13 = i14;
                        }
                    } while (it3.hasNext());
                }
            }
            q1Var2 = (q1) obj2;
        }
        if (q1Var2 != null) {
            return q1Var2.f26742a;
        }
        return 0;
    }

    public final boolean j0(Context context, int i) {
        String str;
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            c cVar = c.f17879a;
            if (c.f(context, str).isFile()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List j1(int i, int i10) {
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26535h);
        if (vVar != null) {
            return vVar;
        }
        return qe.s.f24023u;
    }

    public final int k(int i, int i10) {
        return a.b(j(i, i10));
    }

    public final boolean k0(int i, int i10, int i11, Context context) {
        context.getClass();
        s0(context);
        String y10 = y(i);
        nd.o oVar = this.f26539m;
        oVar.getClass();
        if (!((ConcurrentHashMap) oVar.f21272v).containsKey(new pe.o(y10, Integer.valueOf(i10), Integer.valueOf(i11))) && !nd.o.g(i10, i11, context, y10).exists()) {
            int i12 = i10 * 2;
            if (!e0(i, i12 + 2, i11, context).exists() && !e0(i, i12 + 3, i11, context).exists()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final List k1(int i, int i10) {
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26534g);
        if (vVar != null) {
            return vVar;
        }
        return qe.s.f24023u;
    }

    public final int[] l(int i, int i10) {
        int j10 = j(i, i10);
        return new int[]{j10 * 2, a.b(j10)};
    }

    public final boolean l0(int i, int i10, Context context) {
        int nextInt;
        nd.o oVar;
        String y10 = y(i);
        if (!this.f26540n.u(context, y10, i10)) {
            Iterable iterable = v7.j.f27439a;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                do {
                    jf.c cVar = (jf.c) it;
                    if (cVar.f19194w) {
                        nextInt = cVar.nextInt();
                        oVar = this.f26539m;
                        oVar.getClass();
                        if (nd.o.g(i10, nextInt, context, y10).exists() || ((ConcurrentHashMap) oVar.f21273w).containsKey(new pe.o(y10, Integer.valueOf(i10), Integer.valueOf(nextInt)))) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                } while (!((ConcurrentHashMap) oVar.f21272v).containsKey(new pe.o(y10, Integer.valueOf(i10), Integer.valueOf(nextInt))));
                return true;
            }
            return false;
        }
        return true;
    }

    public final int l1(int i, int i10) {
        Integer num = (Integer) a.h(y(i), Integer.valueOf(i10), this.f26538l);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0012, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m0(java.lang.String r6) {
        /*
            r5 = this;
            y r0 = r5.f26533f
            q r0 = r0.f1410x
            if (r0 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L7d
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            r1 = r0
            g0 r1 = (g0) r1
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L7d
            r1 = r0
            f0 r1 = (f0) r1
            java.lang.Object r1 = r1.next()
            v r1 = (v) r1
            if (r1 == 0) goto L2d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2d
            goto L12
        L2d:
            java.util.ListIterator r1 = r1.listIterator()
        L31:
            r2 = r1
            c0 r2 = (c0) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L12
            java.lang.Object r2 = r2.next()
            b r2 = (b) r2
            java.lang.String r3 = r2.f25918b
            boolean r3 = kotlin.jvm.internal.a(r3, r6)
            if (r3 != 0) goto L7b
            java.util.List r3 = r2.f25928n
            if (r3 == 0) goto L73
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L5c
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5c
            goto L73
        L5c:
            java.util.Iterator r3 = r3.iterator()
        L60:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.jvm.internal.a(r4, r6)
            if (r4 == 0) goto L60
            goto L7b
        L73:
            java.lang.String r2 = r2.f25934t
            boolean r2 = kotlin.jvm.internal.a(r2, r6)
            if (r2 == 0) goto L31
        L7b:
            r6 = 1
            return r6
        L7d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.m0(java.lang.String):boolean");
    }

    public final int n0(String str) {
        str.getClass();
        return x(str);
    }

    public final void n1(int i, int i10, String str, float f10, float f11, float f12, float f13) {
        str.getClass();
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26533f);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((b) c0Var.next()).f25917a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, false);
                vVar.set(i11, a((b) vVar.get(i11), null, null, f10, f11, f12, f13, 0, false, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194243));
            }
        }
    }

    public final void o(int i, int i10, c cVar) {
        c cVar2;
        K0(i, i10, true);
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.f26535h;
        Object obj = yVar.get(jVar);
        if (obj == null) {
            obj = new v();
            yVar.put(jVar, obj);
        }
        v vVar = (v) obj;
        if (cVar.f25979m <= 0) {
            cVar2 = a(cVar, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, B0(i, i10), false, false, null, 61439);
        } else {
            cVar2 = cVar;
        }
        vVar.add(cVar2);
        B(i, i10);
        Z0(this.f26543q.h() + 1);
        c.e("shape", M(i, i10), null);
        G0(y(i), i10, cVar2);
    }

    public final void p(int i, int i10, d dVar) {
        d dVar2;
        K0(i, i10, true);
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.f26534g;
        Object obj = yVar.get(jVar);
        if (obj == null) {
            obj = new v();
            yVar.put(jVar, obj);
        }
        v vVar = (v) obj;
        if (dVar.f26040j <= 0) {
            dVar2 = a(dVar, null, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, B0(i, i10), false, false, null, false, false, null, null, 0, 0.0f, 523775);
        } else {
            dVar2 = dVar;
        }
        vVar.add(dVar2);
        B(i, i10);
        Z0(this.f26543q.h() + 1);
        c.e("text", M(i, i10), null);
        I0(y(i), i10, dVar2);
    }

    public final q1 p0(int i, int i10, int i11) {
        Object obj;
        Iterator it = q0(i, i10).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((q1) obj).f26742a == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        q1 q1Var = (q1) obj;
        if (q1Var == null) {
            return new q1(i11, 0, 30);
        }
        return q1Var;
    }

    public final void p1(int i, int i10, String str, float f10, float f11, float f12, float f13, Float f14) {
        Float f15;
        str.getClass();
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26534g);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((d) c0Var.next()).f26033a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, false);
                d dVar = (d) vVar.get(i11);
                if (f14 == null) {
                    f15 = ((d) vVar.get(i11)).f26046p;
                } else {
                    f15 = f14;
                }
                vVar.set(i11, a(dVar, null, null, null, 0, f10, f11, f12, f13, 0, false, false, null, false, false, f15, null, 0, 0.0f, 491039));
            }
        }
    }

    public final void q(int i, int i10, v7.n nVar, Context context) {
        nVar.getClass();
        context.getClass();
        String y10 = y(i);
        j.i0 i0Var = this.f26540n;
        synchronized (i0Var) {
            jf.d dVar = v7.j.f27439a;
            int i11 = dVar.f19189u;
            int i12 = dVar.f19190v;
            if (i11 <= i12) {
                while (true) {
                    i0Var.q(context, new pe.o(y10, Integer.valueOf(i10), Integer.valueOf(i11)));
                    if (i11 == i12) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        K0(i, i10, true);
        j.i0 i0Var2 = this.f26540n;
        synchronized (i0Var2) {
            pe.o oVar = new pe.o(y10, Integer.valueOf(i10), Integer.valueOf(nVar.f27463a));
            ArrayList F = qe.l.F(i0Var2.q(context, oVar), nVar);
            ((ConcurrentHashMap) i0Var2.f18637w).put(oVar, F);
            Log.d("ScraplyVecInk", "add pliego=" + i10 + " capa=" + nVar.f27463a + " pincel=" + nVar.f27464b + " puntos=" + nVar.f27467f.length + " grosorFrac=" + nVar.f27466d + " → " + F.size() + " trazo(s) en memoria");
            i0Var2.D(context, oVar);
        }
    }

    public final List q0(int i, int i10) {
        List list = (List) a.h(y(i), Integer.valueOf(i10), this.i);
        if (list == null) {
            return a.f25881a;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r36, x2 r37) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.r(int, x2):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r11 == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(int r9, java.lang.String r10, ve.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof h3
            if (r0 == 0) goto L13
            r0 = r11
            h3 r0 = (h3) r0
            int r1 = r0.f26277z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26277z = r1
            goto L18
        L13:
            h3 r0 = new h3
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f26275x
            int r1 = r0.f26277z
            r2 = 3
            r3 = 2
            r4 = 1
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L4f
            if (r1 == r4) goto L47
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            int r9 = r0.f26272u
            java.util.List r10 = r0.f26274w
            java.util.List r10 = (java.util.List) r10
            pe.a.e(r11)
            goto La6
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L3b:
            int r9 = r0.f26272u
            java.util.List r10 = r0.f26274w
            java.util.List r10 = (java.util.List) r10
            java.lang.String r1 = r0.f26273v
            pe.a.e(r11)
            goto L81
        L47:
            int r9 = r0.f26272u
            java.lang.String r10 = r0.f26273v
            pe.a.e(r11)
            goto L61
        L4f:
            pe.a.e(r11)
            r0.f26273v = r10
            r0.f26272u = r9
            r0.f26277z = r4
            n r11 = r8.f26530b
            java.io.Serializable r11 = r11.k(r10, r0)
            if (r11 != r5) goto L61
            goto La2
        L61:
            java.util.List r11 = (java.util.List) r11
            java.util.concurrent.ConcurrentHashMap r1 = r8.C
            java.lang.Object r1 = r1.get(r10)
            pf.q r1 = (pf.q) r1
            if (r1 == 0) goto L83
            r0.f26273v = r10
            r6 = r11
            java.util.List r6 = (java.util.List) r6
            r0.f26274w = r6
            r0.f26272u = r9
            r0.f26277z = r3
            java.lang.Object r1 = r1.t(r0)
            if (r1 != r5) goto L7f
            goto La2
        L7f:
            r1 = r10
            r10 = r11
        L81:
            r11 = r10
            r10 = r1
        L83:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r8.D
            boolean r10 = r1.contains(r10)
            wf.e r1 = pf.l0.f22767a
            i3 r3 = new i3
            r6 = 0
            r3.<init>(r11, r10, r8, r6)
            r0.f26273v = r6
            r10 = r11
            java.util.List r10 = (java.util.List) r10
            r0.f26274w = r10
            r0.f26272u = r9
            r0.f26277z = r2
            java.lang.Object r10 = pf.b0.J(r1, r3, r0)
            if (r10 != r5) goto La3
        La2:
            return r5
        La3:
            r7 = r11
            r11 = r10
            r10 = r7
        La6:
            x2 r11 = (x2) r11
            r8.r(r9, r11)
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto Lb8
            f1 r9 = r8.f26543q
            a.x(r9, r4, r8)
        Lb8:
            pe.z r9 = pe.z.f22715a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m3.r0(int, java.lang.String, ve.c):java.lang.Object");
    }

    public final Object s(int i, ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        Object J = pf.b0.J(uf.n.f27235a.f24037z, new z2(this, i, null, 0), cVar);
        if (J == ue.a.f27192u) {
            return J;
        }
        return pe.z.f22715a;
    }

    public final synchronized void s0(Context context) {
        if (!this.E && !this.f26547u.isEmpty()) {
            this.E = true;
            nd.o oVar = this.f26539m;
            oVar.getClass();
            context.getClass();
            a aVar = (a) oVar.f21271u;
            wf.e eVar = pf.l0.f22767a;
            wf.d dVar = wf.d.f29913w;
            pf.b0.x(aVar, dVar, new v7.i(context, oVar, null), 2);
            pf.b0.x(androidx.lifecycle.h(this), dVar, new androidx.lifecycle.q(context, qe.l.P(this.f26547u), null, 19), 2);
        }
    }

    public final List s1(int i, int i10, int i11, Context context) {
        context.getClass();
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar == null) {
            return qe.s.f24023u;
        }
        return this.f26540n.J(i10, i11, context, bVar.f21848a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(int i, int i10, Context context, String str) {
        Object obj;
        float f10;
        str.getClass();
        context.getClass();
        Iterator it = f1(i, i10).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.a(((b) obj).f25917a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return;
        }
        String str2 = bVar.f25918b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        Bitmap decodeFile = BitmapFactory.decodeFile(str2, options);
        v7.k kVar = this.f26542p;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i11 = 0;
        Object[] objArr3 = 0;
        if (decodeFile == null) {
            kVar.f27447j = true;
            try {
                O0(str, i, i10);
                return;
            } finally {
            }
        }
        kVar.f27447j = true;
        float width = (716.8f / decodeFile.getWidth()) * bVar.e;
        float f11 = bVar.f25919c * 2048;
        float round = bVar.f25920d * Math.round(r13 / 1.3333334f);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        Canvas canvas = new Canvas(g0(i, i10, k(i, i10), context));
        canvas.save();
        canvas.translate(f11, round);
        canvas.rotate(bVar.f25921f);
        if (bVar.f25929o) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        canvas.scale(f10 * width, width);
        canvas.translate((-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f);
        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
        canvas.restore();
        H0(i, i10, k(i, i10), context);
        decodeFile.recycle();
        try {
            O0(str, i, i10);
            try {
                if (!m0(str2)) {
                    new File(str2).delete();
                }
            } catch (Exception unused) {
            }
            pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
            y yVar = this.f26538l;
            Integer num = (Integer) yVar.get(jVar);
            if (num != null) {
                i11 = num.intValue();
            }
            yVar.put(jVar, Integer.valueOf(i11 + 1));
            a.x(this.f26543q, 1, this);
        } finally {
        }
    }

    public final void u(int i, int i10) {
        String y10 = y(i);
        v7.k kVar = this.f26542p;
        kVar.getClass();
        if (kVar.i) {
            return;
        }
        v7.l lVar = kVar.f27444f;
        if (lVar != null && (!lVar.f27450a.equals(y10) || lVar.f27451b != i10)) {
            kVar.b();
            kVar.f27446h = 0;
            kVar.f27445g = false;
        }
        if (kVar.f27444f == null) {
            kVar.f27444f = new v7.l(y10, i10);
        }
        kVar.f27445g = true;
        kVar.f27446h++;
    }

    public final void u0(int i, int i10, int i11, boolean z3) {
        if (i10 != i11) {
            String y10 = y(i);
            Integer valueOf = Integer.valueOf(i10);
            y yVar = this.i;
            List list = (List) a.h(y10, valueOf, yVar);
            E(i, i11);
            if (list != null) {
                yVar.put(new pe.j(y10, Integer.valueOf(i11)), list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    E0(y10, i11, ((q1) it.next()).f26742a);
                }
                if (!z3) {
                    E(i, i10);
                }
            }
        }
    }

    public final int v(int i) {
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar == null) {
            return Color.rgb(150, 30, 30);
        }
        return Color.rgb(w(bVar.f21851d), w(bVar.e), w(bVar.f21852f));
    }

    public final void v0(int i, int i10, int i11) {
        String y10 = y(i);
        Integer valueOf = Integer.valueOf(i10);
        y yVar = this.f26537k;
        b8 b8Var = (b8) a.h(y10, valueOf, yVar);
        if (b8Var != null) {
            yVar.put(new pe.j(y10, Integer.valueOf(i11)), b8Var);
            F0(i11, y10);
        } else if (yVar.containsKey(new pe.j(y10, Integer.valueOf(i11)))) {
            F(i, i11);
        }
    }

    public final void w0(int i, int i10, int i11) {
        if (i10 != i11) {
            Iterator it = qe.l.P(f1(i, i11)).iterator();
            while (it.hasNext()) {
                O0(((b) it.next()).f25917a, i, i11);
            }
            Iterator it2 = qe.l.P(k1(i, i11)).iterator();
            while (it2.hasNext()) {
                Q0(((d) it2.next()).f26033a, i, i11);
            }
            Iterator it3 = qe.l.P(j1(i, i11)).iterator();
            while (it3.hasNext()) {
                P0(((c) it3.next()).f25969a, i, i11);
            }
            for (b bVar : qe.l.P(f1(i, i10))) {
                O0(bVar.f25917a, i, i10);
                n(this, i, i11, bVar, null, null, 24);
            }
            for (d dVar : qe.l.P(k1(i, i10))) {
                Q0(dVar.f26033a, i, i10);
                p(i, i11, dVar);
            }
            for (c cVar : qe.l.P(j1(i, i10))) {
                P0(cVar.f25969a, i, i10);
                o(i, i11, cVar);
            }
        }
    }

    public final int x(String str) {
        Iterator it = this.f26547u.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.a(((b) it.next()).f21848a, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void x0(int i, int i10, String str, df.l lVar) {
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26533f);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((b) c0Var.next()).f25917a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, true);
                vVar.set(i11, lVar.invoke(vVar.get(i11)));
                D0(y(i), i10, (b) vVar.get(i11));
                B(i, i10);
                a.x(this.f26543q, 1, this);
            }
        }
    }

    public final String y(int i) {
        String str;
        b bVar = (b) qe.l.y(i, this.f26547u);
        if (bVar != null && (str = bVar.f21848a) != null) {
            return str;
        }
        return a.g(i, "?");
    }

    public final void y0(int i, int i10, int i11, df.l lVar) {
        ArrayList F;
        pe.j jVar = new pe.j(y(i), Integer.valueOf(i10));
        y yVar = this.i;
        List list = (List) yVar.get(jVar);
        if (list == null) {
            list = a.f25881a;
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((q1) it.next()).f26742a == i11) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            F = new ArrayList(list);
            F.set(i12, lVar.invoke(F.get(i12)));
        } else {
            F = qe.l.F(list, lVar.invoke(new q1(i11, 0, 30)));
        }
        yVar.put(jVar, F);
        E0(y(i), i10, i11);
    }

    public final void z0(int i, int i10, String str, df.l lVar) {
        v vVar = (v) a.h(y(i), Integer.valueOf(i10), this.f26535h);
        if (vVar != null) {
            ListIterator listIterator = vVar.listIterator();
            int i11 = 0;
            while (true) {
                c0 c0Var = (c0) listIterator;
                if (c0Var.hasNext()) {
                    if (kotlin.jvm.internal.a(((c) c0Var.next()).f25969a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                K0(i, i10, true);
                vVar.set(i11, lVar.invoke(vVar.get(i11)));
                G0(y(i), i10, (c) vVar.get(i11));
                B(i, i10);
                a.x(this.f26543q, 1, this);
            }
        }
    }
}