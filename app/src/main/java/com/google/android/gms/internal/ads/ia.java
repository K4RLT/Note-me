package com.google.android.gms.internal.ads;
import g3.a;
import ia.b;
import va.a;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class ia implements ja {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f7056m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7057n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, FacebookMediationAdapter.ERROR_NULL_CONTEXT, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final p2 f7058a;

    /* renamed from: b, reason: collision with root package name */
    public final i3 f7059b;

    /* renamed from: c, reason: collision with root package name */
    public final ma f7060c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7061d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public final xk0 f7062f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7063g;

    /* renamed from: h, reason: collision with root package name */
    public final mw1 f7064h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f7065j;

    /* renamed from: k, reason: collision with root package name */
    public int f7066k;

    /* renamed from: l, reason: collision with root package name */
    public long f7067l;

    public ia(p2 p2Var, i3 i3Var, ma maVar) {
        this.f7058a = p2Var;
        this.f7059b = i3Var;
        this.f7060c = maVar;
        int i = maVar.f8286b;
        int max = Math.max(1, i / 10);
        this.f7063g = max;
        xk0 xk0Var = new xk0((byte[]) maVar.f8289f);
        xk0Var.M();
        int M = xk0Var.M();
        this.f7061d = M;
        int i10 = maVar.f8285a;
        int i11 = maVar.f8287c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (maVar.f8288d * i10)) + 1;
        if (M == i12) {
            String str = bq0.f4860a;
            int i13 = ((max + M) - 1) / M;
            this.e = new byte[i13 * i11];
            this.f7062f = new xk0((M + M) * i10 * i13);
            int i14 = ((i11 * i) * 8) / M;
            rv1 rv1Var = new rv1();
            rv1Var.e("audio/raw");
            rv1Var.f10302h = i14;
            rv1Var.i = i14;
            rv1Var.f10308o = (max + max) * i10;
            rv1Var.G = i10;
            int i15 = maVar.e;
            rv1Var.H = i15 != 0 ? i15 << 2 : -1;
            rv1Var.I = i;
            rv1Var.J = 2;
            this.f7064h = new mw1(rv1Var);
            return;
        }
        throw a(null, a.f(i12, M, "Expected frames per block: ", "; got: ", new StringBuilder(String.valueOf(i12).length() + 34 + String.valueOf(M).length())));
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void a(int i, long j10) {
        this.f7058a.B(new na(this.f7060c, this.f7061d, i, j10));
        this.f7059b.e(this.f7064h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0024->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.o2 r25, long r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b(com.google.android.gms.internal.ads.o2, long):boolean");
    }

    public final void c(int i) {
        ma maVar = this.f7060c;
        long w10 = this.f7065j + bq0.w(this.f7067l, 1000000L, maVar.f8286b, RoundingMode.DOWN);
        int i10 = (i + i) * maVar.f8285a;
        this.f7059b.c(w10, 1, i10, this.f7066k - i10, null);
        this.f7067l += i;
        this.f7066k -= i10;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void d(long j10) {
        this.i = 0;
        this.f7065j = j10;
        this.f7066k = 0;
        this.f7067l = 0L;
    }
}
