package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class oc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f9092a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f9093b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f9094c;

    /* renamed from: d, reason: collision with root package name */
    public static final mc1[][] f9095d;
    public static final mc1[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f9096f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f9097g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9098h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f9096f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f9097g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f9098h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        i0.m mVar = new i0.m(9);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        mVar.f18054v = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        mVar.f18055w = modPow2;
        f9092a = an1.M(b(mod));
        f9093b = an1.M(b(mod2));
        f9094c = an1.M(b(modPow));
        f9095d = (mc1[][]) Array.newInstance((Class<?>) mc1.class, 32, 8);
        i0.m mVar2 = mVar;
        for (int i = 0; i < 32; i++) {
            i0.m mVar3 = mVar2;
            for (int i10 = 0; i10 < 8; i10++) {
                f9095d[i][i10] = c(mVar3);
                mVar3 = a(mVar3, mVar2);
            }
            for (int i11 = 0; i11 < 8; i11++) {
                mVar2 = a(mVar2, mVar2);
            }
        }
        i0.m a10 = a(mVar, mVar);
        e = new mc1[8];
        for (int i12 = 0; i12 < 8; i12++) {
            e[i12] = c(mVar);
            mVar = a(mVar, a10);
        }
    }

    public static i0.m a(i0.m mVar, i0.m mVar2) {
        i0.m mVar3 = new i0.m(9);
        BigInteger multiply = f9097g.multiply(((BigInteger) mVar.f18055w).multiply((BigInteger) mVar2.f18055w).multiply((BigInteger) mVar.f18054v).multiply((BigInteger) mVar2.f18054v));
        BigInteger bigInteger = f9096f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) mVar.f18055w).multiply((BigInteger) mVar2.f18054v).add(((BigInteger) mVar2.f18055w).multiply((BigInteger) mVar.f18054v));
        BigInteger bigInteger2 = BigInteger.ONE;
        mVar3.f18055w = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        mVar3.f18054v = ((BigInteger) mVar.f18054v).multiply((BigInteger) mVar2.f18054v).add(((BigInteger) mVar.f18055w).multiply((BigInteger) mVar2.f18055w)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return mVar3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b10 = bArr[i];
            int i10 = 31 - i;
            bArr[i] = bArr[i10];
            bArr[i10] = b10;
        }
        return bArr;
    }

    public static mc1 c(i0.m mVar) {
        BigInteger add = ((BigInteger) mVar.f18054v).add((BigInteger) mVar.f18055w);
        BigInteger bigInteger = f9096f;
        return new mc1(an1.M(b(add.mod(bigInteger))), an1.M(b(((BigInteger) mVar.f18054v).subtract((BigInteger) mVar.f18055w).mod(bigInteger))), an1.M(b(f9098h.multiply((BigInteger) mVar.f18055w).multiply((BigInteger) mVar.f18054v).mod(bigInteger))));
    }
}
