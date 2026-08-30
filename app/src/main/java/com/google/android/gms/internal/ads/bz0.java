package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class bz0 {

    /* renamed from: a, reason: collision with root package name */
    public long f4912a;

    /* renamed from: b, reason: collision with root package name */
    public long f4913b;

    /* renamed from: c, reason: collision with root package name */
    public long f4914c;

    /* renamed from: d, reason: collision with root package name */
    public long f4915d;
    public double e;

    /* renamed from: f, reason: collision with root package name */
    public double f4916f;

    /* renamed from: g, reason: collision with root package name */
    public double f4917g;

    /* renamed from: h, reason: collision with root package name */
    public float f4918h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4919j;

    /* renamed from: k, reason: collision with root package name */
    public float f4920k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                    this.f4915d++;
                    return;
                }
                this.f4913b += motionEvent.getHistorySize() + 1;
                this.f4917g = Math.hypot(motionEvent.getRawX() - this.e, motionEvent.getRawY() - this.f4916f) + this.f4917g;
                this.e = motionEvent.getRawX();
                this.f4916f = motionEvent.getRawY();
                return;
            }
            this.f4914c++;
            this.f4917g = Math.hypot(motionEvent.getRawX() - this.e, motionEvent.getRawY() - this.f4916f) + this.f4917g;
            this.e = motionEvent.getRawX();
            this.f4916f = motionEvent.getRawY();
            return;
        }
        this.f4912a++;
        this.f4917g = 0.0d;
        this.e = motionEvent.getRawX();
        this.f4916f = motionEvent.getRawY();
        this.f4918h = motionEvent.getX();
        this.i = motionEvent.getY();
        this.f4919j = motionEvent.getRawX();
        this.f4920k = motionEvent.getRawY();
    }
}
