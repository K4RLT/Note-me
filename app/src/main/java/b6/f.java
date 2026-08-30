package b6;
import q.a;
import q.d;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.z11;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import oc.x;
import org.json.JSONObject;
import wa.y8;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1730u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1731v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1732w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1733x;

    public /* synthetic */ f(int i, Object obj, Object obj2, Object obj3) {
        this.f1730u = i;
        this.f1731v = obj;
        this.f1732w = obj2;
        this.f1733x = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        JSONObject optJSONObject;
        switch (this.f1730u) {
            case 0:
                h hVar = (h) this.f1731v;
                ac.b bVar = (ac.b) this.f1732w;
                v vVar = (v) this.f1733x;
                try {
                    z3 = ((Boolean) bVar.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z3 = true;
                }
                synchronized (hVar.f1746k) {
                    try {
                        j6.j a10 = y8.a(vVar.f1790x);
                        String str = a10.f18928a;
                        if (hVar.c(str) == vVar) {
                            hVar.b(str);
                        }
                        a6.d().a(h.f1737l, h.class.getSimpleName() + " " + str + " executed; reschedule = " + z3);
                        ArrayList arrayList = hVar.f1745j;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((c) obj).e(a10, z3);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                c4.n nVar = (c4.n) this.f1731v;
                wa.r rVar = (wa.r) this.f1732w;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1733x;
                try {
                    c4.v a11 = wa.a(nVar.f3851u);
                    if (a11 != null) {
                        c4.u uVar = (c4.u) ((c4.j) a11.f3834b);
                        synchronized (uVar.f3867x) {
                            uVar.f3869z = threadPoolExecutor;
                        }
                        ((c4.j) a11.f3834b).a(new c4.m(rVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    rVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f1731v;
                Intent intent = (Intent) this.f1732w;
                ib.h hVar2 = (ib.h) this.f1733x;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    hVar2.b(null);
                }
            case 3:
                xe xeVar = (xe) this.f1731v;
                Executor executor = (Executor) this.f1732w;
                ib.h hVar3 = (ib.h) this.f1733x;
                try {
                    ((ib.o) xeVar.call()).g(executor, new x(hVar3, 2));
                    return;
                } catch (Exception e) {
                    hVar3.a(e);
                    return;
                }
            default:
                qd.f fVar = (qd.f) this.f1731v;
                String str2 = (String) this.f1732w;
                rd.c cVar = (rd.c) this.f1733x;
                z11 z11Var = fVar.f23989a;
                fc.b bVar2 = (fc.b) ((gd.b) z11Var.f13046v).get();
                if (bVar2 != null) {
                    JSONObject jSONObject = cVar.e;
                    if (jSONObject.length() >= 1) {
                        JSONObject jSONObject2 = cVar.f24691b;
                        if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                            String optString = optJSONObject.optString("choiceId");
                            if (!optString.isEmpty()) {
                                synchronized (((Map) z11Var.f13047w)) {
                                    try {
                                        if (!optString.equals(((Map) z11Var.f13047w).get(str2))) {
                                            ((Map) z11Var.f13047w).put(str2, optString);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arm_key", str2);
                                            bundle.putString("arm_value", jSONObject2.optString(str2));
                                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                            bundle.putString("group", optJSONObject.optString("group"));
                                            fc.c cVar2 = (fc.c) bVar2;
                                            cVar2.a("fp", bundle, "personalization_assignment");
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("_fpid", optString);
                                            cVar2.a("fp", bundle2, "_fpc");
                                        }
                                    } finally {
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
