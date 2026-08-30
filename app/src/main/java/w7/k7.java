package w7;
import r0.a1;
import r0.i0;
import r2.x;

/* loaded from: classes.dex */
public final class k7 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f28580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f28582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f28583d;

    public k7(a1 a1Var, String str, a1 a1Var2, a1 a1Var3) {
        this.f28580a = a1Var;
        this.f28581b = str;
        this.f28582c = a1Var2;
        this.f28583d = a1Var3;
    }

    @Override // i0
    public final void a() {
        if (!((Boolean) this.f28583d.getValue()).booleanValue()) {
            String obj = mf.f.I(((x) this.f28580a.getValue()).f24515a.f20477v).toString();
            if (obj.length() > 0 && !obj.equals(this.f28581b)) {
                ((df.l) this.f28582c.getValue()).invoke(obj);
            }
        }
    }
}
