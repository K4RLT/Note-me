package r6;

import java.util.List;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: u, reason: collision with root package name */
    public final b7.a f24583u;

    /* renamed from: v, reason: collision with root package name */
    public float f24584v = -1.0f;

    public d(List list) {
        this.f24583u = (b7.a) list.get(0);
    }

    @Override // r6.b
    public final boolean a(float f10) {
        if (this.f24584v == f10) {
            return true;
        }
        this.f24584v = f10;
        return false;
    }

    @Override // r6.b
    public final b7.a b() {
        return this.f24583u;
    }

    @Override // r6.b
    public final boolean c(float f10) {
        return !this.f24583u.c();
    }

    @Override // r6.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // r6.b
    public final float j() {
        return this.f24583u.a();
    }

    @Override // r6.b
    public final float k() {
        return this.f24583u.b();
    }
}
