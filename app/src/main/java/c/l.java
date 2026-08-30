package c;
import f.b;
import f.d;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3250u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3251v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3252w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3253x;

    public /* synthetic */ l(int i, int i10, Object obj, Object obj2) {
        this.f3250u = i10;
        this.f3251v = obj;
        this.f3252w = i;
        this.f3253x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        switch (this.f3250u) {
            case 0:
                m mVar = (m) this.f3251v;
                Serializable serializable = (Serializable) ((z5.h) this.f3253x).f31922v;
                String str = (String) mVar.f3254a.get(Integer.valueOf(this.f3252w));
                if (str != null) {
                    d dVar = (d) mVar.e.get(str);
                    if (dVar != null) {
                        bVar = dVar.f16610a;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        mVar.f3259g.remove(str);
                        mVar.f3258f.put(str, serializable);
                        return;
                    } else {
                        b bVar2 = dVar.f16610a;
                        if (mVar.f3257d.remove(str)) {
                            bVar2.a(serializable);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                ((m) this.f3251v).a(this.f3252w, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f3253x));
                return;
            default:
                ((f5.c) ((f5.a) this.f3251v).f16725c).c(this.f3252w, this.f3253x);
                return;
        }
    }
}
