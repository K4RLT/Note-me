package zb;

import com.google.android.gms.internal.play_billing.b0;

/* loaded from: classes.dex */
public final class f extends b0 {

    /* renamed from: v, reason: collision with root package name */
    public boolean f32032v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f32033w;

    public f(Object obj) {
        super(5);
        this.f32033w = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f32032v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f32032v) {
            this.f32032v = true;
            return this.f32033w;
        }
        l4.a.c();
        return null;
    }
}
