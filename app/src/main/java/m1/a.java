package m1;

import k1.p;
import kotlin.jvm.internal.l;
import y2.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public y2.c f20419a;

    /* renamed from: b, reason: collision with root package name */
    public m f20420b;

    /* renamed from: c, reason: collision with root package name */
    public p f20421c;

    /* renamed from: d, reason: collision with root package name */
    public long f20422d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!l.a(this.f20419a, aVar.f20419a) || this.f20420b != aVar.f20420b || !l.a(this.f20421c, aVar.f20421c) || !j1.e.a(this.f20422d, aVar.f20422d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20422d) + ((this.f20421c.hashCode() + ((this.f20420b.hashCode() + (this.f20419a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f20419a + ", layoutDirection=" + this.f20420b + ", canvas=" + this.f20421c + ", size=" + ((Object) j1.e.f(this.f20422d)) + ')';
    }
}
