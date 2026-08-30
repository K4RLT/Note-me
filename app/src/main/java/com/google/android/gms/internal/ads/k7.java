package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k7 extends j7 {

    /* renamed from: n, reason: collision with root package name */
    public tw f7672n;

    /* renamed from: o, reason: collision with root package name */
    public int f7673o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7674p;

    /* renamed from: q, reason: collision with root package name */
    public y2 f7675q;

    /* renamed from: r, reason: collision with root package name */
    public lt0 f7676r;

    @Override // com.google.android.gms.internal.ads.j7
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f7672n = null;
            this.f7675q = null;
            this.f7676r = null;
        }
        this.f7673o = 0;
        this.f7674p = false;
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final long b(xk0 xk0Var) {
        int i;
        int i10 = 0;
        if ((xk0Var.f12580a[0] & 1) == 1) {
            return -1L;
        }
        tw twVar = this.f7672n;
        twVar.getClass();
        byte b10 = xk0Var.f12580a[0];
        y2 y2Var = (y2) twVar.f11470v;
        if (((o6[]) twVar.f11473y)[(b10 >> 1) & (255 >>> (8 - x21.q(r0.length - 1)))].f8992v) {
            i = y2Var.f12759f;
        } else {
            i = y2Var.e;
        }
        int i11 = this.f7673o;
        if (this.f7674p) {
            i10 = (i11 + i) / 4;
        }
        byte[] bArr = xk0Var.f12580a;
        int length = bArr.length;
        int i12 = xk0Var.f12582c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            xk0Var.z(copyOf, copyOf.length);
        } else {
            xk0Var.C(i12);
        }
        long j10 = i10;
        byte[] bArr2 = xk0Var.f12580a;
        int i13 = xk0Var.f12582c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f7674p = true;
        this.f7673o = i;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, com.google.android.gms.internal.ads.y2] */
    @Override // com.google.android.gms.internal.ads.j7
    public final boolean c(xk0 xk0Var, long j10, com.google.android.gms.internal.measurement.e4 e4Var) {
        tw twVar;
        int i;
        int i10;
        int i11;
        y2 y2Var;
        long j11;
        int i12;
        if (this.f7672n != null) {
            ((mw1) e4Var.f13728v).getClass();
            return false;
        }
        y2 y2Var2 = this.f7675q;
        int i13 = 4;
        if (y2Var2 == null) {
            x21.H(1, xk0Var, false);
            xk0Var.i();
            int K = xk0Var.K();
            int i14 = xk0Var.i();
            int c10 = xk0Var.c();
            if (c10 <= 0) {
                c10 = -1;
            }
            int c11 = xk0Var.c();
            if (c11 <= 0) {
                i12 = -1;
            } else {
                i12 = c11;
            }
            xk0Var.c();
            int K2 = xk0Var.K();
            int pow = (int) Math.pow(2.0d, K2 & 15);
            int pow2 = (int) Math.pow(2.0d, (K2 & 240) >> 4);
            xk0Var.K();
            byte[] copyOf = Arrays.copyOf(xk0Var.f12580a, xk0Var.f12582c);
            Object obj = new Object();
            obj.f12755a = K;
            obj.f12756b = i14;
            obj.f12757c = c10;
            obj.f12758d = i12;
            obj.e = pow;
            obj.f12759f = pow2;
            obj.f12760g = copyOf;
            this.f7675q = obj;
        } else {
            lt0 lt0Var = this.f7676r;
            if (lt0Var == null) {
                this.f7676r = x21.x(xk0Var, true, true);
            } else {
                int i15 = xk0Var.f12582c;
                byte[] bArr = new byte[i15];
                System.arraycopy(xk0Var.f12580a, 0, bArr, 0, i15);
                int i16 = y2Var2.f12755a;
                int i17 = 5;
                x21.H(5, xk0Var, false);
                int K3 = xk0Var.K() + 1;
                androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(xk0Var.f12580a);
                int i18 = 8;
                iVar.a1(xk0Var.f12581b * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 2;
                    int i21 = i18;
                    int i22 = 16;
                    if (i19 < K3) {
                        if (iVar.Y0(24) == 5653314) {
                            int Y0 = iVar.Y0(16);
                            int Y02 = iVar.Y0(24);
                            if (!iVar.V0()) {
                                boolean V0 = iVar.V0();
                                for (int i23 = 0; i23 < Y02; i23++) {
                                    if (V0) {
                                        if (iVar.V0()) {
                                            iVar.a1(5);
                                        }
                                    } else {
                                        iVar.a1(5);
                                    }
                                }
                            } else {
                                iVar.a1(5);
                                for (int i24 = 0; i24 < Y02; i24 += iVar.Y0(x21.q(Y02 - i24))) {
                                }
                            }
                            int Y03 = iVar.Y0(i13);
                            if (Y03 <= 2) {
                                if (Y03 != 1) {
                                    if (Y03 != 2) {
                                        y2Var = y2Var2;
                                        i19++;
                                        i18 = i21;
                                        y2Var2 = y2Var;
                                        i13 = 4;
                                    }
                                } else {
                                    i20 = Y03;
                                }
                                iVar.a1(32);
                                iVar.a1(32);
                                int Y04 = iVar.Y0(i13) + 1;
                                iVar.a1(1);
                                if (i20 == 1) {
                                    if (Y0 != 0) {
                                        y2Var = y2Var2;
                                        j11 = (long) Math.floor(Math.pow(Y02, 1.0d / Y0));
                                    } else {
                                        y2Var = y2Var2;
                                        j11 = 0;
                                    }
                                } else {
                                    y2Var = y2Var2;
                                    j11 = Y02 * Y0;
                                }
                                iVar.a1((int) (j11 * Y04));
                                i19++;
                                i18 = i21;
                                y2Var2 = y2Var;
                                i13 = 4;
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(Y03).length() + 42);
                                sb2.append("lookup type greater than 2 not decodable: ");
                                sb2.append(Y03);
                                throw va.a(null, sb2.toString());
                            }
                        } else {
                            int i25 = (iVar.f735w * 8) + iVar.f736x;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i25).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(i25);
                            throw va.a(null, sb3.toString());
                        }
                    } else {
                        y2 y2Var3 = y2Var2;
                        int i26 = 6;
                        int Y05 = iVar.Y0(6) + 1;
                        for (int i27 = 0; i27 < Y05; i27++) {
                            if (iVar.Y0(16) != 0) {
                                throw va.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i28 = 1;
                        int Y06 = iVar.Y0(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < Y06) {
                                int Y07 = iVar.Y0(i22);
                                if (Y07 != 0) {
                                    if (Y07 == i28) {
                                        int Y08 = iVar.Y0(i17);
                                        int[] iArr = new int[Y08];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < Y08; i32++) {
                                            int Y09 = iVar.Y0(4);
                                            iArr[i32] = Y09;
                                            if (Y09 > i31) {
                                                i31 = Y09;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = iVar.Y0(i30) + 1;
                                            int Y010 = iVar.Y0(i20);
                                            if (Y010 > 0) {
                                                i11 = i21;
                                                iVar.a1(i11);
                                            } else {
                                                i11 = i21;
                                            }
                                            int[] iArr3 = iArr2;
                                            int i35 = 0;
                                            for (int i36 = 1; i35 < (i36 << Y010); i36 = 1) {
                                                iVar.a1(i11);
                                                i35++;
                                                i11 = 8;
                                            }
                                            i34++;
                                            iArr2 = iArr3;
                                            i21 = 8;
                                            i20 = 2;
                                            i30 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        iVar.a1(i20);
                                        int Y011 = iVar.Y0(4);
                                        int i37 = 0;
                                        int i38 = 0;
                                        for (int i39 = 0; i39 < Y08; i39++) {
                                            i37 += iArr4[iArr[i39]];
                                            while (i38 < i37) {
                                                iVar.a1(Y011);
                                                i38++;
                                            }
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(g3.a.d(Y07, 41));
                                        sb4.append("floor type greater than 1 not decodable: ");
                                        sb4.append(Y07);
                                        throw va.a(null, sb4.toString());
                                    }
                                } else {
                                    int i40 = i21;
                                    iVar.a1(i40);
                                    iVar.a1(16);
                                    iVar.a1(16);
                                    iVar.a1(6);
                                    iVar.a1(i40);
                                    int Y012 = iVar.Y0(4) + 1;
                                    int i41 = 0;
                                    while (i41 < Y012) {
                                        iVar.a1(i40);
                                        i41++;
                                        i40 = 8;
                                    }
                                }
                                i29++;
                                i21 = 8;
                                i26 = 6;
                                i20 = 2;
                                i28 = 1;
                                i17 = 5;
                                i22 = 16;
                            } else {
                                int Y013 = iVar.Y0(i26) + 1;
                                int i42 = 0;
                                while (i42 < Y013) {
                                    if (iVar.Y0(16) <= 2) {
                                        iVar.a1(24);
                                        iVar.a1(24);
                                        iVar.a1(24);
                                        int Y014 = iVar.Y0(i26) + 1;
                                        int i43 = 8;
                                        iVar.a1(8);
                                        int[] iArr5 = new int[Y014];
                                        for (int i44 = 0; i44 < Y014; i44++) {
                                            int Y015 = iVar.Y0(3);
                                            if (iVar.V0()) {
                                                i10 = iVar.Y0(5);
                                            } else {
                                                i10 = 0;
                                            }
                                            iArr5[i44] = (i10 * 8) + Y015;
                                        }
                                        int i45 = 0;
                                        while (i45 < Y014) {
                                            int i46 = 0;
                                            while (i46 < i43) {
                                                if ((iArr5[i45] & (1 << i46)) != 0) {
                                                    iVar.a1(i43);
                                                }
                                                i46++;
                                                i43 = 8;
                                            }
                                            i45++;
                                            i43 = 8;
                                        }
                                        i42++;
                                        i26 = 6;
                                    } else {
                                        throw va.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int Y016 = iVar.Y0(i26) + 1;
                                for (int i47 = 0; i47 < Y016; i47++) {
                                    int Y017 = iVar.Y0(16);
                                    if (Y017 != 0) {
                                        StringBuilder sb5 = new StringBuilder(g3.a.d(Y017, 41));
                                        sb5.append("mapping type other than 0 not supported: ");
                                        sb5.append(Y017);
                                        x21.N("VorbisUtil", sb5.toString());
                                    } else {
                                        if (iVar.V0()) {
                                            i = iVar.Y0(4) + 1;
                                        } else {
                                            i = 1;
                                        }
                                        if (iVar.V0()) {
                                            int Y018 = iVar.Y0(8) + 1;
                                            for (int i48 = 0; i48 < Y018; i48++) {
                                                int i49 = i16 - 1;
                                                iVar.a1(x21.q(i49));
                                                iVar.a1(x21.q(i49));
                                            }
                                        }
                                        if (iVar.Y0(2) == 0) {
                                            if (i > 1) {
                                                for (int i50 = 0; i50 < i16; i50++) {
                                                    iVar.a1(4);
                                                }
                                            }
                                            for (int i51 = 0; i51 < i; i51++) {
                                                iVar.a1(8);
                                                iVar.a1(8);
                                                iVar.a1(8);
                                            }
                                        } else {
                                            throw va.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int Y019 = iVar.Y0(6) + 1;
                                o6[] o6VarArr = new o6[Y019];
                                for (int i52 = 0; i52 < Y019; i52++) {
                                    boolean V02 = iVar.V0();
                                    iVar.Y0(16);
                                    iVar.Y0(16);
                                    iVar.Y0(8);
                                    o6VarArr[i52] = new o6(6, V02);
                                }
                                if (iVar.V0()) {
                                    twVar = new tw(y2Var3, lt0Var, bArr, o6VarArr, 2);
                                } else {
                                    throw va.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        twVar = null;
        this.f7672n = twVar;
        if (twVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        y2 y2Var4 = (y2) twVar.f11470v;
        arrayList.add((byte[]) y2Var4.f12760g);
        arrayList.add((byte[]) twVar.f11472x);
        m8 a10 = k3.a(d51.v((String[]) ((lt0) twVar.f11471w).f8135v));
        rv1 rv1Var = new rv1();
        rv1Var.d("audio/ogg");
        rv1Var.e("audio/vorbis");
        rv1Var.f10302h = y2Var4.f12758d;
        rv1Var.i = y2Var4.f12757c;
        rv1Var.G = y2Var4.f12755a;
        rv1Var.I = y2Var4.f12756b;
        rv1Var.f10310q = arrayList;
        rv1Var.f10304k = a10;
        e4Var.f13728v = new mw1(rv1Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void d(long j10) {
        boolean z3;
        this.f7366g = j10;
        int i = 0;
        if (j10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f7674p = z3;
        y2 y2Var = this.f7675q;
        if (y2Var != null) {
            i = y2Var.e;
        }
        this.f7673o = i;
    }
}
