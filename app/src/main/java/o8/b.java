package o8;

import android.content.Context;
import g5.q;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21859a;

    /* renamed from: b, reason: collision with root package name */
    public final w8.a f21860b;

    /* renamed from: c, reason: collision with root package name */
    public final w8.a f21861c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21862d;

    public b(Context context, w8.a aVar, w8.a aVar2, String str) {
        if (context != null) {
            this.f21859a = context;
            if (aVar != null) {
                this.f21860b = aVar;
                if (aVar2 != null) {
                    this.f21861c = aVar2;
                    if (str != null) {
                        this.f21862d = str;
                        return;
                    } else {
                        q.h("Null backendName");
                        throw null;
                    }
                }
                q.h("Null monotonicClock");
                throw null;
            }
            q.h("Null wallClock");
            throw null;
        }
        q.h("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f21859a.equals(bVar.f21859a) && this.f21860b.equals(bVar.f21860b) && this.f21861c.equals(bVar.f21861c) && this.f21862d.equals(bVar.f21862d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f21859a.hashCode() ^ 1000003) * 1000003) ^ this.f21860b.hashCode()) * 1000003) ^ this.f21861c.hashCode()) * 1000003) ^ this.f21862d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f21859a);
        sb2.append(", wallClock=");
        sb2.append(this.f21860b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f21861c);
        sb2.append(", backendName=");
        return a5.a.k(sb2, this.f21862d, "}");
    }
}
