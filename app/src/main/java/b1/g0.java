package b1;
import e0.b;
import q.l;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.daren.scraply.MainActivity;
import java.util.Iterator;
import java.util.Map;
import wa.b9;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: u, reason: collision with root package name */
    public int f1338u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1339v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1340w;

    /* renamed from: x, reason: collision with root package name */
    public Object f1341x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1342y;

    public g0(String str, int i, String str2) {
        this.f1339v = str;
        this.f1338u = i;
        this.f1340w = str2;
        sf.n0 b10 = sf.b(Integer.valueOf(i));
        this.f1341x = b10;
        this.f1342y = new sf.a0(b10);
    }

    public static boolean b() {
        return !((Boolean) r7.b.f24612b.f25140u.getValue()).booleanValue();
    }

    public void a() {
        Map.Entry entry;
        this.f1341x = (Map.Entry) this.f1342y;
        Iterator it = (Iterator) this.f1340w;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.f1342y = entry;
    }

    public void c(MainActivity mainActivity) {
        sf.n0 n0Var = (sf.n0) this.f1341x;
        SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("scraply_ads", 0);
        String str = (String) this.f1339v;
        int i = this.f1338u;
        Integer valueOf = Integer.valueOf(b9.e(sharedPreferences.getInt(str, i), 0, i));
        n0Var.getClass();
        n0Var.k(null, valueOf);
    }

    public void e(Activity activity, df.a aVar) {
        if (b() && activity != null) {
            int intValue = ((Number) ((sf.n0) this.f1341x).getValue()).intValue();
            if (intValue > 0) {
                f(activity, intValue - 1);
                aVar.invoke();
                e7.o oVar = e7.o.f15975a;
                e7.o.d(activity);
                return;
            }
            e7.o oVar2 = e7.o.f15975a;
            e7.o.g(activity, (String) this.f1340w, new a1.g(7, this, activity, aVar));
            return;
        }
        aVar.invoke();
    }

    public void f(Context context, int i) {
        context.getClass();
        int e = b9.e(i, 0, this.f1338u);
        sf.n0 n0Var = (sf.n0) this.f1341x;
        Integer valueOf = Integer.valueOf(e);
        n0Var.getClass();
        n0Var.k(null, valueOf);
        context.getSharedPreferences("scraply_ads", 0).edit().putInt((String) this.f1339v, e).apply();
    }

    public boolean hasNext() {
        if (((Map.Entry) this.f1342y) != null) {
            return true;
        }
        return false;
    }

    public void remove() {
        y yVar = (y) this.f1339v;
        if (yVar.e().f1406d == this.f1338u) {
            Map.Entry entry = (Map.Entry) this.f1341x;
            if (entry != null) {
                yVar.remove(entry.getKey());
                this.f1341x = null;
                this.f1338u = yVar.e().f1406d;
                return;
            }
            g5.l();
            return;
        }
        l4.a.m();
    }

    public g0(y yVar, Iterator it) {
        this.f1339v = yVar;
        this.f1340w = it;
        this.f1338u = yVar.e().f1406d;
        a();
    }
}
