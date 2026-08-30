package com.google.android.gms.internal.ads;
import q.x;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class n21 {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f8526a;

    /* renamed from: b, reason: collision with root package name */
    public String f8527b;

    /* renamed from: c, reason: collision with root package name */
    public int f8528c;

    /* renamed from: d, reason: collision with root package name */
    public float f8529d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public String f8530f;

    /* renamed from: g, reason: collision with root package name */
    public byte f8531g;

    public final o21 a() {
        IBinder iBinder;
        if (this.f8531g == 63 && (iBinder = this.f8526a) != null) {
            return new o21(iBinder, this.f8527b, this.f8528c, this.f8529d, this.e, this.f8530f);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8526a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f8531g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f8531g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f8531g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f8531g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.f8531g & 16) == 0) {
            sb2.append(" theme");
        }
        if ((this.f8531g & 32) == 0) {
            sb2.append(" windowWidthPx");
        }
        q.x.o("Missing required properties:".concat(sb2.toString()));
        return null;
    }
}
