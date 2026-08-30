package com.google.android.gms.internal.ads;
import q.x;

/* loaded from: classes.dex */
public final class jl1 {

    /* renamed from: d, reason: collision with root package name */
    public static final jl1 f7476d = new jl1("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f7477a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7478b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7479c;

    static {
        new jl1("\n", "  ", true);
    }

    public jl1(String str, String str2, boolean z3) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f7477a = str;
                this.f7478b = str2;
                this.f7479c = z3;
                return;
            }
            q.x.n("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        q.x.n("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
