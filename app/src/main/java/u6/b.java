package u6;
import d.b;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f25859a;

    /* renamed from: b, reason: collision with root package name */
    public String f25860b;

    /* renamed from: c, reason: collision with root package name */
    public float f25861c;

    /* renamed from: d, reason: collision with root package name */
    public int f25862d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public float f25863f;

    /* renamed from: g, reason: collision with root package name */
    public float f25864g;

    /* renamed from: h, reason: collision with root package name */
    public int f25865h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f25866j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25867k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f25868l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f25869m;

    public final int hashCode() {
        int b10 = ((q0.d.b(this.f25862d) + (((int) (g3.a.e(this.f25860b, this.f25859a.hashCode() * 31, 31) + this.f25861c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f25863f);
        return (((b10 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f25865h;
    }
}
