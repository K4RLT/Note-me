package p4;

import android.content.Context;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class b implements n4.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f22389a;

    /* renamed from: b, reason: collision with root package name */
    public final o4.b f22390b;

    public b(Context context, int i) {
        this.f22390b = new o4.b(context);
        this.f22389a = new c(i);
    }

    @Override // n4.a
    public final void b(MotionEvent motionEvent) {
        o4.b bVar = this.f22390b;
        bVar.getClass();
        bVar.f21772a = motionEvent.getEventTime();
        this.f22389a.a(motionEvent);
    }

    @Override // n4.a
    public final MotionEvent c() {
        return this.f22389a.b(this.f22390b.a());
    }
}
