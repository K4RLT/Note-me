package k;

import d5.c;
import wa.c9;

/* loaded from: classes.dex */
public final class a extends c9 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f19206b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f19207c = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final b f19208a = new b();

    public static a a() {
        if (f19206b != null) {
            return f19206b;
        }
        synchronized (a.class) {
            try {
                if (f19206b == null) {
                    f19206b = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f19206b;
    }
}
