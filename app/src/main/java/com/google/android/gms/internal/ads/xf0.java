package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class xf0 extends kw0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12563a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f12564b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f12565c;

    /* renamed from: d, reason: collision with root package name */
    public long f12566d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public nf0 f12567f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12568g;

    public xf0(Context context) {
        this.f12563a = context;
    }

    @Override // com.google.android.gms.internal.ads.kw0
    public final void a(SensorEvent sensorEvent) {
        nl nlVar = sl.f10875oa;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) >= ((Float) qlVar2.a(sl.f10892pa)).floatValue()) {
                f9.k.C.f16819k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f12566d + ((Integer) qlVar2.a(sl.f10909qa)).intValue() <= currentTimeMillis) {
                    if (this.f12566d + ((Integer) qlVar2.a(sl.f10925ra)).intValue() < currentTimeMillis) {
                        this.e = 0;
                    }
                    k9.a0.k("Shake detected.");
                    this.f12566d = currentTimeMillis;
                    int i = this.e + 1;
                    this.e = i;
                    nf0 nf0Var = this.f12567f;
                    if (nf0Var != null && i == ((Integer) qlVar2.a(sl.f10941sa)).intValue()) {
                        nf0Var.e(new lf0(0), mf0.f8341w);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (!((Boolean) g9.r.e.f17698c.a(sl.f10875oa)).booleanValue()) {
                    return;
                }
                if (this.f12564b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f12563a.getSystemService("sensor");
                    this.f12564b = sensorManager2;
                    if (sensorManager2 == null) {
                        int i = k9.a0.f19634b;
                        l9.i.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f12565c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f12568g && (sensorManager = this.f12564b) != null && (sensor = this.f12565c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    f9.k.C.f16819k.getClass();
                    this.f12566d = System.currentTimeMillis() - ((Integer) r1.f17698c.a(sl.f10909qa)).intValue();
                    this.f12568g = true;
                    k9.a0.k("Listening for shake gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
