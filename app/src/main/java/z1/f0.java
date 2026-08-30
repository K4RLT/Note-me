package z1;
import n.i0;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f31811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f31812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31813d;
    public final /* synthetic */ q0 e;

    public /* synthetic */ f0(q0 q0Var, j0 j0Var, int i, q0 q0Var2, int i10) {
        this.f31810a = i10;
        this.f31812c = j0Var;
        this.f31813d = i;
        this.e = q0Var2;
        this.f31811b = q0Var;
    }

    @Override // z1.q0
    public final void a() {
        switch (this.f31810a) {
            case 0:
                int i = this.f31813d;
                j0 j0Var = this.f31812c;
                j0Var.f31832y = i;
                this.e.a();
                i0 i0Var = j0Var.F;
                long[] jArr = i0Var.f20892a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = i0Var.f20893b[i13];
                                    i1 i1Var = (i1) i0Var.f20894c[i13];
                                    int l10 = j0Var.G.l(obj);
                                    if (l10 < 0 || l10 >= j0Var.f31832y) {
                                        i1Var.a();
                                        i0Var.l(i13);
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                int i14 = this.f31813d;
                j0 j0Var2 = this.f31812c;
                j0Var2.f31831x = i14;
                this.e.a();
                j0Var2.c(j0Var2.f31831x);
                return;
        }
    }

    @Override // z1.q0
    public final Map b() {
        switch (this.f31810a) {
            case 0:
                return this.f31811b.b();
            default:
                return this.f31811b.b();
        }
    }

    @Override // z1.q0
    public final df.l c() {
        switch (this.f31810a) {
            case 0:
                return this.f31811b.c();
            default:
                return this.f31811b.c();
        }
    }

    @Override // z1.q0
    public final int getHeight() {
        switch (this.f31810a) {
            case 0:
                return this.f31811b.getHeight();
            default:
                return this.f31811b.getHeight();
        }
    }

    @Override // z1.q0
    public final int getWidth() {
        switch (this.f31810a) {
            case 0:
                return this.f31811b.getWidth();
            default:
                return this.f31811b.getWidth();
        }
    }
}
