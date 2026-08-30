package p4;

import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.f;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final int f22387u;

    /* renamed from: v, reason: collision with root package name */
    public final MotionEvent f22388v;

    public a(MotionEvent motionEvent) {
        this.f22388v = motionEvent;
        this.f22387u = motionEvent.getPointerCount();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this, 1);
    }
}
