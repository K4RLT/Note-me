package eb;
import b0.a;
import d.e;
import a0.f0;
import k1.b0;
import k1.l0;
import k1.r;
import l1.d;
import l1.q;

import android.util.Log;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.b8;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.x6;
import com.google.android.gms.internal.measurement.x7;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.internal.measurement.z7;
import com.google.android.gms.internal.mlkit_vision_digital_ink.nl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pa;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ql;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements b0, f5.c, te.f, ic.d {

    /* renamed from: v, reason: collision with root package name */
    public static x f16448v;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16449u;

    public x(f0 f0Var) {
        this.f16449u = 19;
        new CopyOnWriteArrayList();
    }

    public static long d() {
        return r.f19513b;
    }

    public static long f() {
        return r.f19520k;
    }

    public static long g() {
        return r.f19515d;
    }

    public static long h(float f10, float f11, float f12, float f13, int i) {
        int i10 = r.f19522m;
        if ((i & 8) != 0) {
            f13 = 1.0f;
        }
        q qVar = d.e;
        if (0.0f > f10 || f10 > 360.0f || 0.0f > f11 || f11 > 1.0f || 0.0f > f12 || f12 > 1.0f) {
            b0.a("HSV (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return l0.b(i(f10, f11, f12, 5), i(f10, f11, f12, 3), i(f10, f11, f12, 1), f13, qVar);
    }

    public static float i(float f10, float f11, float f12, int i) {
        float f13 = ((f10 / 60.0f) + i) % 6.0f;
        return f12 - (Math.max(0.0f, Math.min(f13, Math.min(4 - f13, 1.0f))) * (f11 * f12));
    }

    @Override // f5.c
    public void a() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void b(p5.c cVar, Object obj) {
        k7.f fVar = (k7.f) obj;
        cVar.getClass();
        String str = fVar.f19605a;
        cVar.s(1, str);
        cVar.s(2, fVar.f19606b);
        cVar.b(3, fVar.f19607c);
        cVar.c(fVar.f19608d, 4);
        cVar.c(fVar.e, 5);
        cVar.c(fVar.f19609f, 6);
        cVar.b(7, fVar.f19610g);
        String str2 = fVar.f19611h;
        if (str2 == null) {
            cVar.g(8);
        } else {
            cVar.s(8, str2);
        }
        String str3 = fVar.i;
        if (str3 == null) {
            cVar.g(9);
        } else {
            cVar.s(9, str3);
        }
        String str4 = fVar.f19612j;
        if (str4 == null) {
            cVar.g(10);
        } else {
            cVar.s(10, str4);
        }
        String str5 = fVar.f19613k;
        if (str5 == null) {
            cVar.g(11);
        } else {
            cVar.s(11, str5);
        }
        cVar.b(12, fVar.f19614l);
        cVar.b(13, fVar.f19615m);
        cVar.s(14, str);
    }

    @Override // f5.c
    public void c(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        nl nlVar;
        switch (this.f16449u) {
            case 28:
                synchronized (pa.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        Object obj = new Object();
                        synchronized (pa.class) {
                            try {
                                if (pa.f14791w == null) {
                                    pa.f14791w = new ql(0);
                                }
                                nlVar = (nl) pa.f14791w.l(obj);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return new le.d(nlVar);
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
                return new le.d(nlVar);
            default:
                return new le.e((le.f) nVar.a(le.f.class), (de.d) nVar.a(de.d.class));
        }
    }

    @Override // eb.b0
    public Object zza() {
        switch (this.f16449u) {
            case 0:
                i6.f13778v.get();
                return (String) k6.f13808f.a();
            case 1:
                c7.f13675v.get();
                Boolean bool = (Boolean) e7.f13739a.a();
                bool.getClass();
                return bool;
            case 2:
                i6.f13778v.get();
                return (String) k6.i.a();
            case 3:
                i6.f13778v.get();
                return (String) k6.E.a();
            case 4:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.Q.a()).longValue());
            case 5:
                i6.f13778v.get();
                return (String) k6.e.a();
            case 6:
                m6.f13845v.get();
                return Integer.valueOf((int) ((Long) o6.f13874a.a()).longValue());
            case 7:
                x6.f13972v.get();
                Boolean bool2 = (Boolean) z6.f13997a.a();
                bool2.getClass();
                return bool2;
            case 8:
                a8.f13643v.get();
                Boolean bool3 = (Boolean) c8.f13678b.a();
                bool3.getClass();
                return bool3;
            case 9:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.M.a()).longValue());
            case 10:
                f7.f13753v.get();
                Boolean bool4 = (Boolean) h7.f13770a.a();
                bool4.getClass();
                return bool4;
            case 11:
                n7.f13864v.get();
                Boolean bool5 = (Boolean) p7.f13882a.a();
                bool5.getClass();
                return bool5;
            case 12:
                v7.f13949v.get();
                Boolean bool6 = (Boolean) x7.f13979g.a();
                bool6.getClass();
                return bool6;
            case 13:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.U.a()).longValue());
            case 14:
                v7.f13949v.get();
                Boolean bool7 = (Boolean) x7.f13980h.a();
                bool7.getClass();
                return bool7;
            case 15:
                z7.f13999v.get();
                Boolean bool8 = (Boolean) b8.f13661a.a();
                bool8.getClass();
                return bool8;
            case 16:
                q6.f13891v.get();
                Boolean bool9 = (Boolean) s6.f13912a.a();
                bool9.getClass();
                return bool9;
            case 17:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.L.a()).longValue());
            default:
                l6.f13836v.get();
                Boolean bool10 = (Boolean) n6.f13863b.a();
                bool10.getClass();
                return bool10;
        }
    }

    public /* synthetic */ x(int i) {
        this.f16449u = i;
    }
}
