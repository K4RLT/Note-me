package xa;
import x.n;
import q.x;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final x f30699d = new x("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f30700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30701b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30702c;

    static {
        new x("\n", "  ", true);
    }

    public x(String str, String str2, boolean z3) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f30700a = str;
                this.f30701b = str2;
                this.f30702c = z3;
                return;
            }
            q.x.n("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        q.x.n("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
