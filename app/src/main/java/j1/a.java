package j1;

import wa.q8;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f18758a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f18759b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f18760c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f18761d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f18758a = Math.max(f10, this.f18758a);
        this.f18759b = Math.max(f11, this.f18759b);
        this.f18760c = Math.min(f12, this.f18760c);
        this.f18761d = Math.min(f13, this.f18761d);
    }

    public final boolean b() {
        boolean z3;
        boolean z9 = false;
        if (this.f18758a >= this.f18760c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f18759b >= this.f18761d) {
            z9 = true;
        }
        return z3 | z9;
    }

    public final String toString() {
        return "MutableRect(" + q8.a(this.f18758a) + ", " + q8.a(this.f18759b) + ", " + q8.a(this.f18760c) + ", " + q8.a(this.f18761d) + ')';
    }
}
