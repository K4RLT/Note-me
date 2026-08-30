package ya;
import oe.a;

import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f31378w;

    public n(o oVar) {
        this.f31378w = oVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        o oVar = this.f31378w;
        a(i, oVar.f31402y);
        Object[] objArr = oVar.f31401x;
        int i10 = i + i;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31378w.f31402y;
    }
}
