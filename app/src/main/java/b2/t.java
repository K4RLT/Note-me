package b2;

import com.google.android.gms.internal.ads.nc;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f1592a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1593b;

    public t(int i, int[] iArr) {
        int length = iArr.length;
        if (length == 4) {
            this.f1592a = i;
            this.f1593b = iArr;
            return;
        }
        StringBuilder sb2 = new StringBuilder(g3.a.d(length, 44));
        String a10 = nc.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k");
        String a11 = nc.a("a0CvvBEaN339T0zNlXk=");
        sb2.append(a10);
        sb2.append(length);
        sb2.append(a11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void a(int i) {
        int i10 = this.f1592a;
        int[] iArr = this.f1593b;
        if (i10 == iArr.length) {
            this.f1593b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f1593b;
        int i11 = this.f1592a;
        this.f1592a = i11 + 1;
        iArr2[i11] = i;
    }

    public int b() {
        if ((this.f1592a & 128) != 0) {
            return this.f1593b[7];
        }
        return 65535;
    }

    public int c(int i) {
        int i10 = this.f1592a - 1;
        if (i10 >= 0) {
            return this.f1593b[i10];
        }
        return i;
    }

    public int d() {
        int[] iArr = this.f1593b;
        int i = this.f1592a - 1;
        this.f1592a = i;
        return iArr[i];
    }

    public void e(int i) {
        int[] iArr = this.f1593b;
        if (this.f1592a >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f1593b = iArr;
        }
        int i10 = this.f1592a;
        this.f1592a = i10 + 1;
        iArr[i10] = i;
    }

    public void f(int i, int i10, int i11) {
        int i12 = this.f1592a;
        int[] iArr = this.f1593b;
        int i13 = i12 + 3;
        if (i13 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f1593b = iArr;
        }
        iArr[i12] = i + i11;
        iArr[i12 + 1] = i10 + i11;
        iArr[i12 + 2] = i11;
        this.f1592a = i13;
    }

    public void g(int i, int i10, int i11, int i12) {
        int i13 = this.f1592a;
        int[] iArr = this.f1593b;
        int i14 = i13 + 4;
        if (i14 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f1593b = iArr;
        }
        iArr[i13] = i;
        iArr[i13 + 1] = i10;
        iArr[i13 + 2] = i11;
        iArr[i13 + 3] = i12;
        this.f1592a = i14;
    }

    public void h(int i, int i10) {
        if (i < i10) {
            int i11 = i - 3;
            for (int i12 = i; i12 < i10; i12 += 3) {
                int[] iArr = this.f1593b;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    j(i11, i12);
                }
            }
            j(i11 + 3, i10);
            h(i, i11);
            h(i11 + 6, i10);
        }
    }

    public void i(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f1593b;
            if (i < iArr.length) {
                this.f1592a = (1 << i) | this.f1592a;
                iArr[i] = i10;
            }
        }
    }

    public void j(int i, int i10) {
        int[] iArr = this.f1593b;
        int i11 = iArr[i];
        iArr[i] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public void k(byte[] bArr, int i) {
        int i10 = 1777080124;
        int i11 = 1777080124;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c10 = 0;
        int i24 = 0;
        char c11 = 0;
        char c12 = 0;
        while (true) {
            if (i11 != 719824015) {
                if (i11 != 1519235462) {
                    if (i11 != i10) {
                        bArr[0] = (byte) (i14 >> i21);
                        bArr[1] = (byte) ((((i14 >> i22) & i23) << i21) >> i21);
                        bArr[c10] = (byte) ((((i14 >> i24) & i23) << i21) >> i21);
                        bArr[i18] = (byte) (((i14 & i23) << i21) >> i21);
                        bArr[i16] = (byte) (i15 >> i21);
                        bArr[i17] = (byte) ((((i15 >> i22) & i23) << i21) >> i21);
                        bArr[c11] = (byte) ((((i15 >> i24) & i23) << i21) >> i21);
                        bArr[c12] = (byte) (((i15 & i23) << i21) >> i21);
                        return;
                    }
                    i14 = this.f1592a;
                    i11 -= 1057256109;
                    i18 = 3;
                    i23 = 255;
                    c12 = 7;
                    c11 = 6;
                    c10 = 2;
                    i21 = 24;
                    i20 = 11;
                    i19 = 1340169305;
                    i17 = 5;
                    i16 = 4;
                    i13 = -64255200;
                    i22 = 16;
                    i24 = 8;
                    i15 = i;
                    i12 = 0;
                } else {
                    int[] iArr = this.f1593b;
                    i14 += (((i15 << i16) ^ (i15 >>> i17)) + i15) ^ (i12 + iArr[i12 & i18]);
                    i12 += i19;
                    i15 += (iArr[(i12 >>> i20) & i18] + i12) ^ (((i14 << i16) ^ (i14 >>> i17)) + i14);
                    i11 -= 799411447;
                }
            } else {
                int i25 = (-235787554) + i11;
                i11 += 799411447;
                if (i12 == i13) {
                    i11 = i25;
                }
            }
            i10 = 1777080124;
        }
    }

    public t(int i, byte b10) {
        switch (i) {
            case 3:
                this.f1593b = new int[10];
                return;
            default:
                this.f1593b = new int[10];
                return;
        }
    }

    public t(int i, int i10) {
        switch (i10) {
            case 4:
                this.f1593b = new int[2048];
                return;
            default:
                this.f1593b = new int[i];
                return;
        }
    }
}
