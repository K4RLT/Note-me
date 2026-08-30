package com.google.android.gms.internal.ads;
import p.e;
import p.f;
import p.g;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends m implements Comparable {
    public final String A;
    public final j B;
    public final boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final boolean K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;

    /* renamed from: y, reason: collision with root package name */
    public final int f4645y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4646z;

    public b(int i, hi hiVar, int i10, j jVar, int i11, boolean z3, e eVar) {
        super(i, hiVar, i10);
        int i12;
        int i13;
        int i14;
        int bitCount;
        boolean z9;
        boolean z10;
        int hashCode;
        boolean z11;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        this.B = jVar;
        boolean z16 = jVar.f7266z;
        d51 d51Var = jVar.f9890p;
        d51 d51Var2 = jVar.f9886l;
        int i16 = 1;
        if (true != z16) {
            i12 = 16;
        } else {
            i12 = 24;
        }
        this.A = p.e(this.f8196x.f8450d);
        this.C = zw1.K(i11, false);
        int i17 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i17 < d51Var2.size()) {
                i14 = p.f(this.f8196x, (String) d51Var2.get(i17), false);
                if (i14 > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                i14 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            }
        }
        this.E = i17;
        this.D = i14;
        int i18 = this.f8196x.f8451f;
        if (i18 != 0 && i18 == 0) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(0);
        }
        this.F = bitCount;
        this.G = p.g(this.f8196x, jVar.f9887m);
        mw1 mw1Var = this.f8196x;
        int i19 = mw1Var.f8451f;
        if (i19 == 0 || (i19 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.H = z9;
        if (1 != (mw1Var.e & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.K = z10;
        String str = mw1Var.f8459o;
        if (str == null || ((hashCode = str.hashCode()) == -2123537834 ? !str.equals("audio/eac3-joc") : hashCode == 187078297 ? !str.equals("audio/ac4") : hashCode != 1504698186 || !str.equals("audio/iamf"))) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.R = z11;
        int i20 = mw1Var.H;
        this.L = i20;
        this.M = mw1Var.J;
        int i21 = mw1Var.f8454j;
        this.N = i21;
        if ((i21 != -1 && i21 > jVar.f9889o) || ((i20 != -1 && i20 > jVar.f9888n) || !eVar.l(mw1Var))) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f4646z = z12;
        String str2 = bq0.f4860a;
        String[] split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i22 = 0; i22 < split.length; i22++) {
            split[i22] = bq0.q(split[i22]);
        }
        int i23 = 0;
        while (true) {
            if (i23 < split.length) {
                i15 = p.f(this.f8196x, split[i23], false);
                if (i15 > 0) {
                    break;
                } else {
                    i23++;
                }
            } else {
                i15 = 0;
                i23 = Integer.MAX_VALUE;
                break;
            }
        }
        this.I = i23;
        this.J = i15;
        int i24 = 0;
        while (true) {
            if (i24 >= d51Var.size()) {
                break;
            }
            String str3 = this.f8196x.f8459o;
            if (str3 != null && str3.equals(d51Var.get(i24))) {
                i13 = i24;
                break;
            }
            i24++;
        }
        this.O = i13;
        if ((i11 & 384) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.P = z13;
        if ((i11 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.Q = z14;
        j jVar2 = this.B;
        if (!zw1.K(i11, jVar2.B) || (!(z15 = this.f4646z) && !jVar2.f7265y)) {
            i16 = 0;
        } else {
            jVar2.f9891q.getClass();
            if (zw1.K(i11, false) && z15 && this.f8196x.f8454j != -1 && ((jVar2.C || !z3) && (i12 & i11) != 0)) {
                i16 = 2;
            }
        }
        this.f4645y = i16;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final int a() {
        return this.f4645y;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        String str;
        int i;
        b bVar = (b) mVar;
        this.B.getClass();
        mw1 mw1Var = this.f8196x;
        int i10 = mw1Var.H;
        if (i10 != -1) {
            mw1 mw1Var2 = bVar.f8196x;
            if (i10 == mw1Var2.H && (str = mw1Var.f8459o) != null && TextUtils.equals(str, mw1Var2.f8459o) && (i = mw1Var.J) != -1 && i == mw1Var2.J && this.P == bVar.P && this.Q == bVar.Q) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        Comparator f61Var;
        boolean z3 = this.C;
        boolean z9 = this.f4646z;
        if (z9 && z3) {
            f61Var = p.f9291k;
        } else {
            f61Var = new f61();
        }
        w41 d2 = w41.f12133a.d(z3, bVar.C);
        Integer valueOf = Integer.valueOf(this.E);
        Integer valueOf2 = Integer.valueOf(bVar.E);
        w51 w51Var = w51.f12147w;
        w41 a10 = d2.a(valueOf, valueOf2, w51Var).b(this.D, bVar.D).b(this.F, bVar.F).a(Integer.valueOf(this.G), Integer.valueOf(bVar.G), w51Var).d(this.K, bVar.K).d(this.H, bVar.H).a(Integer.valueOf(this.I), Integer.valueOf(bVar.I), w51Var).b(this.J, bVar.J).d(z9, bVar.f4646z).a(Integer.valueOf(this.O), Integer.valueOf(bVar.O), w51Var);
        this.B.getClass();
        w41 a11 = a10.d(this.P, bVar.P).d(this.Q, bVar.Q).d(this.R, bVar.R).a(Integer.valueOf(this.L), Integer.valueOf(bVar.L), f61Var).a(Integer.valueOf(this.M), Integer.valueOf(bVar.M), f61Var);
        if (Objects.equals(this.A, bVar.A)) {
            a11 = a11.a(Integer.valueOf(this.N), Integer.valueOf(bVar.N), f61Var);
        }
        return a11.e();
    }
}
