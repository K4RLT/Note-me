package q1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements v6.e {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f23260u;

    public f() {
        this.f23260u = new ArrayList(32);
    }

    public void a() {
        this.f23260u.add(i.f23278b);
    }

    @Override // v6.e
    public r6.e b() {
        ArrayList arrayList = this.f23260u;
        if (((b7.a) arrayList.get(0)).c()) {
            return new r6.h(1, arrayList);
        }
        return new r6.k(arrayList);
    }

    @Override // v6.e
    public List c() {
        return this.f23260u;
    }

    @Override // v6.e
    public boolean d() {
        ArrayList arrayList = this.f23260u;
        if (arrayList.size() != 1 || !((b7.a) arrayList.get(0)).c()) {
            return false;
        }
        return true;
    }

    public void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f23260u.add(new j(f10, f11, f12, f13, f14, f15));
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f23260u.add(new o(f10, f11, f12, f13, f14, f15));
    }

    public void g(float f10) {
        this.f23260u.add(new k(f10));
    }

    public void h(float f10) {
        this.f23260u.add(new p(f10));
    }

    public void i(float f10, float f11) {
        this.f23260u.add(new l(f10, f11));
    }

    public void j(float f10, float f11) {
        this.f23260u.add(new q(f10, f11));
    }

    public void k(float f10, float f11) {
        this.f23260u.add(new m(f10, f11));
    }

    public void l(float f10, float f11, float f12, float f13) {
        this.f23260u.add(new n(f10, f11, f12, f13));
    }

    public void m(float f10, float f11, float f12, float f13) {
        this.f23260u.add(new r(f10, f11, f12, f13));
    }

    public void n(float f10) {
        this.f23260u.add(new t(f10));
    }

    public void o(float f10) {
        this.f23260u.add(new s(f10));
    }

    public f(ArrayList arrayList) {
        this.f23260u = arrayList;
    }
}
