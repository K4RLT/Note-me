package g9;
import d.a;
import d.d;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.fn;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f17684a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.oh] */
    static {
        w0 w0Var;
        w0 w0Var2 = null;
        try {
            Object newInstance = n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                l9.i.f("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                if (queryLocalInterface instanceof w0) {
                    w0Var = (w0) queryLocalInterface;
                } else {
                    w0Var = new oh(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 0);
                }
                w0Var2 = w0Var;
            }
        } catch (Exception unused) {
            l9.i.f("Failed to instantiate ClientApi class.");
        }
        f17684a = w0Var2;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(w0 w0Var);

    public final Object d(Context context, boolean z3) {
        boolean z9;
        boolean z10;
        Object obj;
        Object obj2;
        if (!z3) {
            l9.d dVar = p.f17688g.f17689a;
            if (ca.f.f4036b.c(context, 12451000) != 0) {
                l9.i.a("Google Play Services is not available.");
                z3 = true;
            }
        }
        boolean z11 = false;
        if (pa.a(context, ModuleDescriptor.MODULE_ID) > pa.d(context, ModuleDescriptor.MODULE_ID, false)) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z12 = !z9;
        sl.a(context);
        if (((Boolean) sm.f11060a.p()).booleanValue()) {
            z10 = false;
        } else {
            boolean z13 = z3 | z12;
            if (((Boolean) sm.f11061b.p()).booleanValue()) {
                z10 = true;
                z11 = true;
            } else {
                z11 = z13;
                z10 = false;
            }
        }
        w0 w0Var = f17684a;
        Object obj3 = null;
        if (z11) {
            if (w0Var != null) {
                try {
                    obj2 = c(w0Var);
                } catch (RemoteException e) {
                    l9.i.g("Cannot invoke local loader using ClientApi class.", e);
                }
                if (obj2 == null && !z10) {
                    try {
                        obj3 = b();
                    } catch (RemoteException e8) {
                        l9.i.g("Cannot invoke remote loader.", e8);
                    }
                    obj2 = obj3;
                }
            } else {
                l9.i.f("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = b();
                obj2 = obj3;
            }
        } else {
            try {
                obj = b();
            } catch (RemoteException e10) {
                l9.i.g("Cannot invoke remote loader.", e10);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) fn.f6127a.p()).intValue();
                p pVar = p.f17688g;
                if (pVar.e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    l9.d dVar2 = pVar.f17689a;
                    String str = pVar.f17692d.f20029u;
                    dVar2.getClass();
                    l9.a(context, str, bundle, new pw(dVar2, 16, context));
                }
            }
            if (obj == null) {
                if (w0Var != null) {
                    try {
                        obj3 = c(w0Var);
                    } catch (RemoteException e11) {
                        l9.i.g("Cannot invoke local loader using ClientApi class.", e11);
                    }
                } else {
                    l9.i.f("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        if (obj2 == null) {
            return a();
        }
        return obj2;
    }
}
