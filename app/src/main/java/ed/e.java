package ed;

import android.util.Log;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ql;
import eb.b0;
import g9.n;
import va.r;

/* loaded from: classes.dex */
public final class e implements ic.d, te.f, ib.d, eb.f, b0 {

    /* renamed from: v, reason: collision with root package name */
    public static e f16486v;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16487u;

    public /* synthetic */ e(int i) {
        this.f16487u = i;
    }

    @Override // eb.f
    public String a(String str, String str2) {
        return null;
    }

    @Override // ic.d
    public Object e(n nVar) {
        switch (this.f16487u) {
            case 1:
                return new Object();
            case 2:
                return new de.d(nVar.e(de.g.class));
            default:
                synchronized (r.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        Object obj = new Object();
                        synchronized (r.class) {
                            try {
                                if (r.f27507a == null) {
                                    r.f27507a = new ql(1);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return new Object();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if ((b10 & 1) == 0) {
                        sb2.append(" enableFirelog");
                    }
                    if ((b10 & 2) == 0) {
                        sb2.append(" firelogEventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                }
                return new Object();
        }
    }

    public String toString() {
        switch (this.f16487u) {
            case 7:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // ib.d
    public void w(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // eb.b0
    public Object zza() {
        switch (this.f16487u) {
            case 15:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.T.a()).longValue());
            case 16:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.P.a()).longValue());
            case 17:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13815n.a()).longValue());
            case 18:
                i6.f13778v.get();
                Long l10 = (Long) k6.f13805b.a();
                l10.getClass();
                return l10;
            case 19:
                i6.f13778v.get();
                Long l11 = (Long) k6.K.a();
                l11.getClass();
                return l11;
            case 20:
                i6.f13778v.get();
                Long l12 = (Long) k6.f13820s.a();
                l12.getClass();
                return l12;
            case gl.zzm /* 21 */:
                i6.f13778v.get();
                Long l13 = (Long) k6.A.a();
                l13.getClass();
                return l13;
            case 22:
                i6.f13778v.get();
                Long l14 = (Long) k6.f13822u.a();
                l14.getClass();
                return l14;
            case 23:
                i6.f13778v.get();
                Long l15 = (Long) k6.S.a();
                l15.getClass();
                return l15;
            case 24:
                r7.f13903v.get();
                Boolean bool = (Boolean) t7.f13930a.a();
                bool.getClass();
                return bool;
            case 25:
                r7.f13903v.get();
                return (String) t7.f13934f.a();
            case 26:
                i6.f13778v.get();
                Long l16 = (Long) k6.f13807d.a();
                l16.getClass();
                return l16;
            case 27:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13816o.a()).longValue());
            case 28:
                i6.f13778v.get();
                Long l17 = (Long) k6.G.a();
                l17.getClass();
                return l17;
            default:
                i6.f13778v.get();
                Long l18 = (Long) k6.H.a();
                l18.getClass();
                return l18;
        }
    }
}
