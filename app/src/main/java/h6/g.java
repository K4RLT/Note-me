package h6;
import h.a;
import j.c;

import a6.q;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.internal.ads.sf;
import k6.l;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f17861f;

    /* renamed from: g, reason: collision with root package name */
    public final sf f17862g;

    public g(Context context, m6.b bVar) {
        super(context, bVar);
        Object systemService = this.f17857b.getSystemService("connectivity");
        systemService.getClass();
        this.f17861f = (ConnectivityManager) systemService;
        this.f17862g = new sf(5, this);
    }

    @Override // h6.e
    public final Object a() {
        return a(this.f17861f);
    }

    @Override // h6.e
    public final void c() {
        try {
            q.d().a(h.f17863a, "Registering network callback");
            l.a(this.f17861f, this.f17862g);
        } catch (IllegalArgumentException e) {
            q.d().c(h.f17863a, "Received exception while registering network callback", e);
        } catch (SecurityException e8) {
            q.d().c(h.f17863a, "Received exception while registering network callback", e8);
        }
    }

    @Override // h6.e
    public final void d() {
        try {
            q.d().a(h.f17863a, "Unregistering network callback");
            k6.c(this.f17861f, this.f17862g);
        } catch (IllegalArgumentException e) {
            q.d().c(h.f17863a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e8) {
            q.d().c(h.f17863a, "Received exception while unregistering network callback", e8);
        }
    }
}
