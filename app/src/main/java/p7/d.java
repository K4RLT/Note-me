package p7;

import android.graphics.Typeface;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class d extends ya.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f22442b;

    public d(String str, CountDownLatch countDownLatch) {
        this.f22441a = str;
        this.f22442b = countDownLatch;
    }

    @Override // ya.o0
    public final void a(int i) {
        e.i.put(this.f22441a, Integer.valueOf(i));
        this.f22442b.countDown();
    }

    @Override // ya.o0
    public final void b(Typeface typeface) {
        typeface.getClass();
        e.f22445b.put(this.f22441a, typeface);
        this.f22442b.countDown();
        e.f22450h.post(new c2.m(4));
    }
}
