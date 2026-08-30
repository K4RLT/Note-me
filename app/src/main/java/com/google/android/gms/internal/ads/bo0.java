package com.google.android.gms.internal.ads;
import c6.a;
import wa.c6;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class bo0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4847b;

    public /* synthetic */ bo0(v81 v81Var) {
        this.f4846a = 0;
        v81 v81Var2 = v81.f11836v;
        this.f4847b = v81Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object c10;
        Object e;
        boolean z3 = true;
        int i = 0;
        switch (this.f4846a) {
            case 0:
                String str = (String) ((v81) this.f4847b).f11838u;
                v81 v81Var = v81.f11836v;
                return new rm0(str, 1, null);
            case 1:
                return new cn0(3, (List) ((am0) this.f4847b).f4540c);
            case 2:
                ((gr0) this.f4847b).mo227zza();
                return null;
            case 3:
                Context context = (Context) ((tw) this.f4847b).f11470v;
                return x21.d(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case 4:
                ly0 ly0Var = (ly0) this.f4847b;
                synchronized (ly0Var) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(ly0Var.f8185a);
                            try {
                                e = ly0Var.f8187c.e(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e8) {
                            c10 = ly0Var.f8188d.apply(new RuntimeException(e8));
                            return c10;
                        }
                    } catch (iy0 e10) {
                        c10 = ly0Var.f8188d.apply(e10);
                        return c10;
                    } catch (FileNotFoundException unused) {
                        c10 = ly0Var.f8187c.c();
                        return c10;
                    }
                }
                return e;
            case 5:
                az0 az0Var = (az0) this.f4847b;
                ((hz0) az0Var.f4640c.zzb()).a();
                ((pz0) az0Var.f4639b.zzb()).a();
                return null;
            case 6:
                return ((pr1) this.f4847b).zzb();
            case 7:
                n11 n11Var = (n11) this.f4847b;
                h21 h21Var = n11Var.i;
                ly0 ly0Var2 = n11Var.f8513b;
                ly0 ly0Var3 = n11Var.f8515d;
                pr1 pr1Var = n11Var.f8516f;
                try {
                    File file = ly0Var2.f8185a;
                    if (!file.exists()) {
                        file.delete();
                    } else {
                        File file2 = ((ly0) pr1Var.zzb()).f8185a;
                        File file3 = ((ly0) n11Var.e.zzb()).f8185a;
                        try {
                            if (file2.exists()) {
                                File parentFile = file3.getParentFile();
                                if (parentFile != null) {
                                    ct.A(parentFile);
                                }
                                b80.v(file3);
                                b80.A(file2, file3);
                            }
                            File file4 = ly0Var3.f8185a;
                            File file5 = n11Var.f8514c.f8185a;
                            try {
                                if (file4.exists()) {
                                    b80.v(file5);
                                    b80.A(file4, file5);
                                }
                                File file6 = n11Var.f8512a.f8185a;
                                try {
                                    if (file.exists()) {
                                        b80.v(file6);
                                        b80.A(file, file6);
                                    }
                                    file.delete();
                                    ((ly0) pr1Var.zzb()).f8185a.delete();
                                    ly0Var3.f8185a.delete();
                                } catch (IOException | SecurityException e11) {
                                    h21Var.d(15313, e11);
                                    ly0Var2.f8185a.delete();
                                    ((ly0) pr1Var.zzb()).f8185a.delete();
                                    ly0Var3.f8185a.delete();
                                    z3 = false;
                                    return new Boolean(z3);
                                }
                            } catch (IOException | SecurityException e12) {
                                h21Var.d(15312, e12);
                            }
                        } catch (IOException e13) {
                            e = e13;
                            h21Var.d(15311, e);
                            ly0Var2.f8185a.delete();
                            ((ly0) pr1Var.zzb()).f8185a.delete();
                            ly0Var3.f8185a.delete();
                            z3 = false;
                            return new Boolean(z3);
                        } catch (SecurityException e14) {
                            e = e14;
                            h21Var.d(15311, e);
                            ly0Var2.f8185a.delete();
                            ((ly0) pr1Var.zzb()).f8185a.delete();
                            ly0Var3.f8185a.delete();
                            z3 = false;
                            return new Boolean(z3);
                        }
                        return new Boolean(z3);
                    }
                    ((ly0) pr1Var.zzb()).f8185a.delete();
                    ly0Var3.f8185a.delete();
                    z3 = false;
                    return new Boolean(z3);
                } catch (Throwable th3) {
                    ly0Var2.f8185a.delete();
                    ((ly0) pr1Var.zzb()).f8185a.delete();
                    ly0Var3.f8185a.delete();
                    throw th3;
                }
            case 8:
                a21 a21Var = (a21) this.f4847b;
                cv cvVar = new cv(13, a21Var);
                synchronized (a21Var) {
                    h21 h21Var2 = a21Var.f4326c;
                    c81 d02 = ed1.d0(wa.c6.a(new z11(a21Var.f4325b, i, a21Var.e)), cvVar, a21Var.f4327d);
                    h21Var2.e(52, d02);
                    a21Var.f4329g = d02;
                }
                return "";
            case 9:
                Context context2 = ((a21) this.f4847b).f4325b;
                try {
                    return x21.d(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                e21 e21Var = (e21) this.f4847b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                e21Var.f5583a.registerReceiver(e21Var, intentFilter);
                return null;
        }
    }

    public /* synthetic */ bo0(int i, Object obj) {
        this.f4846a = i;
        this.f4847b = obj;
    }
}
