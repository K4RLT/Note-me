package xa;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends i {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f30493w;

    public p(q qVar) {
        this.f30493w = qVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        q qVar = this.f30493w;
        u0.h(i, qVar.f30503z);
        Object[] objArr = qVar.f30502y;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30493w.f30503z;
    }
}
