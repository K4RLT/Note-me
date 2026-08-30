package wd;
import c.b;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f29888a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f29889b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f29889b;
        map.getClass();
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        l4.a.j("Cannot get dependency ", dVar, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:12:0x0098, B:23:0x00ab, B:24:0x00c3), top: B:11:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0096 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ve.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof wd.b
            if (r0 == 0) goto L13
            r0 = r10
            wd.b r0 = (wd.b) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            wd.b r0 = new wd.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.A
            int r1 = r0.C
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L35
            java.lang.Object r1 = r0.f29887z
            java.util.Map r3 = r0.f29886y
            java.util.Map r3 = (java.util.Map) r3
            yf.c r4 = r0.f29885x
            wd.d r5 = r0.f29884w
            java.util.Iterator r6 = r0.f29883v
            java.util.Map r7 = r0.f29882u
            java.util.Map r7 = (java.util.Map) r7
            pe.a.e(r10)
            goto L97
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L3c:
            pe.a.e(r10)
            java.util.Map r10 = wd.c.f29889b
            r10.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = r10.size()
            int r3 = qe.x.b(r3)
            r1.<init>(r3)
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r10
            r3 = r1
        L5d:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lc9
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r4 = r10.getKey()
            r5 = r4
            wd.d r5 = (wd.d) r5
            java.lang.Object r10 = r10.getValue()
            wd.a r10 = (wd.a) r10
            yf.c r4 = r10.f29880a
            r10 = r3
            java.util.Map r10 = (java.util.Map) r10
            r0.f29882u = r10
            r0.f29883v = r6
            r0.f29884w = r5
            r0.f29885x = r4
            r0.f29886y = r10
            r0.f29887z = r1
            r0.C = r2
            java.lang.Object r10 = r4.f(r0)
            ue.a r7 = ue.a.f27192u
            if (r10 != r7) goto L96
            return r7
        L96:
            r7 = r3
        L97:
            r10 = 0
            r5.getClass()     // Catch: java.lang.Throwable -> Lc4
            wd.a r8 = a(r5)     // Catch: java.lang.Throwable -> Lc4
            oc.j r8 = r8.f29881b     // Catch: java.lang.Throwable -> Lc4
            if (r8 == 0) goto Lab
            r4.j(r10)
            r3.put(r1, r8)
            r3 = r7
            goto L5d
        Lab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r0     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r0 = move-exception
            r4.j(r10)
            throw r0
        Lc9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.b(ve.c):java.lang.Object");
    }
}
