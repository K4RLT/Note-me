package o4;

import ya.m1;

/* loaded from: classes.dex */
public final class a {
    public static volatile a e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f21767f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21769b = m1.a("debug.input.androidx_prefer_library_prediction");

    /* renamed from: c, reason: collision with root package name */
    public final int f21770c = m1.b("debug.input.androidx_prediction_offset");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21768a = m1.a("debug.input.androidx_predict_lift");

    /* renamed from: d, reason: collision with root package name */
    public final int f21771d = m1.b("debug.input.androidx_prediction_strategy");

    public static a a() {
        if (e == null) {
            synchronized (f21767f) {
                try {
                    if (e == null) {
                        e = new a();
                    }
                } finally {
                }
            }
        }
        return e;
    }
}
