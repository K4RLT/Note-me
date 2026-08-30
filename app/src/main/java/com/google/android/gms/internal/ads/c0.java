package com.google.android.gms.internal.ads;
import nf.e;
import nf.g;

/* loaded from: classes.dex */
public final class c0 implements g {

    /* renamed from: u, reason: collision with root package name */
    public final int f4929u;

    /* renamed from: v, reason: collision with root package name */
    public final long f4930v;

    public /* synthetic */ c0(int i, long j10) {
        this.f4929u = i;
        this.f4930v = j10;
    }

    public static c0 a(o2 o2Var, xk0 xk0Var) {
        o2Var.y(xk0Var.f12580a, 0, 8);
        xk0Var.E(0);
        return new c0(xk0Var.b(), xk0Var.a());
    }

    @Override // g
    public e toInstant() {
        e eVar = e.f21342w;
        e eVar2 = e.f21342w;
        long j10 = eVar2.f21344u;
        long j11 = this.f4930v;
        if (j11 >= j10) {
            e eVar3 = e.f21343x;
            if (j11 <= eVar3.f21344u) {
                long j12 = this.f4929u;
                long j13 = j12 / 1000000000;
                if ((j12 ^ 1000000000) < 0 && j13 * 1000000000 != j12) {
                    j13--;
                }
                long j14 = j11 + j13;
                if ((j11 ^ j14) < 0 && (j13 ^ j11) >= 0) {
                    if (j11 <= 0) {
                        return eVar2;
                    }
                    return eVar3;
                }
                if (j14 >= -31557014167219200L) {
                    if (j14 <= 31556889864403199L) {
                        long j15 = j12 % 1000000000;
                        return new e(j14, (int) (j15 + ((((j15 ^ 1000000000) & ((-j15) | j15)) >> 63) & 1000000000)));
                    }
                    return eVar3;
                }
                return eVar2;
            }
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j11 + ')');
    }

    public c0(long j10, int i) {
        this.f4930v = j10;
        this.f4929u = i;
    }
}
