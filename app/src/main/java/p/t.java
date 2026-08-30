package p;
import d1.r;
import r0.m;
import r0.y;
import z0.c;

import ya.h9;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f22253u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f22254v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f22255w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f22256x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f22257y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f22258z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z3, r rVar, p0 p0Var, q0 q0Var, String str, c cVar, int i, int i10) {
        super(2);
        this.f22253u = z3;
        this.f22254v = rVar;
        this.f22255w = p0Var;
        this.f22256x = q0Var;
        this.f22257y = str;
        this.f22258z = cVar;
        this.A = i;
        this.B = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h9.c(this.f22253u, this.f22254v, this.f22255w, this.f22256x, this.f22257y, this.f22258z, (m) obj, y.L(this.A | 1), this.B);
        return pe.z.f22715a;
    }
}
