package b8;
import r0.e1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public final class t implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x5 f2744a;

    public t(x5 x5Var) {
        this.f2744a = x5Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        float[] fArr = sensorEvent.values;
        if (fArr.length >= 3) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            x5 x5Var = this.f2744a;
            e1 e1Var = x5Var.f2975b;
            e1 e1Var2 = x5Var.f2974a;
            if (!x5Var.e) {
                float f13 = f12 * f12;
                float degrees = (float) Math.toDegrees(Math.atan2(f10, Math.sqrt((f11 * f11) + f13)));
                float degrees2 = (float) Math.toDegrees(Math.atan2(f11, Math.sqrt((f10 * f10) + f13)));
                if (Float.isNaN(x5Var.f2976c)) {
                    x5Var.f2976c = degrees;
                    x5Var.f2977d = degrees2;
                }
                float d2 = wa.b9.d((degrees - x5Var.f2976c) / 26.0f, -1.0f, 1.0f);
                float d10 = wa.b9.d((degrees2 - x5Var.f2977d) / 26.0f, -1.0f, 1.0f);
                float h3 = (((-d2) - e1Var2.h()) * 0.14f) + e1Var2.h();
                float h10 = ((d10 - e1Var.h()) * 0.14f) + e1Var.h();
                if (Math.abs(h3 - e1Var2.h()) > 0.0035f || Math.abs(h10 - e1Var.h()) > 0.0035f) {
                    e1Var2.i(h3);
                    x5Var.f2975b.i(h10);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
