package e4;

import android.os.Handler;
import android.widget.EditText;
import c4.h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends h implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f15907u;

    public d(j.a aVar) {
        this.f15907u = new WeakReference(aVar);
    }

    @Override // c4.h
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f15907u.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a((EditText) this.f15907u.get(), 1);
    }
}
