package vd;
import o0.a;
import q.x;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f27626a = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(6:29|30|31|32|(1:34)|27)|23|24|25))|42|6|7|(0)(0)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r10 != r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0044, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(hd.e r9, ve.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vd.p
            if (r0 == 0) goto L13
            r0 = r10
            vd.p r0 = (vd.p) r0
            int r1 = r0.f27630x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27630x = r1
            goto L18
        L13:
            vd.p r0 = new vd.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27628v
            int r1 = r0.f27630x
            java.lang.String r2 = ""
            java.lang.String r3 = "InstallationId"
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r1 == 0) goto L46
            if (r1 == r5) goto L3c
            if (r1 != r4) goto L35
            java.lang.Object r9 = r0.f27627u
            java.lang.String r9 = (java.lang.String) r9
            pe.a.e(r10)     // Catch: java.lang.Exception -> L32
            goto L8b
        L32:
            r10 = move-exception
            goto L92
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L3c:
            java.lang.Object r9 = r0.f27627u
            hd.e r9 = (hd.e) r9
            pe.a.e(r10)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r10 = move-exception
            goto L70
        L46:
            pe.a.e(r10)
            r10 = r9
            hd.d r10 = (hd.d) r10     // Catch: java.lang.Exception -> L44
            ib.o r9 = r10.d()     // Catch: java.lang.Exception -> L44
            r9.getClass()     // Catch: java.lang.Exception -> L6c
            r0.f27627u = r10     // Catch: java.lang.Exception -> L6c
            r0.f27630x = r5     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = ya.ff.a(r9, r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r6) goto L5e
            goto L8a
        L5e:
            r7 = r10
            r10 = r9
            r9 = r7
        L61:
            hd.a r10 = (hd.a) r10     // Catch: java.lang.Exception -> L44
            java.lang.String r10 = r10.f18003a     // Catch: java.lang.Exception -> L44
            r10.getClass()     // Catch: java.lang.Exception -> L44
            r7 = r10
            r10 = r9
            r9 = r7
            goto L77
        L6c:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L70:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r3, r1, r10)
            r10 = r9
            r9 = r2
        L77:
            hd.d r10 = (hd.d) r10     // Catch: java.lang.Exception -> L32
            ib.o r10 = r10.c()     // Catch: java.lang.Exception -> L32
            r10.getClass()     // Catch: java.lang.Exception -> L32
            r0.f27627u = r9     // Catch: java.lang.Exception -> L32
            r0.f27630x = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = ya.ff.a(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r10.getClass()     // Catch: java.lang.Exception -> L32
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            r2 = r10
            goto L97
        L92:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r3, r0, r10)
        L97:
            vd.q r10 = new vd.q
            r10.<init>(r2, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.a(hd.e, ve.c):java.lang.Object");
    }
}
