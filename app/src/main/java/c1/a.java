package c1;

import a6.x;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.xx;
import eb.d1;
import eb.k0;
import eb.l1;
import eb.l3;
import eb.q0;
import eb.y0;
import fa.y;
import g9.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import r0.o0;

/* loaded from: classes.dex */
public abstract class a implements l1, qb.a, v6.e {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3442u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f3443v;

    public a(int i) {
        this.f3442u = i;
        switch (i) {
            case 1:
                this.f3443v = new HashMap();
                return;
            case 3:
                this.f3443v = new x(25, this);
                return;
            case 6:
                c2 c2Var = new c2();
                this.f3443v = c2Var;
                ((HashSet) c2Var.e).add("B3EEABB8EE11C2BE770B684D95219ECB");
                return;
            default:
                this.f3443v = new ArrayList();
                return;
        }
    }

    @Override // qb.a
    public void K(Bundle bundle) {
        ((pd.c) this.f3443v).K(bundle);
    }

    @Override // qb.a
    public void N(Bundle bundle) {
        ((pd.c) this.f3443v).N(bundle);
    }

    @Override // qb.a
    public void W(Bundle bundle) {
        ((pd.c) this.f3443v).W(bundle);
    }

    @Override // v6.e
    public List c() {
        return (List) this.f3443v;
    }

    @Override // v6.e
    public boolean d() {
        List list = (List) this.f3443v;
        if (list.isEmpty() || (list.size() == 1 && ((b7.a) list.get(0)).c())) {
            return true;
        }
        return false;
    }

    public void e(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb2 = new StringBuilder(str2.length() + FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            l9.i.f(sb2.toString());
        }
        ((Bundle) ((c2) this.f3443v).f17584h).putString(str, str2);
    }

    @Override // eb.l1
    public k0 f() {
        k0 k0Var = ((d1) this.f3443v).C;
        d1.d(k0Var);
        return k0Var;
    }

    public a g(Bundle bundle) {
        c2 c2Var = (c2) this.f3443v;
        ((Bundle) c2Var.f17583g).putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) c2Var.e).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return n();
    }

    @Override // eb.l1
    public y0 h() {
        y0 y0Var = ((d1) this.f3443v).D;
        d1.d(y0Var);
        return y0Var;
    }

    public abstract Object i(Object obj);

    public boolean j(o0 o0Var, Object obj) {
        ArrayList arrayList = o0Var.f24308a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof r0.a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else if (obj2 instanceof o0) {
                if (j((o0) obj2, obj)) {
                    return true;
                }
            } else {
                l4.a.n(obj2, "Unexpected child source info ");
                return false;
            }
        }
        return false;
    }

    @Override // eb.l1
    public de.b k() {
        return ((d1) this.f3443v).f16107z;
    }

    public Object l(Object obj) {
        synchronized (((HashMap) this.f3443v)) {
            try {
                if (((HashMap) this.f3443v).containsKey(obj)) {
                    return ((HashMap) this.f3443v).get(obj);
                }
                Object i = i(obj);
                ((HashMap) this.f3443v).put(obj, i);
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract a n();

    public void o(String str) {
        boolean z3;
        y.i(str, "Content URL must be non-null.");
        y.f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length <= 512) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            ((c2) this.f3443v).f17585j = str;
            return;
        }
        throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
    }

    public void p(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) ((c2) this.f3443v).f17588m;
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                l9.i.f("neighboring content URL should not be null or empty");
            } else {
                arrayList2.add(str);
            }
        }
    }

    public abstract void q();

    public ac.b r() {
        return xx.f12651a.f((x) this.f3443v);
    }

    public q0 s() {
        q0 q0Var = ((d1) this.f3443v).B;
        d1.b(q0Var);
        return q0Var;
    }

    public l3 t() {
        l3 l3Var = ((d1) this.f3443v).F;
        d1.b(l3Var);
        return l3Var;
    }

    public String toString() {
        switch (this.f3442u) {
            case 5:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f3443v;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        y0 y0Var = ((d1) this.f3443v).D;
        d1.d(y0Var);
        y0Var.u();
    }

    @Override // eb.l1
    public Context zza() {
        return ((d1) this.f3443v).f16102u;
    }

    @Override // eb.l1
    public la.a zzb() {
        return ((d1) this.f3443v).H;
    }

    public void m(o0 o0Var, Object obj) {
    }

    public a(d1 d1Var) {
        this.f3442u = 2;
        y.h(d1Var);
        this.f3443v = d1Var;
    }

    public /* synthetic */ a(int i, Object obj) {
        this.f3442u = i;
        this.f3443v = obj;
    }
}
