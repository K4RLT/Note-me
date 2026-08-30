package de;
import b.a;

import android.os.Looper;
import android.util.Log;
import b8.m7;
import b8.s7;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.r6;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.y6;
import eb.b0;
import ic.r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements ic.d, u1.a, c7.d, ib.d, b0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15833u;

    public b(JSONObject jSONObject) {
        this.f15833u = 10;
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(e4.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.a(e4.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        switch (this.f15833u) {
            case 2:
                return new ce.e(nVar.i(r.a(ce.d.class)));
            default:
                return new b(0);
        }
    }

    @Override // c7.d
    public void u(c7.f fVar) {
        fVar.getClass();
        if (fVar.f3946a != 0) {
            wd0.o("Play no disponible: ", fVar.f3948c, "UniverseBilling");
            s7 s7Var = s7.f2719a;
        } else {
            pf.b0.x(s7.f2721c, null, new m7(2, null, 0), 3);
        }
    }

    @Override // ib.d
    public void w(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // c7.d
    public void y() {
        Log.d("UniverseBilling", "Play desconectado");
    }

    @Override // eb.b0
    public Object zza() {
        switch (this.f15833u) {
            case 15:
                y6.f13986v.get();
                Boolean bool = (Boolean) a7.f13642c.a();
                bool.getClass();
                return bool;
            case 16:
                y6.f13986v.get();
                Boolean bool2 = (Boolean) a7.f13641b.a();
                bool2.getClass();
                return bool2;
            case 17:
                i6.f13778v.get();
                return (String) k6.X.a();
            case 18:
                i6.f13778v.get();
                return (String) k6.f13811j.a();
            case 19:
                i6.f13778v.get();
                Long l10 = (Long) k6.f13824w.a();
                l10.getClass();
                return l10;
            case 20:
                i6.f13778v.get();
                Long l11 = (Long) k6.f13809g.a();
                l11.getClass();
                return l11;
            case gl.zzm /* 21 */:
                i6.f13778v.get();
                Long l12 = (Long) k6.f13825x.a();
                l12.getClass();
                return l12;
            case 22:
                i6.f13778v.get();
                Long l13 = (Long) k6.J.a();
                l13.getClass();
                return l13;
            case 23:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13812k.a()).longValue());
            case 24:
                p6.f13880v.get();
                Boolean bool3 = (Boolean) r6.f13901c.a();
                bool3.getClass();
                return bool3;
            case 25:
                r7.f13903v.get();
                Long l14 = (Long) t7.e.a();
                l14.getClass();
                return l14;
            case 26:
                r7.f13903v.get();
                Long l15 = (Long) t7.f13931b.a();
                l15.getClass();
                return l15;
            case 27:
                p6.f13880v.get();
                Boolean bool4 = (Boolean) r6.f13902d.a();
                bool4.getClass();
                return bool4;
            case 28:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13818q.a()).longValue());
            default:
                i6.f13778v.get();
                return Integer.valueOf((int) ((Long) k6.f13819r.a()).longValue());
        }
    }

    public /* synthetic */ b(int i) {
        this.f15833u = i;
    }

    public b(int i, int i10) {
        this.f15833u = 1;
    }
}
