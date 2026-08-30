package g9;
import r.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.tr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f17595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f17596c;

    public d(n nVar, OutOfContextTestingActivity outOfContextTestingActivity, tr trVar) {
        this.f17595b = outOfContextTestingActivity;
        this.f17596c = trVar;
        Objects.requireNonNull(nVar);
    }

    @Override // g9.o
    public final /* bridge */ /* synthetic */ Object a() {
        n.B(this.f17595b, "out_of_context_tester");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g9.o
    public final Object b() {
        t1 t1Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f17595b;
        oa.b bVar = new oa.b(outOfContextTestingActivity);
        sl.a(outOfContextTestingActivity);
        if (((Boolean) e.f17698c.a(sl.Ja)).booleanValue()) {
            try {
                try {
                    IBinder b10 = ya.m0.a(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (b10 == null) {
                        t1Var = 0;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        if (queryLocalInterface instanceof t1) {
                            t1Var = (t1) queryLocalInterface;
                        } else {
                            t1Var = new oh(b10, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 0);
                        }
                    }
                    return t1Var.u4(bVar, this.f17596c);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException e8) {
                e = e8;
                pu.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                pu.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (l9.j e11) {
                e = e11;
                pu.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f17595b;
        oa.b bVar = new oa.b(outOfContextTestingActivity);
        sl.a(outOfContextTestingActivity);
        if (((Boolean) e.f17698c.a(sl.Ja)).booleanValue()) {
            return w0Var.m4(bVar, this.f17596c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
