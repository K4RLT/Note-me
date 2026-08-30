package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class r2 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10061a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10062b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10063c;

    public r2(long j10, long j11) {
        b3 b3Var;
        this.f10061a = 1;
        this.f10062b = j10;
        if (j11 == 0) {
            b3Var = b3.f4701c;
        } else {
            b3Var = new b3(0L, j11);
        }
        this.f10063c = new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        long j11;
        int i = this.f10061a;
        int i10 = 1;
        Object obj = this.f10063c;
        switch (i) {
            case 0:
                s2 s2Var = (s2) obj;
                x90 x90Var = s2Var.f10463k;
                x90Var.getClass();
                String str = bq0.f4860a;
                long j12 = 0;
                long max = Math.max(0L, Math.min((s2Var.e * j10) / 1000000, s2Var.f10462j - 1));
                long[] jArr = (long[]) x90Var.f12502v;
                int s10 = bq0.s(jArr, max, false);
                if (s10 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[s10];
                }
                long[] jArr2 = (long[]) x90Var.f12503w;
                if (s10 != -1) {
                    j12 = jArr2[s10];
                }
                int i11 = s2Var.e;
                long j13 = (j11 * 1000000) / i11;
                long j14 = this.f10062b;
                b3 b3Var = new b3(j13, j12 + j14);
                if (j13 != j10 && s10 != jArr.length - 1) {
                    int i12 = s10 + 1;
                    return new z2(b3Var, new b3((jArr[i12] * 1000000) / i11, j14 + jArr2[i12]));
                }
                return new z2(b3Var, b3Var);
            case 1:
                return (z2) obj;
            default:
                p3 p3Var = (p3) obj;
                z2 a10 = p3Var.i[0].a(j10);
                while (true) {
                    s3[] s3VarArr = p3Var.i;
                    if (i10 < s3VarArr.length) {
                        z2 a11 = s3VarArr[i10].a(j10);
                        if (a11.f13048a.f4703b < a10.f13048a.f4703b) {
                            a10 = a11;
                        }
                        i10++;
                    } else {
                        return a10;
                    }
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        switch (this.f10061a) {
            case 0:
                return ((s2) this.f10063c).a();
            case 1:
                return this.f10062b;
            default:
                return this.f10062b;
        }
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        switch (this.f10061a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public /* synthetic */ r2(Object obj, long j10, int i) {
        this.f10061a = i;
        this.f10063c = obj;
        this.f10062b = j10;
    }
}
