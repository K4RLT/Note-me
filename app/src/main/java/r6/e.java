package r6;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final b f24587c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24585a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f24586b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f24588d = 0.0f;
    public Object e = null;

    /* renamed from: f, reason: collision with root package name */
    public float f24589f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f24590g = -1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(List list) {
        b cVar;
        b bVar;
        if (list.isEmpty()) {
            bVar = new Object();
        } else {
            if (list.size() == 1) {
                cVar = new d(list);
            } else {
                cVar = new c(list);
            }
            bVar = cVar;
        }
        this.f24587c = bVar;
    }

    public final void a(a aVar) {
        this.f24585a.add(aVar);
    }

    public final float b() {
        Interpolator interpolator;
        b7.a b10 = this.f24587c.b();
        if (b10 != null && !b10.c() && (interpolator = b10.f1796d) != null) {
            return interpolator.getInterpolation(c());
        }
        return 0.0f;
    }

    public final float c() {
        if (!this.f24586b) {
            b7.a b10 = this.f24587c.b();
            if (b10.c()) {
                return 0.0f;
            }
            return (this.f24588d - b10.b()) / (b10.a() - b10.b());
        }
        return 0.0f;
    }

    public Object d() {
        Object e;
        float c10 = c();
        b bVar = this.f24587c;
        if (bVar.a(c10) && !h()) {
            return this.e;
        }
        b7.a b10 = bVar.b();
        Interpolator interpolator = b10.e;
        Interpolator interpolator2 = b10.f1797f;
        if (interpolator != null && interpolator2 != null) {
            e = f(b10, c10, interpolator.getInterpolation(c10), interpolator2.getInterpolation(c10));
        } else {
            e = e(b10, b());
        }
        this.e = e;
        return e;
    }

    public abstract Object e(b7.a aVar, float f10);

    public Object f(b7.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void g(float f10) {
        b bVar = this.f24587c;
        if (!bVar.isEmpty()) {
            if (this.f24589f == -1.0f) {
                this.f24589f = bVar.k();
            }
            float f11 = this.f24589f;
            if (f10 < f11) {
                if (f11 == -1.0f) {
                    this.f24589f = bVar.k();
                }
                f10 = this.f24589f;
            } else {
                if (this.f24590g == -1.0f) {
                    this.f24590g = bVar.j();
                }
                float f12 = this.f24590g;
                if (f10 > f12) {
                    if (f12 == -1.0f) {
                        this.f24590g = bVar.j();
                    }
                    f10 = this.f24590g;
                }
            }
            if (f10 != this.f24588d) {
                this.f24588d = f10;
                if (bVar.c(f10)) {
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f24585a;
                        if (i < arrayList.size()) {
                            ((a) arrayList.get(i)).a();
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean h() {
        return false;
    }
}
