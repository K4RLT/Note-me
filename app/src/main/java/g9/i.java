package g9;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.yo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f17648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17649d;
    public final /* synthetic */ tr e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f17650f;

    public i(n nVar, Context context, c3 c3Var, String str, tr trVar) {
        this.f17647b = context;
        this.f17648c = c3Var;
        this.f17649d = str;
        this.e = trVar;
        Objects.requireNonNull(nVar);
        this.f17650f = nVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17647b, "interstitial");
        return new j0();
    }

    @Override // g9.o
    public final /* synthetic */ Object b() {
        return ((yo) this.f17650f.f17678v).l(this.f17647b, this.f17648c, this.f17649d, this.e, 2);
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.F3(new oa.b(this.f17647b), this.f17648c, this.f17649d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
