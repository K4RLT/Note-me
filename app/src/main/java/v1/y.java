package v1;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27370u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f27371v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i) {
        super(1);
        this.f27370u = i;
        this.f27371v = zVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f27370u) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                df.l lVar = this.f27371v.f27372a;
                if (lVar != null) {
                    lVar.invoke(motionEvent);
                    return pe.z.f22715a;
                }
                kotlin.jvm.internal.l.h("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                df.l lVar2 = this.f27371v.f27372a;
                if (lVar2 != null) {
                    lVar2.invoke(motionEvent2);
                    return pe.z.f22715a;
                }
                kotlin.jvm.internal.l.h("onTouchEvent");
                throw null;
        }
    }
}
