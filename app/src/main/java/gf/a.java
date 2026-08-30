package gf;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends d {
    @Override // gf.d
    public final int a(int i) {
        return ((-i) >> 31) & (i().nextInt() >>> (32 - i));
    }

    @Override // gf.d
    public final float b() {
        return i().nextFloat();
    }

    @Override // gf.d
    public final int c() {
        return i().nextInt();
    }

    @Override // gf.d
    public final int d(int i) {
        return i().nextInt(i);
    }

    @Override // gf.d
    public final long f() {
        return i().nextLong();
    }

    public abstract Random i();
}
