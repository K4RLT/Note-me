package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16499a;

    /* renamed from: b, reason: collision with root package name */
    public int f16500b;

    @Override // eg.s0
    public final Object a() {
        return new pe.r(Arrays.copyOf(this.f16499a, this.f16500b));
    }

    @Override // eg.s0
    public final void b(int i) {
        byte[] bArr = this.f16499a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16499a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16500b;
    }
}
