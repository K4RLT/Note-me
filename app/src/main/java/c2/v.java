package c2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3661u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f3662v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(x xVar, int i) {
        super(0);
        this.f3661u = i;
        this.f3662v = xVar;
    }

    @Override // df.a
    public final Object invoke() {
        int actionMasked;
        n nVar;
        switch (this.f3661u) {
            case 0:
                x xVar = this.f3662v;
                MotionEvent motionEvent = xVar.M0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    xVar.N0 = SystemClock.uptimeMillis();
                    xVar.post(xVar.S0);
                }
                return pe.z.f22715a;
            default:
                nVar = this.f3662v.get_viewTreeOwners();
                return nVar;
        }
    }
}
