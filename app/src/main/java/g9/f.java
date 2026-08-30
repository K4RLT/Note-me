package g9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.wt;

/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f17634c;

    public f(n nVar, Context context, tr trVar) {
        this.f17633b = context;
        this.f17634c = trVar;
    }

    @Override // g9.o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // g9.o
    public final Object b() {
        IInterface ohVar;
        Context context = this.f17633b;
        oa.b bVar = new oa.b(context);
        try {
            try {
                IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = vt.f11981u;
                if (b10 == null) {
                    ohVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    if (queryLocalInterface instanceof wt) {
                        ohVar = (wt) queryLocalInterface;
                    } else {
                        ohVar = new oh(b10, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 0);
                    }
                }
                return ((ut) ohVar).u4(bVar, this.f17634c);
            } catch (RemoteException | NullPointerException | l9.j unused) {
                return null;
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.p3(new oa.b(this.f17633b), this.f17634c, ModuleDescriptor.MODULE_VERSION);
    }
}
