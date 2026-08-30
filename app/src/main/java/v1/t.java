package v1;
import r.j;
import s.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f27341a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27342b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27343c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27344d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27345f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27346g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27347h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27348j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f27349k;

    /* renamed from: l, reason: collision with root package name */
    public final long f27350l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27351m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27352n;

    /* renamed from: o, reason: collision with root package name */
    public t f27353o;

    public t(long j10, long j11, long j12, boolean z3, float f10, long j13, long j14, boolean z9, boolean z10, int i, long j15) {
        this.f27341a = j10;
        this.f27342b = j11;
        this.f27343c = j12;
        this.f27344d = z3;
        this.e = f10;
        this.f27345f = j13;
        this.f27346g = j14;
        this.f27347h = z9;
        this.i = i;
        this.f27348j = j15;
        this.f27350l = 0L;
        this.f27351m = z10;
        this.f27352n = z10;
    }

    public final void a() {
        t tVar = this.f27353o;
        if (tVar == null) {
            this.f27351m = true;
            this.f27352n = true;
        } else if (tVar != null) {
            tVar.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.f27349k;
        if (arrayList == null) {
            return qe.s.f24023u;
        }
        return arrayList;
    }

    public final long c() {
        return this.f27343c;
    }

    public final boolean d() {
        return this.f27344d;
    }

    public final long e() {
        return this.f27346g;
    }

    public final boolean f() {
        t tVar = this.f27353o;
        if (tVar != null) {
            return tVar.f();
        }
        if (!this.f27351m && !this.f27352n) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) b(this.f27341a)) + ", uptimeMillis=" + this.f27342b + ", position=" + ((Object) j1.b.j(this.f27343c)) + ", pressed=" + this.f27344d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f27345f + ", previousPosition=" + ((Object) j1.b.j(this.f27346g)) + ", previousPressed=" + this.f27347h + ", isConsumed=" + f() + ", type=" + ((Object) j(this.i)) + ", historical=" + b() + ",scrollDelta=" + ((Object) j1.b.j(this.f27348j)) + ')';
    }

    public t(long j10, long j11, long j12, boolean z3, float f10, long j13, long j14, boolean z9, int i, ArrayList arrayList, long j15, long j16) {
        this(j10, j11, j12, z3, f10, j13, j14, z9, false, i, j15);
        this.f27349k = arrayList;
        this.f27350l = j16;
    }
}
