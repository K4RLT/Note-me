package a6;
import d.b;
import l.a;

import java.util.Set;

/* loaded from: classes.dex */
public final class d {
    public static final d i = new d(1, false, false, false, false, -1, -1, qe.u.f24025u);

    /* renamed from: a, reason: collision with root package name */
    public final int f258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f260c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f261d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final long f262f;

    /* renamed from: g, reason: collision with root package name */
    public final long f263g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f264h;

    public d(d dVar) {
        dVar.getClass();
        this.f259b = dVar.f259b;
        this.f260c = dVar.f260c;
        this.f258a = dVar.f258a;
        this.f261d = dVar.f261d;
        this.e = dVar.e;
        this.f264h = dVar.f264h;
        this.f262f = dVar.f262f;
        this.f263g = dVar.f263g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class.equals(obj.getClass())) {
            d dVar = (d) obj;
            if (this.f259b == dVar.f259b && this.f260c == dVar.f260c && this.f261d == dVar.f261d && this.e == dVar.e && this.f262f == dVar.f262f && this.f263g == dVar.f263g && this.f258a == dVar.f258a) {
                return kotlin.jvm.internal.a(this.f264h, dVar.f264h);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = ((((((((q0.b(this.f258a) * 31) + (this.f259b ? 1 : 0)) * 31) + (this.f260c ? 1 : 0)) * 31) + (this.f261d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j10 = this.f262f;
        int i10 = (b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f263g;
        return this.f264h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + a5.a.x(this.f258a) + ", requiresCharging=" + this.f259b + ", requiresDeviceIdle=" + this.f260c + ", requiresBatteryNotLow=" + this.f261d + ", requiresStorageNotLow=" + this.e + ", contentTriggerUpdateDelayMillis=" + this.f262f + ", contentTriggerMaxDelayMillis=" + this.f263g + ", contentUriTriggers=" + this.f264h + ", }";
    }

    public d(int i10, boolean z3, boolean z9, boolean z10, boolean z11, long j10, long j11, Set set) {
        if (i10 != 0) {
            set.getClass();
            this.f258a = i10;
            this.f259b = z3;
            this.f260c = z9;
            this.f261d = z10;
            this.e = z11;
            this.f262f = j10;
            this.f263g = j11;
            this.f264h = set;
            return;
        }
        throw null;
    }
}
