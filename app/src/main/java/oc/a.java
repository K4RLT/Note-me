package oc;
import q.h;

import java.io.File;
import qc.b0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f21867a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21868b;

    /* renamed from: c, reason: collision with root package name */
    public final File f21869c;

    public a(b0 b0Var, String str, File file) {
        this.f21867a = b0Var;
        if (str != null) {
            this.f21868b = str;
            this.f21869c = file;
        } else {
            g5.h("Null sessionId");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f21867a.equals(aVar.f21867a) && this.f21868b.equals(aVar.f21868b) && this.f21869c.equals(aVar.f21869c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f21867a.hashCode() ^ 1000003) * 1000003) ^ this.f21868b.hashCode()) * 1000003) ^ this.f21869c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f21867a + ", sessionId=" + this.f21868b + ", reportFile=" + this.f21869c + "}";
    }
}
