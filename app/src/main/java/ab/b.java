package ab;

/* loaded from: classes.dex */
public class b extends RuntimeException {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f362u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i) {
        super(a5.a.f(i, "r: ", new StringBuilder(String.valueOf(i).length() + 3)));
        this.f362u = 3;
    }

    public static b a(String str, int i, String str2) {
        return new b(c(str, i, i + 1, str2), 10);
    }

    public static b b(String str, int i, int i10, String str2) {
        return new b(c(str, i, i10, str2), 10);
    }

    public static String c(String str, int i, int i10, String str2) {
        if (i10 < 0) {
            i10 = str2.length();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(": ");
        if (i > 8) {
            sb2.append("...");
            sb2.append((CharSequence) str2, i - 5, i);
        } else {
            sb2.append((CharSequence) str2, 0, i);
        }
        sb2.append('[');
        sb2.append(str2.substring(i, i10));
        sb2.append(']');
        if (str2.length() - i10 > 8) {
            sb2.append((CharSequence) str2, i10, i10 + 5);
            sb2.append("...");
        } else {
            sb2.append((CharSequence) str2, i10, str2.length());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f362u) {
            case 10:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, String str, Throwable th) {
        super(str, th);
        this.f362u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Throwable th) {
        super(th);
        this.f362u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f362u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, boolean z3) {
        super(str);
        this.f362u = 2;
    }

    public /* synthetic */ b(int i, byte b10) {
        this.f362u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f362u = 1;
    }
}
