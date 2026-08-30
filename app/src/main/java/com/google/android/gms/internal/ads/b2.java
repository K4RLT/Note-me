package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4665b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4666c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4667d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4668f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4669g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4670h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4671j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4672k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4673l;

    public b2(ArrayList arrayList, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f4664a = arrayList;
        this.f4665b = i;
        this.f4666c = i10;
        this.f4667d = i11;
        this.e = i12;
        this.f4668f = i13;
        this.f4669g = i14;
        this.f4670h = i15;
        this.i = i16;
        this.f4671j = i17;
        this.f4672k = f10;
        this.f4673l = str;
    }

    public static b2 a(xk0 xk0Var) {
        String str;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            xk0Var.G(4);
            int K = (xk0Var.K() & 3) + 1;
            if (K != 3) {
                ArrayList arrayList = new ArrayList();
                int K2 = xk0Var.K() & 31;
                for (int i17 = 0; i17 < K2; i17++) {
                    int L = xk0Var.L();
                    int i18 = xk0Var.f12581b;
                    xk0Var.G(L);
                    byte[] bArr = xk0Var.f12580a;
                    byte[] bArr2 = va0.f11866a;
                    byte[] bArr3 = new byte[L + 4];
                    System.arraycopy(va0.f11866a, 0, bArr3, 0, 4);
                    System.arraycopy(bArr, i18, bArr3, 4, L);
                    arrayList.add(bArr3);
                }
                int K3 = xk0Var.K();
                for (int i19 = 0; i19 < K3; i19++) {
                    int L2 = xk0Var.L();
                    int i20 = xk0Var.f12581b;
                    xk0Var.G(L2);
                    byte[] bArr4 = xk0Var.f12580a;
                    byte[] bArr5 = va0.f11866a;
                    byte[] bArr6 = new byte[L2 + 4];
                    System.arraycopy(va0.f11866a, 0, bArr6, 0, 4);
                    System.arraycopy(bArr4, i20, bArr6, 4, L2);
                    arrayList.add(bArr6);
                }
                if (K2 > 0) {
                    v11 S = xy.S((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                    int i21 = S.e;
                    int i22 = S.f11775f;
                    int i23 = S.f11777h + 8;
                    int i24 = S.i + 8;
                    int i25 = S.f11778j;
                    int i26 = S.f11779k;
                    int i27 = S.f11780l;
                    int i28 = S.f11781m;
                    float f11 = S.f11776g;
                    int i29 = S.f11771a;
                    int i30 = S.f11772b;
                    int i31 = S.f11773c;
                    byte[] bArr7 = va0.f11866a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i29), Integer.valueOf(i30), Integer.valueOf(i31));
                    i12 = i26;
                    i13 = i27;
                    i14 = i28;
                    f10 = f11;
                    i10 = i22;
                    i11 = i23;
                    i15 = i24;
                    i16 = i25;
                    i = i21;
                } else {
                    str = null;
                    i = -1;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = 16;
                    f10 = 1.0f;
                    i15 = -1;
                    i16 = -1;
                }
                return new b2(arrayList, K, i, i10, i11, i15, i16, i12, i13, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw va.a(e, "Error parsing AVC config");
        }
    }
}
