package r6;

import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: u, reason: collision with root package name */
    public final List f24579u;

    /* renamed from: w, reason: collision with root package name */
    public b7.a f24581w = null;

    /* renamed from: x, reason: collision with root package name */
    public float f24582x = -1.0f;

    /* renamed from: v, reason: collision with root package name */
    public b7.a f24580v = d(0.0f);

    public c(List list) {
        this.f24579u = list;
    }

    @Override // r6.b
    public final boolean a(float f10) {
        b7.a aVar = this.f24581w;
        b7.a aVar2 = this.f24580v;
        if (aVar == aVar2 && this.f24582x == f10) {
            return true;
        }
        this.f24581w = aVar2;
        this.f24582x = f10;
        return false;
    }

    @Override // r6.b
    public final b7.a b() {
        return this.f24580v;
    }

    @Override // r6.b
    public final boolean c(float f10) {
        b7.a aVar = this.f24580v;
        if (f10 >= aVar.b() && f10 < aVar.a()) {
            return !this.f24580v.c();
        }
        this.f24580v = d(f10);
        return true;
    }

    public final b7.a d(float f10) {
        List list = this.f24579u;
        b7.a aVar = (b7.a) list.get(list.size() - 1);
        if (f10 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            b7.a aVar2 = (b7.a) list.get(size);
            if (this.f24580v != aVar2 && f10 >= aVar2.b() && f10 < aVar2.a()) {
                return aVar2;
            }
        }
        return (b7.a) list.get(0);
    }

    @Override // r6.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // r6.b
    public final float j() {
        return ((b7.a) this.f24579u.get(r0.size() - 1)).a();
    }

    @Override // r6.b
    public final float k() {
        return ((b7.a) this.f24579u.get(0)).b();
    }
}
