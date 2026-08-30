package com.google.android.gms.internal.ads;
import b0.a;
import m3.h;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m3 implements n2 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f8213l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8214m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f8215n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f8216o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8218b;

    /* renamed from: c, reason: collision with root package name */
    public long f8219c;

    /* renamed from: d, reason: collision with root package name */
    public int f8220d;
    public int e;

    /* renamed from: g, reason: collision with root package name */
    public p2 f8222g;

    /* renamed from: h, reason: collision with root package name */
    public i3 f8223h;

    /* renamed from: j, reason: collision with root package name */
    public r2 f8224j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8225k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8217a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f8221f = -1;
    public i3 i = new l2();

    static {
        String str = bq0.f4860a;
        Charset charset = StandardCharsets.UTF_8;
        f8215n = "#!AMR\n".getBytes(charset);
        f8216o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(o2 o2Var) {
        o2Var.h();
        byte[] bArr = f8215n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        o2Var.y(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f8218b = false;
            o2Var.u(bArr.length);
            return true;
        }
        o2Var.h();
        byte[] bArr3 = f8216o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        o2Var.y(bArr4, 0, length2);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f8218b = true;
        o2Var.u(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        return a(o2Var);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f8222g = p2Var;
        i3 A = p2Var.A(0, 1);
        this.f8223h = A;
        this.i = A;
        p2Var.z();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f8219c = 0L;
        this.f8220d = 0;
        this.e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[Catch: EOFException -> 0x00fa, TryCatch #0 {EOFException -> 0x00fa, blocks: (B:39:0x006f, B:41:0x007f, B:49:0x00a1, B:50:0x00a6, B:54:0x00a4, B:64:0x00b8, B:65:0x00db, B:66:0x00dc, B:67:0x00f9), top: B:38:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4 A[Catch: EOFException -> 0x00fa, TryCatch #0 {EOFException -> 0x00fa, blocks: (B:39:0x006f, B:41:0x007f, B:49:0x00a1, B:50:0x00a6, B:54:0x00a4, B:64:0x00b8, B:65:0x00db, B:66:0x00dc, B:67:0x00f9), top: B:38:0x006f }] */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r19, a r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h(com.google.android.gms.internal.ads.o2, a):int");
    }
}
