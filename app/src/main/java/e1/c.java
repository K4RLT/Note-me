package e1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import c2.x;
import com.google.android.gms.internal.ads.wd0;
import j2.p;
import wa.l6;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final pd.c f15875a;

    /* renamed from: b, reason: collision with root package name */
    public final p f15876b;

    /* renamed from: c, reason: collision with root package name */
    public final x f15877c;

    /* renamed from: d, reason: collision with root package name */
    public final k2.a f15878d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f15879f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final AutofillId f15880g;

    /* renamed from: h, reason: collision with root package name */
    public final n.x f15881h;
    public boolean i;

    public c(pd.c cVar, p pVar, x xVar, k2.a aVar, String str) {
        AutofillId autofillId;
        this.f15875a = cVar;
        this.f15876b = pVar;
        this.f15877c = xVar;
        this.f15878d = aVar;
        this.e = str;
        xVar.setImportantForAutofill(1);
        z5.h a10 = l6.a(xVar);
        if (a10 != null) {
            autofillId = ed.h.m(a10.f31922v);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.f15880g = autofillId;
            this.f15881h = new n.x();
            return;
        }
        throw wd0.m("Required value was null.");
    }
}
