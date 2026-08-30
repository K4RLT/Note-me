package nd;
import b.c;
import c.l;
import c.r;
import g.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.Iterator;
import java.util.Locale;
import sf.n0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements ib.a, c7.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f21247u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f21248v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f21249w;

    public /* synthetic */ f(Object obj, Object obj2, boolean z3) {
        this.f21248v = obj;
        this.f21249w = obj2;
        this.f21247u = z3;
    }

    @Override // c7.g
    public void a(c7.f fVar, String str) {
        Object obj;
        long j10;
        String str2;
        String str3;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        r7.n nVar = (r7.n) this.f21248v;
        Purchase purchase = (Purchase) this.f21249w;
        fVar.getClass();
        str.getClass();
        if (fVar.f3946a == 0) {
            n0 n0Var = r7.h.f24634g;
            Boolean bool = Boolean.TRUE;
            n0Var.getClass();
            n0Var.k(null, bool);
            Context context = r7.h.i;
            if (context != null && (sharedPreferences = context.getSharedPreferences("scraply_tips", 0)) != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("has_tipped", true)) != null) {
                putBoolean.apply();
            }
            Iterator it = ((Iterable) r7.h.f24631c.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r7.g) obj).f24624a == nVar) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r7.g gVar = (r7.g) obj;
            String productId = nVar.getProductId();
            String name = nVar.name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            lowerCase.getClass();
            if (gVar != null) {
                j10 = gVar.e;
            } else {
                j10 = 0;
            }
            long j11 = j10;
            if (gVar != null) {
                str2 = gVar.f24628f;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            String str4 = str2;
            String optString = purchase.f4147c.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                str3 = null;
            } else {
                str3 = optString;
            }
            f7.l(productId, lowerCase, "tip_jar", j11, str4, str3);
            String lowerCase2 = nVar.name().toLowerCase(locale);
            lowerCase2.getClass();
            f7.r("purchased", lowerCase2);
            if (this.f21247u) {
                n0 n0Var2 = r7.h.e;
                n0Var2.getClass();
                n0Var2.k(null, nVar);
                Context context2 = r7.h.i;
                if (context2 != null) {
                    n0 n0Var3 = t7.b.f25651a;
                    t7.c(context2, t7.a.TIPPED);
                }
            }
        }
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        Context context = (Context) this.f21248v;
        Intent intent = (Intent) this.f21249w;
        if (la.b.h() && ((Integer) oVar.j()).intValue() == 402) {
            return a(context, intent, this.f21247u).g(new d5.c(0), new l4.a(18));
        }
        return oVar;
    }
}
