package ca;

/* loaded from: classes.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f4066d = new t(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4068b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f4069c;

    public t(boolean z3, String str, Exception exc) {
        this.f4067a = z3;
        this.f4068b = str;
        this.f4069c = exc;
    }

    public static t b(String str) {
        return new t(false, str, null);
    }

    public static t c(Exception exc, String str) {
        return new t(false, str, exc);
    }

    public String a() {
        return this.f4068b;
    }
}
