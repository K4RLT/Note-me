package p7;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22480u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e0 f22481v;

    public /* synthetic */ g0(e0 e0Var, int i) {
        this.f22480u = i;
        this.f22481v = e0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f22480u) {
            case 0:
                ((Context) obj).getClass();
                return this.f22481v.J;
            default:
                long j10 = ((y2.l) obj).f30813a;
                float f10 = (int) (j10 >> 32);
                float f11 = 1.0f;
                if (f10 < 1.0f) {
                    f10 = 1.0f;
                }
                e0 e0Var = this.f22481v;
                e0Var.f22469u = f10;
                float f12 = (int) (j10 & 4294967295L);
                if (f12 >= 1.0f) {
                    f11 = f12;
                }
                e0Var.f22470v = f11;
                return pe.z.f22715a;
        }
    }
}
