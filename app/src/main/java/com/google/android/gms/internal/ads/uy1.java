package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class uy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f11755a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11756b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11757c;

    public uy1(int[] iArr, Random random) {
        this.f11756b = iArr;
        this.f11755a = random;
        this.f11757c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f11757c[iArr[i]] = i;
        }
    }

    public final uy1 a(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i10 = 0;
        while (true) {
            iArr = this.f11756b;
            random = this.f11755a;
            if (i10 >= i) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int nextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[nextInt];
            iArr3[nextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i; i14++) {
            if (i12 < i && i13 == iArr2[i12]) {
                iArr4[i14] = iArr3[i12];
                i12++;
            } else {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i;
                }
                i13 = i15;
            }
        }
        return new uy1(iArr4, new Random(random.nextLong()));
    }

    public uy1(Random random) {
        this(new int[0], random);
    }

    public uy1() {
        this(new Random());
    }
}
