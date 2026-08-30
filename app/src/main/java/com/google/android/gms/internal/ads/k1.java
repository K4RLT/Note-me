package com.google.android.gms.internal.ads;

import android.util.Range;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public long f7594a;

    /* renamed from: b, reason: collision with root package name */
    public long f7595b;

    /* renamed from: c, reason: collision with root package name */
    public double f7596c;

    /* renamed from: d, reason: collision with root package name */
    public Range f7597d;

    public k1() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f7597d = range;
        this.f7596c = ((Double) range.getUpper()).doubleValue();
        this.f7594a = -9223372036854775807L;
        this.f7595b = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        boolean z3;
        double doubleValue;
        boolean z9 = false;
        if (j10 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        if (j11 != -9223372036854775807L) {
            z9 = true;
        }
        b80.l(z9);
        long j12 = this.f7594a;
        if (j12 != -9223372036854775807L) {
            if (this.f7595b != -9223372036854775807L && j10 != j12) {
                doubleValue = (j11 - r4) / (j10 - j12);
                this.f7596c = (((Double) this.f7597d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f7596c * 0.800000011920929d);
                this.f7594a = j10;
                this.f7595b = j11;
            }
        }
        doubleValue = ((Double) this.f7597d.getUpper()).doubleValue();
        this.f7596c = (((Double) this.f7597d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f7596c * 0.800000011920929d);
        this.f7594a = j10;
        this.f7595b = j11;
    }

    public final void b(float f10) {
        boolean z3;
        if (f10 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        this.f7597d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        c();
    }

    public final void c() {
        this.f7596c = ((Double) this.f7597d.getUpper()).doubleValue();
        this.f7594a = -9223372036854775807L;
        this.f7595b = -9223372036854775807L;
    }
}
