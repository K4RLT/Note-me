package wd;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends ve.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c B;
    public int C;

    /* renamed from: u, reason: collision with root package name */
    public Map f29882u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f29883v;

    /* renamed from: w, reason: collision with root package name */
    public d f29884w;

    /* renamed from: x, reason: collision with root package name */
    public yf.c f29885x;

    /* renamed from: y, reason: collision with root package name */
    public Map f29886y;

    /* renamed from: z, reason: collision with root package name */
    public Object f29887z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ve.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(this);
    }
}
