package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class ef0 extends kw0 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f5675a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f5676b;

    /* renamed from: c, reason: collision with root package name */
    public float f5677c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f5678d = Float.valueOf(0.0f);
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public int f5679f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5680g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5681h;
    public nf0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5682j;

    public ef0(Context context) {
        k.C.f16819k.getClass();
        this.e = System.currentTimeMillis();
        this.f5679f = 0;
        this.f5680g = false;
        this.f5681h = false;
        this.i = null;
        this.f5682j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f5675a = sensorManager;
        if (sensorManager != null) {
            this.f5676b = sensorManager.getDefaultSensor(4);
        } else {
            this.f5676b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.kw0
    public final void a(SensorEvent sensorEvent) {
        nl nlVar = sl.f10955ta;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            k.C.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.e + ((Integer) qlVar2.a(sl.f10985va)).intValue() < currentTimeMillis) {
                this.f5679f = 0;
                this.e = currentTimeMillis;
                this.f5680g = false;
                this.f5681h = false;
                this.f5677c = this.f5678d.floatValue();
            }
            float floatValue = this.f5678d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f5678d = Float.valueOf(floatValue);
            float f10 = this.f5677c;
            nl nlVar2 = sl.f10970ua;
            float floatValue2 = ((Float) qlVar2.a(nlVar2)).floatValue() + f10;
            Float f11 = this.f5678d;
            if (floatValue > floatValue2) {
                this.f5677c = f11.floatValue();
                this.f5681h = true;
            } else if (f11.floatValue() < this.f5677c - ((Float) qlVar2.a(nlVar2)).floatValue()) {
                this.f5677c = this.f5678d.floatValue();
                this.f5680g = true;
            }
            if (this.f5678d.isInfinite()) {
                this.f5678d = Float.valueOf(0.0f);
                this.f5677c = 0.0f;
            }
            if (this.f5680g && this.f5681h) {
                a0.k("Flick detected.");
                this.e = currentTimeMillis;
                int i = this.f5679f + 1;
                this.f5679f = i;
                this.f5680g = false;
                this.f5681h = false;
                nf0 nf0Var = this.i;
                if (nf0Var != null && i == ((Integer) qlVar2.a(sl.f11001wa)).intValue()) {
                    nf0Var.e(new lf0(1), mf0.f8341w);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (!((Boolean) r.e.f17698c.a(sl.f10955ta)).booleanValue()) {
                    return;
                }
                if (!this.f5682j && (sensorManager = this.f5675a) != null && (sensor = this.f5676b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f5682j = true;
                    a0.k("Listening for flick gestures.");
                }
                if (this.f5675a != null && this.f5676b != null) {
                    return;
                }
                int i = a0.f19634b;
                i.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
