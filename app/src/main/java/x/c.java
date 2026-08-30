package x;
import x.f;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29947a = 1;

    @Override // f
    public final void b(y2.c cVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f29947a) {
            case 0:
                h.e(i, iArr, iArr2, false);
                return;
            default:
                h.d(iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.f29947a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
