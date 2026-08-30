package j8;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c extends q9.c {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f19045a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f19046b;

    public c(Uri uri) {
        this.f19046b = uri;
    }

    @Override // q9.c
    public final Drawable a() {
        return this.f19045a;
    }

    @Override // q9.c
    public final double b() {
        return 1.0d;
    }

    @Override // q9.c
    public final Uri c() {
        return this.f19046b;
    }
}
