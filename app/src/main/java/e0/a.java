package e0;

import df.l;
import kotlin.jvm.internal.m;
import pe.z;

/* loaded from: classes.dex */
public final class a extends m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15863u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f15864v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f15865w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(l lVar, boolean z3, int i) {
        super(0);
        this.f15863u = i;
        this.f15864v = lVar;
        this.f15865w = z3;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f15863u) {
            case 0:
                this.f15864v.invoke(Boolean.valueOf(!this.f15865w));
                return z.f22715a;
            default:
                this.f15864v.invoke(Boolean.valueOf(!this.f15865w));
                return z.f22715a;
        }
    }
}
