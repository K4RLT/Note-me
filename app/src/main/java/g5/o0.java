package g5;
import b0.x;
import e0.b;
import o0.a;
import o0.c;
import o0.d;
import o0.f;

import g0.u1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f17496l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final v f17497a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17498b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f17499c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17500d;
    public final u1 e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f17502g;

    /* renamed from: h, reason: collision with root package name */
    public final j f17503h;
    public final pd.c i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f17504j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public df.a f17505k = new fg.o(4);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f17501f = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, pd.c] */
    public o0(v vVar, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z3, u1 u1Var) {
        String str;
        this.f17497a = vVar;
        this.f17498b = hashMap;
        this.f17499c = hashMap2;
        this.f17500d = z3;
        this.e = u1Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f17501f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f17498b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f17502g = strArr2;
        for (Map.Entry entry : this.f17498b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f17501f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = this.f17501f;
                linkedHashMap.put(lowerCase3, qe.a(lowerCase2, linkedHashMap));
            }
        }
        this.f17503h = new j(this.f17502g.length);
        int length2 = this.f17502g.length;
        Object obj = new Object();
        obj.f22681u = sf.b(new int[length2]);
        this.i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(g5.o0 r4, g5.m r5, ve.c r6) {
        /*
            boolean r0 = r6 instanceof g5.g0
            if (r0 == 0) goto L13
            r0 = r6
            g5.g0 r0 = (g5.g0) r0
            int r1 = r0.f17447x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17447x = r1
            goto L18
        L13:
            g5.g0 r0 = new g5.g0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f17445v
            int r6 = r0.f17447x
            r1 = 2
            r2 = 1
            ue.a r3 = ue.a.f27192u
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.f17444u
            java.util.Set r5 = (java.util.Set) r5
            pe.a.e(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.f17444u
            g5.m r5 = (g5.m) r5
            pe.a.e(r4)
            goto L54
        L3d:
            pe.a.e(r4)
            b8.b7 r4 = new b8.b7
            r6 = 20
            r4.<init>(r6)
            r0.f17444u = r5
            r0.f17447x = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.c(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            r0.f17444u = r4
            r0.f17447x = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = wa.a7.a(r5, r6, r0)
            if (r5 != r3) goto L6c
        L6b:
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a(g5.o0, g5.m, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0076, B:14:0x0081, B:17:0x00bc, B:19:0x0090, B:20:0x0094, B:22:0x00a1, B:24:0x00ab, B:26:0x00b1, B:27:0x00af, B:30:0x00b6), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(g5.o0 r11, ve.c r12) {
        /*
            g5.v r0 = r11.f17497a
            boolean r1 = r12 instanceof g5.i0
            if (r1 == 0) goto L15
            r1 = r12
            g5.i0 r1 = (g5.i0) r1
            int r2 = r1.f17460x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f17460x = r2
            goto L1a
        L15:
            g5.i0 r1 = new g5.i0
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.f17458v
            int r2 = r1.f17460x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2d
            com.google.android.gms.internal.mlkit_vision_digital_ink.pw r0 = r1.f17457u
            pe.a.e(r12)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r11 = move-exception
            goto Lc7
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r11)
            r11 = 0
            return r11
        L34:
            pe.a.e(r12)
            com.google.android.gms.internal.mlkit_vision_digital_ink.pw r12 = r0.f17540g
            boolean r2 = r12.a()
            qe.u r5 = qe.u.f24025u
            if (r2 == 0) goto Lcb
            java.util.concurrent.atomic.AtomicBoolean r2 = r11.f17504j     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L4d
            r12.j()
            return r5
        L4d:
            df.a r2 = r11.f17505k     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L5f
            r12.j()
            return r5
        L5f:
            g5.j0 r2 = new g5.j0     // Catch: java.lang.Throwable -> Lc5
            r5 = 0
            r6 = 1
            r2.<init>(r11, r5, r6)     // Catch: java.lang.Throwable -> Lc5
            r1.f17457u = r12     // Catch: java.lang.Throwable -> Lc5
            r1.f17460x = r4     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r0 = r0.w(r3, r2, r1)     // Catch: java.lang.Throwable -> Lc5
            ue.a r1 = ue.a.f27192u
            if (r0 != r1) goto L73
            return r1
        L73:
            r10 = r0
            r0 = r12
            r12 = r10
        L76:
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L2a
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto Lc1
            pd.c r1 = r11.i     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
            r12.getClass()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r12.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L90
            goto Lbc
        L90:
            java.lang.Object r1 = r1.f22681u     // Catch: java.lang.Throwable -> L2a
            sf.n0 r1 = (sf.n0) r1     // Catch: java.lang.Throwable -> L2a
        L94:
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L2a
            r5 = r2
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L2a
            r8 = r3
        L9f:
            if (r8 >= r6) goto Lb6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r12.contains(r9)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto Laf
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
            int r9 = r9 + r4
            goto Lb1
        Laf:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
        Lb1:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2a
            int r8 = r8 + 1
            goto L9f
        Lb6:
            boolean r2 = r1.i(r2, r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L94
        Lbc:
            u1 r11 = r11.e     // Catch: java.lang.Throwable -> L2a
            r11.invoke(r12)     // Catch: java.lang.Throwable -> L2a
        Lc1:
            r0.j()
            return r12
        Lc5:
            r11 = move-exception
            r0 = r12
        Lc7:
            r0.j()
            throw r11
        Lcb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.b(g5.o0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d8, code lost:
    
        if (wa.a7.a(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00da, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (wa.a7.a(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r2v6, types: [g5.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d8 -> B:11:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(g5.o0 r17, g5.f0 r18, int r19, ve.c r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.c(g5.o0, g5.f0, int, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v5, types: [g5.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(g5.o0 r7, g5.f0 r8, int r9, ve.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof g5.l0
            if (r0 == 0) goto L16
            r0 = r10
            g5.l0 r0 = (g5.l0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            g5.l0 r0 = new g5.l0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f17484z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.f17483y
            int r8 = r0.f17482x
            java.lang.String[] r9 = r0.f17481w
            java.lang.String r1 = r0.f17480v
            g5.m r3 = r0.f17479u
            pe.a.e(r10)
            r10 = r9
            r9 = r3
            goto L8f
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L3b:
            pe.a.e(r10)
            java.lang.String[] r7 = r7.f17502g
            r7 = r7[r9]
            java.lang.String[] r9 = g5.o0.f17496l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L91
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.f17479u = r9
            r0.f17480v = r1
            r0.f17481w = r10
            r0.f17482x = r8
            r0.f17483y = r7
            r0.B = r2
            java.lang.Object r3 = wa.a7.a(r9, r3, r0)
            ue.a r4 = ue.a.f27192u
            if (r3 != r4) goto L8f
            return r4
        L8f:
            int r8 = r8 + r2
            goto L4d
        L91:
            pe.z r7 = pe.z.f22715a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.d(g5.o0, g5.f0, int, ve.c):java.lang.Object");
    }

    public final void e(df.a aVar, df.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (this.f17504j.compareAndSet(false, true)) {
            aVar.invoke();
            uf.c cVar = this.f17497a.f17535a;
            te.c cVar2 = null;
            if (cVar != null) {
                pf.x(cVar, new pf.y(), new b5.a(this, aVar2, cVar2, 20), 2);
            } else {
                kotlin.jvm.internal.l.h("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ve.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof g5.m0
            if (r0 == 0) goto L13
            r0 = r7
            g5.m0 r0 = (g5.m0) r0
            int r1 = r0.f17488x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17488x = r1
            goto L18
        L13:
            g5.m0 r0 = new g5.m0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f17486v
            int r1 = r0.f17488x
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            com.google.android.gms.internal.mlkit_vision_digital_ink.pw r0 = r0.f17485u
            pe.a.e(r7)     // Catch: java.lang.Throwable -> L27
            goto L54
        L27:
            r7 = move-exception
            goto L5a
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L30:
            pe.a.e(r7)
            g5.v r7 = r6.f17497a
            com.google.android.gms.internal.mlkit_vision_digital_ink.pw r1 = r7.f17540g
            boolean r3 = r1.a()
            if (r3 == 0) goto L5e
            a6.f r3 = new a6.f     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r5 = 14
            r3.<init>(r6, r4, r5)     // Catch: java.lang.Throwable -> L58
            r0.f17485u = r1     // Catch: java.lang.Throwable -> L58
            r0.f17488x = r2     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.Object r7 = r7.w(r2, r3, r0)     // Catch: java.lang.Throwable -> L58
            ue.a r0 = ue.a.f27192u
            if (r7 != r0) goto L53
            return r0
        L53:
            r0 = r1
        L54:
            r0.j()
            goto L5e
        L58:
            r7 = move-exception
            r0 = r1
        L5a:
            r0.j()
            throw r7
        L5e:
            pe.z r7 = pe.z.f22715a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.f(ve.c):java.lang.Object");
    }
}