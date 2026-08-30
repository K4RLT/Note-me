package g9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.tr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f17613c;

    public e(n nVar, Context context, tr trVar) {
        this.f17612b = context;
        this.f17613c = trVar;
        Objects.requireNonNull(nVar);
    }

    @Override // g9.o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // g9.o
    public final Object b() {
        IInterface ohVar;
        Context context = this.f17612b;
        oa.b bVar = new oa.b(context);
        try {
            try {
                IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = hx.f6911u;
                if (b10 == null) {
                    ohVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    if (queryLocalInterface instanceof ix) {
                        ohVar = (ix) queryLocalInterface;
                    } else {
                        ohVar = new oh(b10, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 0);
                    }
                }
                return ((gx) ohVar).u4(bVar, this.f17613c);
            } catch (RemoteException | NullPointerException | l9.j unused) {
                return null;
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.P1(new oa.b(this.f17612b), this.f17613c, ModuleDescriptor.MODULE_VERSION);
    }
}
