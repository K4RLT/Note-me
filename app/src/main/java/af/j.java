package af;

import df.p;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements lf.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f377b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f378c;

    public j(File file) {
        this.f376a = 0;
        file.getClass();
        this.f377b = file;
        this.f378c = k.f379u;
    }

    @Override // lf.d
    public final Iterator iterator() {
        switch (this.f376a) {
            case 0:
                return new h(this);
            case 1:
                return new lf.c(this);
            case 2:
                return new lf.i(this);
            case 3:
                return new lf.j(this);
            default:
                return new mf.b(this);
        }
    }

    public /* synthetic */ j(Object obj, df.l lVar, int i) {
        this.f376a = i;
        this.f377b = obj;
        this.f378c = lVar;
    }

    public j(CharSequence charSequence, p pVar) {
        this.f376a = 4;
        charSequence.getClass();
        this.f377b = charSequence;
        this.f378c = pVar;
    }
}
