package l4;

import android.os.Bundle;
import android.util.Log;
import androidx.ink.brush.color.colorspace.ColorSpaceUtils;
import androidx.ink.brush.color.colorspace.ColorSpaces;
import androidx.ink.brush.color.colorspace.DoubleFunction;
import androidx.ink.brush.color.colorspace.Rgb;
import com.google.android.gms.internal.ads.gl;
import fa.y;
import g9.n;
import ib.o;
import ic.r;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k8.g;
import nd.k;
import q.x;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DoubleFunction, n3.d, g, ib.a, dd.a, k8.e, ic.d {

    /* renamed from: u */
    public final /* synthetic */ int f19888u;

    public /* synthetic */ a(int i) {
        this.f19888u = i;
    }

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(int i, StringBuilder sb2) {
        sb2.append(i);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void i(String str, float f10, Object obj, float f11, Object obj2) {
        throw new IllegalArgumentException(str + f10 + obj + f11 + obj2);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void k(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void l(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void m() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void o() {
        throw new ab.b(false);
    }

    public static /* synthetic */ void p() {
        throw new ab.b(14, (byte) 0);
    }

    @Override // k8.g
    public void a(Exception exc) {
    }

    @Override // k8.e
    public Object apply(Object obj) {
        od.e eVar = (od.e) obj;
        eVar.getClass();
        ra.e eVar2 = k.f21261a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.u(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // n3.d
    public boolean b() {
        return false;
    }

    @Override // ic.d
    public Object e(n nVar) {
        Set i = nVar.i(r.a(pd.a.class));
        pd.c cVar = pd.c.f22680v;
        if (cVar == null) {
            synchronized (pd.c.class) {
                try {
                    cVar = pd.c.f22680v;
                    if (cVar == null) {
                        cVar = new pd.c(0, false);
                        pd.c.f22680v = cVar;
                    }
                } finally {
                }
            }
        }
        return new pd.b(i, cVar);
    }

    @Override // ib.a
    public Object g(o oVar) {
        int i;
        Object obj;
        boolean z3;
        switch (this.f19888u) {
            case 18:
                i = 403;
                break;
            case 19:
                i = -1;
                break;
            case 20:
            default:
                if (oVar.l()) {
                    oc.a aVar = (oc.a) oVar.j();
                    lc.d dVar = lc.d.f20327a;
                    dVar.b("Crashlytics report successfully enqueued to DataTransport: " + aVar.f21868b);
                    File file = aVar.f21869c;
                    z3 = true;
                    if (file.delete()) {
                        dVar.b("Deleted report file: " + file.getPath());
                    } else {
                        dVar.f(null, "Crashlytics could not delete report file: " + file.getPath());
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", oVar.i());
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case gl.zzm /* 21 */:
                synchronized (oVar.f18381a) {
                    y.j("Task is not yet complete", oVar.f18383c);
                    if (!oVar.f18384d) {
                        boolean isInstance = IOException.class.isInstance(oVar.f18385f);
                        Exception exc = oVar.f18385f;
                        if (!isInstance) {
                            if (exc == null) {
                                obj = oVar.e;
                            } else {
                                throw new RuntimeException(exc);
                            }
                        } else {
                            throw ((Throwable) IOException.class.cast(exc));
                        }
                    } else {
                        throw new CancellationException("Task is already canceled.");
                    }
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string == null) {
                        String string2 = bundle.getString("unregistered");
                        if (string2 == null) {
                            String string3 = bundle.getString("error");
                            if (!"RST".equals(string3)) {
                                if (string3 != null) {
                                    x.p(string3);
                                } else {
                                    Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                                    x.p("SERVICE_NOT_AVAILABLE");
                                }
                            } else {
                                x.p("INSTANCE_ID_RESET");
                            }
                        } else {
                            return string2;
                        }
                    } else {
                        return string;
                    }
                } else {
                    x.p("SERVICE_NOT_AVAILABLE");
                }
                return null;
        }
        return Integer.valueOf(i);
    }

    @Override // androidx.ink.brush.color.colorspace.DoubleFunction
    public double invoke(double d2) {
        double absRcpResponse;
        double absResponse;
        double Bt2020Hlg$lambda$0;
        double Bt2020Hlg$lambda$1;
        double Bt2020Pq$lambda$0;
        double Bt2020Pq$lambda$1;
        double DoubleIdentity$lambda$0;
        switch (this.f19888u) {
            case 0:
                absRcpResponse = ColorSpaceUtils.absRcpResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
                return absRcpResponse;
            case 1:
                absResponse = ColorSpaceUtils.absResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
                return absResponse;
            case 2:
                Bt2020Hlg$lambda$0 = ColorSpaces.Bt2020Hlg$lambda$0(d2);
                return Bt2020Hlg$lambda$0;
            case 3:
                Bt2020Hlg$lambda$1 = ColorSpaces.Bt2020Hlg$lambda$1(d2);
                return Bt2020Hlg$lambda$1;
            case 4:
                Bt2020Pq$lambda$0 = ColorSpaces.Bt2020Pq$lambda$0(d2);
                return Bt2020Pq$lambda$0;
            case 5:
                Bt2020Pq$lambda$1 = ColorSpaces.Bt2020Pq$lambda$1(d2);
                return Bt2020Pq$lambda$1;
            default:
                DoubleIdentity$lambda$0 = Rgb.DoubleIdentity$lambda$0(d2);
                return DoubleIdentity$lambda$0;
        }
    }

    public /* synthetic */ a(int i, Object obj) {
        this.f19888u = i;
    }
}
