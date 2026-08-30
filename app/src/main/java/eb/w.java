package eb;
import k1.c0;
import k1.j0;
import k1.r;

import android.util.Log;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.b8;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.x6;
import com.google.android.gms.internal.measurement.x7;
import com.google.android.gms.internal.measurement.y7;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.internal.measurement.z7;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements b0, f5.c, ic.d, te.f, ib.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16443u;

    public /* synthetic */ w(int i) {
        this.f16443u = i;
    }

    public static c0 b(List list, float f10, float f11, int i) {
        float f12;
        float f13;
        if ((i & 2) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f10;
        }
        if ((i & 4) != 0) {
            f13 = Float.POSITIVE_INFINITY;
        } else {
            f13 = f11;
        }
        return new c0(list, null, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static c0 d(pe.j[] jVarArr, float f10, float f11) {
        return f((pe.j[]) Arrays.copyOf(jVarArr, jVarArr.length), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public static c0 f(pe.j[] jVarArr, long j10, long j11) {
        ArrayList arrayList = new ArrayList(jVarArr.length);
        for (pe.j jVar : jVarArr) {
            arrayList.add(new r(((r) jVar.f22694v).f19523a));
        }
        ArrayList arrayList2 = new ArrayList(jVarArr.length);
        for (pe.j jVar2 : jVarArr) {
            arrayList2.add(Float.valueOf(((Number) jVar2.f22693u).floatValue()));
        }
        return new c0(arrayList, arrayList2, j10, j11);
    }

    public static c0 h(List list, long j10, long j11, int i) {
        if ((i & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i & 4) != 0) {
            j11 = 9187343241974906880L;
        }
        return new c0(list, null, j12, j11);
    }

    public static j0 i(List list, long j10, float f10) {
        return new j0(list, null, j10, f10, 0);
    }

    public static j0 j(pe.j[] jVarArr, long j10, float f10, int i) {
        if ((i & 2) != 0) {
            j10 = 9205357640488583168L;
        }
        long j11 = j10;
        if ((i & 4) != 0) {
            f10 = Float.POSITIVE_INFINITY;
        }
        float f11 = f10;
        ArrayList arrayList = new ArrayList(jVarArr.length);
        for (pe.j jVar : jVarArr) {
            arrayList.add(new r(((r) jVar.f22694v).f19523a));
        }
        ArrayList arrayList2 = new ArrayList(jVarArr.length);
        for (pe.j jVar2 : jVarArr) {
            arrayList2.add(Float.valueOf(((Number) jVar2.f22693u).floatValue()));
        }
        return new j0(arrayList, arrayList2, j11, f11, 0);
    }

    public static c0 k(List list, float f10, float f11, int i) {
        float f12;
        float f13;
        if ((i & 2) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f10;
        }
        if ((i & 4) != 0) {
            f13 = Float.POSITIVE_INFINITY;
        } else {
            f13 = f11;
        }
        return new c0(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
    }

    public static c0 l(pe.j[] jVarArr, float f10, float f11, int i) {
        if ((i & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i & 4) != 0) {
            f11 = Float.POSITIVE_INFINITY;
        }
        return f((pe.j[]) Arrays.copyOf(jVarArr, jVarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        switch (this.f16443u) {
            case 22:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(nVar);
            case 28:
                return new ce.d(je.b.class, nVar.e(ke.a.class));
            default:
                return new le.f((ke.a) nVar.a(ke.a.class), (le.d) nVar.a(le.d.class));
        }
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        if (!oVar.l()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", oVar.i());
            return null;
        }
        return null;
    }

    @Override // eb.b0
    public Object zza() {
        switch (this.f16443u) {
            case 0:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13813l.a()).longValue());
            case 1:
                i6.f13778v.get();
                return (String) k6.D.a();
            case 2:
                i6.f13778v.get();
                Long l10 = (Long) k6.f13810h.a();
                l10.getClass();
                return l10;
            case 3:
                i6.f13778v.get();
                Long l11 = (Long) k6.C.a();
                l11.getClass();
                return l11;
            case 4:
                s7.f13913v.get();
                Boolean bool = (Boolean) u7.f13940a.a();
                bool.getClass();
                return bool;
            case 5:
                b7.f13659v.get();
                Boolean bool2 = (Boolean) d7.f13691c.a();
                bool2.getClass();
                return bool2;
            case 6:
                o7.f13875v.get();
                Boolean bool3 = (Boolean) q7.f13893a.a();
                bool3.getClass();
                return bool3;
            case 7:
                x6.f13972v.get();
                Boolean bool4 = (Boolean) z6.f13998b.a();
                bool4.getClass();
                return bool4;
            case 8:
                w7.f13961v.get();
                Boolean bool5 = (Boolean) y7.f13988a.a();
                bool5.getClass();
                return bool5;
            case 9:
                i6.f13778v.get();
                return (String) k6.f13827z.a();
            case 10:
                a8.f13643v.get();
                Boolean bool6 = (Boolean) c8.f13680d.a();
                bool6.getClass();
                return bool6;
            case 11:
                n7.f13864v.get();
                Boolean bool7 = (Boolean) p7.f13883b.a();
                bool7.getClass();
                return bool7;
            case 12:
                v7.f13949v.get();
                Boolean bool8 = (Boolean) x7.e.a();
                bool8.getClass();
                return bool8;
            case 13:
                v7.f13949v.get();
                Boolean bool9 = (Boolean) x7.f13978f.a();
                bool9.getClass();
                return bool9;
            case 14:
                v7.f13949v.get();
                Boolean bool10 = (Boolean) x7.f13976c.a();
                bool10.getClass();
                return bool10;
            case 15:
                z7.f13999v.get();
                Boolean bool11 = (Boolean) b8.f13662b.a();
                bool11.getClass();
                return bool11;
            case 16:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.N.a()).longValue());
            case 17:
                g7.f13761v.get();
                Boolean bool12 = (Boolean) i7.f13780a.a();
                bool12.getClass();
                return bool12;
            case 18:
                g7.f13761v.get();
                Boolean bool13 = (Boolean) i7.f13781b.a();
                bool13.getClass();
                return bool13;
            default:
                l6.f13836v.get();
                Boolean bool14 = (Boolean) n6.f13862a.a();
                bool14.getClass();
                return bool14;
        }
    }

    @Override // f5.c
    public void a() {
    }

    @Override // f5.c
    public void c(int i, Object obj) {
    }
}
