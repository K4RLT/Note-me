package q;
import r0.i1;
import r0.y;

import r0.n2;

/* loaded from: classes.dex */
public final class e0 implements n2 {
    public boolean A;
    public long B;
    public final /* synthetic */ f0 C;

    /* renamed from: u, reason: collision with root package name */
    public Number f22881u;

    /* renamed from: v, reason: collision with root package name */
    public Number f22882v;

    /* renamed from: w, reason: collision with root package name */
    public final l1 f22883w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f22884x;

    /* renamed from: y, reason: collision with root package name */
    public a1 f22885y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22886z;

    public e0(f0 f0Var, Number number, Number number2, l1 l1Var, d0 d0Var) {
        this.C = f0Var;
        this.f22881u = number;
        this.f22882v = number2;
        this.f22883w = l1Var;
        this.f22884x = y.B(number);
        this.f22885y = new a1(d0Var, l1Var, this.f22881u, this.f22882v, null);
    }

    @Override // n2
    public final Object getValue() {
        return this.f22884x.getValue();
    }
}
