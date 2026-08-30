package m7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends ve.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ j6.n B;
    public int C;

    /* renamed from: u, reason: collision with root package name */
    public String f20660u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f20661v;

    /* renamed from: w, reason: collision with root package name */
    public int f20662w;

    /* renamed from: x, reason: collision with root package name */
    public int f20663x;

    /* renamed from: y, reason: collision with root package name */
    public int f20664y;

    /* renamed from: z, reason: collision with root package name */
    public int f20665z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.B = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.m(0, null, this);
    }
}
