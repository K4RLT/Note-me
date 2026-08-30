package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class u01 {

    /* renamed from: a, reason: collision with root package name */
    public final File f11508a;

    /* renamed from: b, reason: collision with root package name */
    public final File f11509b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f11510c;

    /* renamed from: d, reason: collision with root package name */
    public final pr1 f11511d;
    public final h21 e;

    public u01(Context context, SharedPreferences sharedPreferences, pr1 pr1Var, h21 h21Var) {
        this.f11510c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        ct.x(dir, false);
        this.f11508a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        ct.x(dir2, true);
        this.f11509b = dir2;
        this.f11511d = pr1Var;
        this.e = h21Var;
    }

    public final void a(vy0 vy0Var, byte[] bArr, byte[] bArr2) {
        String z3 = vy0Var.z().z();
        boolean isEmpty = TextUtils.isEmpty(z3);
        h21 h21Var = this.e;
        if (!isEmpty && bArr2.length != 0) {
            File file = this.f11509b;
            ct.A(file);
            file.mkdirs();
            File s10 = ct.s(file, z3);
            s10.getClass();
            s10.mkdirs();
            File c10 = ct.c(z3, "pcam.jar", file);
            c10.getClass();
            if (bArr == null || bArr.length <= 0 || ct.o(c10, bArr)) {
                File c11 = ct.c(z3, "pcbc", file);
                c11.getClass();
                if (ct.o(c11, bArr2)) {
                    String z9 = vy0Var.z().z();
                    if (!TextUtils.isEmpty(z9)) {
                        File c12 = ct.c(z9, "pcam.jar", file);
                        c12.getClass();
                        File c13 = ct.c(z9, "pcbc", file);
                        c13.getClass();
                        File c14 = ct.c(z9, "pcam.jar", c());
                        c14.getClass();
                        File c15 = ct.c(z9, "pcbc", c());
                        c15.getClass();
                        if (c12.exists() && !c12.renameTo(c14)) {
                            h21Var.b(15318);
                        } else if (c13.exists() && c13.renameTo(c15)) {
                            vy0 b10 = b(1);
                            SharedPreferences.Editor edit = this.f11510c.edit();
                            if (b10 != null && !vy0Var.z().z().equals(b10.z().z())) {
                                edit.putString(d(), la.b.b(b10.b()));
                            }
                            edit.putString(e(), la.b.b(vy0Var.b()));
                            if (!edit.commit()) {
                                h21Var.b(15320);
                            }
                        } else {
                            h21Var.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    vy0 b11 = b(1);
                    if (b11 != null) {
                        hashSet.add(b11.z().z());
                    }
                    vy0 b12 = b(2);
                    if (b12 != null) {
                        hashSet.add(b12.z().z());
                    }
                    File[] listFiles = c().listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File s11 = ct.s(c(), name);
                                s11.getClass();
                                ct.A(s11);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        h21Var.b(15316);
    }

    public final vy0 b(int i) {
        String string;
        SharedPreferences sharedPreferences = this.f11510c;
        if (i == 1) {
            string = sharedPreferences.getString(e(), null);
        } else {
            string = sharedPreferences.getString(d(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] m4 = la.b.m(string);
                vy0 D = vy0.D(om1.z(m4, 0, m4.length));
                String z3 = D.z().z();
                File c10 = ct.c(z3, "pcam.jar", c());
                if (c10 != null) {
                    if (!c10.exists() && (c10 = ct.c(z3, "pcam", c())) == null) {
                        throw null;
                    }
                    File c11 = ct.c(z3, "pcbc", c());
                    if (c11 != null) {
                        if (c10.exists() && c11.exists()) {
                            return D;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } catch (pn1 unused) {
                this.e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f11508a, Integer.toString(((hh) this.f11511d.zzb()).f6816u));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((hh) this.f11511d.zzb()).f6816u;
        return a5.a.f(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((hh) this.f11511d.zzb()).f6816u;
        return a5.a.f(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}
