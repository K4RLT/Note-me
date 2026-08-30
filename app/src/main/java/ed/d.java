package ed;

import android.content.Context;
import ib.o;
import java.util.Set;
import java.util.concurrent.Executor;
import wa.h8;
import ya.a0;

/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final bc.c f16482a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16483b;

    /* renamed from: c, reason: collision with root package name */
    public final gd.b f16484c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f16485d;
    public final Executor e;

    public d(Context context, String str, Set set, gd.b bVar, Executor executor) {
        this.f16482a = new bc.c(context, str);
        this.f16485d = set;
        this.e = executor;
        this.f16484c = bVar;
        this.f16483b = context;
    }

    public final o a() {
        if (!a0.a(this.f16483b)) {
            return h8.e("");
        }
        return h8.c(new c(this, 0), this.e);
    }

    public final void b() {
        if (this.f16485d.size() <= 0) {
            h8.e(null);
        } else if (!a0.a(this.f16483b)) {
            h8.e(null);
        } else {
            h8.c(new c(this, 1), this.e);
        }
    }
}
