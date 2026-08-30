package g0;
import k0.a1;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17273u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f17274v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a1 a1Var, int i) {
        super(0);
        this.f17273u = i;
        this.f17274v = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f17273u) {
            case 0:
                AtomicLong atomicLong = this.f17274v.f19220d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = this.f17274v.f19220d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
