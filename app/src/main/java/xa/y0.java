package xa;

import com.google.android.gms.internal.ads.ul1;

/* loaded from: classes.dex */
public final class y0 extends ul1 {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f30715z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(b1 b1Var, int i) {
        super(b1Var);
        this.f30715z = i;
    }

    @Override // com.google.android.gms.internal.ads.ul1, java.util.Iterator
    public Object next() {
        switch (this.f30715z) {
            case 1:
                return b().f30358z;
            default:
                return super.next();
        }
    }
}
