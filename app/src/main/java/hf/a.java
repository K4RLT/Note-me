package hf;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends gf.a {
    @Override // gf.d
    public final int e(int i, int i10) {
        return ThreadLocalRandom.current().nextInt(i, i10);
    }

    @Override // gf.d
    public final long g() {
        return ThreadLocalRandom.current().nextLong(2500L);
    }

    @Override // gf.d
    public final long h() {
        return ThreadLocalRandom.current().nextLong(0L, 2500L);
    }

    @Override // gf.a
    public final Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
