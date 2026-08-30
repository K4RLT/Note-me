package b8;
import a5.a;
import b8.k3;
import b8.l3;
import b8.p3;
import b8.q3;
import b8.s4;
import b8.u3;
import b8.u6;
import d.a;
import f.b;
import f.c;
import l.a;
import l.f;
import p6.a;
import u7.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class u3 implements u6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2821a;

    /* renamed from: b, reason: collision with root package name */
    public final fg.s f2822b = wa.a(new n1(23));

    /* renamed from: c, reason: collision with root package name */
    public final yf.c f2823c = yf.a();

    public u3(Context context) {
        this.f2821a = context;
    }

    public static final void j(u3 u3Var, String str, int i, String str2, File file) {
        u3Var.getClass();
        Bitmap bitmap = null;
        try {
            bitmap = e.d(u3Var.f2821a, str, str2, i, 480, 720, null, -1);
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
                Log.w("UniverseLocal", "No se pudo hornear la portada: " + th.getMessage());
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } finally {
            }
        }
    }

    public static final File k(u3 u3Var, String str) {
        u3Var.getClass();
        File file = new File(new File(u3Var.s(), "previews"), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final j3 l(u3 u3Var) {
        Object kVar;
        u3Var.getClass();
        File file = new File(u3Var.s(), "listings.json");
        if (!file.exists()) {
            return new j3();
        }
        try {
            fg.s sVar = u3Var.f2822b;
            String f10 = af.f(file);
            sVar.getClass();
            kVar = (j3) sVar.a(j3.Companion.serializer(), f10);
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        Throwable a10 = pe.a(kVar);
        if (a10 != null) {
            Log.w("UniverseLocal", "Catálogo ilegible, se empieza de cero: " + a10.getMessage());
            kVar = new j3();
        }
        return (j3) kVar;
    }

    public static final File m(u3 u3Var, String str) {
        u3Var.getClass();
        return new File(u3Var.s(), a.g(str, ".scrap"));
    }

    public static final void n(u3 u3Var, j3 j3Var) {
        Object kVar;
        try {
            File file = new File(u3Var.s(), "listings.json");
            fg.s sVar = u3Var.f2822b;
            sVar.getClass();
            af.l.h(file, sVar.b(j3.Companion.serializer(), j3Var));
            kVar = pe.z.f22715a;
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        Throwable a10 = pe.a(kVar);
        if (a10 != null) {
            wd0.o("No se pudo guardar el catálogo: ", a10.getMessage(), "UniverseLocal");
        }
    }

    @Override // u6
    public final Object a(String str, ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        Object J = pf.b0.J(wf.d.f29913w, new t3(this, str, null, 1), cVar);
        if (J == ue.a.f27192u) {
            return J;
        }
        return pe.z.f22715a;
    }

    @Override // u6
    public final void b(String str) {
        str.getClass();
        this.f2821a.getSharedPreferences("scraply_universe", 0).edit().putString("handle", mf.f.I(str).toString()).apply();
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
            boolean r0 = r13 instanceof p3
            if (r0 == 0) goto L13
            r0 = r13
            p3 r0 = (p3) r0
            int r1 = r0.f2516w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2516w = r1
            goto L18
        L13:
            p3 r0 = new p3
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f2514u
            int r1 = r0.f2516w
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
            q3 r3 = new q3
            r8 = 0
            r4 = r9
            r5 = r10
            r7 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f2516w = r2
            java.lang.Object r13 = pf.b0.J(r13, r3, r0)
            ue.a r10 = ue.a.f27192u
            if (r13 != r10) goto L48
            return r10
        L48:
            pe.l r13 = (pe.l) r13
            java.lang.Object r10 = r13.f22696u
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.u3.c(s4, df.p, df.r, ve.c):java.lang.Object");
    }

    @Override // u6
    public final String d() {
        String string = this.f2821a.getSharedPreferences("scraply_universe", 0).getString("handle", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // u6
    public final List e(String str) {
        str.getClass();
        File file = new File(new File(s(), "previews"), str);
        if (!file.isDirectory()) {
            return qe.s.f24023u;
        }
        return lf.c(new af.j(new af.j(lf.b(0, new n1(24)), new s0(file, 1), 3), new n1(25), 2));
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
            boolean r0 = r6 instanceof k3
            if (r0 == 0) goto L13
            r0 = r6
            k3 r0 = (k3) r0
            int r1 = r0.f2306w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2306w = r1
            goto L18
        L13:
            k3 r0 = new k3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2304u
            int r1 = r0.f2306w
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
            l3 r1 = new l3
            r1.<init>(r4, r5, r2)
            r0.f2306w = r3
            java.lang.Object r6 = pf.b0.J(r6, r1, r0)
            ue.a r5 = ue.a.f27192u
            if (r6 != r5) goto L43
            return r5
        L43:
            pe.l r6 = (pe.l) r6
            java.lang.Object r5 = r6.f22696u
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.u3.f(java.lang.String, ve.c):java.lang.Object");
    }

    @Override // u6
    public final File g(String str) {
        str.getClass();
        File file = new File(v(), str.concat(".jpg"));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // u6
    public final Object h(String str, o9 o9Var) {
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new t3(this, str, null, 0), o9Var);
    }

    @Override // u6
    public final Object i(ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new o3(this, null, 0), cVar);
    }

    public final boolean o() {
        return this.f2821a.getSharedPreferences("scraply_universe", 0).getBoolean("factory_font_rebake_v1", false);
    }

    public final void p(String str) {
        str.getClass();
        SharedPreferences.Editor edit = this.f2821a.getSharedPreferences("scraply_universe", 0).edit();
        Set u9 = u();
        LinkedHashSet linkedHashSet = new LinkedHashSet(qe.x.b(u9.size()));
        boolean z3 = false;
        for (Object obj : u9) {
            boolean z9 = true;
            if (!z3 && kotlin.jvm.internal.a(obj, str)) {
                z3 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj);
            }
        }
        edit.putStringSet("demo_seeded_ids", linkedHashSet).apply();
    }

    public final void q(String str) {
        SharedPreferences.Editor edit = this.f2821a.getSharedPreferences("scraply_universe", 0).edit();
        Set u9 = u();
        LinkedHashSet linkedHashSet = new LinkedHashSet(qe.x.b(u9.size() + 1));
        linkedHashSet.addAll(u9);
        linkedHashSet.add(str);
        edit.putStringSet("demo_seeded_ids", linkedHashSet).apply();
    }

    public final void r() {
        this.f2821a.getSharedPreferences("scraply_universe", 0).edit().putBoolean("factory_font_rebake_v1", true).apply();
    }

    public final File s() {
        File file = new File(this.f2821a.getFilesDir(), "universe_local");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final Object t(String str, int i, int i10, int i11, i2 i2Var) {
        wf.e eVar = pf.l0.f22767a;
        Object J = pf.b0.J(wf.d.f29913w, new s3(i11, this, str, i, i10, null), i2Var);
        if (J == ue.a.f27192u) {
            return J;
        }
        return pe.z.f22715a;
    }

    public final Set u() {
        SharedPreferences sharedPreferences = this.f2821a.getSharedPreferences("scraply_universe", 0);
        qe.u uVar = qe.u.f24025u;
        Set<String> stringSet = sharedPreferences.getStringSet("demo_seeded_ids", uVar);
        if (stringSet == null) {
            return uVar;
        }
        return stringSet;
    }

    public final File v() {
        File file = new File(s(), "thumbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
