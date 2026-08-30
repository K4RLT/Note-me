package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14695a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Thread f14696b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f14697c;

    public static Uri a(Context context, q2 q2Var) {
        String str;
        Pattern pattern = l.f14581a;
        tc.c cVar = new tc.c(context, 1);
        if (q2Var == null || !q2Var.c()) {
            str = "datadownload";
        } else {
            str = (String) q2Var.a();
        }
        cVar.m(str);
        if (q2Var != null && q2Var.c()) {
            cVar.n("datadownload");
        }
        return cVar.k();
    }

    public static Pair b(final ParcelFileDescriptor parcelFileDescriptor) {
        return Pair.create(new Uri.Builder().scheme("fd").opaquePart(String.valueOf(parcelFileDescriptor.getFd())).build(), new Closeable() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.t
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                parcelFileDescriptor.close();
            }
        });
    }

    public static String c(tm tmVar) {
        StringBuilder sb2 = new StringBuilder(tmVar.d());
        for (int i = 0; i < tmVar.d(); i++) {
            byte a10 = tmVar.a(i);
            if (a10 != 34) {
                if (a10 != 39) {
                    if (a10 != 92) {
                        switch (a10) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (a10 >= 32 && a10 <= 126) {
                                    sb2.append((char) a10);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((a10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((a10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((a10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static void d(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        g5.q.h(str.concat(" must not be null"));
    }

    public static void f(Context context, Uri uri, Uri uri2) {
        try {
            Os.symlink(nw.f(context, uri2).getAbsolutePath(), nw.f(context, uri).getAbsolutePath());
        } catch (ErrnoException | x e) {
            throw new IOException("Unable to create symlink", e);
        }
    }

    public static void g(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                g5.q.h(g3.a.g(i10, "at index "));
                return;
            }
        }
    }

    public static boolean h(Thread thread) {
        if (f14696b == null) {
            f14696b = Looper.getMainLooper().getThread();
        }
        if (thread == f14696b) {
            return true;
        }
        return false;
    }

    public static String i(String str, q2 q2Var) {
        if (q2Var != null && q2Var.c()) {
            str = str.concat((String) q2Var.a());
        }
        return str.concat(".pb");
    }

    public static Uri j(Context context, int i, String str, String str2, q2 q2Var, boolean z3) {
        String str3;
        try {
            if (z3) {
                r a10 = s.a(context);
                a10.f14879a = str2;
                return a10.c();
            }
            int i10 = i - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    str3 = "public_3p";
                } else {
                    str3 = "private";
                }
            } else {
                str3 = "public";
            }
            return a(context, q2Var).buildUpon().appendPath(str3).build().buildUpon().appendPath(str).build();
        } catch (Exception e) {
            cx.j(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.g9, com.google.android.gms.internal.mlkit_vision_digital_ink.ma, com.google.android.gms.internal.mlkit_vision_digital_ink.e9, java.lang.Runnable] */
    public static e9 k(ya yaVar, Class cls, r0 r0Var, Executor executor) {
        int i = g9.F;
        ?? g9Var = new g9(yaVar, cls, r0Var);
        yaVar.g(g9Var, f7.l(executor, g9Var));
        return g9Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.n9, com.google.android.gms.internal.mlkit_vision_digital_ink.ua, java.lang.Object] */
    public static ua l(Throwable th) {
        th.getClass();
        ?? obj = new Object();
        obj.o(th);
        return obj;
    }

    public static va m(Object obj) {
        if (obj == null) {
            return va.f15125v;
        }
        return new va(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.sa, java.lang.Object, java.lang.Runnable, com.google.android.gms.internal.mlkit_vision_digital_ink.ya] */
    public static ya n(ya yaVar) {
        if (yaVar.isDone()) {
            return yaVar;
        }
        ?? obj = new Object();
        obj.B = yaVar;
        yaVar.g(obj, ia.f14473u);
        return obj;
    }

    public static hb o(iw iwVar, Executor executor) {
        hb hbVar = new hb(iwVar);
        executor.execute(hbVar);
        return hbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.x9, com.google.android.gms.internal.mlkit_vision_digital_ink.y9, com.google.android.gms.internal.mlkit_vision_digital_ink.ma, java.lang.Runnable] */
    public static x9 p(ya yaVar, m2 m2Var, Executor executor) {
        int i = y9.E;
        ?? y9Var = new y9(yaVar, m2Var);
        yaVar.g(y9Var, f7.l(executor, y9Var));
        return y9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.w9, com.google.android.gms.internal.mlkit_vision_digital_ink.y9, com.google.android.gms.internal.mlkit_vision_digital_ink.ma, java.lang.Runnable] */
    public static w9 q(ya yaVar, ea eaVar, Executor executor) {
        int i = y9.E;
        ?? y9Var = new y9(yaVar, eaVar);
        yaVar.g(y9Var, f7.l(executor, y9Var));
        return y9Var;
    }

    public static Object r(Future future) {
        Object obj;
        if (future.isDone()) {
            boolean z3 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        q.x.o(tl.e("Future was expected to be done: %s", future));
        return null;
    }
}
