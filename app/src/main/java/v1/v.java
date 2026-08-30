package v1;
import b.c;
import p.a;
import r.j;
import s.a;
import s.b;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f27357a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27358b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27359c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27360d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27361f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27362g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27363h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27364j;

    /* renamed from: k, reason: collision with root package name */
    public final long f27365k;

    public v(long j10, long j11, long j12, long j13, boolean z3, float f10, int i, boolean z9, ArrayList arrayList, long j14, long j15) {
        this.f27357a = j10;
        this.f27358b = j11;
        this.f27359c = j12;
        this.f27360d = j13;
        this.e = z3;
        this.f27361f = f10;
        this.f27362g = i;
        this.f27363h = z9;
        this.i = arrayList;
        this.f27364j = j14;
        this.f27365k = j15;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (a(this.f27357a, vVar.f27357a) && this.f27358b == vVar.f27358b && j1.c(this.f27359c, vVar.f27359c) && j1.c(this.f27360d, vVar.f27360d) && this.e == vVar.e && Float.compare(this.f27361f, vVar.f27361f) == 0 && this.f27362g == vVar.f27362g && this.f27363h == vVar.f27363h && this.i.equals(vVar.i) && j1.c(this.f27364j, vVar.f27364j) && j1.c(this.f27365k, vVar.f27365k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27365k) + a.d(this.f27364j, (this.i.hashCode() + a.c(a.b(this.f27362g, a.a(a.c(a.d(this.f27360d, a.d(this.f27359c, a.d(this.f27358b, Long.hashCode(this.f27357a) * 31, 31), 31), 31), 31, this.e), 31, this.f27361f), 31), 31, this.f27363h)) * 31, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) b(this.f27357a)) + ", uptime=" + this.f27358b + ", positionOnScreen=" + ((Object) j1.b.j(this.f27359c)) + ", position=" + ((Object) j1.b.j(this.f27360d)) + ", down=" + this.e + ", pressure=" + this.f27361f + ", type=" + ((Object) j(this.f27362g)) + ", activeHover=" + this.f27363h + ", historical=" + this.i + ", scrollDelta=" + ((Object) j1.b.j(this.f27364j)) + ", originalEventPosition=" + ((Object) j1.b.j(this.f27365k)) + ')';
    }
}
