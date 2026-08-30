package c;
import x.n;
import f.a;
import f.b;
import f.d;
import f.e;
import f.f;
import f.i;
import q.x;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import wa.da;
import wa.q6;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3254a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3255b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3256c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3257d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f3258f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f3259g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f3260h;

    public m(o oVar) {
        this.f3260h = oVar;
    }

    public final boolean a(int i, int i10, Intent intent) {
        b bVar;
        String str = (String) this.f3254a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.e.get(str);
        if (dVar != null) {
            bVar = dVar.f16610a;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            ArrayList arrayList = this.f3257d;
            if (arrayList.contains(str)) {
                dVar.f16610a.a(dVar.f16611b.c(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f3258f.remove(str);
        this.f3259g.putParcelable(str, new a(intent, i10));
        return true;
    }

    public final void b(int i, q6 q6Var, Object obj) {
        Bundle bundle;
        int i10;
        String[] strArr;
        o oVar = this.f3260h;
        z5.h b10 = q6Var.b(oVar, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new l(i, 0, this, b10));
            return;
        }
        Intent a10 = q6Var.a(oVar, obj);
        if (a10.getExtras() != null) {
            Bundle extras = a10.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a10.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i11])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                } else {
                    x.n(a5.a.k(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr[i12] = stringArrayExtra[i13];
                        i12++;
                    }
                }
            }
            oVar.requestPermissions(stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
            i iVar = (i) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                iVar.getClass();
                i10 = i;
                try {
                    oVar.startIntentSenderForResult(iVar.f16619u, i10, iVar.f16620v, iVar.f16621w, iVar.f16622x, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    new Handler(Looper.getMainLooper()).post(new l(i10, 1, this, e));
                }
            } catch (IntentSender.SendIntentException e8) {
                e = e8;
                i10 = i;
            }
        } else {
            oVar.startActivityForResult(a10, i, bundle2);
        }
    }

    public final void c(String str) {
        LinkedHashMap linkedHashMap = this.f3255b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new lf.a(new af.j(f.f16614u, new j7.p(4), 1)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f3254a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        l4.a.h("Sequence contains no element matching the predicate.");
    }

    public final void d(String str) {
        Integer num;
        str.getClass();
        if (!this.f3257d.contains(str) && (num = (Integer) this.f3255b.remove(str)) != null) {
            this.f3254a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f3258f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f3259g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) da.a(bundle, str, a.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f3256c;
        e eVar = (e) linkedHashMap2.get(str);
        if (eVar != null) {
            ArrayList arrayList = eVar.f16613b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                eVar.f16612a.f((androidx.lifecycle.u) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
