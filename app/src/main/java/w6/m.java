package w6;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27756a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27758c;

    public m(String str, List list, boolean z3) {
        this.f27756a = str;
        this.f27757b = list;
        this.f27758c = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new q6.d(jVar, bVar, this, aVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f27756a + "' Shapes: " + Arrays.toString(this.f27757b.toArray()) + '}';
    }
}
