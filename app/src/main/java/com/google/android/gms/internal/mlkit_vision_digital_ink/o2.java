package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.wd0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class o2 extends Exception {

    /* renamed from: u, reason: collision with root package name */
    public final z4 f14731u;

    public o2(String str, Throwable th, z4 z4Var) {
        super(str, th);
        this.f14731u = z4Var;
    }

    public static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null && th.getClass().equals(ExecutionException.class)) {
            return a(cause);
        }
        return th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.d4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4] */
    public static void b(ArrayList arrayList, Object... objArr) {
        int size = arrayList.size();
        d4 d4Var = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                n5.r((ya) obj);
            } catch (CancellationException | ExecutionException e) {
                if (d4Var == 0) {
                    e4 e4Var = h4.f14393v;
                    d4Var = new b4(4);
                }
                d4Var.a(a(e));
            }
        }
        if (d4Var == 0) {
            return;
        }
        z4 d2 = d4Var.d();
        String format = String.format(Locale.US, "Failed to download file group %s", objArr);
        int i10 = d2.f15327x;
        if (i10 > 1) {
            String str = format + "\n" + i10 + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        printWriter.println(str);
                        int i11 = 0;
                        while (i11 < d2.f15327x) {
                            Throwable th = (Throwable) d2.get(i11);
                            i11++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i11));
                            printWriter.println(c(1, th));
                        }
                        printWriter.println("-------------------------------------------");
                        format = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        stringWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                format = "Failed to build string from throwables: ".concat(th4.toString());
            }
        }
        throw new o2(format, (Throwable) d2.get(0), d2);
    }

    public static String c(int i, Throwable th) {
        String n10 = wd0.n(th.getClass().getName(), ": ", th.getMessage());
        Throwable cause = th.getCause();
        if (cause != null) {
            if (i >= 5) {
                return n10.concat("\n(...)");
            }
            return wd0.n(n10, "\nCaused by: ", c(i + 1, cause));
        }
        return n10;
    }
}
