package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gu1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6459a;

    /* renamed from: b, reason: collision with root package name */
    public final uh f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6461c;

    /* renamed from: d, reason: collision with root package name */
    public final yx1 f6462d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final uh f6463f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6464g;

    /* renamed from: h, reason: collision with root package name */
    public final yx1 f6465h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6466j;

    public gu1(long j10, uh uhVar, int i, yx1 yx1Var, long j11, uh uhVar2, int i10, yx1 yx1Var2, long j12, long j13) {
        this.f6459a = j10;
        this.f6460b = uhVar;
        this.f6461c = i;
        this.f6462d = yx1Var;
        this.e = j11;
        this.f6463f = uhVar2;
        this.f6464g = i10;
        this.f6465h = yx1Var2;
        this.i = j12;
        this.f6466j = j13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gu1.class == obj.getClass()) {
                gu1 gu1Var = (gu1) obj;
                if (this.f6459a == gu1Var.f6459a && this.f6461c == gu1Var.f6461c && this.e == gu1Var.e && this.f6464g == gu1Var.f6464g && this.i == gu1Var.i && this.f6466j == gu1Var.f6466j && this.f6460b.equals(gu1Var.f6460b) && Objects.equals(this.f6462d, gu1Var.f6462d) && Objects.equals(this.f6463f, gu1Var.f6463f) && Objects.equals(this.f6465h, gu1Var.f6465h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f6459a), this.f6460b, Integer.valueOf(this.f6461c), this.f6462d, Long.valueOf(this.e), this.f6463f, Integer.valueOf(this.f6464g), this.f6465h, Long.valueOf(this.i), Long.valueOf(this.f6466j));
    }
}
