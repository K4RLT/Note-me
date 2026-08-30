package o8;
import d.a;
import d.b;

import g5.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21857a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21858b;

    public a(int i, long j10) {
        if (i != 0) {
            this.f21857a = i;
            this.f21858b = j10;
        } else {
            q.h("Null status");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (q0.d.a(this.f21857a, aVar.f21857a) && this.f21858b == aVar.f21858b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b10 = (q0.b(this.f21857a) ^ 1000003) * 1000003;
        long j10 = this.f21858b;
        return b10 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i = this.f21857a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        sb2.append(this.f21858b);
        sb2.append("}");
        return sb2.toString();
    }
}
