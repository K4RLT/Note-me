package c4;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: u, reason: collision with root package name */
    public final int f3853u;

    /* renamed from: v, reason: collision with root package name */
    public int f3854v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f3855w = -1;

    public r(int i) {
        this.f3853u = i;
    }

    @Override // c4.q
    public final boolean e(CharSequence charSequence, int i, int i10, z zVar) {
        int i11 = this.f3853u;
        if (i <= i11 && i11 < i10) {
            this.f3854v = i;
            this.f3855w = i10;
            return false;
        }
        if (i10 > i11) {
            return false;
        }
        return true;
    }

    @Override // c4.q
    public final Object getResult() {
        return this;
    }
}
