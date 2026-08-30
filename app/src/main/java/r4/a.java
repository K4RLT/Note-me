package r4;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.MotionPredictor;
import i0.j;
import java.util.concurrent.TimeUnit;
import o4.b;
import p4.c;

/* loaded from: classes.dex */
public final class a implements n4.a {

    /* renamed from: b, reason: collision with root package name */
    public final MotionPredictor f24542b;

    /* renamed from: c, reason: collision with root package name */
    public final b f24543c;

    /* renamed from: g, reason: collision with root package name */
    public final int f24546g;

    /* renamed from: a, reason: collision with root package name */
    public c f24541a = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24544d = true;
    public int e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f24545f = -2;

    public a(Context context, int i) {
        this.f24543c = new b(context);
        this.f24542b = j.j(context);
        this.f24546g = i;
    }

    @Override // n4.a
    public final void b(MotionEvent motionEvent) {
        boolean isPredictionAvailable;
        b bVar = this.f24543c;
        bVar.getClass();
        bVar.f21772a = motionEvent.getEventTime();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.e != source || this.f24545f != deviceId) {
            isPredictionAvailable = this.f24542b.isPredictionAvailable(deviceId, source);
            this.f24544d = isPredictionAvailable;
            this.f24545f = deviceId;
            this.e = source;
        }
        if (this.f24544d) {
            this.f24542b.record(motionEvent);
            return;
        }
        if (this.f24541a == null) {
            this.f24541a = new c(this.f24546g);
        }
        this.f24541a.a(motionEvent);
    }

    @Override // n4.a
    public final MotionEvent c() {
        MotionEvent predict;
        int a10 = this.f24543c.a();
        if (this.f24544d) {
            predict = this.f24542b.predict(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis() + a10));
            return predict;
        }
        if (this.f24541a == null) {
            this.f24541a = new c(this.f24546g);
        }
        return this.f24541a.b(a10);
    }
}
