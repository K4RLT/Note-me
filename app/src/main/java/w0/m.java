package w0;

import n.s;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f27686x;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f27686x) {
            case 0:
                int i = this.f27685w;
                this.f27685w = i + 2;
                Object[] objArr = this.f27683u;
                return new s(objArr[i], 1, objArr[i + 1]);
            case 1:
                int i10 = this.f27685w;
                this.f27685w = i10 + 2;
                return this.f27683u[i10];
            default:
                int i11 = this.f27685w;
                this.f27685w = i11 + 2;
                return this.f27683u[i11 + 1];
        }
    }
}
