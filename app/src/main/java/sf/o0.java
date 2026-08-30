package sf;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o0 extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25220a = new AtomicReference(null);

    @Override // tf.d
    public final boolean a(tf.b bVar) {
        AtomicReference atomicReference = this.f25220a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(e0.f25166b);
        return true;
    }

    @Override // tf.d
    public final te.c[] b(tf.b bVar) {
        this.f25220a.set(null);
        return tf.c.f25715a;
    }
}
