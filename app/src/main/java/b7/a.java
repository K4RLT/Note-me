package b7;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import w6.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final o6.a f1793a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1794b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1795c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f1796d;
    public final Interpolator e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f1797f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1798g;

    /* renamed from: h, reason: collision with root package name */
    public Float f1799h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1800j;

    /* renamed from: k, reason: collision with root package name */
    public int f1801k;

    /* renamed from: l, reason: collision with root package name */
    public int f1802l;

    /* renamed from: m, reason: collision with root package name */
    public float f1803m;

    /* renamed from: n, reason: collision with root package name */
    public float f1804n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f1805o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f1806p;

    public a(Object obj) {
        this.i = -3987645.8f;
        this.f1800j = -3987645.8f;
        this.f1801k = 784923401;
        this.f1802l = 784923401;
        this.f1803m = Float.MIN_VALUE;
        this.f1804n = Float.MIN_VALUE;
        this.f1805o = null;
        this.f1806p = null;
        this.f1793a = null;
        this.f1794b = obj;
        this.f1795c = obj;
        this.f1796d = null;
        this.e = null;
        this.f1797f = null;
        this.f1798g = Float.MIN_VALUE;
        this.f1799h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        o6.a aVar = this.f1793a;
        if (aVar == null) {
            return 1.0f;
        }
        if (this.f1804n == Float.MIN_VALUE) {
            if (this.f1799h == null) {
                this.f1804n = 1.0f;
            } else {
                this.f1804n = ((this.f1799h.floatValue() - this.f1798g) / (aVar.f21794m - aVar.f21793l)) + b();
            }
        }
        return this.f1804n;
    }

    public final float b() {
        o6.a aVar = this.f1793a;
        if (aVar == null) {
            return 0.0f;
        }
        if (this.f1803m == Float.MIN_VALUE) {
            float f10 = aVar.f21793l;
            this.f1803m = (this.f1798g - f10) / (aVar.f21794m - f10);
        }
        return this.f1803m;
    }

    public final boolean c() {
        if (this.f1796d == null && this.e == null && this.f1797f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f1794b + ", endValue=" + this.f1795c + ", startFrame=" + this.f1798g + ", endFrame=" + this.f1799h + ", interpolator=" + this.f1796d + '}';
    }

    public a(o6.a aVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f10) {
        this.i = -3987645.8f;
        this.f1800j = -3987645.8f;
        this.f1801k = 784923401;
        this.f1802l = 784923401;
        this.f1803m = Float.MIN_VALUE;
        this.f1804n = Float.MIN_VALUE;
        this.f1805o = null;
        this.f1806p = null;
        this.f1793a = aVar;
        this.f1794b = obj;
        this.f1795c = obj2;
        this.f1796d = null;
        this.e = baseInterpolator;
        this.f1797f = baseInterpolator2;
        this.f1798g = f10;
        this.f1799h = null;
    }

    public a(o6.a aVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.i = -3987645.8f;
        this.f1800j = -3987645.8f;
        this.f1801k = 784923401;
        this.f1802l = 784923401;
        this.f1803m = Float.MIN_VALUE;
        this.f1804n = Float.MIN_VALUE;
        this.f1805o = null;
        this.f1806p = null;
        this.f1793a = aVar;
        this.f1794b = obj;
        this.f1795c = obj2;
        this.f1796d = interpolator;
        this.e = interpolator2;
        this.f1797f = interpolator3;
        this.f1798g = f10;
        this.f1799h = f11;
    }

    public a(o6.a aVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f10, Float f11) {
        this.i = -3987645.8f;
        this.f1800j = -3987645.8f;
        this.f1801k = 784923401;
        this.f1802l = 784923401;
        this.f1803m = Float.MIN_VALUE;
        this.f1804n = Float.MIN_VALUE;
        this.f1805o = null;
        this.f1806p = null;
        this.f1793a = aVar;
        this.f1794b = obj;
        this.f1795c = obj2;
        this.f1796d = baseInterpolator;
        this.e = null;
        this.f1797f = null;
        this.f1798g = f10;
        this.f1799h = f11;
    }

    public a(c cVar, c cVar2) {
        this.i = -3987645.8f;
        this.f1800j = -3987645.8f;
        this.f1801k = 784923401;
        this.f1802l = 784923401;
        this.f1803m = Float.MIN_VALUE;
        this.f1804n = Float.MIN_VALUE;
        this.f1805o = null;
        this.f1806p = null;
        this.f1793a = null;
        this.f1794b = cVar;
        this.f1795c = cVar2;
        this.f1796d = null;
        this.e = null;
        this.f1797f = null;
        this.f1798g = Float.MIN_VALUE;
        this.f1799h = Float.valueOf(Float.MAX_VALUE);
    }
}
