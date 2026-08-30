package com.google.android.gms.internal.ads;
import bb.a;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class oy extends kw0 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f9263a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f9265c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f9267f;

    /* renamed from: g, reason: collision with root package name */
    public bb.a f9268g;

    /* renamed from: h, reason: collision with root package name */
    public py f9269h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f9266d = new float[9];
    public final float[] e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f9264b = new Object();

    public oy(Context context) {
        this.f9263a = (SensorManager) context.getSystemService("sensor");
        this.f9265c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.kw0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f9264b) {
                try {
                    if (this.f9267f == null) {
                        this.f9267f = new float[9];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            float[] fArr2 = this.f9266d;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            int rotation = this.f9265c.getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    float[] fArr3 = this.e;
                    if (rotation != 3) {
                        System.arraycopy(fArr2, 0, fArr3, 0, 9);
                    } else {
                        SensorManager.remapCoordinateSystem(fArr2, 130, 1, fArr3);
                    }
                } else {
                    SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.e);
                }
            } else {
                SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.e);
            }
            float[] fArr4 = this.e;
            float f10 = fArr4[1];
            fArr4[1] = fArr4[3];
            fArr4[3] = f10;
            float f11 = fArr4[2];
            fArr4[2] = fArr4[6];
            fArr4[6] = f11;
            float f12 = fArr4[5];
            fArr4[5] = fArr4[7];
            fArr4[7] = f12;
            synchronized (this.f9264b) {
                System.arraycopy(fArr4, 0, this.f9267f, 0, 9);
            }
            py pyVar = this.f9269h;
            if (pyVar != null) {
                Object obj = pyVar.O;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        }
    }

    public final void b() {
        if (this.f9268g == null) {
            return;
        }
        this.f9263a.unregisterListener(this);
        this.f9268g.post(new af(3));
        this.f9268g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f9264b) {
            try {
                float[] fArr2 = this.f9267f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
