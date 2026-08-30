package qc;

/* loaded from: classes.dex */
public final class p0 extends i2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23897a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23898b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f23899c;

    /* renamed from: d, reason: collision with root package name */
    public final d2 f23900d;
    public final e2 e;

    /* renamed from: f, reason: collision with root package name */
    public final h2 f23901f;

    public p0(long j10, String str, c2 c2Var, d2 d2Var, e2 e2Var, h2 h2Var) {
        this.f23897a = j10;
        this.f23898b = str;
        this.f23899c = c2Var;
        this.f23900d = d2Var;
        this.e = e2Var;
        this.f23901f = h2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qc.o0] */
    public final o0 a() {
        Object obj = new Object();
        obj.f23887a = this.f23897a;
        obj.f23888b = this.f23898b;
        obj.f23889c = this.f23899c;
        obj.f23890d = this.f23900d;
        obj.e = this.e;
        obj.f23891f = this.f23901f;
        obj.f23892g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            p0 p0Var = (p0) ((i2) obj);
            if (this.f23897a == p0Var.f23897a && this.f23898b.equals(p0Var.f23898b) && this.f23899c.equals(p0Var.f23899c) && this.f23900d.equals(p0Var.f23900d)) {
                e2 e2Var = p0Var.e;
                e2 e2Var2 = this.e;
                if (e2Var2 != null ? e2Var2.equals(e2Var) : e2Var == null) {
                    h2 h2Var = p0Var.f23901f;
                    h2 h2Var2 = this.f23901f;
                    if (h2Var2 != null ? h2Var2.equals(h2Var) : h2Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f23897a;
        int hashCode2 = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f23898b.hashCode()) * 1000003) ^ this.f23899c.hashCode()) * 1000003) ^ this.f23900d.hashCode()) * 1000003;
        int i = 0;
        e2 e2Var = this.e;
        if (e2Var == null) {
            hashCode = 0;
        } else {
            hashCode = e2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        h2 h2Var = this.f23901f;
        if (h2Var != null) {
            i = h2Var.hashCode();
        }
        return i10 ^ i;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f23897a + ", type=" + this.f23898b + ", app=" + this.f23899c + ", device=" + this.f23900d + ", log=" + this.e + ", rollouts=" + this.f23901f + "}";
    }
}