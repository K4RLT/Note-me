package t;
import b0.x;
import r0.m;
import z0.c;

/* loaded from: classes.dex */
public final /* synthetic */ class n1 extends kotlin.jvm.internal.a implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25479u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i, i10, cls, obj, str, str2);
        this.f25479u = i11;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25479u) {
            case 0:
                long j10 = ((y2.q) obj).f30822a;
                r1 r1Var = (r1) this.receiver;
                pf.x(r1Var.U.c(), null, new o1(r1Var, j10, null, 2), 3);
                return pe.z.f22715a;
            default:
                int intValue = ((Number) obj2).intValue();
                ((c) this.receiver).e(intValue, (m) obj);
                return pe.z.f22715a;
        }
    }
}
