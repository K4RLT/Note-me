package wa;

import java.util.AbstractMap;
import ya.hd;

/* loaded from: classes.dex */
public final class ta extends qa {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ua f29823w;

    public ta(ua uaVar) {
        this.f29823w = uaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        ua uaVar = this.f29823w;
        hd.a(i, uaVar.f29833y);
        Object[] objArr = uaVar.f29832x;
        int i10 = i + i;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29823w.f29833y;
    }
}
