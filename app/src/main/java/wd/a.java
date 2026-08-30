package wd;

import kotlin.jvm.internal.l;
import oc.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final yf.c f29880a;

    /* renamed from: b, reason: collision with root package name */
    public j f29881b = null;

    public a(yf.c cVar) {
        this.f29880a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f29880a.equals(aVar.f29880a) || !l.a(this.f29881b, aVar.f29881b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f29880a.hashCode() * 31;
        j jVar = this.f29881b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f29880a + ", subscriber=" + this.f29881b + ')';
    }
}
