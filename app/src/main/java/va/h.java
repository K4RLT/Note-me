package va;

import java.util.AbstractMap;
import java.util.Objects;
import ya.xc;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f27485w;

    public h(i iVar) {
        this.f27485w = iVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        i iVar = this.f27485w;
        xc.a(i, iVar.f27488y);
        Object[] objArr = iVar.f27487x;
        int i10 = i + i;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27485w.f27488y;
    }
}
