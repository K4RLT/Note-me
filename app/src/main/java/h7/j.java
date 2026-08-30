package h7;
import j.b;
import j.c;
import m.d;

import android.content.Context;
import b8.b7;
import fg.d0;
import fg.n;
import fg.s;
import fg.t;
import fg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import qe.b0;
import wa.p6;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f17899a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f17900b = qe.k.u(new String[]{"localPath", "maskPath", "assetPath", "framePath"});

    /* renamed from: c, reason: collision with root package name */
    public static final Set f17901c = b0.d("slotPaths");

    /* renamed from: d, reason: collision with root package name */
    public static final s f17902d = p6.a(new b7(23));

    public static final String a(Context context) {
        Object kVar;
        Object obj = "?";
        try {
            kVar = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (kVar == null) {
                kVar = "?";
            }
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (!(kVar instanceof pe.k)) {
            obj = kVar;
        }
        return (String) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(java.lang.String r9) {
        /*
            qe.s r0 = qe.s.f24023u
            r9.getClass()
            fg.s r1 = h7.j.f17902d     // Catch: java.lang.Throwable -> L34
            fg.m r9 = r1.c(r9)     // Catch: java.lang.Throwable -> L34
            fg.z r9 = fg.n.b(r9)     // Catch: java.lang.Throwable -> L34
            java.util.Set r1 = h7.j.f17900b     // Catch: java.lang.Throwable -> L34
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L1c:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            r4 = 0
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r9.get(r3)     // Catch: java.lang.Throwable -> L34
            boolean r5 = r3 instanceof fg.d0     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L37
            fg.d0 r3 = (fg.d0) r3     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r9 = move-exception
            goto Lc9
        L37:
            r3 = r4
        L38:
            if (r3 == 0) goto L51
            boolean r5 = r3.b()     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L41
            goto L42
        L41:
            r3 = r4
        L42:
            if (r3 == 0) goto L51
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L51
            boolean r5 = mf.f.u(r3)     // Catch: java.lang.Throwable -> L34
            if (r5 != 0) goto L51
            r4 = r3
        L51:
            if (r4 == 0) goto L1c
            r2.add(r4)     // Catch: java.lang.Throwable -> L34
            goto L1c
        L57:
            java.util.Set r1 = h7.j.f17901c     // Catch: java.lang.Throwable -> L34
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L64:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto Lc4
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> L34
            boolean r6 = r5 instanceof fg.e     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L7b
            fg.e r5 = (fg.e) r5     // Catch: java.lang.Throwable -> L34
            goto L7c
        L7b:
            r5 = r4
        L7c:
            if (r5 == 0) goto Lbd
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r6.<init>()     // Catch: java.lang.Throwable -> L34
            java.util.List r5 = r5.f16968u     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L34
        L89:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto Lbe
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L34
            fg.m r7 = (fg.m) r7     // Catch: java.lang.Throwable -> L34
            boolean r8 = r7 instanceof fg.d0     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto L9c
            fg.d0 r7 = (fg.d0) r7     // Catch: java.lang.Throwable -> L34
            goto L9d
        L9c:
            r7 = r4
        L9d:
            if (r7 == 0) goto Lb6
            boolean r8 = r7.b()     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto La6
            goto La7
        La6:
            r7 = r4
        La7:
            if (r7 == 0) goto Lb6
            java.lang.String r7 = r7.a()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto Lb6
            boolean r8 = mf.f.u(r7)     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto Lb6
            goto Lb7
        Lb6:
            r7 = r4
        Lb7:
            if (r7 == 0) goto L89
            r6.add(r7)     // Catch: java.lang.Throwable -> L34
            goto L89
        Lbd:
            r6 = r0
        Lbe:
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L34
            qe.q.n(r3, r6)     // Catch: java.lang.Throwable -> L34
            goto L64
        Lc4:
            java.util.ArrayList r9 = qe.l.E(r2, r3)     // Catch: java.lang.Throwable -> L34
            goto Lcf
        Lc9:
            pe.k r1 = new pe.k
            r1.<init>(r9)
            r9 = r1
        Lcf:
            boolean r1 = r9 instanceof pe.k
            if (r1 == 0) goto Ld5
            goto Ld6
        Ld5:
            r0 = r9
        Ld6:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.b(java.lang.String):java.util.List");
    }

    public static String d(String str, df.l lVar) {
        Object kVar;
        fg.e eVar;
        d0 d0Var;
        String str2;
        String str3;
        s sVar = f17902d;
        str.getClass();
        try {
            z b10 = n.b(sVar.c(str));
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            Iterator it = f17900b.iterator();
            boolean z3 = false;
            while (true) {
                d0 d0Var2 = null;
                if (!it.hasNext()) {
                    break;
                }
                String str4 = (String) it.next();
                Object obj = b10.get(str4);
                if (obj instanceof d0) {
                    d0Var2 = (d0) obj;
                }
                if (d0Var2 != null && d0Var2.b() && (str3 = (String) lVar.invoke(d0Var2.a())) != null) {
                    linkedHashMap.put(str4, new t(str3, true));
                    z3 = true;
                }
            }
            for (String str5 : f17901c) {
                Object obj2 = b10.get(str5);
                if (obj2 instanceof fg.e) {
                    eVar = (fg.e) obj2;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    ArrayList arrayList = new ArrayList(qe.d(eVar, 10));
                    boolean z9 = false;
                    for (Object obj3 : eVar.f16968u) {
                        if (obj3 instanceof d0) {
                            d0Var = (d0) obj3;
                        } else {
                            d0Var = null;
                        }
                        if (d0Var != null && d0Var.b() && (str2 = (String) lVar.invoke(d0Var.a())) != null) {
                            obj3 = new t(str2, true);
                            z9 = true;
                        }
                        arrayList.add(obj3);
                    }
                    if (z9) {
                        linkedHashMap.put(str5, new fg.e(arrayList));
                        z3 = true;
                    }
                }
            }
            if (z3) {
                kVar = sVar.b(z.Companion.serializer(), new z(linkedHashMap));
            } else {
                kVar = str;
            }
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (kVar instanceof pe.k) {
            kVar = str;
        }
        return (String) kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r13, android.net.Uri r14, j7.l r15, j7.f r16, j7.q r17, java.lang.String r18, ve.c r19) {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof h7.g
            if (r1 == 0) goto L15
            r1 = r0
            h7.g r1 = (h7.g) r1
            int r2 = r1.f17887w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f17887w = r2
            goto L1a
        L15:
            h7.g r1 = new h7.g
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f17885u
            int r2 = r1.f17887w
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            pe.a.e(r0)
            goto L4f
        L27:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r13)
            r13 = 0
            return r13
        L2e:
            pe.a.e(r0)
            wf.e r0 = pf.l0.f22767a
            wf.d r0 = wf.d.f29913w
            h7.i r4 = new h7.i
            r11 = 0
            r5 = r13
            r6 = r14
            r7 = r15
            r10 = r16
            r9 = r17
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.f17887w = r3
            java.lang.Object r0 = pf.b0.J(r0, r4, r1)
            ue.a r13 = ue.a.f27192u
            if (r0 != r13) goto L4f
            return r13
        L4f:
            pe.l r0 = (pe.l) r0
            java.lang.Object r13 = r0.f22696u
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.c(android.content.Context, android.net.Uri, j7.l, j7.f, j7.q, java.lang.String, ve.c):java.lang.Object");
    }
}
