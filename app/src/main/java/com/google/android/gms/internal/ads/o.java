package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends m {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final boolean R;
    public final String S;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f8897y;

    /* renamed from: z, reason: collision with root package name */
    public final j f8898z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0113 A[EDGE_INSN: B:151:0x0113->B:82:0x0113 BREAK  A[LOOP:1: B:75:0x00fc->B:149:0x0110], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(int r8, com.google.android.gms.internal.ads.hi r9, int r10, com.google.android.gms.internal.ads.j r11, int r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o.<init>(int, com.google.android.gms.internal.ads.hi, int, com.google.android.gms.internal.ads.j, int, java.lang.String, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        w41 d2 = w41.f12133a.d(oVar.B, oVar2.B);
        Integer valueOf = Integer.valueOf(oVar.G);
        Integer valueOf2 = Integer.valueOf(oVar2.G);
        w51 w51Var = w51.f12147w;
        return d2.a(valueOf, valueOf2, w51Var).b(oVar.H, oVar2.H).b(oVar.I, oVar2.I).a(Integer.valueOf(oVar.J), Integer.valueOf(oVar2.J), w51Var).d(oVar.K, oVar2.K).b(oVar.L, oVar2.L).d(oVar.C, oVar2.C).d(oVar.f8897y, oVar2.f8897y).d(oVar.A, oVar2.A).a(Integer.valueOf(oVar.F), Integer.valueOf(oVar2.F), w51Var).d(oVar.N, oVar2.N).d(oVar.P, oVar2.P).e();
    }

    public static int d(o oVar, o oVar2) {
        Comparator f61Var;
        if (oVar.f8897y && oVar.B) {
            f61Var = p.f9291k;
        } else {
            f61Var = new f61();
        }
        oVar.f8898z.getClass();
        w41 a10 = w41.f12133a.d(oVar.R, oVar2.R).a(Integer.valueOf(oVar.E), Integer.valueOf(oVar2.E), f61Var);
        if (oVar.N && oVar.P) {
            a10 = a10.b(oVar.Q, oVar2.Q);
        }
        return a10.d(oVar.O, oVar2.O).a(Integer.valueOf(oVar.D), Integer.valueOf(oVar2.D), f61Var).e();
    }

    @Override // com.google.android.gms.internal.ads.m
    public final int a() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        o oVar = (o) mVar;
        if (Objects.equals(this.S, oVar.S)) {
            this.f8898z.getClass();
            if (this.N == oVar.N && this.P == oVar.P) {
                return true;
            }
            return false;
        }
        return false;
    }
}
