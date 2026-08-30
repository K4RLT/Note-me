package r6;

import android.graphics.Color;
import android.graphics.Matrix;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final x6.b f24592a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f24593b;

    /* renamed from: c, reason: collision with root package name */
    public final f f24594c;

    /* renamed from: d, reason: collision with root package name */
    public final f f24595d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final f f24596f;

    /* renamed from: g, reason: collision with root package name */
    public final f f24597g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f24598h;

    public g(x6.b bVar, x6.b bVar2, u0 u0Var) {
        this.f24593b = bVar;
        this.f24592a = bVar2;
        e b10 = ((v6.a) u0Var.f15036v).b();
        this.f24594c = (f) b10;
        b10.a(this);
        bVar2.e(b10);
        f b11 = ((v6.b) u0Var.f15037w).b();
        this.f24595d = b11;
        b11.a(this);
        bVar2.e(b11);
        f b12 = ((v6.b) u0Var.f15038x).b();
        this.e = b12;
        b12.a(this);
        bVar2.e(b12);
        f b13 = ((v6.b) u0Var.f15039y).b();
        this.f24596f = b13;
        b13.a(this);
        bVar2.e(b13);
        f b14 = ((v6.b) u0Var.f15040z).b();
        this.f24597g = b14;
        b14.a(this);
        bVar2.e(b14);
    }

    @Override // r6.a
    public final void a() {
        this.f24593b.a();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [a7.b, java.lang.Object] */
    public final a7.b b(Matrix matrix, int i) {
        float i10 = this.e.i() * 0.017453292f;
        float floatValue = ((Float) this.f24596f.d()).floatValue();
        double d2 = i10;
        float sin = ((float) Math.sin(d2)) * floatValue;
        float cos = ((float) Math.cos(d2 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f24597g.d()).floatValue();
        int intValue = ((Integer) this.f24594c.d()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f24595d.d()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        Object obj = new Object();
        obj.f299a = floatValue2 * 0.33f;
        obj.f300b = sin;
        obj.f301c = cos;
        obj.f302d = argb;
        obj.e = null;
        obj.c(matrix);
        if (this.f24598h == null) {
            this.f24598h = new Matrix();
        }
        this.f24592a.f30111w.d().invert(this.f24598h);
        obj.c(this.f24598h);
        return obj;
    }
}