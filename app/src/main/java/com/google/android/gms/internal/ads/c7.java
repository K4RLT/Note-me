package com.google.android.gms.internal.ads;
import c7.e;

/* loaded from: classes.dex */
public final class c7 implements h7 {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;

    /* renamed from: u, reason: collision with root package name */
    public final g7 f5018u;

    /* renamed from: v, reason: collision with root package name */
    public final long f5019v;

    /* renamed from: w, reason: collision with root package name */
    public final long f5020w;

    /* renamed from: x, reason: collision with root package name */
    public final j7 f5021x;

    /* renamed from: y, reason: collision with root package name */
    public int f5022y;

    /* renamed from: z, reason: collision with root package name */
    public long f5023z;

    public c7(j7 j7Var, long j10, long j11, long j12, long j13, boolean z3) {
        boolean z9;
        if (j10 >= 0 && j11 > j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.l(z9);
        this.f5021x = j7Var;
        this.f5019v = j10;
        this.f5020w = j11;
        if (j12 != j11 - j10 && !z3) {
            this.f5022y = 0;
        } else {
            this.f5023z = j13;
            this.f5022y = 4;
        }
        this.f5018u = new g7();
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final /* bridge */ /* synthetic */ a3 c() {
        if (this.f5023z != 0) {
            return new b7(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.android.gms.internal.ads.h7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(com.google.android.gms.internal.ads.o2 r28) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c7.e(com.google.android.gms.internal.ads.o2):long");
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void g(long j10) {
        long j11 = this.f5023z - 1;
        String str = bq0.f4860a;
        this.B = Math.max(0L, Math.min(j10, j11));
        this.f5022y = 2;
        this.C = this.f5019v;
        this.D = this.f5020w;
        this.E = 0L;
        this.F = this.f5023z;
    }
}
