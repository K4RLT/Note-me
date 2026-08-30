package b8;

import com.android.billingclient.api.Purchase;

/* loaded from: classes.dex */
public final class q7 extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public Purchase f2594u;

    /* renamed from: v, reason: collision with root package name */
    public String f2595v;

    /* renamed from: w, reason: collision with root package name */
    public String f2596w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2597x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2598y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s7 f2599z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(s7 s7Var, ve.c cVar) {
        super(cVar);
        this.f2599z = s7Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f2598y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f2599z.f(null, this);
    }
}
