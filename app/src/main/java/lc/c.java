package lc;

import android.util.Log;
import com.google.android.gms.internal.ads.ad;
import j.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import nd.o;
import qe.m;
import ud.e;
import z5.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f20326a;

    public c(m0 m0Var) {
        this.f20326a = m0Var;
    }

    public final void a(ud.d dVar) {
        m0 m0Var = this.f20326a;
        HashSet hashSet = dVar.f27190a;
        ArrayList arrayList = new ArrayList(m.d(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ud.c cVar = (ud.c) ((e) it.next());
            String str = cVar.f27186b;
            String str2 = cVar.f27188d;
            String str3 = cVar.e;
            String str4 = cVar.f27187c;
            long j10 = cVar.f27189f;
            h hVar = pc.m.f22675a;
            if (str3.length() > 256) {
                str3 = str3.substring(0, 256);
            }
            arrayList.add(new pc.b(str, str2, str3, str4, j10));
        }
        synchronized (((ad) m0Var.f18667z)) {
            try {
                if (((ad) m0Var.f18667z).b(arrayList)) {
                    ((o) m0Var.f18663v).t(new nd.e(m0Var, 2, ((ad) m0Var.f18667z).a()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
