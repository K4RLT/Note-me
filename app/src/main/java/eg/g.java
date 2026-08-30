package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16516a;

    /* renamed from: b, reason: collision with root package name */
    public int f16517b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16516a, this.f16517b);
    }

    @Override // eg.s0
    public final void b(int i) {
        byte[] bArr = this.f16516a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16516a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16517b;
    }
}
