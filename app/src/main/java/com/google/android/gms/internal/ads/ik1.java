package com.google.android.gms.internal.ads;
import q.x;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ik1 implements z91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7158a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7159b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7160c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7161d;

    public ik1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (ct.i(1)) {
            if (bArr.length == 32) {
                this.f7159b = (byte[]) bArr.clone();
                this.f7160c = bArr2;
                this.f7161d = bArr3;
                if (oc1.f9092a != null) {
                    return;
                }
                q.x.o("Could not initialize Ed25519.");
                throw null;
            }
            q.x.n("Given public key's length is not 32.");
            throw null;
        }
        androidx.datastore.preferences.protobuf.s1.r(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        switch (this.f7158a) {
            case 0:
                z91 z91Var = (z91) this.f7161d;
                byte[] bArr3 = this.f7159b;
                int length = bArr3.length;
                byte[] bArr4 = this.f7160c;
                if (length == 0 && bArr4.length == 0) {
                    z91Var.a(bArr, bArr2);
                    return;
                } else {
                    if (fe1.c(bArr3, bArr)) {
                        if (bArr4.length != 0) {
                            bArr2 = xy.z(bArr2, bArr4);
                        }
                        z91Var.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                        return;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
                    return;
                }
            default:
                byte[] bArr5 = (byte[]) this.f7161d;
                byte[] bArr6 = this.f7160c;
                int length2 = bArr6.length;
                if (length2 == 0 && bArr5.length == 0) {
                    b(bArr, bArr2);
                    return;
                } else {
                    if (fe1.c(bArr6, bArr)) {
                        if (bArr5.length != 0) {
                            bArr2 = xy.z(bArr2, bArr5);
                        }
                        b(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                        return;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
                    return;
                }
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length == 64) {
            if (bArr3.length == 64) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
                int i = 31;
                while (true) {
                    if (i < 0) {
                        break;
                    }
                    int i10 = copyOfRange[i] & 255;
                    int i11 = ed1.M[i] & 255;
                    if (i10 != i11) {
                        if (i10 < i11) {
                            MessageDigest messageDigest = (MessageDigest) yk1.e.f12905a.o("SHA-512");
                            messageDigest.update(bArr3, 0, 32);
                            byte[] bArr4 = this.f7159b;
                            messageDigest.update(bArr4);
                            messageDigest.update(bArr2);
                            byte[] digest = messageDigest.digest();
                            long g02 = ed1.g0(digest, 0) & 2097151;
                            long h02 = ed1.h0(digest, 2) >> 5;
                            long g03 = ed1.g0(digest, 5) >> 2;
                            long h03 = ed1.h0(digest, 7) >> 7;
                            long h04 = ed1.h0(digest, 10) >> 4;
                            long g04 = ed1.g0(digest, 13) >> 1;
                            long h05 = ed1.h0(digest, 15) >> 6;
                            long g05 = ed1.g0(digest, 18) >> 3;
                            long g06 = ed1.g0(digest, 21) & 2097151;
                            long h06 = ed1.h0(digest, 23) >> 5;
                            long g07 = ed1.g0(digest, 26) >> 2;
                            long h07 = ed1.h0(digest, 28) >> 7;
                            long h08 = ed1.h0(digest, 31) >> 4;
                            long g08 = ed1.g0(digest, 34) >> 1;
                            long h09 = ed1.h0(digest, 36) >> 6;
                            long g09 = ed1.g0(digest, 39) >> 3;
                            long g010 = ed1.g0(digest, 42) & 2097151;
                            long h010 = ed1.h0(digest, 44) >> 5;
                            long g011 = (ed1.g0(digest, 47) >> 2) & 2097151;
                            long h011 = (ed1.h0(digest, 49) >> 7) & 2097151;
                            long h012 = (ed1.h0(digest, 52) >> 4) & 2097151;
                            long g012 = (ed1.g0(digest, 55) >> 1) & 2097151;
                            long h013 = (ed1.h0(digest, 57) >> 6) & 2097151;
                            long h014 = ed1.h0(digest, 60) >> 3;
                            long j10 = (h012 * 666643) + g06;
                            long j11 = (h011 * 666643) + g05;
                            long j12 = (g011 * 666643) + (h05 & 2097151);
                            long j13 = (j12 + 1048576) >> 21;
                            long j14 = j13 << 21;
                            long j15 = (g011 * 654183) + (h011 * 470296) + j10;
                            long j16 = (j15 + 1048576) >> 21;
                            long j17 = j16 << 21;
                            long j18 = (g011 * 136657) + (((h012 * 654183) + ((g012 * 470296) + ((h013 * 666643) + (g07 & 2097151)))) - (h011 * 997805));
                            long j19 = (j18 + 1048576) >> 21;
                            long j20 = j19 << 21;
                            long j21 = ((h012 * 136657) + (((h013 * 654183) + ((h014 * 470296) + (h08 & 2097151))) - (g012 * 997805))) - (h011 * 683901);
                            long j22 = (j21 + 1048576) >> 21;
                            long j23 = ((h013 * 136657) + ((h09 & 2097151) - (h014 * 997805))) - (g012 * 683901);
                            long j24 = (j23 + 1048576) >> 21;
                            long j25 = j24 << 21;
                            long j26 = g010 - (h014 * 683901);
                            long j27 = (j26 + 1048576) >> 21;
                            long j28 = (g011 * 470296) + j11 + j13;
                            long j29 = (j28 + 1048576) >> 21;
                            long j30 = j29 << 21;
                            long j31 = (((h011 * 654183) + ((h012 * 470296) + ((g012 * 666643) + (h06 & 2097151)))) - (g011 * 997805)) + j16;
                            long j32 = (j31 + 1048576) >> 21;
                            long j33 = j32 << 21;
                            long j34 = (((h011 * 136657) + (((g012 * 654183) + ((h013 * 470296) + ((h014 * 666643) + (h07 & 2097151)))) - (h012 * 997805))) - (g011 * 683901)) + j19;
                            long j35 = (j34 + 1048576) >> 21;
                            long j36 = j35 << 21;
                            long j37 = (((g012 * 136657) + (((h014 * 654183) + (g08 & 2097151)) - (h013 * 997805))) - (h012 * 683901)) + j22;
                            long j38 = (j37 + 1048576) >> 21;
                            long j39 = (((h014 * 136657) + g09) - (h013 * 683901)) + j24;
                            long j40 = (j39 + 1048576) >> 21;
                            long j41 = (j21 - (j22 << 21)) + j35;
                            long j42 = (j41 * 666643) + g02;
                            long j43 = (j42 + 1048576) >> 21;
                            long j44 = j43 << 21;
                            long j45 = (j23 - j25) + j38;
                            long j46 = j37 - (j38 << 21);
                            long j47 = (j41 * 654183) + (j46 * 470296) + (j45 * 666643) + (g03 & 2097151);
                            long j48 = (j47 + 1048576) >> 21;
                            long j49 = j48 << 21;
                            long j50 = (j26 - (j27 << 21)) + j40;
                            long j51 = j39 - (j40 << 21);
                            long j52 = (j41 * 136657) + (((j45 * 654183) + ((j51 * 470296) + ((j50 * 666643) + (h04 & 2097151)))) - (j46 * 997805));
                            long j53 = (j52 + 1048576) >> 21;
                            long j54 = j53 << 21;
                            long j55 = (h010 & 2097151) + j27;
                            long j56 = ((j45 * 136657) + (((j50 * 654183) + ((j55 * 470296) + (j12 - j14))) - (j51 * 997805))) - (j46 * 683901);
                            long j57 = (j56 + 1048576) >> 21;
                            long j58 = j57 << 21;
                            long j59 = ((j50 * 136657) + (((j15 - j17) + j29) - (j55 * 997805))) - (j51 * 683901);
                            long j60 = (j59 + 1048576) >> 21;
                            long j61 = j60 << 21;
                            long j62 = ((j18 - j20) + j32) - (j55 * 683901);
                            long j63 = (j62 + 1048576) >> 21;
                            long j64 = j63 << 21;
                            long j65 = (j41 * 470296) + (j46 * 666643) + (h02 & 2097151) + j43;
                            long j66 = (j65 + 1048576) >> 21;
                            long j67 = (((j46 * 654183) + ((j45 * 470296) + ((j51 * 666643) + (h03 & 2097151)))) - (j41 * 997805)) + j48;
                            long j68 = (j67 + 1048576) >> 21;
                            long j69 = (((j46 * 136657) + (((j51 * 654183) + ((j50 * 470296) + ((j55 * 666643) + (g04 & 2097151)))) - (j45 * 997805))) - (j41 * 683901)) + j53;
                            long j70 = (j69 + 1048576) >> 21;
                            long j71 = (((j51 * 136657) + (((j55 * 654183) + (j28 - j30)) - (j50 * 997805))) - (j45 * 683901)) + j57;
                            long j72 = (j71 + 1048576) >> 21;
                            long j73 = (((j55 * 136657) + (j31 - j33)) - (j50 * 683901)) + j60;
                            long j74 = (j73 + 1048576) >> 21;
                            long j75 = (j34 - j36) + j63;
                            long j76 = (j75 + 1048576) >> 21;
                            long j77 = j76 << 21;
                            long j78 = (j76 * 666643) + (j42 - j44);
                            long j79 = j78 >> 21;
                            long j80 = j79 << 21;
                            long j81 = (j76 * 470296) + (j65 - (j66 << 21)) + j79;
                            long j82 = j81 >> 21;
                            long j83 = j82 << 21;
                            long j84 = (j76 * 654183) + (j47 - j49) + j66 + j82;
                            long j85 = j84 >> 21;
                            long j86 = j85 << 21;
                            long j87 = ((j67 - (j68 << 21)) - (j76 * 997805)) + j85;
                            long j88 = j87 >> 21;
                            long j89 = j88 << 21;
                            long j90 = (j76 * 136657) + (j52 - j54) + j68 + j88;
                            long j91 = j90 >> 21;
                            long j92 = j91 << 21;
                            long j93 = ((j69 - (j70 << 21)) - (j76 * 683901)) + j91;
                            long j94 = j93 >> 21;
                            long j95 = j94 << 21;
                            long j96 = (j56 - j58) + j70 + j94;
                            long j97 = j96 >> 21;
                            long j98 = j97 << 21;
                            long j99 = (j71 - (j72 << 21)) + j97;
                            long j100 = j99 >> 21;
                            long j101 = j100 << 21;
                            long j102 = (j59 - j61) + j72 + j100;
                            long j103 = j102 >> 21;
                            long j104 = j103 << 21;
                            long j105 = (j73 - (j74 << 21)) + j103;
                            long j106 = j105 >> 21;
                            long j107 = j106 << 21;
                            long j108 = (j62 - j64) + j74 + j106;
                            long j109 = j108 >> 21;
                            long j110 = j109 << 21;
                            long j111 = (j75 - j77) + j109;
                            long j112 = j111 >> 21;
                            long j113 = j112 << 21;
                            long j114 = (666643 * j112) + (j78 - j80);
                            long j115 = j114 >> 21;
                            long j116 = j115 << 21;
                            long j117 = (470296 * j112) + (j81 - j83) + j115;
                            long j118 = j117 >> 21;
                            long j119 = j118 << 21;
                            long j120 = (654183 * j112) + (j84 - j86) + j118;
                            long j121 = j120 >> 21;
                            long j122 = j121 << 21;
                            long j123 = ((j87 - j89) - (997805 * j112)) + j121;
                            long j124 = j123 >> 21;
                            long j125 = j124 << 21;
                            long j126 = (136657 * j112) + (j90 - j92) + j124;
                            long j127 = j126 >> 21;
                            long j128 = j127 << 21;
                            long j129 = ((j93 - j95) - (j112 * 683901)) + j127;
                            long j130 = j129 >> 21;
                            long j131 = j130 << 21;
                            long j132 = (j96 - j98) + j130;
                            long j133 = j132 >> 21;
                            long j134 = j133 << 21;
                            long j135 = (j99 - j101) + j133;
                            long j136 = j135 >> 21;
                            long j137 = j136 << 21;
                            long j138 = (j102 - j104) + j136;
                            long j139 = j138 >> 21;
                            long j140 = j139 << 21;
                            long j141 = (j105 - j107) + j139;
                            long j142 = j141 >> 21;
                            long j143 = j142 << 21;
                            long j144 = (j108 - j110) + j142;
                            long j145 = j144 >> 21;
                            digest[0] = (byte) (j114 - j116);
                            long j146 = j135 - j137;
                            long j147 = j132 - j134;
                            long j148 = j129 - j131;
                            long j149 = j126 - j128;
                            long j150 = j123 - j125;
                            long j151 = j120 - j122;
                            long j152 = j117 - j119;
                            digest[1] = (byte) (r13 >> 8);
                            digest[2] = (byte) ((r13 >> 16) | (j152 << 5));
                            digest[3] = (byte) (j152 >> 3);
                            digest[4] = (byte) (j152 >> 11);
                            digest[5] = (byte) ((j152 >> 19) | (j151 << 2));
                            digest[6] = (byte) (j151 >> 6);
                            digest[7] = (byte) ((j151 >> 14) | (j150 << 7));
                            digest[8] = (byte) (j150 >> 1);
                            digest[9] = (byte) (j150 >> 9);
                            digest[10] = (byte) ((j150 >> 17) | (j149 << 4));
                            digest[11] = (byte) (j149 >> 4);
                            digest[12] = (byte) (j149 >> 12);
                            digest[13] = (byte) ((j149 >> 20) | (j148 + j148));
                            digest[14] = (byte) (j148 >> 7);
                            digest[15] = (byte) ((j148 >> 15) | (j147 << 6));
                            digest[16] = (byte) (j147 >> 2);
                            digest[17] = (byte) (j147 >> 10);
                            digest[18] = (byte) ((j147 >> 18) | (j146 << 3));
                            long j153 = j144 - (j145 << 21);
                            long j154 = (j111 - j113) + j145;
                            long j155 = j141 - j143;
                            digest[19] = (byte) (j146 >> 5);
                            digest[20] = (byte) (j146 >> 13);
                            digest[21] = (byte) (j138 - j140);
                            digest[22] = (byte) (r9 >> 8);
                            digest[23] = (byte) ((r9 >> 16) | (j155 << 5));
                            digest[24] = (byte) (j155 >> 3);
                            digest[25] = (byte) (j155 >> 11);
                            digest[26] = (byte) ((j155 >> 19) | (j153 << 2));
                            digest[27] = (byte) (j153 >> 6);
                            digest[28] = (byte) ((j153 >> 14) | (j154 << 7));
                            digest[29] = (byte) (j154 >> 1);
                            digest[30] = (byte) (j154 >> 9);
                            digest[31] = (byte) (j154 >> 17);
                            long[] jArr = new long[10];
                            long[] M = an1.M(bArr4);
                            long[] jArr2 = new long[10];
                            jArr2[0] = 1;
                            long[] jArr3 = new long[10];
                            long[] jArr4 = new long[10];
                            long[] jArr5 = new long[10];
                            long[] jArr6 = new long[10];
                            long[] jArr7 = new long[10];
                            an1.L(jArr4, M);
                            an1.K(jArr5, jArr4, oc1.f9092a);
                            an1.w(jArr4, jArr4, jArr2);
                            an1.l(jArr5, jArr5, jArr2);
                            long[] jArr8 = new long[10];
                            an1.L(jArr8, jArr5);
                            an1.K(jArr8, jArr8, jArr5);
                            an1.L(jArr, jArr8);
                            an1.K(jArr, jArr, jArr5);
                            an1.K(jArr, jArr, jArr4);
                            long[] jArr9 = new long[10];
                            long[] jArr10 = new long[10];
                            long[] jArr11 = new long[10];
                            an1.L(jArr9, jArr);
                            an1.L(jArr10, jArr9);
                            an1.L(jArr10, jArr10);
                            an1.K(jArr10, jArr, jArr10);
                            an1.K(jArr9, jArr9, jArr10);
                            an1.L(jArr9, jArr9);
                            an1.K(jArr9, jArr10, jArr9);
                            an1.L(jArr10, jArr9);
                            for (int i12 = 1; i12 < 5; i12++) {
                                an1.L(jArr10, jArr10);
                            }
                            an1.K(jArr9, jArr10, jArr9);
                            an1.L(jArr10, jArr9);
                            for (int i13 = 1; i13 < 10; i13++) {
                                an1.L(jArr10, jArr10);
                            }
                            an1.K(jArr10, jArr10, jArr9);
                            an1.L(jArr11, jArr10);
                            for (int i14 = 1; i14 < 20; i14++) {
                                an1.L(jArr11, jArr11);
                            }
                            an1.K(jArr10, jArr11, jArr10);
                            an1.L(jArr10, jArr10);
                            for (int i15 = 1; i15 < 10; i15++) {
                                an1.L(jArr10, jArr10);
                            }
                            an1.K(jArr9, jArr10, jArr9);
                            an1.L(jArr10, jArr9);
                            for (int i16 = 1; i16 < 50; i16++) {
                                an1.L(jArr10, jArr10);
                            }
                            an1.K(jArr10, jArr10, jArr9);
                            an1.L(jArr11, jArr10);
                            for (int i17 = 1; i17 < 100; i17++) {
                                an1.L(jArr11, jArr11);
                            }
                            an1.K(jArr10, jArr11, jArr10);
                            an1.L(jArr10, jArr10);
                            for (int i18 = 1; i18 < 50; i18++) {
                                an1.L(jArr10, jArr10);
                            }
                            an1.K(jArr9, jArr10, jArr9);
                            an1.L(jArr9, jArr9);
                            an1.L(jArr9, jArr9);
                            an1.K(jArr, jArr9, jArr);
                            an1.K(jArr, jArr, jArr8);
                            an1.K(jArr, jArr, jArr4);
                            an1.L(jArr6, jArr);
                            an1.K(jArr6, jArr6, jArr5);
                            an1.w(jArr7, jArr6, jArr4);
                            if (ed1.M(jArr7)) {
                                an1.l(jArr7, jArr6, jArr4);
                                if (!ed1.M(jArr7)) {
                                    an1.K(jArr, jArr, oc1.f9094c);
                                } else {
                                    androidx.datastore.preferences.protobuf.s1.q("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                                    return;
                                }
                            }
                            if (!ed1.M(jArr) && ((bArr4[31] & 255) >> 7) != 0) {
                                androidx.datastore.preferences.protobuf.s1.q("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                                return;
                            }
                            if ((an1.N(jArr)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                                for (int i19 = 0; i19 < 10; i19++) {
                                    jArr[i19] = -jArr[i19];
                                }
                            }
                            an1.K(jArr3, jArr, M);
                            hq0 hq0Var = new hq0(jArr, M, jArr2, 22, false);
                            nc1[] nc1VarArr = new nc1[8];
                            nc1VarArr[0] = new nc1(new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(hq0Var, 9, jArr3));
                            com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(new hq0(22), 9, new long[10]);
                            ed1.a0(hq0Var, iwVar);
                            com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(iwVar);
                            for (int i20 = 1; i20 < 8; i20++) {
                                ed1.T(iwVar, pwVar, nc1VarArr[i20 - 1]);
                                nc1VarArr[i20] = new nc1(new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(iwVar));
                            }
                            byte[] f02 = ed1.f0(digest);
                            byte[] f03 = ed1.f0(copyOfRange);
                            com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(9);
                            com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(9);
                            int i21 = 255;
                            while (i21 >= 0 && f02[i21] == 0 && f03[i21] == 0) {
                                i21--;
                            }
                            while (i21 >= 0) {
                                ed1.a0(new hq0(iwVar2), iwVar2);
                                byte b10 = f02[i21];
                                if (b10 > 0) {
                                    com.google.android.gms.internal.mlkit_vision_digital_ink.pw.p(pwVar2, iwVar2);
                                    ed1.T(iwVar2, pwVar2, nc1VarArr[f02[i21] / 2]);
                                } else if (b10 < 0) {
                                    com.google.android.gms.internal.mlkit_vision_digital_ink.pw.p(pwVar2, iwVar2);
                                    ed1.X(iwVar2, pwVar2, nc1VarArr[(-f02[i21]) / 2]);
                                }
                                byte b11 = f03[i21];
                                if (b11 > 0) {
                                    com.google.android.gms.internal.mlkit_vision_digital_ink.pw.p(pwVar2, iwVar2);
                                    ed1.T(iwVar2, pwVar2, oc1.e[f03[i21] / 2]);
                                } else if (b11 < 0) {
                                    com.google.android.gms.internal.mlkit_vision_digital_ink.pw.p(pwVar2, iwVar2);
                                    ed1.X(iwVar2, pwVar2, oc1.e[(-f03[i21]) / 2]);
                                }
                                i21--;
                            }
                            byte[] v2 = new hq0(iwVar2).v();
                            for (int i22 = 0; i22 < 32; i22++) {
                                if (v2[i22] == bArr[i22]) {
                                }
                            }
                            return;
                        }
                    } else {
                        i--;
                        bArr3 = bArr;
                    }
                }
            }
            androidx.datastore.preferences.protobuf.s1.q("Signature check failed.");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("The length of the signature is not 64.");
    }

    public ik1(z91 z91Var, byte[] bArr, byte[] bArr2) {
        this.f7161d = z91Var;
        this.f7159b = bArr;
        this.f7160c = bArr2;
    }
}
