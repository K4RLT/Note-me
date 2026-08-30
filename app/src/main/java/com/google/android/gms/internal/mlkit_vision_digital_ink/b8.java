package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public abstract class b8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f14068a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* renamed from: b, reason: collision with root package name */
    public static final d8 f14069b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.d8] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    static {
        Object obj;
        int i = 0;
        while (true) {
            if (i < 2) {
                obj = 0;
                try {
                    obj = (d8) Class.forName(f14068a[i]).asSubclass(d8.class).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                }
                if (obj != 0) {
                    break;
                } else {
                    i++;
                }
            } else {
                obj = new Object();
                break;
            }
        }
        f14069b = obj;
    }
}