package vd;
import t.j;
import b.a;
import c.t;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f27556a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final z5.h f27557b;

    /* JADX WARN: Type inference failed for: r0v0, types: [vd.c0, java.lang.Object] */
    static {
        bd.d dVar = new bd.d();
        dVar.a(b0.class, g.f27582a);
        dVar.a(i0.class, h.f27587a);
        dVar.a(j.class, e.f27564a);
        dVar.a(b.class, d.f27558a);
        dVar.a(a.class, c.f27550a);
        dVar.a(s.class, f.f27572a);
        dVar.f3204x = true;
        f27557b = new z5.h(5, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        r5 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vd.b a(bc.g r15) {
        /*
            r15.a()
            android.content.Context r0 = r15.f3177a
            r0.getClass()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L24
            long r6 = r3.a(r1)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            goto L2a
        L24:
            int r4 = r1.versionCode
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2a:
            vd.b r7 = new vd.b
            r15.a()
            bc.j r6 = r15.f3179c
            java.lang.String r8 = r6.f3191b
            r8.getClass()
            java.lang.String r6 = android.os.Build.MODEL
            r6.getClass()
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            r6.getClass()
            r6 = r1
            vd.a r1 = new vd.a
            r2.getClass()
            java.lang.String r6 = r6.versionName
            if (r6 != 0) goto L4b
            r6 = r4
        L4b:
            java.lang.String r9 = android.os.Build.MANUFACTURER
            r9.getClass()
            r15.a()
            int r9 = android.os.Process.myPid()
            java.util.ArrayList r10 = vd.a(r0)
            int r11 = r10.size()
            r12 = r3
        L60:
            if (r12 >= r11) goto L70
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            r14 = r13
            vd.s r14 = (vd.s) r14
            int r14 = r14.f27638b
            if (r14 != r9) goto L60
            goto L71
        L70:
            r13 = 0
        L71:
            vd.s r13 = (vd.s) r13
            if (r13 != 0) goto L9a
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 < r11) goto L83
            java.lang.String r5 = k9.e0.j()
            r5.getClass()
            goto L95
        L83:
            if (r10 < r5) goto L8c
            java.lang.String r5 = t.j()
            if (r5 == 0) goto L8c
            goto L95
        L8c:
            java.lang.String r5 = la.b.f()
            if (r5 == 0) goto L93
            goto L95
        L93:
            java.lang.String r5 = ""
        L95:
            vd.s r13 = new vd.s
            r13.<init>(r5, r3, r9, r3)
        L9a:
            r5 = r13
            r15.a()
            java.util.ArrayList r15 = vd.a(r0)
            r3 = r6
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r7.<init>(r8, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.a(bc.g):vd.b");
    }
}
