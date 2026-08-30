package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import q.x;
import w2.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final w2 f14944a = a(".");

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.r, java.lang.Object] */
    public static r a(Context context) {
        Object obj = new Object();
        obj.f14879a = "";
        obj.f14880b = "";
        obj.f14880b = context.getPackageName();
        return obj;
    }

    public static void b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            String str = pathSegments.get(0);
            if (f14944a.b(str).size() == 1 || (str.endsWith(".lease") && !TextUtils.equals(str, ".lease"))) {
                if (!TextUtils.isEmpty(uri.getQuery())) {
                    if (uri.getQueryParameterNames().size() == 1 && uri.getQueryParameter("expiryDateSecs") != null) {
                        return;
                    } else {
                        throw new IOException(a.k("The uri query is malformed, expected expiryDateSecs=<expiryDateSecs> but found query ", uri.getQuery()));
                    }
                }
                return;
            }
        }
        throw new IOException(a.k("The uri is malformed, expected <non_empty_checksum> or <non_empty_checksum>.lease but found ", uri.getPath()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] c(String str) {
        k8 k8Var;
        boolean z3;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        l8 l8Var = o8.f14746d;
        o8 o8Var = l8Var.f14749c;
        if (o8Var == null) {
            k8 k8Var2 = l8Var.f14747a;
            int i = 0;
            while (true) {
                char[] cArr = k8Var2.f14554b;
                int length = cArr.length;
                if (i < length) {
                    char c10 = cArr[i];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                char c11 = cArr[i10];
                                if (c11 >= 'a' && c11 <= 'z') {
                                    z3 = true;
                                    break;
                                }
                                i10++;
                            } else {
                                z3 = false;
                                break;
                            }
                        }
                        pa.s("Cannot call lowerCase() on a mixed-case alphabet", !z3);
                        char[] cArr2 = new char[cArr.length];
                        for (int i11 = 0; i11 < cArr.length; i11++) {
                            char c12 = cArr[i11];
                            if (c12 >= 65 && c12 <= 90) {
                                c12 ^= 32;
                            }
                            cArr2[i11] = (char) c12;
                        }
                        k8Var = new k8(k8Var2.f14553a.concat(".lowerCase()"), cArr2);
                        if (k8Var2.f14559h && !k8Var.f14559h) {
                            byte[] bArr = k8Var.f14557f;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            for (int i12 = 65; i12 <= 90; i12++) {
                                int i13 = i12 | 32;
                                byte b10 = bArr[i12];
                                byte b11 = bArr[i13];
                                if (b10 == -1) {
                                    copyOf[i12] = b11;
                                } else {
                                    char c13 = (char) i12;
                                    char c14 = (char) i13;
                                    if (b11 == -1) {
                                        copyOf[i13] = b10;
                                    } else {
                                        x.o(tl.e("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                        return null;
                                    }
                                }
                            }
                            k8Var = new k8(k8Var.f14553a.concat(".ignoreCase()"), k8Var.f14554b, copyOf, true);
                        }
                    } else {
                        i++;
                    }
                } else {
                    k8Var = k8Var2;
                    break;
                }
            }
            if (k8Var == k8Var2) {
                o8Var = l8Var;
            } else {
                o8Var = new l8(k8Var);
            }
            l8Var.f14749c = o8Var;
        }
        try {
            int length2 = (int) (((o8Var.f14747a.f14555c * r15.length()) + 7) / 8);
            byte[] bArr2 = new byte[length2];
            int a10 = o8Var.a(bArr2, o8Var.b((CharSequence) f14944a.b(str).get(0)));
            if (a10 == length2) {
                return bArr2;
            }
            byte[] bArr3 = new byte[a10];
            System.arraycopy(bArr2, 0, bArr3, 0, a10);
            return bArr3;
        } catch (n8 e) {
            throw new IllegalArgumentException(e);
        }
    }
}