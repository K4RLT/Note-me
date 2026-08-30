package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yb1 extends zb1 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb1(byte[] bArr, int i, int i10) {
        super(bArr, i);
        this.f12840w = i10;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final int[] f(int i, int[] iArr) {
        switch (this.f12840w) {
            case 0:
                int length = iArr.length;
                if (length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = (int[]) this.f13135v;
                    int[] iArr4 = xb1.f12545a;
                    int length2 = iArr4.length;
                    System.arraycopy(iArr4, 0, iArr2, 0, length2);
                    System.arraycopy(iArr3, 0, iArr2, length2, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, 3);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
            default:
                int length3 = iArr.length;
                if (length3 == 6) {
                    int[] iArr5 = new int[16];
                    int[] d2 = xb1.d((int[]) this.f13135v, iArr);
                    int[] iArr6 = xb1.f12545a;
                    int length4 = iArr6.length;
                    System.arraycopy(iArr6, 0, iArr5, 0, length4);
                    System.arraycopy(d2, 0, iArr5, length4, 8);
                    iArr5[12] = i;
                    iArr5[13] = 0;
                    iArr5[14] = iArr[4];
                    iArr5[15] = iArr[5];
                    return iArr5;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final int g() {
        switch (this.f12840w) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
