package g9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.yo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f17637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17638d;
    public final /* synthetic */ vr e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f17639f;

    public g(n nVar, Context context, c3 c3Var, String str, vr vrVar) {
        this.f17636b = context;
        this.f17637c = c3Var;
        this.f17638d = str;
        this.e = vrVar;
        Objects.requireNonNull(nVar);
        this.f17639f = nVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17636b, "banner");
        return new j0();
    }

    @Override // g9.o
    public final /* synthetic */ Object b() {
        return ((yo) this.f17639f.f17678v).l(this.f17636b, this.f17637c, this.f17638d, this.e, 1);
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.f3(new oa.b(this.f17636b), this.f17637c, this.f17638d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
