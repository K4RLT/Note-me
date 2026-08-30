package d;

import df.p;
import kotlin.jvm.internal.m;
import pe.z;
import r0.y;
import wa.z5;

/* loaded from: classes.dex */
public final class d extends m implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f15640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f15641v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f15642w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f15643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z3, df.a aVar, int i, int i10) {
        super(2);
        this.f15640u = z3;
        this.f15641v = aVar;
        this.f15642w = i;
        this.f15643x = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int L = y.L(this.f15642w | 1);
        int i = this.f15643x;
        z5.a(this.f15640u, this.f15641v, (r0.m) obj, L, i);
        return z.f22715a;
    }
}
