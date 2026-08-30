package w7;
import r0.e1;
import y2.l;
import z1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29213u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e1 f29214v;

    public /* synthetic */ u5(e1 e1Var, int i) {
        this.f29213u = i;
        this.f29214v = e1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f29213u) {
            case 0:
                x xVar = (x) obj;
                xVar.getClass();
                this.f29214v.i(Float.intBitsToFloat((int) (xVar.f(0L) & 4294967295L)));
                break;
            default:
                float f10 = (int) (((l) obj).f30813a >> 32);
                if (f10 < 1.0f) {
                    f10 = 1.0f;
                }
                this.f29214v.i(f10);
                break;
        }
        return pe.z.f22715a;
    }
}
