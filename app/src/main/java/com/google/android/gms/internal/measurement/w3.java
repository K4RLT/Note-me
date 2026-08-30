package com.google.android.gms.internal.measurement;
import g5.q;
import n.r0;
import r3.a;
import r3.b;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads.bj0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class w3 {

    /* renamed from: a, reason: collision with root package name */
    public static bj0 f13952a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13953b = {1, 2, 3, 4, 5, 6, 7};

    public static d4 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                r0 r0Var = new r0(0);
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                        } else {
                            String str = new String(split[0]);
                            String decode = Uri.decode(new String(split[1]));
                            String str2 = (String) hashMap.get(split[2]);
                            if (str2 == null) {
                                String str3 = new String(split[2]);
                                str2 = Uri.decode(str3);
                                if (str2.length() < 1024 || str2 == str3) {
                                    hashMap.put(str3, str2);
                                }
                            }
                            r0 r0Var2 = (r0) r0Var.get(str);
                            if (r0Var2 == null) {
                                r0Var2 = new r0(0);
                                r0Var.put(str, r0Var2);
                            }
                            r0Var2.put(decode, str2);
                        }
                    } else {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        d4 d4Var = new d4(r0Var);
                        bufferedReader.close();
                        return d4Var;
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            q.k(e);
            return null;
        }
    }

    public static String b(s4 s4Var) {
        StringBuilder sb2 = new StringBuilder(s4Var.k());
        for (int i = 0; i < s4Var.k(); i++) {
            byte a10 = s4Var.a(i);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:3:0x0006, B:5:0x0009, B:6:0x0017, B:8:0x001d, B:9:0x002e, B:11:0x0034, B:19:0x0026), top: B:2:0x0006, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yb.b c(android.content.Context r5) {
        /*
            yb.a r0 = yb.a.f31630u
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L44
            java.io.File r2 = new java.io.File     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            java.lang.String r3 = "phenotype_hermetic"
            r4 = 0
            java.io.File r3 = r5.getDir(r3, r4)     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            java.lang.String r4 = "overrides.txt"
            r2.<init>(r3, r4)     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L23
            yb.c r3 = new yb.c     // Catch: java.lang.Throwable -> L44
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L44
            goto L2e
        L23:
            r3 = r0
            goto L2e
        L25:
            r2 = move-exception
            java.lang.String r3 = "HermeticFileOverrides"
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L44
            goto L23
        L2e:
            boolean r2 = b()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.Object r0 = a()     // Catch: java.lang.Throwable -> L44
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.measurement.d4 r5 = a(r5, r0)     // Catch: java.lang.Throwable -> L44
            yb.c r0 = new yb.c     // Catch: java.lang.Throwable -> L44
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r5 = move-exception
            goto L4a
        L46:
            android.os.StrictMode.setThreadPolicy(r1)
            return r0
        L4a:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w3.c(android.content.Context):yb.b");
    }
}
