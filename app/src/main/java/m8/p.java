package m8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f20737a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20738b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f20737a = bArr;
        this.f20738b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z3 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (z3) {
                bArr = pVar.f20737a;
            } else {
                bArr = pVar.f20737a;
            }
            if (Arrays.equals(this.f20737a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z3) {
                    bArr2 = pVar2.f20738b;
                } else {
                    bArr2 = pVar2.f20738b;
                }
                if (Arrays.equals(this.f20738b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f20737a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20738b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f20737a) + ", encryptedBlob=" + Arrays.toString(this.f20738b) + "}";
    }
}
