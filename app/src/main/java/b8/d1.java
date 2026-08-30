package b8;
import d1.c;
import d1.f;
import a1.j;
import a5.a;
import b0.b;
import b0.d;
import b0.x;
import b8.a1;
import b8.b1;
import b8.c1;
import b8.d1;
import b8.s4;
import b8.u6;
import b8.z0;
import f.c;
import u7.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import ya.lc;

/* loaded from: classes.dex */
public final class d1 implements u6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1960a;

    /* renamed from: b, reason: collision with root package name */
    public final fg.s f1961b = wa.a(new j(19));

    /* renamed from: c, reason: collision with root package name */
    public final uf.c f1962c;

    /* renamed from: d, reason: collision with root package name */
    public final yf.c f1963d;

    public d1(Context context) {
        this.f1960a = context;
        pf.t1 d2 = pf.d();
        wf.e eVar = pf.l0.f22767a;
        this.f1962c = pf.b(lc.c(d2, wf.d.f29913w));
        this.f1963d = yf.a();
    }

    public static final void j(d1 d1Var, String str, int i, String str2, File file) {
        d1Var.getClass();
        Bitmap bitmap = null;
        try {
            bitmap = e.d(d1Var.f1960a, str, str2, i, 600, 750, null, -1);
            if (bitmap != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 88, fileOutputStream);
                    fileOutputStream.close();
                    bitmap.recycle();
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                Log.w("UniverseCloud", "portada de respaldo falló: " + th.getMessage());
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } finally {
            }
        }
    }

    public static final ca k(d1 d1Var, y0 y0Var) {
        String str;
        long j10;
        Object kVar;
        String str2 = y0Var.f3006a;
        String str3 = y0Var.f3010f;
        String str4 = y0Var.f3007b;
        String str5 = y0Var.f3008c;
        int i = y0Var.e;
        int i10 = y0Var.f3015l;
        int i11 = y0Var.f3016m;
        int i12 = y0Var.f3011g;
        int i13 = y0Var.f3012h;
        int i14 = y0Var.i;
        int i15 = y0Var.f3013j;
        boolean z3 = y0Var.f3014k;
        String str6 = y0Var.f3017n;
        if (str6 == null || mf.f.u(str6)) {
            str = str2;
            j10 = 0;
        } else {
            j10 = 0;
            str = str2;
            if (str6.length() >= 19) {
                try {
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    calendar.clear();
                    calendar.set(Integer.parseInt(str6.substring(0, 4)), Integer.parseInt(str6.substring(5, 7)) - 1, Integer.parseInt(str6.substring(8, 10)), Integer.parseInt(str6.substring(11, 13)), Integer.parseInt(str6.substring(14, 16)), Integer.parseInt(str6.substring(17, 19)));
                    kVar = Long.valueOf(calendar.getTimeInMillis());
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (kVar instanceof pe.k) {
                    kVar = 0L;
                }
                j10 = ((Number) kVar).longValue();
            }
        }
        boolean z9 = y0Var.f3018o;
        String str7 = y0Var.f3009d;
        String str8 = y0Var.f3019p;
        if (str8 == null) {
            str8 = "";
        }
        return new ca(str, str3, str4, str5, i, i10, i11, i12, i13, i14, i15, z3, j10, "", z9, str7, str8, (String) null, 131072);
    }

    @Override // u6
    public final Object a(String str, ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        Object J = pf.b0.J(wf.d.f29913w, new a(str, this, null, 3), cVar);
        if (J == ue.a.f27192u) {
            return J;
        }
        return pe.z.f22715a;
    }

    @Override // u6
    public final void b(String str) {
        str.getClass();
        pf.x(this.f1962c, null, new e0(1, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(s4 r10, df.p r11, df.r r12, ve.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof b1
            if (r0 == 0) goto L13
            r0 = r13
            b1 r0 = (b1) r0
            int r1 = r0.f1869w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1869w = r1
            goto L18
        L13:
            b1 r0 = new b1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f1867u
            int r1 = r0.f1869w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r13)
            goto L48
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L2c:
            pe.a.e(r13)
            wf.e r13 = pf.l0.f22767a
            wf.d r13 = wf.d.f29913w
            c1 r3 = new c1
            r8 = 0
            r4 = r9
            r5 = r10
            r7 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f1869w = r2
            java.lang.Object r13 = pf.b0.J(r13, r3, r0)
            ue.a r10 = ue.a.f27192u
            if (r13 != r10) goto L48
            return r10
        L48:
            pe.l r13 = (pe.l) r13
            java.lang.Object r10 = r13.f22696u
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.d1.c(s4, df.p, df.r, ve.c):java.lang.Object");
    }

    @Override // u6
    public final String d() {
        p6 p6Var = p6.f2523a;
        String string = p6.d().getString("handle", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // u6
    public final List e(String str) {
        str.getClass();
        File l10 = l(str);
        if (!l10.isDirectory()) {
            return qe.s.f24023u;
        }
        return lf.c(new af.j(new af.j(lf.b(0, new j(20)), new s0(l10, 0), 3), new j(21), 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, ve.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z0
            if (r0 == 0) goto L13
            r0 = r6
            z0 r0 = (z0) r0
            int r1 = r0.f3058w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3058w = r1
            goto L18
        L13:
            z0 r0 = new z0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3056u
            int r1 = r0.f3058w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            pe.a.e(r6)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            return r2
        L2c:
            pe.a.e(r6)
            wf.e r6 = pf.l0.f22767a
            wf.d r6 = wf.d.f29913w
            a1 r1 = new a1
            r1.<init>(r5, r4, r2)
            r0.f3058w = r3
            java.lang.Object r6 = pf.b0.J(r6, r1, r0)
            ue.a r5 = ue.a.f27192u
            if (r6 != r5) goto L43
            return r5
        L43:
            pe.l r6 = (pe.l) r6
            java.lang.Object r5 = r6.f22696u
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.d1.f(java.lang.String, ve.c):java.lang.Object");
    }

    @Override // u6
    public final File g(String str) {
        str.getClass();
        File n10 = n(str);
        if (n10.exists()) {
            return n10;
        }
        return null;
    }

    @Override // u6
    public final Object h(String str, o9 o9Var) {
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new e0(2, str, null), o9Var);
    }

    @Override // u6
    public final Object i(ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new a(this, (te.c) null, 2), cVar);
    }

    public final File l(String str) {
        return new File(new File(m(), "previews"), str);
    }

    public final File m() {
        File file = new File(this.f1960a.getFilesDir(), "universe_cloud");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File n(String str) {
        return new File(new File(m(), "thumbs"), a.g(str, ".jpg"));
    }
}
