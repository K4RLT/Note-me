package k9;
import j.j;
import r.e;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.sl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f19641v;

    public /* synthetic */ c(g gVar, int i) {
        this.f19640u = i;
        this.f19641v = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        String str;
        switch (this.f19640u) {
            case 0:
                g gVar = this.f19641v;
                gVar.d(gVar.f19686a);
                return;
            case 1:
                g gVar2 = this.f19641v;
                f9.k kVar = f9.k.C;
                j jVar = kVar.f16823o;
                Context context = gVar2.f19686a;
                String str2 = gVar2.f19689d;
                String str3 = gVar2.e;
                jVar.getClass();
                nl nlVar = sl.T5;
                g9.r rVar = g9.e;
                String j10 = j(context, jVar.k(context, (String) rVar.f17698c.a(nlVar), str2, str3).toString(), str3);
                if (TextUtils.isEmpty(j10)) {
                    int i = a0.f19634b;
                    l9.i.a("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(j10.trim());
                        String optString = jSONObject.optString("gct");
                        jVar.f19707f = jSONObject.optString("status");
                        if (((Boolean) rVar.f17698c.a(sl.f11048za)).booleanValue()) {
                            String str4 = jVar.f19707f;
                            if ("0".equals(str4) || "2".equals(str4)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            jVar.f(z3);
                            c0 g8 = kVar.f16817h.g();
                            if (!z3) {
                                str = "";
                            } else {
                                str = str2;
                            }
                            g8.f(str);
                        }
                        synchronized (jVar.f19703a) {
                            jVar.f19705c = optString;
                        }
                        String str5 = jVar.f19707f;
                        if ("2".equals(str5)) {
                            int i10 = a0.f19634b;
                            l9.i.a("Creative is not pushed for this device.");
                            jVar.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str5)) {
                            int i11 = a0.f19634b;
                            l9.i.a("The app is not linked for creative preview.");
                            jVar.c(context, str2, str3);
                            return;
                        } else {
                            if ("0".equals(str5)) {
                                int i12 = a0.f19634b;
                                l9.i.a("Device is linked for in app preview.");
                                jVar.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e) {
                        int i13 = a0.f19634b;
                        l9.i.g("Fail to get in app preview response json.", e);
                    }
                }
                jVar.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                g gVar3 = this.f19641v;
                j jVar2 = f9.k.C.f16823o;
                String str6 = gVar3.f19689d;
                String str7 = gVar3.e;
                String str8 = gVar3.f19690f;
                boolean h3 = jVar2.h();
                Context context2 = gVar3.f19686a;
                boolean b10 = jVar2.b(context2, str6, str7);
                synchronized (jVar2.f19703a) {
                    jVar2.f19706d = b10;
                }
                if (jVar2.h()) {
                    if (!h3 && !TextUtils.isEmpty(str8)) {
                        jVar2.e(context2, str7, str8, str6);
                    }
                    int i14 = a0.f19634b;
                    l9.i.a("Device is linked for debug signals.");
                    jVar2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                    return;
                }
                jVar2.c(context2, str6, str7);
                return;
            case 3:
                g gVar4 = this.f19641v;
                gVar4.d(gVar4.f19686a);
                return;
            case 4:
                f9.k.C.f16823o.a(this.f19641v.f19686a);
                return;
            case 5:
                f9.k.C.f16823o.a(this.f19641v.f19686a);
                return;
            default:
                g gVar5 = this.f19641v;
                gVar5.f19691g = 4;
                gVar5.b();
                return;
        }
    }
}
