package ea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import fa.y;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: u, reason: collision with root package name */
    public final x f16012u;

    public e(x xVar) {
        this.f16012u = xVar;
    }

    public final Activity a() {
        Activity activity = this.f16012u.getActivity();
        y.h(activity);
        return activity;
    }

    public abstract void g();

    public void d() {
    }

    public void f() {
    }

    public void c(Bundle bundle) {
    }

    public void e(Bundle bundle) {
    }

    public void b(int i, int i10, Intent intent) {
    }
}
