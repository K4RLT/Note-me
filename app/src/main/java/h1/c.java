package h1;

import b2.l0;
import df.l;
import kotlin.jvm.internal.m;
import pe.z;
import y2.j;

/* loaded from: classes.dex */
public final class c extends m implements l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17822u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f17823v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, l lVar) {
        super(1);
        this.f17822u = i;
        this.f17823v = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f17822u) {
            case 0:
                l0 l0Var = (l0) obj;
                this.f17823v.invoke(l0Var);
                l0Var.b();
                return z.f22715a;
            case 1:
                long j10 = ((y2.l) obj).f30813a;
                return new y2.l((((Number) this.f17823v.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue() << 32) | (4294967295L & ((int) (j10 & 4294967295L))));
            case 2:
                long j11 = ((y2.l) obj).f30813a;
                return new y2.l((((Number) this.f17823v.invoke(Integer.valueOf((int) (j11 >> 32)))).intValue() << 32) | (4294967295L & ((int) (j11 & 4294967295L))));
            case 3:
                return new j((((Number) this.f17823v.invoke(Integer.valueOf((int) (((y2.l) obj).f30813a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            case 4:
                return new j((0 << 32) | (4294967295L & ((Number) this.f17823v.invoke(Integer.valueOf((int) (((y2.l) obj).f30813a & 4294967295L)))).intValue()));
            case 5:
                return new j((((Number) this.f17823v.invoke(Integer.valueOf((int) (((y2.l) obj).f30813a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            default:
                return new j((0 << 32) | (4294967295L & ((Number) this.f17823v.invoke(Integer.valueOf((int) (((y2.l) obj).f30813a & 4294967295L)))).intValue()));
        }
    }
}
