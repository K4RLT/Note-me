package ig;
import x.n;
import x.o;
import q.x;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18503a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18504b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18505c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f18506d;

    public h(boolean z3) {
        this.f18503a = z3;
    }

    public void a(f... fVarArr) {
        if (this.f18503a) {
            String[] strArr = new String[fVarArr.length];
            for (int i = 0; i < fVarArr.length; i++) {
                strArr[i] = fVarArr[i].f18496a;
            }
            b(strArr);
            return;
        }
        x.o("no cipher suites for cleartext connections");
    }

    public void b(String... strArr) {
        if (this.f18503a) {
            if (strArr.length != 0) {
                this.f18505c = (String[]) strArr.clone();
                return;
            } else {
                x.n("At least one cipher suite is required");
                return;
            }
        }
        x.o("no cipher suites for cleartext connections");
    }

    public void c(a0... a0VarArr) {
        if (this.f18503a) {
            String[] strArr = new String[a0VarArr.length];
            for (int i = 0; i < a0VarArr.length; i++) {
                strArr[i] = a0VarArr[i].f18459u;
            }
            d(strArr);
            return;
        }
        x.o("no TLS versions for cleartext connections");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String[], java.io.Serializable] */
    public void d(String... strArr) {
        if (this.f18503a) {
            if (strArr.length != 0) {
                this.f18506d = (String[]) strArr.clone();
                return;
            } else {
                x.n("At least one TLS version is required");
                return;
            }
        }
        x.o("no TLS versions for cleartext connections");
    }
}
