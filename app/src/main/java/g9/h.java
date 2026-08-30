package g9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.yo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f17641c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17642d;
    public final /* synthetic */ vr e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f17643f;

    public h(n nVar, Context context, c3 c3Var, String str, vr vrVar) {
        this.f17640b = context;
        this.f17641c = c3Var;
        this.f17642d = str;
        this.e = vrVar;
        Objects.requireNonNull(nVar);
        this.f17643f = nVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17640b, "app_open");
        return new j0();
    }

    @Override // g9.o
    public final /* synthetic */ Object b() {
        return ((yo) this.f17643f.f17678v).l(this.f17640b, this.f17641c, this.f17642d, this.e, 4);
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.s4(new oa.b(this.f17640b), this.f17641c, this.f17642d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
