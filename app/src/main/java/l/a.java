package l;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f19789y = new HashMap();

    @Override // l.f
    public final c a(Object obj) {
        return (c) this.f19789y.get(obj);
    }

    @Override // l.f
    public final Object b(Object obj) {
        Object b10 = super.b(obj);
        this.f19789y.remove(obj);
        return b10;
    }
}
