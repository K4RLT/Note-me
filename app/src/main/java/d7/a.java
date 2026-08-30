package d7;

import com.daren.scraply.MainActivity;
import e7.g;
import e7.o;
import pe.z;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15762u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15763v;

    public /* synthetic */ a(MainActivity mainActivity, int i) {
        this.f15762u = i;
        this.f15763v = mainActivity;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f15762u) {
            case 0:
                MainActivity mainActivity = this.f15763v;
                int i = MainActivity.P;
                o oVar = o.f15975a;
                o.e = mainActivity.getApplicationContext();
                if (!o.f15976b && o.b()) {
                    o.f15976b = true;
                    Thread thread = new Thread(new g(mainActivity.getApplicationContext(), 0));
                    thread.setName("admob-init");
                    thread.setDaemon(true);
                    thread.start();
                }
                return z.f22715a;
            default:
                this.f15763v.O = true;
                return z.f22715a;
        }
    }
}
