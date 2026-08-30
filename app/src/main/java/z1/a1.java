package z1;
import l.c;

import wa.b9;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: u, reason: collision with root package name */
    public int f31769u;

    /* renamed from: v, reason: collision with root package name */
    public int f31770v;

    /* renamed from: w, reason: collision with root package name */
    public long f31771w;

    /* renamed from: x, reason: collision with root package name */
    public long f31772x = c1.f31788a;

    /* renamed from: y, reason: collision with root package name */
    public long f31773y = 0;

    public a1() {
        long j10 = 0;
        this.f31771w = (j10 & 4294967295L) | (j10 << 32);
    }

    public final void A0(long j10) {
        if (!y2.a.b(this.f31772x, j10)) {
            this.f31772x = j10;
            h0();
        }
    }

    public Object H() {
        return null;
    }

    public int e0() {
        return (int) (this.f31771w & 4294967295L);
    }

    public int f0() {
        return (int) (this.f31771w >> 32);
    }

    public final void h0() {
        this.f31769u = b9.e((int) (this.f31771w >> 32), y2.a.j(this.f31772x), y2.a.h(this.f31772x));
        this.f31770v = b9.e((int) (this.f31771w & 4294967295L), y2.a.i(this.f31772x), y2.a.g(this.f31772x));
        int i = this.f31769u;
        long j10 = this.f31771w;
        this.f31773y = (((i - ((int) (j10 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j10 & 4294967295L))) / 2));
    }

    public abstract void r0(long j10, float f10, df.l lVar);

    public final void x0(long j10) {
        if (!y2.c(this.f31771w, j10)) {
            this.f31771w = j10;
            h0();
        }
    }
}
