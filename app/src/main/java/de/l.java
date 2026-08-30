package de;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes.dex */
public final class l extends PhantomReference {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15852a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.o f15853b;

    public /* synthetic */ l(a aVar, ReferenceQueue referenceQueue, Set set, c4.o oVar) {
        super(aVar, referenceQueue);
        this.f15852a = set;
        this.f15853b = oVar;
    }
}
