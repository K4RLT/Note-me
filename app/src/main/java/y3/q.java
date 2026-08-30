package y3;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends ve.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ z B;
    public int C;

    /* renamed from: u, reason: collision with root package name */
    public z f30852u;

    /* renamed from: v, reason: collision with root package name */
    public Object f30853v;

    /* renamed from: w, reason: collision with root package name */
    public Serializable f30854w;

    /* renamed from: x, reason: collision with root package name */
    public Object f30855x;

    /* renamed from: y, reason: collision with root package name */
    public s f30856y;

    /* renamed from: z, reason: collision with root package name */
    public Iterator f30857z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, ve.c cVar) {
        super(cVar);
        this.B = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.d(this);
    }
}
