package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f16541a;

    /* renamed from: b, reason: collision with root package name */
    public int f16542b;

    @Override // eg.s0
    public final Object a() {
        return new pe.y(Arrays.copyOf(this.f16541a, this.f16542b));
    }

    @Override // eg.s0
    public final void b(int i) {
        short[] sArr = this.f16541a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16541a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16542b;
    }
}
