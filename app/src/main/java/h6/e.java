package h6;

import android.content.Context;
import java.util.LinkedHashSet;
import qe.l;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final m6.b f17856a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17857b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17858c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f17859d;
    public Object e;

    public e(Context context, m6.b bVar) {
        this.f17856a = bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f17857b = applicationContext;
        this.f17858c = new Object();
        this.f17859d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f17858c) {
            Object obj2 = this.e;
            if (obj2 != null && obj2.equals(obj)) {
                return;
            }
            this.e = obj;
            this.f17856a.f20616d.execute(new b6.g(l.P(this.f17859d), 9, this));
        }
    }

    public abstract void c();

    public abstract void d();
}
