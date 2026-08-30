package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final c7 f14067a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.c7] */
    static {
        g7 g7Var;
        try {
            g7Var = h7.f14397a;
        } catch (NoClassDefFoundError unused) {
            g7Var = null;
        }
        if (g7Var == null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = c7.f14150a[i];
                try {
                    g7Var = (c7) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb2.append(th);
                }
            }
            throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
        }
        f14067a = g7Var;
    }
}
