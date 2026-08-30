package c;
import l.a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3218u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f3219v;

    public /* synthetic */ d(o oVar, int i) {
        this.f3218u = i;
        this.f3219v = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3218u) {
            case 0:
                this.f3219v.invalidateOptionsMenu();
                return;
            default:
                try {
                    o.e(this.f3219v);
                    return;
                } catch (IllegalStateException e) {
                    if (kotlin.jvm.internal.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e;
                    }
                } catch (NullPointerException e8) {
                    if (!kotlin.jvm.internal.a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e8;
                    }
                    return;
                }
        }
    }
}
